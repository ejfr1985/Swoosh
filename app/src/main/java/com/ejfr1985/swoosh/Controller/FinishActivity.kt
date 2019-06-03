package com.ejfr1985.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ejfr1985.swoosh.Model.Player
import com.ejfr1985.swoosh.R
import com.ejfr1985.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for a ${player.league} ${player.level} league near you..."
    }
}
