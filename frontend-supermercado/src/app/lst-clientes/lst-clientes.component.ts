import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cliente } from '../models/cliente';
import { ClientesService } from '../services/clientes.service';
import { ClienteService } from '../services/cliente.service';

@Component({
  selector: 'app-lst-clientes',
  templateUrl: './lst-clientes.component.html',
  styleUrls: ['./lst-clientes.component.css'],
})
export class LstClientesComponent implements OnInit {
  constructor(private route: Router, private clienteService: ClienteService) {}

  clientes!: Cliente[];

  ngOnInit(): void {
    this.obterTodos();
  }

  //Dessa forma está depreciado!!!
  /*obterTodos(){
    this.clienteService.ObterTodos().subscribe(

        dados =>{
          this.clientes = dados;
        },
        e => {console.log(e.error)
        }
    );
  }*/

  obterTodos() {
    this.clienteService.ObterTodos().subscribe({
      error: (e) => {
        console.log(e);
      },
      next: (dados) => {
        this.clientes = dados;
      },
    });
  }

  cadastrarCliente() {
    this.route.navigate(['/cliente']);
  }

  removerCliente(id: number) {
    let isExecuted = confirm('Deseja realmente remover este cliente?');

    if (isExecuted) {
      this.clienteService.Deletar(id).subscribe({
        next: (d) => {
          this.obterTodos();
        },
        error: (e) => {
          console.log(e);
        },
      });
    }
  }
}
