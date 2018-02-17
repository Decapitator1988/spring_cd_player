package com.decapitator.classes;

import com.decapitator.interfaces.CompactDisc;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public CompactDisc sgtPeppers(){
        BlankDisc cd = new BlankDisc();
        cd.setArtist("Pink Floyd");
        cd.setTitle("The Dark Side of the Moon");
        List<String> tracks = new ArrayList<String>();
        tracks.add("Time");
        tracks.add("Animals");
        tracks.add("High Hopes");
        tracks.add("The Wall");

        cd.setTracks(tracks);

        return cd;
    }
    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
