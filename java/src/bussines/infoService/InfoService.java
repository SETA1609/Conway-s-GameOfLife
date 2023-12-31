package bussines.infoService;

import bussines.logService.LogService;
import bussines.logService.LogServiceInterface;

public class InfoService implements InfoServiceInterface {

    private final LogServiceInterface logServiceInterface;

    public InfoService() {
        logServiceInterface=new LogService(InfoService.class);
    }

    @Override
    public void getInputInfo() {
        logServiceInterface.info("getInputInfo was call at ");
        String[] allInfo = {
                "Ups! Something just went wrong with your input :(",
                "please use the the number you want to use as input or use ",
                "the following words in lowercase: ",
        };
        printInfo(allInfo);
    }

    @Override
    public void getGameOfLifeInfo() {
        logServiceInterface.info("getGameOfLifeInfo was call at ");
        String[] allInfo = {
                "Conway's Game of Life is a cellular automaton invented by mathematician John Conway in 1970.",
                "It consists of a grid of cells, each of which can be in one of two states: alive or dead.",
                "The game evolves through generations, with each generation's state determined by a set of rules.",
                "A cell's next state depends on its current state and the state of its neighboring cells.",
                "Rules include underpopulation, overpopulation, and reproduction.",
                "Despite its simplicity, the game can produce complex and unpredictable patterns.",
                "It's not a traditional game with players; it's a simulation of cellular automaton behavior.",
                "The game has applications in computer science, mathematics, and biology for modeling and simulation."
        };
        printInfo(allInfo);
    }

    @Override
    public void getGridInfo() {
        logServiceInterface.info("getGridInfo was call at ");
        String[] allInfo = {
                "Welcome to the simulation menu",
                "you can select to do a default simulation with 5 generations or",
                "you can give a number of generations that would stat a simulation with n generations,",
                "where n is the number of generations"
        };
        printInfo(allInfo);
    }

    private void printInfo(String[] infoToPrint) {
        logServiceInterface.info("printInfo was call at ");
        for (String info : infoToPrint) {
            System.out.println(info);
        }
    }
}
