package com.combat;

public class JemadCombat extends SotfCharacters{


    // array of Jemad basic attack and defense options
    public String[] jemadAttacks = {"Straight Punch", "Push Kick", "Uppercut", "Head Kick", "Hip Throw"};
    public String[] jemadDefense = {"Dodge", "Parry", "Block", "Duck"};

    // whatever the name of the method is
    // within the PlayerCombatLogic

    public JemadCombat(String name) {
        super(name, 100, 100);
    }

    @Override
    public String defense(String userCommand) {
        return "";
    }

    // Jemad specific methods
    @Override
    public String attack(String userCommand) {
        if (userCommand.equals("Straight Punch")) {
            return ("Jemad plants his feet and throws a straight punch!");

        } else if (userCommand.equals("Push Kick")) {
            return ("Jemad quickly aims a push kick the enemies mid section");
        } else if (userCommand.equals("Uppercut")) {
            return ("Jemad aims a uppercut to the chin of the opponent");
        } else if (userCommand.equals("Head Kick")) {
            return ("Jemad aims a strong high kick the the side of the opponents head");
        } else if (userCommand.equals("Hip Throw")) {
            return ("Jemad grabs the enemy and shifts his weight to throw them over his hip");
        } else {
            return "not a valid move";
        }
    }
    }
