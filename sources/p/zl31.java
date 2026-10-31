package p;

import android.media.MediaCodec;
import android.media.MediaMuxer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zl31 extends a8d1 implements iu30 {
    public final /* synthetic */ muq0 X;
    public boolean a;
    public final /* synthetic */ MediaCodec b;
    public final /* synthetic */ l811 c;
    public final /* synthetic */ MediaMuxer d;
    public final /* synthetic */ x550 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ gpj1 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ ssw0 i;
    public final /* synthetic */ g931 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl31(int i, long j, MediaCodec mediaCodec, MediaMuxer mediaMuxer, lnm lnmVar, x550 x550Var, muq0 muq0Var, ssw0 ssw0Var, l811 l811Var, g931 g931Var, gpj1 gpj1Var) {
        super(1, lnmVar);
        this.b = mediaCodec;
        this.c = l811Var;
        this.d = mediaMuxer;
        this.e = x550Var;
        this.f = i;
        this.g = gpj1Var;
        this.h = j;
        this.i = ssw0Var;
        this.t = g931Var;
        this.X = muq0Var;
    }

    public final lnm create(lnm lnmVar) {
        g931 g931Var = this.t;
        return new zl31(this.f, this.h, this.b, this.d, lnmVar, this.e, this.X, this.i, this.c, g931Var, this.g);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        MediaCodec mediaCodec = this.b;
        if (!z) {
            hm5.M(obj);
            mediaCodec.start();
            yl31 yl31Var = new yl31(this.f, this.h, this.b, this.d, null, this.e, this.X, this.i, this.c, this.t, this.g);
            this.a = true;
            Object objS = smo1.s(yl31Var, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        mediaCodec.stop();
        if (this.c.a) {
            this.d.stop();
        }
        return rih1.a;
    }
}
