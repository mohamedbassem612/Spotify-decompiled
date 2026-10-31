package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ww80 implements bx80 {
    public final d9e1 a;
    public final /* synthetic */ ax80 b;

    public ww80(ax80 ax80Var, d9e1 d9e1Var) {
        this.b = ax80Var;
        this.a = d9e1Var;
    }

    public final void b(String str, vt81 vt81Var) {
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
        this.a.b(str, vt81Var);
    }

    public final void cancel() {
        this.a.cancel();
        this.b.i.l((Object) null);
    }
}
