package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y7e1 {
    public final esa1 a;
    public h4e1 b;
    public final hrr0 c;
    public final hrr0 d;
    public final hrr0 e;
    public final hrr0 f;
    public final ltf1 g;
    public final bfn0 h;

    public y7e1(String str, long j, esa1 esa1Var) {
        this.a = esa1Var;
        this.b = new h4e1(new i4e1(str, e6p1.f(str.length(), j), null, null, null, null, null, 124), (xid) null, (i4e1) null, (h4u) null, 14);
        Boolean bool = Boolean.FALSE;
        this.c = xto.t(bool);
        this.d = xto.t(new i4e1(str, j, null, null, null, null, null, 124));
        this.e = xto.t(bool);
        this.f = xto.t(bool);
        this.g = new ltf1(this, (byte) 5);
        this.h = new bfn0(0, new w7e1[16]);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(h4e1 h4e1Var) throws NoWhenBranchMatchedException {
        boolean z = h4e1Var.d().m() > 0;
        boolean z2 = !nbe1.c(h4e1Var.h(), this.b.h());
        boolean zJ = true ^ u890.j(h4e1Var.i(), this.b.i());
        if (z) {
            e(d(), h4e1.q(h4e1Var, 0L, (nbe1) null, 15), h4e1Var.d(), 3);
        }
        i(h4e1Var, z, z2, zJ);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void b(dk80 dk80Var, boolean z, int i) throws NoWhenBranchMatchedException {
        i4e1 i4e1VarD = d();
        if (this.b.c().m() == 0 && nbe1.c(i4e1VarD.e, this.b.h())) {
            if (u890.j(i4e1VarD.f, this.b.f()) && u890.j(i4e1VarD.g, this.b.g()) && u890.j(i4e1VarD.a, this.b.e())) {
                return;
            }
            j(d(), new i4e1(this.b.toString(), this.b.h(), this.b.f(), this.b.g(), c4p1.m(this.b.f(), this.b.e()), null, i4e1VarD.c, 32), z);
            return;
        }
        boolean z2 = false;
        boolean z3 = this.b.c().m() != 0;
        i4e1 i4e1Var = new i4e1(this.b.toString(), this.b.h(), this.b.f(), this.b.g(), c4p1.m(this.b.f(), this.b.e()), null, c4p1.v(this.b), 32);
        if (dk80Var == null) {
            if (z3 && z) {
                z2 = true;
            }
            j(i4e1VarD, i4e1Var, z2);
            e(i4e1VarD, i4e1Var, this.b.c(), i);
            return;
        }
        h4e1 h4e1Var = new h4e1(i4e1Var, this.b.c(), i4e1VarD, (h4u) null, 8);
        dk80Var.i(h4e1Var);
        boolean zO = nhc1.O(h4e1Var.a(), i4e1Var);
        boolean z4 = !zO;
        boolean zC = nbe1.c(h4e1Var.h(), i4e1Var.e);
        boolean z5 = !zC;
        mee1 mee1VarI = h4e1Var.i();
        b8e1 b8e1Var = i4e1Var.c;
        boolean zJ = u890.j(mee1VarI, b8e1Var != null ? b8e1Var.a() : null);
        boolean z6 = !zJ;
        if (zO && zC && zJ) {
            j(i4e1VarD, h4e1.q(h4e1Var, 0L, i4e1Var.f, 13), z);
        } else {
            i(h4e1Var, z4, z5, z6);
        }
        e(i4e1VarD, d(), h4e1Var.d(), i);
    }

    public final void c() {
        this.c.setValue(Boolean.FALSE);
        g(false);
    }

    public final i4e1 d() {
        return (i4e1) this.d.getValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void e(i4e1 i4e1Var, i4e1 i4e1Var2, xid xidVar, int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        esa1 esa1Var = this.a;
        if (iC == 0) {
            d7p1.n(esa1Var, i4e1Var, i4e1Var2, xidVar, true);
            return;
        }
        if (iC == 1) {
            esa1Var.j();
        } else if (iC == 2) {
            d7p1.n(esa1Var, i4e1Var, i4e1Var2, xidVar, false);
        } else {
            eg.o();
        }
    }

    public final void f(boolean z) {
        this.f.setValue(Boolean.valueOf(z));
    }

    public final void g(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    public final h4e1 h() {
        hrr0 hrr0Var = this.c;
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            boolean zBooleanValue = ((Boolean) hrr0Var.getValue()).booleanValue();
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            if (zBooleanValue) {
                tf80.c("TextFieldState does not support concurrent or nested editing.");
            }
            hrr0Var.setValue(Boolean.TRUE);
            return new h4e1(d(), (xid) null, (i4e1) null, (h4u) null, 14);
        } catch (Throwable th) {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            throw th;
        }
    }

    public final void i(h4e1 h4e1Var, boolean z, boolean z2, boolean z3) {
        i4e1 i4e1VarQ = h4e1.q(this.b, 0L, (nbe1) null, 15);
        if (z || z3) {
            this.b = new h4e1(new i4e1(h4e1Var.toString(), h4e1Var.h(), null, null, null, null, c4p1.v(h4e1Var), 60), (xid) null, (i4e1) null, (h4u) null, 14);
        } else if (z2) {
            h4e1 h4e1Var2 = this.b;
            long jH = h4e1Var.h();
            int i = nbe1.c;
            h4e1Var2.p(e6p1.e((int) (jH >> 32), (int) (h4e1Var.h() & 4294967295L)));
        }
        if (z || z2 || !u890.j(i4e1VarQ.f, h4e1Var.f())) {
            this.b.b();
        }
        j(i4e1VarQ, h4e1.q(this.b, 0L, (nbe1) null, 15), true);
    }

    public final void j(i4e1 i4e1Var, i4e1 i4e1Var2, boolean z) {
        this.d.setValue(i4e1Var2);
        bfn0 bfn0Var = this.h;
        Object[] objArr = bfn0Var.a;
        int i = bfn0Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((w7e1) objArr[i2]).a(i4e1Var, i4e1Var2, (!z || nhc1.O(i4e1Var.d, i4e1Var2) || i4e1Var.f == null) ? false : true);
        }
        g(false);
    }

    public final String toString() {
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            return "TextFieldState(selection=" + nbe1.i(d().e) + ", text=\"" + ((Object) d().d) + "\")";
        } finally {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y7e1(String str, int i) {
        str = (i & 1) != 0 ? "" : str;
        this(str, e6p1.d(str.length()));
    }

    public y7e1(String str, long j) {
        this(str, j, new esa1((byte) 23));
    }
}
