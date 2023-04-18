package com.example.myapplication.presentation.data.repo

import android.content.Context
import com.example.myapplication.R
import javax.inject.Inject

/**
 * Created by Harjot Singh on 18/04/23
 */
internal interface TextChangeRepo {
    fun getDifferentText(): String
    fun getOldText(): String
}

internal class TextChangeRepoImpl @Inject constructor(private val context: Context) :
    TextChangeRepo {
    override fun getDifferentText(): String = context.getString(R.string.new_changed_text)
    override fun getOldText(): String = context.getString(R.string.old_text)
}