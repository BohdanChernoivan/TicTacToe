package game.file;

import game.realization.RealizationGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveCvsFile {

    private Scanner scanner = new Scanner(System.in);

    private String path;

    public SaveCvsFile(String path) {
        this.path = path;
    }

    public void createFileInCVS(RealizationGame game) {

        System.out.println("Are you want save game? Enter 'yes/no'");
        String save = scanner.nextLine();

        if(save.equals("yes")) {
            try (PrintWriter writer = new PrintWriter(new File(path))) {

                StringBuilder sb = new StringBuilder();

                createStroke(sb, game.getSaveMoves());

                create1Stroke(sb, game);

                writer.write(sb.toString());

                System.out.println("This game saved successfully");
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } else if (save.equals("no")) {
            System.out.println("This game not saved");
        } else
            createFileInCVS(game);
    }

    private void createStroke(StringBuilder sb, ArrayList arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i));
            sb.append('\n');
        }
    }

    private void create1Stroke(StringBuilder sb, RealizationGame game) {

        for (int i = 0; i < game.getSaveMoves().size(); i++) {
            sb.append(game.getSaveMoves().get(i));
            sb.append('\n');
        }
    }
}
