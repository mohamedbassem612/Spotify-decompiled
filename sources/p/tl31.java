package p;

import android.media.MediaCodec;
import com.spotify.base.java.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tl31 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MediaCodec b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl31(MediaCodec mediaCodec, int i, byte b) {
        super(0);
        this.a = b;
        this.b = mediaCodec;
        this.c = i;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        MediaCodec mediaCodec = this.b;
        switch (b) {
            case 0:
                mediaCodec.releaseOutputBuffer(i, false);
                break;
            default:
                Logger.k("Partial frame received, skipping", new Object[0]);
                mediaCodec.releaseOutputBuffer(i, false);
                break;
        }
        return rih1Var;
    }
}
