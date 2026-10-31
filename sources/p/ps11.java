package p;

import android.os.Bundle;
import androidx.compose.ui.geometry.Offset;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ps11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps11(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Not found block with instruction: 0x0649: MOVE (r10v0 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] (LINE:1610) */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        goj0 goj0VarA;
        d7u0 d7u0Var;
        bv11 bv11Var;
        xeq0 xeq0Var;
        p5h p5hVar;
        long jG;
        long j;
        o8n o8nVar;
        boolean z;
        boolean zB;
        oe21 oe21VarA;
        int i;
        byte b = this.a;
        byte b2 = 25;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ioj0 ioj0Var = (ioj0) obj2;
                ((cjx0) obj3).getClass();
                String str = ((apc) obj).a;
                if ((244 & 16) != 0) {
                    mqo1.u();
                }
                hoj0 hoj0VarC = ioj0Var.c(d7u0.class, str);
                if (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (d7u0Var = (d7u0) goj0VarA.a) == null) {
                    return null;
                }
                return u7n0.u(d7u0Var);
            case 1:
                uv11 uv11Var = (uv11) obj;
                k910 k910Var = (k910) obj2;
                t6g1 t6g1VarA = k910Var.a;
                ys11 ys11Var = (ys11) obj3;
                cv11 cv11Var = ys11Var.Y0;
                if (cv11Var != null) {
                    t6g1VarA = cv11Var.a(uv11Var, t6g1VarA);
                }
                q6g1 q6g1Var = t6g1VarA instanceof q6g1 ? (q6g1) t6g1VarA : null;
                return (unb1) ys11Var.k1.invoke(uv11Var, k910.a(k910Var, t6g1VarA, (dt11) null, ys11Var.g1 != null ? fj30.I(k910Var.c, (q6g1Var == null || (bv11Var = q6g1Var.b) == null) ? null : bv11Var.d) : null, (n6u) null, false, (rrt0) null, false, false, false, (Double) null, (me2) null, 8186));
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                uh uhVar = (uh) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zI = x340Var2.i(uhVar);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new ak01(uhVar, b2);
                        x340Var2.s0(objT);
                    }
                    dm5.a((iu30) objT, (qim0) null, (iu30) null, x340Var2, 0, 6);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                List list = (List) obj;
                return Boolean.valueOf((((eb8) obj3).c.isEmpty() || list == null || !(list.isEmpty() ^ true) || u890.j((Boolean) obj2, Boolean.FALSE)) ? false : true);
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int iOrdinal = ((q1v) obj3).ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        x340Var4.i0(-1388753216);
                        y1a1.d(x340Var4, 0);
                        x340Var4.r(false);
                    } else if (iOrdinal == 2 || iOrdinal == 3) {
                        x340Var4.i0(-1388758709);
                        y1a1.c((qim0) null, x340Var4, 0);
                        x340Var4.r(false);
                    } else {
                        if (iOrdinal != 4) {
                            throw p3d1.k(x340Var4, -1388761638, false);
                        }
                        x340Var4.i0(-1388756342);
                        y1a1.b((qim0) null, x340Var4, 0);
                        x340Var4.r(false);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                u4p1.K((rrt0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z4p1.n((hce1) obj3, (qim0) null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                ((a221) obj3).g((b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                Bundle bundle = (Bundle) obj2;
                return (bundle == null || (xeq0Var = (xeq0) jhc1.t(bundle, "onboarding_model", xeq0.class)) == null) ? new xeq0(((m221) obj3).e, (ept) null, (c9) null, 126) : xeq0Var;
            case 9:
                Bundle bundle2 = (Bundle) obj2;
                if (bundle2 == null) {
                    return new k221(((q221) obj3).a.a, false, fg91.b, 5, (m0u) null, false, false, false, x131.a);
                }
                Object objT2 = jhc1.t(bundle2, "remote_downloads_model", k221.class);
                objT2.getClass();
                return (k221) objT2;
            case 10:
                String str2 = ((yb21) obj3).b.a;
                cww0 cww0Var = ((jbg0) obj).c;
                return new vb21(cww0Var.c, str2, cww0Var.a, cww0Var.b, false);
            case 11:
                long j2 = ((Offset) obj2).a;
                ((hav0) obj).a();
                pe21 pe21Var = ((de21) obj3).a;
                xgn0 xgn0Var = pe21Var.l;
                st41 st41Var = pe21Var.h;
                tz01 tz01Var = pe21Var.a;
                hrr0 hrr0Var = pe21Var.o;
                hrr0Var.setValue(new Offset(Offset.g(((Offset) hrr0Var.getValue()).a, j2)));
                oe21 oe21VarB = pe21Var.b();
                if (oe21VarB != null) {
                    long jH = pe21Var.h(pe21Var.c());
                    pe21Var.i(jH);
                    long jA = oe21VarB.a();
                    long jG2 = Offset.g((((long) Float.floatToRawIntBits((int) (jA >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jA & 4294967295L))) & 4294967295L), jH);
                    long jW = yto1.w(jG2, o0c.R(oe21VarB.b()));
                    xaz0 xaz0VarD = tz01Var.d();
                    l5 l5Var = pe21Var.g;
                    ptb0 ptb0Var = (ptb0) xaz0VarD.b;
                    qqq0 qqq0Var = ptb0Var.q;
                    boolean z2 = ptb0Var.p;
                    int iOrdinal2 = qqq0Var.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == 1) {
                            p5hVar = new p5h(l5Var.a, l5Var.b);
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    p5hVar = new p5h(l5Var.c, l5Var.d);
                    if (!z2) {
                        if (z2) {
                            eg.o();
                        }
                        return null;
                    }
                    p5hVar = new p5h(p5hVar.b, p5hVar.a);
                    oq41 oq41VarE = xaz0VarD.e(p5hVar);
                    float f = oq41VarE.a;
                    float f2 = oq41VarE.b;
                    boolean z3 = ((ptb0) tz01Var.d().b).p || (pe21Var.j == flb0.b && pe21Var.d() == qqq0.b);
                    if (!z3) {
                        if (z3) {
                            eg.o();
                        } else {
                            jG = Offset.g(jG2, pe21Var.s);
                        }
                        return null;
                    }
                    jG = Offset.f(jW, pe21Var.s);
                    qqq0 qqq0VarD = pe21Var.d();
                    int i2 = -((ptb0) tz01Var.d().b).m;
                    int iOrdinal3 = qqq0VarD.ordinal();
                    if (iOrdinal3 == 0) {
                        j = ((long) i2) & 4294967295L;
                    } else {
                        if (iOrdinal3 != 1) {
                            eg.o();
                            return null;
                        }
                        j = ((long) i2) << 32;
                    }
                    long jG3 = Offset.g(jG, (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
                    float fR = yto1.r(jG3, pe21Var.d()) - f;
                    if (fR < 0.0f) {
                        fR = 0.0f;
                    }
                    float fR2 = f2 - yto1.r(jG3, pe21Var.d());
                    if (fR2 < 0.0f) {
                        fR2 = 0.0f;
                    }
                    float f3 = pe21Var.f;
                    if (fR < f3) {
                        zB = st41Var.b(nt41.a, (1.0f - yoi1.o((fR + f3) / (f3 * 2.0f), 0.0f, 1.0f)) * 10.0f, new he21(pe21Var, (byte) 2), new le21(pe21Var, null, (byte) 0));
                        o8nVar = null;
                        z = true;
                    } else {
                        o8nVar = null;
                        if (fR2 < f3) {
                            z = true;
                            zB = st41Var.b(nt41.b, (1.0f - yoi1.o((fR2 + f3) / (f3 * 2.0f), 0.0f, 1.0f)) * 10.0f, new he21(pe21Var, (byte) 3), new le21(pe21Var, null, (byte) 1));
                        } else {
                            z = true;
                            fn31.T(st41Var.b, (o8n) null, 0, new qt41(st41Var, (lnm) null, (byte) 1), 3);
                            zB = false;
                        }
                    }
                    if (xgn0Var.g()) {
                        xab1 xab1Var = st41Var.d;
                        if ((xab1Var == null || xab1Var.isActive() != z) && !zB && (oe21VarA = pe21.a(pe21Var, anm1.e(jG2, jW), tz01Var.d().f(), (nt41) null, new zw11((Object) oe21VarB, (byte) 6), 4)) != null) {
                            fn31.T(pe21Var.b, o8nVar, 0, new je21(pe21Var, oe21VarB, oe21VarA, o8nVar, (byte) 1), 3);
                        }
                        xgn0Var.c(o8nVar);
                    }
                }
                return rih1Var;
            case 12:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ((yla) obj3).h((qim0) null, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarP = x0d.p(lhc.g(x340Var10).g, 32, qim0VarF);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarB = uyn1.B(qim0VarP, 0.0f, 0.0f, 0.0f, cbx.b(x340Var10).b.a, 7);
                    kk21 kk21Var = (kk21) obj3;
                    mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var10, 0);
                    int iHashCode = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM = x340Var10.m();
                    qim0 qim0VarE = zr7.E(x340Var10, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(hmb0.t1);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(mbhVarA, x340Var10, y580.O0);
                    nko1.H(xos0VarM, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE, x340Var10, y580.Y);
                    uwo1.e(cwl1.o0(x340Var10, 2131961264), uyn1.x(new tq60(een.Q0), 16.0f), cbx.d(x340Var10).h, cbx.a(x340Var10).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, 0, 0, 2016);
                    op71.g(x340Var10, dug.f(u291.h(u291.f(nim0Var, 1.0f), 0.5f), u7h.b(cbx.a(x340Var10).d.a, 0.3f, 0.0f, 0.0f, 0.0f, 14), d4o1.a));
                    String strO0 = cwl1.o0(x340Var10, 2131961262);
                    lee1 lee1Var = cbx.d(x340Var10).g;
                    long j3 = cbx.a(x340Var10).b.a;
                    qim0 qim0VarX = uyn1.x(nim0Var, 16.0f);
                    boolean zI2 = x340Var10.i(kk21Var);
                    Object objT3 = x340Var10.T();
                    if (zI2 || objT3 == m4cVar) {
                        objT3 = new jk21(kk21Var, (byte) 0);
                        x340Var10.s0(objT3);
                    }
                    uwo1.e(strO0, bin.x(qim0VarX, false, (String) null, (pm31) null, (idn0) null, (Function0) objT3, 15), lee1Var, j3, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, 0, 0, 2016);
                    String strO1 = cwl1.o0(x340Var10, 2131961261);
                    lee1 lee1Var2 = cbx.d(x340Var10).g;
                    long j4 = cbx.a(x340Var10).b.a;
                    qim0 qim0VarX2 = uyn1.x(nim0Var, 16.0f);
                    boolean zI3 = x340Var10.i(kk21Var);
                    Object objT4 = x340Var10.T();
                    if (zI3 || objT4 == m4cVar) {
                        objT4 = new jk21(kk21Var, (byte) 1);
                        x340Var10.s0(objT4);
                    }
                    uwo1.e(strO1, bin.x(qim0VarX2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT4, 15), lee1Var2, j4, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, 0, 0, 2016);
                    String strO2 = cwl1.o0(x340Var10, 2131961263);
                    lee1 lee1Var3 = cbx.d(x340Var10).g;
                    long j5 = cbx.a(x340Var10).b.a;
                    qim0 qim0VarX3 = uyn1.x(nim0Var, 16.0f);
                    boolean zI4 = x340Var10.i(kk21Var);
                    Object objT5 = x340Var10.T();
                    if (zI4 || objT5 == m4cVar) {
                        objT5 = new jk21(kk21Var, (byte) 2);
                        x340Var10.s0(objT5);
                    }
                    uwo1.e(strO2, bin.x(qim0VarX3, false, (String) null, (pm31) null, (idn0) null, (Function0) objT5, 15), lee1Var3, j5, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, 0, 0, 2016);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                nk21 nk21Var = (nk21) obj3;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    los losVar = nk21Var.d;
                    boolean zI5 = x340Var12.i(nk21Var);
                    Object objT6 = x340Var12.T();
                    if (zI5 || objT6 == m4cVar2) {
                        objT6 = new mk21(nk21Var, (byte) 1);
                        x340Var12.s0(objT6);
                    }
                    qxd0.i(losVar, (iu30) objT6, x340Var12);
                    boolean zI6 = x340Var12.i(nk21Var);
                    Object objT7 = x340Var12.T();
                    if (zI6 || objT7 == m4cVar2) {
                        objT7 = new mk21(nk21Var, (byte) 2);
                        x340Var12.s0(objT7);
                    }
                    p9p1.p((iu30) objT7, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    int iOrdinal4 = ((hkf0) obj3).ordinal();
                    if (iOrdinal4 == 0) {
                        i = 2131957829;
                    } else if (iOrdinal4 == 1) {
                        i = 2131957831;
                    } else if (iOrdinal4 == 2) {
                        i = 2131957832;
                    } else {
                        if (iOrdinal4 != 3) {
                            eg.o();
                            return null;
                        }
                        i = 2131957830;
                    }
                    String strO3 = cwl1.o0(x340Var14, i);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(strO3, (qim0) null, cbx.d(x340Var14).g, cbx.a(x340Var14).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2034);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                vl21 vl21Var = (vl21) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    yl21 yl21Var = vl21Var.b;
                    g341 g341Var = vl21Var.d;
                    boolean zI7 = x340Var16.i(vl21Var);
                    Object objT8 = x340Var16.T();
                    if (zI7 || objT8 == fkj0.X) {
                        objT8 = new g521(vl21Var, (byte) 7);
                        x340Var16.s0(objT8);
                    }
                    wl21.a(yl21Var, g341Var, (Function0) objT8, (qim0) null, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                or21 or21Var = (or21) obj3;
                uu00 uu00Var = or21Var.g;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    Object objT9 = x340Var18.T();
                    m4c m4cVar3 = fkj0.X;
                    if (objT9 == m4cVar3) {
                        objT9 = v8r.q(Boolean.FALSE);
                        x340Var18.s0(objT9);
                    }
                    ven0 ven0Var = (ven0) objT9;
                    boolean zI8 = x340Var18.i(ven0Var) | x340Var18.i(or21Var);
                    Object objT10 = x340Var18.T();
                    if (zI8 || objT10 == m4cVar3) {
                        objT10 = new nt01(or21Var, ven0Var, (byte) 25);
                        x340Var18.s0(objT10);
                    }
                    iu30 iu30Var = (iu30) objT10;
                    String str3 = or21Var.b.a;
                    boolean zG = x340Var18.g(uu00Var) | x340Var18.g(str3);
                    Object objT11 = x340Var18.T();
                    if (zG || objT11 == m4cVar3) {
                        o3r o3rVar = hr21.a;
                        objT11 = hr21.b(str3, uu00Var);
                        x340Var18.s0(objT11);
                    }
                    mr20 mr20Var = (mr20) objT11;
                    boolean z4 = or21Var.h.b;
                    boolean zG2 = x340Var18.g(iu30Var);
                    Object objT12 = x340Var18.T();
                    if (zG2 || objT12 == m4cVar3) {
                        objT12 = new dv11(iu30Var, (byte) 22);
                        x340Var18.s0(objT12);
                    }
                    ucp1.f(mr20Var, z4, (Function0) objT12, apo.r(-2007759702, new hl11(or21Var, iu30Var, ven0Var, (byte) 11), x340Var18), x340Var18, 3072);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    w0h1.a(!((ziu) obj3).a ? zox.c : inx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var20, 56, 60);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return n531.a(((a631) obj).a, (q431) null, ((r531) obj3).b.d, 63);
            case 20:
                ((Number) obj2).intValue();
                tx9.d((q431) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ja31 ja31Var = (ja31) obj3;
                    boolean z5 = ja31Var.g;
                    aux auxVar = z5 ? aux.c : ztx.c;
                    ksl kslVarD = z5 ? gqg0.d(ja31Var.i) : gqg0.d(ja31Var.h);
                    uwr uwrVar3 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var22).g;
                    w0h1.a(auxVar, kslVarD, u291.r(nim0Var, 24.0f), cbx.a(x340Var22).b.a, 0L, false, x340Var22, 8, 48);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 22:
                return (wpw) ((hpc) obj3).invoke();
            case 23:
                tk31 tk31Var = (tk31) obj;
                String str4 = tk31Var.a;
                vnr0 vnr0Var = tk31Var.b;
                boolean z6 = !((bl31) obj3).c;
                String str5 = tk31Var.d;
                qk31 qk31Var = tk31Var.g;
                return new zk31(str4, vnr0Var, (yk31) obj2, z6, str5, qk31Var.a, qk31Var.b);
            case 24:
                gl31 gl31Var = (gl31) obj;
                vnr0 vnr0Var2 = gl31Var.b;
                boolean z7 = gl31Var.c;
                vnr0 vnr0Var3 = gl31Var.d;
                int i3 = gl31Var.e;
                float f4 = gl31Var.g;
                boolean z8 = !((ol31) obj3).c;
                el31 el31Var = gl31Var.i;
                return new ml31(vnr0Var2, z7, vnr0Var3, i3, (ll31) obj2, f4, z8, el31Var.a, el31Var.b);
            case 25:
                ((Number) obj2).intValue();
                tm80.o((uzd1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                tm80.r((xqc1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                tm80.s((brc1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    bpx bpxVar = bpx.c;
                    uwr uwrVar4 = cbx.a;
                    w0h1.a(bpxVar, new jsl(cwl1.n0(2131955216, new Object[]{((ftv) obj3).d}, x340Var24)), (qim0) null, cbx.a(x340Var24).b.b, 0L, false, x340Var24, bpx.d, 52);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            default:
                return ((n0o) obj3).g((p541) obj, (k1r) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps11(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
