package br.ce.wcaquino.taskbackend.utils;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;


public class DateUtilsTest {

    @Test
    public void deveRetornarTrueParaDatasFuturas() {
        LocalDate date = LocalDate.of(2030, 01, 01);
        boolean isDateFuture = DateUtils.isEqualOrFutureDate(date);

        Assert.assertTrue(isDateFuture);
    }

    @Test
    public void deveRetornarFalseParaDatasPassadas() {
        LocalDate date = LocalDate.of(2010, 01, 01);
        boolean isDataPassada = DateUtils.isEqualOrFutureDate(date);

        Assert.assertFalse(isDataPassada);
    }

    @Test
    public void deveRetornarTrueParaDataAtual() {
        boolean isDataPassada = DateUtils.isEqualOrFutureDate(LocalDate.now());

        Assert.assertTrue(isDataPassada);
    }
}
