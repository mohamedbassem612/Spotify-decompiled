package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ew20 implements nw31 {
    public static final ew20 a = new ew20();

    public final qim0 a(float f, qim0 qim0Var, boolean z) {
        if (f <= 0.0d) {
            of80.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return qim0Var.then(new wnb0(f, z));
    }

    public final qim0 c(qim0 qim0Var) {
        return new vul1(xl3.a);
    }

    public final qim0 d(qim0 qim0Var, iu30 iu30Var) {
        return qim0Var.then(new uul1(new mi31(iu30Var)));
    }

    public final qim0 e(qim0 qim0Var, fra fraVar) {
        return qim0Var.then(new i5j1(fraVar));
    }
}
