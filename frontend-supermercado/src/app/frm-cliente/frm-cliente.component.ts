import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Cliente } from '../models/cliente';
import { ClienteService } from '../services/cliente.service';

@Component({
  selector: 'tests-frm-cliente',
  templateUrl: './frm-cliente.component.html',
  styleUrls: ['./frm-cliente.component.css'],
})
export class FrmClienteComponent implements OnInit {
  constructor(
    private router: Router,
    private clienteService: ClienteService,
    private route: ActivatedRoute
  ) {}

  //CRIAR OBJETO DO TIPO CLIENTE
  model: Cliente = new Cliente();

  //Cria o ID para controlar o post ou o put;
  id!: number;

  voltarParaLista() {
    this.router.navigate(['/clientes']);
  }

  obterPorId(id:number){

    this.clienteService.ObterPorId(id).subscribe({
      error: (e) => { console.log(e) },
      next: (dados) => { this.model = dados },
      });
  }

  submit(): void {


    if (this.id > 0) {

      this.clienteService.Editar(this.id,this.model).subscribe({
        error: (e) => { console.log(e) },
        next: (dados) => {
          alert('Cliente alterado com sucesso!!!!!');
          this.voltarParaLista();
         },
        });

    } else {
      this.clienteService.Adicionar(this.model).subscribe({
        error: (e) => { console.log(e) },
        next: (dados) => {
          alert('Cliente cadastrado com sucesso!!!!!');
          this.voltarParaLista();
         },
        });
    }
  }

  ngOnInit(): void {

    //SE VIER O ID NA ROTA, ENTÃO GUARDA E CONFIGURA PARA DAR UPDATE/PUT
    this.id =  this.route.snapshot.params['id'];

    if (this.id){
      this.obterPorId(this.id);
    }
  }
}
