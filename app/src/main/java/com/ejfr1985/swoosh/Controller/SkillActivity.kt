package com.ejfr1985.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ejfr1985.swoosh.Model.Player
import com.ejfr1985.swoosh.R
import com.ejfr1985.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var player : Player

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {

            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onBeginnerClicked(view: View) {
        ballerBtn.isChecked = false
        player.level = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerBtn.isChecked = false
        player.level = "baller"
    }

    fun onNextClicked(view: View){

       if( player.level != "") {
           val finishActivity = Intent(this, FinishActivity::class.java)
           finishActivity.putExtra(EXTRA_PLAYER, player)
           startActivity(finishActivity)
       } else {
           Toast.makeText(this, "Please Select a Skill Level", Toast.LENGTH_SHORT).show()
       }


    }
}
