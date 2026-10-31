package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xdf1 implements tyq {
    public final js20 N0;
    public final ia00 O0;
    public final psw P0;
    public final idd1 X;
    public final idd1 Y = new idd1(new j4f1(this, (byte) 4));
    public final f4r Z;
    public final gw70 a;
    public final lo60 b;
    public final myq0 c;
    public final lwp d;
    public final Flowable e;
    public final xh71 f;
    public final ycm g;
    public final yqg h;
    public final d0r i;
    public final wh1 t;

    public xdf1(gw70 gw70Var, lo60 lo60Var, myq0 myq0Var, lwp lwpVar, Flowable flowable, xh71 xh71Var, ycm ycmVar, yqg yqgVar, d0r d0rVar, wh1 wh1Var, idd1 idd1Var) {
        this.a = gw70Var;
        this.b = lo60Var;
        this.c = myq0Var;
        this.d = lwpVar;
        this.e = flowable;
        this.f = xh71Var;
        this.g = ycmVar;
        this.h = yqgVar;
        this.i = d0rVar;
        this.t = wh1Var;
        this.X = idd1Var;
        g4r g4rVar = new g4r((byte) 0);
        g4rVar.j(vdf1.a, dw81.Z);
        this.Z = g4rVar.k();
        this.N0 = x3p1.n(new hbz0(this, (byte) 24), new ibf1(this, (byte) 3), new wcf1(this, (byte) 2), (o8n) null, (iu30) null, 24);
        this.O0 = n3o1.q(this).a(kle1.Z, kle1.N0);
        j2i j2iVarJ = apo.j(509036734, new y2f1(this, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.P0 = new psw(j2iVarJ, (byte) 0);
    }

    public final rqw a() {
        return this.O0;
    }

    public final jsw c() {
        return this.P0;
    }

    @Override // p.wul1
    public final d0r e() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.N0;
    }

    @Override // p.wul1
    public final f4r getData() {
        return this.Z;
    }
}
