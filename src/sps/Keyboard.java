/*
 * http://stackoverflow.com/questions/1248510/convert-string-to-keyevents?answertab=votes#tab-top
 */
package sps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import static java.awt.event.KeyEvent.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AnyUser
 */
public class Keyboard {

    private Robot robot;

    public static void main(String... args) throws Exception {
        Keyboard keyboard = new Keyboard();
        keyboard.type("Hello there, how are you?");
    }

    public void doTyping(String letter) throws Exception {
        Keyboard keyboard = new Keyboard();
        robot.delay(500);
        keyboard.type(letter);
    }

    public Keyboard() throws AWTException {
        this.robot = new Robot();
    }

    public Keyboard(Robot robot) {
        this.robot = robot;
    }

    public void type(CharSequence characters) {
        int length = characters.length();
        for (int i = 0; i < length; i++) {
            char character = characters.charAt(i);
            type(character);
        }
    }

    public void type(char character) {
        switch (character) {
            case 'a':
                doType(VK_A);
                break;
            case 'b':
                doType(VK_B);
                break;
            case 'c':
                doType(VK_C);
                break;
            case 'd':
                doType(VK_D);
                break;
            case 'e':
                doType(VK_E);
                break;
            case 'f':
                doType(VK_F);
                break;
            case 'g':
                doType(VK_G);
                break;
            case 'h':
                doType(VK_H);
                break;
            case 'i':
                doType(VK_I);
                break;
            case 'j':
                doType(VK_J);
                break;
            case 'k':
                doType(VK_K);
                break;
            case 'l':
                doType(VK_L);
                break;
            case 'm':
                doType(VK_M);
                break;
            case 'n':
                doType(VK_N);
                break;
            case 'o':
                doType(VK_O);
                break;
            case 'p':
                doType(VK_P);
                break;
            case 'q':
                doType(VK_Q);
                break;
            case 'r':
                doType(VK_R);
                break;
            case 's':
                doType(VK_S);
                break;
            case 't':
                doType(VK_T);
                break;
            case 'u':
                doType(VK_U);
                break;
            case 'v':
                doType(VK_V);
                break;
            case 'w':
                doType(VK_W);
                break;
            case 'x':
                doType(VK_X);
                break;
            case 'y':
                doType(VK_Y);
                break;
            case 'z':
                doType(VK_Z);
                break;
            case 'A':
                doType(VK_SHIFT, VK_A);
                break;
            case 'B':
                doType(VK_SHIFT, VK_B);
                break;
            case 'C':
                doType(VK_SHIFT, VK_C);
                break;
            case 'D':
                doType(VK_SHIFT, VK_D);
                break;
            case 'E':
                doType(VK_SHIFT, VK_E);
                break;
            case 'F':
                doType(VK_SHIFT, VK_F);
                break;
            case 'G':
                doType(VK_SHIFT, VK_G);
                break;
            case 'H':
                doType(VK_SHIFT, VK_H);
                break;
            case 'I':
                doType(VK_SHIFT, VK_I);
                break;
            case 'J':
                doType(VK_SHIFT, VK_J);
                break;
            case 'K':
                doType(VK_SHIFT, VK_K);
                break;
            case 'L':
                doType(VK_SHIFT, VK_L);
                break;
            case 'M':
                doType(VK_SHIFT, VK_M);
                break;
            case 'N':
                doType(VK_SHIFT, VK_N);
                break;
            case 'O':
                doType(VK_SHIFT, VK_O);
                break;
            case 'P':
                doType(VK_SHIFT, VK_P);
                break;
            case 'Q':
                doType(VK_SHIFT, VK_Q);
                break;
            case 'R':
                doType(VK_SHIFT, VK_R);
                break;
            case 'S':
                doType(VK_SHIFT, VK_S);
                break;
            case 'T':
                doType(VK_SHIFT, VK_T);
                break;
            case 'U':
                doType(VK_SHIFT, VK_U);
                break;
            case 'V':
                doType(VK_SHIFT, VK_V);
                break;
            case 'W':
                doType(VK_SHIFT, VK_W);
                break;
            case 'X':
                doType(VK_SHIFT, VK_X);
                break;
            case 'Y':
                doType(VK_SHIFT, VK_Y);
                break;
            case 'Z':
                doType(VK_SHIFT, VK_Z);
                break;
            case '`':
                doType(VK_SHIFT, VK_AT);
                break;
            case '0':
                doType(VK_0);
                break;
            case '1':
                doType(VK_1);
                break;
            case '2':
                doType(VK_2);
                break;
            case '3':
                doType(VK_3);
                break;
            case '4':
                doType(VK_4);
                break;
            case '5':
                doType(VK_5);
                break;
            case '6':
                doType(VK_6);
                break;
            case '7':
                doType(VK_7);
                break;
            case '8':
                doType(VK_8);
                break;
            case '9':
                doType(VK_9);
                break;
            case '-':
                doType(VK_MINUS);
                break;
            case '=':
                doType(VK_SHIFT, VK_MINUS);
                break;
            case '~':
                doType(VK_SHIFT, VK_CIRCUMFLEX);
                break;
            case '!':
                doType(VK_SHIFT, VK_1);
                break;
            case '@':
                doType(VK_AT);
                break;
            case '#':
                doType(VK_SHIFT, VK_3);
                break;
            case '$':
                doType(VK_SHIFT, VK_4);
                break;
            case '%':
                doType(VK_SHIFT, VK_5);
                break;
            case '^':
                doType(VK_CIRCUMFLEX);
                break;
            case '&':
                doType(VK_SHIFT, VK_6);
                break;
            case '*':
                doType(VK_SHIFT, VK_COLON);
                break;
            case '(':
                doType(VK_SHIFT, VK_8);
                break;
            case ')':
                doType(VK_SHIFT, VK_9);
                break;
            case '_':
                doType(VK_UNDERSCORE);
                break;
            case '+':
                doType(VK_SHIFT, VK_SEMICOLON);
                break;
            case '\t':
                doType(VK_TAB);
                break;
            case '\n':
                doType(VK_ENTER);
                break;
            case '[':
                doType(VK_OPEN_BRACKET);
                break;
            case ']':
                doType(VK_CLOSE_BRACKET);
                break;
            case '\\':
                doType(VK_BACK_SLASH);
                break;
            case '{':
                doType(VK_SHIFT, VK_OPEN_BRACKET);
                break;
            case '}':
                doType(VK_SHIFT, VK_CLOSE_BRACKET);
                break;
            case '|':
                doType(VK_SHIFT, VK_BACK_SLASH);
                break;
            case ';':
                doType(VK_SEMICOLON);
                break;
            case ':':
                doType(VK_COLON);
                break;
            case '\'':
                doType(VK_SHIFT, VK_7);
                break;
            case '"':
                doType(VK_SHIFT, VK_2);
                break;
            case ',':
                doType(VK_COMMA);
                break;
            case '<':
                doType(VK_SHIFT, VK_COMMA);
                break;
            case '.':
                doType(VK_PERIOD);
                break;
            case '>':
                doType(VK_SHIFT, VK_PERIOD);
                break;
            case '/':
                doType(VK_SLASH);
                break;
            case '?':
                doType(VK_SHIFT, VK_SLASH);
                break;
            case ' ':
                doType(VK_SPACE);
                break;
            default:
                throw new IllegalArgumentException("Cannot type character " + character);
        }
    }

