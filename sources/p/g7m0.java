package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g7m0 implements o5s {
    public final /* synthetic */ j7m0 a;

    public g7m0(j7m0 j7m0Var) {
        this.a = j7m0Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        j7m0 j7m0Var = this.a;
        j7m0Var.d.a.r();
        j7m0Var.b.disconnect();
    }

    public final void onStart(iac0 iac0Var) {
        this.a.b.start();
    }

    public final void onStop(iac0 iac0Var) {
        this.a.b.stop();
    }
}
