import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cliente } from '../models/cliente';

@Component({
  selector: 'tests-frm-cliente',
  templateUrl: './frm-cliente.component.html',
  styleUrls: ['./frm-cliente.component.css']
})
export class FrmClienteComponent implements OnInit {

  constructor(private route:Router) { }

    //CRIAR OBJETO DO TIPO CLIENTE
    model: Cliente  = new Cliente();

  voltarParaLista(){

    this.route.navigate(['/clientes']);
  }

  submit(): void{


  }

  ngOnInit(): void {
  }

}
