package p;

import android.content.Context;
import androidx.compose.ui.geometry.Offset;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import java.io.File;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wpg1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpg1(j2i j2iVar, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 14;
        this.c = j2iVar;
        this.b = function0;
        this.d = qim0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        String string;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        hax haxVar;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                qon1.a((gbx) obj5, (j2i) obj4, (qim0) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ((kjs) obj5).b((sqe) obj4, (jm91) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                qqn1.d((vta1) obj5, (vta1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                crn1.a((tob1) obj5, (qim0) obj3, (j2i) obj4, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                z0o1.d((v3h1) obj5, (qxl) obj4, (dp5) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                y3o1.k((p8h1) obj5, (qim0) obj3, (j2i) obj4, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 6:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                leh1 leh1Var = (leh1) obj5;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aym.e((gt40) null, leh1Var != null ? new u8h(new oxe1(leh1Var.b)) : null, x340Var2, 64);
                    et40 et40Var = et40.a;
                    j2h1.b(dm5.I(et40Var), ql3.f, apo.r(1664709233, new xaf1((Context) obj4, leh1Var, (byte) 21), x340Var2), x340Var2, 384, 0);
                    j2h1.b(dm5.I(et40Var), ql3.k, apo.r(-1182309528, new meh1((whb1) obj3, leh1Var, (byte) 4), x340Var2), x340Var2, 384, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                ggo1.v((whb1) obj5, (gt40) obj4, (leh1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj5;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j2i j2iVarR = apo.r(105060007, new xaf1((a470) obj4, (tob1) obj3, (byte) 22), x340Var4);
                    uwr uwrVar = cbx.a;
                    qgr0 qgr0Var = new qgr0(cbx.a(x340Var4).a.c);
                    boolean zG = x340Var4.g(function0);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        objT = new sah1(function0, (byte) 3);
                        x340Var4.s0(objT);
                    }
                    bzn1.e(null, j2iVarR, false, null, qgr0Var, null, null, (Function0) objT, x340Var4, 48, 109);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                gio1.j((zmh1) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                Context context = (Context) ((el9) obj4).i;
                mnh1 mnh1Var = (mnh1) obj5;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str = mnh1Var.a;
                    String strO = xio1.o(mnh1Var.d, context, mnh1Var.e);
                    int iC = l1d.C(mnh1Var.c);
                    if (iC != 2) {
                        string = iC != 7 ? "" : context.getString(2131963495);
                    } else {
                        string = context.getString(2131963493);
                    }
                    cs11 cs11Var = new cs11(32, str, string, mnh1Var.b, strO, false, mnh1Var.e);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                    ogx ogxVar = ogx.e;
                    boolean zG2 = x340Var6.g(iu30Var);
                    Object objT2 = x340Var6.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new ceg1(iu30Var, (byte) 4);
                        x340Var6.s0(objT2);
                    }
                    r4p1.e(cs11Var, qim0VarZ, ogxVar, 2, (iu30) objT2, x340Var6, 3072, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                ((s1i1) obj5).c((czb) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                ((m6i1) obj5).f(czo1.p(1), (String) obj4, (b0k) obj, (iu30) obj3);
                return rih1Var;
            case 13:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ((m6i1) obj5).f(0, ((i6i1) obj4).b, x340Var8, (iu30) obj3);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                o6i1.c(czo1.p(7), (Function0) obj5, (j2i) obj4, (b0k) obj, (qim0) obj3);
                return rih1Var;
            case 15:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                w9i1 w9i1Var = (w9i1) obj5;
                x340 x340Var10 = x340Var9;
                boolean zY = x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2);
                j06 j06Var = x340Var10.a;
                if (zY) {
                    ven0 ven0VarK = f4p1.k(w9i1Var.b1, (iac0) null, x340Var10, 7);
                    ven0 ven0VarK2 = f4p1.k(w9i1Var.f1, (iac0) null, x340Var10, 7);
                    ven0 ven0VarK3 = f4p1.k(w9i1Var.d1, (iac0) null, x340Var10, 7);
                    ven0 ven0VarK4 = f4p1.k(w9i1Var.h1, (iac0) null, x340Var10, 7);
                    ven0 ven0VarK5 = f4p1.k(w9i1Var.j1, (iac0) null, x340Var10, 7);
                    es41 es41VarC = l6o1.C(0, 0, 1, x340Var10);
                    WeakHashMap weakHashMap = osl1.x;
                    u85 u85Var = lhc.g(x340Var10).c;
                    boolean z5 = u85Var.e().d > 0;
                    if (z5) {
                        x340Var10.i0(1023172662);
                        x340Var10.r(false);
                        f = 0.0f;
                        f2 = 0.0f;
                    } else {
                        x340Var10.i0(1023040044);
                        uwr uwrVar3 = cbx.a;
                        f = cbx.b(x340Var10).b.d;
                        float f3 = cbx.b(x340Var10).b.b;
                        x340Var10.r(false);
                        f2 = f3;
                    }
                    nim0 nim0Var2 = nim0.a;
                    boolean z6 = z5;
                    qim0 qim0VarD = u291.d(nim0Var2, 1.0f);
                    Function0 function1 = (Function0) obj4;
                    n9i1 n9i1Var = (n9i1) obj3;
                    gra graVar = een.d;
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM = x340Var10.m();
                    qim0 qim0VarE = zr7.E(x340Var10, qim0VarD);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    boolean z7 = x340Var10.S;
                    n4k n4kVar = hmb0.t1;
                    if (z7) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var10, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var10, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    float f4 = f;
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var10, lljVar3);
                    nko1.F(x340Var10);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var10, lljVar4);
                    qim0 qim0VarH = l6o1.H(u291.d(nim0Var2, 1.0f), es41VarC, false, 14);
                    uwr uwrVar4 = cbx.a;
                    qim0 qim0VarB = uyn1.B(qim0VarH, 0.0f, 0.0f, 0.0f, cbx.b(x340Var10).b.f, 7);
                    cvx cvxVar2 = cbx.b(x340Var10).b;
                    d36 d36Var = new d36(8.0f, true, new um5(false));
                    era eraVar = een.P0;
                    mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var10, 0);
                    int iHashCode2 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM2 = x340Var10.m();
                    qim0 qim0VarE2 = zr7.E(x340Var10, qim0VarB);
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(mbhVarA, x340Var10, lljVar);
                    nko1.H(xos0VarM2, x340Var10, lljVar2);
                    x0d.q(iHashCode2, x340Var10, lljVar3, x340Var10);
                    nko1.H(qim0VarE2, x340Var10, lljVar4);
                    mbh mbhVarA2 = jbh.a(new d36(cbx.b(x340Var10).b.a, true, new um5(false)), eraVar, x340Var10, 0);
                    int iHashCode3 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM3 = x340Var10.m();
                    qim0 qim0VarE3 = zr7.E(x340Var10, nim0Var2);
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(mbhVarA2, x340Var10, lljVar);
                    nko1.H(xos0VarM3, x340Var10, lljVar2);
                    x0d.q(iHashCode3, x340Var10, lljVar3, x340Var10);
                    nko1.H(qim0VarE3, x340Var10, lljVar4);
                    if (w9i1Var.R0) {
                        x340Var10.i0(-2019547389);
                        zxx zxxVar = new zxx(cbx.a(x340Var10).b.a, cbx.a(x340Var10).b.a, cbx.a(x340Var10).b.b, cbx.a(x340Var10).b.d, cbx.a(x340Var10).d.b, cbx.a(x340Var10).d.b, cbx.a(x340Var10).b.c, 0L, 896);
                        qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
                        cua cuaVar = cbx.b(x340Var10).f;
                        qim0 qim0VarQ = i1p1.q(qim0VarF, er31.b(16.0f));
                        y7e1 y7e1Var = w9i1Var.t1;
                        String strO0 = cwl1.o0(x340Var10, 2131963564);
                        cvx cvxVar3 = cbx.b(x340Var10).b;
                        rwo1.b(y7e1Var, qim0VarQ, null, strO0, null, null, false, false, null, null, null, null, d6e1.b, null, null, null, null, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), 0.0f, false, zxxVar, x340Var10, 0, 0, 913396);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(-2018421655);
                        String strO1 = cwl1.o0(x340Var10, w9i1.d0(((e9i1) ven0VarK3.getValue()).a));
                        Object objT3 = x340Var10.T();
                        if (objT3 == m4cVar) {
                            objT3 = vbh1.Y;
                            x340Var10.s0(objT3);
                        }
                        two1.o(strO1, m061.a, (Function0) objT3, null, x340Var10, 432);
                        x340Var10.r(false);
                    }
                    zxx zxxVar2 = new zxx(cbx.a(x340Var10).b.a, cbx.a(x340Var10).b.a, cbx.a(x340Var10).b.b, cbx.a(x340Var10).b.d, cbx.a(x340Var10).d.b, cbx.a(x340Var10).d.b, cbx.a(x340Var10).b.c, 0L, 896);
                    qim0 qim0VarF2 = u291.f(nim0Var2, 1.0f);
                    cua cuaVar2 = cbx.b(x340Var10).f;
                    qim0 qim0VarQ2 = i1p1.q(qim0VarF2, er31.b(16.0f));
                    y7e1 y7e1Var2 = w9i1Var.s1;
                    String strO2 = cwl1.o0(x340Var10, 2131963557);
                    cvx cvxVar4 = cbx.b(x340Var10).b;
                    rwo1.b(y7e1Var2, qim0VarQ2, null, strO2, null, null, false, false, k8p1.m(vy5.e, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER), null, null, null, new c6e1(1, 10), null, null, null, null, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), 0.0f, false, zxxVar2, x340Var10, 0, 0, 913140);
                    String str2 = w9i1Var.Z0;
                    if (str2 == null) {
                        x340Var10.i0(-2016853025);
                        z = false;
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(-2016853024);
                        uwo1.e(str2, null, cbx.d(x340Var10).m, cbx.a(x340Var10).b.b, null, null, 0, false, null, 0, null, x340Var10, 0, 0, 2034);
                        z = false;
                        x340Var10.r(false);
                    }
                    File file = (File) ven0VarK2.getValue();
                    if (file == null) {
                        x340Var10.i0(-2016624183);
                        x340Var10.r(z);
                    } else {
                        x340Var10.i0(-2016624182);
                        if (((Boolean) ven0VarK5.getValue()).booleanValue()) {
                            x340Var10.i0(-604492292);
                            float fFloatValue = ((Number) ven0VarK4.getValue()).floatValue();
                            boolean zI = x340Var10.i(n9i1Var) | x340Var10.i(w9i1Var);
                            Object objT4 = x340Var10.T();
                            if (zI || objT4 == m4cVar) {
                                objT4 = new mah1(n9i1Var, w9i1Var, (byte) 10);
                                x340Var10.s0(objT4);
                            }
                            rpo1.m(file, fFloatValue, null, (Function0) objT4, x340Var10, 0);
                            z2 = false;
                            x340Var10.r(false);
                        } else {
                            z2 = false;
                            x340Var10.i0(-604200148);
                            x340Var10.r(false);
                        }
                        x340Var10.r(z2);
                    }
                    x340Var10.r(true);
                    op71.g(x340Var10, new wnb0(1.0f, true));
                    if (z6) {
                        z3 = false;
                        z4 = true;
                        x340Var10.i0(2081769202);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(2081404983);
                        qim0 qim0VarB2 = uyn1.B(nim0Var2, 0.0f, 0.0f, 0.0f, f2, 7);
                        gfh0 gfh0VarC2 = t1c.c(graVar, false);
                        int iHashCode4 = Long.hashCode(x340Var10.T);
                        xos0 xos0VarM4 = x340Var10.m();
                        qim0 qim0VarE4 = zr7.E(x340Var10, qim0VarB2);
                        x340Var10.m0();
                        if (x340Var10.S) {
                            x340Var10.l(n4kVar);
                        } else {
                            x340Var10.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var10, lljVar);
                        nko1.H(xos0VarM4, x340Var10, lljVar2);
                        x0d.q(iHashCode4, x340Var10, lljVar3, x340Var10);
                        nko1.H(qim0VarE4, x340Var10, lljVar4);
                        boolean zBooleanValue = ((Boolean) ven0VarK5.getValue()).booleanValue();
                        boolean zI2 = x340Var10.i(n9i1Var) | x340Var10.i(w9i1Var) | x340Var10.i(ven0VarK5);
                        Object objT5 = x340Var10.T();
                        if (zI2 || objT5 == m4cVar) {
                            objT5 = new o8e1(n9i1Var, w9i1Var, ven0VarK5, (byte) 17);
                            x340Var10.s0(objT5);
                        }
                        z3 = false;
                        rpo1.o(0, (Function0) objT5, x340Var10, null, zBooleanValue);
                        z4 = true;
                        x340Var10.r(true);
                        x340Var10.r(false);
                    }
                    x340Var10.r(z4);
                    String strK = ((ece0) ven0VarK.getValue()) instanceof sbe0 ? x0d.k(x340Var10, -1240998197, 2131963559, x340Var10, z3) : x0d.k(x340Var10, -1240912048, 2131963558, x340Var10, z3);
                    qim0 qim0VarA = h2c.a.a(nim0Var2, een.X);
                    cvx cvxVar5 = cbx.b(x340Var10).b;
                    cvx cvxVar6 = cbx.b(x340Var10).b;
                    qim0 qim0VarB3 = uyn1.B(qim0VarA, 8.0f, 0.0f, 8.0f, f4, 2);
                    if (((ece0) ven0VarK.getValue()) instanceof sbe0) {
                        x340Var10.i0(-1240507436);
                        haxVar = new hax(cwl1.o0(x340Var10, 2131963559));
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(-1240400114);
                        x340Var10.r(false);
                        haxVar = jax.a;
                    }
                    two1.d(function1, strK, qim0VarB3, true, haxVar, x340Var10, 3072);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    zci1 zci1Var = (zci1) obj5;
                    int i = zci1Var.c;
                    int i2 = zci1Var.d;
                    Function0 function2 = (Function0) obj4;
                    boolean zG3 = x340Var12.g(iu30Var2);
                    Object objT6 = x340Var12.T();
                    if (zG3 || objT6 == fkj0.X) {
                        objT6 = new uyh1(iu30Var2, (byte) 15);
                        x340Var12.s0(objT6);
                    }
                    eko1.m(i, i2, (qim0) null, (sgr0) null, 0L, function2, (Function0) objT6, x340Var12, 0, 28);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                rqo1.q((rdi1) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                thi1 thi1Var = (thi1) obj4;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    irn1.u(nim0.a, apo.r(-42375478, new xaf1((t2f1) obj5, thi1Var, (byte) 29), x340Var14), null, null, apo.r(-366441148, new sgi1((hhz) obj3, thi1Var, (byte) 1), x340Var14), x340Var14, 24624, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                wro1.q((me90) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                suh1 suh1Var = (suh1) obj3;
                iu30 iu30Var3 = (iu30) obj4;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    tvi1 tvi1Var = (tvi1) obj5;
                    boolean zG4 = x340Var16.g(iu30Var3);
                    Object objT7 = x340Var16.T();
                    if (zG4 || objT7 == fkj0.X) {
                        objT7 = new ceg1(iu30Var3, (byte) 9);
                        x340Var16.s0(objT7);
                    }
                    myo1.m(tvi1Var, (iu30) objT7, null, (aod0) ((kly0) suh1Var.d).get(), (yqg) suh1Var.f, x340Var16, 4096);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                ven0 ven0Var = (ven0) obj3;
                iu30 iu30Var4 = (iu30) obj4;
                dyi1 dyi1Var = (dyi1) obj5;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    boolean zI3 = x340Var18.i(dyi1Var) | x340Var18.g(iu30Var4) | x340Var18.i(ven0Var);
                    Object objT8 = x340Var18.T();
                    if (zI3 || objT8 == fkj0.X) {
                        objT8 = new jyi1(dyi1Var, iu30Var4, ven0Var, (byte) 0);
                        x340Var18.s0(objT8);
                    }
                    dm5.a((iu30) objT8, (qim0) null, (iu30) null, x340Var18, 0, 6);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                vyo1.s((dyi1) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 23:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                xzi1 xzi1Var = (xzi1) obj5;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var20 = x340Var19;
                if (!x340Var20.Y(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    x340Var20.b0();
                } else if (xzi1Var.a instanceof uzi1) {
                    x340Var20.i0(-708648373);
                    jtl1 jtl1Var = ((a0j1) obj4).h;
                    byte b2 = xzi1Var.a.a.a;
                    int iB = tzi1.e.b();
                    boolean zG5 = x340Var20.g(iu30Var5);
                    Object objT9 = x340Var20.T();
                    if (zG5 || objT9 == m4cVar2) {
                        objT9 = new uyh1(iu30Var5, (byte) 26);
                        x340Var20.s0(objT9);
                    }
                    sjo0.c(jtl1Var, b2, iB, null, (Function0) objT9, x340Var20, 0);
                    x340Var20.r(false);
                } else {
                    x340Var20.i0(-708355702);
                    boolean zG6 = x340Var20.g(iu30Var5);
                    Object objT10 = x340Var20.T();
                    if (zG6 || objT10 == m4cVar2) {
                        objT10 = new uyh1(iu30Var5, (byte) 27);
                        x340Var20.s0(objT10);
                    }
                    uwr uwrVar5 = cbx.a;
                    a8o.s((Function0) objT10, uyn1.B(nim0.a, cbx.b(x340Var20).b.a, 0.0f, 0.0f, 0.0f, 14), cqj.a, x340Var20, 384, 0);
                    x340Var20.r(false);
                }
                return rih1Var;
            case 24:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    idm idmVar = (idm) obj5;
                    wcm wcmVarD = d6j1.d((o6j1) obj4);
                    boolean zG7 = x340Var22.g(iu30Var6);
                    Object objT11 = x340Var22.T();
                    if (zG7 || objT11 == fkj0.X) {
                        objT11 = new y0j1(iu30Var6, (byte) 14);
                        x340Var22.s0(objT11);
                    }
                    otw.c(idmVar, wcm.a(wcmVarD, (Function0) objT11, (nx2) null, false, (String) null, 1007), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                m1p1.c((u720) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 26:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(1 & iIntValue12, (iIntValue12 & 3) != 2)) {
                    ji0 ji0Var = ((fdj1) obj5).a;
                    p1p1.o(0, ji0Var.c, ji0Var.U0, (Function0) obj3, (j2i) obj4, x340Var24);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 27:
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                dbj1 dbj1Var = (dbj1) obj4;
                adj1 adj1Var = (edj1) obj5;
                x340 x340Var26 = x340Var25;
                if (!x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x340Var26.b0();
                } else if (adj1Var instanceof adj1) {
                    qim0 qim0VarN = anm1.N(czd1.a, nim0Var);
                    qaj1 qaj1Var = dbj1Var.c;
                    int iOrdinal = qaj1Var.c.ordinal();
                    if (iOrdinal == 0) {
                        x340Var26.i0(551599513);
                        s9p1.c(adj1Var, iu30Var7, qim0VarN, qaj1Var.c, false, x340Var26, 0);
                        x340Var26.r(false);
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw p3d1.k(x340Var26, 433417743, false);
                        }
                        x340Var26.i0(551599513);
                        s9p1.c(adj1Var, iu30Var7, qim0VarN, qaj1Var.c, false, x340Var26, 0);
                        x340Var26.r(false);
                    } else {
                        x340Var26.i0(433419721);
                        qim0 qim0VarZ2 = u291.z(u291.f(qim0VarN, 1.0f), (fra) null, 3);
                        uwr uwrVar6 = cbx.a;
                        cvx cvxVar7 = cbx.b(x340Var26).b;
                        s9p1.c(adj1Var, iu30Var7, uyn1.y(qim0VarZ2, 16.0f, cbx.b(x340Var26).b.b), qaj1Var.c, false, x340Var26, 0);
                        x340Var26.r(false);
                    }
                }
                return rih1Var;
            case 28:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(1 & iIntValue14, (iIntValue14 & 3) != 2)) {
                    op0 op0Var = (op0) ((pt) obj5).d;
                    fdj1 fdj1Var = (fdj1) obj4;
                    boolean zG8 = x340Var28.g(iu30Var8);
                    Object objT12 = x340Var28.T();
                    if (zG8 || objT12 == fkj0.X) {
                        objT12 = new ceg1(iu30Var8, (byte) 27);
                        x340Var28.s0(objT12);
                    }
                    ji0 ji0Var2 = fdj1Var.a;
                    otw.c(op0Var, new kp0(new cs10(false), ji0Var2.U0, ji0Var2.c, ji0Var2, ji0Var2.i, ji0Var2.b, ji0Var2.Z.getValue(), ji0Var2.W0, ji0Var2.Y0.a, false, (iu30) objT12), (qim0) null, (ipb1) null, x340Var28, 0, 12);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            default:
                long j = ((Offset) obj2).a;
                ((hav0) obj).a();
                fn31.T((c9n) obj5, (o8n) null, 0, new vqm((o95) obj4, j, (o95) obj3, null, (byte) 1), 3);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wpg1(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wpg1(Object obj, qim0 qim0Var, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = qim0Var;
        this.c = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wpg1(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpg1(t2f1 t2f1Var, thi1 thi1Var, hhz hhzVar) {
        super(2);
        this.a = (byte) 18;
        this.b = t2f1Var;
        this.c = thi1Var;
        this.d = hhzVar;
    }
}
