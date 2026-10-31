package androidx.media3.exoplayer.mediacodec;

import p.bkh0;
import p.dv20;
import p.ie30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {
    public final String a;
    public final boolean b;
    public final bkh0 c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaCodecRenderer$DecoderInitializationException(ie30 ie30Var, MediaCodecUtil.DecoderQueryException decoderQueryException, boolean z, int i) {
        String str = "Decoder init failed: [" + i + "], " + ie30Var;
        String str2 = ie30Var.f66p;
        StringBuilder sbG = dv20.g("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_", i < 0 ? "neg_" : "");
        sbG.append(Math.abs(i));
        this(str, decoderQueryException, str2, z, null, sbG.toString());
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, bkh0 bkh0Var, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = bkh0Var;
        this.d = str3;
    }
}
