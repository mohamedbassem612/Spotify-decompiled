package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class id6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tza b;
    public final /* synthetic */ hd6 c;
    public final /* synthetic */ jd6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id6(tza tzaVar, hd6 hd6Var, jd6 jd6Var, byte b) {
        super(2);
        this.a = b;
        this.b = tzaVar;
        this.c = hd6Var;
        this.d = jd6Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jd6 jd6Var = this.d;
        hd6 hd6Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    i1o1.e(this.b, new nza(hd6Var.d), (d0r) jd6Var.b, (qim0) null, (ipb1) null, v6i.a, (xu30) null, 0, (xu30) null, x340Var2, 196608, 236);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    i1o1.e(this.b, new nza(hd6Var.e), (d0r) jd6Var.b, (qim0) null, (ipb1) null, v6i.b, (xu30) null, 0, (xu30) null, x340Var4, 196608, 236);
                }
                break;
        }
        return rih1Var;
    }
}
