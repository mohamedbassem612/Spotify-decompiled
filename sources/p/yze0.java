package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yze0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jsl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yze0(jsl jslVar, byte b) {
        super(2);
        this.a = b;
        this.b = jslVar;
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
                    w0h1.a(fux.c, this.b, (qim0) null, 0L, 0L, false, x340Var2, fux.d, 60);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    w0h1.a(fux.c, this.b, (qim0) null, 0L, 0L, false, x340Var4, fux.d, 60);
                }
                break;
        }
        return rih1Var;
    }
}
