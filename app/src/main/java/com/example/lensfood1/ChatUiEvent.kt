package com.example.lensfood1

import android.graphics.Bitmap

/**
 * @author Ahmed Guedmioui
 */
sealed class ChatUiEvent {
    data class UpdatePrompt(val newPrompt: String) : ChatUiEvent()
    data class SendPrompt(
        val prompt: String,
        val bitmap: Bitmap?
    ) : ChatUiEvent()
}