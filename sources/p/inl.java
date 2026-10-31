package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class inl extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ knl b;
    public final /* synthetic */ nnl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inl(nnl nnlVar, knl knlVar) {
        super(2);
        this.a = (byte) 0;
        this.c = nnlVar;
        this.b = knlVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nnl nnlVar = this.c;
        knl knlVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    lzh lzhVar = nnlVar.h;
                    if (lzhVar == null) {
                        x340Var2.i0(80232312);
                    } else {
                        x340Var2.i0(80232313);
                        knlVar.c(lzhVar, x340Var2, 0);
                    }
                    x340Var2.r(false);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    knlVar.c.b(70, apo.r(-1933028140, new inl(nnlVar, knlVar), x340Var4), x340Var4);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    qsw.a(apo.r(-569998572, new inl(knlVar, nnlVar, b2), x340Var6), x340Var6);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ inl(knl knlVar, nnl nnlVar, byte b) {
        super(2);
        this.a = b;
        this.b = knlVar;
        this.c = nnlVar;
    }
}
