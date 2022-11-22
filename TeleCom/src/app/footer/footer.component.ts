import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {

  contact1 = "./assets/images/contact/fb.jpeg";
  contact2 = "./assets/images/contact/gp.jpeg";
  contact3 = "./assets/images/contact/t.jpeg";
  contact4 = "./assets/images/contact/yt.jpeg";

  constructor() { }

  ngOnInit(): void {
  }

}
