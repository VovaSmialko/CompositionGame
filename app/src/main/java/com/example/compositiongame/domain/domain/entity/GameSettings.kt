package com.example.compositiongame.domain.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightQuestions: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSecond: Int
)