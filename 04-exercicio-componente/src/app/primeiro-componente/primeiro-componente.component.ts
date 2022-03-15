import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-primeiro-componente',
  templateUrl: './primeiro-componente.component.html',
  styleUrls: ['./primeiro-componente.component.css']
})
export class PrimeiroComponenteComponent implements OnInit {

  nome = "";
  nomeAtribuido = "";
  usarCSS = false;

  constructor() { }

 

  ngOnInit(): void {
  }

  atribuirValor(){

    this.nome = this.nomeAtribuido;

  }

  alterarCor(){

    if(this.usarCSS == true)
    {
      this.usarCSS = false;
  }
     else{this.usarCSS = true;}

  }

}
