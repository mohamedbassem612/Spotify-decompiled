package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class xrn0 implements iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k01 b;

    public /* synthetic */ xrn0(k01 k01Var, byte b) {
        this.a = b;
        this.b = k01Var;
    }

    public final void a(String str, tv80 tv80Var) {
        byte b = this.a;
        u98 u98Var = this.b;
        switch (b) {
            case 0:
                u98Var.invoke(str, tv80Var);
                break;
            case 1:
                u98Var.invoke(str, tv80Var);
                break;
            default:
                u98Var.invoke(str, tv80Var);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof xrn0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof xrn0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof xrn0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        byte b = this.a;
        u98 u98Var = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return u98Var;
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
