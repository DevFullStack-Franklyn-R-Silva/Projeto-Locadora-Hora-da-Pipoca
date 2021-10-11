/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Locadora.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hades
 */
public class Filme {
    private Integer codFilme;
    private String titulo;
    private String genero;
    private String sinopse;
    private Integer duracao;
    private List<Item> itens = new ArrayList<>();
    private List<Ator> atores = new ArrayList<>();
    
    
}
