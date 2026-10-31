package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nc60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ta60 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nc60(ta60 ta60Var, byte b) {
        super(2);
        this.a = b;
        this.b = ta60Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ta60 ta60Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    la60 la60Var = ta60Var.e;
                    fa60 fa60Var = ta60Var.c;
                    ga60 ga60Var = (ga60) la60Var;
                    long jE = z4p1.e(fa60Var.b);
                    uwr uwrVar = cbx.a;
                    uyx uyxVarD = cbx.d(x340Var2);
                    Object obj3 = ajx.a.b;
                    kno1.g(ga60Var, ta60Var.g, jE, z4p1.e(fa60Var.a), new fb60(150.0f, uyxVarD.d.a.b, uyxVarD.b.a.b), x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    ha60 ha60Var = (ha60) ta60Var.e;
                    long jE2 = z4p1.e(ta60Var.c.b);
                    if (ef.b(x340Var4).compareTo(af.d) < 0) {
                        x340Var4.i0(-145876742);
                        ioo1.l(ha60Var, jE2, x340Var4, 0);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-145951979);
                        ioo1.j(ha60Var, jE2, x340Var4, 0);
                        x340Var4.r(false);
                    }
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    poo1.o((ia60) ta60Var.e, z4p1.e(ta60Var.c.b), yoo1.A(x340Var6), x340Var6, 0);
                }
                break;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    too1.h((ja60) ta60Var.e, z4p1.e(ta60Var.c.b), yoo1.A(x340Var8), x340Var8, 0);
                }
                break;
            default:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x340Var10.b0();
                } else {
                    la60 la60Var2 = ta60Var.e;
                    fa60 fa60Var2 = ta60Var.c;
                    voo1.g((ka60) la60Var2, z4p1.e(fa60Var2.b), z4p1.e(fa60Var2.a), yoo1.A(x340Var10), x340Var10, 0);
                }
                break;
        }
        return rih1Var;
    }
}
