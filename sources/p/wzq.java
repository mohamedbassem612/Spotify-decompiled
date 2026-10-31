package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wzq implements syq, tmh0 {
    public final syq a;
    public final iu30 b;

    public wzq(syq syqVar, iu30 iu30Var) {
        this.a = syqVar;
        this.b = iu30Var;
    }

    public final rqw a() {
        return y9g1.r(this.a.a(), this.b);
    }

    public final String b() {
        return this.a.b();
    }

    public final rsw c() {
        return this.a.c();
    }

    @Override // p.wul1
    public final d0r e() {
        return this.a.e();
    }

    @Override // p.tmh0
    public final ruh0 f() {
        ruh0 ruh0VarF;
        syq syqVar = this.a;
        tmh0 tmh0Var = syqVar instanceof tmh0 ? (tmh0) syqVar : null;
        return (tmh0Var == null || (ruh0VarF = tmh0Var.f()) == null) ? new e7x() : new sey0(ruh0VarF, this.b, (byte) 0);
    }

    public final mqw getBehavior() {
        return y9g1.q(this.a.getBehavior(), this.b);
    }

    @Override // p.wul1
    public final f4r getData() {
        return new i4r(this.a.getData(), this.b);
    }
}
