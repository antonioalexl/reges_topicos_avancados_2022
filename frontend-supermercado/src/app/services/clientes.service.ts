import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { environment } from 'src/environments/environment';
import { Cliente } from '../models/cliente';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class ClientesService {



   api :string = environment.api;

   constructor(private http: HttpClient) { }

  public ObterTodos(): Observable<Cliente[]>{
    return this.http.get<Cliente[]> (this.api + 'clientes');
  }

  public ObterPorId(id:number): Observable<Cliente>{
    return this.http.get<Cliente> (this.api + 'clientes/' + id);
  }


    public Adicionar(cliente: Cliente): Observable<number> {
     return this.http.post<number>(this.api + "clientes",   cliente);
  }

  public Editar(id:number, cliente: Cliente): Observable<Cliente> {
    return this.http.put<Cliente>(this.api  + 'clientes/' + id, cliente);
 }

  public Deletar(id: Number) {
    return this.http.delete(this.api  + 'clientes/' + id);
  }

}


