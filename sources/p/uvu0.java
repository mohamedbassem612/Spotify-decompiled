package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uvu0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hvu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uvu0(hvu0 hvu0Var, byte b) {
        super(3);
        this.a = b;
        this.b = hvu0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        String strN0;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        hvu0 hvu0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                gvu0 gvu0Var = hvu0Var.d;
                if (gvu0Var instanceof fvu0) {
                    x340 x340Var2 = x340Var;
                    strN0 = x0d.k(x340Var2, -2063144169, 2131959911, x340Var2, false);
                } else if (gvu0Var instanceof evu0) {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-2063139422);
                    strN0 = cwl1.n0(2131959910, new Object[]{((evu0) gvu0Var).a}, x340Var3);
                    x340Var3.r(false);
                } else {
                    if (gvu0Var != null) {
                        throw p3d1.k(x340Var, -2063147383, false);
                    }
                    x340 x340Var4 = x340Var;
                    x340Var4.i0(467356309);
                    x340Var4.r(false);
                    strN0 = null;
                }
                String str = strN0;
                if (str != null) {
                    x340 x340Var5 = x340Var;
                    x340Var5.i0(467425533);
                    zic0 zic0Var = new zic0(1);
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, anm1.N("playlist_reaction_card_pretitle", nim0Var), (lee1) null, cbx.a(x340Var5).b.b, (a0e1) null, (iu30) null, 2, false, zic0Var, 0, (qx8) null, x340Var5, 0, 0, 1716);
                    x340Var5.r(false);
                } else {
                    x340 x340Var6 = x340Var;
                    x340Var6.i0(467685344);
                    x340Var6.r(false);
                }
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                String str2 = hvu0Var.a;
                zic0 zic0Var2 = new zic0(1);
                uwo1.e(str2, anm1.N("playlist_reaction_card_title", nim0Var), (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, zic0Var2, 0, (qx8) null, (b0k) obj2, 0, 0, 1724);
                return rih1Var;
        }
    }
}
