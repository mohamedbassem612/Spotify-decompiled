package androidx.media3.exoplayer.audio;

import p.f4i1;
import p.ie30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class AudioSink$WriteException extends Exception {
    public final int a;
    public final boolean b;
    public final ie30 c;

    public AudioSink$WriteException(int i, ie30 ie30Var, boolean z) {
        super(f4i1.c(i, "AudioTrack write failed: "));
        this.b = z;
        this.a = i;
        this.c = ie30Var;
    }
}
