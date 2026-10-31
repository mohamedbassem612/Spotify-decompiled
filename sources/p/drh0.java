package p;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class drh0 {
    public final pfr c;
    public final wdd1 d;
    public final nay e;
    public long f;
    public int g;
    public boolean h;
    public brh0 i;
    public final brh0[] j;
    public final brh0[] k;
    public brh0 l;
    public brh0 m;
    public int n;
    public Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f41p;
    public final dqe1 a = new dqe1();
    public final oqe1 b = new oqe1();
    public ArrayList q = new ArrayList();

    public drh0(pfr pfrVar, wdd1 wdd1Var, nay nayVar, int i) {
        this.c = pfrVar;
        this.d = wdd1Var;
        this.e = nayVar;
        this.j = new brh0[i];
        this.k = new brh0[i];
    }

    public static boolean n(brh0[] brh0VarArr, long[] jArr, brh0 brh0Var, long j) {
        for (int i = 0; i < brh0VarArr.length; i++) {
            brh0 brh0Var2 = brh0VarArr[i];
            if (brh0Var2 != null) {
                for (brh0 brh0Var3 = brh0Var.m; brh0Var3 != null; brh0Var3 = brh0Var3.m) {
                    if (brh0Var3 == brh0Var2) {
                        return true;
                    }
                }
                if (brh0Var2 != brh0Var) {
                    continue;
                } else {
                    long j2 = jArr[i];
                    if (j2 == Long.MIN_VALUE || j2 >= j) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[LOOP:0: B:3:0x0013->B:28:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x006d A[EDGE_INSN: B:40:0x006d->B:29:0x006d BREAK  A[LOOP:0: B:3:0x0013->B:28:0x0062], SYNTHETIC] */
    public static p2i0 u(sqe1 sqe1Var, Object obj, long j, long j2, oqe1 oqe1Var, dqe1 dqe1Var) {
        sqe1Var.g(obj, dqe1Var);
        sqe1Var.m(dqe1Var.c, oqe1Var);
        int iB = sqe1Var.b(obj);
        Object obj2 = obj;
        while (true) {
            int i = dqe1Var.g.a;
            if (i == 0) {
                break;
            }
            if ((i == 1 && dqe1Var.g(0)) || !dqe1Var.h(dqe1Var.g.d)) {
                break;
            }
            long j3 = 0;
            if (dqe1Var.c(0L) != -1) {
                break;
            }
            if (dqe1Var.d == 0) {
                if (iB <= oqe1Var.o) {
                    break;
                    break;
                }
                sqe1Var.f(iB, dqe1Var, true);
                obj2 = dqe1Var.b;
                obj2.getClass();
                iB++;
            } else {
                int i2 = i - (dqe1Var.g(i + (-1)) ? 2 : 1);
                for (int i3 = 0; i3 <= i2; i3++) {
                    j3 += dqe1Var.g.a(i3).j;
                }
                if (dqe1Var.d > j3) {
                    break;
                }
                if (iB <= oqe1Var.o) {
                    break;
                }
                sqe1Var.f(iB, dqe1Var, true);
                obj2 = dqe1Var.b;
                obj2.getClass();
                iB++;
            }
        }
        sqe1Var.g(obj2, dqe1Var);
        int iC = dqe1Var.c(j);
        return iC == -1 ? new p2i0(obj2, j2, dqe1Var.b(j)) : new p2i0(obj2, iC, dqe1Var.f(iC), j2, -1);
    }

    public final brh0 a() {
        brh0 brh0Var;
        if (this.i == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            brh0[] brh0VarArr = this.j;
            if (i2 >= brh0VarArr.length) {
                break;
            }
            if (this.i.equals(brh0VarArr[i2])) {
                brh0VarArr[i2] = this.i.m;
            }
            i2++;
        }
        this.i.getClass();
        while (true) {
            brh0[] brh0VarArr2 = this.k;
            int length = brh0VarArr2.length;
            brh0Var = this.i;
            if (i >= length) {
                break;
            }
            if (brh0Var.equals(brh0VarArr2[i])) {
                brh0VarArr2[i] = this.i.m;
            }
            i++;
        }
        brh0Var.getClass();
        this.i.k();
        int i3 = this.n - 1;
        this.n = i3;
        if (i3 == 0) {
            this.l = null;
            brh0 brh0Var2 = this.i;
            this.o = brh0Var2.b;
            this.f41p = brh0Var2.g.a.d;
        }
        this.i = this.i.m;
        r();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        brh0 brh0Var = this.i;
        brh0Var.getClass();
        this.o = brh0Var.b;
        this.f41p = brh0Var.g.a.d;
        while (brh0Var != null) {
            brh0Var.k();
            brh0Var = brh0Var.m;
        }
        this.i = null;
        this.l = null;
        Arrays.fill(this.j, (Object) null);
        Arrays.fill(this.k, (Object) null);
        this.n = 0;
        r();
    }

    public final brh0 c() {
        brh0 brh0Var = this.i;
        while (brh0Var != null) {
            for (brh0 brh0Var2 : this.k) {
                if (brh0Var == brh0Var2) {
                    return brh0Var;
                }
            }
            brh0Var = brh0Var.m;
        }
        return brh0Var;
    }

    public final brh0 d() {
        brh0 brh0Var = this.i;
        while (brh0Var != null) {
            for (brh0 brh0Var2 : this.j) {
                if (brh0Var == brh0Var2) {
                    return brh0Var;
                }
            }
            brh0Var = brh0Var.m;
        }
        return brh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    public final crh0 e(sqe1 sqe1Var, brh0 brh0Var, long j) {
        Object obj;
        long j2;
        oqe1 oqe1Var;
        long j3;
        long j4;
        long j5;
        long j6;
        long jMax;
        crh0 crh0Var = brh0Var.g;
        p2i0 p2i0Var = crh0Var.a;
        long j7 = crh0Var.d;
        int iB = sqe1Var.b(p2i0Var.a);
        int i = this.g;
        boolean z = this.h;
        dqe1 dqe1Var = this.a;
        oqe1 oqe1Var2 = this.b;
        int iD = sqe1Var.d(iB, dqe1Var, oqe1Var2, i, z);
        if (iD == -1) {
            return null;
        }
        int i2 = sqe1Var.f(iD, dqe1Var, true).c;
        Object obj2 = dqe1Var.b;
        obj2.getClass();
        long j8 = p2i0Var.d;
        long j9 = -9223372036854775807L;
        if (sqe1Var.n(i2, oqe1Var2, 0L).n == iD) {
            int i3 = dqe1Var.c;
            if (dqe1Var.d != -9223372036854775807L) {
                jMax = -9223372036854775807L;
            } else {
                sqe1Var.m(i3, oqe1Var2);
                if (!oqe1Var2.i || oqe1Var2.k) {
                    jMax = -9223372036854775807L;
                } else {
                    jMax = Math.max(0L, j);
                }
            }
            oqe1Var = oqe1Var2;
            Pair pairJ = sqe1Var.j(oqe1Var, dqe1Var, i2, -9223372036854775807L, jMax);
            if (pairJ == null) {
                return null;
            }
            obj = pairJ.first;
            long jLongValue = ((Long) pairJ.second).longValue();
            brh0 brh0Var2 = brh0Var.m;
            if (brh0Var2 == null || !brh0Var2.b.equals(obj)) {
                long jW = w(obj);
                if (jW == -1) {
                    jW = this.f;
                    this.f = jW + 1;
                }
                j2 = jW;
            } else {
                j2 = brh0Var2.g.a.d;
            }
            j3 = jLongValue;
            j4 = jMax;
        } else {
            sqe1Var = sqe1Var;
            obj = obj2;
            j2 = j8;
            j9 = 0;
            dqe1Var = dqe1Var;
            oqe1Var = oqe1Var2;
            j3 = 0;
            j4 = -9223372036854775807L;
        }
        p2i0 p2i0VarU = u(sqe1Var, obj, j3, j2, oqe1Var, dqe1Var);
        if (j9 == -9223372036854775807L || j7 == -9223372036854775807L) {
            j5 = j3;
            j6 = j9;
        } else {
            int i4 = sqe1Var.g(p2i0Var.a, dqe1Var).g.a;
            int i5 = dqe1Var.g.d;
            boolean z2 = i4 > 0 && dqe1Var.h(i5) && (i4 > 1 || dqe1Var.d(i5) != Long.MIN_VALUE);
            if (p2i0VarU.c() && z2) {
                j5 = j3;
                j6 = j7;
            } else {
                if (z2) {
                    j5 = j7;
                } else {
                    j5 = j3;
                }
                j6 = j9;
            }
        }
        return i(sqe1Var, p2i0VarU, j6, j5, j4);
    }

    public final crh0 f(sqe1 sqe1Var, brh0 brh0Var, long j) {
        sqe1 sqe1Var2;
        crh0 crh0Var = brh0Var.g;
        long j2 = (brh0Var.f17p + crh0Var.e) - j;
        if (crh0Var.g) {
            return e(sqe1Var, brh0Var, j2);
        }
        p2i0 p2i0Var = crh0Var.a;
        Object obj = p2i0Var.a;
        int i = p2i0Var.e;
        dqe1 dqe1Var = this.a;
        sqe1Var.g(obj, dqe1Var);
        if (!p2i0Var.c()) {
            if (i != -1 && dqe1Var.g(i)) {
                return e(sqe1Var, brh0Var, j2);
            }
            int iF = dqe1Var.f(i);
            boolean z = dqe1Var.h(i) && dqe1Var.e(i, iF) == 3;
            if (iF != dqe1Var.g.a(i).b && !z) {
                return j(sqe1Var, p2i0Var.a, p2i0Var.e, iF, crh0Var.e, p2i0Var.d);
            }
            sqe1Var.g(obj, dqe1Var);
            long jD = dqe1Var.d(i);
            return k(sqe1Var, p2i0Var.a, jD == Long.MIN_VALUE ? dqe1Var.d : dqe1Var.g.a(i).j + jD, -9223372036854775807L, crh0Var.e, p2i0Var.d);
        }
        int i2 = p2i0Var.b;
        int i3 = dqe1Var.g.a(i2).b;
        if (i3 == -1) {
            return null;
        }
        int iA = dqe1Var.g.a(i2).a(p2i0Var.c);
        if (iA < i3) {
            return j(sqe1Var, p2i0Var.a, i2, iA, crh0Var.d, p2i0Var.d);
        }
        long jLongValue = crh0Var.d;
        long jMax = -9223372036854775807L;
        if (jLongValue == -9223372036854775807L) {
            int i4 = dqe1Var.c;
            long j3 = dqe1Var.d;
            oqe1 oqe1Var = this.b;
            if (j3 == -9223372036854775807L) {
                sqe1Var.m(i4, oqe1Var);
                if (oqe1Var.i && !oqe1Var.k) {
                    jMax = Math.max(0L, j2);
                }
            }
            long j4 = jMax;
            sqe1Var2 = sqe1Var;
            Pair pairJ = sqe1Var2.j(oqe1Var, dqe1Var, dqe1Var.c, -9223372036854775807L, j4);
            if (pairJ == null) {
                return null;
            }
            jLongValue = ((Long) pairJ.second).longValue();
            jMax = j4;
        } else {
            sqe1Var2 = sqe1Var;
        }
        int i5 = p2i0Var.b;
        sqe1Var2.g(obj, dqe1Var);
        long jD2 = dqe1Var.d(i5);
        return k(sqe1Var2, p2i0Var.a, Math.max(jD2 == Long.MIN_VALUE ? dqe1Var.d : dqe1Var.g.a(i5).j + jD2, jLongValue), jMax, crh0Var.d, p2i0Var.d);
    }

    public final brh0 g() {
        brh0[] brh0VarArr = this.j;
        if (brh0VarArr.length == 0) {
            return null;
        }
        brh0 brh0Var = brh0VarArr[0];
        for (brh0 brh0Var2 = this.i; brh0Var2 != null; brh0Var2 = brh0Var2.m) {
            for (brh0 brh0Var3 : brh0VarArr) {
                if (brh0Var2 == brh0Var3) {
                    brh0Var = brh0Var2;
                    break;
                }
            }
        }
        return brh0Var;
    }

    public final long h(sqe1 sqe1Var, p2i0 p2i0Var) {
        Object obj = p2i0Var.a;
        dqe1 dqe1Var = this.a;
        sqe1Var.g(obj, dqe1Var);
        if (p2i0Var.c()) {
            return dqe1Var.a(p2i0Var.b, p2i0Var.c);
        }
        int i = p2i0Var.e;
        if (i == -1) {
            return dqe1Var.d;
        }
        long jD = dqe1Var.d(i);
        return jD == Long.MIN_VALUE ? dqe1Var.d : jD;
    }

    public final crh0 i(sqe1 sqe1Var, p2i0 p2i0Var, long j, long j2, long j3) {
        sqe1Var.g(p2i0Var.a, this.a);
        boolean zC = p2i0Var.c();
        Object obj = p2i0Var.a;
        return zC ? j(sqe1Var, obj, p2i0Var.b, p2i0Var.c, j, p2i0Var.d) : k(sqe1Var, obj, j2, j3, j, p2i0Var.d);
    }

    public final crh0 j(sqe1 sqe1Var, Object obj, int i, int i2, long j, long j2) {
        p2i0 p2i0Var = new p2i0(obj, i, i2, j2, -1);
        dqe1 dqe1Var = this.a;
        long jA = sqe1Var.g(obj, dqe1Var).a(i, i2);
        long jMax = i2 == dqe1Var.f(i) ? dqe1Var.g.b : 0L;
        boolean zH = dqe1Var.h(i);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new crh0(p2i0Var, jMax, -9223372036854775807L, j, jA, zH, false, false, false);
    }

    public final crh0 k(sqe1 sqe1Var, Object obj, long j, long j2, long j3, long j4) {
        bv0 bv0VarA;
        int i;
        dqe1 dqe1Var = this.a;
        sqe1Var.g(obj, dqe1Var);
        int iB = dqe1Var.b(j);
        if (iB != -1 && dqe1Var.h(iB) && dqe1Var.d(iB) == dqe1Var.d && (i = (bv0VarA = dqe1Var.g.a(iB)).b) != -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    iB = -1;
                    break;
                }
                int i3 = bv0VarA.f[i2];
                if (i3 == 0 || i3 == 1) {
                    break;
                }
                i2++;
            }
        }
        boolean z = (iB == -1 || !dqe1Var.h(iB) || dqe1Var.g(iB)) ? false : true;
        p2i0 p2i0Var = new p2i0(obj, j4, iB);
        boolean z2 = !p2i0Var.c() && iB == -1;
        boolean zP = p(sqe1Var, p2i0Var);
        boolean zO = o(sqe1Var, p2i0Var, z2);
        long jH = h(sqe1Var, p2i0Var);
        return new crh0(p2i0Var, (jH == -9223372036854775807L || j < jH) ? j : Math.max(0L, jH - 1), j2, j3, jH, z, z2, zP, zO);
    }

    public final brh0 l(int i) {
        return this.k[i];
    }

    public final crh0 m(sqe1 sqe1Var, crh0 crh0Var) {
        p2i0 p2i0Var = crh0Var.a;
        int i = p2i0Var.e;
        boolean zH = false;
        boolean z = !p2i0Var.c() && i == -1;
        boolean zP = p(sqe1Var, p2i0Var);
        boolean zO = o(sqe1Var, p2i0Var, z);
        long jH = h(sqe1Var, p2i0Var);
        Object obj = p2i0Var.a;
        dqe1 dqe1Var = this.a;
        sqe1Var.g(obj, dqe1Var);
        if (p2i0Var.c()) {
            zH = dqe1Var.h(p2i0Var.b);
        } else if (i != -1 && dqe1Var.h(i) && !dqe1Var.g(i)) {
            zH = true;
        }
        return new crh0(p2i0Var, crh0Var.b, crh0Var.c, crh0Var.d, jH, zH, z, zP, zO);
    }

    public final boolean o(sqe1 sqe1Var, p2i0 p2i0Var, boolean z) {
        int iB = sqe1Var.b(p2i0Var.a);
        dqe1 dqe1Var = this.a;
        int i = sqe1Var.f(iB, dqe1Var, false).c;
        oqe1 oqe1Var = this.b;
        return !sqe1Var.n(i, oqe1Var, 0L).i && sqe1Var.d(iB, dqe1Var, oqe1Var, this.g, this.h) == -1 && z;
    }

    public final boolean p(sqe1 sqe1Var, p2i0 p2i0Var) {
        boolean z = !p2i0Var.c() && p2i0Var.e == -1;
        Object obj = p2i0Var.a;
        if (z) {
            if (sqe1Var.n(sqe1Var.g(obj, this.a).c, this.b, 0L).o == sqe1Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void q() {
        brh0 brh0Var = this.m;
        if (brh0Var == null || brh0Var.j()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                brh0 brh0Var2 = (brh0) this.q.get(i);
                if (!brh0Var2.j()) {
                    this.m = brh0Var2;
                    return;
                }
            }
        }
    }

    public final void r() {
        brh0 brh0Var;
        v280 v280VarM = b380.m();
        for (brh0 brh0Var2 = this.i; brh0Var2 != null; brh0Var2 = brh0Var2.m) {
            v280VarM.c(brh0Var2.g.a);
        }
        brh0[] brh0VarArr = this.j;
        this.d.f(new vqh0(this, v280VarM, (brh0VarArr.length == 0 || (brh0Var = brh0VarArr[0]) == null) ? null : brh0Var.g.a, (byte) 1));
    }

    public final void s(long j) {
        brh0 brh0Var = this.l;
        if (brh0Var != null) {
            dm5.y(brh0Var.m == null);
            if (brh0Var.e) {
                brh0Var.a.y(j - brh0Var.f17p);
            }
        }
    }

    public final int t(brh0 brh0Var) {
        brh0[] brh0VarArr;
        brh0[] brh0VarArr2;
        brh0Var.getClass();
        if (brh0Var == this.l) {
            return 0;
        }
        this.l = brh0Var;
        int i = 0;
        while (true) {
            brh0Var = brh0Var.m;
            if (brh0Var == null) {
                break;
            }
            int i2 = 0;
            while (true) {
                brh0VarArr = this.j;
                int length = brh0VarArr.length;
                brh0VarArr2 = this.k;
                if (i2 >= length) {
                    break;
                }
                if (brh0Var == brh0VarArr[i2]) {
                    brh0 brh0Var2 = this.i;
                    brh0VarArr[i2] = brh0Var2;
                    brh0VarArr2[i2] = brh0Var2;
                    i = 3;
                }
                i2++;
            }
            for (int i3 = 0; i3 < brh0VarArr2.length; i3++) {
                if (brh0Var == brh0VarArr2[i3]) {
                    brh0VarArr2[i3] = brh0VarArr[i3];
                    i |= 2;
                }
            }
            brh0Var.k();
            this.n--;
        }
        brh0 brh0Var3 = this.l;
        brh0Var3.getClass();
        if (brh0Var3.m != null) {
            brh0Var3.b();
            brh0Var3.m = null;
            brh0Var3.c();
        }
        r();
        return i;
    }

    public final p2i0 v(o0u0 o0u0Var, sqe1 sqe1Var, Object obj, long j, boolean z, boolean z2) {
        long jW;
        int iB;
        dqe1 dqe1Var = this.a;
        int i = sqe1Var.g(obj, dqe1Var).c;
        Object obj2 = this.o;
        if (obj2 == null || (iB = sqe1Var.b(obj2)) == -1 || sqe1Var.f(iB, dqe1Var, false).c != i) {
            brh0 brh0Var = this.i;
            while (true) {
                if (brh0Var == null) {
                    brh0 brh0Var2 = this.i;
                    while (true) {
                        if (brh0Var2 == null) {
                            jW = w(obj);
                            if (jW != -1) {
                                break;
                            }
                            jW = this.f;
                            this.f = 1 + jW;
                            if (this.i != null) {
                                break;
                            }
                            this.o = obj;
                            this.f41p = jW;
                            break;
                        }
                        int iB2 = sqe1Var.b(brh0Var2.b);
                        if (iB2 != -1 && sqe1Var.f(iB2, dqe1Var, false).c == i) {
                            jW = brh0Var2.g.a.d;
                            break;
                        }
                        brh0Var2 = brh0Var2.m;
                    }
                } else {
                    if (brh0Var.b.equals(obj)) {
                        jW = brh0Var.g.a.d;
                        break;
                    }
                    brh0Var = brh0Var.m;
                }
            }
        } else {
            jW = this.f41p;
        }
        oqe1 oqe1Var = this.b;
        if (!z && !z2) {
            p2i0 p2i0Var = o0u0Var.b;
            long j2 = jW;
            p2i0 p2i0VarU = u(sqe1Var, obj, j, j2, oqe1Var, dqe1Var);
            if (p2i0Var.c() && p2i0Var.equals(p2i0VarU)) {
                return p2i0Var;
            }
            sqe1Var.g(obj, dqe1Var);
            return new p2i0(obj, j2, dqe1Var.b(j));
        }
        Object obj3 = obj;
        long j3 = jW;
        sqe1Var.g(obj3, dqe1Var);
        sqe1Var.m(dqe1Var.c, oqe1Var);
        boolean z3 = false;
        for (int iB3 = sqe1Var.b(obj); iB3 >= oqe1Var.n; iB3--) {
            sqe1Var.f(iB3, dqe1Var, true);
            boolean z4 = dqe1Var.g.a > 0;
            z3 |= z4;
            if (dqe1Var.c(dqe1Var.d) != -1) {
                obj3 = dqe1Var.b;
                obj3.getClass();
            }
            if (z3 && (!z4 || dqe1Var.d != 0)) {
                break;
            }
        }
        p2i0 p2i0VarU2 = u(sqe1Var, obj3, j, j3, oqe1Var, dqe1Var);
        Object obj4 = p2i0VarU2.a;
        int i2 = p2i0VarU2.b;
        if (i2 != -1 && !z) {
            sqe1Var.g(obj4, dqe1Var);
            if (dqe1Var.g.a(i2).a != j) {
                return new p2i0(obj4, p2i0VarU2.d, dqe1Var.b(j));
            }
        }
        return p2i0VarU2;
    }

    public final long w(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            brh0 brh0Var = (brh0) this.q.get(i);
            if (brh0Var.b.equals(obj)) {
                return brh0Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int x(sqe1 sqe1Var) {
        sqe1 sqe1Var2;
        brh0 brh0Var;
        brh0 brh0Var2 = this.i;
        if (brh0Var2 == null) {
            return 0;
        }
        int iB = sqe1Var.b(brh0Var2.b);
        while (true) {
            sqe1Var2 = sqe1Var;
            iB = sqe1Var2.d(iB, this.a, this.b, this.g, this.h);
            while (true) {
                brh0Var = brh0Var2.m;
                if (brh0Var == null || brh0Var2.g.g) {
                    break;
                }
                brh0Var2 = brh0Var;
            }
            if (iB == -1 || brh0Var == null || sqe1Var2.b(brh0Var.b) != iB) {
                break;
            }
            brh0Var2 = brh0Var;
            sqe1Var = sqe1Var2;
        }
        int iT = t(brh0Var2);
        brh0Var2.g = m(sqe1Var2, brh0Var2.g);
        return iT;
    }

    public final int y(sqe1 sqe1Var, long j, long[] jArr, long[] jArr2) {
        long j2;
        int i;
        crh0 crh0VarB;
        brh0 brh0Var = null;
        for (brh0 brh0Var2 = this.i; brh0Var2 != null; brh0Var2 = brh0Var2.m) {
            crh0 crh0Var = brh0Var2.g;
            p2i0 p2i0Var = crh0Var.a;
            if (brh0Var != null) {
                crh0 crh0VarF = f(sqe1Var, brh0Var, j);
                if (crh0VarF != null) {
                    long j3 = crh0VarF.b;
                    long j4 = crh0Var.c;
                    j2 = -9223372036854775807L;
                    long j5 = crh0Var.b;
                    i = 0;
                    if (p2i0Var.equals(crh0VarF.a)) {
                        if (j5 != j3) {
                            if (j4 != -9223372036854775807L) {
                                long j6 = crh0VarF.c;
                                if (j6 != -9223372036854775807L) {
                                    if (Math.abs((j3 - j6) - (j5 - j4)) >= 5000000) {
                                    }
                                }
                            }
                        }
                        crh0VarB = j5 != j3 ? crh0VarF.b(j5, j4) : crh0VarF;
                    }
                }
                return t(brh0Var);
            }
            crh0VarB = m(sqe1Var, crh0Var);
            j2 = -9223372036854775807L;
            i = 0;
            long j7 = crh0Var.d;
            long j8 = crh0Var.e;
            crh0 crh0VarA = crh0VarB.a(j7);
            brh0Var2.g = crh0VarA;
            long j9 = crh0VarB.e;
            if (j8 != j9) {
                long j10 = j9 == j2 ? Long.MAX_VALUE : j9 + brh0Var2.f17p;
                int i2 = (crh0VarA.f || !n(this.j, jArr, brh0Var2, j10)) ? i : 1;
                boolean zN = n(this.k, jArr2, brh0Var2, j10);
                int iT = t(brh0Var2);
                if (iT != 0) {
                    return iT;
                }
                int i3 = (i2 == 0 || (j8 == j2 && p2i0Var.e == -1)) ? i : 1;
                return zN ? i3 | 2 : i3;
            }
            brh0Var = brh0Var2;
        }
        return 0;
    }
}
