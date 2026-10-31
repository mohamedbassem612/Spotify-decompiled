package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class il1 implements iv30 {
    public final /* synthetic */ fl1 a;

    public il1(fl1 fl1Var) {
        this.a = fl1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof il1) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    public final cv30 getFunctionDelegate() {
        return new tv30(1, this.a, fl1.class, "create", "create(Ljava/lang/String;)Lcom/spotify/audiobookprerelease/collection/AddToCollectionDataSource;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
