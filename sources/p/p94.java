package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class p94 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ p94(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((d030) obj).N1(i));
            case 1:
                return Boolean.valueOf(((d030) obj).N1(i));
            case 2:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i + '.');
            case 3:
                return Boolean.valueOf(((d030) obj).N1(i));
            case 4:
                return Boolean.valueOf(((d030) obj).N1(i));
            case 5:
                return Boolean.valueOf(((d030) obj).H1(i));
            case 6:
                return x2p1.h(zno1.p(((zy70) obj).a, i));
            default:
                return x2p1.h(zno1.p(((zy70) obj).a, i));
        }
    }
}
