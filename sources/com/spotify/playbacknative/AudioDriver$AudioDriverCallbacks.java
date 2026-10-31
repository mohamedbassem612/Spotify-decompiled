package com.spotify.playbacknative;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public interface AudioDriver$AudioDriverCallbacks {
    void abandonAudioFocus();

    boolean maybeAbandonAudioFocus();

    boolean requestAudioFocus(AudioFeatures audioFeatures);
}
