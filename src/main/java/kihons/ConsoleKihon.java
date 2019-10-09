package kihons;

import framework.bases.ConsoleKihonBase;
import framework.exceptions.NotImplementedYetException;

import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.sql.DriverManager;
import java.util.Scanner;

public class ConsoleKihon extends ConsoleKihonBase {
    @Override
    protected void writeFooBarToTheConsole() {
       // System.console().writer().print("FooBar");
        System.out.print("FooBar");
    }

    @Override
    protected void writeLineFooBarToTheConsole() {
       //System.console().writer().println("FooBar");
       System.out.println("FooBar");
    }

    @Override
    protected String readLineFromConsoleAndReturnValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
}
