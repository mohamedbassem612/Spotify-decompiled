package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fkd0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkd0(String str, int i, int i2, boolean z) {
        super(2);
        this.a = (byte) 0;
        this.c = z;
        this.b = str;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        boolean z = this.c;
        String str = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                i1p1.j(i, czo1.p(1), str, b0kVar, z);
                break;
            case 1:
                bpo1.i(czo1.p(i | 1), str, b0kVar, z);
                break;
            default:
                kyo1.j(czo1.p(i | 1), str, b0kVar, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fkd0(byte b, int i, String str, boolean z) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = z;
        this.d = i;
    }
}
