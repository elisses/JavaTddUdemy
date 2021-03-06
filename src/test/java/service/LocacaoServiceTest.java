package service;

import Entidade.Filme;
import Entidade.Locacao;
import Entidade.Usuario;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import service.LocacaoService;
import utils.DataUtils;

import java.util.Date;

import static org.hamcrest.CoreMatchers.is;

public class LocacaoServiceTest {

    //faz identificar mais de um teste ao mesmo tempo.
    @Rule
    public ErrorCollector  error = new ErrorCollector();

    @Test
    public void teste() {

        //cenario

        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("user1");
        Filme filme = new Filme("filme1", 2, 5.0);


        //acao
        Locacao locacao = service.alugarFilme(usuario, filme);

        //verificacao

        error.checkThat(locacao.getValor(), is(CoreMatchers.equalTo(5.0)));
        error.checkThat(locacao.getValor(), is(CoreMatchers.not(6.0)));
        error.checkThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), is(true));
        error.checkThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), CoreMatchers.is(true));

    }
}
