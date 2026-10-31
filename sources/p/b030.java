package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b030 extends l5t implements sjp0, j4k {
    public final d030 Q0;
    public nsb0 R0;

    public b030() {
        d030 d030Var = new d030(0, 9, new c4z(this));
        H1(d030Var);
        this.Q0 = d030Var;
    }

    @Override // p.sjp0
    public final void f0() {
        p811 p811Var = new p811();
        p9p1.z(this, new og(p811Var, this, (byte) 22));
        nsb0 nsb0Var = (nsb0) p811Var.a;
        if (this.Q0.L1().b()) {
            nsb0 nsb0Var2 = this.R0;
            if (nsb0Var2 != null) {
                nsb0Var2.b();
            }
            if (nsb0Var != null) {
                nsb0Var.a();
            } else {
                nsb0Var = null;
            }
            this.R0 = nsb0Var;
        }
    }
}
