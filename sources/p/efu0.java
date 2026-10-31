package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class efu0 extends sqe1 {
    public static final Object j = new Object();
    public final yoh0 e;
    public final boolean f;
    public final boolean g;
    public final roh0 h;
    public final long i;

    public efu0(ffu0 ffu0Var) {
        this.e = ffu0Var.u();
        this.f = ffu0Var.O0();
        this.g = ffu0Var.b0();
        this.h = ffu0Var.e1() ? roh0.f : null;
        this.i = zoi1.W(ffu0Var.u0());
    }

    @Override // p.sqe1
    public final int b(Object obj) {
        return j != obj ? -1 : 0;
    }

    @Override // p.sqe1
    public final dqe1 f(int i, dqe1 dqe1Var, boolean z) {
        ev0 ev0Var = ev0.f;
        Object obj = j;
        dqe1Var.i(obj, obj, 0, this.i, 0L, ev0Var, false);
        return dqe1Var;
    }

    @Override // p.sqe1
    public final int h() {
        return 1;
    }

    @Override // p.sqe1
    public final Object l(int i) {
        return j;
    }

    @Override // p.sqe1
    public final oqe1 n(int i, oqe1 oqe1Var, long j2) {
        oqe1Var.d(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        oqe1Var.k = false;
        return oqe1Var;
    }

    @Override // p.sqe1
    public final int o() {
        return 1;
    }
}
