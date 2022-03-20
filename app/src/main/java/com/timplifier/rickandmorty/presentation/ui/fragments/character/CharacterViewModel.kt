package com.timplifier.rickandmorty.presentation.ui.fragments.character

import com.timplifier.rickandmorty.base.BaseViewModel
import com.timplifier.rickandmorty.data.repositories.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
) : BaseViewModel() {
    fun fetchCharacters() = characterRepository.fetchCharacters()
}