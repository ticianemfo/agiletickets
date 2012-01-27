package br.com.caelum.agiletickets;

import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
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
		LocalTime hora = new LocalTime(18,40,0);
		Periodicidade periodo = Periodicidade.DIARIA;
		
		Espetaculo espetaculo = new Espetaculo();
		List<Sessao> sessoes = espetaculo.criaSessoes(inicio, fim, hora, periodo);
		
		Assert.assertEquals(1, sessoes.size());
		Assert.assertEquals(inicio.toDateTime(hora), sessoes.get(0).getInicio());
	}
	
	@Test
	public void criaSessoesIntervaloTresDiasPeriodicidadeDiaria() throws Exception {
		LocalDate inicio = new LocalDate(2012,1,1);
		LocalDate fim = new LocalDate(2012,1,3);
		LocalTime hora = new LocalTime(18,40,0);
		Periodicidade periodo = Periodicidade.DIARIA;
		
		Espetaculo espetaculo = new Espetaculo();
		List<Sessao> sessoes = espetaculo.criaSessoes(inicio, fim, hora, periodo);
		
		Assert.assertEquals(3, sessoes.size());
		Assert.assertEquals(inicio.toDateTime(hora), sessoes.get(0).getInicio());
		Assert.assertEquals(inicio.plusDays(1).toDateTime(hora), sessoes.get(1).getInicio());
		Assert.assertEquals(inicio.plusDays(2).toDateTime(hora), sessoes.get(2).getInicio());
		
	}
	
	@Test
	public void criaSessoesIntervaloUmDiaPeriodicidadeSemanal() throws Exception {
		
		LocalDate inicio = new LocalDate(2012,1,1);
		LocalDate fim = new LocalDate(2012,1,1);
		LocalTime hora = new LocalTime(18,40,0);
		Periodicidade periodo = Periodicidade.SEMANAL;
		
		Espetaculo espetaculo = new Espetaculo();
		List<Sessao> sessoes = espetaculo.criaSessoes(inicio, fim, hora, periodo);
		
		Assert.assertEquals(1, sessoes.size());
		Assert.assertEquals(inicio.toDateTime(hora), sessoes.get(0).getInicio());
	
	}
	
	@Test
	public void criaSessoesIntervaloSeteDiasPeriodicidadeSemanal() throws Exception {
		
		LocalDate inicio = new LocalDate(2012,1,1);
		LocalDate fim = new LocalDate(2012,1,8);
		LocalTime hora = new LocalTime(18,40,0);
		Periodicidade periodo = Periodicidade.SEMANAL;
		
		Espetaculo espetaculo = new Espetaculo();
		List<Sessao> sessoes = espetaculo.criaSessoes(inicio, fim, hora, periodo);
		
		//Assert.assertEquals(1, sessoes.size());
		//Assert.assertEquals(inicio.toDateTime(hora), sessoes.get(0).getInicio());
	
	}
	

}
