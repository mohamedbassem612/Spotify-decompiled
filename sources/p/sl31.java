package p;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sl31 extends onm {
    public final /* synthetic */ g931 X;
    public int Y;
    public MediaCodec a;
    public MediaMuxer b;
    public muq0 c;
    public Function0 d;
    public l811 e;
    public MediaCodec.BufferInfo f;
    public n811 g;
    public o811 h;
    public long i;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl31(g931 g931Var, onm onmVar) {
        super(onmVar);
        this.X = g931Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.m(null, null, null, null, this);
    }
}
