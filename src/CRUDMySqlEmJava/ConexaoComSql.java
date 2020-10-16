package CRUDMySqlEmJava;
/*Importar o driver no projeto via IDE
 *Clique em na pasta de projetos > Propriedades > Java Build Path > Libraries > Importar o driver jar
*/

import java.util.Date;

/*
 * Design Patner para SQL
 */

public class ConexaoComSql {

	private String nome;
	private Date dataNascimento;
	private String sexo;
	private String estadoCivil;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
