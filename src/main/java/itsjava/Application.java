package itsjava;

import itsjava.services.ServerService;
import itsjava.services.ServerServiceImpl;

import java.io.IOException;

public class Application {


    public static void main(String[] args) throws IOException {
        ServerService serverService = new ServerServiceImpl();
        serverService.start();
    }
}
