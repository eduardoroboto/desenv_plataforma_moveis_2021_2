package br.com.unifor.todolist.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.room.Room
import br.com.unifor.todolist.R
import br.com.unifor.todolist.model.User
import br.com.unifor.todolist.repository.TodoDatabase

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var userId = -1
    private var userEmail = ""
    private lateinit var mCategoriesButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userId = intent.getIntExtra("user_id",-1)
        userEmail = intent.getStringExtra("user_email").toString()

        mCategoriesButton = findViewById(R.id.main_button_categories)
        mCategoriesButton.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.main_button_categories ->{

                val it = Intent(applicationContext, CategoryActivity::class.java)
                it.putExtra("user_id",userId)
                it.putExtra("user_email",userEmail)
                startActivity(it)

            }
        }
    }
}