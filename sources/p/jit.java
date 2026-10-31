package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jit extends q9r implements ait, kfg {
    public final xht N0;
    public qx81 O0;
    public qx81 P0;
    public List Q0;
    public qx81 R0;
    public final zjn0 X;
    public final l141 Y;
    public final y3j1 Z;
    public final s1c1 f;
    public final lht g;
    public List h;
    public final ja i;
    public final tgy0 t;

    public jit(s1c1 s1c1Var, n9r n9rVar, fg5 fg5Var, ajn0 ajn0Var, lht lhtVar, tgy0 tgy0Var, zjn0 zjn0Var, l141 l141Var, y3j1 y3j1Var, xht xhtVar) {
        super(n9rVar, fg5Var, ajn0Var, mka1.m0);
        this.f = s1c1Var;
        this.g = lhtVar;
        this.i = new ja(this);
        this.t = tgy0Var;
        this.X = zjn0Var;
        this.Y = l141Var;
        this.Z = y3j1Var;
        this.N0 = xhtVar;
    }

    @Override // p.ait
    public final l141 C() {
        return this.Y;
    }

    @Override // p.ait
    public final zjn0 G() {
        return this.X;
    }

    @Override // p.ait
    public final xht H() {
        return this.N0;
    }

    @Override // p.zji0
    public final boolean S() {
        return false;
    }

    @Override // p.ait
    public final t8 X() {
        return this.t;
    }

    @Override // p.zji0
    public final boolean Z() {
        return false;
    }

    @Override // p.apc1
    public final p9r d(l1h1 l1h1Var) {
        if (l1h1Var.a.e()) {
            return this;
        }
        jit jitVar = new jit(this.f, k(), getAnnotations(), getName(), this.g, this.t, this.X, this.Y, this.Z, this.N0);
        jitVar.z1(n(), jzn1.p(l1h1Var.f(1, y1())), jzn1.p(l1h1Var.f(1, x1())));
        return jitVar;
    }

    @Override // p.jfg
    public final h0h1 g() {
        return this.i;
    }

    @Override // p.zji0, p.s9r
    public final lht getVisibility() {
        return this.g;
    }

    @Override // p.zji0
    public final boolean isExternal() {
        return false;
    }

    @Override // p.kfg
    public final boolean j() {
        return o1h1.c(y1(), new p5(this, (byte) 4), null);
    }

    @Override // p.jfg
    public final qx81 m() {
        qx81 qx81Var = this.R0;
        if (qx81Var != null) {
            return qx81Var;
        }
        u890.C("defaultTypeImpl");
        throw null;
    }

    @Override // p.kfg
    public final List n() {
        List list = this.h;
        if (list != null) {
            return list;
        }
        u890.C("declaredTypeParametersImpl");
        throw null;
    }

    @Override // p.n9r
    public final Object r(r9r r9rVar, Object obj) {
        return r9rVar.u(this, obj);
    }

    @Override // p.o9r
    public final String toString() {
        return "typealias " + getName().b();
    }

    public final qx81 x1() {
        qx81 qx81Var = this.P0;
        if (qx81Var != null) {
            return qx81Var;
        }
        u890.C("expandedType");
        throw null;
    }

    public final qx81 y1() {
        qx81 qx81Var = this.O0;
        if (qx81Var != null) {
            return qx81Var;
        }
        u890.C("underlyingType");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    public final void z1(List list, qx81 qx81Var, qx81 qx81Var2) {
        beg begVar;
        zpi0 zpi0VarR;
        qx81 qx81VarK0;
        this.h = list;
        this.O0 = qx81Var;
        this.P0 = qx81Var2;
        this.Q0 = bzn1.m(this);
        if (d4o1.i(x1())) {
            begVar = null;
        } else {
            jfg jfgVarS = x1().t0().s();
            if (jfgVarS instanceof beg) {
                begVar = (beg) jfgVarS;
            } else {
                begVar = null;
            }
        }
        if (begVar == null || (zpi0VarR = begVar.R()) == null) {
            zpi0VarR = ypi0.b;
        }
        zpi0 zpi0Var = zpi0VarR;
        j141 j141Var = new j141(this);
        wjz wjzVar = o1h1.a;
        if (bkz.e(this)) {
            qx81VarK0 = bkz.b(zjz.X, toString());
        } else {
            h0h1 h0h1VarG = g();
            if (h0h1VarG == null) {
                o1h1.a(12);
                throw null;
            }
            List listD = o1h1.d(((ja) h0h1VarG).getParameters());
            e0h1.b.getClass();
            qx81VarK0 = y3o1.k0(e0h1.c, h0h1VarG, listD, false, zpi0Var, j141Var);
        }
        this.R0 = qx81VarK0;
    }

    @Override // p.q9r, p.o9r, p.n9r, p.jfg
    /* JADX INFO: renamed from: a */
    public final n9r w1() {
        return this;
    }

    @Override // p.q9r, p.o9r, p.n9r, p.jfg
    /* JADX INFO: renamed from: a */
    public final jfg w1() {
        return this;
    }

    @Override // p.q9r
    public final p9r w1() {
        return this;
    }
}
