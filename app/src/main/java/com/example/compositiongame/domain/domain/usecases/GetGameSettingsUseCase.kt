package com.example.compositiongame.domain.domain.usecases

import com.example.compositiongame.domain.domain.entity.GameSettings
import com.example.compositiongame.domain.domain.entity.Level
import com.example.compositiongame.domain.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}