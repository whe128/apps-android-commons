package fr.free.nrw.commons.explore.media

import fr.free.nrw.commons.Media
import fr.free.nrw.commons.di.CommonsApplicationModule
import fr.free.nrw.commons.explore.BasePagingPresenter
import io.reactivex.Scheduler
import javax.inject.Inject
import javax.inject.Named

class SearchMediaFragmentPresenter @Inject constructor(
    @Named(CommonsApplicationModule.MAIN_THREAD) mainThreadScheduler: Scheduler,
    dataSourceFactory: PageableMediaDataSource
) : BasePagingPresenter<Media>(mainThreadScheduler, dataSourceFactory),
    SearchMediaFragmentContract.Presenter
