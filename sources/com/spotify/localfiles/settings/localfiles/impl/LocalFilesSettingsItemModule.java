package com.spotify.localfiles.settings.localfiles.impl;

import com.spotify.localfiles.settings.localfiles.api.LocalFilesLibrarySettingsItemFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/spotify/localfiles/settings/localfiles/impl/LocalFilesSettingsItemModule;", "", "<init>", "()V", "provideSettingsItemFactory", "Lcom/spotify/localfiles/settings/localfiles/api/LocalFilesLibrarySettingsItemFactory;", "impl", "Lcom/spotify/localfiles/settings/localfiles/impl/LocalFilesLibrarySettingsItemFactoryImpl;", "provideSettingsItemFactory$src_main_java_com_spotify_localfiles_settings_localfiles_impl_impl", "src_main_java_com_spotify_localfiles_settings_localfiles_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocalFilesSettingsItemModule {
    public static final LocalFilesSettingsItemModule INSTANCE = new LocalFilesSettingsItemModule();

    private LocalFilesSettingsItemModule() {
    }

    public final LocalFilesLibrarySettingsItemFactory provideSettingsItemFactory$src_main_java_com_spotify_localfiles_settings_localfiles_impl_impl(LocalFilesLibrarySettingsItemFactoryImpl impl) {
        return impl;
    }
}
