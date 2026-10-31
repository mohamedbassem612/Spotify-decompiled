package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qy90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy90(Function0 function0, y6d1 y6d1Var, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 22;
        this.d = function0;
        this.c = y6d1Var;
        this.b = z;
        this.e = qim0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Object obj3;
        Object obj4;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        boolean z = this.b;
        int i = 0;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.e;
        Object obj6 = this.c;
        Object obj7 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                lmt0.f((ew90) obj6, this.b, (Function0) obj7, (vu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qc0 qc0Var = (qc0) obj6;
                    iu30 iu30Var = (iu30) obj7;
                    y7y0.f(qc0Var, this.b, iu30Var, (qim0) null, apo.r(-1256299579, new mb90((st60) obj5, qc0Var, iu30Var, (byte) 11), x340Var2), x340Var2, 24576);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    qc0 qc0Var2 = (qc0) obj6;
                    iu30 iu30Var2 = (iu30) obj7;
                    j2i j2iVar = (j2i) obj5;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var4, 0);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarF);
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
                    boolean z2 = qc0Var2.m;
                    pc0 pc0Var = qc0Var2.g;
                    String strN0 = qc0Var2.a;
                    if (z2) {
                        x340Var4.i0(1653586349);
                        strN0 = cwl1.n0(2131960768, new Object[]{strN0}, x340Var4);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(1653688587);
                        x340Var4.r(false);
                    }
                    String str = strN0;
                    if (z) {
                        x340Var4.i0(1653756942);
                        y7y0.c(str, qc0Var2.f, pc0Var.b, qc0Var2.k, qc0Var2.l, qc0Var2.n, iu30Var2, x340Var4, 0);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(1654113535);
                        y7y0.k(str, qc0Var2.k, iu30Var2, x340Var4, 0);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var4).b;
                        op71.g(x340Var4, u291.h(nim0Var, 12.0f));
                        y7y0.a(qc0Var2.f, pc0Var.b, qc0Var2.l, qc0Var2.n, iu30Var2, x340Var4, 0);
                        x340Var4.r(false);
                    }
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    op71.g(x340Var4, u291.h(nim0Var, 16.0f));
                    j2iVar.invoke(x340Var4, 0);
                    i3o1.d(null, x340Var4, 0);
                    x0d.s(nim0Var, 10.0f, x340Var4, true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                mue1.f((c380) obj6, (String) obj7, this.b, (qim0) obj5, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                too1.e((dwb0) obj6, this.b, (iu30) obj7, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str2 = (String) obj5;
                    Function0 function0 = (Function0) obj7;
                    for (Object obj8 : (List) obj6) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        ji0 ji0Var = (ji0) obj8;
                        boolean zG = x340Var6.g(ji0Var.a);
                        Object objT = x340Var6.T();
                        if (zG || objT == m4cVar) {
                            obj3 = objT;
                            xpw xpwVar = (xpw) function0.invoke();
                            x340Var6.s0(xpwVar);
                            obj3 = xpwVar;
                        }
                        xpw xpwVar2 = (xpw) obj3;
                        cxb0 cxb0Var = new cxb0(ji0Var, i, z, str2);
                        qim0 qim0VarV = u291.v(nim0Var, 316.0f);
                        Object objT2 = x340Var6.T();
                        if (objT2 == m4cVar) {
                            objT2 = zib0.b1;
                            x340Var6.s0(objT2);
                        }
                        otw.c(xpwVar2, cxb0Var, s161.a(qim0VarV, (iu30) objT2), (ipb1) null, x340Var6, 0, 8);
                        i = i2;
                    }
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                String str3 = (String) obj7;
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                u251 u251Var = (u251) obj6;
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else if (z) {
                    x340Var8.i0(-1693148666);
                    j2i j2iVar2 = (j2i) obj5;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM2 = x340Var8.m();
                    qim0 qim0VarE2 = zr7.E(x340Var8, nim0Var);
                    hzj.A.getClass();
                    if (x340Var8.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(gfh0VarC, x340Var8, y580.O0);
                    nko1.H(xos0VarM2, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE2, x340Var8, y580.Y);
                    j2iVar2.invoke(x340Var8, 0);
                    if (u251Var == null || str3.length() <= 0) {
                        x340Var8.i0(683978037);
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(683748358);
                        String str4 = u251Var.a;
                        uwr uwrVar3 = cbx.a;
                        y251.f(str3, str4, cbx.d(x340Var8).g, (qim0) null, 0L, 3, (iu30) null, x340Var8, 196608, 88);
                        x340Var8.r(false);
                    }
                    x340Var8.r(true);
                    x340Var8.r(false);
                } else if (u251Var == null || str3.length() <= 0) {
                    x340Var8.i0(-1692471130);
                    cjc0 cjc0Var = new cjc0(1);
                    uwr uwrVar4 = cbx.a;
                    uwo1.e((String) obj7, null, cbx.d(x340Var8).g, cbx.a(x340Var8).b.a, null, null, 2, false, cjc0Var, 0, null, x340Var8, 0, 0, 1714);
                    x340Var8.r(false);
                } else {
                    x340Var8.i0(-1692733793);
                    String str5 = u251Var.a;
                    uwr uwrVar5 = cbx.a;
                    y251.f((String) obj7, str5, cbx.d(x340Var8).g, (qim0) null, cbx.a(x340Var8).b.a, 1, (iu30) null, x340Var8, 196608, 72);
                    x340Var8.r(false);
                }
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                p2c0 p2c0Var = (p2c0) obj6;
                vu30 vu30Var = (vu30) obj5;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Boolean bool = (Boolean) ((cqs0) obj7).get(p2c0Var);
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    boolean zG2 = x340Var10.g(vu30Var) | x340Var10.i(p2c0Var);
                    Object objT3 = x340Var10.T();
                    if (zG2 || objT3 == fkj0.X) {
                        obj4 = objT3;
                        r2c0 r2c0Var = new r2c0(vu30Var, p2c0Var, (byte) 1);
                        x340Var10.s0(r2c0Var);
                        obj4 = r2c0Var;
                    }
                    obj4 = objT3;
                    oqo1.b(p2c0Var, zBooleanValue, (iu30) obj4, this.b, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                qro1.h((b7c0) obj6, (lax) obj7, this.b, (iu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                oec0.a((gbx) obj6, (qim0) obj7, this.b, (idn0) obj5, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                int i3 = MainLayoutContentContainerView.W0;
                ((MainLayoutContentContainerView) obj6).z((gzf0) obj7, (dzf0) obj5, this.b, (b0k) obj, iP);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                o4o1.g((bbh0) obj6, this.b, (Function0) obj7, (Function0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                xio1.d((pjh0) obj6, this.b, (jsl) obj5, (Function0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                wpo1.j((rdi0) obj6, (tob1) obj7, (fns) obj5, this.b, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                zso1.q((iu30) obj6, this.b, (fli0) obj7, (lzn0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                wxo1.g((ixi0) obj6, this.b, (iu30) obj7, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                rqg0.e((fdq0) obj6, (xbq0) obj5, this.b, (Function0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                ((ahi0) obj6).f((g5r0) obj5, this.b, (Function0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                x2g0.o((Uri) obj6, (String) obj7, this.b, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                rqg0.l(this.b, (yeu0) obj6, (iu30) obj7, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                nb51.i((r7x0) obj6, (lww0) obj7, this.b, (iu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                mue1.n((l2u0) obj6, this.b, (iu30) obj7, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                zho1.m((Function0) obj7, (y6d1) obj6, this.b, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                zfz0.b((fgz0) obj6, (iu30) obj7, (qim0) obj5, this.b, (b0k) obj, czo1.p(71));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                cso1.v((hc01) obj6, this.b, (Function0) obj7, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                f2p1.h((String) obj6, this.b, (Function0) obj7, (Function0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                u4p1.b((c380) obj6, (vu30) obj5, (vu30) obj7, this.b, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                ucp1.f((mr20) obj6, this.b, (Function0) obj7, (j2i) obj5, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                apo.e((qa31) obj6, this.b, (kj31) obj7, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                ((ru31) obj6).h(czo1.p(1), (String) obj7, (b0k) obj, (qim0) obj5, this.b);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy90(Object obj, Object obj2, Object obj3, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy90(Object obj, Object obj2, boolean z, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy90(Object obj, boolean z, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy90(List list, boolean z, String str, Function0 function0) {
        super(2);
        this.a = (byte) 5;
        this.c = list;
        this.b = z;
        this.e = str;
        this.d = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy90(byte b, int i, Object obj, Object obj2, Function0 function0, boolean z) {
        super(2);
        this.a = b;
        this.c = obj;
        this.e = obj2;
        this.b = z;
        this.d = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy90(qc0 qc0Var, boolean z, iu30 iu30Var, j2i j2iVar) {
        super(2);
        this.a = (byte) 2;
        this.c = qc0Var;
        this.b = z;
        this.d = iu30Var;
        this.e = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy90(qc0 qc0Var, boolean z, iu30 iu30Var, st60 st60Var) {
        super(2);
        this.a = (byte) 1;
        this.c = qc0Var;
        this.b = z;
        this.d = iu30Var;
        this.e = st60Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy90(c380 c380Var, vu30 vu30Var, vu30 vu30Var2, boolean z, int i) {
        super(2);
        this.a = (byte) 26;
        this.c = c380Var;
        this.e = vu30Var;
        this.d = vu30Var2;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy90(p2c0 p2c0Var, cqs0 cqs0Var, vu30 vu30Var, boolean z) {
        super(2);
        this.a = (byte) 7;
        this.c = p2c0Var;
        this.d = cqs0Var;
        this.e = vu30Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy90(pjh0 pjh0Var, boolean z, jsl jslVar, Function0 function0, int i) {
        super(2);
        this.a = (byte) 12;
        this.c = pjh0Var;
        this.b = z;
        this.e = jslVar;
        this.d = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy90(boolean z, yeu0 yeu0Var, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 19;
        this.b = z;
        this.c = yeu0Var;
        this.d = iu30Var;
        this.e = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy90(boolean z, u251 u251Var, String str, j2i j2iVar) {
        super(2);
        this.a = (byte) 6;
        this.b = z;
        this.c = u251Var;
        this.d = str;
        this.e = j2iVar;
    }
}
