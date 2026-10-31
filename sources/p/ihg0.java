package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ihg0 extends kh0 {
    public final lh0 a;

    public ihg0(lh0 lh0Var) {
        this.a = lh0Var;
    }

    public final void a(Object obj) {
        rih1 rih1Var;
        rh0 rh0Var = this.a.a;
        if (rh0Var != null) {
            rh0Var.a(obj);
            rih1Var = rih1.a;
        } else {
            rih1Var = null;
        }
        if (rih1Var != null) {
            return;
        }
        eg.m("Launcher has not been initialized");
    }
}
