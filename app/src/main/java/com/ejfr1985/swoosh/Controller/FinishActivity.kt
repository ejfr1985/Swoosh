package com.ejfr1985.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ejfr1985.swoosh.R
import com.ejfr1985.swoosh.Utilities.EXTRA_LEAGUE
import com.ejfr1985.swoosh.Utilities.EXTRA_LEVEL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val level = intent.getStringExtra(EXTRA_LEVEL)

        searchLeagueText.text = "Looking for a $league $level league near you..."
    }
}
