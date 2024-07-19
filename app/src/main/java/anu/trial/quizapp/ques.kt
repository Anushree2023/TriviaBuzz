package anu.trial.quizapp

import android.provider.SyncStateContract.Constants

object Constants{
    fun getQuestions():ArrayList<Questions>
    {
        val qlist= ArrayList<Questions>()
        val q1 =Questions(1," Who is the Second Field Martial of Indian Army ?",R.drawable.quizq1,
            "Sam Manekshaw","KM Cariappa","Anushree Thosar","Ameya Thosar",1)
        qlist.add(q1)

        val q2=Questions(2," Who is the First Field MArtial of Indian Army",R.drawable.quizq1,
            "Sam Manekshaw","KM Cariappa","Anushree Thosar","Ameya Thosar",2)
        qlist.add(q2)
        val q3=Questions(1," Who is in Indian Air Force ?",R.drawable.quizq1,
            "Sam Manekshaw","KM Cariappa","Anushree Thosar","Ameya Thosar",4)
        qlist.add(q3)
        val q4=Questions(1," Who is Amazing and most intelligent ?",R.drawable.quizq1,
            "Sam Manekshaw","KM Cariappa","Anushree Thosar","Ameya Thosar",3)
        qlist.add(q4)
        return qlist


    }


}