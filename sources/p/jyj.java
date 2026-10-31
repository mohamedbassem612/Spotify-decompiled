package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jyj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kyj b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jyj(kyj kyjVar, j2i j2iVar, Object obj, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = kyjVar;
        this.c = j2iVar;
        this.d = obj;
        this.e = iu30Var;
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
                    this.b.b.b(6, apo.r(-1460138299, new vuj(this.c, this.d, this.e, (byte) 1), x340Var2), x340Var2);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    qsw.a(apo.r(-1244514171, new jyj(this.b, this.c, this.d, this.e, (byte) 0), x340Var4), x340Var4);
                }
                break;
        }
        return rih1Var;
    }
}
