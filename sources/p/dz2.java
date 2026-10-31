package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dz2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ jb30 b;
    public final /* synthetic */ kp5 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz2(jb30 jb30Var, kp5 kp5Var, float f, float f2) {
        super(2);
        this.b = jb30Var;
        this.c = kp5Var;
        this.d = f;
        this.e = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                fz2.a(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    fz2.a(this.b, this.c, this.d, this.e, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz2(jb30 jb30Var, kp5 kp5Var, float f, float f2, int i) {
        super(2);
        this.b = jb30Var;
        this.c = kp5Var;
        this.d = f;
        this.e = f2;
    }
}
