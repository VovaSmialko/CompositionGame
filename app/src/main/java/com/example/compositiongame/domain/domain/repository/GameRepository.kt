package com.example.compositiongame.domain.domain.repository

import com.example.compositiongame.domain.domain.entity.GameSettings
import com.example.compositiongame.domain.domain.entity.Level
import com.example.compositiongame.domain.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}