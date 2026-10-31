package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ffc extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ffc(String str, Object obj, Object obj2, float f, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.e = obj;
        this.f = obj2;
        this.c = f;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                byte b2 = this.d;
                String str = this.b;
                y9g1.a(str, (gt40) obj4, (kee1) obj3, this.c, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                byte b3 = this.d;
                String str2 = this.b;
                vvm1.f(str2, (qim0) obj4, (lee1) obj3, this.c, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }
}
