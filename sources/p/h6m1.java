package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class h6m1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h6m1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return new qr80(((long) ((nl3) obj3).a(0, (int) (((yr80) obj).a >> 32), (flb0) obj2)) << 32);
            case 1:
                return new qr80(((long) ((pl3) obj3).c(0, (int) (((yr80) obj).a & 4294967295L))) & 4294967295L);
            default:
                return new qr80(((tl3) obj3).a(0L, ((yr80) obj).a, (flb0) obj2));
        }
    }
}
