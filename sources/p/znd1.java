package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class znd1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iod1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ znd1(iod1 iod1Var, byte b) {
        super(2);
        this.a = b;
        this.b = iod1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iod1 iod1Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i = 0;
                    for (fod1 fod1Var : iod1Var.getTabContentList()) {
                        int i2 = i + 1;
                        boolean z = iod1Var.getSelectedTabIndex() == i;
                        boolean zI = x340Var2.i(iod1Var) | x340Var2.e(i) | x340Var2.g(fod1Var);
                        Object objT = x340Var2.T();
                        if (zI || objT == fkj0.X) {
                            objT = new ynd1(iod1Var, i, fod1Var, (byte) 0);
                            x340Var2.s0(objT);
                        }
                        m5n1.d(z, new gbx(z50.c, (Function0) objT), apo.r(-661041410, new sdb1(fod1Var, iod1Var, (byte) 16), x340Var2), (qim0) null, (idn0) null, (max) null, 0L, 0L, x340Var2, 24960, 488);
                        i = i2;
                    }
                } else {
                    x340Var2.b0();
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (iod1Var.getTabContentList().isEmpty()) {
                    x340Var4.i0(-1947112626);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-1948905852);
                    int selectedTabIndex = iod1Var.getSelectedTabIndex();
                    uwr uwrVar = cbx.a;
                    jhc1.d(selectedTabIndex, uyn1.z(dsa0.m(x340Var4, 2131167115), 0.0f, 2, dug.f(nim0.a, cbx.a(x340Var4).a.c, d4o1.a)), 0L, 0, (xu30) null, apo.r(231138938, new znd1(iod1Var, b2), x340Var4), x340Var4, 196608, 28);
                    x340Var4.r(false);
                }
                break;
            default:
                ((Number) obj2).intValue();
                iod1Var.a((b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znd1(iod1 iod1Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = iod1Var;
    }
}
