package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xw80 implements cx80 {
    public final wok1 a;
    public final /* synthetic */ ax80 b;

    public xw80(ax80 ax80Var, wok1 wok1Var) {
        this.b = ax80Var;
        this.a = wok1Var;
    }

    public final mr20 a() {
        return this.a.n;
    }

    public final mr20 c() {
        return this.a.l;
    }

    public final void cancel() {
        this.a.cancel();
        this.b.i.l((Object) null);
    }

    public final void d() {
        ax80 ax80Var = this.b;
        dx80 dx80Var = (dx80) ax80Var.t.getValue();
        if (dx80Var != null) {
            if (dx80Var.equals(this)) {
                dx80Var = null;
            }
            if (dx80Var != null) {
                dx80Var.cancel();
            }
        }
        bpb1 bpb1Var = ax80Var.i;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, this);
        this.a.d();
    }

    public final mr20 e() {
        return this.a.m;
    }
}
