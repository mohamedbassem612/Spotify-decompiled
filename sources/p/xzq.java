package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xzq implements tyq, tmh0 {
    public final tyq a;
    public final iu30 b;

    public xzq(tyq tyqVar, iu30 iu30Var) {
        this.a = tyqVar;
        this.b = iu30Var;
    }

    public final rqw a() {
        return y9g1.r(this.a.a(), this.b);
    }

    public final String b() {
        return this.a.b();
    }

    public final jsw c() {
        return this.a.c();
    }

    @Override // p.wul1
    public final d0r e() {
        return this.a.e();
    }

    @Override // p.tmh0
    public final ruh0 f() {
        ruh0 ruh0VarF;
        tyq tyqVar = this.a;
        tmh0 tmh0Var = tyqVar instanceof tmh0 ? (tmh0) tyqVar : null;
        return (tmh0Var == null || (ruh0VarF = tmh0Var.f()) == null) ? new e7x() : new sey0(ruh0VarF, this.b, (byte) 1);
    }

    public final mqw getBehavior() {
        return y9g1.q(this.a.getBehavior(), this.b);
    }

    @Override // p.wul1
    public final f4r getData() {
        return new h4r(this.a.getData(), this.b);
    }
}
