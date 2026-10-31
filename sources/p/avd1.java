package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class avd1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zv10 b;
    public final /* synthetic */ ct10 c;
    public final /* synthetic */ dvd1 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ avd1(zv10 zv10Var, ct10 ct10Var, dvd1 dvd1Var, String str, byte b) {
        super(2);
        this.a = b;
        this.b = zv10Var;
        this.c = ct10Var;
        this.d = dvd1Var;
        this.e = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dvd1 dvd1Var = this.d;
        ct10 ct10Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    zv10 zv10Var = this.b;
                    zv10Var.getClass();
                    otw.c(zv10Var, new vv10(new sv10(ct10Var.a, dvd1Var.a), ct10Var.b, Long.valueOf(ct10Var.c), ct10Var.d, 0, 0, this.e, (String) null, (String) null, false, 1968), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    zv10 zv10Var2 = this.b;
                    zv10Var2.getClass();
                    otw.c(zv10Var2, new vv10(new sv10(ct10Var.a, dvd1Var.a), ct10Var.b, Long.valueOf(ct10Var.c), ct10Var.d, 0, 0, this.e, (String) null, (String) null, false, 1968), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                }
                break;
        }
        return rih1Var;
    }
}
