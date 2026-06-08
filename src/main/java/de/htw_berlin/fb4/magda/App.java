package de.htw_berlin.fb4.magda;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

public class App 
{
    public static void main( String[] args )

    {
        ProseBuilder builder = new ProseBuilder();
        builder.register(new SentenceStart());
        builder.register(new SentenceEnd());
        System.out.println(builder.get());

    }
}
