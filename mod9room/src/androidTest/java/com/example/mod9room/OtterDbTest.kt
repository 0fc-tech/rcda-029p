package com.example.mod9room

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.mod9room.bo.Otter
import com.example.mod9room.bo.SexOtter
import com.example.mod9room.dao.OtterDao
import com.example.mod9room.dao.OtterDatabase
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class OtterDbTest {
    private lateinit var otterDao : OtterDao
    private lateinit var otterDb : OtterDatabase

    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        otterDb = Room.inMemoryDatabaseBuilder(
            context, OtterDatabase::class.java).build()
        otterDao = otterDb.otterDao()
    }
    @Test
    fun insertSophieInDb() {
        val idOtterSophie = otterDao.add(Otter(0,"Sophie",SexOtter.FEMALE,7,5,true,67f))
        assert(otterDao.getOtter(idOtterSophie)?.id == idOtterSophie)
    }
    @Test
    fun insertOlivierInDb() {
        val idOtterOlivier = otterDao.add(Otter(0,"Olivier",SexOtter.MALE,2,8,true,72f))
        assert(otterDao.getOtter(idOtterOlivier)?.id == idOtterOlivier)
    }
}