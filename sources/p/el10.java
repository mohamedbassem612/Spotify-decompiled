package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class el10 extends yrd1 {
    public final /* synthetic */ es31 e;
    public final /* synthetic */ fl10 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el10(String str, es31 es31Var, fl10 fl10Var) {
        super(str, true);
        this.e = es31Var;
        this.f = fl10Var;
    }

    @Override // p.yrd1
    public final long a() throws InterruptedException {
        ds31 ds31Var;
        es31 es31Var = this.e;
        try {
            ds31Var = es31Var.f();
        } catch (Throwable th) {
            ds31Var = new ds31(es31Var, th, 2);
        }
        fl10 fl10Var = this.f;
        if (!fl10Var.d.contains(es31Var)) {
            return -1L;
        }
        fl10Var.e.put(ds31Var);
        return -1L;
    }
}
