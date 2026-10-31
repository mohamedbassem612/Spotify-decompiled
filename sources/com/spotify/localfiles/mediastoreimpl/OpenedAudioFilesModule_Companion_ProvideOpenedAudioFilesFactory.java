package com.spotify.localfiles.mediastoreimpl;

import android.content.Context;
import com.spotify.localfiles.mediastore.OpenedAudioFiles;
import p.c8o;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class OpenedAudioFilesModule_Companion_ProvideOpenedAudioFilesFactory implements jly0 {
    private final jly0 contextProvider;

    private OpenedAudioFilesModule_Companion_ProvideOpenedAudioFilesFactory(jly0 jly0Var) {
        this.contextProvider = jly0Var;
    }

    public static OpenedAudioFilesModule_Companion_ProvideOpenedAudioFilesFactory create(jly0 jly0Var) {
        return new OpenedAudioFilesModule_Companion_ProvideOpenedAudioFilesFactory(jly0Var);
    }

    public static OpenedAudioFiles provideOpenedAudioFiles(Context context) {
        OpenedAudioFiles openedAudioFilesProvideOpenedAudioFiles = OpenedAudioFilesModule.INSTANCE.provideOpenedAudioFiles(context);
        c8o.m(openedAudioFilesProvideOpenedAudioFiles);
        return openedAudioFilesProvideOpenedAudioFiles;
    }

    @Override // p.kly0
    public OpenedAudioFiles get() {
        return provideOpenedAudioFiles((Context) this.contextProvider.get());
    }
}
