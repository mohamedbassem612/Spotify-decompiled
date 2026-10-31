package p;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xef extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tff b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xef(tff tffVar, byte b) {
        super(2);
        this.a = b;
        this.b = tffVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        dxb dxbVar;
        dxb dxbVar2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tff tffVar = this.b;
                    String strA = tffVar.c.a();
                    boolean zG = x340Var2.g(strA);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        zu00 zu00Var = tffVar.h.a;
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        dxbVar = null;
                        lt20 lt20Var = new lt20(rqt0.u(new evz(new p3t(yoi1.g(zu00Var.b(new oi(yon1.s2().c, false, new kq00(strA, (byte) 4)))), (byte) 18), strA, (byte) 4)), new kn1(strA, null, (byte) 1), (byte) 0);
                        x340Var2.s0(lt20Var);
                        objT = lt20Var;
                    } else {
                        dxbVar = null;
                    }
                    dxb dxbVar3 = dxbVar;
                    ven0 ven0VarJ = f4p1.j((mr20) objT, (Object) null, (iac0) null, x340Var2, 48, 14);
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        wef wefVar = new wef(tffVar.j.a, (byte) 0);
                        x340Var2.s0(wefVar);
                        objT2 = wefVar;
                    }
                    ven0 ven0VarJ2 = f4p1.j((mr20) objT2, Boolean.FALSE, (iac0) null, x340Var2, 48, 14);
                    wat watVar = (wat) x340Var2.k(t4k.h);
                    WeakHashMap weakHashMap = shk1.a;
                    dxb dxbVar4 = (View) x340Var2.k(AndroidCompositionLocals_androidKt.f);
                    while (true) {
                        if (dxbVar4 == null) {
                            dxbVar2 = dxbVar3;
                        } else {
                            dxbVar2 = (dxb) shk1.a.get(dxbVar4);
                            if (dxbVar2 == null) {
                                dxb parent = dxbVar4.getParent();
                                dxbVar4 = parent instanceof View ? (View) parent : dxbVar3;
                            }
                        }
                    }
                    int iS = dxbVar2 != null ? dxbVar2.a.s() : 0;
                    u85 u85Var = (erl1) x340Var2.k(szf0.b);
                    if (u85Var == null) {
                        x340Var2.i0(-241884180);
                        WeakHashMap weakHashMap2 = osl1.x;
                        u85Var = lhc.g(x340Var2).g;
                    } else {
                        x340Var2.i0(-241885792);
                    }
                    x340Var2.r(false);
                    int iD = iS - u85Var.d(watVar);
                    x340Var2.i0(2074618896);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    int iI0 = watVar.i0(12.0f);
                    x340Var2.r(false);
                    int i = iD - iI0;
                    int i2 = i < 0 ? 0 : i;
                    String strO0 = cwl1.o0(x340Var2, 2131957490);
                    String strO1 = cwl1.o0(x340Var2, 2131957489);
                    r3s0 r3s0Var = (r3s0) ven0VarJ.getValue();
                    dxb dxbVar5 = r3s0Var != null ? r3s0Var.a : dxbVar3;
                    String strO2 = cwl1.o0(x340Var2, 2131957479);
                    String strO3 = cwl1.o0(x340Var2, 2131957478);
                    boolean zI = x340Var2.i(tffVar);
                    Object objT3 = x340Var2.T();
                    if (zI || objT3 == m4cVar) {
                        objT3 = new lwe(tffVar, (byte) 3);
                        x340Var2.s0(objT3);
                    }
                    hso1.j(strO0, strO1, dxbVar5, strO2, strO3, (Function0) objT3, apo.r(-81186298, new vqa(strA, i2, tffVar, ven0VarJ, ven0VarJ2), x340Var2), x340Var2, 1572864);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objT4 = x340Var4.T();
                    m4c m4cVar2 = fkj0.X;
                    tff tffVar2 = this.b;
                    if (objT4 == m4cVar2) {
                        wef wefVar2 = new wef(tffVar2.j.a, (byte) 1);
                        x340Var4.s0(wefVar2);
                        objT4 = wefVar2;
                    }
                    ven0 ven0VarJ3 = f4p1.j((mr20) objT4, Boolean.FALSE, (iac0) null, x340Var4, 48, 14);
                    Object objT5 = x340Var4.T();
                    if (objT5 == m4cVar2) {
                        oql oqlVar = tffVar2.k;
                        objT5 = hu20.e(new dkm((mr20) oqlVar.b, (byte) 12), new tno((lnm) null, (v5n) oqlVar.c, (byte) 0));
                        x340Var4.s0(objT5);
                    }
                    ven0 ven0VarJ4 = f4p1.j((mr20) objT5, (Object) null, (iac0) null, x340Var4, 48, 14);
                    if (tffVar2.c.c) {
                        x340Var4.i0(1604538725);
                        Object objT6 = x340Var4.T();
                        if (objT6 == m4cVar2) {
                            objT6 = q1o1.u((laa) tffVar2.l.get(), (qim0) null, (FrameLayout.LayoutParams) null, 7);
                            x340Var4.s0(objT6);
                        }
                        xpw xpwVar = (xpw) objT6;
                        Object objT7 = x340Var4.T();
                        if (objT7 == m4cVar2) {
                            objT7 = q1o1.u((laa) tffVar2.m.get(), (qim0) null, (FrameLayout.LayoutParams) null, 7);
                            x340Var4.s0(objT7);
                        }
                        xpw xpwVar2 = (xpw) objT7;
                        Object objT8 = x340Var4.T();
                        if (objT8 == m4cVar2) {
                            objT8 = q1o1.u((laa) tffVar2.n.get(), (qim0) null, (FrameLayout.LayoutParams) null, 7);
                            x340Var4.s0(objT8);
                        }
                        xpw xpwVar3 = (xpw) objT8;
                        Object objT9 = x340Var4.T();
                        if (objT9 == m4cVar2) {
                            objT9 = (knf) tffVar2.p.get();
                            x340Var4.s0(objT9);
                        }
                        objT9.getClass();
                        knf knfVar = (knf) objT9;
                        Object objT10 = x340Var4.T();
                        if (objT10 == m4cVar2) {
                            objT10 = (c9f) tffVar2.q.get();
                            x340Var4.s0(objT10);
                        }
                        objT10.getClass();
                        c9f c9fVar = (c9f) objT10;
                        Object objT11 = x340Var4.T();
                        if (objT11 == m4cVar2) {
                            objT11 = (fu20) tffVar2.o.c;
                            x340Var4.s0(objT11);
                        }
                        jld0 jld0Var = (jld0) f4p1.j((mr20) objT11, new jld0(false, 0L), (iac0) null, x340Var4, 0, 14).getValue();
                        boolean zBooleanValue = ((Boolean) ven0VarJ3.getValue()).booleanValue();
                        sno snoVar = (sno) ven0VarJ4.getValue();
                        String str = snoVar != null ? snoVar.a : null;
                        sno snoVar2 = (sno) ven0VarJ4.getValue();
                        hso1.l(jld0Var, zBooleanValue, str, snoVar2 != null ? snoVar2.b : null, apo.r(1706077593, new a7e(knfVar, tffVar2, (byte) 11), x340Var4), apo.r(-1303827174, new qff(c9fVar, (byte) 0), x340Var4), apo.r(-18764645, new rff(xpwVar2, (byte) 0), x340Var4), apo.r(1266297884, new rff(xpwVar, (byte) 1), x340Var4), apo.r(-1743606883, new rff(xpwVar3, (byte) 2), x340Var4), x340Var4, 115040256);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(1605844321);
                        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                        uwr uwrVar2 = cbx.a;
                        qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var4).a.a.a(), d4o1.a);
                        u85 u85Var2 = (erl1) x340Var4.k(szf0.b);
                        if (u85Var2 == null) {
                            x340Var4.i0(-241884180);
                            WeakHashMap weakHashMap3 = osl1.x;
                            u85Var2 = lhc.g(x340Var4).g;
                        } else {
                            x340Var4.i0(-241885792);
                        }
                        x340Var4.r(false);
                        qim0 qim0VarY = too1.y(qim0VarF2, new bgc0(u85Var2, 32));
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        int iHashCode = Long.hashCode(x340Var4.T);
                        xos0 xos0VarM = x340Var4.m();
                        qim0 qim0VarE = zr7.E(x340Var4, qim0VarY);
                        hzj.A.getClass();
                        if (x340Var4.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(hmb0.t1);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(gfh0VarC, x340Var4, y580.O0);
                        nko1.H(xos0VarM, x340Var4, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                        nko1.F(x340Var4);
                        nko1.H(qim0VarE, x340Var4, y580.Y);
                        boolean zBooleanValue2 = ((Boolean) ven0VarJ3.getValue()).booleanValue();
                        sno snoVar3 = (sno) ven0VarJ4.getValue();
                        String str2 = snoVar3 != null ? snoVar3.a : null;
                        sno snoVar4 = (sno) ven0VarJ4.getValue();
                        hso1.r(0, str2, snoVar4 != null ? snoVar4.b : null, x340Var4, (qim0) null, zBooleanValue2);
                        x340Var4.r(true);
                        x340Var4.r(false);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
