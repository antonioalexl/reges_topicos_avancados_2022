import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cliente } from '../models/cliente';
import { ClientesService } from '../services/clientes.service';
import { ClienteService } from '../services/cliente.service';

@Component({
  selector: 'app-lst-clientes',
  templateUrl: './lst-clientes.component.html',
  styleUrls: ['./lst-clientes.component.css']
})
export class LstClientesComponent implements OnInit {


  constructor(private route: Router, private clienteService: ClienteService) { }

  //clientes!: Cliente[];

  clientes!: Cliente[];

  ngOnInit(): void {
    this.obterTodos();
  }

  cadastrarCliente(){
    this.route.navigate(['/cliente']);
  }

  obterTodos(){
    this.clienteService.ObterTodos().subscribe(

        banana =>{
          this.clientes = banana;
        },
    );


  }



 /* obterTodos(){

    this.cliService.ObterTodos()
    .subscribe(
      data => {
        this.clientes = data;

      },
      e => {
        console.log(e.error);
      },
      () => {
      });
  }*/







}
