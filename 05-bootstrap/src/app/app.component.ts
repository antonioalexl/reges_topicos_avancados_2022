import { Cliente } from './models/cliente';
import { Component } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {

  model: Cliente = new Cliente();

  title = '05-bootstrap';

  onSubmit(){
  console.log(this.model.email);

  }
}
