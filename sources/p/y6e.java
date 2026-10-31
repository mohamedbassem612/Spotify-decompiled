package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y6e extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t6e b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ t9p d;
    public final /* synthetic */ d0r e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6e(t6e t6eVar, iu30 iu30Var, t9p t9pVar, d0r d0rVar) {
        super(2);
        this.a = (byte) 1;
        this.b = t6eVar;
        this.c = iu30Var;
        this.d = t9pVar;
        this.e = d0rVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                dio1.a(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t6e t6eVar = this.b;
                    int iC = l1d.C(t6eVar.c);
                    iu30 iu30Var = this.c;
                    if (iC == 0) {
                        x340Var2.i0(-527388220);
                        dio1.d(t6eVar, iu30Var, this.d, this.e, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        if (iC != 1) {
                            throw p3d1.k(x340Var2, -527393515, false);
                        }
                        x340Var2.i0(-527391740);
                        dio1.a(t6eVar, iu30Var, this.d, this.e, x340Var2, 0);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                dio1.d(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6e(t6e t6eVar, iu30 iu30Var, t9p t9pVar, d0r d0rVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = t6eVar;
        this.c = iu30Var;
        this.d = t9pVar;
        this.e = d0rVar;
    }
}
