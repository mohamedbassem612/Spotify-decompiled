package p;

import android.os.Parcelable;
import androidx.compose.ui.graphics.ColorFilter;
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
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bk0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk0(Function0 function0, boolean z, iu30 iu30Var, iu30 iu30Var2) {
        super(2);
        this.a = (byte) 13;
        this.d = function0;
        this.b = z;
        this.c = iu30Var;
        this.e = iu30Var2;
    }

    private final Object a(Object obj, Object obj2) {
        hax haxVar;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            era eraVar = een.P0;
            qim0 qim0Var = nim0.a;
            qim0 qim0VarY = voo1.y(u291.f(qim0Var, 1.0f), voo1.b);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0VarN = anm1.N("graduation_rejected_test_tag", uyn1.B(qim0VarY, 16.0f, 0.0f, 16.0f, 16.0f, 2));
            iu30 iu30Var = (iu30) this.c;
            vx40 vx40Var = (vx40) this.d;
            s950 s950Var = (s950) this.e;
            b36 b36Var = h36.e;
            mbh mbhVarA = jbh.a(b36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            boolean zG = x340Var2.g(iu30Var);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new g850(iu30Var, (byte) 3);
                x340Var2.s0(objT);
            }
            q3p1.b(6, 0, (Function0) objT, x340Var2, true);
            pbh pbhVar = pbh.a;
            op71.g(x340Var2, pbhVar.a(1.0f, qim0Var, true));
            men1.e(cwl1.o0(x340Var2, 2131956398), (qim0) null, 0.0f, x340Var2, 0, 6);
            boolean z2 = this.b;
            vvm1.f(cwl1.o0(x340Var2, z2 ? 2131956397 : 2131956395), (qim0) null, (lee1) null, 0.0f, x340Var2, 0, 14);
            op71.g(x340Var2, pbhVar.a(0.75f, qim0Var, true));
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(b36Var, een.Z, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            boolean zI = x340Var2.i(vx40Var) | x340Var2.g(iu30Var);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new hs20(vx40Var, iu30Var, (byte) 12);
                x340Var2.s0(objT2);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT2);
            idx idxVar = new idx(4);
            qim0 qim0VarN2 = anm1.N("graduation_rejected_button_test_tag", uyn1.B(qim0Var, 0.0f, cbx.b(x340Var2).b.c, 0.0f, 0.0f, 13).then(z2 ? qim0Var : u291.f(qim0Var, 1.0f)));
            if (s950Var.b) {
                x340Var2.i0(509704792);
                haxVar = new hax(cwl1.o0(x340Var2, 2131956391));
                x340Var2.r(false);
            } else {
                x340Var2.i0(509869898);
                x340Var2.r(false);
                haxVar = jax.a;
            }
            foo1.c(gbxVar, idxVar, qim0VarN2, haxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(631805543, new kf2(z2, s950Var, (byte) 9), x340Var2), x340Var2, 0, 48, 2024);
            x340Var2.r(true);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2) {
        Function0 function0;
        hax haxVar;
        int i;
        byte b = this.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        boolean z = this.b;
        qim0 qim0VarH = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                kes kesVar = (kes) obj3;
                iu30 iu30Var = (iu30) obj4;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = ((jk0) obj5).a.e.a;
                    if (z) {
                        x340Var2.i0(-2129645463);
                        boolean zG = x340Var2.g(iu30Var) | x340Var2.i(kesVar);
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = new ak0(iu30Var, kesVar, (byte) 0);
                            x340Var2.s0(objT);
                        }
                        x340Var2.r(false);
                        function0 = (Function0) objT;
                    } else {
                        x340Var2.i0(-2129559625);
                        x340Var2.r(false);
                        function0 = null;
                    }
                    cpn1.a(str, "", function0, (qim0) null, (yf) null, (djc0) null, x340Var2, 48, 56);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                j2p1.a((zq0) obj5, this.b, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(qim0VarH, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 0.0f, 16.0f, ((vzq0) obj5).a(), 2);
                    iu30 iu30Var2 = (iu30) obj4;
                    eyh0 eyh0Var = (eyh0) obj3;
                    mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var4, 0);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(mbhVarA, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    xap1.h((qim0) null, x340Var4, 0);
                    cvx cvxVar3 = cbx.b(x340Var4).b;
                    String strG = ydh.g(16.0f, 2131952051, x340Var4, x340Var4, qim0VarH);
                    lee1 lee1Var = cbx.d(x340Var4).e;
                    Object objT2 = x340Var4.T();
                    if (objT2 == fkj0.X) {
                        objT2 = ny1.U0;
                        x340Var4.s0(objT2);
                    }
                    uwo1.e(strG, s161.b(qim0VarH, false, (iu30) objT2), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2040);
                    cvx cvxVar4 = cbx.b(x340Var4).b;
                    op71.g(x340Var4, u291.h(qim0VarH, 16.0f));
                    axo1.b(z, x340Var4, 0);
                    j1e1.b(iu30Var2, eyh0Var, x340Var4, 0);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                rk6.a((cj6) obj5, this.b, (qim0) obj4, (tob1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                gxo1.b((hwq) obj5, (qim0) obj4, this.b, (h72) obj3, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                wxo1.i((wj31) obj5, (List) obj4, this.b, (Map) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                String str2 = (String) obj5;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    iu30 iu30Var3 = (iu30) obj4;
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar5 = cbx.b(x340Var6).b;
                    qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarH);
                    boolean zG2 = x340Var6.g(str2);
                    Object objT3 = x340Var6.T();
                    if (zG2 || objT3 == fkj0.X) {
                        objT3 = new wk3(str2, (byte) 28);
                        x340Var6.s0(objT3);
                    }
                    anm1.c(this.b, iu30Var3, s161.b(qim0VarZ, false, (iu30) objT3), (max) obj3, (idn0) null, x340Var6, 0, 16);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                iu30 iu30Var4 = (iu30) obj4;
                aa9 aa9Var = (aa9) obj5;
                c380 c380Var = aa9Var.e;
                err0 err0Var = (hdn0) obj3;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    err0 err0Var2 = err0Var;
                    boolean z2 = err0Var2.s() == 0;
                    String str3 = (String) c380Var.get(0);
                    boolean zI = x340Var8.i(err0Var) | x340Var8.g(iu30Var4) | x340Var8.h(z);
                    Object objT4 = x340Var8.T();
                    if (zI || objT4 == m4cVar) {
                        objT4 = new ea9(iu30Var4, z, err0Var, (byte) 0);
                        x340Var8.s0(objT4);
                    }
                    Function0 function1 = (Function0) objT4;
                    if (ihc1.y0(str3)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    } else {
                        m5n1.d(z2, new gbx(new y50(str3), function1), apo.r(-1369022396, new mu6(aa9Var, (byte) 19), x340Var8), (qim0) null, (idn0) null, (max) null, 0L, 0L, x340Var8, 384, 504);
                        boolean z3 = err0Var2.s() == 1;
                        String str4 = (String) c380Var.get(1);
                        boolean zI2 = x340Var8.i(err0Var) | x340Var8.g(iu30Var4) | x340Var8.h(z);
                        Object objT5 = x340Var8.T();
                        if (zI2 || objT5 == m4cVar) {
                            objT5 = new ea9(iu30Var4, z, err0Var, (byte) 1);
                            x340Var8.s0(objT5);
                        }
                        Function0 function2 = (Function0) objT5;
                        if (ihc1.y0(str4)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        } else {
                            m5n1.d(z3, new gbx(new y50(str4), function2), apo.r(1188330733, new kf2(z, aa9Var, (byte) 1), x340Var8), anm1.N("aoTab", qim0VarH), (idn0) null, (max) null, 0L, 0L, x340Var8, 384, 496);
                        }
                    }
                    return null;
                }
                x340Var8.b0();
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ((h72) obj5).h((ds9) obj4, this.b, (Function0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                lyg.b(czo1.p(1), (Function0) obj4, (lkb) obj5, (b0k) obj, (qim0) obj3, this.b);
                return rih1Var;
            case 10:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                cce cceVar = (cce) obj3;
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var5 = (iu30) obj4;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    es41 es41Var = (es41) obj5;
                    boolean zG3 = x340Var10.g(iu30Var5);
                    Object objT6 = x340Var10.T();
                    if (zG3 || objT6 == m4cVar2) {
                        objT6 = new gob(iu30Var5, (byte) 11);
                        x340Var10.s0(objT6);
                    }
                    Function0 function3 = (Function0) objT6;
                    boolean zI3 = x340Var10.i(cceVar) | x340Var10.g(iu30Var5);
                    Object objT7 = x340Var10.T();
                    if (zI3 || objT7 == m4cVar2) {
                        objT7 = new rqa(cceVar, iu30Var5, (byte) 28);
                        x340Var10.s0(objT7);
                    }
                    nko1.c(es41Var, this.b, function3, (Function0) objT7, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                nko1.c((es41) obj5, this.b, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                omo1.b((khe) obj5, this.b, (gbx) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarP = x0d.p(lhc.g(x340Var12).g, 32, qim0VarF2);
                    uwr uwrVar3 = cbx.a;
                    qim0 qim0VarZ2 = uyn1.z(cbx.b(x340Var12).b.a, 0.0f, 2, qim0VarP);
                    float f = cbx.b(x340Var12).b.a;
                    cvx cvxVar6 = cbx.b(x340Var12).b;
                    qim0 qim0VarB2 = uyn1.B(qim0VarZ2, 0.0f, 16.0f, 0.0f, f, 5);
                    Function0 function4 = (Function0) obj5;
                    iu30 iu30Var6 = (iu30) obj4;
                    iu30 iu30Var7 = (iu30) obj3;
                    mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var12, 0);
                    int iHashCode2 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM2 = x340Var12.m();
                    qim0 qim0VarE2 = zr7.E(x340Var12, qim0VarB2);
                    hzj.A.getClass();
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(mbhVarA2, x340Var12, y580.O0);
                    nko1.H(xos0VarM2, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE2, x340Var12, y580.Y);
                    era eraVar = een.Q0;
                    eso1.g(cyo1.x(x340Var12, 2131231208), isl.a, new tq60(eraVar), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var12, 48, 504);
                    uwo1.e(cwl1.o0(x340Var12, 2131953675), uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, cbx.b(x340Var12).b.a, 0.0f, 0.0f, 13), cbx.d(x340Var12).d, cbx.a(x340Var12).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var12, 0, 0, 2016);
                    cvx cvxVar7 = cbx.b(x340Var12).b;
                    ppo1.a(mqo1.s(new e7u[]{new e7u(cwl1.o0(x340Var12, 2131953669), uox.c), new e7u(cwl1.o0(x340Var12, 2131953670), tkx.c), new e7u(cwl1.o0(x340Var12, 2131953674), fnx.c)}), uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), x340Var12, 8);
                    boolean zG4 = x340Var12.g(function4);
                    Object objT8 = x340Var12.T();
                    if (zG4 || objT8 == fkj0.X) {
                        objT8 = new pj8(function4, (byte) 25);
                        x340Var12.s0(objT8);
                    }
                    gbx gbxVar = new gbx(z50.c, (Function0) objT8);
                    idx idxVar = new idx(4);
                    gdx gdxVarP = yla.p(x340Var12);
                    if (z) {
                        x340Var12.i0(1195971889);
                        haxVar = new hax(cwl1.o0(x340Var12, 2131953668));
                        x340Var12.r(false);
                    } else {
                        x340Var12.i0(1195975645);
                        x340Var12.r(false);
                        haxVar = jax.a;
                    }
                    foo1.c(gbxVar, idxVar, anm1.N("accept_disclaimer_button", uyn1.B(new tq60(eraVar), 0.0f, cbx.b(x340Var12).b.b, 0.0f, 0.0f, 13)), haxVar, gdxVarP, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1209149816, new dr0((byte) 6, z), x340Var12), x340Var12, 0, 48, 1992);
                    uwo1.d(ot11.w(cwl1.o0(x340Var12, 2131953671), new hhg[]{new hhg(cwl1.o0(x340Var12, 2131953672), "https://www.spotify.com/platform-rules/plain", new zma1(cbx.a(x340Var12).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), iu30Var6), new hhg(cwl1.o0(x340Var12, 2131953673), cwl1.o0(x340Var12, 2131963149), new zma1(cbx.a(x340Var12).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), iu30Var7)}), cbx.a(x340Var12).b.b, uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, cbx.b(x340Var12).b.a, 0.0f, 0.0f, 13), cbx.d(x340Var12).m, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var12, 0, 0, 4064);
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uef uefVar = (uef) obj5;
                    Parcelable.Creator creator = w4i1.CREATOR;
                    zso1.t(uefVar, uefVar.j, (f5f) obj4, (yyh) obj3, this.b, x340Var14, 0);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                e5h e5hVar = (e5h) obj4;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    j5h j5hVar = (j5h) obj5;
                    String str5 = e5hVar.a;
                    int iC = l1d.C(e5hVar.b);
                    if (iC == 0) {
                        i = 2;
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        i = 1;
                    }
                    otw.c(j5hVar, new h5h(str5, i, e5hVar.e, (y0q0) obj3, this.b, e5hVar.j, 144), u291.f(qim0VarH, 1.0f), (ipb1) null, x340Var16, 0, 8);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                p9p1.e((adj1) obj5, (iu30) obj4, (qim0) obj3, this.b, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                ((ajq0) obj5).h((String) obj3, this.b, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                n8m n8mVar = (n8m) obj5;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    float f2 = (!(n8mVar.f.c() || z) || ((Boolean) ((ven0) obj4).getValue()).booleanValue()) ? 1.0f : 0.0f;
                    qim0 qim0VarF3 = u291.f(qim0VarH, 1.0f);
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar8 = cbx.b(x340Var18).b;
                    qim0 qim0VarN = anm1.N("ContentStoryElement.SourceChipsContainer", d9y0.k(uyn1.B(qim0VarF3, 0.0f, 0.0f, 0.0f, 16.0f, 7), f2));
                    j8m j8mVar = (j8m) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var18.T);
                    xos0 xos0VarM3 = x340Var18.m();
                    qim0 qim0VarE3 = zr7.E(x340Var18, qim0VarN);
                    hzj.A.getClass();
                    if (x340Var18.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var18.m0();
                    if (x340Var18.S) {
                        x340Var18.l(n4kVar);
                    } else {
                        x340Var18.v0();
                    }
                    nko1.H(gfh0VarC, x340Var18, y580.O0);
                    nko1.H(xos0VarM3, x340Var18, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var18, y580.R0);
                    nko1.F(x340Var18);
                    nko1.H(qim0VarE3, x340Var18, y580.Y);
                    lka1 lka1Var = n8mVar.d;
                    l7c1 l7c1Var = j8mVar.b;
                    otw.c(lka1Var, new kka1(l7c1Var.a, l7c1Var.d), (qim0) null, (ipb1) null, x340Var18, 0, 12);
                    x340Var18.r(true);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                ((bmr) obj5).e(czo1.p(49), (String) obj4, (Function0) obj3, (b0k) obj, this.b);
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                c8o.d((String) obj5, (cd90) obj4, this.b, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                y7e1 y7e1Var = (y7e1) obj5;
                iu30 iu30Var8 = (iu30) obj4;
                zeu zeuVar = (zeu) obj3;
                x340 x340Var20 = x340Var19;
                if (!x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x340Var20.b0();
                } else if (y7e1Var.d().d.length() == 0) {
                    x340Var20.i0(-531499572);
                    wox woxVar = wox.c;
                    String strO0 = cwl1.o0(x340Var20, 2131958595);
                    boolean zI4 = x340Var20.i(zeuVar) | x340Var20.g(iu30Var8);
                    Object objT9 = x340Var20.T();
                    if (zI4 || objT9 == m4cVar3) {
                        objT9 = new znu(iu30Var8, zeuVar, (byte) 1);
                        x340Var20.s0(objT9);
                    }
                    pxd0.h(wox.d, strO0, (Function0) objT9, x340Var20, woxVar, this.b);
                    x340Var20.r(false);
                } else {
                    x340Var20.i0(-531003696);
                    qpx qpxVar = qpx.c;
                    String strO1 = cwl1.o0(x340Var20, 2131961609);
                    boolean zI5 = x340Var20.i(zeuVar) | x340Var20.g(iu30Var8) | x340Var20.g(y7e1Var);
                    Object objT10 = x340Var20.T();
                    if (zI5 || objT10 == m4cVar3) {
                        objT10 = new ssm(zeuVar, iu30Var8, y7e1Var, (byte) 17);
                        x340Var20.s0(objT10);
                    }
                    pxd0.h(qpx.d, strO1, (Function0) objT10, x340Var20, qpxVar, this.b);
                    x340Var20.r(false);
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                vgo1.p(this.b, (iu30) obj4, (j2i) obj5, (j2i) obj3, (b0k) obj, czo1.p(3457));
                return rih1Var;
            case 23:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x340Var22.i0(-1369210739);
                    if (z) {
                        qim0VarH = l6o1.H(qim0VarH, l6o1.C(0, 0, 1, x340Var22), false, 14);
                    }
                    x340Var22.r(false);
                    q5t0 q5t0Var = (q5t0) obj5;
                    tlc1 tlc1Var = (tlc1) obj4;
                    j2i j2iVar = (j2i) obj3;
                    mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var22, 0);
                    int iHashCode4 = Long.hashCode(x340Var22.T);
                    xos0 xos0VarM4 = x340Var22.m();
                    qim0 qim0VarE4 = zr7.E(x340Var22, qim0VarH);
                    hzj.A.getClass();
                    if (x340Var22.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var22.m0();
                    if (x340Var22.S) {
                        x340Var22.l(n4kVar);
                    } else {
                        x340Var22.v0();
                    }
                    nko1.H(mbhVarA3, x340Var22, y580.O0);
                    nko1.H(xos0VarM4, x340Var22, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var22, y580.R0);
                    nko1.F(x340Var22);
                    nko1.H(qim0VarE4, x340Var22, y580.Y);
                    j2iVar.invoke(new rcx(q5t0Var != null ? new p3v(tlc1Var.M0(q5t0Var.b)) : null), x340Var22, 0);
                    x340Var22.r(true);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                hxo1.g((xn10) obj5, this.b, (j2i) obj4, (qim0) obj3, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                z47.h((hdk) obj5, (iu30) obj4, (qim0) obj3, this.b, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                sbl.m((m360) obj5, (Function0) obj4, (qim0) obj3, this.b, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                return a(obj, obj2);
            case 28:
                ((Number) obj2).intValue();
                nyn1.n((zv31) obj5, this.b, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                g3p1.d((ax70) obj5, this.b, (qim0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk0(Object obj, Object obj2, boolean z, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.b = z;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk0(Object obj, cv30 cv30Var, qim0 qim0Var, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.c = cv30Var;
        this.e = qim0Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk0(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk0(Object obj, boolean z, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk0(Object obj, Object obj2, maa maaVar, boolean z, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.e = maaVar;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk0(aa9 aa9Var, hdn0 hdn0Var, iu30 iu30Var, boolean z) {
        super(2);
        this.a = (byte) 7;
        this.d = aa9Var;
        this.e = hdn0Var;
        this.c = iu30Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk0(iu30 iu30Var, boolean z, vx40 vx40Var, s950 s950Var) {
        super(2);
        this.a = (byte) 27;
        this.c = iu30Var;
        this.b = z;
        this.d = vx40Var;
        this.e = s950Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk0(ajq0 ajq0Var, String str, boolean z, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 17;
        this.d = ajq0Var;
        this.e = str;
        this.b = z;
        this.c = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk0(y7e1 y7e1Var, boolean z, zeu zeuVar, iu30 iu30Var) {
        super(2);
        this.a = (byte) 21;
        this.d = y7e1Var;
        this.b = z;
        this.e = zeuVar;
        this.c = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk0(boolean z, iu30 iu30Var, String str, max maxVar) {
        super(2);
        this.a = (byte) 6;
        this.b = z;
        this.c = iu30Var;
        this.d = str;
        this.e = maxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk0(boolean z, iu30 iu30Var, j2i j2iVar, j2i j2iVar2, int i) {
        super(2);
        this.a = (byte) 22;
        this.b = z;
        this.c = iu30Var;
        this.d = j2iVar;
        this.e = j2iVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk0(boolean z, q5t0 q5t0Var, tlc1 tlc1Var, j2i j2iVar) {
        super(2);
        this.a = (byte) 23;
        this.b = z;
        this.d = q5t0Var;
        this.c = tlc1Var;
        this.e = j2iVar;
    }
}
