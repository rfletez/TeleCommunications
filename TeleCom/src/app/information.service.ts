import { Injectable } from "@angular/core";

@Injectable()
export class InformationService {
    //baseUrl = "http://localhost:8000";

    phoneNo: number = 0;

    customerBaseUrl = "http://localhost:3200";
    loginUrl = "http://localhost:3200/login";
    registerUrl = "http://localhost:3200/customers/";
    profileUrl = "http://localhost:3200/customers/";
    viewPlanUrl = "http://localhost:3400/plans/";
    callDetailUrl = "http://localhost:3100/customers/";
    addFriendUrl = "http://localhost:3300/customers/";
}