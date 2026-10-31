package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ut1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ut1(int i, Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        b7x b7xVar = b7x.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj4 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    kiv kivVar = t4k.h;
                    qim0 qim0VarB = uyn1.B(u291.h(qim0VarF, ((wat) x340Var2.k(kivVar)).M0(i)), 0.0f, 0.0f, 0.0f, ((wat) x340Var2.k(kivVar)).M0(((rt1) obj4).c), 7);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    xto1.e(anm1.N("content_loading", nim0Var), 0, 0L, 0L, x340Var2, 6, 14);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                llb1 llb1Var = (llb1) obj4;
                return new mab1((i3i0) obj, (xcu0) obj2, (n900) obj3, this.b, llb1Var != null ? llb1Var.b : null, llb1Var != null ? llb1Var.c : 0);
            case 2:
                ifh0 ifh0Var = (ifh0) obj;
                q5t0 q5t0VarH = ((afh0) obj2).H(((hjl) obj3).a);
                ozg ozgVar = (ozg) obj4;
                err0 err0Var = ozgVar.a;
                int i2 = q5t0VarH.b - i;
                if (i2 < 0) {
                    i2 = 0;
                }
                err0Var.t(i2);
                int iP = yoi1.p(jch0.U(ozgVar.b.s()), -err0Var.s(), 0);
                return ifh0Var.S(q5t0VarH.a, q5t0VarH.b + iP, b7xVar, new wb5(q5t0VarH, iP, (byte) 6));
            case 3:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    otw.c((cx0) obj4, new rh51(cwl1.o0(x340Var4, i), false), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    otw.c((nu) obj4, new q7x(cwl1.o0(x340Var6, i)), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                hsl1 hsl1Var = (hsl1) obj2;
                uc80 uc80Var = (uc80) obj3;
                int i3 = hsl1Var.a.i(519).d;
                ((View) obj).setPadding(uc80Var.a, uc80Var.b, uc80Var.c, uc80Var.d + i3);
                ((ViewGroup.MarginLayoutParams) ((Button) ((lag) obj4).d).getLayoutParams()).bottomMargin = i + i3;
                return hsl1Var;
            case 6:
                ifh0 ifh0Var2 = (ifh0) obj;
                q5t0 q5t0VarH2 = ((afh0) obj2).H(((hjl) obj3).a);
                jkr0 jkr0Var = (jkr0) obj4;
                float fS = i - (((drr0) jkr0Var.d.d).s() + ((err0) jkr0Var.d.c).s());
                float fAbs = Math.abs(fS) - 1.0f;
                if (fAbs < 0.0f) {
                    fAbs = 0.0f;
                }
                return ifh0Var2.S(q5t0VarH2.a, q5t0VarH2.b, b7xVar, new wb5(q5t0VarH2, jch0.U((-Math.signum(fS)) * fAbs * ((q5t0VarH2.a * 0.14999998f) / 2.0f)), (byte) 13));
            case 7:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                boolean zY = x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16);
                j06 j06Var = x340Var8.a;
                if (zY) {
                    uwr uwrVar = cbx.a;
                    avw0 avw0Var = cbx.b(x340Var8).c;
                    qqb qqbVarD = k1u.d(1.0f, cbx.a(x340Var8).a.a.c());
                    cr31 cr31Var = er31.a;
                    qim0 qim0VarQ = i1p1.q(d1u.F(nim0Var, qqbVarD.a, qqbVarD.b, cr31Var), cr31Var);
                    cvx cvxVar = cbx.b(x340Var8).b;
                    qim0 qim0VarX = uyn1.x(qim0VarQ, 8.0f);
                    List<String> list = (List) obj4;
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var8, 48);
                    int iHashCode2 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM2 = x340Var8.m();
                    qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarX);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(jw31VarA, x340Var8, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM2, x340Var8, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var8, lljVar3);
                    nko1.F(x340Var8);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE2, x340Var8, lljVar4);
                    jw31 jw31VarA2 = ew31.a(new d36(-6.0f, true, new um5(false)), een.Z, x340Var8, 6);
                    int iHashCode3 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM3 = x340Var8.m();
                    qim0 qim0VarE3 = zr7.E(x340Var8, nim0Var);
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(jw31VarA2, x340Var8, lljVar);
                    nko1.H(xos0VarM3, x340Var8, lljVar2);
                    x0d.q(iHashCode3, x340Var8, lljVar3, x340Var8);
                    nko1.H(qim0VarE3, x340Var8, lljVar4);
                    x340Var8.i0(1141976871);
                    for (String str : list) {
                        uwr uwrVar2 = cbx.a;
                        uwo1.e(str, null, cbx.d(x340Var8).j, 0L, null, null, 0, false, null, 0, null, x340Var8, 0, 0, 2042);
                    }
                    x340Var8.r(false);
                    x340Var8.r(true);
                    if (i > 1) {
                        x340Var8.i0(47059583);
                        String strValueOf = String.valueOf(i);
                        uwr uwrVar3 = cbx.a;
                        uwo1.e(strValueOf, null, cbx.d(x340Var8).k, cbx.a(x340Var8).b.b, null, null, 0, false, null, 0, null, x340Var8, 0, 0, 2034);
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(47222953);
                        x340Var8.r(false);
                    }
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 8:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                float fM0 = ((wat) obj4).M0(i);
                uwr uwrVar4 = cbx.a;
                cvx cvxVar2 = cbx.b(b0kVar).b;
                op71.g(b0kVar, u291.h(nim0Var, fM0 - 4.0f));
                return rih1Var;
            case 9:
                i2c i2cVar = (i2c) obj;
                ((Number) obj3).intValue();
                x340 x340Var9 = (b0k) obj2;
                Object objK = x340Var9.k(t4k.h);
                j06 j06Var2 = x340Var9.a;
                float fU0 = ((wat) objK).U0();
                if (fU0 < 1.0f) {
                    fU0 = 1.0f;
                }
                uwr uwrVar5 = cbx.a;
                float f = zjy.j(i2cVar.c() / 12.0f, new p3v(cbx.b(x340Var9).b.f)).a;
                qim0 qim0VarB2 = uyn1.B(u291.j(i2cVar.c(), 0.0f, 2, l6o1.H(u291.f(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var9), false, 14)), 0.0f, 0.0f, 0.0f, f, 7);
                j2i j2iVar = (j2i) obj4;
                mbh mbhVarA = jbh.a(fU0 > 1.0f ? h36.c : h36.d, een.P0, x340Var9, 0);
                int iHashCode4 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM4 = x340Var9.m();
                qim0 qim0VarE4 = zr7.E(x340Var9, qim0VarB2);
                hzj.A.getClass();
                if (j06Var2 == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar);
                } else {
                    x340Var9.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA, x340Var9, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM4, x340Var9, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var9, lljVar7);
                nko1.F(x340Var9);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE4, x340Var9, lljVar8);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                cvx cvxVar3 = cbx.b(x340Var9).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF2);
                gfh0 gfh0VarC2 = t1c.c(een.X, false);
                int iHashCode5 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM5 = x340Var9.m();
                qim0 qim0VarE5 = zr7.E(x340Var9, qim0VarZ);
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar);
                } else {
                    x340Var9.v0();
                }
                nko1.H(gfh0VarC2, x340Var9, lljVar5);
                nko1.H(xos0VarM5, x340Var9, lljVar6);
                x0d.q(iHashCode5, x340Var9, lljVar7, x340Var9);
                nko1.H(qim0VarE5, x340Var9, lljVar8);
                dv20.l(0, j2iVar, x340Var9, true);
                qim0 qim0VarZ2 = uyn1.z(ywx0.k(nim0Var, f, x340Var9, x340Var9).b.a, 0.0f, 2, nim0Var);
                gfh0 gfh0VarC3 = t1c.c(een.d, false);
                int iHashCode6 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM6 = x340Var9.m();
                qim0 qim0VarE6 = zr7.E(x340Var9, qim0VarZ2);
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar);
                } else {
                    x340Var9.v0();
                }
                nko1.H(gfh0VarC3, x340Var9, lljVar5);
                nko1.H(xos0VarM6, x340Var9, lljVar6);
                x0d.q(iHashCode6, x340Var9, lljVar7, x340Var9);
                nko1.H(qim0VarE6, x340Var9, lljVar8);
                qr21.a(i, x340Var9, 0);
                x340Var9.r(true);
                x340Var9.r(true);
                return rih1Var;
            case 10:
                long j = ((hjl) obj3).a;
                err0 err0Var2 = (hdn0) obj4;
                q5t0 q5t0VarH3 = ((afh0) obj2).H(hjl.a(i, i, err0Var2.s(), err0Var2.s()));
                return ((ifh0) obj).S(q5t0VarH3.a, q5t0VarH3.b, b7xVar, new oyc1(q5t0VarH3, (byte) 0));
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                w2g0.c(uyn1.x(dug.f(u291.d(nim0Var, 1.0f), z4p1.e(i), d4o1.a), 16.0f), een.h, apo.r(-1222092846, new bxb1((jxc1) obj4, (byte) 17), b0kVar2), b0kVar2, 3072, 4);
                return rih1Var;
            case grn1.d /* 12 */:
                hsl1 hsl1Var2 = (hsl1) obj2;
                ((ViewGroup.MarginLayoutParams) obj4).bottomMargin = i + hsl1Var2.a.i(519).d;
                return hsl1Var2;
            default:
                hsl1 hsl1Var3 = (hsl1) obj2;
                rc80 rc80Var = (rc80) obj3;
                nk80 nk80VarI = hsl1Var3.a.i(519);
                View view = (View) obj4;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        marginLayoutParams.topMargin = nk80VarI.b + rc80Var.b;
                    } else if (iC == 1) {
                        marginLayoutParams.bottomMargin = nk80VarI.d + rc80Var.d;
                    } else {
                        eg.o();
                    }
                    view.setLayoutParams(marginLayoutParams);
                    return hsl1Var3;
                }
                bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ut1(Object obj, int i, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
