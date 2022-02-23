package com.sg.testing.dao.implementations;

import com.sg.testing.model.Monster;
import com.sg.testing.dao.implementations.AGoodMonsterDao;
import org.junit.jupiter.api.Test;

import static com.sg.testing.model.MonsterType.YETI;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterDaoTest {
    private AGoodMonsterDao dao;

    public MonsterDaoTest() {
        dao = new AGoodMonsterDao();
    }

    @Test
    void sanityCheckTrueTest() {
        assertTrue(true);
    }

    @Test
    void sanityCheckFalseTest() {
        assertFalse(false);
    }

    @Test
    void addMonsterTest() {
        Monster aMon = new Monster("Bob", YETI, 0, "pizza");
        try {
            dao.addMonster(123, aMon);
        } catch (Exception e) {
            fail("something went wrong");
        }
    }

    @Test
    void getMonsterTest() {
        Monster aMon = new Monster("Sam", YETI, 0, "deep dish za");
        dao.addMonster(234, aMon);
        try {
            Monster shouldBeAMon = dao.getMonster(234);
            assertNotNull(shouldBeAMon);
        } catch (Exception e) {
            fail("something went wrong");
        }
    }
}
