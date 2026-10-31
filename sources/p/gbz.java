package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gbz extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k540 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gbz(k540 k540Var, byte b) {
        super(2);
        this.a = b;
        this.b = k540Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        i540 i540Var = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String str = i540Var.a;
                    bbp1.c(0, 2, str, str, x340Var2, (qim0) null);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (!(i540Var instanceof i540)) {
                    x340Var4.i0(318044982);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(317807615);
                    nyx.a(2, (wux) null, apo.r(1830856506, new gbz(i540Var, objArr == true ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
