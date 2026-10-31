package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cik0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kak0 b;
    public final /* synthetic */ wik0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cik0(kak0 kak0Var, wik0 wik0Var, byte b) {
        super(2);
        this.a = b;
        this.b = kak0Var;
        this.c = wik0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        wik0 wik0Var = this.c;
        kak0 kak0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2);
                rih1 rih1Var = rih1.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var;
                }
                pdm0 pdm0Var = kak0Var.e;
                if (pdm0Var instanceof mdm0) {
                    x340Var2.i0(1525005498);
                    otw.c(wik0Var.R0, rih1Var, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                    x340Var2.r(false);
                    return rih1Var;
                }
                if (pdm0Var instanceof ldm0) {
                    x340Var2.i0(1525009564);
                    nm1 nm1Var = wik0Var.S0;
                    ruq0 ruq0Var = ((ldm0) pdm0Var).a;
                    otw.c(nm1Var, new mak0(ruq0Var.a, ruq0Var.b), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(false);
                    return rih1Var;
                }
                if (pdm0Var instanceof kdm0) {
                    x340Var2.i0(1525019589);
                    hvj0 hvj0Var = wik0Var.Q0;
                    Integer num = kak0Var.S0.b.N0;
                    otw.c(hvj0Var, new lvj0(num != null ? num.intValue() : ((kdm0) pdm0Var).a, i2p1.j(kak0Var)), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(false);
                    return rih1Var;
                }
                if (pdm0Var instanceof odm0) {
                    x340Var2.i0(1525032498);
                    odm0 odm0Var = (odm0) pdm0Var;
                    otw.c(wik0Var.T0, new smk0(odm0Var.c, odm0Var.d, odm0Var.e, odm0Var.f, wik0Var.b.f0), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(false);
                    return rih1Var;
                }
                if (!(pdm0Var instanceof ndm0)) {
                    throw p3d1.k(x340Var2, 1525003561, false);
                }
                x340Var2.i0(31894091);
                x340Var2.r(false);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                boolean zY2 = x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (!zY2) {
                    x340Var4.b0();
                    return rih1Var2;
                }
                pdm0 pdm0Var2 = kak0Var.e;
                if (pdm0Var2 instanceof mdm0) {
                    x340Var4.i0(1744400133);
                    otw.c(wik0Var.R0, rih1Var2, (qim0) null, (ipb1) null, x340Var4, 48, 12);
                    x340Var4.r(false);
                    return rih1Var2;
                }
                if (pdm0Var2 instanceof ldm0) {
                    x340Var4.i0(1744404199);
                    nm1 nm1Var2 = wik0Var.S0;
                    ruq0 ruq0Var2 = ((ldm0) pdm0Var2).a;
                    otw.c(nm1Var2, new mak0(ruq0Var2.a, ruq0Var2.b), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                    x340Var4.r(false);
                    return rih1Var2;
                }
                if (pdm0Var2 instanceof kdm0) {
                    x340Var4.i0(1744414224);
                    hvj0 hvj0Var2 = wik0Var.Q0;
                    Integer num2 = kak0Var.S0.b.N0;
                    otw.c(hvj0Var2, new lvj0(num2 != null ? num2.intValue() : ((kdm0) pdm0Var2).a, i2p1.j(kak0Var)), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                    x340Var4.r(false);
                    return rih1Var2;
                }
                if (pdm0Var2 instanceof odm0) {
                    x340Var4.i0(1744427133);
                    odm0 odm0Var2 = (odm0) pdm0Var2;
                    otw.c(wik0Var.T0, new smk0(odm0Var2.c, odm0Var2.d, odm0Var2.e, odm0Var2.f, wik0Var.b.f0), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                    x340Var4.r(false);
                    return rih1Var2;
                }
                if (!(pdm0Var2 instanceof ndm0)) {
                    throw p3d1.k(x340Var4, 1744398196, false);
                }
                x340Var4.i0(-1756806816);
                x340Var4.r(false);
                return rih1Var2;
        }
    }
}
