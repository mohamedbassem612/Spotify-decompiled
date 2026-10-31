package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ywr0 implements xpw {
    public final rey0 a;
    public final ia00 b = n3o1.q(this).a(jgq0.R0, jgq0.S0);
    public final psw c;

    public ywr0(yxa0 yxa0Var, k2g0 k2g0Var) {
        this.a = new rey0(new n1r0(k2g0Var, (byte) 7));
        j2i j2iVar = new j2i(-2083202597, new t20(this, yxa0Var, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.b;
    }

    public final jsw c() {
        return this.c;
    }

    public final void e(xwr0 xwr0Var, b0k b0kVar, int i) {
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(726778995);
        int i2 = (x340Var.e(xwr0Var.ordinal()) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            int iOrdinal = xwr0Var.ordinal();
            if (iOrdinal == 0) {
                strK = x0d.k(x340Var, -1645052221, 2131957048, x340Var, false);
            } else {
                if (iOrdinal != 1) {
                    throw p3d1.k(x340Var, -1645053170, false);
                }
                strK = x0d.k(x340Var, -1645049055, 2131957053, x340Var, false);
            }
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            long j = ((vex) zex.a.e).m;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strK, uyn1.B(nim0.a, 0.0f, 12.0f, 0.0f, 0.0f, 13), lee1Var, j, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jyo0(this, xwr0Var, i, (byte) 23);
        }
    }

    public final void f(xwr0 xwr0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1310973380);
        int i4 = i | (x340Var.e(xwr0Var.ordinal()) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            int iOrdinal = xwr0Var.ordinal();
            if (iOrdinal == 0) {
                i2 = 1420004082;
                i3 = 2131957049;
            } else {
                if (iOrdinal != 1) {
                    throw p3d1.k(x340Var, 1420003131, false);
                }
                i2 = 1420007184;
                i3 = 2131957054;
            }
            String strK = x0d.k(x340Var, i2, i3, x340Var, false);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strK, uyn1.B(qim0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), lee1Var, 0L, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2024);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(this, xwr0Var, qim0Var, i, (byte) 27);
        }
    }

    public final mqw getBehavior() {
        return this.a;
    }
}
