package p;

import android.net.Uri;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ys extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys(fli0 fli0Var, float f, k2t0 k2t0Var, lzn0 lzn0Var) {
        super(2);
        this.a = (byte) 8;
        this.d = fli0Var;
        this.c = f;
        this.e = k2t0Var;
        this.b = lzn0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        qim0 qim0VarA;
        byte b = this.a;
        f36 f36Var = h36.c;
        b36 b36Var = h36.e;
        n4k n4kVar = hmb0.t1;
        float f = this.c;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        int i = 1;
        Object obj4 = this.d;
        Object obj5 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarL = bmq0.L(u291.f(nim0Var, 1.0f), k1o1.q(x340Var2), (g6o0) null);
                    ViewGroup viewGroup = (ViewGroup) obj4;
                    xtb0 xtb0Var = (xtb0) obj5;
                    if (xtb0Var.d() || xtb0Var.c()) {
                        qim0VarL = f8d1.b(qim0VarL, rih1Var, new jt(viewGroup, (byte) 0));
                    } else {
                        viewGroup.requestDisallowInterceptTouchEvent(false);
                    }
                    qim0 qim0Var = qim0VarL;
                    xtb0 xtb0Var2 = (xtb0) obj5;
                    hdh hdhVarN = lnn1.n(uyn1.j(0.0f, f - 8.0f, 0.0f, 0.0f, 13), ((uvx) x340Var2.k(vvx.a)).e);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    d36 d36Var = new d36(4.0f, true, new um5(false));
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new qj(iu30Var, (byte) 2);
                        x340Var2.s0(objT);
                    }
                    s3o1.e(qim0Var, xtb0Var2, hdhVarN, d36Var, null, null, null, (iu30) objT, x340Var2, 0, 232);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                aq8.s((wm2) obj4, (iu30) obj3, (lsr) obj5, this.c, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                tz2.c((zwt0) obj4, (mxt0) obj5, (h72) obj3, this.c, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                tz2.d((zwt0) obj4, (nxt0) obj5, (h72) obj3, this.c, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    hcx hcxVar = (hcx) obj4;
                    c380 c380Var = (c380) obj5;
                    Function0 function0 = (Function0) obj3;
                    nim0 nim0Var2 = nim0.a;
                    if (function0 != null) {
                        x340Var4.i0(-219720420);
                        qim0 qim0VarD = i541.D(nim0Var2, 0.0f, 0.0f, this.c, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048571);
                        Object objT2 = x340Var4.T();
                        if (objT2 == m4cVar) {
                            objT2 = rmf.Q0;
                            x340Var4.s0(objT2);
                        }
                        qim0VarA = s161.a(qim0VarD, (iu30) objT2);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-219620290);
                        Object objT3 = x340Var4.T();
                        if (objT3 == m4cVar) {
                            objT3 = rmf.R0;
                            x340Var4.s0(objT3);
                        }
                        qim0VarA = s161.a(nim0Var2, (iu30) objT3);
                        x340Var4.r(false);
                    }
                    qim0 qim0Var2 = qim0VarA;
                    Parcelable.Creator creator = w4i1.CREATOR;
                    aqo1.f(0, 0, x340Var4, hcxVar, c380Var, qim0Var2);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var6 = x340Var5;
                boolean zY = x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2);
                j06 j06Var = x340Var6.a;
                if (zY) {
                    qim0 qim0VarV = u291.v(u291.h(nim0Var, 142.0f), yoi1.o(0.85f * f, 290.0f, 312.0f));
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar = cbx.b(x340Var6).f;
                    qim0 qim0VarF = dug.f(i1p1.q(qim0VarV, er31.b(8.0f)), cbx.a(x340Var6).a.a.a(), d4o1.a);
                    jtr jtrVar = jtr.f;
                    Object objT4 = x340Var6.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT4 == m4cVar2) {
                        objT4 = ktd.n(x340Var6);
                    }
                    idn0 idn0Var = (idn0) objT4;
                    boolean zG2 = x340Var6.g(iu30Var2);
                    Object objT5 = x340Var6.T();
                    if (zG2 || objT5 == m4cVar2) {
                        objT5 = new lck(iu30Var2, (byte) 1);
                        x340Var6.s0(objT5);
                    }
                    qim0 qim0VarY = bin.y(qim0VarF, idn0Var, jtrVar, false, null, null, null, null, (Function0) objT5, 508);
                    hqk hqkVar = (hqk) obj4;
                    znb0 znb0Var = (znb0) obj5;
                    jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var6, 0);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, qim0VarY);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(jw31VarA, x340Var6, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var6, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var6, lljVar3);
                    nko1.F(x340Var6);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var6, lljVar4);
                    gra graVar = een.d;
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM2 = x340Var6.m();
                    qim0 qim0VarE2 = zr7.E(x340Var6, nim0Var);
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(gfh0VarC, x340Var6, lljVar);
                    nko1.H(xos0VarM2, x340Var6, lljVar2);
                    x0d.q(iHashCode2, x340Var6, lljVar3, x340Var6);
                    nko1.H(qim0VarE2, x340Var6, lljVar4);
                    eso1.e(Uri.parse(hqkVar.b), isl.a, u291.r(nim0Var, 142.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var6, 48, 0, 4088);
                    aym.c(0, hqkVar.d, hqkVar.e, x340Var6, h2c.a.a(nim0Var, graVar));
                    x340Var6.r(true);
                    era eraVar = een.P0;
                    mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var6, 0);
                    int iHashCode3 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM3 = x340Var6.m();
                    qim0 qim0VarE3 = zr7.E(x340Var6, nim0Var);
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(mbhVarA, x340Var6, lljVar);
                    nko1.H(xos0VarM3, x340Var6, lljVar2);
                    x0d.q(iHashCode3, x340Var6, lljVar3, x340Var6);
                    nko1.H(qim0VarE3, x340Var6, lljVar4);
                    cvx cvxVar2 = cbx.b(x340Var6).b;
                    d36 d36Var2 = new d36(2.0f, true, new um5(false));
                    cvx cvxVar3 = cbx.b(x340Var6).b;
                    qim0 qim0VarX = uyn1.x(nim0Var, 16.0f);
                    mbh mbhVarA2 = jbh.a(d36Var2, eraVar, x340Var6, 0);
                    int iHashCode4 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM4 = x340Var6.m();
                    qim0 qim0VarE4 = zr7.E(x340Var6, qim0VarX);
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(mbhVarA2, x340Var6, lljVar);
                    nko1.H(xos0VarM4, x340Var6, lljVar2);
                    x0d.q(iHashCode4, x340Var6, lljVar3, x340Var6);
                    nko1.H(qim0VarE4, x340Var6, lljVar4);
                    uwo1.e(hqkVar.c, null, cbx.d(x340Var6).j, cbx.a(x340Var6).b.b, new a0e1(5), null, 2, false, new cjc0(1), 0, null, x340Var6, 0, 0, 1698);
                    uwo1.e(hqkVar.f, null, cbx.d(x340Var6).k, cbx.a(x340Var6).b.a, new a0e1(5), null, 2, false, new cjc0(2), 0, null, x340Var6, 0, 0, 1698);
                    uwo1.e(hqkVar.g, null, cbx.d(x340Var6).j, cbx.a(x340Var6).b.b, new a0e1(5), null, 2, false, new cjc0(1), 0, null, x340Var6, 0, 0, 1698);
                    x340Var6.r(true);
                    op71.g(x340Var6, new wnb0(1.0f, true));
                    maa maaVar = (maa) znb0Var.getValue();
                    String str = hqkVar.a;
                    otw.c(maaVar, new uho(str, str, new pho(false, jdx.c, true), (nho) null, (String) null, (Function0) null, 248), (qim0) null, (ipb1) null, x340Var6, 8, 12);
                    x340Var6.r(true);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ioo1.i(this.c, (j2i) obj4, (qim0) obj5, (j2i) obj3, (b0k) obj, czo1.p(3121));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                a8o.c((ma90) obj4, this.c, (Function0) obj5, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                fli0 fli0Var = (fli0) obj4;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    j2i j2iVarR = apo.r(-1677030030, new rz2(fli0Var, f, (byte) 7), x340Var8);
                    j2i j2iVarR2 = apo.r(226633648, new jli0((lzn0) obj3, (byte) 0), x340Var8);
                    long j = u7h.j;
                    long jB = u7h.b(z4p1.e(fli0Var.g), this.c, 0.0f, 0.0f, 0.0f, 14);
                    uwr uwrVar3 = cbx.a;
                    ti5.d(j2iVarR, (qim0) null, j2iVarR2, (xu30) null, 0.0f, (erl1) null, kkn.C(j, jB, cbx.a(x340Var8).b.a, cbx.a(x340Var8).b.a, cbx.a(x340Var8).b.a, x340Var8, 32), (k2t0) obj5, x340Var8, 390, 58);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                x3p1.a(this.c, (hnk0) obj4, (String) obj5, (String) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                mez0.b((qim0) obj4, (vzq0) obj5, this.c, (j2i) obj3, (b0k) obj, czo1.p(24583));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                mym.g((k7f1) obj4, this.c, (qim0) obj5, (Function0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                kkz0 kkz0Var = (kkz0) obj4;
                ven0 ven0Var = (ven0) obj5;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    c380 c380Var2 = (c380) kkz0Var.b;
                    rfv0 rfv0Var = (rfv0) ven0Var.getValue();
                    Object objT6 = x340Var10.T();
                    if (objT6 == fkj0.X) {
                        objT6 = new ry71(ven0Var, (byte) 20);
                        x340Var10.s0(objT6);
                    }
                    iu30 iu30Var3 = (iu30) objT6;
                    uwr uwrVar4 = cbx.a;
                    oon1.a(c380Var2, rfv0Var, iu30Var3, cbx.d(x340Var10).k, cbx.d(x340Var10).h, null, x340Var10, 384);
                    qim0 qim0VarZ = uyn1.z(24.0f, 0.0f, 2, u291.d(nim0Var, 1.0f));
                    era eraVar2 = een.Q0;
                    rk41 rk41Var = (rk41) obj3;
                    mbh mbhVarA3 = jbh.a(b36Var, eraVar2, x340Var10, 54);
                    int iHashCode5 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM5 = x340Var10.m();
                    qim0 qim0VarE5 = zr7.E(x340Var10, qim0VarZ);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(mbhVarA3, x340Var10, y580.O0);
                    nko1.H(xos0VarM5, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode5), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE5, x340Var10, y580.Y);
                    op71.g(x340Var10, u291.c(nim0Var, 0.13f));
                    h9f1 h9f1Var = (h9f1) kkz0Var.d;
                    w9f1 w9f1Var = h9f1Var.a;
                    List list = h9f1Var.b;
                    y2o1.e((vnr0) w9f1Var.invoke(x340Var10, 0), rk41Var.a, kkz0Var.c, ktd.m(eraVar2, u291.f(nim0Var, 1.0f)), 0, x340Var10, 8, 16);
                    op71.g(x340Var10, u291.h(nim0Var, 12.0f));
                    x340Var10.i0(-1910781118);
                    yto.d((ArrayList) kkz0Var.e, this.c, rk41Var.a, kkz0Var.c, kx40.h(1.0f, u291.f(nim0Var, 1.0f), false), x340Var10, 0);
                    x340Var10.r(false);
                    op71.g(x340Var10, u291.h(nim0Var, 12.0f));
                    x340Var10.i0(-1910767416);
                    int i2 = 0;
                    for (Object obj6 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        yto.h((wi90) obj6, i2, ((rfv0) ven0Var.getValue()).a, rk41Var.a, kkz0Var.c, null, x340Var10, 0);
                        if (i2 < p7h.L(list)) {
                            v8i0.i(8.0f, 600001539, x340Var10, x340Var10, nim0Var);
                            x340Var10.r(false);
                        } else {
                            x340Var10.i0(600064965);
                            x340Var10.r(false);
                        }
                        i2 = i3;
                    }
                    x340Var10.r(false);
                    op71.g(x340Var10, u291.h(nim0Var, 16.0f));
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                faf1 faf1Var = (faf1) obj4;
                ven0 ven0Var2 = (ven0) obj5;
                x340 x340Var12 = x340Var11;
                boolean zY2 = x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2);
                j06 j06Var2 = x340Var12.a;
                if (zY2) {
                    c380 c380Var3 = faf1Var.e;
                    rfv0 rfv0Var2 = (rfv0) ven0Var2.getValue();
                    Object objT7 = x340Var12.T();
                    if (objT7 == fkj0.X) {
                        objT7 = new ry71(ven0Var2, (byte) 22);
                        x340Var12.s0(objT7);
                    }
                    iu30 iu30Var4 = (iu30) objT7;
                    uwr uwrVar5 = cbx.a;
                    oon1.a(c380Var3, rfv0Var2, iu30Var4, cbx.d(x340Var12).c, cbx.d(x340Var12).b, null, x340Var12, 384);
                    qim0 qim0VarZ2 = uyn1.z(24.0f, 0.0f, 2, u291.d(nim0Var, 1.0f));
                    rk41 rk41Var2 = (rk41) obj3;
                    era eraVar3 = een.P0;
                    mbh mbhVarA4 = jbh.a(b36Var, eraVar3, x340Var12, 6);
                    int iHashCode6 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM6 = x340Var12.m();
                    qim0 qim0VarE6 = zr7.E(x340Var12, qim0VarZ2);
                    hzj.A.getClass();
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    llj lljVar5 = y580.O0;
                    nko1.H(mbhVarA4, x340Var12, lljVar5);
                    llj lljVar6 = y580.N0;
                    nko1.H(xos0VarM6, x340Var12, lljVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode6);
                    llj lljVar7 = y580.R0;
                    nko1.H(numValueOf2, x340Var12, lljVar7);
                    nko1.F(x340Var12);
                    llj lljVar8 = y580.Y;
                    nko1.H(qim0VarE6, x340Var12, lljVar8);
                    op71.g(x340Var12, u291.c(nim0Var, 0.13f));
                    h9f1 h9f1Var2 = faf1Var.a;
                    int i4 = faf1Var.b;
                    w9f1 w9f1Var2 = h9f1Var2.a;
                    List list2 = h9f1Var2.b;
                    y2o1.e((vnr0) w9f1Var2.invoke(x340Var12, 0), rk41Var2.a, faf1Var.c, u291.f(nim0Var, 1.0f), 0, x340Var12, 3080, 16);
                    op71.g(x340Var12, u291.h(nim0Var, 24.0f));
                    qim0 qim0VarH = u291.h(nim0Var, f);
                    mbh mbhVarA5 = jbh.a(f36Var, eraVar3, x340Var12, 0);
                    int iHashCode7 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM7 = x340Var12.m();
                    qim0 qim0VarE7 = zr7.E(x340Var12, qim0VarH);
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(mbhVarA5, x340Var12, lljVar5);
                    nko1.H(xos0VarM7, x340Var12, lljVar6);
                    x0d.q(iHashCode7, x340Var12, lljVar7, x340Var12);
                    nko1.H(qim0VarE7, x340Var12, lljVar8);
                    x340Var12.i0(145465849);
                    int i5 = 0;
                    for (Object obj7 : list2) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            p7h.T();
                            throw null;
                        }
                        wi90 wi90Var = (wi90) obj7;
                        float size = f / list2.size();
                        if (i4 == i) {
                            double d = size;
                            size = (float) (d - (((double) i5) * (0.04d * d)));
                        }
                        int iC = l1d.C(i4);
                        if (iC == 0 || iC == 1) {
                            x340Var12.i0(-375337996);
                            d1u.y(size, i5, ((rfv0) ven0Var2.getValue()).a, 0, x340Var12, wi90Var, u291.h(nim0Var, size), rk41Var2.a, faf1Var.c);
                            x340Var12.r(false);
                        } else {
                            if (iC != 2) {
                                throw p3d1.k(x340Var12, -704847090, false);
                            }
                            x340Var12.i0(-374841376);
                            float f2 = size;
                            wmo1.j(f2, i5, ((rfv0) ven0Var2.getValue()).a, 0, x340Var12, wi90Var, u291.h(nim0Var, size), rk41Var2.a, faf1Var.c);
                            x340Var12.r(false);
                        }
                        i5 = i6;
                        i = 1;
                    }
                    x340Var12.r(false);
                    x340Var12.r(true);
                    op71.g(x340Var12, u291.h(nim0Var, 16.0f));
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                rpo1.m((File) obj4, this.c, (qim0) obj5, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                cbp1.g((qim0) obj4, this.c, (Function0) obj5, (j2i) obj3, (b0k) obj, czo1.p(3073));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys(float f, iu30 iu30Var, hqk hqkVar, znb0 znb0Var) {
        super(2);
        this.a = (byte) 5;
        this.c = f;
        this.b = iu30Var;
        this.d = hqkVar;
        this.e = znb0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys(Object obj, float f, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.c = f;
        this.e = obj2;
        this.b = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys(pt ptVar, ViewGroup viewGroup, xtb0 xtb0Var, float f, iu30 iu30Var) {
        super(2);
        this.a = (byte) 0;
        this.d = viewGroup;
        this.e = xtb0Var;
        this.c = f;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys(wm2 wm2Var, iu30 iu30Var, lsr lsrVar, float f, int i) {
        super(2);
        this.a = (byte) 1;
        this.d = wm2Var;
        this.b = iu30Var;
        this.e = lsrVar;
        this.c = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys(hcx hcxVar, c380 c380Var, Function0 function0, float f) {
        super(2);
        this.a = (byte) 4;
        this.d = hcxVar;
        this.e = c380Var;
        this.b = function0;
        this.c = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys(float f, Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.c = f;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys(qim0 qim0Var, vzq0 vzq0Var, float f, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 10;
        this.d = qim0Var;
        this.e = vzq0Var;
        this.c = f;
        this.b = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys(zwt0 zwt0Var, Enum r2, h72 h72Var, float f, int i, byte b) {
        super(2);
        this.a = b;
        this.d = zwt0Var;
        this.e = r2;
        this.b = h72Var;
        this.c = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys(f311 f311Var, che0 che0Var, ven0 ven0Var, rk41 rk41Var, float f, byte b) {
        super(2);
        this.a = b;
        this.d = f311Var;
        this.e = ven0Var;
        this.b = rk41Var;
        this.c = f;
    }
}
