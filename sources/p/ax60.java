package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ax60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax60(String str, lee1 lee1Var, long j, long j2, float f, int i) {
        super(2);
        this.f = str;
        this.g = lee1Var;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                td10 td10Var = (td10) obj3;
                int iP = czo1.p(1);
                ((nhc) obj4).e(this.e, this.d, this.b, this.c, td10Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(this.e | 1);
                kbb.g((String) obj4, (lee1) obj3, this.b, this.c, this.d, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax60(nhc nhcVar, int i, float f, long j, long j2, td10 td10Var, int i2) {
        super(2);
        this.f = nhcVar;
        this.e = i;
        this.d = f;
        this.b = j;
        this.c = j2;
        this.g = td10Var;
    }
}
