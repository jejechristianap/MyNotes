package com.jejec.mynotes.feature_note.presentation.util

sealed class Screen(val route: String) {
    object NotesScreen: Screen("notes_screen")
    object AddEditNoteScree: Screen("add_edit_note_screen")
}
