package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class alb1 implements fy71 {
    public final long a;
    public final long b;

    public alb1(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j < 0) {
            hhg1.f(gvg.f(j, "stopTimeout(", " ms) cannot be negative"));
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        hhg1.f(gvg.f(j2, "replayExpiration(", " ms) cannot be negative"));
        throw null;
    }

    @Override // p.fy71
    public final mr20 c(foc1 foc1Var) {
        return rqt0.u(z4p1.w(hu20.e(foc1Var, new zkb1(this, null)), new bvg(2, (lnm) null, (byte) 3)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof alb1)) {
            return false;
        }
        alb1 alb1Var = (alb1) obj;
        return this.a == alb1Var.a && this.b == alb1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        smc0 smc0VarO = k4p1.o();
        long j = this.a;
        if (j > 0) {
            smc0VarO.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            smc0VarO.add("replayExpiration=" + j2 + "ms");
        }
        return gvg.k(new StringBuilder("SharingStarted.WhileSubscribed("), o7h.y0(k4p1.k(smc0VarO), null, null, null, null, 63), ')');
    }
}
