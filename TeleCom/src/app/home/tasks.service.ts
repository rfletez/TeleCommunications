import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Task } from './task';

@Injectable({
  providedIn: 'root'
})
export class TasksService {

  constructor(private http: HttpClient) { }

  async getTasks() {
    const res = await this.http
      .get<any>("assets/tasks.json")
      .toPromise();
    const data = <Task[]>res.data;
    return data;
  }

  /**return this.http
      .get<any>("assets/tasks.json")
      .toPromise()
      .then((res) => <Task[]>res.data)
      .then((data) => {
        return data;
    })
    Will need to fix this function
    */
}
