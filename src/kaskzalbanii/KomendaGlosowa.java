/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaskzalbanii;

/**
 *
 * @author Leszek
 */
public class KomendaGlosowa 
{
    String komenda;
    String opis;
    int indeks;
    private static int licznik = 1;
    public KomendaGlosowa(String komenda)
    {
        this.komenda = komenda;
        this.indeks = licznik;
        licznik++;
    }
    
    public void dodajOpis(String opis)
    {
        this.opis = opis;
    }
}
