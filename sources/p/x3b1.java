package p;

import android.net.Network;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x3b1 extends u4b1 {
    public final long A;
    public final dqe1 B;
    public final oqe1 C;
    public p2i0 D;
    public Long E;
    public float F;
    public boolean G;
    public volatile long H;
    public final bjh0 y;
    public final rfh0 z;

    public x3b1(bjh0 bjh0Var, rfh0 rfh0Var) {
        super(bjh0Var);
        this.y = bjh0Var;
        this.z = rfh0Var;
        long jW = zoi1.W(bjh0Var.r);
        this.A = jW;
        this.B = new dqe1();
        this.C = new oqe1();
        this.F = 1.0f;
        this.H = jW;
    }

    @Override // p.u4b1
    public final void d(dbu0 dbu0Var) {
        super.d(dbu0Var);
        l();
    }

    @Override // p.u4b1
    public final void e(dbu0 dbu0Var) {
        super.e(dbu0Var);
        l();
    }

    @Override // p.u4b1
    public final void f(dbu0 dbu0Var) {
        super.f(dbu0Var);
        l();
    }

    @Override // p.u4b1
    public final void g(x1e0 x1e0Var, qnf1 qnf1Var, qp00[] qp00VarArr) {
        p2i0 p2i0Var = this.D;
        if (p2i0Var == null || p2i0Var.equals(x1e0Var.c)) {
            this.z.c();
        }
        super.g(x1e0Var, qnf1Var, qp00VarArr);
    }

    @Override // p.u4b1
    public final boolean i(x1e0 x1e0Var) {
        p2i0 p2i0Var;
        boolean z = x1e0Var.d >= 0 && ((p2i0Var = this.D) == null || p2i0Var.equals(x1e0Var.c));
        if (z) {
            m(x1e0Var);
        }
        boolean zI = super.i(x1e0Var);
        if (!this.G && !z) {
            return zI;
        }
        rfh0 rfh0Var = this.z;
        synchronized (rfh0Var) {
            if (rfh0Var.g == zI) {
                return zI;
            }
            rfh0Var.g = zI;
            rfh0Var.c();
            rfh0Var.d.clear();
            return zI;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0072 A[Catch: all -> 0x00dc, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x001b, B:9:0x002f, B:14:0x0042, B:18:0x0050, B:19:0x005a, B:29:0x0072, B:49:0x009d, B:52:0x00be, B:56:0x00ca, B:45:0x0097, B:63:0x00e1, B:20:0x005b, B:22:0x0061, B:31:0x0075, B:36:0x0086, B:38:0x008a), top: B:109:0x001b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #1 {, blocks: (B:20:0x005b, B:22:0x0061, B:31:0x0075, B:36:0x0086, B:38:0x008a), top: B:110:0x005b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:94:0x015a  */
    public final boolean j(x1e0 x1e0Var) {
        boolean z;
        long j;
        long j2;
        Long lValueOf;
        boolean z2;
        Long lValueOf2;
        boolean z3;
        int i;
        boolean z4;
        sw60 sw60Var;
        e7o0 e7o0Var;
        boolean zJ = super.j(x1e0Var);
        m(x1e0Var);
        if (this.G) {
            return zJ;
        }
        long J = zoi1.J(x1e0Var.f, x1e0Var.e);
        rfh0 rfh0Var = this.z;
        synchronized (rfh0Var) {
            long jLongValue = ((Number) rfh0Var.b.invoke()).longValue();
            Double dC = rfh0Var.e.c(J, jLongValue);
            if (dC != null) {
                double dDoubleValue = dC.doubleValue();
                pfh0 pfh0Var = rfh0Var.f;
                if (pfh0Var == null) {
                    z = zJ;
                    j = J;
                    lValueOf = null;
                    j2 = 0;
                } else {
                    j2 = 0;
                    long j3 = jLongValue - pfh0Var.d;
                    if (0 > j3 || j3 >= 201) {
                        z = zJ;
                        j = J;
                    } else {
                        d18 d18Var = rfh0Var.a;
                        String str = pfh0Var.a;
                        long j4 = pfh0Var.e;
                        long j5 = rfh0Var.c;
                        synchronized (d18Var) {
                            if (((Network) d18Var.c) != null) {
                                z = zJ;
                                j = J;
                                z4 = d18Var.a == j4;
                                if (z4) {
                                    sw60Var = (sw60) ((LinkedHashMap) d18Var.b).get(str);
                                    if (sw60Var != null || j5 <= 0 || (e7o0Var = sw60Var.b) == null) {
                                        e7o0Var = null;
                                    } else {
                                        long j6 = jLongValue - e7o0Var.c;
                                        if (0 > j6 || j6 > j5) {
                                            e7o0Var = null;
                                        }
                                    }
                                } else {
                                    e7o0Var = null;
                                }
                            } else {
                                z = zJ;
                                j = J;
                            }
                            if (z4) {
                                e7o0Var = null;
                            } else {
                                sw60Var = (sw60) ((LinkedHashMap) d18Var.b).get(str);
                                if (sw60Var != null) {
                                    e7o0Var = null;
                                } else {
                                    e7o0Var = null;
                                }
                            }
                        }
                        if (e7o0Var != null) {
                            double d = pfh0Var.b;
                            long j7 = pfh0Var.c;
                            double dMin = Math.min(1.0d, e7o0Var.a / d) * dDoubleValue;
                            double dMax = Math.max(e7o0Var.b, j7) * 2.0d;
                            double d2 = 1.0d - dMin;
                            double d3 = 0.0d;
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            double d4 = 5000.0d - dMax;
                            if (d4 >= 0.0d) {
                                d3 = d4;
                            }
                            lValueOf = Long.valueOf(jch0.a0(((d2 * d3) + dMax) * 1000.0d));
                        }
                    }
                }
            } else {
                z = zJ;
                j = J;
                j2 = 0;
            }
            lValueOf = null;
        }
        if (lValueOf == null) {
            z2 = false;
            lValueOf2 = null;
        } else {
            if (this.A <= j2) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                long jLongValue2 = lValueOf.longValue();
                bjh0 bjh0Var = this.y;
                if (!bjh0Var.s || x1e0Var.d >= zoi1.W(bjh0Var.f)) {
                    boolean z5 = this.w;
                    boolean z6 = bjh0Var.q;
                    if (z5) {
                        i = z6 ? bjh0Var.d : bjh0Var.g;
                    } else {
                        i = z6 ? bjh0Var.c : 900000;
                    }
                } else {
                    i = bjh0Var.e;
                }
                z2 = false;
                long jMin = Math.min(zoi1.W(yoi1.p(bjh0Var.f3p, 0, 2500)), zoi1.J(x1e0Var.f, zoi1.W(i)));
                lValueOf2 = Long.valueOf(yoi1.r(jLongValue2, 0L, jMin < j2 ? j2 : jMin));
            } else {
                z2 = false;
                lValueOf2 = null;
            }
        }
        if (lValueOf2 == null) {
            z3 = z;
        } else {
            z3 = j >= lValueOf2.longValue() ? true : z2;
        }
        if (z3) {
            this.H = lValueOf2 != null ? lValueOf2.longValue() : this.A;
            this.G = true;
            this.z.c();
        }
        return z3;
    }

    public final void l() {
        this.z.c();
        this.D = null;
        this.E = null;
        this.F = 1.0f;
        this.G = false;
        this.H = this.A;
    }

    public final void m(x1e0 x1e0Var) {
        p2i0 p2i0Var;
        Long l;
        if (this.G) {
            return;
        }
        boolean z = x1e0Var.g;
        float f = x1e0Var.f;
        long j = x1e0Var.d;
        sqe1 sqe1Var = x1e0Var.b;
        p2i0 p2i0Var2 = x1e0Var.c;
        rfh0 rfh0Var = this.z;
        if (!z && x1e0Var.h == -9223372036854775807L) {
            Object obj = p2i0Var2.a;
            dqe1 dqe1Var = this.B;
            sqe1Var.g(obj, dqe1Var);
            if (!sqe1Var.n(dqe1Var.c, this.C, 0L).c() && (((p2i0Var = this.D) == null || p2i0Var.equals(p2i0Var2)) && ((l = this.E) == null || l.longValue() == j))) {
                this.D = p2i0Var2;
                this.E = Long.valueOf(j);
                if (this.F == f) {
                    return;
                }
                rfh0Var.c();
                this.F = f;
                return;
            }
        }
        this.G = true;
        rfh0Var.c();
    }
}
