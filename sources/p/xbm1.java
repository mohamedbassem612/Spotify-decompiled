package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xbm1 implements i0v0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ xbm1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return (zk90) ((iyh1) obj3).a((qop) obj, (gl90) obj2);
            case 1:
                return (qhv0) ((hhm1) obj3).a((shv0) obj, (rhv0) obj2);
            default:
                return (jk90) ((hhm1) obj3).a((qop) obj, (gl90) obj2);
        }
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return "wrapped";
            case 1:
                return "Wrapped incoming sharing lens";
            default:
                return "Wrapped per-track notes";
        }
    }
}
