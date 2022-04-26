package com.trybe.contabancaria;

/**
* Classe Cliente.
**/
public class Cliente {

  /**
   * Atributos.
   **/
  String nome;
  String cpf;

  /**
  * Métodos.
  **/
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  /**
  * setCpf method.
  */
  public void setCpf(String cpf) {
    boolean checkCpf = ValidaCpf.validarCpf(cpf);
    if (checkCpf) {
      this.cpf = cpf;
    } else {
      this.cpf = null;
    }
  }
}
