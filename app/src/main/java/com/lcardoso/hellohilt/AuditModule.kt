package com.lcardoso.hellohilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
object AuditModule {

    @Provides
    fun provideAuditLogger() = AuditLogger()
}