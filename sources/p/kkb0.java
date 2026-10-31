package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kkb0 implements o5s {
    public final /* synthetic */ lkb0 a;
    public final /* synthetic */ iac0 b;

    public kkb0(lkb0 lkb0Var, iac0 iac0Var) {
        this.a = lkb0Var;
        this.b = iac0Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        this.b.getLifecycle().d(this);
    }

    public final void onStop(iac0 iac0Var) {
        this.a.f.c();
    }
}
