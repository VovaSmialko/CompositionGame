package com.example.compositiongame.domain.domain.entity

import java.io.Serializable

data class GameResult(
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countQuestions: Int,
    val gameSettings: GameSettings
): Serializable