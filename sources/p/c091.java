package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c091 extends sqe1 {
    public static final Object r = new Object();
    public final long e;
    public final long f;
    public final long g = -9223372036854775807L;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yoh0 f20p;
    public final roh0 q;

    static {
        koh0 koh0Var = new koh0();
        koh0Var.b = "SinglePeriodTimeline";
        koh0Var.e = Uri.EMPTY;
        koh0Var.a();
    }

    public c091(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, Object obj, yoh0 yoh0Var, roh0 roh0Var) {
        this.e = j;
        this.f = j2;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = obj;
        yoh0Var.getClass();
        this.f20p = yoh0Var;
        this.q = roh0Var;
    }

    @Override // p.sqe1
    public final int b(Object obj) {
        return r != obj ? -1 : 0;
    }

    @Override // p.sqe1
    public final dqe1 f(int i, dqe1 dqe1Var, boolean z) {
        dm5.q(i, 1);
        dqe1Var.i(null, z ? r : null, 0, this.h, -this.j, ev0.f, false);
        return dqe1Var;
    }

    @Override // p.sqe1
    public final int h() {
        return 1;
    }

    @Override // p.sqe1
    public final Object l(int i) {
        dm5.q(i, 1);
        return r;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r1
      0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p.sqe1
    public final oqe1 n(int i, oqe1 oqe1Var, long j) {
        long j2;
        dm5.q(i, 1);
        long j3 = this.k;
        boolean z = this.m;
        if (!z || this.n || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.i;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        oqe1Var.d(oqe1.q, this.f20p, this.o, this.e, this.f, this.g, this.l, z, this.q, j2, this.i, 0, 0, this.j);
        return oqe1Var;
    }

    @Override // p.sqe1
    public final int o() {
        return 1;
    }
}
