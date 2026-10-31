package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u3q0 {
    public final wn4 a;
    public final ov20 b;
    public final u4q0 c;

    public u3q0(wn4 wn4Var, ov20 ov20Var, u4q0 u4q0Var) {
        this.a = wn4Var;
        this.b = ov20Var;
        this.c = u4q0Var;
    }

    public final mr20 a() {
        return rqt0.u(new php0(this.b.c("on-demand-trial", ""), (byte) 8));
    }

    public final mr20 b() {
        wn4 wn4Var = this.a;
        return !wn4Var.c() && (wn4Var.g() || this.c.h()) ? (mr20) new pdp0(this, (byte) 19).invoke() : h4p1.m(Boolean.FALSE);
    }
}
