package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zpy extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zpy(int i, int i2, long j, String str, String str2, qim0 qim0Var) {
        super(2);
        this.b = str;
        this.g = str2;
        this.c = qim0Var;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.f;
                String str = this.b;
                cqy.a(str, (lee1) obj3, this.d, this.c, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.f;
                long j = this.d;
                String str2 = this.b;
                i1p1.k(iP2, b3, j, str2, (String) obj3, (b0k) obj, this.c);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                byte b4 = this.f;
                String str3 = this.b;
                qim0 qim0Var = this.c;
                rwq0.e(str3, qim0Var, (ksl) obj3, this.d, (b0k) obj, iP3, b4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zpy(String str, qim0 qim0Var, ksl kslVar, long j, int i, int i2) {
        super(2);
        this.b = str;
        this.c = qim0Var;
        this.g = kslVar;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zpy(String str, lee1 lee1Var, long j, qim0 qim0Var, int i, int i2) {
        super(2);
        this.b = str;
        this.g = lee1Var;
        this.d = j;
        this.c = qim0Var;
        this.e = i;
        this.f = i2;
    }
}
