package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r6k1 implements o5s {
    public final /* synthetic */ ffj1 a;

    public r6k1(ffj1 ffj1Var) {
        this.a = ffj1Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        iac0Var.getLifecycle().d(this);
    }

    public final void onStop(iac0 iac0Var) {
        ffj1 ffj1Var = this.a;
        Boolean bool = ffj1Var.d;
        if (bool != null) {
            if (bool.booleanValue()) {
                ((xtm0) ffj1Var.c.getValue()).c();
            } else {
                ((k0t) ffj1Var.b.getValue()).c(zyz.g);
            }
        }
    }
}
