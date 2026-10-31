package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gz11 implements f961 {
    public final r0z0 a;
    public final mz11 b;

    public gz11(luk lukVar, r0z0 r0z0Var) {
        this.a = r0z0Var;
        mz11 mz11Var = new mz11(true, lukVar);
        this.b = mz11Var;
        if (mz11Var.a()) {
            r0z0Var.a();
        } else {
            r0z0Var.cancel();
        }
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }

    @Override // p.dwo
    public final void shutdown() {
    }
}
