import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'tests-frm-cliente',
  templateUrl: './frm-cliente.component.html',
  styleUrls: ['./frm-cliente.component.css']
})
export class FrmClienteComponent implements OnInit {

  constructor(private route:Router) { }

  voltarParaLista(){

    this.route.navigate(['/clientes']);

  }

  ngOnInit(): void {
  }

}
