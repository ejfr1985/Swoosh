package com.ejfr1985.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ejfr1985.swoosh.R
import com.ejfr1985.swoosh.Utilities.EXTRA_LEAGUE
import com.ejfr1985.swoosh.Utilities.EXTRA_LEVEL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league = ""
    var level = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println("LifeCycle $league")
    }

    fun onBeginnerClicked(view: View) {
        ballerBtn.isChecked = false
        level = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerBtn.isChecked = false
        level = "baller"
    }

    fun onNextClicked(view: View){

       if( level != "") {
           val finishActivity = Intent(this, FinishActivity::class.java)
           finishActivity.putExtra(EXTRA_LEAGUE, league)
           finishActivity.putExtra(EXTRA_LEVEL, level)
           startActivity(finishActivity)
       } else {
           Toast.makeText(this, "Please Select a Skill Level", Toast.LENGTH_SHORT).show()
       }


    }
}
