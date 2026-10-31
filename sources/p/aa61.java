package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aa61 implements o5s {
    public final /* synthetic */ ia61 a;

    public aa61(ia61 ia61Var) {
        this.a = ia61Var;
    }

    @Override // p.o5s
    public final void onCreate(iac0 iac0Var) {
        this.a.b.g(k8c0.ON_CREATE);
    }

    @Override // p.o5s
    public final void onDestroy(iac0 iac0Var) {
        this.a.b.g(k8c0.ON_DESTROY);
        iac0Var.getLifecycle().d(this);
    }

    @Override // p.o5s
    public final void onPause(iac0 iac0Var) {
        this.a.b.g(k8c0.ON_PAUSE);
    }

    @Override // p.o5s
    public final void onResume(iac0 iac0Var) {
        this.a.b.g(k8c0.ON_RESUME);
    }

    @Override // p.o5s
    public final void onStart(iac0 iac0Var) {
        this.a.b.g(k8c0.ON_START);
    }

    @Override // p.o5s
    public final void onStop(iac0 iac0Var) {
        this.a.b.g(k8c0.ON_STOP);
    }
}
