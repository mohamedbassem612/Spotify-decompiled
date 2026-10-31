package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c5 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(String str, String str2, String str3, int i, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 2;
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.f = i;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.f;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1 | i);
                zro1.f(this.b, this.c, this.e, this.d, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                svh.a(this.f, czo1.p(1), this.b, this.c, this.e, (b0k) obj, this.d);
                break;
            case 2:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.d;
                int iP2 = czo1.p(1);
                m1p1.o(this.f, iP2, this.b, this.c, this.e, (b0k) obj, qim0Var);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                ilo1.k(this.b, this.c, this.e, this.d, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5(String str, String str2, String str3, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.d = qim0Var;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(String str, String str2, qim0 qim0Var, String str3, int i, int i2) {
        super(2);
        this.a = (byte) 1;
        this.b = str;
        this.c = str2;
        this.d = qim0Var;
        this.e = str3;
        this.f = i;
    }
}
