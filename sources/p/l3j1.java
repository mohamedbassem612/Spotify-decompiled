package p;

import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l3j1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3j1(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        int i;
        j2i j2iVar;
        j2i j2iVarR;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                i0p1.g((z2a) obj6, (iu30) obj4, (ArrayList) obj5, (qn30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                Float fValueOf = null;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                ihl ihlVar = (ihl) obj3;
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objT = x340Var2.T();
                    if (objT == m4cVar) {
                        objT = v8r.q((Object) null);
                        x340Var2.s0(objT);
                    }
                    ven0 ven0Var = (ven0) objT;
                    String str = ((gij1) obj6).e;
                    uwr uwrVar = cbx.a;
                    long j = cbx.a(x340Var2).b.a;
                    lee1 lee1Var = cbx.d(x340Var2).h;
                    int i2 = mhc0.d;
                    lee1 lee1VarA = lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, ila0.C(3, (i2 >> 8) & 255, (i2 >> 16) & 255), 14680063);
                    cjc0 cjc0Var = new cjc0(3);
                    xhl xhlVar = (xhl) obj4;
                    ihl ihlVar2 = (ihl) obj5;
                    boolean zG = x340Var2.g(ihlVar) | x340Var2.d(16.0f);
                    Object objT2 = x340Var2.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new pu(ihlVar, (byte) 29);
                        x340Var2.s0(objT2);
                    }
                    xhlVar.getClass();
                    qim0 qim0VarZ = uyn1.z(cbx.b(x340Var2).b.c, 0.0f, 2, xhl.j(nim0Var, ihlVar2, (iu30) objT2));
                    y9e1 y9e1Var = (y9e1) ven0Var.getValue();
                    if (y9e1Var != null && (i = y9e1Var.b.f) > 0) {
                        lr80 it = yoi1.Q(0, i).iterator();
                        sr80 sr80Var = (sr80) it;
                        if (!sr80Var.c) {
                            hhg1.k();
                            return null;
                        }
                        lr80 lr80Var = it;
                        int iNextInt = lr80Var.nextInt();
                        float fH = y9e1Var.h(iNextInt) - y9e1Var.g(iNextInt);
                        while (sr80Var.c) {
                            int iNextInt2 = lr80Var.nextInt();
                            fH = Math.max(fH, y9e1Var.h(iNextInt2) - y9e1Var.g(iNextInt2));
                        }
                        fValueOf = Float.valueOf(fH);
                    }
                    uwr uwrVar2 = cbx.a;
                    long j2 = cbx.a(x340Var2).a.c;
                    cua cuaVar = cbx.b(x340Var2).f;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarQ = exd0.q(qim0VarZ, new n82(fValueOf, j2, (byte) 7));
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    qim0 qim0VarX = uyn1.x(qim0VarQ, 8.0f);
                    a0e1 a0e1Var = new a0e1(3);
                    Object objT3 = x340Var2.T();
                    if (objT3 == m4cVar) {
                        objT3 = new i2g1(ven0Var, (byte) 11);
                        x340Var2.s0(objT3);
                    }
                    uwo1.e(str, qim0VarX, lee1VarA, j, a0e1Var, (iu30) objT3, 2, false, cjc0Var, 0, (qx8) null, x340Var2, 1769472, 0, 1664);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                u4p1.L((yup0) obj6, (Function0) obj4, (vu30) obj5, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 3:
                ((Number) obj2).floatValue();
                drr0 drr0Var = (drr0) obj5;
                float fS = drr0Var.s();
                long j3 = ((hav0) obj).c;
                View view = (View) obj6;
                drr0 drr0Var2 = (drr0) obj3;
                if (Math.abs(((int) drr0Var2.s()) - ((int) foo1.p(fS, j3))) >= 1.0f) {
                    view.performHapticFeedback(1);
                }
                drr0Var2.t(foo1.p(drr0Var.s(), j3));
                ((iu30) obj4).invoke(Float.valueOf(drr0Var2.s()));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                m87.c((String) obj6, (ceo) obj4, (bwx) obj5, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                m87.e((fwk1) obj6, (iu30) obj4, (ng20) obj5, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                aq8.n((s271) obj6, (lxk1) obj5, (qim0) obj3, (iu30) obj4, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                vby0.m((List) obj6, (kes) obj5, (String) obj3, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                kpc.e((kpc) obj, "Recording", new m9i1((String) obj6, (rvl1) obj4, (hwl1) obj5, (d0r) obj3, (byte) 6), 2);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                gbx gbxVar = (gbx) obj6;
                kjo0 kjo0Var = (kjo0) obj5;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwr uwrVar3 = cbx.a;
                    qim0 qim0VarF = dug.f(nim0Var, cbx.a(x340Var4).a.c, d4o1.a);
                    boolean zI = x340Var4.i(gbxVar);
                    Object objT4 = x340Var4.T();
                    if (zI || objT4 == fkj0.X) {
                        objT4 = new o70(gbxVar, (byte) 6);
                        x340Var4.s0(objT4);
                    }
                    qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT4);
                    kiv kivVar = vvx.a;
                    uvx uvxVarA = uvx.a((uvx) x340Var4.k(kivVar), (pgx) null, 0, nmn1.m(gto1.p(((uvx) x340Var4.k(kivVar)).a, x340Var4, ((uvx) x340Var4.k(kivVar)).c), (p3v) null, (p3v) null, new p3v(0.0f), (p3v) null, 11), (vzq0) null, (tvx) null, (p3v) null, 503);
                    gbx gbxVar2 = new gbx(z50.c, (Function0) obj4);
                    vmo0 vmo0Var = kjo0Var.e;
                    if (vmo0Var instanceof nmo0) {
                        x340Var4.i0(310074817);
                        j2iVarR = apo.r(1885139259, new q2n1(vmo0Var, (byte) 0), x340Var4);
                        x340Var4.r(false);
                    } else if (vmo0Var instanceof qmo0) {
                        x340Var4.i0(310163198);
                        j2iVarR = apo.r(-2126797198, new q2n1(vmo0Var, (byte) 1), x340Var4);
                        x340Var4.r(false);
                    } else {
                        if (vmo0Var instanceof umo0) {
                            x340Var4.i0(310258554);
                            j2iVarR = apo.r(1773766259, new q2n1(vmo0Var, (byte) 2), x340Var4);
                            x340Var4.r(false);
                        } else {
                            if (!(vmo0Var instanceof rmo0)) {
                                throw p3d1.k(x340Var4, -405641577, false);
                            }
                            x340Var4.i0(310350964);
                            x340Var4.r(false);
                            j2iVar = null;
                        }
                        jto1.b(qim0VarB, uvxVarA, (max) null, false, (idn0) null, (ga80) null, gbxVar2, (gbx) null, j2iVar, (xu30) null, (xu30) null, (xu30) null, apo.r(2004765200, new sgi1(kjo0Var, (Function0) obj3, (byte) 16), x340Var4), (xu30) null, (xu30) null, apo.r(-899117587, new eom1(kjo0Var, (byte) 7), x340Var4), x340Var4, 64, 196992, 28348);
                    }
                    j2iVar = j2iVarR;
                    jto1.b(qim0VarB, uvxVarA, (max) null, false, (idn0) null, (ga80) null, gbxVar2, (gbx) null, j2iVar, (xu30) null, (xu30) null, (xu30) null, apo.r(2004765200, new sgi1(kjo0Var, (Function0) obj3, (byte) 16), x340Var4), (xu30) null, (xu30) null, apo.r(-899117587, new eom1(kjo0Var, (byte) 7), x340Var4), x340Var4, 64, 196992, 28348);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3j1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3j1(Object obj, Object obj2, Object obj3, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = iu30Var;
    }
}
