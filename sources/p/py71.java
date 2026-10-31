package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class py71 implements d6o0 {
    public final xtb0 a;

    public py71(xtb0 xtb0Var) {
        this.a = xtb0Var;
    }

    public final Object Q0(long j, long j2, lnm lnmVar) {
        if (qui1.e(j2) > 0.0f) {
            xtb0 xtb0Var = this.a;
            if (((err0) xtb0Var.e.b).s() != 0 || ((err0) xtb0Var.e.c).s() != 0) {
                return new qui1(j2);
            }
        }
        return new qui1(0L);
    }

    public final long h0(int i, long j, long j2) {
        if (Float.intBitsToFloat((int) (4294967295L & j2)) <= 0.0f) {
            return 0L;
        }
        xtb0 xtb0Var = this.a;
        if (((err0) xtb0Var.e.b).s() == 0 && ((err0) xtb0Var.e.c).s() == 0) {
            return 0L;
        }
        return j2;
    }
}
