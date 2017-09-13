package treinamentojsf.manegedBean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "constantes")
public class Constantes {
    private final String titulo           = "GerenBibs";
    private final String h1               = "Sistema de Gerenciamento de Bibliotecas - GerenBibs";
    private final String cadastrar        = "Cadastrar";
    private final String pesquisar        = "Pesquisar";
    private final String apagar           = "Apagar";
    private final String editar           = "Editar";
    private final String cadClientes      = "Cadastrar Clientes";
    private final String delClientes      = "Apagar Clientes";
    private final String ediClientes      = "Editar Clientes";
    private final String psqClientes      = "Pesquisar Clientes";
    private final String cadLivros        = "Cadastrar Livros";
    private final String delLivros        = "Apagar Livros";
    private final String ediLivros        = "Editar Livros";
    private final String psqLivros        = "Pesquisar Livros";
    private final String cadEmprest       = "Cadastrar Empr&eacute;stimos";
    private final String delEmprest       = "Apagar Empr&eacute;stimos";
    private final String ediEmprest       = "Editar Empr&eacute;stimos";
    private final String psqEmprest       = "Pesquisar Empr&eacute;stimos";
    private final String devolucao        = "Devolu&ccedil;&atilde;o de Livro";
    private final String msgBoasVindas    = "Bem-vindos ao GerBibs - Sistema de Gerenciamento de Biblioteca!";
    private final String historia         = "Hist&oacute;rico do sistema";
    private final String lblLivroTitulo   = "T&iacute;tulo: ";
    private final String lblLivroGenero   = "G&ecirc;nero: ";
    private final String lblLivroDtPub    = "Data de Publica&ccedil;&atilde;o: ";
    private final String lblLivroResumo   = "Resumo: ";
    private final String lblClienteNome   = "Nome: ";
    private final String lblClienteCpf    = "CPF: ";
    private final String lblClienteEmail  = "E-mail: ";
    private final String txtLivroTitulo   = "T&iacute;tulo do Livro";
    private final String txtLivroGenero   = "GG&ecirc;nero do Livro";
    private final String txtLivroResumo   = "Resumo do Livro";
    private final String txtLivroDtPub    = "Data de Publica&ccedil;&atilde;o do Livro";
    private final String txtClienteNome   = "Nome do Cliente";
    private final String txtClienteCpf    = "CPF do Cliente";
    private final String txtClienteEmail  = "E-mail do Cliente";
    private final String lblEmprestado    = "Emprestado: ";
    private final String lblSim           = "Sim";
    private final String lblNao           = "N&atilde;o";
    private final String lblAmbos         = "Ambos";
    private final String lblDtPubDepois   = "Emprestado depois de: ";
    private final String lblDtPubAntes    = "Antes de: ";
    private final String dtlLivro         = "Detalhe do Livro";
    private final String livrosCliente    = "Livros em Empr&eacute;stimo"; 

    public String getTitulo() {
        return titulo;
    }
    public String getH1() {
        return h1;
    }
    public String getCadastrar() {
        return cadastrar;
    }
    public String getPesquisar() {
        return pesquisar;
    }
    public String getApagar() {
        return apagar;
    }
    public String getEditar() {
        return editar;
    }
    public String getCadClientes() {
        return cadClientes;
    }
    public String getDelClientes() {
        return delClientes;
    }
    public String getEdiClientes() {
        return ediClientes;
    }
    public String getPsqClientes() {
        return psqClientes;
    }
    public String getCadLivros() {
        return cadLivros;
    }
    public String getDelLivros() {
        return delLivros;
    }
    public String getEdiLivros() {
        return ediLivros;
    }
    public String getPsqLivros() {
        return psqLivros;
    }
    public String getCadEmprest() {
        return cadEmprest;
    }
    public String getDelEmprest() {
        return delEmprest;
    }
    public String getEdiEmprest() {
        return ediEmprest;
    }
    public String getPsqEmprest() {
        return psqEmprest;
    }
    public String getDevolucao() {
        return devolucao;
    }
    public String getMsgBoasVindas() {
        return msgBoasVindas;
    }
    public String getHistoria() {
        return historia;
    }
    public String getLblLivroTitulo() {
        return lblLivroTitulo;
    }
    public String getLblLivroGenero() {
        return lblLivroGenero;
    }
    public String getLblLivroDtPub() {
        return lblLivroDtPub;
    }
    public String getLblLivroResumo() {
        return lblLivroResumo;
    }
    public String getLblClienteNome() {
        return lblClienteNome;
    }
    public String getLblClienteCpf() {
        return lblClienteCpf;
    }
    public String getLblClienteEmail() {
        return lblClienteEmail;
    }
    public String getTxtLivroTitulo() {
        return txtLivroTitulo;
    }
    public String getTxtLivroGenero() {
        return txtLivroGenero;
    }
    public String getTxtLivroResumo() {
        return txtLivroResumo;
    }
    public String getTxtLivroDtPub() {
        return txtLivroDtPub;
    }
    public String getTxtClienteNome() {
        return txtClienteNome;
    }
    public String getTxtClienteCpf() {
        return txtClienteCpf;
    }
    public String getTxtClienteEmail() {
        return txtClienteEmail;
    }
    public String getLblEmprestado() {
        return lblEmprestado;
    }
    public String getLblSim() {
        return lblSim;
    }
    public String getLblNao() {
        return lblNao;
    }
    public String getLblAmbos() {
        return lblAmbos;
    }
    public String getLblDtPubDepois(){
        return lblDtPubDepois;
    }
    public String getLblDtPubAntes(){
        return lblDtPubAntes;
    }
    public String getDtlLivro(){
        return dtlLivro;
    }
}
