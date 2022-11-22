import { Component, OnInit } from '@angular/core';
import { Task } from './task';
import { TasksService } from './tasks.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  responsiveOptions?: [];
  tasks: Task[] = [];

  constructor(private taskService: TasksService) {
    this.responsiveOptions = [];
  }

  ngOnInit(): void {
    this.taskService.getTasks().then((tasks) => {
      this.tasks = tasks;
    })
  }

}
