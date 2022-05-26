import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cliente } from '../models/cliente';
import { ClientesService } from '../services/clientes.service';

@Component({
  selector: 'app-lst-clientes',
  templateUrl: './lst-clientes.component.html',
  styleUrls: ['./lst-clientes.component.css']
})
export class LstClientesComponent implements OnInit {


  constructor(private route: Router,private cliService: ClientesService ) { }

  clientes!: Cliente[];

  ngOnInit(): void {
    this.obterTodos();
  }


  cadastrarCliente(){

    this.route.navigate(['/cliente']);

  }
  obterTodos(){

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

  }







}
