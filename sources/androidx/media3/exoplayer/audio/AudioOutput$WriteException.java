package androidx.media3.exoplayer.audio;

import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class AudioOutput$WriteException extends Exception {
    public final int a;
    public final boolean b;

    public AudioOutput$WriteException(int i, boolean z) {
        super(f4i1.c(i, "AudioOutput write failed: "));
        this.b = z;
        this.a = i;
    }
}
