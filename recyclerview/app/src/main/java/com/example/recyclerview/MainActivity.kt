package com.example.recyclerview

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.annotation.IntegerRes
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i =0

        val userAdapter = userAdapter(applicationContext, ArrayList<user>())
        main_userlist.adapter = userAdapter
        main_userlist.layoutManager = LinearLayoutManager(applicationContext)
        main_userlist.setHasFixedSize(true)

        main_insert.setOnClickListener {
            var name: String?
            var age: String?
            var major: String?
            var builder = AlertDialog.Builder(this)


            builder.setTitle("회원 추가")

            var view = layoutInflater.inflate(R.layout.view_dialog_insert, null)
            builder.setView(view)

            var positiveListener = object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    var alert = dialog as AlertDialog
                    i++
                    var idx="$i 번째 학생"
                    name = alert.findViewById<EditText>(R.id.view_dialog_insert_name)?.text.toString()
                    age = alert.findViewById<EditText>(R.id.view_dialog_insert_age)?.text.toString()
                    major = alert.findViewById<EditText>(R.id.view_dialog_insert_major)?.text.toString()
                    userAdapter.add(user(idx,name, Integer.parseInt(age!!) , major))
                    userAdapter.notifyDataSetChanged()
                }
            }
            builder.setPositiveButton("추가", positiveListener)
            builder.setNegativeButton("취소", null)
            builder.show()
        }
    }
}
