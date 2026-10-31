package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m1 extends hab0 implements fv30 {
    public static final m1 b;
    public static final m1 c;
    public static final m1 d;
    public static final m1 e;
    public final /* synthetic */ byte a;

    static {
        int i = 8;
        b = new m1(i, (byte) 0);
        c = new m1(i, (byte) 1);
        d = new m1(i, (byte) 2);
        e = new m1(i, (byte) 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(int i, byte b2) {
        super(i);
        this.a = b2;
    }

    public final Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        switch (this.a) {
            case 0:
                return new g1((jo70) obj, (hzy) obj2, (pnt) obj3, (xkk1) obj4, (a7q0) obj5, (zoy0) obj6, (uio) obj7, (pn30) obj8);
            case 1:
                return new v110((zc8) obj4, (xkk1) obj5);
            case 2:
                return new r810((jo70) obj, (xkk1) obj2, (zoy0) obj3, (hll) obj4, (a7q0) obj5, (e2k1) null, (v6v0) obj6, (zc8) obj7, (z070) obj8);
            default:
                return new rhi0((pjw0) obj, (nbw0) obj2, (nbw0) obj3, (jo70) obj4, (mtl) obj5, (prl) obj6, (xkk1) obj7, (e2k1) obj8, (hzy) null);
        }
    }
}
