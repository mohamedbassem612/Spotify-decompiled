package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class znw implements eck1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ znw(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final xbk1 b(Class cls) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (cls.equals(ynw.class)) {
                    return (xbk1) ((p2q) obj).get();
                }
                hhg1.n(cy30.j(cls, "unsupported view model class: "));
                return null;
            case 1:
                return new u631((gal) obj);
            default:
                return (xbk1) ((ick1) obj).a.invoke();
        }
    }
}
