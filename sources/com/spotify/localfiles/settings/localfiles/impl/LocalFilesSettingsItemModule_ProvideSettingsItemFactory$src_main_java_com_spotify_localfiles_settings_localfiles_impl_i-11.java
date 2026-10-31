package com.spotify.localfiles.settings.localfiles.impl;

import com.spotify.localfiles.settings.localfiles.api.LocalFilesLibrarySettingsItemFactory;
import p.c8o;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class LocalFilesSettingsItemModule_ProvideSettingsItemFactory$src_main_java_com_spotify_localfiles_settings_localfiles_impl_implFactory implements jly0 {
    private final jly0 implProvider;

    private LocalFilesSettingsItemModule_ProvideSettingsItemFactory$src_main_java_com_spotify_localfiles_settings_localfiles_impl_implFactory(jly0 jly0Var) {
        this.implProvider = jly0Var;
    }

    public static LocalFilesSettingsItemModule_ProvideSettingsItemFactory$src_main_java_com_spotify_localfiles_settings_localfiles_impl_implFactory create(jly0 jly0Var) {
        return new LocalFilesSettingsItemModule_ProvideSettingsItemFactory$src_main_java_com_spotify_localfiles_settings_localfiles_impl_implFactory(jly0Var);
    }

    public static LocalFilesLibrarySettingsItemFactory provideSettingsItemFactory$src_main_java_com_spotify_localfiles_settings_localfiles_impl_impl(LocalFilesLibrarySettingsItemFactoryImpl localFilesLibrarySettingsItemFactoryImpl) {
        LocalFilesLibrarySettingsItemFactory localFilesLibrarySettingsItemFactoryProvideSettingsItemFactory$src_main_java_com_spotify_localfiles_settings_localfiles_impl_impl = LocalFilesSettingsItemModule.INSTANCE.provideSettingsItemFactory$src_main_java_com_spotify_localfiles_settings_localfiles_impl_impl(localFilesLibrarySettingsItemFactoryImpl);
        c8o.m(localFilesLibrarySettingsItemFactoryProvideSettingsItemFactory$src_main_java_com_spotify_localfiles_settings_localfiles_impl_impl);
        return localFilesLibrarySettingsItemFactoryProvideSettingsItemFactory$src_main_java_com_spotify_localfiles_settings_localfiles_impl_impl;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public LocalFilesLibrarySettingsItemFactory m479get() {
        return provideSettingsItemFactory$src_main_java_com_spotify_localfiles_settings_localfiles_impl_impl((LocalFilesLibrarySettingsItemFactoryImpl) this.implProvider.get());
    }
}
