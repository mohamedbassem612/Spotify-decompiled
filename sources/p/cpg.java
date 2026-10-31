package p;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cpg extends if30 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public cpg(sqe1 sqe1Var, long j, long j2, boolean z) throws ClippingMediaSource$IllegalClippingException {
        super(sqe1Var);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new ClippingMediaSource$IllegalClippingException(2, j, j2);
        }
        boolean z2 = false;
        if (sqe1Var.h() != 1) {
            throw new ClippingMediaSource$IllegalClippingException(0);
        }
        oqe1 oqe1VarN = sqe1Var.n(0, new oqe1(), 0L);
        long jMax = Math.max(0L, j);
        if (!z && !oqe1VarN.k && jMax != 0 && !oqe1VarN.h) {
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? oqe1VarN.m : Math.max(0L, j2);
        long j3 = oqe1VarN.m;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f = jMax;
        this.g = jMax2;
        this.h = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (oqe1VarN.i && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z2 = true;
        }
        this.i = z2;
    }

    @Override // p.if30, p.sqe1
    public final dqe1 f(int i, dqe1 dqe1Var, boolean z) {
        this.e.f(0, dqe1Var, z);
        long j = dqe1Var.e - this.f;
        long j2 = this.h;
        dqe1Var.i(dqe1Var.a, dqe1Var.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, ev0.f, dqe1Var.f);
        return dqe1Var;
    }

    @Override // p.if30, p.sqe1
    public final oqe1 n(int i, oqe1 oqe1Var, long j) {
        this.e.n(0, oqe1Var, 0L);
        long j2 = oqe1Var.f108p;
        long j3 = this.f;
        oqe1Var.f108p = j2 + j3;
        oqe1Var.m = this.h;
        oqe1Var.i = this.i;
        long j4 = oqe1Var.l;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            oqe1Var.l = jMax;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            oqe1Var.l = jMax - j3;
        }
        long jN0 = zoi1.n0(j3);
        long j6 = oqe1Var.e;
        if (j6 != -9223372036854775807L) {
            oqe1Var.e = j6 + jN0;
        }
        long j7 = oqe1Var.f;
        if (j7 != -9223372036854775807L) {
            oqe1Var.f = j7 + jN0;
        }
        return oqe1Var;
    }
}
