package com.spotify.playbacknative;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public interface AudioDriver$NativeWrapper {
    void onBufferUnderrun(int i);

    void onDestroy();

    void onFlush();
}
