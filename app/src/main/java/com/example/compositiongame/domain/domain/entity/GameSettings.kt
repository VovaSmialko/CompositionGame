package com.example.compositiongame.domain.domain.entity

import java.io.Serializable

data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightQuestions: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSecond: Int
): Serializable