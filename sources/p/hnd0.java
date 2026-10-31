package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hnd0 implements moy0 {
    public final ymd0 a;

    public hnd0(ymd0 ymd0Var) {
        this.a = ymd0Var;
    }

    public final void subscribe(gnc1 gnc1Var) {
        gnc1Var.onSubscribe(new fnd0(gnc1Var, this.a));
    }
}
