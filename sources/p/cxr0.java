package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cxr0 implements xpw {
    public final yxa0 a;
    public final yq00 b;
    public final rey0 c;
    public final ia00 d = n3o1.q(this).a(jgq0.T0, jgq0.U0);
    public final psw e;

    public cxr0(yxa0 yxa0Var, yq00 yq00Var, k2g0 k2g0Var) {
        this.a = yxa0Var;
        this.b = yq00Var;
        this.c = new rey0(new n1r0(k2g0Var, (byte) 8));
        j2i j2iVar = new j2i(-671376797, new t9r0(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final void e(b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1594372887);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long j = cbx.d(x340Var).j.a.b;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = mqo1.t(new mmr0[]{new mmr0("explicit_badge", new gh80(new d6t0(4, j, j), c6j.a))});
                x340Var.s0(objT);
            }
            cqs0 cqs0Var = (cqs0) objT;
            String strN0 = cwl1.n0(2131959619, new Object[]{"placeholder"}, x340Var);
            int iW0 = ihc1.w0(strN0, "placeholder", 0, false, 6);
            String strO0 = cwl1.o0(x340Var, 2131955842);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                ye5 ye5Var = new ye5();
                ye5Var.g(strN0.substring(0, iW0));
                z6p1.r(ye5Var, "explicit_badge", strO0);
                ye5Var.g(strN0.substring(iW0 + 11));
                objT2 = ye5Var.p();
                x340Var.s0(objT2);
            }
            lee1 lee1Var = cbx.d(x340Var).j;
            long j2 = cbx.a(x340Var).b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.d((af5) objT2, j2, uyn1.B(nim0.a, 0.0f, 2.0f, 0.0f, 0.0f, 13), lee1Var, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, cqs0Var, x340Var, 0, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(this, i, (byte) 16);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void f(bxr0 bxr0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1263630587);
        int i2 = i | (x340Var.e(bxr0Var.ordinal()) ? 4 : 2) | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = bxr0Var.ordinal();
            if (iOrdinal == 0) {
                x340Var.i0(-1126748627);
                e(x340Var, (i2 >> 3) & 14);
                x340Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw p3d1.k(x340Var, -1126749001, false);
                }
                x340Var.i0(-569416460);
                yq00 yq00Var = this.b;
                if (yq00Var instanceof xq00) {
                    strK = x0d.k(x340Var, -1126743300, 2131959634, x340Var, false);
                } else {
                    if (!(yq00Var instanceof wq00)) {
                        throw p3d1.k(x340Var, -1126745946, false);
                    }
                    strK = x0d.k(x340Var, -1126739820, 2131959633, x340Var, false);
                }
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).j;
                long j = cbx.a(x340Var).b.b;
                cvx cvxVar = cbx.b(x340Var).b;
                uwo1.e(strK, uyn1.B(nim0.a, 0.0f, 2.0f, 0.0f, 0.0f, 13), lee1Var, j, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jyo0(this, bxr0Var, i, (byte) 24);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void g(bxr0 bxr0Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        int i2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(434405836);
        int i4 = i | (x340Var.e(bxr0Var.ordinal()) ? 4 : 2) | 48;
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            int iOrdinal = bxr0Var.ordinal();
            if (iOrdinal == 0) {
                i2 = 852184293;
                i3 = 2131959620;
            } else {
                if (iOrdinal != 1) {
                    throw p3d1.k(x340Var, 852183321, false);
                }
                i2 = 852186723;
                i3 = 2131959635;
            }
            String strK = x0d.k(x340Var, i2, i3, x340Var, false);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            uwo1.e(strK, uyn1.B(qim0Var3, 0.0f, 0.0f, 12.0f, 0.0f, 11), lee1Var, 0L, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2024);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(this, bxr0Var, qim0Var2, i, (byte) 28);
        }
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
