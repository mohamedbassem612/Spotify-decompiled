package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bhh1 extends q8n {
    public static final bhh1 c = new bhh1();

    @Override // p.q8n
    public final q8n M(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // p.q8n
    public final void h(o8n o8nVar, Runnable runnable) {
        fnm1 fnm1Var = (fnm1) o8nVar.A(fnm1.c);
        if (fnm1Var != null) {
            fnm1Var.b = true;
        } else {
            hhg1.h("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // p.q8n
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
