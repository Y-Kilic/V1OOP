package Practicum_7;

import java.util.ArrayList;

public class StringProcessor
{
    private ArrayList<IOpmaakProces> processen;

    public StringProcessor()
    {
        processen = new ArrayList<IOpmaakProces>();
    }

    public String verwerk(String input)
    {
        for(IOpmaakProces proces : processen)
        {input = proces.maakOp(input);}

        return input;
    }

    public void voegProcesToe(IOpmaakProces proces)
    {
        processen.add(proces);
    }
}
