package com.spotify.localfiles.localfilescore;

import com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature;
import com.spotify.localfiles.mediastore.OpenedAudioFiles;
import p.c8o;
import p.jly0;
import p.xde0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class LocalFilesFeatureModule_ProvideLocalFilesFeatureFactory implements jly0 {
    private final jly0 localFilesClientProvider;
    private final jly0 openedAudioFilesProvider;

    private LocalFilesFeatureModule_ProvideLocalFilesFeatureFactory(jly0 jly0Var, jly0 jly0Var2) {
        this.openedAudioFilesProvider = jly0Var;
        this.localFilesClientProvider = jly0Var2;
    }

    public static LocalFilesFeatureModule_ProvideLocalFilesFeatureFactory create(jly0 jly0Var, jly0 jly0Var2) {
        return new LocalFilesFeatureModule_ProvideLocalFilesFeatureFactory(jly0Var, jly0Var2);
    }

    public static LocalFilesFeature provideLocalFilesFeature(OpenedAudioFiles openedAudioFiles, xde0 xde0Var) {
        LocalFilesFeature localFilesFeatureProvideLocalFilesFeature = LocalFilesFeatureModule.INSTANCE.provideLocalFilesFeature(openedAudioFiles, xde0Var);
        c8o.m(localFilesFeatureProvideLocalFilesFeature);
        return localFilesFeatureProvideLocalFilesFeature;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public LocalFilesFeature m459get() {
        return provideLocalFilesFeature((OpenedAudioFiles) this.openedAudioFilesProvider.get(), (xde0) this.localFilesClientProvider.get());
    }
}
