package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ind0 implements moy0 {
    public final iac0 a;
    public final ymd0 b;

    public ind0(iac0 iac0Var, ymd0 ymd0Var) {
        this.a = iac0Var;
        this.b = ymd0Var;
    }

    public final void subscribe(gnc1 gnc1Var) {
        gnc1Var.onSubscribe(new gnd0(gnc1Var, this.a, this.b));
    }
}
