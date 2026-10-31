package com.spotify.playbacknative;

import android.content.Context;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class AudioEffectsListener_Factory implements jly0 {
    private final jly0 contextProvider;

    private AudioEffectsListener_Factory(jly0 jly0Var) {
        this.contextProvider = jly0Var;
    }

    public static AudioEffectsListener_Factory create(jly0 jly0Var) {
        return new AudioEffectsListener_Factory(jly0Var);
    }

    public static AudioEffectsListener newInstance(Context context) {
        return new AudioEffectsListener(context);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public AudioEffectsListener m491get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
