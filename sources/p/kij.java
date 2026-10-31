package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kij extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t591 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kij(t591 t591Var, byte b) {
        super(3);
        this.a = b;
        this.b = t591Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        t591 t591Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                qim0 qim0VarR = u291.r(nim0.a, 24.0f);
                q591 q591Var = t591Var.d;
                if (q591Var instanceof p591) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(895702249);
                    w0h1.a(((p591) q591Var).a, isl.a, qim0VarR, cbx.a(x340Var2).b.a, 0L, false, x340Var2, 56, 48);
                    x340Var2.r(false);
                } else {
                    if (!(q591Var instanceof o591)) {
                        throw p3d1.k(x340Var, 167438454, false);
                    }
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(895960820);
                    pl70.a(i3o1.n(2131233386, x340Var3, 0), qim0VarR, cbx.a(x340Var3).b.a, x340Var3, 56, 0);
                    x340Var3.r(false);
                }
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                uwo1.e(t591Var.c, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, (b0k) obj2, 0, 0, 1790);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                uwo1.e(t591Var.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
        }
    }
}
