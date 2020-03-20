package Practicum_7;

public class UitgeverijApp {
    public static void main(String[] args) 
    {
        StringProcessor processor = new StringProcessor();
        processor.voegProcesToe(new VervangProces("hij", "hij/zij"));
        processor.voegProcesToe(new HoofdletterProces());

        // zelf proces gemaakt.
        processor.voegProcesToe(new KleinletterProces());

        String inputString = "Een student loopt meestal in het derde jaar stage. Dan moet hij zelf een stageplek vinden.";
        String result = processor.verwerk(inputString);
        System.out.println(result);
    }
}
