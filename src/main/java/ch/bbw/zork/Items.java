package ch.bbw.zork;

public class Items {

    //Attributes

    Integer[] DachbodenGewicht = {
            1000 ,
            4000,
            2000
    };
    Integer[] SchlafzimmerGewicht = {
            1000,
            3000
    };
    Integer[] EsszimmerGewicht = {
            300,
            200,
            750,
    };
    Integer[] WohnzimmerGewicht = {
            700,
            600,
            5000,
    };
    Integer[] BadGewicht = {
            80,
            800,
            500,
    };
    Integer[] KellerGewicht = {
            60000,
            2000,
            1000,
            1000
    };



    String[] DachbodenItems = {
            "Kiste" ,
            "AlterFernseher",
            "Filme"
    };
    String[] SchlafzimmerItems = {
            "Pullover",
            "Lampe"
    };
    String[] EsszimmerItems = {
            "Gabel",
            "Messer",
            "Teller",
    };
    String[] WohnzimmerItems = {
            "Fernbedienung",
            "Kissen",
            "Fernseher",
    };
    String[] BadItems = {
            "Papier",
            "Kerze",
            "Feuerzeug",
    };
    String[] KellerItems = {
            "Leiche",
            "Wein",
            "Tenischläger",
            "Schlüssel"
    };


    public String[] getDachbodenItems(){return DachbodenItems;}
    public String[] getSchlafzimmerItems(){return SchlafzimmerItems;}
    public String[] getEsszimmerItems(){return EsszimmerItems;}
    public String[] getWohnzimmerItems(){return WohnzimmerItems;}
    public String[] getBadItems(){return BadItems;}
    public  String[] getKellerItems(){return KellerItems;}

    //@Override
    public String toString(String[] items, Integer[] gewicht){
        // durch das array loopen
        String titel = "Items:";
        String ausgabe = "";
        System.out.println(titel);
        for (int i =0; i< items.length; i++ ) {
            ausgabe += items[i] + ", Gewicht in Gramm: " + gewicht[i] + '\n';
        }
        return ausgabe;
    }

}



