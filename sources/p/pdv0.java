package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pdv0 implements tyq, tmh0 {
    public final ys11 a;
    public final ruh0 b;
    public final odv0 c;

    public pdv0(ys11 ys11Var) {
        this.a = ys11Var;
        e7x e7xVarF = ys11Var.f();
        this.b = e7xVarF == null ? new e7x() : e7xVarF;
        this.c = new odv0(this);
    }

    public final rqw a() {
        return this.a.a();
    }

    public final String b() {
        return this.a.b();
    }

    public final jsw c() {
        return this.c;
    }

    public final d0r e() {
        return this.a.b;
    }

    public final ruh0 f() {
        return this.b;
    }

    public final mqw getBehavior() {
        return this.a.getBehavior();
    }

    public final f4r getData() {
        return this.a.getData();
    }
}
