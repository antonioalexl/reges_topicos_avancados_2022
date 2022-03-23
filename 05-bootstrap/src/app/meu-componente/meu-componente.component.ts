import { Component, OnInit } from '@angular/core';
import { Cliente } from '../models/cliente';

@Component({
  selector: 'app-meu-componente',
  templateUrl: './meu-componente.component.html',
  styleUrls: ['./meu-componente.component.css']
})
export class MeuComponenteComponent implements OnInit {

  constructor() { }

  //CRIAR OBJETO DO TIPO CLIENTE
  model: Cliente  = new Cliente();
  
  ngOnInit(): void {
  }

//FUNCAO SUBMIT
  onAbacaxi(){

    console.log(this.model);

  }

}
