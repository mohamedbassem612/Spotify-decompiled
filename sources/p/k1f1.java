package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k1f1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1f1(Function0 function0, Function0 function1, boolean z, iu30 iu30Var) {
        super(3);
        this.d = function0;
        this.e = function1;
        this.b = z;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.c;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                nyx.a(3, (wux) null, apo.r(-937879009, new zp51((dxo1) obj4, this.b, (Function0) obj6, (Function0) obj5), b0kVar), b0kVar, 3078, 6);
                return rih1Var;
            case 1:
                i2c i2cVar = (i2c) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
                j06 j06Var = x340Var2.a;
                if (!zY) {
                    x340Var2.b0();
                } else if (p3v.b(i2cVar.c(), 80.0f) >= 0) {
                    uwr uwrVar = cbx.a;
                    float f = cbx.b(x340Var2).b.b;
                    float f2 = yoi1.t(new p3v(i2cVar.c() - f), new p3v(80.0f), new p3v(112.0f)).a;
                    float f3 = yoi1.m(new p3v(i2cVar.c() - f2), new p3v(f)).a;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    tob1 tob1Var = (tob1) obj4;
                    zj31 zj31Var = (wj31) obj6;
                    List list = (List) obj5;
                    mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 48);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var2, lljVar4);
                    qim0 qim0VarR = u291.r(nim0Var, f2);
                    boolean zG = x340Var2.g(tob1Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new eyg1(tob1Var, (byte) 1);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarC = i541.C(qim0VarR, (iu30) objT);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarC);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    x340Var2.i0(472163057);
                    zj31Var.b(new jj31(this.b, 0, u291.d(nim0Var, 1.0f), 2, (jfe) null, list, (Map) null, false, false, (Function0) null, (iu30) null, 4048), x340Var2, 8);
                    x340Var2.r(false);
                    x340Var2.r(true);
                    op71.g(x340Var2, u291.h(nim0Var, f3));
                    x340Var2.r(true);
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarH = l6o1.H(u291.z(u291.f(nim0Var2, 1.0f), (fra) null, 3), l6o1.C(0, 0, 1, x340Var3), false, 14);
                era eraVar = een.Q0;
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var3).b;
                Function0 function0 = (Function0) obj6;
                Function0 function1 = (Function0) obj5;
                iu30 iu30Var = (iu30) obj4;
                mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var3, 0);
                x340 x340Var4 = x340Var3;
                int iHashCode3 = Long.hashCode(x340Var4.T);
                xos0 xos0VarM3 = x340Var4.m();
                qim0 qim0VarE3 = zr7.E(x340Var3, qim0VarH);
                hzj.A.getClass();
                x340 x340Var5 = x340Var3;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(n4kVar);
                } else {
                    x340Var5.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA2, x340Var3, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM3, x340Var3, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var3, lljVar7);
                nko1.F(x340Var3);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE3, x340Var3, lljVar8);
                epo1.d((qim0) null, x340Var3, 0);
                uwo1.e(cwl1.o0(x340Var3, 2131963548), (qim0) null, cbx.d(x340Var3).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2026);
                zma1 zma1Var = new zma1(cbx.a(x340Var3).b.a, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530);
                boolean zG2 = x340Var5.g(function0);
                Object objT2 = x340Var5.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new izg1(function0, (byte) 1);
                    x340Var5.s0(objT2);
                }
                uwo1.d(wmo1.A(2131963549, 2131963547, "https://support.spotify.com/content-policy-reporting/", zma1Var, (iu30) objT2, x340Var3, 384, 0), cbx.a(x340Var3).b.b, uyn1.B(nim0Var2, 0.0f, 0.0f, 0.0f, cbx.b(x340Var3).b.a, 7), cbx.d(x340Var3).j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var3, 0, 0, 4064);
                boolean zG3 = x340Var5.g(function1);
                Object objT3 = x340Var5.T();
                if (zG3 || objT3 == m4cVar) {
                    objT3 = new sah1(function1, (byte) 9);
                    x340Var5.s0(objT3);
                }
                epo1.b(0, cwl1.o0(x340Var3, 2131963550), (Function0) objT3, x340Var3, (qim0) null);
                qim0 qim0VarF2 = u291.f(nim0Var2, 1.0f);
                jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var3, 0);
                int iHashCode4 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM4 = x340Var5.m();
                qim0 qim0VarE4 = zr7.E(x340Var3, qim0VarF2);
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(n4kVar);
                } else {
                    x340Var5.v0();
                }
                nko1.H(jw31VarA, x340Var3, lljVar5);
                nko1.H(xos0VarM4, x340Var3, lljVar6);
                i3a.l(iHashCode4, x340Var3, lljVar7, x340Var3);
                nko1.H(qim0VarE4, x340Var3, lljVar8);
                String strO0 = cwl1.o0(x340Var3, 2131963552);
                lee1 lee1Var = cbx.d(x340Var3).j;
                long j = cbx.a(x340Var3).b.b;
                wnb0 wnb0Var = new wnb0(1.0f, true);
                cvx cvxVar2 = cbx.b(x340Var3).b;
                uwo1.e(strO0, uyn1.B(wnb0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2032);
                mta mtaVar = cbx.b(x340Var3).d;
                anm1.c(this.b, iu30Var, u291.h(nim0Var2, 48.0f), (max) null, (idn0) null, x340Var3, 0, 24);
                x340Var5.r(true);
                cvx cvxVar3 = cbx.b(x340Var3).b;
                ydh.l(nim0Var2, 8.0f, x340Var3, x340Var5, true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1f1(tob1 tob1Var, wj31 wj31Var, boolean z, List list) {
        super(3);
        this.c = tob1Var;
        this.d = wj31Var;
        this.b = z;
        this.e = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1f1(dxo1 dxo1Var, boolean z, Function0 function0, Function0 function1) {
        super(3);
        this.c = dxo1Var;
        this.b = z;
        this.d = function0;
        this.e = function1;
    }
}
