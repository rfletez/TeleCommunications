import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddFriendComponent } from './add-friend/add-friend.component';
import { AuthGuardService } from './auth-guard.service';
import { CallDetailsComponent } from './call-details/call-details.component';
import { HomeComponent } from './home/home.component';
import { LandingPageComponent } from './landing-page/landing-page.component';

import { LoginComponent } from './login/login.component';
import { ProfileComponent } from './profile/profile.component';
import { RegisterComponent } from './register/register.component';
import { ViewPlanComponent } from './view-plan/view-plan.component';

const routes: Routes = [
  { path: "login", component: LoginComponent },
  { path: "welcome", component: LandingPageComponent },
  { path: "register", component: RegisterComponent },
  { 
    path: "call-details", 
    component: CallDetailsComponent, 
    canActivate: [AuthGuardService] 
  },
  { 
    path: "home", 
    component: HomeComponent, 
    canActivate: [AuthGuardService] 
  },
  { 
    path: "view-plan", 
    component: ViewPlanComponent, 
    canActivate: [AuthGuardService] 
  },
  { 
    path: "add-friend", 
    component: AddFriendComponent, 
    canActivate: [AuthGuardService] 
  },
  { 
    path: "profile", 
    component: ProfileComponent, 
    canActivate: [AuthGuardService] 
  },
  { path: "**", redirectTo: "/welcome", pathMatch: "full" }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
