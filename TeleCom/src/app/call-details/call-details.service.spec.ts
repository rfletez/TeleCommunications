import { TestBed } from '@angular/core/testing';

import { CallDetailsService } from './call-details.service';

describe('CallDetailsService', () => {
  let service: CallDetailsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CallDetailsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
