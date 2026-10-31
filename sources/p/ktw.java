package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ktw extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ tob1 Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ guj c;
    public final /* synthetic */ jsw d;
    public final /* synthetic */ ipb1 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ipb1 i;
    public final /* synthetic */ qim0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ktw(Object obj, guj gujVar, jsw jswVar, tob1 tob1Var, ipb1 ipb1Var, String str, Object obj2, iu30 iu30Var, int i, ipb1 ipb1Var2, qim0 qim0Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = gujVar;
        this.d = jswVar;
        this.Y = tob1Var;
        this.e = ipb1Var;
        this.f = str;
        this.Z = obj2;
        this.g = iu30Var;
        this.h = i;
        this.i = ipb1Var2;
        this.t = qim0Var;
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.X;
        Object obj3 = this.Z;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                otw.a(this.b, this.c, this.d, this.Y, this.e, this.f, (String) obj3, this.g, this.h, this.i, this.t, (b0k) obj, czo1.p(i | 1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.a(this.b, this.c, this.d, this.Y, this.e, this.f, ((maa) obj3).b(), this.g, this.h, this.i, this.t, x340Var2, (i >> 3) & 8);
                }
                break;
        }
        return rih1Var;
    }
}
