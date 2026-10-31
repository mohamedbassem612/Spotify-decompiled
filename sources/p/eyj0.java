package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eyj0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dyj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eyj0(et90 et90Var, dyj0 dyj0Var, byte b) {
        super(2);
        this.a = b;
        this.b = dyj0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        String strK;
        String strK2;
        String strK3;
        byte b = this.a;
        r3u r3uVar = r3u.a;
        p3u p3uVar = p3u.a;
        k3u k3uVar = k3u.a;
        l3u l3uVar = l3u.a;
        rih1 rih1Var = rih1.a;
        dyj0 dyj0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strO = et90.o(dyj0Var, x340Var2);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strO, (qim0) null, cbx.d(x340Var2).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    v3u v3uVar = dyj0Var.a;
                    if (v3uVar.equals(l3uVar)) {
                        strK = x0d.k(x340Var4, -719398467, 2131958633, x340Var4, false);
                    } else if (v3uVar instanceof s3u) {
                        strK = x0d.k(x340Var4, -719394736, 2131958663, x340Var4, false);
                    } else if (v3uVar instanceof m3u) {
                        strK = x0d.k(x340Var4, -719390748, 2131958648, x340Var4, false);
                    } else if (v3uVar.equals(k3uVar)) {
                        strK = x0d.k(x340Var4, -719387194, 2131958645, x340Var4, false);
                    } else if (v3uVar.equals(p3uVar)) {
                        strK = x0d.k(x340Var4, -719383381, 2131958652, x340Var4, false);
                    } else {
                        if (!v3uVar.equals(r3uVar)) {
                            throw p3d1.k(x340Var4, -719399627, false);
                        }
                        strK = x0d.k(x340Var4, -719379545, 2131958659, x340Var4, false);
                    }
                    uwo1.e(strK, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2046);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    v3u v3uVar2 = dyj0Var.a;
                    if (v3uVar2.equals(l3uVar)) {
                        strK2 = x0d.k(x340Var6, 709229108, 2131958630, x340Var6, false);
                    } else if (v3uVar2 instanceof s3u) {
                        strK2 = x0d.k(x340Var6, 709233031, 2131958660, x340Var6, false);
                    } else if (v3uVar2 instanceof m3u) {
                        strK2 = x0d.k(x340Var6, 709237211, 2131958646, x340Var6, false);
                    } else if (v3uVar2.equals(k3uVar)) {
                        strK2 = x0d.k(x340Var6, 709240957, 2131958643, x340Var6, false);
                    } else if (v3uVar2.equals(p3uVar)) {
                        strK2 = x0d.k(x340Var6, 709244962, 2131958649, x340Var6, false);
                    } else {
                        if (!v3uVar2.equals(r3uVar)) {
                            throw p3d1.k(x340Var6, 709227730, false);
                        }
                        strK2 = x0d.k(x340Var6, 709248990, 2131958657, x340Var6, false);
                    }
                    uwo1.e(strK2, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2046);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    v3u v3uVar3 = dyj0Var.a;
                    if (v3uVar3.equals(l3uVar)) {
                        strK3 = x0d.k(x340Var8, 1392749475, 2131958631, x340Var8, false);
                    } else if (v3uVar3 instanceof s3u) {
                        strK3 = x0d.k(x340Var8, 1392753680, 2131958661, x340Var8, false);
                    } else if (v3uVar3 instanceof m3u) {
                        strK3 = x0d.k(x340Var8, 1392757956, 2131958647, x340Var8, false);
                    } else if (v3uVar3.equals(k3uVar)) {
                        strK3 = x0d.k(x340Var8, 1392761798, 2131958644, x340Var8, false);
                    } else if (v3uVar3.equals(p3uVar)) {
                        strK3 = x0d.k(x340Var8, 1392765899, 2131958650, x340Var8, false);
                    } else {
                        if (!v3uVar3.equals(r3uVar)) {
                            throw p3d1.k(x340Var8, 1392748112, false);
                        }
                        strK3 = x0d.k(x340Var8, 1392770023, 2131958658, x340Var8, false);
                    }
                    String str = strK3;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var8).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2042);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
        }
    }
}
