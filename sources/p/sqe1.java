package p;

import android.util.Pair;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class sqe1 {
    public static final cqe1 a = new cqe1();
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = zoi1.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
        d = Integer.toString(2, 36);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public int b(Object obj) {
        return obj == e8h0.h ? 0 : -1;
    }

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, dqe1 dqe1Var, oqe1 oqe1Var, int i2, boolean z) {
        int i3 = f(i, dqe1Var, false).c;
        if (n(i3, oqe1Var, 0L).o != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return n(iE, oqe1Var, 0L).n;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        bhn0.w();
        return 0;
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof sqe1) {
                sqe1 sqe1Var = (sqe1) obj;
                if (sqe1Var.o() == o() && sqe1Var.h() == h()) {
                    oqe1 oqe1Var = new oqe1();
                    dqe1 dqe1Var = new dqe1();
                    oqe1 oqe1Var2 = new oqe1();
                    dqe1 dqe1Var2 = new dqe1();
                    for (int i = 0; i < o(); i++) {
                        if (n(i, oqe1Var, 0L).equals(sqe1Var.n(i, oqe1Var2, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < h(); i2++) {
                        if (f(i2, dqe1Var, true).equals(sqe1Var.f(i2, dqe1Var2, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == sqe1Var.a(true) && (iC = c(true)) == sqe1Var.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, 0, true);
                            if (iE == sqe1Var.e(iA, 0, true)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public dqe1 f(int i, dqe1 dqe1Var, boolean z) {
        dqe1Var.i(z ? 0 : null, z ? e8h0.h : null, 0, -9223372036854775807L, 0L, ev0.f, true);
        return dqe1Var;
    }

    public dqe1 g(Object obj, dqe1 dqe1Var) {
        return f(b(obj), dqe1Var, true);
    }

    public int h() {
        return 1;
    }

    public int hashCode() {
        oqe1 oqe1Var = new oqe1();
        dqe1 dqe1Var = new dqe1();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + n(i, oqe1Var, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, dqe1Var, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(oqe1 oqe1Var, dqe1 dqe1Var, int i, long j) {
        Pair pairJ = j(oqe1Var, dqe1Var, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(oqe1 oqe1Var, dqe1 dqe1Var, int i, long j, long j2) {
        dm5.q(i, o());
        n(i, oqe1Var, j2);
        if (j == -9223372036854775807L) {
            j = oqe1Var.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = oqe1Var.n;
        f(i2, dqe1Var, false);
        while (i2 < oqe1Var.o && dqe1Var.e != j) {
            int i3 = i2 + 1;
            if (f(i3, dqe1Var, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, dqe1Var, true);
        long jMin = j - dqe1Var.e;
        long j3 = dqe1Var.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = dqe1Var.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        bhn0.w();
        return 0;
    }

    public Object l(int i) {
        return e8h0.h;
    }

    public final oqe1 m(int i, oqe1 oqe1Var) {
        return n(i, oqe1Var, 0L);
    }

    public oqe1 n(int i, oqe1 oqe1Var, long j) {
        throw new IndexOutOfBoundsException();
    }

    public int o() {
        return 1;
    }

    public final boolean p() {
        return o() == 0;
    }
}
