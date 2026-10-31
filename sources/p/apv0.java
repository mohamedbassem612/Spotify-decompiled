package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class apv0 implements xdy0, iv30 {
    public static final apv0 a = new apv0();

    @Override // p.xdy0
    public final String a(String str) {
        return System.getProperty(str);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xdy0) && (obj instanceof iv30)) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p.iv30
    public final cv30 getFunctionDelegate() {
        return new tv30(1, System.class, "getProperty", "getProperty(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
