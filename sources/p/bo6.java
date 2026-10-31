package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bo6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gw70 b;
    public final /* synthetic */ em3 c;
    public final /* synthetic */ xfx d;
    public final /* synthetic */ qfl1 e;
    public final /* synthetic */ co6 f;
    public final /* synthetic */ tob1 g;
    public final /* synthetic */ tob1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo6(em3 em3Var, xfx xfxVar, gw70 gw70Var, qfl1 qfl1Var, co6 co6Var, tob1 tob1Var, tob1 tob1Var2) {
        super(2);
        this.a = (byte) 0;
        this.c = em3Var;
        this.d = xfxVar;
        this.b = gw70Var;
        this.e = qfl1Var;
        this.f = co6Var;
        this.g = tob1Var;
        this.h = tob1Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    vn6 vn6Var = (vn6) this.g.getValue();
                    iu30 iu30Var = (iu30) this.h.getValue();
                    co6 co6Var = this.f;
                    dko1.a(vn6Var, iu30Var, this.c, this.d, this.b, this.e, (q7r0) co6Var.b, (bnr) co6Var.c, (ggr) co6Var.d, null, x340Var2, 262144);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    kiv kivVar = oi7.a;
                    gw70 gw70Var = this.b;
                    mod.b(kivVar.a(gw70Var), apo.r(125572011, new bo6(this.c, this.d, gw70Var, this.e, this.f, this.g, this.h), x340Var4), x340Var4, 56);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-1375449365, new bo6(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (byte) 1), x340Var6), x340Var6, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bo6(gw70 gw70Var, em3 em3Var, xfx xfxVar, qfl1 qfl1Var, co6 co6Var, tob1 tob1Var, tob1 tob1Var2, byte b) {
        super(2);
        this.a = b;
        this.b = gw70Var;
        this.c = em3Var;
        this.d = xfxVar;
        this.e = qfl1Var;
        this.f = co6Var;
        this.g = tob1Var;
        this.h = tob1Var2;
    }
}
