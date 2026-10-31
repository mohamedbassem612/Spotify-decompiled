package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d57 extends pim0 implements zlb0 {
    public float O0;
    public boolean P0;

    public final long H1(long j, boolean z) {
        int iRound;
        int iH = hjl.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH * this.O0)) <= 0) {
            return 0L;
        }
        if (!z || d7e.u(iRound, j, iH)) {
            return (((long) iRound) << 32) | (((long) iH) & 4294967295L);
        }
        return 0L;
    }

    public final long I1(long j, boolean z) {
        int iRound;
        int i = hjl.i(j);
        if (i == Integer.MAX_VALUE || (iRound = Math.round(i / this.O0)) <= 0) {
            return 0L;
        }
        if (!z || d7e.u(i, j, iRound)) {
            return (((long) i) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long J1(long j, boolean z) {
        int iJ = hjl.j(j);
        int iRound = Math.round(iJ * this.O0);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || d7e.u(iRound, j, iJ)) {
            return (((long) iRound) << 32) | (((long) iJ) & 4294967295L);
        }
        return 0L;
    }

    public final long K1(long j, boolean z) {
        int iK = hjl.k(j);
        int iRound = Math.round(iK / this.O0);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || d7e.u(iK, j, iRound)) {
            return (((long) iK) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // p.zlb0
    public final int P0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.O0) : afh0Var.w(i);
    }

    @Override // p.zlb0
    public final int V0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.O0) : afh0Var.C(i);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        long jH1;
        if (this.P0) {
            jH1 = H1(j, true);
            if (yr80.b(jH1, 0L)) {
                jH1 = I1(j, true);
                if (yr80.b(jH1, 0L)) {
                    jH1 = J1(j, true);
                    if (yr80.b(jH1, 0L)) {
                        jH1 = K1(j, true);
                        if (yr80.b(jH1, 0L)) {
                            jH1 = H1(j, false);
                            if (yr80.b(jH1, 0L)) {
                                jH1 = I1(j, false);
                                if (yr80.b(jH1, 0L)) {
                                    jH1 = J1(j, false);
                                    if (yr80.b(jH1, 0L)) {
                                        jH1 = K1(j, false);
                                        if (yr80.b(jH1, 0L)) {
                                            jH1 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jH1 = I1(j, true);
            if (yr80.b(jH1, 0L)) {
                jH1 = H1(j, true);
                if (yr80.b(jH1, 0L)) {
                    jH1 = K1(j, true);
                    if (yr80.b(jH1, 0L)) {
                        jH1 = J1(j, true);
                        if (yr80.b(jH1, 0L)) {
                            jH1 = I1(j, false);
                            if (yr80.b(jH1, 0L)) {
                                jH1 = H1(j, false);
                                if (yr80.b(jH1, 0L)) {
                                    jH1 = K1(j, false);
                                    if (yr80.b(jH1, 0L)) {
                                        jH1 = J1(j, false);
                                        if (yr80.b(jH1, 0L)) {
                                            jH1 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!yr80.b(jH1, 0L)) {
            int i = (int) (jH1 >> 32);
            int i2 = (int) (4294967295L & jH1);
            if (!((i >= 0) & (i2 >= 0))) {
                sf80.a("width and height must be >= 0");
            }
            j = jjl.h(i, i, i2, i2);
        }
        q5t0 q5t0VarH = afh0Var.H(j);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 2));
    }

    @Override // p.zlb0
    public final int s0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.O0) : afh0Var.n(i);
    }

    @Override // p.zlb0
    public final int x(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.O0) : afh0Var.d(i);
    }
}
