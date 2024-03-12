package MVC;


/**
 *
 */
public class Keys {

    protected static final String ANSI_ESC = "\u001B[";
    protected static final String ANSI_RIGHT = ANSI_ESC + "C";
    protected static final String ANSI_LEFT = ANSI_ESC + "D";
    protected static final String ANSI_HOME = ANSI_ESC + "H";
    protected static final String ANSI_END = ANSI_ESC + "F";
    protected static final String ANSI_INS = ANSI_ESC + "[2~";
    protected static final String ANSI_RET = "\r";
    protected static final String ANSI_BCKS = "\b";
    protected static final String ANSI_DEL = ANSI_ESC + "[3~";
    
    protected static final int ESCAPE = 27;
    protected static final int RIGHT = 67;
    protected static final int LEFT = 68;
    protected static final int HOME = 72;
    protected static final int END = 70;
    protected static final int INS = 155;
    protected static final int RETURN = 13;
    protected static final int BCKS = 8;
    protected static final int DEL = 127;
    
}