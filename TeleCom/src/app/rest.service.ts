import { Injectable } from '@angular/core';

import { HttpClient, HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';

import { map, catchError } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class RestService {

  constructor(private http: HttpClient) { }

  get(url: string) {
    return this.http.get(url);
  }

  post(url: any, data: any) {
    const options = { headers: { "Content-Type": "application/json" } };
    return this.http.post(url, data, options);
  }
}
