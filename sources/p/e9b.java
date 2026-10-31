package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class e9b implements dlv, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ e9b(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    public final /* synthetic */ float a(float f) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return ((Number) iu30Var.invoke(Float.valueOf(f))).floatValue();
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof dlv) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof dlv) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
