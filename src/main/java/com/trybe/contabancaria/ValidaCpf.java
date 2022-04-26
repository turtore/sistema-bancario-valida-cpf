package com.trybe.contabancaria;

/**
 * Classe ValidaCpf.
 **/

public class ValidaCpf {

  /**
   * Atributos.
   **/
  String cpf;

  /**
   * Métodos.
   **/
  public static boolean validarCpf(String cpf) {
    Integer primeiraSoma = 0;
    int primeiroMultiplicador = 10;
    int antesDoDigito = 9;

    for (char number: cpf.toCharArray()) {
      if (antesDoDigito > 0) {
        primeiraSoma += Integer.parseInt(String.valueOf(number))  * primeiroMultiplicador;
        primeiroMultiplicador--;
      }
      antesDoDigito--;
    }

    int primeiroVerificador = 11 - (primeiraSoma % 11);
    int primeiroDV;

    if (primeiroVerificador == 10 || primeiroVerificador == 11) {
      primeiroDV = 0;
    } else {
      primeiroDV = primeiroVerificador;
    }

    Integer segundaSoma = 0;
    int segundoMultiplicador = 11;

    antesDoDigito = 10;
    for (char number: cpf.toCharArray()) {
      if (antesDoDigito > 0) {
        segundaSoma += Integer.parseInt(String.valueOf(number))  * segundoMultiplicador;
        segundoMultiplicador--;
      }
      antesDoDigito--;
    }

    int segundoVerificador = 11 - (segundaSoma % 11);
    int segundoDV;

    if (segundoVerificador == 10 || segundoVerificador == 11) {
      segundoDV = 0;
    } else {
      segundoDV = segundoVerificador;
    }

    String digito = cpf.substring(Math.max(cpf.length() - 2, 0));
    int digitoVerificador = (primeiroDV * 10) + segundoDV;

    boolean finalCheck = Integer.parseInt(String.valueOf(digito)) == digitoVerificador;

    return finalCheck;
  }
}
