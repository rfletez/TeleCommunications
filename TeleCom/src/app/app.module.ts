import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { LoginComponent } from './login/login.component';
import { ProfileComponent } from './profile/profile.component';
import { ViewPlanComponent } from './view-plan/view-plan.component';
import { AddFriendComponent } from './add-friend/add-friend.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { CallDetailsComponent } from './call-details/call-details.component';
import { FilterPipe } from './call-details/filter.pipe';
import { RegisterComponent } from './register/register.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LandingPageComponent,
    LoginComponent,
    ProfileComponent,
    ViewPlanComponent,
    AddFriendComponent,
    HeaderComponent,
    FooterComponent,
    CallDetailsComponent,
    FilterPipe,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
