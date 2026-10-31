package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rcx implements nbh {
    public final p3v a;

    public rcx(p3v p3vVar) {
        this.a = p3vVar;
    }

    @Override // p.nbh
    public final qim0 a(float f, qim0 qim0Var, boolean z) {
        if (!(((double) f) > 0.0d)) {
            of80.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return qim0Var.then(new wnb0(f, z));
    }

    @Override // p.nbh
    public final qim0 c(era eraVar, qim0 qim0Var) {
        return ktd.m(eraVar, qim0Var);
    }
}
