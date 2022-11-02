import { TestBed } from '@angular/core/testing';

import { ViewPlanService } from './view-plan.service';

describe('ViewPlanService', () => {
  let service: ViewPlanService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ViewPlanService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
