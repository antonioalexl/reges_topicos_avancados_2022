import { Endereco } from './endereco';
export class Pessoa {
/*

  private int id;    
    private String nome;      
    private String telefone;
    private String email;
    private String documento;
    private Calendar dataNascimento;    
    private  Endereco endereco; 

*/  

    id!: number;
    telefone!: string;
    email!: string;
    documento!: string;
    dataNascimento:Date | undefined;
    endereco!: Endereco;
}
