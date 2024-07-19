package anu.trial.quizapp

import android.provider.SyncStateContract.Constants

object Constants{
    fun getQuestions():ArrayList<Questions>
    {
        val qlist= ArrayList<Questions>()
        val q1 =Questions(1," Who is the Second Field Martial of Indian Army ?",R.drawable.quizq1,
            "Sam Manekshaw","KM Cariappa","Anushree Thosar","Ameya Thosar",1)
    }

}