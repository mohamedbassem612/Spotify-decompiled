package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s4c0 implements f0f1 {
    public final /* synthetic */ tif1 a;
    public final /* synthetic */ jlg b;

    public s4c0(tif1 tif1Var, jlg jlgVar) {
        this.a = tif1Var;
        this.b = jlgVar;
    }

    public final Object c(int i) {
        tif1 tif1Var = this.a;
        jlg jlgVar = this.b;
        try {
            tif1Var.e(2, "ClientTokenRefresh", "qss");
            return jlgVar.b(i);
        } finally {
            tif1Var.f("ClientTokenRefresh", "qss");
        }
    }

    public final void cancel() {
        this.b.d.onNext(sih1.a);
    }
}
