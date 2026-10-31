package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xvq implements jly0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ xvq(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return new o2n1(((lbq) this.b).f());
            default:
                return new x1p(this);
        }
    }
}
