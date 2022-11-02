import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { InformationService } from './information.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate {

  constructor(
    public informationService: InformationService,
    public router: Router
  ) { }

  canActivate() {
    if(this.informationService.phoneNo) {
      return true;
    }
    else {
      this.router.navigate(["/login"]);
      return false;
    }
  }
}
