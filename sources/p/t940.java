package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class t940 implements vr20, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;

    public /* synthetic */ t940(vu30 vu30Var, byte b) {
        this.a = b;
        this.b = vu30Var;
    }

    public final /* synthetic */ Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        vu30 vu30Var = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return vu30Var.invoke(obj, lnmVar);
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vr20) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof vr20) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof vr20) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        byte b = this.a;
        return this.b;
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
