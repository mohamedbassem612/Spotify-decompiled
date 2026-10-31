package p;

import android.media.MediaCodec;
import android.media.MediaMuxer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yl31 extends a8d1 implements vu30 {
    public final /* synthetic */ l811 X;
    public /* synthetic */ Object a;
    public final /* synthetic */ x550 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ gpj1 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ssw0 f;
    public final /* synthetic */ MediaCodec g;
    public final /* synthetic */ g931 h;
    public final /* synthetic */ MediaMuxer i;
    public final /* synthetic */ muq0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl31(int i, long j, MediaCodec mediaCodec, MediaMuxer mediaMuxer, lnm lnmVar, x550 x550Var, muq0 muq0Var, ssw0 ssw0Var, l811 l811Var, g931 g931Var, gpj1 gpj1Var) {
        super(2, lnmVar);
        this.b = x550Var;
        this.c = i;
        this.d = gpj1Var;
        this.e = j;
        this.f = ssw0Var;
        this.g = mediaCodec;
        this.h = g931Var;
        this.i = mediaMuxer;
        this.t = muq0Var;
        this.X = l811Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        yl31 yl31Var = new yl31(this.c, this.e, this.g, this.i, lnmVar, this.b, this.t, this.f, this.X, this.h, this.d);
        yl31Var.a = obj;
        return yl31Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        c9n c9nVar = (c9n) this.a;
        hm5.M(obj);
        x550 x550Var = this.b;
        fn31.T(c9nVar, x550Var.b, 0, new xl31(this.c, this.d, this.e, this.f, this.g, x550Var, null), 2);
        return fn31.T(c9nVar, (o8n) null, 0, new sew0((byte) 17, this.h, this.g, this.i, this.t, this.X, (lnm) null), 3);
    }
}
