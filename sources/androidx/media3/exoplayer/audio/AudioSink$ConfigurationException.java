package androidx.media3.exoplayer.audio;

import p.ie30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class AudioSink$ConfigurationException extends Exception {
    public final ie30 a;

    public AudioSink$ConfigurationException(Exception exc, ie30 ie30Var) {
        super(exc);
        this.a = ie30Var;
    }

    public AudioSink$ConfigurationException(String str, ie30 ie30Var) {
        super(str);
        this.a = ie30Var;
    }
}
