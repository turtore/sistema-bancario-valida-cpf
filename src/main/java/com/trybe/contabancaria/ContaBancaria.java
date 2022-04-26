package com.trybe.contabancaria;

/**
 * Classe ContaBancaria.
 **/

public class ContaBancaria {

  /**
  * Atributos.
  **/
  Cliente cliente = new Cliente();
  int saldo;


  /**
   * Métodos.
   **/
  public Cliente getCliente() {
    return cliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.cliente.setNome(nomeCliente);
  }

  public String getNomeCliente() {
    return this.cliente.getNome();
  }

  public int verSaldo() {
    return saldo;
  }

  public int depositar(int deposito) {
    this.saldo = this.saldo + deposito;
    return this.saldo;
  }

  public int sacar(int saque) {
    this.saldo = this.saldo - saque;
    return this.saldo;
  }

  public void setCpfCliente(String cpfCliente) {
    this.cliente.setCpf(cpfCliente);
  }

  public String getCpfCliente() {
    return this.cliente.getCpf();
  }

}
