package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import p.bkh0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final int a;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, bkh0 bkh0Var) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(bkh0Var == null ? null : bkh0Var.a);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.a = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
