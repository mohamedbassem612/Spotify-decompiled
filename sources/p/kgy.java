package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kgy implements o5s {
    public final /* synthetic */ k0t a;

    public kgy(k0t k0tVar) {
        this.a = k0tVar;
    }

    public final void onDestroy(iac0 iac0Var) {
        iac0Var.getLifecycle().d(this);
    }

    public final void onStop(iac0 iac0Var) {
        this.a.c(zyz.g);
    }
}
