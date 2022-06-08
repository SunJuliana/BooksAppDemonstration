package ru.synergy.booksappdemonstration.presentation

import android.app.Application
import android.os.Bundle

class CleanArchitectureBlueprintsApplication: Application() {
    private val booksRepository: BooksRepositoryImpl
    get() = ServiceLocator.probideBooksRepository(this)

    val getBookUseCase: GetBookUseCase
        get() = GetBookUseCase(booksRepository)

    val getBookmarksUseCase: GetBookmarksUseCase
        get() = GetBookmarksUseCase(booksRepository)

    val bookmarkBooksUseCase: BookmarkBookUseCase
        get() = BookmarkBookUseCase(booksRepository)

    val unbookmarkBooksUseCase: UnbookmarkBookUseCase
        get() = UnbookmarkBookUseCase(booksRepository)

    val bookWithStatusMapper = BookWithSTstusMapper()

    override fun onCreate(savedInstanceState: Bundle) {
        super.onCreate()
    }



}