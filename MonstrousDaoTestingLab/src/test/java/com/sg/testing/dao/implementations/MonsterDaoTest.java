package com.sg.testing.dao.implementations;

import com.sg.testing.model.Monster;
import com.sg.testing.dao.implementations.AGoodMonsterDao;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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

    @Test
    void getAllMonsters() {
        Monster aMon1 = new Monster("Bob2", YETI, 0, "pizza2");
        Monster aMon2 = new Monster("Sam2", YETI, 0, "deep dish za2");
        dao.addMonster(1232, aMon1);
        dao.addMonster(2342, aMon2);


        try {
            assertEquals( 2, dao.getAllMonsters().size(), "Should only have one student.");
        } catch (Exception e) {
            fail("something went wrong");
        }
    }

    @Test
    void updateMonster() {
        Monster aMon = new Monster("Bob", YETI, 0, "pizza");
        dao.addMonster(234, aMon);
        Monster aMonChanged = new Monster("Robert", YETI, 0, "deep dish pizze");

        try {
            dao.updateMonster(234, aMonChanged);
            assertSame("Robert", dao.getMonster(234).getName());
        } catch (Exception e) {
            fail("something went wrong");
        }
    }

    @Test
    void removeMonster() {
        Monster aMon = new Monster("Bob", YETI, 0, "pizza");
        dao.addMonster(234, aMon);
        try {
            assertEquals(1, dao.getAllMonsters().size());
            dao.removeMonster(234);
            assertEquals(0, dao.getAllMonsters().size());
        } catch (Exception e) {
            fail("something went wrong");
        }
    }
}
