package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class xm1 implements r331, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xm1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void e(d331 d331Var) {
        hv1 hv1Var;
        gv1 gv1Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((iu30) obj).invoke(d331Var);
                break;
            default:
                ju51 ju51Var = (ju51) obj;
                u9c0 u9c0Var = ju51Var.c;
                y231 y231Var = d331Var instanceof y231 ? (y231) d331Var : null;
                if (y231Var != null && (hv1Var = y231Var.a) != null && (gv1Var = hv1Var.a) != null && !gv1Var.equals(fv1.a)) {
                    if (gv1Var.equals(cv1.a)) {
                        fn31.T(u9c0Var, (o8n) null, 0, new b751(ju51Var, (lnm) null, (byte) 5), 3);
                    } else if (!(gv1Var instanceof dv1)) {
                        eg.o();
                    } else {
                        fn31.T(u9c0Var, (o8n) null, 0, new lc41(ju51Var, gv1Var, null, (byte) 21), 3);
                    }
                    break;
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof r331) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof r331) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (iu30) obj;
            default:
                return new tv30(1, (ju51) obj, ju51.class, "onAddToPlaylistResult", "onAddToPlaylistResult(Lcom/spotify/tome/pageapi/result/Result;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
