package com.spotify.localfiles.mediastoreimpl;

import com.spotify.localfiles.mediastore.MediaStoreReaderOptions;
import p.c8o;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class MediaStoreReaderModule_Companion_ProvideMediaStoreReaderOptionsFactory implements jly0 {
    private final jly0 propertiesProvider;

    private MediaStoreReaderModule_Companion_ProvideMediaStoreReaderOptionsFactory(jly0 jly0Var) {
        this.propertiesProvider = jly0Var;
    }

    public static MediaStoreReaderModule_Companion_ProvideMediaStoreReaderOptionsFactory create(jly0 jly0Var) {
        return new MediaStoreReaderModule_Companion_ProvideMediaStoreReaderOptionsFactory(jly0Var);
    }

    public static MediaStoreReaderOptions provideMediaStoreReaderOptions(LocalFilesProperties localFilesProperties) {
        MediaStoreReaderOptions mediaStoreReaderOptionsProvideMediaStoreReaderOptions = MediaStoreReaderModule.INSTANCE.provideMediaStoreReaderOptions(localFilesProperties);
        c8o.m(mediaStoreReaderOptionsProvideMediaStoreReaderOptions);
        return mediaStoreReaderOptionsProvideMediaStoreReaderOptions;
    }

    @Override // p.kly0
    public MediaStoreReaderOptions get() {
        return provideMediaStoreReaderOptions((LocalFilesProperties) this.propertiesProvider.get());
    }
}
