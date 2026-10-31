package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uzs implements aac0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ssw0 b;

    public /* synthetic */ uzs(ssw0 ssw0Var, byte b) {
        this.a = b;
        this.b = ssw0Var;
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        byte b = this.a;
        ssw0 ssw0Var = this.b;
        switch (b) {
            case 0:
                int i = tzs.a[k8c0Var.ordinal()];
                if (i == 1 || i == 2) {
                    ssw0Var.l(Boolean.TRUE);
                } else if (i == 3 || i == 4) {
                    ssw0Var.l(Boolean.FALSE);
                }
                break;
            default:
                ssw0Var.l(k8c0Var);
                if (k8c0Var == k8c0.ON_DESTROY) {
                    ssw0Var.H((Throwable) null);
                }
                break;
        }
    }
}
