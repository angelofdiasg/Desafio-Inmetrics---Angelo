package br.com.inmetrics.teste.support;

import org.junit.After;
import org.junit.Before;

import br.com.inmetrics.core.DriverFactory;
import br.com.inmetrics.core.Propriedades;


public class Hooks {

    @Before
    public void inicializaNavegador() {
    	DriverFactory.getDriver();
    }


    @After
    public void finaliza(){

        if(Propriedades.FECHAR_BROWSER) {
            DriverFactory.killDriver();
        }
    }
	
}
