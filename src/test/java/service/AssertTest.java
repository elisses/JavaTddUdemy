package service;

import Entidade.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

    @Test
    public void test(){
        Assert.assertTrue(true);
        Assert.assertFalse(false);

        Assert.assertEquals("Erro de comparacao",1, 2);
        Assert.assertEquals(1, 1);

        //float double
        Assert.assertEquals(0.51, 0.51, 0.01);
        Assert.assertEquals(Math.PI, 3.14, 0.01);

        //Objeto e tipo primitivo

        int valor = 4;
        Integer valor2 = 4;
        Assert.assertEquals(Integer.valueOf(valor), valor2);
        Assert.assertEquals(valor, valor2.intValue());

        //strings
        Assert.assertEquals("bola", "bola");
        Assert.assertNotEquals("bola", "bala");
        Assert.assertTrue("bola".equalsIgnoreCase("Bola") );
        Assert.assertTrue("bola".startsWith("bo"));//radical


        //entre objetos
        //Para a comparação ser igual teve que incluir o equals na classe usuario
        //sem isso ele compara o endereço de memoria do objeto e não os valores dos atributos

        Usuario u1 =  new Usuario("teste");
        Usuario u2 =  new Usuario("teste");
        Usuario u3 =  u2;
        Usuario u4 =  null;
        Usuario u5 =  new Usuario("teste");


        Assert.assertEquals(u1, u2);

        //objetos da mesma instância
        Assert.assertSame(u2, u3);
        Assert.assertNotSame(u2, u1);
        //verificando se são nulos
        //verificar os objetos que não estão vazios
        Assert.assertNull(u4);
        Assert.assertNotNull(u5);


    }

}
