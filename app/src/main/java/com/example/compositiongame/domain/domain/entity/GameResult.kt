package com.example.compositiongame.domain.domain.entity

data class GameResult(
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countQuestions: Int,
    val gameSettings: GameSettings
)