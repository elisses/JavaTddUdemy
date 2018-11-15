package service;

import Entidade.Filme;
import Entidade.Locacao;
import Entidade.Usuario;
import java.util.Date;
import static utils.DataUtils.adicionarDias;

public class LocacaoService {
    //testando os niveis de acesso e variaveis e metodos que o java trabalha
    //Por isso a class LocacaoServiceTest esta no mesmo pacote
    public String vPublica;
    protected String vProtegida;
    private String vPrivada;
    String vDefault;

    public Locacao alugarFilme(Usuario usuario, Filme filme) {
        Locacao locacao = new Locacao();
        locacao.setFilme(filme);
        locacao.setUsuario(usuario);
        locacao.setDataLocacao(new Date());
        locacao.setValor(filme.getPrecoLocacao());

        //Entrega no dia seguinte
        Date dataEntrega = new Date();
        dataEntrega = adicionarDias(dataEntrega, 1);
        locacao.setDataRetorno(dataEntrega);

        //Salvando a locacao...
        //TODO adicionar método para salvar

        return locacao;
    }


}