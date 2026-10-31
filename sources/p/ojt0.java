package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ojt0 implements o5s {
    public final /* synthetic */ iac0 a;
    public final /* synthetic */ pjt0 b;

    public ojt0(pjt0 pjt0Var, iac0 iac0Var) {
        this.b = pjt0Var;
        this.a = iac0Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        this.b.g.c();
        this.a.getLifecycle().d(this);
    }

    public final void onPause(iac0 iac0Var) {
        this.b.g.c();
    }
}
