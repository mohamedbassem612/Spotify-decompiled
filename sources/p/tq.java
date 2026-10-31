package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tq implements dpb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tq(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.ho20
    public final Object b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((x34) obj).a());
            default:
                return Boolean.valueOf(((p3l) ((kly0) obj).get()).x());
        }
    }
}
