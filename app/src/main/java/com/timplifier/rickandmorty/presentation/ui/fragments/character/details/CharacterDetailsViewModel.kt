package com.timplifier.rickandmorty.presentation.ui.fragments.character.details

import com.timplifier.rickandmorty.base.BaseViewModel
import com.timplifier.rickandmorty.data.repositories.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterDetailsViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
) : BaseViewModel() {

    fun fetchSingleCharacter(id: Int) =
        characterRepository.fetchSingleCharacter(id)
}