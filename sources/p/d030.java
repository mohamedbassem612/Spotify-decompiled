package p;

import android.os.Trace;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d030 extends pim0 implements j4k, sjp0, sim0, wjh1, x4t {
    public final boolean O0;
    public final vu30 P0;
    public boolean Q0;
    public boolean R0;
    public final int S0;
    public md41 T0;

    public d030(int i, int i2, vu30 vu30Var) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        vu30Var = (i2 & 4) != 0 ? null : vu30Var;
        this.O0 = z;
        this.P0 = vu30Var;
        this.S0 = i;
    }

    public static boolean O1(d030 d030Var) {
        return d030Var.N1(7);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    @Override // p.pim0
    public final void A1() throws NoWhenBranchMatchedException {
        dz20 dz20Var;
        int iOrdinal = L1().ordinal();
        if (iOrdinal == 0) {
            dz20Var = (dz20) ((ha4) oap1.C(this)).getFocusOwner();
            dz20Var.d(8, true, false);
            if (this.O0) {
                dz20Var.a.F();
            }
            dz20Var.d.a();
        } else if (iOrdinal == 1) {
            az20 focusOwner = ((ha4) oap1.C(this)).getFocusOwner();
            d030 d030VarK = dm5.K(this);
            if (d030VarK != null && d030VarK.O0) {
                dz20 dz20Var2 = (dz20) focusOwner;
                dz20Var2.a.F();
                dz20Var2.d.a();
            }
        } else if (iOrdinal == 2) {
            dz20Var = (dz20) ((ha4) oap1.C(this)).getFocusOwner();
            dz20Var.d(8, true, false);
            if (this.O0) {
                dz20Var.a.F();
            }
            dz20Var.d.a();
        } else if (iOrdinal != 3) {
            eg.o();
            return;
        }
        md41 md41Var = this.T0;
        if (md41Var != null) {
            md41Var.unregister();
        }
        this.T0 = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.pim0
    public final void B1() throws NoWhenBranchMatchedException {
        if (L1().b()) {
            ((dz20) ((ha4) oap1.C(this)).getFocusOwner()).d(8, true, true);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean H1(int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(m6p1.x(i, this));
        if (iC == 0) {
            return m6p1.y(this);
        }
        if (iC == 1) {
            return false;
        }
        if (iC == 2) {
            return true;
        }
        if (iC == 3) {
            return false;
        }
        eg.o();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void I1(wz20 wz20Var, wz20 wz20Var2) {
        jdo0 jdo0Var;
        vu30 vu30Var;
        dz20 dz20Var = (dz20) ((ha4) oap1.C(this)).getFocusOwner();
        d030 d030VarH = dz20Var.h();
        if (!wz20Var.equals(wz20Var2) && (vu30Var = this.P0) != null) {
            vu30Var.invoke(wz20Var, wz20Var2);
        }
        pim0 pim0Var = this.a;
        if (!pim0Var.N0) {
            qf80.c("visitAncestors called on an unattached node");
        }
        pim0 pim0Var2 = this.a;
        hmb0 hmb0VarB = oap1.B(this);
        while (hmb0VarB != null) {
            if ((((pim0) hmb0VarB.e1.g).d & 5120) != 0) {
                while (pim0Var2 != null) {
                    int i = pim0Var2.c;
                    if ((i & 5120) != 0) {
                        if (pim0Var2 != pim0Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? E = pim0Var2;
                            ?? bfn0Var = 0;
                            while (E != 0) {
                                if (E instanceof ay20) {
                                    ay20 ay20Var = (ay20) E;
                                    if (d030VarH == dz20Var.h()) {
                                        ay20Var.e0(wz20Var2);
                                    }
                                } else if ((E.c & 4096) != 0 && (E instanceof l5t)) {
                                    pim0 pim0Var3 = ((l5t) E).P0;
                                    int i2 = 0;
                                    E = E;
                                    bfn0Var = bfn0Var;
                                    while (pim0Var3 != null) {
                                        if ((pim0Var3.c & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bfn0Var = bfn0Var;
                                                E = pim0Var3;
                                            } else {
                                                if (bfn0Var == 0) {
                                                    bfn0Var = new bfn0(0, new pim0[16]);
                                                }
                                                if (E != 0) {
                                                    bfn0Var.b(E);
                                                    E = 0;
                                                }
                                                bfn0Var.b(pim0Var3);
                                            }
                                        }
                                        pim0Var3 = pim0Var3.f;
                                        E = E;
                                        bfn0Var = bfn0Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = oap1.e((bfn0) bfn0Var);
                            }
                        }
                    }
                    pim0Var2 = pim0Var2.e;
                }
            }
            hmb0VarB = hmb0VarB.v();
            pim0Var2 = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final gz20 J1() {
        jdo0 jdo0Var;
        ez20 gz20Var = new gz20();
        gz20Var.c(o6p1.n(this.S0, this));
        pim0 pim0Var = this.a;
        if (!pim0Var.N0) {
            qf80.c("visitAncestors called on an unattached node");
        }
        pim0 pim0Var2 = this.a;
        hmb0 hmb0VarB = oap1.B(this);
        loop0: while (hmb0VarB != null) {
            if ((((pim0) hmb0VarB.e1.g).d & 3072) != 0) {
                while (pim0Var2 != null) {
                    int i = pim0Var2.c;
                    if ((i & 3072) != 0) {
                        if (pim0Var2 != pim0Var && (i & 1024) != 0) {
                            break loop0;
                        }
                        if ((i & 2048) != 0) {
                            ?? E = pim0Var2;
                            ?? bfn0Var = 0;
                            while (E != 0) {
                                if (E instanceof iz20) {
                                    ((iz20) E).T0(gz20Var);
                                } else if ((E.c & 2048) != 0 && (E instanceof l5t)) {
                                    pim0 pim0Var3 = ((l5t) E).P0;
                                    int i2 = 0;
                                    E = E;
                                    bfn0Var = bfn0Var;
                                    while (pim0Var3 != null) {
                                        if ((pim0Var3.c & 2048) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bfn0Var = bfn0Var;
                                                E = pim0Var3;
                                            } else {
                                                if (bfn0Var == 0) {
                                                    bfn0Var = new bfn0(0, new pim0[16]);
                                                }
                                                if (E != 0) {
                                                    bfn0Var.b(E);
                                                    E = 0;
                                                }
                                                bfn0Var.b(pim0Var3);
                                            }
                                        }
                                        pim0Var3 = pim0Var3.f;
                                        E = E;
                                        bfn0Var = bfn0Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = oap1.e((bfn0) bfn0Var);
                            }
                        }
                    }
                    pim0Var2 = pim0Var2.e;
                }
            }
            hmb0VarB = hmb0VarB.v();
            pim0Var2 = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
        }
        return gz20Var;
    }

    public final n511 K1(elb0 elb0Var) {
        n511 n511VarH = J1().h();
        if (n511VarH != fj10.c) {
            return elb0Var == null ? n511VarH : n511VarH.n(elb0Var.q(oap1.z(this), 0L, (6 & 4) != 0));
        }
        return elb0Var != null ? elb0Var.M(oap1.z(this), false) : anm1.g(0L, o0c.R(oap1.z(this).c));
    }

    public final wz20 L1() {
        d030 d030VarH;
        jdo0 jdo0Var;
        if (this.N0 && (d030VarH = ((dz20) ((ha4) oap1.C(this)).getFocusOwner()).h()) != null) {
            if (this == d030VarH) {
                return wz20.a;
            }
            if (d030VarH.N0) {
                if (!d030VarH.a.N0) {
                    qf80.c("visitAncestors called on an unattached node");
                }
                pim0 pim0Var = d030VarH.a.e;
                hmb0 hmb0VarB = oap1.B(d030VarH);
                while (hmb0VarB != null) {
                    if ((((pim0) hmb0VarB.e1.g).d & 1024) != 0) {
                        while (pim0Var != null) {
                            if ((pim0Var.c & 1024) != 0) {
                                pim0 pim0VarE = pim0Var;
                                bfn0 bfn0Var = null;
                                while (pim0VarE != null) {
                                    if (pim0VarE instanceof d030) {
                                        if (this == ((d030) pim0VarE)) {
                                            return wz20.b;
                                        }
                                    } else if ((pim0VarE.c & 1024) != 0 && (pim0VarE instanceof l5t)) {
                                        int i = 0;
                                        for (pim0 pim0Var2 = ((l5t) pim0VarE).P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
                                            if ((pim0Var2.c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    pim0VarE = pim0Var2;
                                                } else {
                                                    if (bfn0Var == null) {
                                                        bfn0Var = new bfn0(0, new pim0[16]);
                                                    }
                                                    if (pim0VarE != null) {
                                                        bfn0Var.b(pim0VarE);
                                                        pim0VarE = null;
                                                    }
                                                    bfn0Var.b(pim0Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    pim0VarE = oap1.e(bfn0Var);
                                }
                            }
                            pim0Var = pim0Var.e;
                        }
                    }
                    hmb0VarB = hmb0VarB.v();
                    pim0Var = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
                }
            }
        }
        return wz20.c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void M1() throws NoWhenBranchMatchedException {
        int iOrdinal = L1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                eg.o();
                return;
            }
        }
        p811 p811Var = new p811();
        p9p1.z(this, new og(p811Var, this, (byte) 23));
        Object obj = p811Var.a;
        if (obj == null) {
            u890.C("focusProperties");
            throw null;
        }
        if (((ez20) obj).e()) {
            return;
        }
        ((dz20) ((ha4) oap1.C(this)).getFocusOwner()).b(true);
    }

    public final boolean N1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return J1().e() ? H1(i) : irn1.V(this, i, new p94(i, (byte) 5));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.sjp0
    public final void f0() throws NoWhenBranchMatchedException {
        M1();
    }

    @Override // p.pim0
    public final boolean w1() {
        return false;
    }

    public final void u1() {
    }

    @Override // p.pim0
    public final void z1() {
    }
}
