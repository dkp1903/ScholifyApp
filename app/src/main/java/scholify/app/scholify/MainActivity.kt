package scholify.app.scholify

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


import android.content.Intent
//import android.support.v7.app.AppCompatActivity
//import android.os.Bundle
import android.widget.Button
import android.widget.Toolbar


class MainActivity : AppCompatActivity() {

    var admloginbutton: Button? = null
    var internloginbutton: Button? = null
    var aboutusbutton: Button?= null
    var tasklistbutton: Button?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        admloginbutton = findViewById(R.id.AdminLogin)
        admloginbutton?.setOnClickListener({
            var clickIntent2 = Intent(this@MainActivity, AdministratorLogin::class.java)
            startActivity(clickIntent2)
        })

        internloginbutton = findViewById(R.id.UserLogin)
        internloginbutton?.setOnClickListener({
            var clickIntent3 = Intent(this@MainActivity, UserLogin::class.java)
            startActivity(clickIntent3)
        })
        aboutusbutton = findViewById(R.id.AboutUs)
        aboutusbutton?.setOnClickListener({
            var clickIntent4 = Intent(this@MainActivity, AboutUs::class.java)
            startActivity(clickIntent4)
        })
        tasklistbutton = findViewById(R.id.Careers)
        tasklistbutton?.setOnClickListener({
            var clickIntent5 = Intent(this@MainActivity, Careers::class.java)
            startActivity(clickIntent5)
        })
    }

}


