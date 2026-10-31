package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class dyn0 implements t1q0, iv30 {
    public final /* synthetic */ iu30 a;

    public dyn0(xkm0 xkm0Var) {
        this.a = xkm0Var;
    }

    public final /* synthetic */ void a(int i) {
        this.a.invoke(Integer.valueOf(i));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof t1q0) && (obj instanceof iv30)) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    public final cv30 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
