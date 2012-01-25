package br.com.caelum.agiletickets;

import java.util.List;

import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.agiletickets.models.Espetaculo;
import br.com.caelum.agiletickets.models.Periodicidade;
import br.com.caelum.agiletickets.models.Sessao;

public class EspetaculoTest {
	
	@Test
	public void criaSessoesIntervaloUmDiaPeriodicidadeDiaria() throws Exception {
		LocalDate inicio = new LocalDate(2012,1,1);
		LocalDate fim = new LocalDate(2012,1,1);
		Periodicidade periodo = Periodicidade.DIARIA;
		
		Espetaculo espetaculo = new Espetaculo();
		List<Sessao> sessoes = espetaculo.criaSessoes(inicio, fim, null, periodo);
		
		Assert.assertEquals(1, sessoes.size());
	}
	
	@Test
	public void criaSessoesIntervaloTresDiasPeriodicidadeDiaria() throws Exception {
		LocalDate inicio = new LocalDate(2012,1,1);
		LocalDate fim = new LocalDate(2012,1,3);
		Periodicidade periodo = Periodicidade.DIARIA;
		
		Espetaculo espetaculo = new Espetaculo();
		List<Sessao> sessoes = espetaculo.criaSessoes(inicio, fim, null, periodo);
		
		Assert.assertEquals(3, sessoes.size());
	}
	
	

}