    private void doType(int... keyCodes) {
        doType(keyCodes, 0, keyCodes.length);
    }

    private void doType(int[] keyCodes, int offset, int length) {
        if (length == 0) {
            return;
        }
        if (keyCodes[offset] == VK_UNDERSCORE) { // '_'
           robot.delay(1000);
            /**
            Toolkit kit = Toolkit.getDefaultToolkit();
            Clipboard clip = kit.getSystemClipboard();
            try {
                String buf = (String) clip.getData(DataFlavor.stringFlavor);
                StringSelection ss = new StringSelection("_");
                clip.setContents(ss, ss);
                robot.keyPress(VK_CONTROL);
                robot.keyPress(VK_V);
                robot.keyRelease(VK_V);
                robot.keyRelease(VK_CONTROL);
                            robot.delay(1000);
                StringSelection ssBuf = new StringSelection(buf);
                Toolkit kitBuf = Toolkit.getDefaultToolkit();
                Clipboard clipBuf = kitBuf.getSystemClipboard();
                clipBuf.setContents(ssBuf, ssBuf);
            } catch (UnsupportedFlavorException | IOException e) {
                System.out.println(e);
            }
            */
            JOptionPane.showMessageDialog(null, "Press the [U.S.] key and then press the Ok button."); // Key with hand.
            robot.delay(1000);
        } else {
            robot.keyPress(keyCodes[offset]);
            doType(keyCodes, offset + 1, length - 1);
            robot.keyRelease(keyCodes[offset]);
        }
    }

}
