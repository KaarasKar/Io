/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaskzalbanii;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leszek (Hejmej remix)
 */
public class GPS 
{
    List<String> listaTras = new ArrayList<>();
    Trasa aktualnaTrasa;
    void wlacz()
    {
        System.out.println("GPS aktywny");
    }
    void wylacz()
    {
        System.out.println("GPS wyłączony");
    }
    void wyszukaj_trase(String cel) throws InterruptedException
    {
        System.out.println("Szukam Trasy do "+ cel);
        sleep(2000);
        System.out.println("Trasa znaleziona");
    }
    void wprowadz_cel()
    {
        
    }
    void wybierz_trase()
    {
        
    }
    void zapamietaj_trase(String trasa)
    {
        listaTras.add(trasa);
    }
    void nawiguj(String input)
    {
        System.out.println("Nawiguje do "+input);
    }
    void koniec_nawiguj()
    {
        System.out.println("Koniec nawigowania");
    }
    public GPS()
    {
        zapamietaj_trase(new String("Wałbrzych"));
        zapamietaj_trase("Kraków");
        zapamietaj_trase("Sosnowiec");
        zapamietaj_trase("Nowy Jork");
    }
}
