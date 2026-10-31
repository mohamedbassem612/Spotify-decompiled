package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mo71 implements o5s {
    public final /* synthetic */ uoa a;
    public final /* synthetic */ ta71 b;
    public final /* synthetic */ woa c;

    public mo71(uoa uoaVar, ta71 ta71Var, woa woaVar) {
        this.a = uoaVar;
        this.b = ta71Var;
        this.c = woaVar;
    }

    public final void onDestroy(iac0 iac0Var) {
        uoa uoaVar = this.a;
        uoaVar.u();
        this.c.c(uoaVar);
    }

    public final void onPause(iac0 iac0Var) {
        this.a.f();
    }

    public final void onResume(iac0 iac0Var) {
        if (this.b.c == h3i0.a) {
            this.a.l();
        }
    }
}
