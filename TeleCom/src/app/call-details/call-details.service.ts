import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { RestService } from '../rest.service';
import { InformationService } from '../information.service';
import { CallDetail } from './callDetail';


@Injectable({
  providedIn: 'root'
})
export class CallDetailsService {

  constructor(
    private informationService: InformationService, 
    private restService: RestService
  ) { }

  getCallDetails(): Observable<any> {
    return this.restService.get(
      this.informationService.callDetailUrl + 
      this.informationService.phoneNo + "/calldetails"
    );
  }
}
