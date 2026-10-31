package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class gp31 implements iv30 {
    public final /* synthetic */ ip31 a;

    public gp31(ip31 ip31Var) {
        this.a = ip31Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gp31) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p.iv30
    public final cv30 getFunctionDelegate() {
        return new tv30(0, this.a, ip31.class, "uiVisible", "uiVisible()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
