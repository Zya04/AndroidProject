package com.example.zya19.projectandroid2

import android.content.res.ColorStateList
import android.support.v4.graphics.drawable.DrawableCompat
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.TintTypedArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.screen1.view.*

class MainAdapter : RecyclerView.Adapter<CustomViewHolder>(){

    val projectTitles = listOf("douche simulator","blablaSims","hot dog test")
    val linkTitles = listOf("ANDROID","NODEJS","AZERTY")
    val descriptionContents = listOf("le seul et unique simulateur de douche pour Android. Disponible sur le Google Play, il est entièerement gratuit !",
        "Le seul et unique service de covoiturage entre Sims. UNe manière écologique de partager ses frais!",
        "Le seul et unique test de hot dog afin de savoir si vous mangez du boeuf, du cochon, du cheval ou du chat")

    val linkColors = listOf("#D81B60", "#008577", "#260135")
    override fun getItemCount(): Int {
        return projectTitles.size
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(p0?.context)
        val cellForRow = layoutInflater.inflate(R.layout.screen1, p0, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {
        val projectTitle = projectTitles.get(p1)
        p0.view.textView.text = projectTitle

        val linkTitle = linkTitles.get(p1)
        p0.view.textView3.text = linkTitle

        val descriptionContent = descriptionContents.get(p1)
        p0.view.textView4.text = descriptionContent

        DrawableCompat.setTintList(p0.view.textView3.background, ColorStateList.valueOf(linkColors))
    }


}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view){

}