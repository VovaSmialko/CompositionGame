package com.example.compositiongame.domain.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

@Parcelize
data class GameResult(
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countQuestions: Int,
    val gameSettings: GameSettings
) : Parcelable