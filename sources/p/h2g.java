package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class h2g implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e261 b;

    public /* synthetic */ h2g(e261 e261Var, byte b) {
        this.a = b;
        this.b = e261Var;
    }

    public final Object invoke(Object obj) throws Throwable {
        byte b = this.a;
        boolean z = false;
        e261 e261Var = this.b;
        switch (b) {
            case 0:
                htr0 htr0Var = (htr0) ((dpg1) obj);
                htr0Var.P0 = true;
                htr0Var.O0.invoke(e261Var);
                nko1.C(htr0Var);
                return Boolean.FALSE;
            case 1:
                Boolean boolA = ((f620) obj).a();
                if (boolA != null) {
                    b261.E(e261Var, kbb.n(boolA.booleanValue()));
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                Boolean boolA2 = ((f620) obj).a();
                if (boolA2 != null) {
                    b261.E(e261Var, kbb.n(boolA2.booleanValue()));
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
