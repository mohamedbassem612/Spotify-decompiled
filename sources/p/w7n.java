package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w7n extends l5t implements t161 {
    public cgg1 Q0;
    public c8e1 R0;
    public r1c0 S0;
    public boolean T0;
    public boolean U0;
    public hyp0 V0;
    public x6e1 W0;
    public x180 X0;
    public lz20 Y0;

    public static void K1(r1c0 r1c0Var, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        c9e1 c9e1Var = r1c0Var.e;
        l7n l7nVar = r1c0Var.v;
        if (c9e1Var == null) {
            int length = str.length();
            l7nVar.invoke(new c8e1(e6p1.e(length, length), 4, str));
        } else {
            c8e1 c8e1VarD = r1c0Var.d.d(p7h.M(new lov[]{new m6t(), new qqh(str, 1)}));
            c9e1Var.a(null, c8e1VarD);
            l7nVar.invoke(c8e1VarD);
        }
    }

    public final void g(e261 e261Var) {
        af5 af5Var = this.R0.a;
        mma0[] mma0VarArr = b261.a;
        d261 d261Var = z161.F;
        mma0[] mma0VarArr2 = b261.a;
        mma0 mma0Var = mma0VarArr2[18];
        d261Var.getClass();
        e261Var.b(d261Var, af5Var);
        b261.q(e261Var, this.Q0.a);
        long j = this.R0.b;
        d261 d261Var2 = z161.H;
        mma0 mma0Var2 = mma0VarArr2[20];
        nbe1 nbe1Var = new nbe1(j);
        d261Var2.getClass();
        e261Var.b(d261Var2, nbe1Var);
        b261.m(e261Var, m9h.U0);
        ej4 ej4VarR = no80.r(this.R0.a);
        if (ej4VarR != null) {
            b261.r(e261Var, ej4VarR);
        }
        boolean z = false;
        b261.h(e261Var, new v7n(this, (byte) 0));
        int i = this.X0.d;
        if (i == 6) {
            fam.a.getClass();
            b261.o(e261Var, s9m.d);
        } else if (i == 7 || i == 8) {
            fam.a.getClass();
            b261.o(e261Var, s9m.c);
        } else if (i == 4) {
            fam.a.getClass();
            b261.o(e261Var, s9m.e);
        }
        if (!this.U0) {
            b261.a(e261Var);
        }
        if (this.U0 && !this.T0) {
            z = true;
        }
        d261 d261Var3 = z161.Q;
        mma0 mma0Var3 = mma0VarArr2[28];
        Boolean boolValueOf = Boolean.valueOf(z);
        d261Var3.getClass();
        e261Var.b(d261Var3, boolValueOf);
        b261.b(e261Var, new v7n(this, (byte) 1));
        if (z) {
            b261.D(e261Var, new v7n(this, (byte) 2));
            b261.e(e261Var, new v7n(this, e261Var));
        }
        e261Var.b(m161.j, new we((String) null, new pea(this, (byte) 1)));
        int i2 = this.X0.e;
        u7n u7nVar = new u7n(this, (byte) 6);
        e261Var.b(z161.J, r180.a(i2));
        e261Var.b(m161.p, new we((String) null, u7nVar));
        b261.g(e261Var, (String) null, new u7n(this, (byte) 7));
        b261.i(e261Var, (String) null, new u7n(this, (byte) 1));
        if (!nbe1.d(this.R0.b)) {
            e261Var.b(m161.q, new we((String) null, new u7n(this, (byte) 2)));
            if (this.U0 && !this.T0) {
                e261Var.b(m161.r, new we((String) null, new u7n(this, (byte) 3)));
            }
        }
        if (!this.U0 || this.T0) {
            return;
        }
        e261Var.b(m161.s, new we((String) null, new u7n(this, (byte) 5)));
    }

    public final boolean q1() {
        return true;
    }
}
