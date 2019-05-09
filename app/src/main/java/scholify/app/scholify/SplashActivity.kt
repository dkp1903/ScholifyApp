package scholify.app.scholify

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            //first make an intent object
            val startAct = Intent(this@SplashActivity, MainActivity::class.java)
            //Context of application will be taken from SplashActivity and the details will be
            //transferred to the next, that is, the MainActivity
            startActivity(startAct)
            this.finish()
        }, 1000)
    }
}
