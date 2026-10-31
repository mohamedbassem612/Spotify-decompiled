package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pbh implements nbh {
    public static final pbh a = new pbh();

    public final qim0 a(float f, qim0 qim0Var, boolean z) {
        if (!(((double) f) > 0.0d)) {
            of80.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return qim0Var.then(new wnb0(f, z));
    }

    public final qim0 c(era eraVar, qim0 qim0Var) {
        return ktd.m(eraVar, qim0Var);
    }
}
