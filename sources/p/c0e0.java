package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c0e0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ gbx d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0e0(String str, String str2, gbx gbxVar, boolean z, int i) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = gbxVar;
        this.e = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                gbx gbxVar = this.d;
                e0e0.b(czo1.p(1), this.b, this.c, (b0k) obj, gbxVar, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                boolean z = this.e;
                rrn1.d(czo1.p(1), this.b, this.c, (b0k) obj, this.d, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0e0(String str, boolean z, String str2, gbx gbxVar, int i) {
        super(2);
        this.b = str;
        this.e = z;
        this.c = str2;
        this.d = gbxVar;
    }
}
