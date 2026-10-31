package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iox0 implements tyq {
    public final ycm a;
    public final myq0 b;
    public final Flowable c;
    public final d0r d;
    public final o3r e;
    public final js20 f;
    public final ia00 g;
    public final psw h;
    public final o3r i;

    public iox0(lzn0 lzn0Var, gw70 gw70Var, ycm ycmVar, myq0 myq0Var, Flowable flowable, l0x0 l0x0Var, d0r d0rVar, o3r o3rVar) {
        this.a = ycmVar;
        this.b = myq0Var;
        this.c = flowable;
        this.d = d0rVar;
        this.e = o3rVar;
        idd1 idd1Var = new idd1(new z6v0(this, (byte) 26));
        idd1 idd1Var2 = new idd1(new l5v0(this, (byte) 3));
        this.f = ton1.o(this, new hox0(this, (byte) 0), lzn0Var, l0x0Var);
        this.g = qpn1.o(this);
        this.h = cpn1.E(this, gw70Var, (idm) idd1Var.getValue(), (hft0) idd1Var2.getValue());
        this.i = o3rVar;
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    @Override // p.wul1
    public final d0r e() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.f;
    }

    @Override // p.wul1
    public final f4r getData() {
        return this.i;
    }
}
