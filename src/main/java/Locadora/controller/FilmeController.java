/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Locadora.controller;

import Locadora.model.Filme;

/**
 *
 * @author hades
 */
public class FilmeController {

    public boolean cadastrarFilme(String titulo, String genero, String sinopse, Integer duracao) {

        if (titulo != null && titulo.length() > 0 && genero != null && genero.length() > 0 && sinopse != null && sinopse.length() > 0 && duracao > 0) {
           Filme filme = new Filme(titulo, genero,  sinopse,  duracao);
           filme.cadastrarFilme(filme);
           return true;
        }
        return false;
    }

}
