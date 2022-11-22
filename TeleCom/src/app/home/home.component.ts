import { Component, OnInit } from '@angular/core';
import { Task } from './task';
import { TasksService } from './tasks.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  responsiveOptions;
  tasks: Task[] = [];

  constructor(private taskService: TasksService) {
    this.responsiveOptions = [
      {
        breakpoint: "1024px",
        numVisible: 3,
        numScroll: 3,
      }, 
      {
        breakpoint: "768px",
        numVisible: 2,
        numScroll: 2
      }, 
      {
        breakpoint: "560px",
        numVisible: 1,
        numScroll: 1
      }
    ];
  }

  ngOnInit(): void {
    this.taskService.getTasks().then((tasks) => {
      this.tasks = tasks;
    })
  }

}
