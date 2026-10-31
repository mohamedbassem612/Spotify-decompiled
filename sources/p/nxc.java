package p;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nxc implements p090 {
    public static final nxc b = new nxc(0);
    public static final nxc c = new nxc(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ nxc(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e1 A[Catch: IOException -> 0x01e8, TryCatch #6 {IOException -> 0x01e8, blocks: (B:115:0x01d8, B:117:0x01e1, B:121:0x01eb, B:130:0x0219, B:132:0x0222, B:133:0x0225, B:134:0x0242, B:139:0x0250, B:145:0x025e, B:146:0x0265, B:148:0x0268, B:151:0x0271, B:157:0x0280, B:159:0x02b5, B:161:0x02c3, B:164:0x02cc, B:171:0x02e1, B:174:0x02ee, B:175:0x0312, B:166:0x02d2, B:158:0x029e), top: B:194:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0222 A[Catch: IOException -> 0x01e8, TryCatch #6 {IOException -> 0x01e8, blocks: (B:115:0x01d8, B:117:0x01e1, B:121:0x01eb, B:130:0x0219, B:132:0x0222, B:133:0x0225, B:134:0x0242, B:139:0x0250, B:145:0x025e, B:146:0x0265, B:148:0x0268, B:151:0x0271, B:157:0x0280, B:159:0x02b5, B:161:0x02c3, B:164:0x02cc, B:171:0x02e1, B:174:0x02ee, B:175:0x0312, B:166:0x02d2, B:158:0x029e), top: B:194:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x024b  */
    /* JADX WARN: Code duplicated, block: B:137:0x024d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0250 A[Catch: IOException -> 0x01e8, TryCatch #6 {IOException -> 0x01e8, blocks: (B:115:0x01d8, B:117:0x01e1, B:121:0x01eb, B:130:0x0219, B:132:0x0222, B:133:0x0225, B:134:0x0242, B:139:0x0250, B:145:0x025e, B:146:0x0265, B:148:0x0268, B:151:0x0271, B:157:0x0280, B:159:0x02b5, B:161:0x02c3, B:164:0x02cc, B:171:0x02e1, B:174:0x02ee, B:175:0x0312, B:166:0x02d2, B:158:0x029e), top: B:194:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0258  */
    /* JADX WARN: Code duplicated, block: B:142:0x025a  */
    /* JADX WARN: Code duplicated, block: B:144:0x025d  */
    /* JADX WARN: Code duplicated, block: B:145:0x025e A[Catch: IOException -> 0x01e8, TryCatch #6 {IOException -> 0x01e8, blocks: (B:115:0x01d8, B:117:0x01e1, B:121:0x01eb, B:130:0x0219, B:132:0x0222, B:133:0x0225, B:134:0x0242, B:139:0x0250, B:145:0x025e, B:146:0x0265, B:148:0x0268, B:151:0x0271, B:157:0x0280, B:159:0x02b5, B:161:0x02c3, B:164:0x02cc, B:171:0x02e1, B:174:0x02ee, B:175:0x0312, B:166:0x02d2, B:158:0x029e), top: B:194:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0268 A[Catch: IOException -> 0x01e8, TryCatch #6 {IOException -> 0x01e8, blocks: (B:115:0x01d8, B:117:0x01e1, B:121:0x01eb, B:130:0x0219, B:132:0x0222, B:133:0x0225, B:134:0x0242, B:139:0x0250, B:145:0x025e, B:146:0x0265, B:148:0x0268, B:151:0x0271, B:157:0x0280, B:159:0x02b5, B:161:0x02c3, B:164:0x02cc, B:171:0x02e1, B:174:0x02ee, B:175:0x0312, B:166:0x02d2, B:158:0x029e), top: B:194:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0270  */
    /* JADX WARN: Code duplicated, block: B:153:0x0277  */
    /* JADX WARN: Code duplicated, block: B:154:0x027a  */
    /* JADX WARN: Code duplicated, block: B:158:0x029e A[Catch: IOException -> 0x01e8, TryCatch #6 {IOException -> 0x01e8, blocks: (B:115:0x01d8, B:117:0x01e1, B:121:0x01eb, B:130:0x0219, B:132:0x0222, B:133:0x0225, B:134:0x0242, B:139:0x0250, B:145:0x025e, B:146:0x0265, B:148:0x0268, B:151:0x0271, B:157:0x0280, B:159:0x02b5, B:161:0x02c3, B:164:0x02cc, B:171:0x02e1, B:174:0x02ee, B:175:0x0312, B:166:0x02d2, B:158:0x029e), top: B:194:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x02c3 A[Catch: IOException -> 0x01e8, TryCatch #6 {IOException -> 0x01e8, blocks: (B:115:0x01d8, B:117:0x01e1, B:121:0x01eb, B:130:0x0219, B:132:0x0222, B:133:0x0225, B:134:0x0242, B:139:0x0250, B:145:0x025e, B:146:0x0265, B:148:0x0268, B:151:0x0271, B:157:0x0280, B:159:0x02b5, B:161:0x02c3, B:164:0x02cc, B:171:0x02e1, B:174:0x02ee, B:175:0x0312, B:166:0x02d2, B:158:0x029e), top: B:194:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d2 A[Catch: IOException -> 0x01e8, TryCatch #6 {IOException -> 0x01e8, blocks: (B:115:0x01d8, B:117:0x01e1, B:121:0x01eb, B:130:0x0219, B:132:0x0222, B:133:0x0225, B:134:0x0242, B:139:0x0250, B:145:0x025e, B:146:0x0265, B:148:0x0268, B:151:0x0271, B:157:0x0280, B:159:0x02b5, B:161:0x02c3, B:164:0x02cc, B:171:0x02e1, B:174:0x02ee, B:175:0x0312, B:166:0x02d2, B:158:0x029e), top: B:194:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x031b A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:194:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [p.xa00] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [p.jf01] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [p.jf01] */
    /* JADX WARN: Type inference failed for: r6v22, types: [p.jf01] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p.v360] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [p.jf01] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // p.p090
    public final ry21 a(uf01 uf01Var) throws IOException {
        zx21 zx21VarE;
        boolean z;
        long j;
        IOException iOException;
        ?? r6;
        boolean z2;
        long j2;
        ry21 ry21VarA;
        int i;
        uz21 uz21Var;
        boolean z3;
        boolean z4;
        boolean z5;
        ry21 ry21VarA2;
        String strC;
        String strC2;
        boolean z6;
        sl00 n170Var;
        boolean z7 = true;
        switch (this.a) {
            case 0:
                i25 i25Var = uf01Var.d;
                i25Var.getClass();
                sl00 sl00Var = (sl00) i25Var.e;
                ?? r14 = (xa00) i25Var.c;
                jf01 jf01Var = (jf01) i25Var.b;
                ln21 ln21Var = uf01Var.e;
                tn21 tn21Var = ln21Var.d;
                ?? r7 = ln21Var.c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z8 = eqr0.J(ln21Var.b) && tn21Var != null;
                boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(r7.c("Connection"));
                try {
                    try {
                        r14.x(jf01Var);
                        sl00Var.b(ln21Var);
                        r14.w(jf01Var, ln21Var);
                        if (z8) {
                            try {
                                if ("100-continue".equalsIgnoreCase(r7.c("Expect"))) {
                                    try {
                                        try {
                                            sl00Var.g();
                                            zx21 zx21VarE2 = i25Var.e(true);
                                            try {
                                                r14.C(jf01Var);
                                                zx21VarE = zx21VarE2;
                                                z = false;
                                            } catch (IOException e) {
                                                e = e;
                                                z = true;
                                                zx21VarE = zx21VarE2;
                                                j = jCurrentTimeMillis;
                                                r7 = jf01Var;
                                                z7 = false;
                                                if (e instanceof ConnectionShutdownException) {
                                                    throw e;
                                                }
                                                throw e;
                                            }
                                        } catch (IOException e2) {
                                            r14.v(jf01Var, e2);
                                            i25Var.g(e2);
                                            throw e2;
                                        }
                                    } catch (IOException e3) {
                                        e = e3;
                                        z = true;
                                        j = jCurrentTimeMillis;
                                        r7 = jf01Var;
                                        z7 = false;
                                        zx21VarE = null;
                                    }
                                } else {
                                    z = true;
                                    zx21VarE = null;
                                }
                                if (zx21VarE == null) {
                                    try {
                                        tn21Var.getClass();
                                        try {
                                            tn21 tn21Var2 = ln21Var.d;
                                            tn21Var2.getClass();
                                            long jA = tn21Var2.a();
                                            r14.u(jf01Var);
                                            try {
                                                j = jCurrentTimeMillis;
                                                z7 = false;
                                                try {
                                                    df01 df01VarF = sj1.f(new pl00(i25Var, sl00Var.d(ln21Var, jA), jA, false));
                                                    tn21Var.d(df01VarF);
                                                    df01VarF.close();
                                                    r7 = jf01Var;
                                                } catch (IOException e4) {
                                                    e = e4;
                                                    r7 = jf01Var;
                                                    if (e instanceof ConnectionShutdownException) {
                                                        throw e;
                                                    }
                                                    throw e;
                                                }
                                            } catch (IOException e5) {
                                                e = e5;
                                                j = jCurrentTimeMillis;
                                                z7 = false;
                                                r7 = jf01Var;
                                                if (e instanceof ConnectionShutdownException) {
                                                    throw e;
                                                }
                                                throw e;
                                            }
                                        } catch (IOException e6) {
                                            e = e6;
                                            j = jCurrentTimeMillis;
                                        }
                                    } catch (IOException e7) {
                                        e = e7;
                                        j = jCurrentTimeMillis;
                                    }
                                } else {
                                    j = jCurrentTimeMillis;
                                    z7 = false;
                                    r7 = jf01Var;
                                    try {
                                        r7.i(i25Var, true, false, false, false, null);
                                        if (!(i25Var.c().j != null)) {
                                            sl00Var.i().b();
                                        }
                                    } catch (IOException e8) {
                                        e = e8;
                                        if (e instanceof ConnectionShutdownException) {
                                            throw e;
                                        }
                                        throw e;
                                    }
                                }
                            } catch (IOException e9) {
                                e = e9;
                                j = jCurrentTimeMillis;
                                r7 = jf01Var;
                                z7 = false;
                                zx21VarE = null;
                                z = true;
                                if ((e instanceof ConnectionShutdownException) || !i25Var.a) {
                                    throw e;
                                }
                                iOException = e;
                                r6 = r7;
                                z2 = z;
                                if (zx21VarE == null) {
                                    try {
                                        zx21VarE = i25Var.e(z7);
                                        zx21VarE.getClass();
                                        if (z2) {
                                            r14.C(r6);
                                            z2 = z7;
                                        }
                                    } catch (IOException e10) {
                                        if (iOException == null) {
                                            throw e10;
                                        }
                                        j2h1.h(iOException, e10);
                                        throw iOException;
                                    }
                                }
                                zx21 zx21Var = zx21VarE;
                                zx21Var.a = ln21Var;
                                zx21Var.e = i25Var.c().f;
                                j2 = j;
                                zx21Var.l = j2;
                                zx21Var.m = System.currentTimeMillis();
                                ry21VarA = zx21Var.a();
                                i = ry21VarA.d;
                                while (true) {
                                    uz21Var = ry21VarA.g;
                                    if (i == 100) {
                                        z3 = zEqualsIgnoreCase;
                                        r14.B(r6, ry21VarA);
                                        if (i == 101) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            if (i25Var.c().j != null) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            if (!z6) {
                                                throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                                            }
                                        }
                                        if (z4) {
                                            strC2 = ry21VarA.f.c("Connection");
                                            if (strC2 == null) {
                                                strC2 = null;
                                            }
                                            if ("upgrade".equalsIgnoreCase(strC2)) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                        } else {
                                            z5 = false;
                                        }
                                        if (z3) {
                                            yf01 yf01VarD = i25Var.d(ry21VarA);
                                            zx21 zx21VarC = ry21VarA.c();
                                            zx21VarC.g = yf01VarD;
                                            zx21VarC.o = new zov0((byte) 12);
                                            ry21VarA2 = zx21VarC.a();
                                        } else {
                                            yf01 yf01VarD2 = i25Var.d(ry21VarA);
                                            zx21 zx21VarC2 = ry21VarA.c();
                                            zx21VarC2.g = yf01VarD2;
                                            zx21VarC2.o = new zov0((byte) 12);
                                            ry21VarA2 = zx21VarC2.a();
                                        }
                                        if ("close".equalsIgnoreCase(ry21VarA2.a.c.c("Connection"))) {
                                            sl00Var.i().b();
                                        } else {
                                            strC = ry21VarA2.f.c("Connection");
                                            if (strC == null) {
                                                strC = null;
                                            }
                                            if ("close".equalsIgnoreCase(strC)) {
                                                sl00Var.i().b();
                                            }
                                        }
                                        if (i == 204) {
                                            throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + ry21VarA2.g.d());
                                        }
                                        throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + ry21VarA2.g.d());
                                        return ry21VarA2;
                                    }
                                    zx21 zx21VarE3 = i25Var.e(false);
                                    zx21VarE3.getClass();
                                    if (z2) {
                                        r14.C(r6);
                                    }
                                    zx21VarE3.a = ln21Var;
                                    zx21VarE3.e = i25Var.c().f;
                                    zx21VarE3.l = j2;
                                    zx21VarE3.m = System.currentTimeMillis();
                                    ry21VarA = zx21VarE3.a();
                                    i = ry21VarA.d;
                                    zEqualsIgnoreCase = zEqualsIgnoreCase;
                                }
                            }
                        } else {
                            j = jCurrentTimeMillis;
                            r7 = jf01Var;
                            z7 = false;
                            r7.i(i25Var, true, false, false, false, null);
                            zx21VarE = null;
                            z = true;
                        }
                        try {
                            sl00Var.a();
                            iOException = null;
                            r6 = r7;
                            while (true) {
                                uz21Var = ry21VarA.g;
                                if (i == 100 || (102 <= i && i < 200)) {
                                    zx21 zx21VarE4 = i25Var.e(false);
                                    zx21VarE4.getClass();
                                    if (z2) {
                                        r14.C(r6);
                                    }
                                    zx21VarE4.a = ln21Var;
                                    zx21VarE4.e = i25Var.c().f;
                                    zx21VarE4.l = j2;
                                    zx21VarE4.m = System.currentTimeMillis();
                                    ry21VarA = zx21VarE4.a();
                                    i = ry21VarA.d;
                                    zEqualsIgnoreCase = zEqualsIgnoreCase;
                                }
                            }
                        } catch (IOException e11) {
                            r14.v(r7, e11);
                            i25Var.g(e11);
                            throw e11;
                        }
                    } catch (IOException e12) {
                        r14.v(jf01Var, e12);
                        i25Var.g(e12);
                        throw e12;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
                z2 = z;
                if (zx21VarE == null) {
                    zx21VarE = i25Var.e(z7);
                    zx21VarE.getClass();
                    if (z2) {
                        r14.C(r6);
                        z2 = z7;
                    }
                }
                zx21 zx21Var2 = zx21VarE;
                zx21Var2.a = ln21Var;
                zx21Var2.e = i25Var.c().f;
                j2 = j;
                zx21Var2.l = j2;
                zx21Var2.m = System.currentTimeMillis();
                ry21VarA = zx21Var2.a();
                i = ry21VarA.d;
                z3 = zEqualsIgnoreCase;
                r14.B(r6, ry21VarA);
                if (i == 101) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    if (i25Var.c().j != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!z6) {
                        throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                    }
                }
                if (z4) {
                    z5 = false;
                } else {
                    strC2 = ry21VarA.f.c("Connection");
                    if (strC2 == null) {
                        strC2 = null;
                    }
                    if ("upgrade".equalsIgnoreCase(strC2)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
                if (z3 || !z5) {
                    yf01 yf01VarD3 = i25Var.d(ry21VarA);
                    zx21 zx21VarC3 = ry21VarA.c();
                    zx21VarC3.g = yf01VarD3;
                    zx21VarC3.o = new zov0((byte) 12);
                    ry21VarA2 = zx21VarC3.a();
                } else {
                    zx21 zx21VarC4 = ry21VarA.c();
                    zx21VarC4.g = new ckh1(uz21Var.e(), uz21Var.d());
                    zx21VarC4.h = i25Var.i();
                    ry21VarA2 = zx21VarC4.a();
                }
                if ("close".equalsIgnoreCase(ry21VarA2.a.c.c("Connection"))) {
                    sl00Var.i().b();
                } else {
                    strC = ry21VarA2.f.c("Connection");
                    if (strC == null) {
                        strC = null;
                    }
                    if ("close".equalsIgnoreCase(strC)) {
                        sl00Var.i().b();
                    }
                }
                if ((i == 204 && i != 205) || ry21VarA2.g.d() <= 0) {
                    return ry21VarA2;
                }
                throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + ry21VarA2.g.d());
            default:
                jf01 jf01Var2 = uf01Var.a;
                synchronized (jf01Var2) {
                    if (!jf01Var2.Q0) {
                        throw new IllegalStateException("released");
                    }
                    if (jf01Var2.N0 || jf01Var2.Z || jf01Var2.P0 || jf01Var2.O0) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                tl00 tl00Var = jf01Var2.i;
                tl00Var.getClass();
                kf01 kf01VarB = tl00Var.b();
                azp0 azp0Var = jf01Var2.a;
                int i2 = uf01Var.g;
                uo5 uo5Var = kf01VarB.h;
                z170 z170Var = kf01VarB.j;
                if (z170Var != null) {
                    n170Var = new a270(azp0Var, kf01VarB, uf01Var, z170Var);
                } else {
                    kf01VarB.e.setSoTimeout(i2);
                    gve1 gve1VarL = ((ff01) uo5Var.c).a.l();
                    long j3 = i2;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    gve1VarL.g(j3, timeUnit);
                    ((df01) uo5Var.d).a.l().g(uf01Var.h, timeUnit);
                    n170Var = new n170(azp0Var, kf01VarB, uo5Var);
                }
                i25 i25Var2 = new i25(jf01Var2, jf01Var2.e, tl00Var, n170Var);
                jf01Var2.Y = i25Var2;
                jf01Var2.S0 = i25Var2;
                synchronized (jf01Var2) {
                    jf01Var2.Z = true;
                    jf01Var2.N0 = true;
                }
                if (!jf01Var2.R0) {
                    return uf01.a(uf01Var, 0, i25Var2, null, 0, 0, 0, 61).b(uf01Var.e);
                }
                k220.i("Canceled");
                return null;
        }
    }
}
