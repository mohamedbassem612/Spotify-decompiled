package p;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d34 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d34(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.b;
        Object obj6 = this.e;
        Object obj7 = this.c;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                e34 e34Var = (e34) obj5;
                return new i34((Context) obj2, e34Var.c, e34Var.b, (ViewGroup) obj3, e34Var.d, (gw70) obj7, (lo60) obj8, (vgm) obj6);
            case 1:
                jof jofVar = (jof) obj2;
                x340 x340Var = (b0k) obj3;
                ((Number) obj4).intValue();
                fof fofVar = (fof) obj5;
                String str = fofVar.a;
                t7q0 t7q0Var = fofVar.b;
                if (jofVar instanceof hof) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1411193039);
                    hof hofVar = (hof) jofVar;
                    ykn yknVar = new ykn(str, t7q0Var, hofVar.a, hofVar.b);
                    Parcelable.Creator creator = w4i1.CREATOR;
                    otw.c((gln) obj7, yknVar, (qim0) null, wpb1.C("CreateGroupPageElement", (gln) obj7, yknVar, x340Var2, 6, 8), x340Var2, 0, 4);
                    x340Var2.r(false);
                } else if (jofVar instanceof iof) {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1410553695);
                    cp71 cp71Var = new cp71(t7q0Var);
                    otw.c((kp71) obj8, cp71Var, (qim0) null, wpb1.C("ShareWithPageElement", (kp71) obj8, cp71Var, x340Var3, 6, 8), x340Var3, 0, 4);
                    x340Var3.r(false);
                } else {
                    if (!(jofVar instanceof gof)) {
                        throw p3d1.k(x340Var, 1201402950, false);
                    }
                    x340 x340Var4 = x340Var;
                    x340Var4.i0(-1410108349);
                    gof gofVar = (gof) jofVar;
                    fj1 fj1Var = new fj1(gofVar.a, str, gofVar.b, t7q0Var);
                    otw.c((mj1) obj6, fj1Var, (qim0) null, wpb1.C("AddPeoplePageElement", (mj1) obj6, fj1Var, x340Var4, 6, 8), x340Var4, 0, 4);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 2:
                b0k b0kVar = (b0k) obj3;
                ((Number) obj4).intValue();
                mod.c(new ely0[]{frm.a.a((pv71) obj5), frm.b.a((wa5) obj)}, apo.r(541717765, new n7m((aoh0) obj2, (pt) obj7, (boh0) obj8, (iu30) obj6, (byte) 5), b0kVar), b0kVar, 56);
                return rih1Var;
            case 3:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                x340 x340Var5 = (b0k) obj3;
                ((Number) obj4).intValue();
                ic20 ic20Var = (ic20) obj5;
                if (zBooleanValue) {
                    x340 x340Var6 = x340Var5;
                    x340Var6.i0(1966239031);
                    m1p1.f(((gc20) ic20Var).a, (iu30) obj7, (iu30) obj8, x340Var6, 0);
                    x340Var6.r(false);
                } else {
                    x340 x340Var7 = x340Var5;
                    x340Var7.i0(1966431665);
                    m1p1.i(((gc20) ic20Var).a, (br0) obj6, x340Var7, 0);
                    x340Var7.r(false);
                }
                return rih1Var;
            case 4:
                bin.f((o990) obj5, ((Boolean) obj2).booleanValue(), (Function0) obj7, (zja1) obj8, (sip) obj6, (b0k) obj3, ((Number) obj4).intValue() & 112);
                return rih1Var;
            case 5:
                hl8 hl8Var = (hl8) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                x340 x340Var8 = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    i = (x340Var8.g(hl8Var) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= x340Var8.h(zBooleanValue2) ? 32 : 16;
                }
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(i & 1, (i & 147) != 146)) {
                    ((Function0) obj5).invoke();
                    fbp1.f(hl8Var.a, (vxf0) obj7, zBooleanValue2, (xm41) obj8, (jxa) obj6, (qim0) null, x340Var9, (i << 3) & 896);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 6:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                x340 x340Var10 = (b0k) obj3;
                ((Number) obj4).intValue();
                Function0 function0 = (Function0) obj5;
                iu30 iu30Var = (iu30) obj7;
                if (zBooleanValue3) {
                    x340 x340Var11 = x340Var10;
                    x340Var11.i0(13171273);
                    String strO0 = cwl1.o0(x340Var11, 2131961037);
                    boolean zG = x340Var11.g(function0) | x340Var11.g(iu30Var);
                    Object objT = x340Var11.T();
                    if (zG || objT == fkj0.X) {
                        objT = new wmf(function0, iu30Var, (byte) 9);
                        x340Var11.s0(objT);
                    }
                    Function0 function1 = (Function0) objT;
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.g(new gbx(new y50(strO0), function1), (qim0) obj8, (max) null, yla.s(x340Var11), (idn0) null, (vu30) null, j9j.d, j9j.e, x340Var11, 14155776, 52);
                    x340Var11.r(false);
                } else {
                    x340 x340Var12 = x340Var10;
                    x340Var12.i0(1385870472);
                    gfx.f(6, apo.r(1837024053, new rih((qim0) obj8, (Function0) obj6, iu30Var), x340Var12), x340Var12);
                    x340Var12.r(false);
                }
                return rih1Var;
            case 7:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var13 = (b0k) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                List list = (List) obj8;
                b0i0 b0i0Var = (b0i0) obj7;
                if ((iIntValue3 & 6) == 0) {
                    i2 = iIntValue3 | (x340Var13.g(aqb0Var) ? 4 : 2);
                } else {
                    i2 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i2 |= x340Var13.e(iIntValue2) ? 32 : 16;
                }
                x340 x340Var14 = x340Var13;
                if (!x340Var14.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var14.b0();
                    return rih1Var;
                }
                Object objT2 = x340Var14.T();
                m4c m4cVar = fkj0.X;
                if (objT2 == m4cVar) {
                    objT2 = v8r.q(Boolean.FALSE);
                    x340Var14.s0(objT2);
                }
                ven0 ven0Var = (ven0) objT2;
                float f = (!((a401) obj5).b || ((Boolean) ven0Var.getValue()).booleanValue() || ((Boolean) ((ven0) obj6).getValue()).booleanValue() || iIntValue2 > 0) ? 0.0f : -27.0f;
                b0i0Var.getClass();
                tob1 tob1VarA = z95.a(f, irn1.l0(0.45f, 400.0f, (Object) null, 4), gvg.g(list.get(iIntValue2), "Reaction offset animation for reaction "), x340Var14, 0, 8);
                String str2 = (String) list.get(iIntValue2);
                qim0 qim0VarA = aqb0Var.a(lrn1.x(nim0Var, list.size() - iIntValue2), iIntValue2 > 0 ? irn1.l0(0.45f, 400.0f, (Object) null, 4) : null, irn1.l0(0.45f, 400.0f, (Object) null, 4), irn1.l0(0.45f, 400.0f, (Object) null, 4));
                boolean zG2 = x340Var14.g(tob1VarA);
                Object objT3 = x340Var14.T();
                if (zG2 || objT3 == m4cVar) {
                    objT3 = new lws0(tob1VarA, (byte) 7);
                    x340Var14.s0(objT3);
                }
                b0i0Var.b(0, str2, x340Var14, eqr0.B(qim0VarA, (iu30) objT3));
                Object obj9 = list.get(iIntValue2);
                Object objT4 = x340Var14.T();
                if (objT4 == m4cVar) {
                    objT4 = new vk1(ven0Var, (lnm) null, (byte) 24);
                    x340Var14.s0(objT4);
                }
                qxd0.t(obj9, x340Var14, (vu30) objT4);
                return rih1Var;
            case 8:
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var15 = (b0k) obj3;
                ((Number) obj4).intValue();
                k221 k221Var = (k221) obj5;
                d221 d221Var = (f221) k221Var.c.get(iIntValue4);
                if (d221Var instanceof d221) {
                    x340 x340Var16 = x340Var15;
                    x340Var16.i0(828627126);
                    d221 d221Var2 = d221Var;
                    otw.c((a221) obj7, new x121(iIntValue4, (String) obj8, d221Var2.a, d221Var2.b), (qim0) null, (ipb1) null, x340Var16, 0, 12);
                    x340Var16.r(false);
                } else {
                    if (!u890.j(d221Var, e221.a)) {
                        throw p3d1.k(x340Var15, 828624009, false);
                    }
                    x340 x340Var17 = x340Var15;
                    x340Var17.i0(-81971679);
                    otw.c((laa1) ((hyy0) obj6).c, Integer.valueOf(k221Var.d), (qim0) null, (ipb1) null, x340Var17, 0, 12);
                    x340Var17.r(false);
                }
                return rih1Var;
            case 9:
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var18 = (b0k) obj3;
                ((Number) obj4).intValue();
                if (iIntValue5 > 0) {
                    x340 x340Var19 = x340Var18;
                    x340Var19.i0(1482396445);
                    wxj1 wxj1Var = (wxj1) obj5;
                    String str3 = (String) obj7;
                    xnb xnbVar = (xnb) obj8;
                    Set set = (Set) obj6;
                    mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var19, 0);
                    int iHashCode = Long.hashCode(x340Var19.T);
                    xos0 xos0VarM = x340Var19.m();
                    qim0 qim0VarE = zr7.E(x340Var19, nim0Var);
                    hzj.A.getClass();
                    if (x340Var19.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var19.m0();
                    if (x340Var19.S) {
                        x340Var19.l(hmb0.t1);
                    } else {
                        x340Var19.v0();
                    }
                    nko1.H(mbhVarA, x340Var19, y580.O0);
                    nko1.H(xos0VarM, x340Var19, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var19, y580.R0);
                    nko1.F(x340Var19);
                    nko1.H(qim0VarE, x340Var19, y580.Y);
                    otw.c(wxj1Var, new uxj1(iIntValue5, str3), (qim0) null, (ipb1) null, x340Var19, 0, 12);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var19).b;
                    op71.g(x340Var19, u291.h(nim0Var, 12.0f));
                    otw.c(xnbVar, new xxj1(set), (qim0) null, (ipb1) null, x340Var19, 0, 12);
                    x340Var19.r(true);
                    x340Var19.r(false);
                } else {
                    x340 x340Var20 = x340Var18;
                    x340Var20.i0(1482892321);
                    x340Var20.r(false);
                }
                return rih1Var;
            default:
                return new ont((lnt) ((qfv) obj5).f, (Context) obj2, (iac0) obj7, (n9c) obj8, (lnt) obj6);
        }
    }
}
