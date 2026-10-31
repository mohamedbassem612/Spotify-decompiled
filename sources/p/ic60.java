package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ic60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ fc60 b;
    public final /* synthetic */ gc60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic60(fc60 fc60Var, gc60 gc60Var) {
        super(2);
        this.b = fc60Var;
        this.c = gc60Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        j2i j2iVarR;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fc60 fc60Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.c(this.c, new fc60(fc60Var.a, fc60Var.b, fc60Var.c, fc60Var.d, fc60Var.e, true), (qim0) null, (ipb1) null, x340Var2, 72, 12);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    if (fc60Var == null) {
                        x340Var4.i0(-855936835);
                        x340Var4.r(false);
                        j2iVarR = null;
                    } else {
                        x340Var4.i0(-855936834);
                        j2iVarR = apo.r(1899078713, new ic60(this.c, fc60Var), x340Var4);
                        x340Var4.r(false);
                    }
                    bzn1.e((qim0) null, (vu30) null, false, j2iVarR, rgr0.a, (ngr0) null, (ygr0) null, (Function0) null, x340Var4, 0, 231);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic60(gc60 gc60Var, fc60 fc60Var) {
        super(2);
        this.c = gc60Var;
        this.b = fc60Var;
    }
}
