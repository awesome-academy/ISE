package com.sun.ise.ui.main.profile

import androidx.lifecycle.ViewModel
import com.sun.ise.data.model.UserWrapper
import com.sun.ise.data.repository.UserRepository

class ProfileViewModel(private val userRepository: UserRepository) : ViewModel() {

    fun getCurrentUser(): UserWrapper? = userRepository.getCurrentUser()

    fun logout() = userRepository.logout()
}
