package p;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kh2 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh2(nhc nhcVar, td10 td10Var, boolean z, es41 es41Var, cvx cvxVar, Function0 function0, boolean z2) {
        super(3);
        this.d = nhcVar;
        this.e = td10Var;
        this.b = z;
        this.f = es41Var;
        this.g = cvxVar;
        this.h = function0;
        this.c = z2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jA;
        long j;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n4k n4kVar = hmb0.t1;
        boolean z = this.c;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        boolean z2 = this.b;
        Object obj7 = this.e;
        Object obj8 = this.d;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case 0:
                uwr uwrVar = cbx.a;
                nt00 nt00Var = (nt00) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                ven0 ven0Var = (ven0) obj8;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? x340Var.g(nt00Var) : x340Var.i(nt00Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        x340Var2.i0(-1769137568);
                        jA = cbx.a(x340Var2).a.a.c();
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1769135493);
                        jA = cbx.a(x340Var2).a.a.a();
                        x340Var2.r(false);
                    }
                    qim0 qim0VarF = dug.f(qim0VarD, jA, er31.b(4.0f));
                    if (z2) {
                        x340Var2.i0(-1769130241);
                        j = cbx.a(x340Var2).b.d;
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1769129598);
                        x340Var2.r(false);
                        j = u7h.j;
                    }
                    qim0 qim0VarE = d1u.E(2.0f, j, qim0VarF, er31.b(4.0f));
                    String str = (String) obj7;
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarE);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE2, x340Var2, y580.Y);
                    boolean z3 = !z;
                    lee1 lee1VarA = lee1.a((lee1) x340Var2.k(rgx.a), cbx.a(x340Var2).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
                    qim0 qim0VarP = vby0.p(nim0Var, nt00Var.a);
                    ven0 ven0Var2 = nt00Var.h;
                    qim0 qim0VarThen = qim0VarP.then(new et00(new e45(ven0Var2, (byte) 5)));
                    boolean z4 = nt00Var.b;
                    uku ukuVar = new uku(nt00Var.i, ven0Var2, z4);
                    qim0 qim0VarThen2 = qim0VarThen.then(s161.b(y9g1.t(f8d1.b(nim0Var, ukuVar, new ae4(ukuVar, (byte) 1)), new da(ukuVar, z4, nt00Var.c)), false, new b6(z4, nt00Var.d, nt00Var.e, nt00Var.f, ukuVar, nt00Var.g)));
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = ny1.Z0;
                        x340Var2.s0(objT);
                    }
                    xea.a(str, (iu30) objT, qim0VarThen2, z3, true, lee1VarA, (kua0) null, (bua0) null, true, 0, 0, (elk1) null, (iu30) null, (idn0) null, (Brush) null, k5i.b, x340Var2, 100687920, 196608, 32448);
                    x340Var2.r(true);
                    boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                    boolean zI = x340Var2.i(ven0Var);
                    Object objT2 = x340Var2.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new ma0(ven0Var, (byte) 12);
                        x340Var2.s0(objT2);
                    }
                    nt00Var.a(zBooleanValue, (Function0) objT2, (qim0) null, (es41) null, false, (hw61) null, 0L, 0.0f, apo.r(1741754261, new k8((ArrayList) obj6, (iu30) obj5, ven0Var, (tg2) obj4, (byte) 5), x340Var2), x340Var2, 0, 6 | ((iIntValue << 3) & 112));
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                i2c i2cVar = (i2c) obj;
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                float fC = i2cVar.c();
                float fD = i2cVar.d();
                qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarP2 = x0d.p(lhc.g(x340Var3).g, 32, qim0VarD2);
                era eraVar = een.Q0;
                nhc nhcVar = (nhc) obj8;
                td10 td10Var = (td10) obj7;
                es41 es41Var = (es41) obj6;
                float f = ((cvx) obj5).a;
                Function0 function0 = (Function0) obj4;
                f36 f36Var = h36.c;
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var3, 0);
                x340 x340Var4 = x340Var3;
                int iHashCode2 = Long.hashCode(x340Var4.T);
                xos0 xos0VarM2 = x340Var4.m();
                qim0 qim0VarE3 = zr7.E(x340Var3, qim0VarP2);
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
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var3, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM2, x340Var3, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var3, lljVar3);
                nko1.F(x340Var3);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE3, x340Var3, lljVar4);
                nhcVar.f(td10Var, u291.h(u291.f(nim0Var, 1.0f), fC * (z2 ? 0.48f : 0.33333334f)), x340Var3, 0);
                qim0 qim0VarH = l6o1.H(u291.x(0.0f, zjy.j(640.0f, new p3v(fD)).a, 1, new wnb0(1.0f, true)), es41Var, false, 14);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarZ = uyn1.z(cbx.b(x340Var3).e.c, 0.0f, 2, qim0VarH);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var3, 0);
                int iHashCode3 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM3 = x340Var5.m();
                qim0 qim0VarE4 = zr7.E(x340Var3, qim0VarZ);
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(n4kVar);
                } else {
                    x340Var5.v0();
                }
                nko1.H(mbhVarA2, x340Var3, lljVar);
                nko1.H(xos0VarM3, x340Var3, lljVar2);
                i3a.l(iHashCode3, x340Var3, lljVar3, x340Var3);
                nko1.H(qim0VarE4, x340Var3, lljVar4);
                uwo1.e(cwl1.o0(x340Var3, 2131962681), u291.f(nim0Var, 1.0f), cbx.d(x340Var3).a, cbx.a(x340Var3).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2016);
                uwo1.e(eqq.n(nim0Var, z2 ? 16.0f : 6.0f, x340Var3, 2131962680, x340Var3), u291.f(nim0Var, 1.0f), cbx.d(x340Var3).d, cbx.a(x340Var3).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2016);
                uwo1.e(eqq.n(nim0Var, z2 ? 8.0f : 12.0f, x340Var3, 2131962676, x340Var3), u291.f(nim0Var, 1.0f), cbx.d(x340Var3).g, cbx.a(x340Var3).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2016);
                String strN = eqq.n(nim0Var, z2 ? f : 12.0f, x340Var3, 2131962663, x340Var3);
                if (ihc1.y0(strN)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(strN), function0), new idx(6), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, ksi.a, x340Var3, 0, 48, 2044);
                op71.g(x340Var3, u291.h(nim0Var, z2 ? f : 12.0f));
                nhcVar.g(z, z2, x340Var3, 0);
                ydh.l(nim0Var, 16.0f, x340Var3, x340Var5, true);
                x340Var5.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh2(boolean z, ven0 ven0Var, boolean z2, String str, ArrayList arrayList, iu30 iu30Var, tg2 tg2Var) {
        super(3);
        this.b = z;
        this.d = ven0Var;
        this.c = z2;
        this.e = str;
        this.f = arrayList;
        this.g = iu30Var;
        this.h = tg2Var;
    }
}
