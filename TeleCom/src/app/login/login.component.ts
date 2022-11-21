import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

import { LoginService } from './login.service';
import { InformationService } from '../information.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  submit: boolean = false;
  errorMessage: string = '';
  loginForm!: FormGroup;
  blockedDocument: boolean = false;

  constructor(
    private formBuilder: FormBuilder, 
    private router: Router, 
    private loginService: LoginService, 
    private informationService: InformationService
  ) { }

  login(): void {
    this.blockedDocument = true;
    this.submit = true;

    this.loginService.login(this.loginForm?.value).subscribe(
      (data) => {
        this.blockedDocument = false;

        if(data) {
          this.informationService.phoneNo = this.loginForm?.value.phoneNo;
          this.router.navigate(["/home"]);
        }
        else {
          this.errorMessage = "Invalid phone number/password";
          this.submit = false;
        }
      },
      (error) => {
        this.blockedDocument = false;
        console.log("Error Status" + error.status);

        if(error.status == 0) {
          this.errorMessage = "Please check connectivity with backend";
        }
        else {
          this.errorMessage = error;
        }

        this.submit = false;
      }
    );
  }

  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({
      phoneNo: ["", [Validators.required, Validators.pattern("[7-9][0-9]{9}")]],
      password: ["", [Validators.required]]
    })
  }

}
