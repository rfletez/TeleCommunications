import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

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

import { RestService } from './rest.service';
import { ViewPlanService } from './view-plan/view-plan.service';
import { ProfileService } from './profile/profile.service';
import { LoginService } from './login/login.service';
import { RegisterService } from './register/register.service';
import { HomeService } from './home/home.service';
import { AddFriendService } from './add-friend/add-friend.service';
import { InformationService } from './information.service';
import { CallDetailsService } from './call-details/call-details.service';
import { AuthGuardService } from './auth-guard.service';

import { InputTextModule } from 'primeng/inputtext';
import { Button, ButtonModule } from 'primeng/button';
import { CheckboxModule } from 'primeng/checkbox';
import { RadioButtonModule } from 'primeng/radiobutton';
import { DropdownModule } from 'primeng/dropdown';
import { CarouselModule } from 'primeng/carousel';

import { BlockUIModule } from 'primeng/blockui';
import { BlockUI } from 'primeng/blockui';

import { Panel, PanelModule } from 'primeng/panel';
import { ProgressSpinnerModule } from 'primeng/progressspinner';
import { TableModule } from 'primeng/table';
import { TabViewModule } from 'primeng/tabview';


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
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    ReactiveFormsModule,
    AppRoutingModule,
    InputTextModule,
    FormsModule,
    ButtonModule,
    CheckboxModule,
    RadioButtonModule,
    DropdownModule,
    CarouselModule,
    BlockUIModule,
    PanelModule,
    ProgressSpinnerModule,
    TableModule,
    TabViewModule
  ],
  providers: [
    RestService,
    LoginService,
    RegisterService,
    HomeService,
    ProfileService,
    ViewPlanService,
    AddFriendService,
    InformationService,
    CallDetailsService,
    AuthGuardService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
