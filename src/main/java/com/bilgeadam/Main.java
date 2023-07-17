package com.bilgeadam;

import com.bilgeadam.controller.FutbolcuController;
import com.bilgeadam.repository.FutbolcuRepository;
import com.bilgeadam.repository.TakimRepository;
import com.bilgeadam.repository.entity.Futbolcu;
import com.bilgeadam.repository.entity.Takim;
import com.bilgeadam.utility.ConnectionProvider;

/*
    futbolAppDb
    --Futbolcu
    --Takım


 */
public class Main {
    public static void main(String[] args) {

        Takim takim= Takim.builder().ad("Besiktas").build();
        ConnectionProvider connectionProvider=new ConnectionProvider();
        TakimRepository takimRepository=new TakimRepository(connectionProvider);
//        FutbolcuRepository futbolcuRepository=new FutbolcuRepository(connectionProvider);
        FutbolcuController futbolcuController=new FutbolcuController(connectionProvider);

     //  takimRepository.save(takim);
      //  System.out.println(takim);
        Futbolcu futbolcu=Futbolcu.builder().id(7L).
                ad("Mustafa").mevki("Defans").formaNo(4).takim_id(7L).deger(100000000L).build();
      // futbolcuController.save2(futbolcu);
      //  futbolcuController.update(futbolcu);
       // futbolcuController.deleteById(6L);
        //futbolcuController.findAll().forEach(System.out::println);
        System.out.println(futbolcuController.findById(8L)); ;
    }
}