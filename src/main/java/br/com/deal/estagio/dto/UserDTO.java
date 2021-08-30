package br.com.deal.estagio.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //Lombok
@Setter
@NoArgsConstructor
public class UserDTO {
	private Long id;
	private String nome;
}
