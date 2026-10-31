package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ggg1 {
    public final y7e1 a;
    public dk80 b;
    public final p5x0 c;
    public final uwg d;
    public final mdt e;
    public final mdt f;
    public final hrr0 g;

    public ggg1(y7e1 y7e1Var, dk80 dk80Var, p5x0 p5x0Var, uwg uwgVar) {
        this.a = y7e1Var;
        this.b = dk80Var;
        this.c = p5x0Var;
        this.d = uwgVar;
        this.e = uwgVar != null ? yv91.a(new qga0((Object) this, (Object) uwgVar, (byte) 23)) : null;
        this.f = p5x0Var != null ? yv91.a(new qga0((Object) this, (Object) p5x0Var, (byte) 24)) : null;
        this.g = v8r.q(new y061(1, 1));
    }

    public static void m(ggg1 ggg1Var, CharSequence charSequence, boolean z, boolean z2, int i) {
        boolean z3 = (i & 2) == 0;
        int i2 = (i & 4) != 0 ? 1 : 3;
        boolean z4 = (i & 8) != 0 ? true : z;
        boolean z5 = (i & 16) != 0 ? false : z2;
        y7e1 y7e1Var = ggg1Var.a;
        dk80 dk80Var = ggg1Var.b;
        y7e1Var.b.c().h();
        h4e1 h4e1Var = y7e1Var.b;
        if (z3) {
            h4e1Var.o(null);
        }
        long j = h4e1Var.g;
        h4e1.l(h4e1Var, nbe1.g(j), nbe1.f(j), charSequence, 0, 0, z5, 24);
        int length = charSequence.length() + nbe1.g(j);
        u2p1.v(h4e1Var, length, length);
        ggg1Var.r(h4e1Var);
        y7e1Var.b(dk80Var, z4, i2);
        y7e1Var.g(true);
        y7e1Var.f(y7e1Var.b.e);
    }

    public static void n(ggg1 ggg1Var, String str, long j, boolean z, boolean z2, int i) {
        boolean z3 = (i & 8) != 0 ? true : z;
        boolean z4 = (i & 16) != 0 ? false : z2;
        y7e1 y7e1Var = ggg1Var.a;
        dk80 dk80Var = ggg1Var.b;
        y7e1Var.b.c().h();
        h4e1 h4e1Var = y7e1Var.b;
        long j2 = ggg1Var.j(j);
        h4e1.l(h4e1Var, nbe1.g(j2), nbe1.f(j2), str, 0, 0, z4, 24);
        int length = str.length() + nbe1.g(j2);
        u2p1.v(h4e1Var, length, length);
        ggg1Var.r(h4e1Var);
        y7e1Var.b(dk80Var, z3, 1);
        y7e1Var.g(true);
        y7e1Var.f(y7e1Var.b.e);
    }

    public final void a() {
        dk80 dk80Var = this.b;
        y7e1 y7e1Var = this.a;
        y7e1Var.b.c().h();
        h4e1 h4e1Var = y7e1Var.b;
        int iF = nbe1.f(h4e1Var.g);
        u2p1.v(h4e1Var, iF, iF);
        y7e1Var.b(dk80Var, true, 1);
        y7e1Var.g(true);
        y7e1Var.f(y7e1Var.b.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void b(final l45 l45Var, onm onmVar) {
        fgg1 fgg1Var;
        w7e1 w7e1Var;
        if (onmVar instanceof fgg1) {
            fgg1Var = (fgg1) onmVar;
            int i = fgg1Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                fgg1Var.c = i - os00.INVALID_ID;
            } else {
                fgg1Var = new fgg1(this, onmVar);
            }
        } else {
            fgg1Var = new fgg1(this, onmVar);
        }
        Object obj = fgg1Var.a;
        int i2 = fgg1Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (this.d != null) {
                w7e1Var = l45Var;
                w7e1Var = new w7e1() { // from class: p.dgg1
                    @Override // p.w7e1
                    public final void a(i4e1 i4e1Var, i4e1 i4e1Var2, boolean z) {
                        ggg1 ggg1Var = this;
                        egg1 egg1VarN = j1e1.n(i4e1Var, ggg1Var.d, ggg1Var.f());
                        if (egg1VarN != null) {
                            i4e1Var = egg1VarN.a;
                        }
                        l45Var.a(i4e1Var, ggg1Var.h(), z);
                    }
                };
            }
            w7e1Var = l45Var;
            fgg1Var.c = 1;
            ohd ohdVar = new ohd(1, aym.t(fgg1Var));
            ohdVar.t();
            this.a.h.b(w7e1Var);
            ohdVar.n(new svb0(this, w7e1Var, (byte) 11));
            if (ohdVar.r() == d9n.a) {
                return;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            hm5.M(obj);
        }
        jah.d();
    }

    public final void c(boolean z) {
        dk80 dk80Var = this.b;
        y7e1 y7e1Var = this.a;
        y7e1Var.b.c().h();
        h4e1 h4e1Var = y7e1Var.b;
        h4e1.l(h4e1Var, nbe1.g(h4e1Var.g), nbe1.f(h4e1Var.g), "", 0, 0, z, 24);
        int iG = nbe1.g(h4e1Var.g);
        u2p1.v(h4e1Var, iG, iG);
        r(h4e1Var);
        y7e1Var.b(dk80Var, true, 3);
        y7e1Var.g(true);
        y7e1Var.f(y7e1Var.b.e);
    }

    public final i4e1 e() {
        egg1 egg1Var;
        mdt mdtVar = this.e;
        return (mdtVar == null || (egg1Var = (egg1) mdtVar.getValue()) == null) ? this.a.d() : egg1Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggg1)) {
            return false;
        }
        ggg1 ggg1Var = (ggg1) obj;
        if (u890.j(this.a, ggg1Var.a) && u890.j(this.c, ggg1Var.c)) {
            return u890.j(this.d, ggg1Var.d);
        }
        return false;
    }

    public final y061 f() {
        return (y061) this.g.getValue();
    }

    public final i4e1 g() {
        return this.a.d();
    }

    public final i4e1 h() {
        egg1 egg1Var;
        mdt mdtVar = this.f;
        return (mdtVar == null || (egg1Var = (egg1) mdtVar.getValue()) == null) ? e() : egg1Var.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        p5x0 p5x0Var = this.c;
        int iHashCode2 = (iHashCode + (p5x0Var != null ? p5x0Var.hashCode() : 0)) * 31;
        uwg uwgVar = this.d;
        return iHashCode2 + (uwgVar != null ? uwgVar.hashCode() : 0);
    }

    public final long i(int i) {
        egg1 egg1Var;
        egg1 egg1Var2;
        h4u h4uVar = null;
        mdt mdtVar = this.e;
        h4u h4uVar2 = (mdtVar == null || (egg1Var2 = (egg1) mdtVar.getValue()) == null) ? null : egg1Var2.b;
        mdt mdtVar2 = this.f;
        if (mdtVar2 != null && (egg1Var = (egg1) mdtVar2.getValue()) != null) {
            h4uVar = egg1Var.b;
        }
        long jC = h4uVar != null ? h4uVar.c(i, false) : e6p1.e(i, i);
        return h4uVar2 != null ? j1e1.y(jC, h4uVar2) : jC;
    }

    public final long j(long j) {
        egg1 egg1Var;
        egg1 egg1Var2;
        h4u h4uVar = null;
        mdt mdtVar = this.e;
        h4u h4uVar2 = (mdtVar == null || (egg1Var2 = (egg1) mdtVar.getValue()) == null) ? null : egg1Var2.b;
        mdt mdtVar2 = this.f;
        if (mdtVar2 != null && (egg1Var = (egg1) mdtVar2.getValue()) != null) {
            h4uVar = egg1Var.b;
        }
        if (h4uVar != null) {
            j = j1e1.y(j, h4uVar);
        }
        return h4uVar2 != null ? j1e1.y(j, h4uVar2) : j;
    }

    public final long k(long j) {
        egg1 egg1Var;
        egg1 egg1Var2;
        mdt mdtVar = this.e;
        h4u h4uVar = (mdtVar == null || (egg1Var2 = (egg1) mdtVar.getValue()) == null) ? null : egg1Var2.b;
        mdt mdtVar2 = this.f;
        h4u h4uVar2 = (mdtVar2 == null || (egg1Var = (egg1) mdtVar2.getValue()) == null) ? null : egg1Var.b;
        if (h4uVar != null) {
            j = j1e1.z(j, h4uVar, (y061) null);
        }
        return h4uVar2 != null ? j1e1.z(j, h4uVar2, f()) : j;
    }

    public final void l(CharSequence charSequence) {
        dk80 dk80Var = this.b;
        y7e1 y7e1Var = this.a;
        y7e1Var.b.c().h();
        h4e1 h4e1Var = y7e1Var.b;
        h4e1Var.k(0, h4e1Var.c.length(), "");
        h4e1Var.append(charSequence.toString());
        r(h4e1Var);
        y7e1Var.b(dk80Var, true, 1);
        y7e1Var.g(true);
        y7e1Var.f(y7e1Var.b.e);
    }

    public final void o(long j) {
        p(j(j));
    }

    public final void p(long j) {
        dk80 dk80Var = this.b;
        y7e1 y7e1Var = this.a;
        y7e1Var.b.c().h();
        h4e1 h4e1Var = y7e1Var.b;
        int i = nbe1.c;
        u2p1.v(h4e1Var, (int) (j >> 32), (int) (j & 4294967295L));
        y7e1Var.b(dk80Var, true, 1);
        y7e1Var.g(true);
        y7e1Var.f(y7e1Var.b.e);
    }

    public final void q(y061 y061Var) {
        this.g.setValue(y061Var);
    }

    public final void r(h4e1 h4e1Var) {
        if (((bfn0) h4e1Var.c().b).c <= 0 || !nbe1.d(h4e1Var.g)) {
            return;
        }
        q(new y061(1, 1));
    }

    public final String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.a + ", outputTransformation=" + this.d + ", outputTransformedText=" + this.e + ", codepointTransformation=" + this.c + ", codepointTransformedText=" + this.f + ", outputText=\"" + e() + "\", visualText=\"" + h() + "\")";
    }
}
