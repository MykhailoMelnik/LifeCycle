package com.lifecycle;

import java.text.DecimalFormat;
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
        listFacts.add(shit());
        listFacts.add(heartBeatsCount());
        listFacts.add(heartLiter());
        listFacts.add(energyConsumed());

        return listFacts;
    }

    private String shit() {
        return "За проміжок свого життя ваше тіло висрало в середньому біля "
                + Converter.convertGrams(150 * daysLived) + ", що означає що ви ходили до туалету "
                + daysLived * 2 + " разів, ваш анус стискався та ростискався " + daysLived * 5 + " рази";
    }

    private String heartBeatsCount() {
        long totalHeartBeats = daysLived * 101000;
        double steps = (double) totalHeartBeats / 57186343L;
        DecimalFormat df = new DecimalFormat("#.#");
        String formattedResult = df.format(steps);

        return "Здебільшого люди мають серцебиття близько 60-80 ударів на хвилину, що в результаті складає від 86 400 " +
                "до 115 200 ударів на добу. Ваше серце на сьогодні зробило биля " + totalHeartBeats + " ударів."
                + " Якби з кожним биттям ви робили крок то ви би обійшли землю "
                + formattedResult + " рази";
    }

    private String heartLiter() {
        return "Через серце проходить близько 5 літрів крові за одну хвилину. Отже, за 24 години це складає близько " +
                "7200 літрів крові. За рік це становитиме близько 2,628,000 літрів крові, " +
                "які серце прокачує через організм. Ваше серце на сьогодні прокачало "
                + daysLived * 7200 + " літрів";
    }

    private String energyConsumed(){
        return "Середньо статистична людина при пормірному способі життя споживає 2200 ккал. Ваше тіло " +
                "перетворює все споживане вами за день на енергію 1 ккал = 4184 Дж = 4184 Ватт/с. Лампочка " +
                "споживає 15 ватт. Тоді за життя ви могди б заживити лампочку протягом "
                + daysLived * 4184 * 2200 / 15 / 60 + " хвилин" + " або " + daysLived * 4184 * 2200 / 15 / 60 / 24 + " годин " +
                "" ;
    }
}
