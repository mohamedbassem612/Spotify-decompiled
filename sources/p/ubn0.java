package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ubn0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wbn0 b;
    public final /* synthetic */ rbn0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ubn0(wbn0 wbn0Var, rbn0 rbn0Var, byte b) {
        super(2);
        this.a = b;
        this.b = wbn0Var;
        this.c = rbn0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wbn0 wbn0Var = this.b;
        rbn0 rbn0Var = this.c;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean zG = x340Var2.g(wbn0Var.e());
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        obj3 = objT;
                        vh1 vh1VarA = wbn0Var.c.a.m().a(wbn0Var.e());
                        x340Var2.s0(vh1VarA);
                        obj3 = vh1VarA;
                    }
                    obj3 = objT;
                    i1o1.e((vh1) obj3, new uho(rbn0Var.a, (String) null, qho.a, (nho) null, (String) null, (Function0) null, 250), wbn0Var.e(), (qim0) null, (ipb1) null, (vu30) null, (xu30) null, 0, (xu30) null, x340Var2, 8, 252);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    otw.c(wbn0Var.e, new qy1(rbn0Var.a, 2), (qim0) null, (ipb1) null, x340Var4, 8, 12);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    sgc1.m(wbn0Var.f.a(), apo.r(-1919228403, new ubn0(wbn0Var, rbn0Var, z ? (byte) 1 : (byte) 0), x340Var6), apo.r(2071881358, new ubn0(wbn0Var, rbn0Var, b2), x340Var6), x340Var6, 432);
                }
                break;
        }
        return rih1Var;
    }
}
