package com.decapitator;

import static org.junit.Assert.*;

import com.decapitator.classes.TrackCounter;
import com.decapitator.classes.TrackCounterConfig;
import com.decapitator.interfaces.CompactDisc;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackConterTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter(){
        cd.playTrack(1);
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(4);
        cd.playTrack(4);

        assertEquals(2, counter.getPlayCount(1));
        assertEquals(1, counter.getPlayCount(2));
        assertEquals(3, counter.getPlayCount(3));
        assertEquals(2, counter.getPlayCount(4));
    }

}
