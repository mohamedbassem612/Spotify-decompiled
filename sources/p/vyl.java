package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vyl extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ uyl b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ aul d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyl(uyl uylVar, vu30 vu30Var, aul aulVar, int i) {
        super(2);
        this.b = uylVar;
        this.c = vu30Var;
        this.d = aulVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        j2i j2iVarR;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        aul aulVar = this.d;
        vu30 vu30Var = this.c;
        uyl uylVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    if (vu30Var != null) {
                        x340Var2.i0(-991626153);
                        j2iVarR = apo.r(2142565870, new nzd(uylVar, aulVar, vu30Var, (byte) 8), x340Var2);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-991354748);
                        x340Var2.r(false);
                        j2iVarR = kfi.c;
                    }
                    j2iVarR.invoke(apo.r(1039608243, new zzj(uylVar, (byte) 4), x340Var2), x340Var2, 6);
                }
                break;
            default:
                ((Number) obj2).intValue();
                xpn1.b(uylVar, vu30Var, aulVar, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyl(vu30 vu30Var, uyl uylVar, aul aulVar) {
        super(2);
        this.c = vu30Var;
        this.b = uylVar;
        this.d = aulVar;
    }
}
