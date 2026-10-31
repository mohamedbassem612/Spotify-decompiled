package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oyj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qyj b;
    public final /* synthetic */ j2i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oyj(qyj qyjVar, j2i j2iVar, byte b) {
        super(2);
        this.a = b;
        this.b = qyjVar;
        this.c = j2iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.c;
        qyj qyjVar = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qyjVar.b.b(6, apo.r(260328632, new pu2(j2iVar, (byte) 13), x340Var2), x340Var2);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    qsw.a(apo.r(-719214984, new oyj(qyjVar, j2iVar, objArr == true ? 1 : 0), x340Var4), x340Var4);
                }
                break;
        }
        return rih1Var;
    }
}
