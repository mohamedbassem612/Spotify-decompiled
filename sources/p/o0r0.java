package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class o0r0 implements t1q0, iv30 {
    public final /* synthetic */ ozp0 a;

    public o0r0(ozp0 ozp0Var) {
        this.a = ozp0Var;
    }

    @Override // p.t1q0
    public final /* synthetic */ void a(int i) {
        this.a.invoke(Integer.valueOf(i));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof t1q0) && (obj instanceof iv30)) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p.iv30
    public final cv30 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
