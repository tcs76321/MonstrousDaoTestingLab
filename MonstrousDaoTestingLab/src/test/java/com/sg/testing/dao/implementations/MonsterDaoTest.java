package com.sg.testing.dao.implementations;

import com.sg.testing.model.Monster;
import com.sg.testing.dao.implementations.AGoodMonsterDao;
import org.junit.jupiter.api.Test;

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
        Monster aMon = new Monster();
        Monster resMon = dao.addMonster(123, aMon);
        try {
            assertNotNull(resMon);
        } catch (Exception e) {
            fail("something went wrong");
        }
    }
}
