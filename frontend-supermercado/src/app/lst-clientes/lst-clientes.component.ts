import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-lst-clientes',
  templateUrl: './lst-clientes.component.html',
  styleUrls: ['./lst-clientes.component.css']
})
export class LstClientesComponent implements OnInit {


  constructor(private route: Router) { }


  cadastrarCliente(){

    this.route.navigate(['/cliente']);


  }


  ngOnInit(): void {
  }

}
