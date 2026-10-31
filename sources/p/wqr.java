package p;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wqr extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ err b;
    public final /* synthetic */ xpw c;
    public final /* synthetic */ oyn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wqr(err errVar, xpw xpwVar, oyn oynVar, byte b) {
        super(2);
        this.a = b;
        this.b = errVar;
        this.c = xpwVar;
        this.d = oynVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oyn oynVar = this.d;
        xpw xpwVar = this.c;
        err errVar = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qsw.c(new obk1((ConstraintLayout) errVar.e.b), apo.r(1157040048, new vqr(xpwVar, oynVar, (byte) 1), x340Var2), x340Var2, 48);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    mod.b(oi7.a.a(errVar.b), apo.r(199152625, new wqr(errVar, xpwVar, oynVar, objArr == true ? 1 : 0), x340Var4), x340Var4, 56);
                }
                break;
        }
        return rih1Var;
    }
}
