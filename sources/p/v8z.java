package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class v8z implements zr11, iv30 {
    public final /* synthetic */ dvn a;

    public v8z(dvn dvnVar) {
        this.a = dvnVar;
    }

    public final void a(String str, ou80 ou80Var) {
        this.a.a(str, ou80Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zr11) && (obj instanceof iv30)) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    public final cv30 getFunctionDelegate() {
        return new tv30(2, this.a, dvn.class, "openNpv", "openNpv(Ljava/lang/String;Lcom/spotify/ubi/model/InteractionId;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
