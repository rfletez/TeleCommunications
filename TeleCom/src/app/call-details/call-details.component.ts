import { Component, OnInit } from '@angular/core';

import { CallDetailsService } from './call-details.service';
import { CallDetail } from './callDetail';


@Component({
  selector: 'app-call-details',
  templateUrl: './call-details.component.html',
  styleUrls: ['./call-details.component.css']
})
export class CallDetailsComponent implements OnInit {

  callDetails?: Array<CallDetail>;
  errorMessage?: string;
  filterParam: any;
  cols?: any[];
  first = 0;
  rows = 20;

  constructor(private callDetailsService: CallDetailsService) { }

  getCallDetails(): void {
    this.callDetailsService.getCallDetails().subscribe(
      (data) => {
        this.callDetails = data;
      },
      (error) => (this.errorMessage = error)
    );
  }

  ngOnInit(): void {
    this.getCallDetails();
    this.cols = [
      { field: "calledBy", header: "Call By" },
      { field: "calledTo", header: "Call To" },
      { field: "calledOn", header: "Call On" },
      { field: "duration", header: "Duration(mins)" }
    ];
  }

}
