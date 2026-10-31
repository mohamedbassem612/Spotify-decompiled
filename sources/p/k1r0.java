package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k1r0 implements o5s {
    public final /* synthetic */ o1r0 a;

    public k1r0(o1r0 o1r0Var) {
        this.a = o1r0Var;
    }

    @Override // p.o5s
    public final void onDestroy(iac0 iac0Var) {
        iac0Var.getLifecycle().d(this);
    }

    @Override // p.o5s
    public final void onPause(iac0 iac0Var) {
        this.a.setOnDismissListener(null);
    }

    @Override // p.o5s
    public final void onResume(iac0 iac0Var) {
        o1r0 o1r0Var = this.a;
        o1r0Var.setOnDismissListener(new whr(o1r0Var, (byte) 3));
    }
}
