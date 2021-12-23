package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionariosComSalarioMuitoAlto() {
        BonusService service = new BonusService();
//        assertThrows(IllegalArgumentException.class,
//        		() -> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000"))));
        
        try {
        	service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
        	fail("Não deu a exception");
        } catch(Exception e){
        	assertEquals("Funcionario com salario maior que 10.000,00 não recebe bonus", e.getMessage());
        }
    }
    
    @Test
    void bonusDeveriaSerDezPorcentoDoSalario() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.00"), bonus);
  
    }
    
    @Test
    void bonusDeveriaSerDezPorcentoParaSalarioDeExatamente10000() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);
  
    }

}
