package androidx.media3.common.audio;

import p.c18;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public final c18 a;

    public AudioProcessor$UnhandledAudioFormatException(String str, c18 c18Var) {
        super(str + " " + c18Var);
        this.a = c18Var;
    }

    public AudioProcessor$UnhandledAudioFormatException(c18 c18Var) {
        this("Unhandled input format:", c18Var);
    }
}
