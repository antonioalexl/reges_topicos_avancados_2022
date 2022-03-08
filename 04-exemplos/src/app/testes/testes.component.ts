import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-testes',
  templateUrl: './testes.component.html',
  styleUrls: ['./testes.component.css']
})
export class TestesComponent {
  
  nomeUsuario = "";




  minhaCor = 'green';

  nomeFaculdade: string = "Faculdades Reges";

  appName = "Exemplo interpolação";
  
  minhaClasseCSS = "azul";
  usarCSS = false;



  constructor() { }


  exibirDados() {
    console.log("O botão foi clicado!");
  }

}



