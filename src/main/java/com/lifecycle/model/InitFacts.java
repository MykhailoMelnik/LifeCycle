package com.lifecycle.model;


import com.lifecycle.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class InitFacts {

    private final long daysLived;
    List<String> listFacts;


    public InitFacts(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);
        LocalDate now = LocalDate.now();
        this.daysLived = ChronoUnit.DAYS.between(date, now);
    }

    public List<String> run() {
        listFacts = new ArrayList<>();
//        listFacts.add(shit());
//        listFacts.add(heartBeats());
        listFacts.add(heartLiter());

        return listFacts;
    }

    private String shit() {
        return "За проміжок свого життя ваше тило висрало в середньому біля "
                + Converter.convertGrams(150 * daysLived) + ", що означає що ви ходили до туалету "
                + daysLived * 2 + " разів, ваш анус стискався " + daysLived * 5;
    }

    private String heartBeats() {
        return "Здебільшого люди мають серцебиття близько 60-80 ударів на хвилину, що в результаті складає від 86 400 " +
                "до 115 200 ударів на добу. Ваше серце на сьогодні зробило биля " + daysLived * 31536000 + " ударів.";
    }

    private String heartLiter(){
        return "Через серце проходить близько 5 літрів крові за одну хвилину. Отже, за 24 години це складає близько " +
                "7200 літрів крові. За рік це становитиме близько 2,628,000 літрів крові, " +
                "які серце прокачує через організм. Ваше серце на сьогодні прокачало "
                + daysLived * 7200 + " літрів";
    }
}
