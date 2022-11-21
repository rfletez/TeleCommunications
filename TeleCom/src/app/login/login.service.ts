import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';

import { Login } from './login';
import { RestService } from '../rest.service';
import { InformationService } from '../information.service';


@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(
    private informationService: InformationService, 
    private restService: RestService
  ) { }

  login(data: Login): Observable<any> {
    return this.restService.post(this.informationService.loginUrl, data);
  }
}
