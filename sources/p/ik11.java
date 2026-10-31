package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ik11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hk11 b;
    public final /* synthetic */ et90 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik11(hk11 hk11Var, et90 et90Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = hk11Var;
        this.c = et90Var;
        this.d = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        et90 et90Var = this.c;
        fk11 fk11Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (fk11Var instanceof gk11) {
                    x340Var2.i0(-1947334940);
                    kw7.b(x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    if (!(fk11Var instanceof fk11)) {
                        throw p3d1.k(x340Var2, -1947335691, false);
                    }
                    x340Var2.i0(-1947332415);
                    fk11 fk11Var2 = fk11Var;
                    j2i j2iVarR = apo.r(-852926023, new hov0(et90Var, fk11Var, (byte) 26), x340Var2);
                    boolean zG = x340Var2.g(fk11Var2.a);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new gbx(z50.c, new zkz0(iu30Var, fk11Var, (byte) 21));
                        x340Var2.s0(objT);
                    }
                    kw7.a(fk11Var2, j2iVarR, (gbx) objT, x340Var2, 48);
                    x340Var2.r(false);
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(-1231075279, new ik11(fk11Var, et90Var, iu30Var, b2), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
