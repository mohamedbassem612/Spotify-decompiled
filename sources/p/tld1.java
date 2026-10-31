package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class tld1 implements dvn, iv30 {
    public final /* synthetic */ evn a;

    public tld1(evn evnVar) {
        this.a = evnVar;
    }

    @Override // p.dvn
    public final void a(String str, ou80 ou80Var) {
        this.a.a(str, ou80Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dvn) && (obj instanceof iv30)) {
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
