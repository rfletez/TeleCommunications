import { Component, OnInit } from '@angular/core';
import { AddFriendService } from './add-friend.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-friend',
  templateUrl: './add-friend.component.html',
  styleUrls: ['./add-friend.component.css']
})
export class AddFriendComponent implements OnInit {

  submit: boolean = false;
  addFriendForm?: FormGroup;
  errorMessage: string = '';
  successMessage: string = '';

  constructor(
    private formBuilder: FormBuilder, 
    private addFriendService: AddFriendService
  ) { }

  addFriend(): void {
    this.submit = true;
    this.addFriendService.addFriend(this.addFriendForm?.value).subscribe(
      (data) => {
        this.successMessage = "Added Successfully";
        this.errorMessage = '';
        this.addFriendForm?.reset();
        setTimeout(() => this.successMessage = '', 3000);
      },
      (error) => {
        this.errorMessage = error;
        this.submit = false;
        this.addFriendForm?.reset();
        setTimeout(() => this.errorMessage = '', 3000);
      }
    );
  }

  ngOnInit(): void {
    this.addFriendForm = this.formBuilder.group({
      friendAndFamily: [
        "",
        [Validators.required, Validators.pattern("[6-9][0-9]{9}")]
      ]
    }); 
  }

}
