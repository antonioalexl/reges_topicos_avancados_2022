import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cliente } from '../models/cliente';
import { ClienteService } from '../services/cliente.service';

@Component({
  selector: 'tests-frm-cliente',
  templateUrl: './frm-cliente.component.html',
  styleUrls: ['./frm-cliente.component.css'],
})
export class FrmClienteComponent implements OnInit {
  constructor(private route: Router, private clienteService: ClienteService) {}

  //CRIAR OBJETO DO TIPO CLIENTE
  model: Cliente = new Cliente();

  voltarParaLista() {
    this.route.navigate(['/clientes']);
  }

  submit(): void {
    this.clienteService.Adicionar(this.model).subscribe((data) => {
      if (data > 0) {
        alert("Cliente cadastrado com sucesso!!!!!")
        console.log('cliente cadastrado com sucesso!!');
      }
    });
  }

  ngOnInit(): void {}
}
