package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b7g0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ h7g0 b;
    public final /* synthetic */ pbq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7g0(pbq pbqVar, h7g0 h7g0Var) {
        super(2);
        this.c = pbqVar;
        this.b = h7g0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pbq pbqVar = this.c;
        h7g0 h7g0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.c((md1) pbqVar.f, new ld1(h7g0Var.a, h7g0Var.c), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nmn1.e(h7g0Var.c, h7g0Var.b, apo.r(-2125947810, new b7g0(pbqVar, h7g0Var), x340Var4), x340Var4, 384);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7g0(h7g0 h7g0Var, pbq pbqVar) {
        super(2);
        this.b = h7g0Var;
        this.c = pbqVar;
    }
}
