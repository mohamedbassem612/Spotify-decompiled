package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dne1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dne1(byte b, long j) {
        super(2);
        this.a = b;
        this.b = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.b;
        switch (b) {
            case 0:
                return new u7h(j);
            case 1:
                return new u7h(j);
            case 2:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b6j0.Z0.c(1.0f, (j + 500) / 1000, 0L, b0kVar2, 6);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    w0h1.a(cnx.c, isl.a, (qim0) null, this.b, 0L, false, x340Var2, cnx.d | 48, 52);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
        }
    }
}
