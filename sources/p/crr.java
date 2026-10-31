package p;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class crr extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oyn b;
    public final /* synthetic */ err c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ crr(oyn oynVar, err errVar, byte b) {
        super(2);
        this.a = b;
        this.b = oynVar;
        this.c = errVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        lee1 lee1Var;
        xu30 xu30Var;
        xu30 xu30Var2;
        xu30 xu30Var3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oyn oynVar = this.b;
        err errVar = this.c;
        boolean z = false;
        byte b2 = 2;
        byte b3 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                qyn qynVar = oynVar.l;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    if (qynVar.b == 1) {
                        x340Var2.i0(357136361);
                        uwr uwrVar = cbx.a;
                        lee1Var = cbx.d(x340Var2).e;
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(357203817);
                        uwr uwrVar2 = cbx.a;
                        lee1Var = cbx.d(x340Var2).g;
                        x340Var2.r(false);
                    }
                    uvx uvxVar = new uvx(0, (pgx) null, 0, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 471);
                    j2i j2iVarR = null;
                    if (qynVar.b != 2 || oynVar.h == null) {
                        x340Var2.i0(357954946);
                        x340Var2.r(false);
                        xu30Var = null;
                    } else {
                        x340Var2.i0(357675947);
                        xu30 xu30VarR = apo.r(717701364, new zqr(oynVar, (byte) 0), x340Var2);
                        x340Var2.r(false);
                        xu30Var = xu30VarR;
                    }
                    if (oynVar.e.length() > 0) {
                        x340Var2.i0(358047544);
                        xu30 xu30VarR2 = apo.r(-698420088, new zqr(oynVar, (byte) 1), x340Var2);
                        x340Var2.r(false);
                        xu30Var2 = xu30VarR2;
                    } else {
                        x340Var2.i0(358314050);
                        x340Var2.r(false);
                        xu30Var2 = null;
                    }
                    if (oynVar.d.length() > 0) {
                        x340Var2.i0(361213853);
                        xu30 xu30VarR3 = apo.r(-546462170, new zqr(oynVar, (byte) 2), x340Var2);
                        x340Var2.r(false);
                        xu30Var3 = xu30VarR3;
                    } else {
                        x340Var2.i0(361475554);
                        x340Var2.r(false);
                        xu30Var3 = null;
                    }
                    if (oynVar.n) {
                        x340Var2.i0(361553024);
                        j2iVarR = apo.r(-1350448925, new e6j(errVar, oynVar, (byte) 18), x340Var2);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(361658082);
                        x340Var2.r(false);
                    }
                    jto1.b((qim0) null, uvxVar, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, xu30Var, xu30Var2, xu30Var3, j2iVarR, (xu30) null, (xu30) null, apo.r(-333482377, new nzd(oynVar, errVar, lee1Var, (byte) 16), x340Var2), x340Var2, 64, 196608, 25085);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(0, (wux) null, apo.r(1145586491, new crr(oynVar, errVar, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 3072, 7);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    qsw.c(new obk1((ConstraintLayout) errVar.e.b), apo.r(-1909806552, new crr(oynVar, errVar, b3), x340Var6), x340Var6, 48);
                }
                break;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    mod.b(oi7.a.a(errVar.b), apo.r(1258086599, new crr(errVar, oynVar, b2), x340Var8), x340Var8, 56);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ crr(err errVar, oyn oynVar, byte b) {
        super(2);
        this.a = b;
        this.c = errVar;
        this.b = oynVar;
    }
}
