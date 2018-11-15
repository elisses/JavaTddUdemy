package service;

import Entidade.Filme;
import Entidade.Locacao;
import Entidade.Usuario;
import org.junit.Assert;
import org.junit.Test;
import service.LocacaoService;
import utils.DataUtils;

import java.util.Date;

public class LocacaoServiceTest {
    @Test
    public void teste() {

        //cenario

        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("user1");
        Filme filme = new Filme("filme1", 2, 5.0);


        //acao
        Locacao locacao = service.alugarFilme(usuario, filme);

        //verificacao

        Assert.assertTrue(locacao.getValor() == 5);
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));

    }
}
