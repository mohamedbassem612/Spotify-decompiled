package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fix extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gbx b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ idn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fix(gbx gbxVar, qim0 qim0Var, idn0 idn0Var) {
        super(2);
        this.a = (byte) 2;
        this.b = gbxVar;
        this.c = qim0Var;
        this.d = idn0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        idn0 idn0Var = this.d;
        qim0 qim0Var = this.c;
        gbx gbxVar = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                lro1.d(gbxVar, qim0Var, idn0Var, (b0k) obj, czo1.p(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                lro1.i(gbxVar, qim0Var, idn0Var, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    poo1.f(this.b, pex.b, yoo1.z(x340Var2), this.c, (String) null, jvi.b, (vu30) null, this.d, (ga80) null, (vzq0) null, (vu30) null, x340Var2, 1572864, 0, 7840);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fix(gbx gbxVar, qim0 qim0Var, idn0 idn0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = gbxVar;
        this.c = qim0Var;
        this.d = idn0Var;
    }
}
