// interface Pessoa {
//     nome: String,
//     idade: Number
// }

// const pessoa: Pessoa = {
//     nome: "Pessoa",
//     idade: 29
// }

// console.log(pessoa.nome)

class Pessoa {
    nome: String;
    idade: Number;

    constructor(nome: String, idade: Number) {
        this.nome = nome;
        this.idade = idade;
    }

    getNome(): String {
        return this.nome;
    }
    getIdade(): Number {
        return this.idade;
    }
    setNome(nome: String) {
        this.nome = nome;
    }
    setIdade(idade: Number) {
        this.idade = idade;
    }
}