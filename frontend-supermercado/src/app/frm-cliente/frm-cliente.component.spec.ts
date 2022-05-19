import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FrmClienteComponent } from './frm-cliente.component';

describe('FrmClienteComponent', () => {
  let component: FrmClienteComponent;
  let fixture: ComponentFixture<FrmClienteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FrmClienteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FrmClienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
