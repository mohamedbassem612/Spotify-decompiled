package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f51 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ t51 d;
    public final /* synthetic */ t51 e;
    public final /* synthetic */ t51 f;
    public final /* synthetic */ v51 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s51(f51 f51Var, String str, t51 t51Var, t51 t51Var2, t51 t51Var3, v51 v51Var, byte b) {
        super(2);
        this.a = b;
        this.b = f51Var;
        this.c = str;
        this.d = t51Var;
        this.e = t51Var2;
        this.f = t51Var3;
        this.g = v51Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iC = l1d.C(this.b.c);
                    t51 t51Var = this.d;
                    t51 t51Var2 = this.e;
                    if (iC != 0) {
                        t51 t51Var3 = this.f;
                        if (iC == 1) {
                            x340Var2.i0(-179684467);
                            fq7.k(this.c, t51Var3, t51Var2, null, x340Var2, 0, 8);
                            x340Var2.r(false);
                        } else {
                            if (iC != 2) {
                                throw p3d1.k(x340Var2, -179694283, false);
                            }
                            x340Var2.i0(-1275006093);
                            v51 v51Var = this.g;
                            boolean z = v51Var.c;
                            boolean z2 = v51Var.d;
                            if (z || z2) {
                                x340Var2.i0(-1274754249);
                                fq7.s(t51Var3, t51Var2, null, x340Var2, 0);
                                x340Var2.r(false);
                            } else {
                                x340Var2.i0(-1274575937);
                                fq7.t(t51Var, t51Var2, null, x340Var2, 0);
                                x340Var2.r(false);
                            }
                            x340Var2.r(false);
                        }
                    } else {
                        x340Var2.i0(-179691973);
                        fq7.m(this.c, t51Var, t51Var2, null, x340Var2, 0);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(1041152637, new s51(this.b, this.c, this.d, this.e, this.f, this.g, (byte) 0), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
