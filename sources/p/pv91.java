package p;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class pv91 {
    public static final ef41 a = new ef41(19);
    public static final yt91 b = new yt91();
    public static final Object c = new Object();
    public static nv91 d;
    public static long e;
    public static final le f;
    public static final mgc g;
    public static List h;
    public static List i;
    public static final rv40 j;
    public static final uj7 k;

    static {
        nv91 nv91Var = nv91.e;
        d = nv91Var;
        e = 2L;
        f = new le();
        g = new mgc((byte) 29);
        z6x z6xVar = z6x.a;
        h = z6xVar;
        i = z6xVar;
        long j2 = e;
        e = 1 + j2;
        rv40 rv40Var = new rv40(j2, nv91Var, null, new pv40((byte) 0));
        d = d.f(rv40Var.b);
        j = rv40Var;
        k = new uj7(0);
    }

    public static final nv91 a(nv91 nv91Var, long j2, long j3) {
        while (u890.r(j2, j3) < 0) {
            nv91Var = nv91Var.f(j2);
            j2++;
        }
        return nv91Var;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x009a A[LOOP:1: B:30:0x0058->B:45:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x009d A[EDGE_INSN: B:60:0x009d->B:46:0x009d BREAK  A[LOOP:1: B:30:0x0058->B:45:0x009a], SYNTHETIC] */
    public static final Object b(iu30 iu30Var) {
        oen0 oen0Var;
        Object objS;
        rv40 rv40Var = j;
        synchronized (c) {
            try {
                oen0Var = rv40Var.h;
                if (oen0Var != null) {
                    k.addAndGet(1);
                }
                objS = s(rv40Var, iu30Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (oen0Var != null) {
            try {
                List list = h;
                jj41 jj41VarZ = t4n1.z(oen0Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((vu30) list.get(i2)).invoke(jj41VarZ, rv40Var);
                }
                k.addAndGet(-1);
            } catch (Throwable th2) {
                k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (c) {
            d();
            if (oen0Var != null) {
                Object[] objArr = oen0Var.b;
                long[] jArr = oen0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    ypb1 ypb1Var = (ypb1) objArr[(i3 << 3) + i5];
                                    if (o(ypb1Var)) {
                                        g.d(ypb1Var);
                                    } else {
                                        continue;
                                    }
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                            if (i3 != length) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        return objS;
    }

    public static final void c() {
        b(a);
    }

    public static final void d() {
        mgc mgcVar = g;
        int iC = mgcVar.C();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= iC) {
                break;
            }
            fgl1 fgl1Var = mgcVar.E()[i2];
            Object obj = fgl1Var != null ? fgl1Var.get() : null;
            if (obj != null && o((ypb1) obj)) {
                if (i3 != i2) {
                    mgcVar.E()[i3] = fgl1Var;
                    mgcVar.w()[i3] = mgcVar.w()[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < iC; i4++) {
            mgcVar.E()[i4] = null;
            mgcVar.w()[i4] = 0;
        }
        if (i3 != iC) {
            mgcVar.U(i3);
        }
    }

    public static final jv91 e(jv91 jv91Var, iu30 iu30Var, boolean z) {
        boolean z2 = jv91Var instanceof ten0;
        if (z2 || jv91Var == null) {
            return new cog1(z2 ? (ten0) jv91Var : null, iu30Var, null, false, z);
        }
        return new dog1(jv91Var, iu30Var, false, z);
    }

    public static final cqb1 f(cqb1 cqb1Var) {
        cqb1 cqb1VarQ;
        jv91 jv91VarN = ekb.n();
        cqb1 cqb1VarQ2 = q(cqb1Var, jv91VarN.g(), jv91VarN.d());
        if (cqb1VarQ2 != null) {
            return cqb1VarQ2;
        }
        synchronized (c) {
            jv91 jv91VarN2 = ekb.n();
            cqb1VarQ = q(cqb1Var, jv91VarN2.g(), jv91VarN2.d());
        }
        if (cqb1VarQ != null) {
            return cqb1VarQ;
        }
        p();
        throw null;
    }

    public static final cqb1 g(cqb1 cqb1Var, jv91 jv91Var) {
        cqb1 cqb1VarQ;
        cqb1 cqb1VarQ2 = q(cqb1Var, jv91Var.g(), jv91Var.d());
        if (cqb1VarQ2 != null) {
            return cqb1VarQ2;
        }
        synchronized (c) {
            cqb1VarQ = q(cqb1Var, jv91Var.g(), jv91Var.d());
        }
        if (cqb1VarQ != null) {
            return cqb1VarQ;
        }
        p();
        throw null;
    }

    public static final jv91 h() {
        jv91 jv91Var = (jv91) b.e();
        return jv91Var == null ? j : jv91Var;
    }

    public static final iu30 i(iu30 iu30Var, iu30 iu30Var2, boolean z) {
        if (!z) {
            iu30Var2 = null;
        }
        if (iu30Var == null || iu30Var2 == null || iu30Var == iu30Var2) {
            return iu30Var == null ? iu30Var2 : iu30Var;
        }
        return new ov91(iu30Var, iu30Var2, (byte) 0);
    }

    public static final iu30 j(iu30 iu30Var, iu30 iu30Var2) {
        if (iu30Var == null || iu30Var2 == null || iu30Var == iu30Var2) {
            return iu30Var == null ? iu30Var2 : iu30Var;
        }
        return new ov91(iu30Var, iu30Var2, (byte) 1);
    }

    public static final cqb1 k(cqb1 cqb1Var, ypb1 ypb1Var) {
        long jE = f.e(e) - 1;
        cqb1 cqb1Var2 = null;
        cqb1 cqb1Var3 = null;
        for (cqb1 cqb1VarK = ypb1Var.k(); cqb1VarK != null; cqb1VarK = cqb1VarK.b) {
            long j2 = cqb1VarK.a;
            if (j2 != 0) {
                if (j2 != 0 && u890.r(j2, jE) <= 0 && !nv91.e.d(j2)) {
                    if (cqb1Var3 != null) {
                        if (u890.r(cqb1VarK.a, cqb1Var3.a) >= 0) {
                            cqb1Var2 = cqb1Var3;
                            break;
                        }
                        break;
                    }
                    cqb1Var3 = cqb1VarK;
                }
            }
            cqb1Var2 = cqb1VarK;
            break;
        }
        if (cqb1Var2 != null) {
            cqb1Var2.a = Long.MAX_VALUE;
            return cqb1Var2;
        }
        cqb1 cqb1VarC = cqb1Var.c(Long.MAX_VALUE);
        cqb1VarC.b = ypb1Var.k();
        ypb1Var.l(cqb1VarC);
        return cqb1VarC;
    }

    public static final void l(jv91 jv91Var, ypb1 ypb1Var) {
        jv91Var.t(jv91Var.h() + 1);
        iu30 iu30VarI = jv91Var.i();
        if (iu30VarI != null) {
            iu30VarI.invoke(ypb1Var);
        }
    }

    public static final HashMap m(long j2, ten0 ten0Var, nv91 nv91Var) {
        long[] jArr;
        nv91 nv91Var2;
        long[] jArr2;
        int i2;
        int i3;
        cqb1 cqb1VarQ;
        oen0 oen0VarX = ten0Var.x();
        if (oen0VarX != null) {
            long jG = ten0Var.g();
            nv91 nv91VarE = ten0Var.d().f(jG).e(ten0Var.j);
            Object[] objArr = oen0VarX.b;
            long[] jArr3 = oen0VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                ypb1 ypb1Var = (ypb1) objArr[(i4 << 3) + i7];
                                cqb1 cqb1VarK = ypb1Var.k();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                cqb1 cqb1VarQ2 = q(cqb1VarK, j2, nv91Var);
                                if (cqb1VarQ2 != null && (cqb1VarQ = q(cqb1VarK, jG, nv91VarE)) != null && !cqb1VarQ2.equals(cqb1VarQ)) {
                                    cqb1 cqb1VarQ3 = q(cqb1VarK, jG, ten0Var.d());
                                    if (cqb1VarQ3 == null) {
                                        p();
                                        throw null;
                                    }
                                    cqb1 cqb1VarN = ypb1Var.n(cqb1VarQ, cqb1VarQ2, cqb1VarQ3);
                                    if (cqb1VarN == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(cqb1VarQ2, cqb1VarN);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            nv91VarE = nv91VarE;
                        }
                        jArr = jArr3;
                        nv91Var2 = nv91VarE;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        nv91Var2 = nv91VarE;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    nv91VarE = nv91Var2;
                }
            }
        }
        return null;
    }

    public static final cqb1 n(cqb1 cqb1Var, zpb1 zpb1Var, jv91 jv91Var, cqb1 cqb1Var2) {
        cqb1 cqb1VarK;
        if (jv91Var.f()) {
            jv91Var.n(zpb1Var);
        }
        long jG = jv91Var.g();
        if (cqb1Var2.a == jG) {
            return cqb1Var2;
        }
        synchronized (c) {
            cqb1VarK = k(cqb1Var, zpb1Var);
        }
        cqb1VarK.a = jG;
        jv91Var.n(zpb1Var);
        return cqb1VarK;
    }

    public static final boolean o(ypb1 ypb1Var) {
        cqb1 cqb1Var;
        long jE = f.e(e);
        cqb1 cqb1Var2 = null;
        cqb1 cqb1VarK = null;
        int i2 = 0;
        for (cqb1 cqb1VarK2 = ypb1Var.k(); cqb1VarK2 != null; cqb1VarK2 = cqb1VarK2.b) {
            long j2 = cqb1VarK2.a;
            if (j2 != 0) {
                if (u890.r(j2, jE) >= 0) {
                    i2++;
                } else if (cqb1Var2 == null) {
                    i2++;
                    cqb1Var2 = cqb1VarK2;
                } else {
                    if (u890.r(cqb1VarK2.a, cqb1Var2.a) < 0) {
                        cqb1Var = cqb1Var2;
                        cqb1Var2 = cqb1VarK2;
                    } else {
                        cqb1Var = cqb1VarK2;
                    }
                    if (cqb1VarK == null) {
                        cqb1VarK = ypb1Var.k();
                        cqb1 cqb1Var3 = cqb1VarK;
                        while (true) {
                            if (cqb1VarK == null) {
                                cqb1VarK = cqb1Var3;
                                break;
                            }
                            if (u890.r(cqb1VarK.a, jE) >= 0) {
                                break;
                            }
                            if (u890.r(cqb1Var3.a, cqb1VarK.a) < 0) {
                                cqb1Var3 = cqb1VarK;
                            }
                            cqb1VarK = cqb1VarK.b;
                        }
                    }
                    cqb1Var2.a = 0L;
                    cqb1Var2.a(cqb1VarK);
                    cqb1Var2 = cqb1Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void p() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final cqb1 q(cqb1 cqb1Var, long j2, nv91 nv91Var) {
        cqb1 cqb1Var2 = null;
        while (cqb1Var != null) {
            long j3 = cqb1Var.a;
            if (j3 != 0 && u890.r(j3, j2) <= 0 && !nv91Var.d(j3) && (cqb1Var2 == null || u890.r(cqb1Var2.a, cqb1Var.a) < 0)) {
                cqb1Var2 = cqb1Var;
            }
            cqb1Var = cqb1Var.b;
        }
        if (cqb1Var2 != null) {
            return cqb1Var2;
        }
        return null;
    }

    public static final cqb1 r(cqb1 cqb1Var, ypb1 ypb1Var) {
        cqb1 cqb1VarQ;
        jv91 jv91VarN = ekb.n();
        iu30 iu30VarE = jv91VarN.e();
        if (iu30VarE != null) {
            iu30VarE.invoke(ypb1Var);
        }
        cqb1 cqb1VarQ2 = q(cqb1Var, jv91VarN.g(), jv91VarN.d());
        if (cqb1VarQ2 != null) {
            return cqb1VarQ2;
        }
        synchronized (c) {
            jv91 jv91VarN2 = ekb.n();
            cqb1VarQ = q(ypb1Var.k(), jv91VarN2.g(), jv91VarN2.d());
            if (cqb1VarQ == null) {
                p();
                throw null;
            }
        }
        return cqb1VarQ;
    }

    public static final Object s(rv40 rv40Var, iu30 iu30Var) {
        long j2 = rv40Var.b;
        Object objInvoke = iu30Var.invoke(d.c(j2));
        long j3 = e;
        e = 1 + j3;
        nv91 nv91VarC = d.c(j2);
        d = nv91VarC;
        rv40Var.b = j3;
        rv40Var.a = nv91VarC;
        rv40Var.g = 0;
        rv40Var.h = null;
        rv40Var.o();
        d = d.f(j3);
        return objInvoke;
    }

    public static final void t(jv91 jv91Var) {
        Long lValueOf;
        if (d.d(jv91Var.g())) {
            return;
        }
        long jG = jv91Var.g();
        boolean z = jv91Var.c;
        ten0 ten0Var = jv91Var instanceof ten0 ? (ten0) jv91Var : null;
        Object objValueOf = ten0Var != null ? Boolean.valueOf(ten0Var.m) : "read-only";
        synchronized (c) {
            lValueOf = Long.valueOf(f.e(-1L));
        }
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + jG + ", disposed=" + z + ", applied=" + objValueOf + ", lowestPin=" + lValueOf).toString());
    }

    public static final cqb1 u(cqb1 cqb1Var, ypb1 ypb1Var, jv91 jv91Var) {
        cqb1 cqb1VarQ;
        cqb1 cqb1VarQ2;
        if (jv91Var.f()) {
            jv91Var.n(ypb1Var);
        }
        long jG = jv91Var.g();
        cqb1 cqb1VarQ3 = q(cqb1Var, jG, jv91Var.d());
        if (cqb1VarQ3 == null) {
            synchronized (c) {
                jv91 jv91VarN = ekb.n();
                cqb1VarQ2 = q(ypb1Var.k(), jv91VarN.g(), jv91VarN.d());
                if (cqb1VarQ2 == null) {
                    p();
                    throw null;
                }
            }
            cqb1VarQ3 = cqb1VarQ2;
        }
        if (cqb1VarQ3.a == jv91Var.g()) {
            return cqb1VarQ3;
        }
        synchronized (c) {
            cqb1VarQ = q(ypb1Var.k(), jG, jv91Var.d());
            if (cqb1VarQ == null) {
                p();
                throw null;
            }
            if (cqb1VarQ.a != jG) {
                cqb1 cqb1VarK = k(cqb1VarQ, ypb1Var);
                cqb1VarK.a(cqb1VarQ);
                cqb1VarK.a = jv91Var.g();
                cqb1VarQ = cqb1VarK;
            }
        }
        jv91Var.n(ypb1Var);
        return cqb1VarQ;
    }
}
