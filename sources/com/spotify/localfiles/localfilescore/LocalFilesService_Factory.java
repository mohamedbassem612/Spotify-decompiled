package com.spotify.localfiles.localfilescore;

import android.content.Context;
import com.spotify.localfiles.mediastore.MediaStoreReaderOptions;
import com.spotify.localfiles.mediastore.OpenedAudioFiles;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class LocalFilesService_Factory implements jly0 {
    private final jly0 contextProvider;
    private final jly0 mediaStoreReaderOptionsProvider;
    private final jly0 openedAudioFilesProvider;

    private LocalFilesService_Factory(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3) {
        this.contextProvider = jly0Var;
        this.mediaStoreReaderOptionsProvider = jly0Var2;
        this.openedAudioFilesProvider = jly0Var3;
    }

    public static LocalFilesService_Factory create(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3) {
        return new LocalFilesService_Factory(jly0Var, jly0Var2, jly0Var3);
    }

    public static LocalFilesService newInstance(Context context, MediaStoreReaderOptions mediaStoreReaderOptions, OpenedAudioFiles openedAudioFiles) {
        return new LocalFilesService(context, mediaStoreReaderOptions, openedAudioFiles);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public LocalFilesService m460get() {
        return newInstance((Context) this.contextProvider.get(), (MediaStoreReaderOptions) this.mediaStoreReaderOptionsProvider.get(), (OpenedAudioFiles) this.openedAudioFilesProvider.get());
    }
}
