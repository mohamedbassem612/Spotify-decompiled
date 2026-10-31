package p;

import android.view.View;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lpk extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpk(tob1 tob1Var, int i) {
        super(2);
        this.a = (byte) 9;
        this.b = tob1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        lee1 lee1Var;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    d1u.b((uy30) tob1Var.getValue(), x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    qgr0 qgr0Var = new qgr0(cbx.a(x340Var4).a.c);
                    Object objT = x340Var4.T();
                    if (objT == fkj0.X) {
                        objT = new ygr0(tob1Var, 6);
                        x340Var4.s0(objT);
                    }
                    bzn1.e(null, null, false, null, qgr0Var, null, (ygr0) objT, null, x340Var4, 2097152, 175);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    Object objT2 = x340Var6.T();
                    if (objT2 == fkj0.X) {
                        objT2 = new ygr0(tob1Var, true);
                        x340Var6.s0(objT2);
                    }
                    bzn1.e(null, ali.a, false, null, ogr0.a, null, (ygr0) objT2, null, x340Var6, 2097200, 173);
                }
                break;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    Object objT3 = x340Var8.T();
                    if (objT3 == fkj0.X) {
                        objT3 = new ygr0(tob1Var, true);
                        x340Var8.s0(objT3);
                    }
                    bzn1.e(null, bli.a, false, null, ogr0.a, null, (ygr0) objT3, null, x340Var8, 2097200, 173);
                }
                break;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x340Var10.b0();
                } else {
                    b2p1.c(((vh20) tob1Var.getValue()).a, x340Var10, 0);
                }
                break;
            case 5:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (!x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x340Var12.b0();
                } else {
                    String str = ((xfh0) tob1Var.getValue()).d;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    u7h u7hVar = new u7h(u7h.j);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str2, uyn1.y(dug.e(nim0Var, v9c.s(p7h.M(new u7h[]{u7hVar, new u7h(((vex) zex.a.e).g)}), 0.0f, 0.0f, 14), null, 0.0f, 6), 16.0f, 8.0f), cbx.d(x340Var12).j, 0L, null, null, 0, false, null, 0, null, x340Var12, 0, 0, 2040);
                }
                break;
            case 6:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (!x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x340Var14.b0();
                } else {
                    View view = (View) tob1Var.getValue();
                    if (view != null) {
                        x340Var14.i0(1953103050);
                        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                        uwr uwrVar3 = cbx.a;
                        cvx cvxVar = cbx.b(x340Var14).b;
                        qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                        boolean zI = x340Var14.i(view);
                        Object objT4 = x340Var14.T();
                        if (zI || objT4 == fkj0.X) {
                            objT4 = new xy2(view, (byte) 7);
                            x340Var14.s0(objT4);
                        }
                        dm5.a((iu30) objT4, qim0VarB, (iu30) null, x340Var14, 0, 4);
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(1953103049);
                        x340Var14.r(false);
                    }
                }
                break;
            case 7:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (!x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x340Var16.b0();
                } else {
                    qim0 qim0VarN = anm1.N("page-title", nim0Var);
                    String strO0 = cwl1.o0(x340Var16, 2131961061);
                    if (((Boolean) tob1Var.getValue()).booleanValue()) {
                        x340Var16.i0(1199893964);
                        uwr uwrVar4 = cbx.a;
                        lee1Var = cbx.d(x340Var16).h;
                    } else {
                        x340Var16.i0(1199895176);
                        uwr uwrVar5 = cbx.a;
                        lee1Var = cbx.d(x340Var16).c;
                    }
                    x340Var16.r(false);
                    uwo1.e(strO0, qim0VarN, lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var16, 0, 0, 2040);
                }
                break;
            case 8:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (!x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x340Var18.b0();
                } else {
                    buo1.f(null, 0, (String) tob1Var.getValue(), 0.0f, x340Var18, 0, 27);
                }
                break;
            default:
                ((Number) obj2).intValue();
                k2g1.b(tob1Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lpk(tob1 tob1Var, byte b) {
        super(2);
        this.a = b;
        this.b = tob1Var;
    }
}
