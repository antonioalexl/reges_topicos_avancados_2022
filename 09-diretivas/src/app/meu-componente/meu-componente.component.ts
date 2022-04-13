import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-meu-componente',
  templateUrl: './meu-componente.component.html',
  styleUrls: ['./meu-componente.component.css']
})
export class MeuComponenteComponent implements OnInit {

  constructor() { }
  exibir: boolean = false;
  exibirTabela: boolean = false;
  textoBotao: String = "Exibir";


  herois = [
		{
		  id: 1,
		  nome: 'Batman',
		  universo: 'DC',
		},
		{
      id: 2,
		  nome: 'Superman',
		  universo: 'DC',
		},	
		{
      id: 3,
		  nome: 'Mulher Maravilha',
		  universo: 'DC',
		},
		{
      id: 4,
		  nome: 'Homem de Ferro',
		  universo: 'Marvel',
		},
		{
		  id: 5,
		  nome: 'Capitão América',
		  universo: 'Marvel',
		},
    {
		  id: 6,
		  nome: 'Homem Formiga',
		  universo: 'Marvel',
		},
	  ]


  exibirValor(){
    this.exibir = true;   
  }


  mostrarTabela(){
    if(this.exibirTabela == true)
    {
      this.exibirTabela = false;
      this.textoBotao = "Exibir";
    }
    else
    {

      this.exibirTabela = true;
      this.textoBotao = "Esconder";
   
    }
 

  }

  ngOnInit(): void {
  }

}
