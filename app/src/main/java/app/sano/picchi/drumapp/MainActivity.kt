package app.sano.picchi.drumapp

import android.media.AudioAttributes
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var mSoundPool : SoundPool
    private lateinit var mSoundID :Array<Int?>

    private val mSoundResources = arrayListOf(
        R.raw.cymbal1,
        R.raw.cymbal2,
        R.raw.cymbal3,
        R.raw.hihat,
        R.raw.snare,
        R.raw.bass,
        R.raw.tom1,
        R.raw.tom2,
        R.raw.tom3


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_MEDIA)
            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
            .build()

        mSoundPool = SoundPool.Builder()
            .setAudioAttributes(audioAttributes)
                //個数
            .setMaxStreams(mSoundResources.size)
            .build()

        //数字をセット
        mSoundID = arrayOfNulls(mSoundResources.size)

        for(i in 0..(mSoundResources.size -1)){
            mSoundID[i] = mSoundPool.load(applicationContext,mSoundResources[i],0)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        mSoundPool.release()
    }

    fun cymbal1(view: View){
        if (mSoundID[0] != null){
            mSoundPool.play(mSoundID[0] as Int, 1.0F,1.0F,0,0,1.0F)
        }

    }

    fun cymbal2(view: View){
        if (mSoundID[1] != null){
            mSoundPool.play(mSoundID[1] as Int, 1.0F,1.0F,0,0,1.0F)
        }

    }
    fun cymbal3(view: View){
        if (mSoundID[2] != null){
            mSoundPool.play(mSoundID[2] as Int, 1.0F,1.0F,0,0,1.0F)
        }

    }
    fun tom1(view: View){
        if (mSoundID[3] != null){
            mSoundPool.play(mSoundID[3] as Int, 2.0F,2.0F,0,0,1.0F)
        }

    }
    fun tom2(view: View){
        if (mSoundID[4] != null){
            mSoundPool.play(mSoundID[4] as Int, 2.0F,2.0F,0,0,1.0F)
        }

    }
    fun tom3(view: View){
        if (mSoundID[5] != null){
            mSoundPool.play(mSoundID[5] as Int, 2.0F,2.0F,0,0,1.0F)
        }

    }
    fun hihat(view: View){
        if (mSoundID[6] != null){
            mSoundPool.play(mSoundID[6] as Int, 2.0F,2.0F,0,0,1.0F)
        }

    }
    fun snare(view: View){
        if (mSoundID[7] != null){
            mSoundPool.play(mSoundID[7] as Int, 2.0F,2.0F,0,0,1.0F)
        }

    }
    fun bass(view: View){
        if (mSoundID[8] != null){
            mSoundPool.play(mSoundID[8] as Int, 2.0F,2.0F,0,0,1.0F)
        }

    }
}
