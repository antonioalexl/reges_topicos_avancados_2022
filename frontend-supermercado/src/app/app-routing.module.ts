import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LstClientesComponent } from './lst-clientes/lst-clientes.component';
import { FrmClienteComponent } from './frm-cliente/frm-cliente.component';
import { HomeComponent } from './home/home.component';



const routes: Routes = [
  {path:"", component: HomeComponent },
  {path:"clientes", component: LstClientesComponent },
  {path:"cliente/:id", component: FrmClienteComponent },
  {path:"cliente", component: FrmClienteComponent },




];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})


export class AppRoutingModule { }
