package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hrd1 implements id5 {
    public final fui1 a;
    public final tzg1 b;
    public Object c;
    public Object d;
    public oe5 e;
    public oe5 f;
    public final oe5 g;
    public long h;
    public oe5 i;

    public hrd1(fe5 fe5Var, tzg1 tzg1Var, Object obj, Object obj2, oe5 oe5Var) {
        this.a = fe5Var.a(tzg1Var);
        this.b = tzg1Var;
        this.c = obj2;
        this.d = obj;
        this.e = (oe5) tzg1Var.a.invoke(obj);
        iu30 iu30Var = tzg1Var.a;
        this.f = (oe5) iu30Var.invoke(obj2);
        this.g = oe5Var != null ? rrn1.y(oe5Var) : rrn1.A((oe5) iu30Var.invoke(obj));
        this.h = -1L;
    }

    public final void a(Object obj) {
        if (u890.j(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (oe5) this.b.a.invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    @Override // p.id5
    public final boolean b() {
        return this.a.b();
    }

    @Override // p.id5
    public final oe5 c(long j) {
        if (!d(j)) {
            return this.a.g(j, this.e, this.f, this.g);
        }
        oe5 oe5Var = this.i;
        if (oe5Var != null) {
            return oe5Var;
        }
        oe5 oe5VarM = this.a.m(this.e, this.f, this.g);
        this.i = oe5VarM;
        return oe5VarM;
    }

    @Override // p.id5
    public final long e() {
        long j = this.h;
        if (j >= 0) {
            return j;
        }
        long jE = this.a.e(this.e, this.f, this.g);
        this.h = jE;
        return jE;
    }

    @Override // p.id5
    public final tzg1 f() {
        return this.b;
    }

    @Override // p.id5
    public final Object g(long j) {
        if (d(j)) {
            return this.c;
        }
        oe5 oe5VarN = this.a.n(j, this.e, this.f, this.g);
        int iB = oe5VarN.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(oe5VarN.a(i))) {
                dmv0.b("AnimationVector cannot contain a NaN. " + oe5VarN + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.invoke(oe5VarN);
    }

    @Override // p.id5
    public final Object h() {
        return this.c;
    }

    public final void i(Object obj) {
        if (u890.j(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (oe5) this.b.a.invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + ern1.q(this) + " ms,animationSpec: " + this.a;
    }
}
