package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p081 implements xpw, cvl1 {
    public final Flowable a;
    public final gw70 b;
    public final lo60 c;
    public final bpb1 d;
    public final vgm e;
    public final js20 f = x3p1.n(new o081(this, (byte) 0), new o081(this, (byte) 1), new dj71(this, (byte) 9), (o8n) null, new o081(this, (byte) 2), 8);
    public final psw g;
    public final hy00 h;

    public p081(Flowable flowable, gw70 gw70Var, lo60 lo60Var, bpb1 bpb1Var, vgm vgmVar) {
        this.a = flowable;
        this.b = gw70Var;
        this.c = lo60Var;
        this.d = bpb1Var;
        this.e = vgmVar;
        j2i j2iVar = new j2i(-1882258298, new c771(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
        this.h = n3o1.r(this).c(vy61.V0, vy61.W0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
