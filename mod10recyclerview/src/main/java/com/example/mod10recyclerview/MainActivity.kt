package com.example.mod10recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mod10recyclerview.bo.Tuning
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerViewTuning : RecyclerView= findViewById(R.id.recyclerViewTuning)
        recyclerViewTuning.layoutManager = LinearLayoutManager(this)
        recyclerViewTuning.adapter = TuningAdapter(arrayListOf(
                Tuning("Renault 21", "grise", 21, 5, "Christophe", 13.5f, 90.0f, "https://img.over-blog-kiwi.com/0/93/23/39/20170430/ob_afccee_18209113-1524099324298404-652453166579.jpg"),
                Tuning("Nissan Skyline GT-R R34", "bleue", 65, 2, "Brian O'Conner", 18.5f, 330.0f, "https://delessencedansmesveines.com/wp-content/uploads/2022/08/z-DLEDMV-2022-Nissan-Skyline-R34-GTR-VSpecII-Motorex-Paul-Walker-001-1080x675.jpg"),
                Tuning("Toyota Supra", "blanche", 70, 2, "Dominic Toretto", 17.0f, 280.0f, "https://www.tuningblog.eu/wp-content/uploads/2022/07/2023-Toyota-Supra-Edition-mattweiss-1.jpg"),
                Tuning("Mitsubishi Lancer Evolution", "bleue", 20, 5, "Mia Toretto", 14.5f, 330.0f, "https://www.super-hobby.fr/zdjecia/5/0/8/19031_rd.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg"),
                Tuning("Honda Civic", "rouge", 35, 4, "Jesse", 12.0f, 180.0f, "https://picolio.auto123.com/auto123-media/articles/2018/8/65042/Honda-Civic-Type-R-2018-VA%20(19)fr.jpg")
            )){tuningClicked->
            Snackbar.make(
                findViewById(R.id.recyclerViewTuning),
                tuningClicked.baseCar,
                Snackbar.LENGTH_LONG).show()
        }
    }
}