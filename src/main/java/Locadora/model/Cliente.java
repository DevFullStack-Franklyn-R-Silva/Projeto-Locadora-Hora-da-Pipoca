package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {

	private Integer codCliente;
	private String nome;
	private String cpf;
	private String email;
	private String endereco;
	private Date dtNascimento;
	private List<Item> itens = new ArrayList<>();
}
