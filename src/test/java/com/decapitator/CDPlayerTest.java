package com.decapitator;

import static org.junit.Assert.*;
import com.decapitator.classes.CDPlayerConfig;
import com.decapitator.interfaces.CompactDisc;
import com.decapitator.interfaces.MediaPlayer;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={CDPlayerConfig.class})
public class CDPlayerTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();
    @Autowired
    private MediaPlayer player;
//
    @Autowired
    private CompactDisc cd;
    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }
    @Test
    public void play(){
        player.play();
        assertEquals("Playing Otherside by Red hot chili peppers", log.getLog());
    }
}
