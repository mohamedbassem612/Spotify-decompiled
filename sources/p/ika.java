package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ika extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ika(byte b, int i, int i2, Object obj, Object obj2, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = qim0Var;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(b2 | 1);
                byte b3 = this.d;
                b9p1.b((hux) obj4, (String) obj3, this.b, (b0k) obj, iP, b3);
                break;
            default:
                ((Number) obj2).intValue();
                aqo1.f(czo1.p(b2 | 1), this.d, (b0k) obj, (hcx) obj4, (c380) obj3, this.b);
                break;
        }
        return rih1Var;
    }
}
