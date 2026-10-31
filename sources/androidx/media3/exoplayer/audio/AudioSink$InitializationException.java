package androidx.media3.exoplayer.audio;

import p.cy30;
import p.ie30;
import p.ktd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class AudioSink$InitializationException extends Exception {
    public final boolean a;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(int i, int i2, int i3, int i4, ie30 ie30Var, boolean z, AudioOutputProvider$InitializationException audioOutputProvider$InitializationException) {
        StringBuilder sbQ = cy30.q(i, i2, "AudioTrack init failed 0 Config(", ", ", ", ");
        ktd.p(i3, i4, ", ", ") ", sbQ);
        sbQ.append(ie30Var);
        sbQ.append(z ? " (recoverable)" : "");
        super(sbQ.toString(), audioOutputProvider$InitializationException);
        this.a = z;
    }
}
