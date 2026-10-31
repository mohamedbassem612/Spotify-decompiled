package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w4r0 implements o5s {
    public final /* synthetic */ rzo0 a;

    public w4r0(rzo0 rzo0Var) {
        this.a = rzo0Var;
    }

    @Override // p.o5s
    public final void onDestroy(iac0 iac0Var) {
        rzo0.m(this.a).g();
    }

    @Override // p.o5s
    public final void onStop(iac0 iac0Var) {
        rzo0.l(this.a);
    }
}
