package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ms7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ jlw0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ s171 f;
    public final /* synthetic */ qim0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms7(jlw0 jlw0Var, int i, String str, String str2, s171 s171Var, qim0 qim0Var) {
        super(2);
        this.b = jlw0Var;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = s171Var;
        this.g = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    cso1.b(this.b, this.c, this.d, this.e, this.f, this.g, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                cso1.b(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms7(jlw0 jlw0Var, int i, String str, String str2, s171 s171Var, qim0 qim0Var, int i2) {
        super(2);
        this.b = jlw0Var;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = s171Var;
        this.g = qim0Var;
    }
}
