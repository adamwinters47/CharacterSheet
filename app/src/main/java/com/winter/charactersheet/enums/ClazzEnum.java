package com.winter.charactersheet.enums;

public enum ClazzEnum implements CharacterEnumInterface{
    ALCHEMIST("Alchemist"),
    ANTIPALADIN("Antipaladin"),
    ARCANIST("Arcanist"),
    ARTIFICER("Artificer"),
    BARBARIAN("Barbarian"),
    BARD("Bard"),
    BLOOD_HUNTER("Blood Hunter"),
    BLOODRAGER("Bloodrager"),
    BRAWLER("Brawler"),
    CAVALIER("Cavalier"),
    CLERIC("Cleric"),
    DRUID("Druid"),
    FIGHTER("Fighter"),
    GUNSLINGER("Gunslinger"),
    HUNTER("Hunter"),
    INQUISITOR("Inquisitor"),
    INVESTIGATOR("Investigator"),
    KINETICIST("Kineticist"),
    MAGUS("Magus"),
    MEDIUM("Medium"),
    MESMERIST("Mesmerist"),
    MONK("Monk"),
    NINJA("Ninja"),
    OCCULTIST("Occultist"),
    OMDURA("Omdura"),
    ORACLE("Oracle"),
    PALADIN("Paladin"),
    PSYCHIC("Psychic"),
    RANGER("Ranger"),
    ROGUE("Rogue"),
    SAMURAI("Samurai"),
    SHAMAN("Shaman"),
    SHIFTER("Shifter"),
    SKALD("Skald"),
    SLAYER("Slayer"),
    SORCERER("Sorcerer"),
    SPRITIUALIST("Spiritualist"),
    SUMMONER("Summoner"),
    SWASHBUCKLER("Swashbuckler"),
    VAMPIRE_HUNTER("Vampire Hunter"),
    VIGILANTE("Viglante"),
    WARLOCK("Warlock"),
    WARPRIEST("Warpriest"),
    WITCH("Witch"),
    WIZARD("Wizard");

    private String name;

    ClazzEnum(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

}
