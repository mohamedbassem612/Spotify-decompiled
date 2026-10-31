package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hov0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hov0(Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            tr00 tr00Var = (tr00) this.c;
            hh11 hh11Var = (hh11) this.b;
            otw.c(tr00Var, new sr00(hh11Var.e, hh11Var.g), (qim0) null, (ipb1) null, x340Var2, 6, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            otw.c((sve) this.c, new i1k1(((hh11) this.b).a), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            kjn0 kjn0Var = (kjn0) this.c;
            hh11 hh11Var = (hh11) this.b;
            otw.c(kjn0Var, new jjn0(1, hh11Var.a, hh11Var.b, false), (qim0) null, (ipb1) null, x340Var2, 6, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            otw.c((fx) this.c, new ex(1, ((hh11) this.b).g), (qim0) null, (ipb1) null, x340Var2, 6, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            otw.c((gw3) this.c, new ew3(((hh11) this.b).k), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            otw.c((br0) this.c, new cf8(((hh11) this.b).j), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        otw.c((maa) ((et90) this.c).e, new uho(((hk11) this.b).a, (String) null, qho.a, (nho) null, (String) null, (Function0) null, 250), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        otw.c((maa) this.c, new uho(((nk11) this.b).a, (String) null, qho.a, (nho) null, (String) null, (Function0) null, 250), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        iu30 iu30Var = (iu30) this.b;
        zl11 zl11Var = (zl11) this.c;
        pk1 pk1Var = new pk1(zl11Var.i ? qk1.b : qk1.a, false, zl11Var.b, (String) null, (j7p1) null, 26);
        x340 x340Var2 = x340Var;
        boolean zG = x340Var2.g(iu30Var);
        Object objT = x340Var2.T();
        if (zG || objT == fkj0.X) {
            objT = new fr01(iu30Var, (byte) 26);
            x340Var2.s0(objT);
        }
        h7p1.a(pk1Var, new gbx(z50.c, (Function0) objT), (qim0) null, (max) null, yla.r(x340Var2), x340Var2, 0, 12);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        int i;
        zsc zscVar;
        long j;
        qim0 qim0Var;
        b0k b0kVar;
        af5 af5VarA;
        long j2;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        f36 f36Var = h36.c;
        gex0 gex0Var = h36.a;
        qim0 qim0Var2 = nim0.a;
        n4k n4kVar = hmb0.t1;
        Throwable th = null;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                eov0 eov0Var = (eov0) obj5;
                z47.k(eov0Var.b, 0, (b0k) obj2, (iu30) obj4, eov0Var.c);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                gzv0 gzv0Var = (gzv0) obj5;
                iu30 iu30Var = (iu30) obj4;
                jw31 jw31VarA = ew31.a(gex0Var, een.Z, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                qim0 qim0VarB = uyn1.B(anm1.N("pre-save-button", qim0Var2), 0.0f, 0.0f, 0.0f, 0.0f, 14);
                gdx gdxVarS = yla.s(x340Var);
                boolean z = gzv0Var.h;
                pk1 pk1Var = new pk1(z ? qk1.b : qk1.a, false, (String) null, (String) null, (j7p1) null, 30);
                boolean z2 = gzv0Var.g;
                if (!z2) {
                    if (z2) {
                        eg.o();
                    } else {
                        i = z ? 2131960395 : 2131960394;
                    }
                    return null;
                }
                i = z ? 2131961411 : 2131961410;
                String strO0 = cwl1.o0(x340Var, i);
                boolean zG = x340Var3.g(iu30Var);
                Object objT = x340Var3.T();
                if (zG || objT == m4cVar) {
                    objT = new smt0(iu30Var, (byte) 22);
                    x340Var3.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                } else {
                    h7p1.a(pk1Var, new gbx(new y50(strO0), function0), qim0VarB, (max) null, gdxVarS, x340Var, 0, 8);
                    qim0 qim0VarN = anm1.N("share-button", qim0Var2);
                    gdx gdxVarS2 = yla.s(x340Var);
                    String strO1 = cwl1.o0(x340Var, 2131962246);
                    boolean zG2 = x340Var3.g(iu30Var);
                    Object objT2 = x340Var3.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new smt0(iu30Var, (byte) 23);
                        x340Var3.s0(objT2);
                    }
                    Function0 function1 = (Function0) objT2;
                    if (ihc1.y0(strO1)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    } else {
                        gbx gbxVar = new gbx(new y50(strO1), function1);
                        ldx ldxVar = ldx.c;
                        wro1.h(gbxVar, ldxVar, qim0VarN, (max) null, gdxVarS2, (vzq0) null, false, (idn0) null, (ga80) null, p9j.a, x340Var, 0, 6, 984);
                        qim0 qim0VarN2 = anm1.N("more-button", qim0Var2);
                        gdx gdxVarS3 = yla.s(x340Var);
                        String strO2 = cwl1.o0(x340Var, 2131958898);
                        boolean zG3 = x340Var3.g(iu30Var);
                        Object objT3 = x340Var3.T();
                        if (zG3 || objT3 == m4cVar) {
                            objT3 = new smt0(iu30Var, (byte) 24);
                            x340Var3.s0(objT3);
                        }
                        Function0 function2 = (Function0) objT3;
                        if (!ihc1.y0(strO2)) {
                            wro1.h(new gbx(new y50(strO2), function2), ldxVar, qim0VarN2, (max) null, gdxVarS3, (vzq0) null, false, (idn0) null, (ga80) null, p9j.b, x340Var, 0, 6, 984);
                            x340Var3.r(true);
                            return rih1Var;
                        }
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    }
                }
                return null;
            case 2:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                fra fraVar = een.N0;
                q4w0 q4w0Var = (q4w0) obj5;
                String str = q4w0Var.a;
                Context context = (Context) obj4;
                jw31 jw31VarA2 = ew31.a(h36.e, fraVar, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0Var2);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(jw31VarA2, x340Var4, y580.O0);
                nko1.H(xos0VarM2, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE2, x340Var4, y580.Y);
                cjc0 cjc0Var = new cjc0(1);
                int i2 = q4w0Var.b;
                int iC = l1d.C(i2);
                if (iC == 0) {
                    uwr uwrVar = cbx.a;
                    zscVar = zex.a;
                    j = ((vex) zscVar.b).a;
                } else if (iC == 1) {
                    uwr uwrVar2 = cbx.a;
                    zscVar = zex.a;
                    j = ((vex) zscVar.b).b;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    uwr uwrVar3 = cbx.a;
                    zscVar = zex.a;
                    j = ((vex) zscVar.b).a;
                }
                long j3 = j;
                uwr uwrVar4 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var4).k;
                cvx cvxVar = cbx.b(x340Var4).b;
                uwo1.e(str, anm1.N("presave-button-label-tag", uyn1.x(qim0Var2, 4.0f)), lee1Var, j3, new a0e1(5), (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var4, 0, 0, 1696);
                int iC2 = l1d.C(i2);
                if (iC2 == 0) {
                    x340Var6.i0(-21117697);
                    long j4 = ((vex) zscVar.b).a;
                    qim0 qim0VarN3 = anm1.N("presave-button-icon-tag", u291.s(qim0Var2, 15.0f, 15.0f));
                    cdf0 cdf0VarA = bqn1.A(context, 2131886212);
                    nl70.a(new yk4(mno1.y(cdf0VarA, cdf0VarA.getIntrinsicWidth(), cdf0VarA.getIntrinsicHeight(), Bitmap.Config.ARGB_8888)), str, qim0VarN3, j4, x340Var4, 0, 0);
                    x340Var6.r(false);
                } else if (iC2 == 1) {
                    x340Var6.i0(-20799978);
                    qim0 qim0VarN4 = anm1.N("presave-button-icon-tag", u291.s(qim0Var2, 15.0f, 15.0f));
                    cdf0 cdf0VarA2 = bqn1.A(context, 2131886216);
                    nl70.a(new yk4(mno1.y(cdf0VarA2, cdf0VarA2.getIntrinsicWidth(), cdf0VarA2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888)), str, qim0VarN4, 0L, x340Var4, 0, 8);
                    x340Var6.r(false);
                } else {
                    if (iC2 != 2) {
                        throw p3d1.k(x340Var6, -970514004, false);
                    }
                    x340Var6.i0(-20549219);
                    x340Var6.r(false);
                }
                x340Var6.r(true);
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                boolean zY = x340Var8.Y(iIntValue & 1, (iIntValue & 17) != 16);
                j06 j06Var = x340Var8.a;
                if (zY) {
                    phw0 phw0Var = (phw0) obj5;
                    Function0 function3 = (Function0) obj4;
                    jw31 jw31VarA3 = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var8, 54);
                    int iHashCode3 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM3 = x340Var8.m();
                    qim0 qim0VarE3 = zr7.E(x340Var8, qim0Var2);
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
                    nko1.H(jw31VarA3, x340Var8, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM3, x340Var8, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var8, lljVar3);
                    nko1.F(x340Var8);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE3, x340Var8, lljVar4);
                    gm50.l(phw0Var, x340Var8, 0);
                    wnb0 wnb0Var = new wnb0(1.0f, true);
                    mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var8, 6);
                    int iHashCode4 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM4 = x340Var8.m();
                    qim0 qim0VarE4 = zr7.E(x340Var8, wnb0Var);
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(mbhVarA, x340Var8, lljVar);
                    nko1.H(xos0VarM4, x340Var8, lljVar2);
                    x0d.q(iHashCode4, x340Var8, lljVar3, x340Var8);
                    nko1.H(qim0VarE4, x340Var8, lljVar4);
                    String str2 = phw0Var.a;
                    uwr uwrVar5 = cbx.a;
                    uwo1.e(str2, anm1.N("preview_element_title_test_tag", d9y0.k(qim0Var2, phw0Var.h ? 1.0f : 0.3f)), cbx.d(x340Var8).h, cbx.a(x340Var8).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var8, 1572864, 0, 1712);
                    gm50.m(phw0Var, x340Var8, 0);
                    x340Var8.r(true);
                    gm50.b(function3, phw0Var, (qim0) null, x340Var8, 0);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                String str3 = (String) obj;
                int iIntValue2 = ((Number) obj3).intValue();
                mtx0 mtx0Var = (mtx0) obj5;
                x6h1 x6h1VarC = mtx0Var.b.b.c();
                x6h1VarC.i.add(new a7h1("suggestion_group", str3, 0, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                Integer numValueOf2 = Integer.valueOf(iIntValue2);
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("suggestion_card", str3, numValueOf2, (String) null, (String) null));
                x6h1VarC2.j = false;
                mtx0Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((tux0) obj4).b.accept(new ctx0((String) obj2));
                return rih1Var;
            case 5:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                sbz0 sbz0Var = (sbz0) obj5;
                View view = (View) obj4;
                mbh mbhVarA2 = jbh.a(f36Var, een.Q0, b0kVar2, 0);
                x340 x340Var9 = (x340) b0kVar2;
                int iHashCode5 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM5 = x340Var9.m();
                qim0 qim0VarE5 = zr7.E(b0kVar2, qim0VarF2);
                hzj.A.getClass();
                x340 x340Var10 = (x340) b0kVar2;
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
                nko1.H(mbhVarA2, b0kVar2, y580.O0);
                nko1.H(xos0VarM5, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode5), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE5, b0kVar2, y580.Y);
                View view2 = (View) sbz0Var.c.d.getValue();
                if (view2 == null) {
                    x340Var10.i0(379663627);
                    x340Var10.r(false);
                    b0kVar = b0kVar2;
                    qim0Var = qim0Var3;
                } else {
                    x340Var10.i0(379663628);
                    boolean zI = x340Var10.i(view2);
                    Object objT4 = x340Var10.T();
                    if (zI || objT4 == m4cVar2) {
                        objT4 = new xy2(view2, (byte) 8);
                        x340Var10.s0(objT4);
                    }
                    uwr uwrVar6 = cbx.a;
                    cvx cvxVar2 = cbx.b(b0kVar2).b;
                    qim0 qim0VarB2 = uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    qim0Var = qim0Var3;
                    cvx cvxVar3 = cbx.b(b0kVar2).b;
                    b0kVar = b0kVar2;
                    dm5.a((iu30) objT4, eqr0.D(0.0f, 8.0f, 1, qim0VarB2), (iu30) null, b0kVar, 0, 4);
                    x340Var10.r(false);
                }
                boolean zI2 = x340Var10.i(view);
                Object objT5 = x340Var10.T();
                if (zI2 || objT5 == m4cVar2) {
                    objT5 = new xy2(view, (byte) 9);
                    x340Var10.s0(objT5);
                }
                dm5.a((iu30) objT5, u291.f(qim0Var, 1.0f), (iu30) null, b0kVar, 0, 4);
                x340Var10.r(true);
                return rih1Var;
            case 6:
                x340 x340Var11 = (b0k) obj2;
                ((Number) obj3).intValue();
                iu30 iu30Var2 = (iu30) obj4;
                Boolean bool = (Boolean) obj5;
                if (bool != null) {
                    x340 x340Var12 = x340Var11;
                    x340Var12.i0(1954216179);
                    boolean zG4 = x340Var12.g(iu30Var2) | x340Var12.g(bool);
                    Object objT6 = x340Var12.T();
                    if (zG4 || objT6 == fkj0.X) {
                        objT6 = new g1x0(iu30Var2, bool, (byte) 27);
                        x340Var12.s0(objT6);
                    }
                    wro1.h(new gbx(z50.c, (Function0) objT6), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-950937165, new ziz0(bool, (byte) 0), x340Var12), x340Var12, 0, 6, 1020);
                    x340Var12.r(false);
                } else {
                    x340 x340Var13 = x340Var11;
                    x340Var13.i0(1954625565);
                    x340Var13.r(false);
                }
                return rih1Var;
            case 7:
                b0k b0kVar3 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
                gjz0 gjz0Var = (gjz0) obj5;
                jlz0 jlz0Var = gjz0Var.f;
                j2i j2iVarR = apo.r(-1113822691, new juy0(gjz0Var, (iu30) obj4, (byte) 1), b0kVar3);
                int i3 = ((iIntValue3 << 3) & 112) | 24582;
                jlz0 jlz0Var2 = jlz0.i;
                lzj.c(null, (vzq0) obj, jlz0Var, qim0VarD, j2iVarR, b0kVar3, i3);
                return rih1Var;
            case 8:
                x340 x340Var14 = (b0k) obj2;
                ((Number) obj3).intValue();
                float fC = ((i2c) obj).c();
                qim0 qim0VarH = l6o1.H(u291.f(qim0Var2, 1.0f), l6o1.C(0, 0, 1, x340Var14), false, 14);
                mtz0 mtz0Var = (mtz0) obj5;
                ltz0 ltz0Var = (ltz0) obj4;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var15 = x340Var14;
                int iHashCode6 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM6 = x340Var15.m();
                qim0 qim0VarE6 = zr7.E(x340Var14, qim0VarH);
                hzj.A.getClass();
                x340 x340Var16 = x340Var14;
                if (x340Var16.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(gfh0VarC, x340Var14, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM6, x340Var14, lljVar6);
                Integer numValueOf3 = Integer.valueOf(iHashCode6);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf3, x340Var14, lljVar7);
                nko1.F(x340Var14);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE6, x340Var14, lljVar8);
                qim0 qim0VarJ = u291.j(fC, 0.0f, 2, u291.f(qim0Var2, 1.0f));
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                int iHashCode7 = Long.hashCode(x340Var16.T);
                xos0 xos0VarM7 = x340Var16.m();
                qim0 qim0VarE7 = zr7.E(x340Var14, qim0VarJ);
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                nko1.H(gfh0VarC2, x340Var14, lljVar5);
                nko1.H(xos0VarM7, x340Var14, lljVar6);
                i3a.l(iHashCode7, x340Var14, lljVar7, x340Var14);
                nko1.H(qim0VarE7, x340Var14, lljVar8);
                otw.c(mtz0Var, ltz0Var, (qim0) null, (ipb1) null, x340Var14, 8, 12);
                x340Var16.r(true);
                x340Var16.r(true);
                return rih1Var;
            case 9:
                ifh0 ifh0Var = (ifh0) obj;
                err0 err0Var = (hdn0) obj4;
                q5t0 q5t0VarH = ((afh0) obj2).H(((hjl) obj3).a);
                if (((Boolean) ((ven0) obj5).getValue()).booleanValue()) {
                    err0 err0Var2 = err0Var;
                    if (err0Var2.s() > 0) {
                        return ifh0Var.S(q5t0VarH.a, err0Var2.s(), b7xVar, new f2(q5t0VarH, (byte) 27));
                    }
                }
                err0Var.t(q5t0VarH.b);
                return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7xVar, new f2(q5t0VarH, (byte) 28));
            case 10:
                x340 x340Var17 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    mod.b(oi7.a.a((gw70) obj5), apo.r(1835659398, new ziz0((w501) obj4, (byte) 8), x340Var18), x340Var18, 56);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var19 = (b0k) obj2;
                ((Number) obj3).intValue();
                ma01 ma01Var = (ma01) obj5;
                String str4 = ma01Var.a;
                String str5 = ma01Var.c;
                String str6 = ma01Var.d;
                dbg1 dbg1Var = new dbg1(str4, str5, str6, ago1.u(ma01Var.f, ma01Var.g, str6, str4, ma01Var.e, false), ma01Var.f, ma01Var.g, false, 1, bbp1.q(ma01Var.i));
                qim0 qim0VarH2 = u291.h(u291.f(qim0Var2, 1.0f), 256.0f);
                pa01 pa01Var = (pa01) obj4;
                gfh0 gfh0VarC3 = t1c.c(een.d, false);
                x340 x340Var20 = x340Var19;
                int iHashCode8 = Long.hashCode(x340Var20.T);
                xos0 xos0VarM8 = x340Var20.m();
                qim0 qim0VarE8 = zr7.E(x340Var19, qim0VarH2);
                hzj.A.getClass();
                x340 x340Var21 = x340Var19;
                if (x340Var21.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var21.m0();
                if (x340Var21.S) {
                    x340Var21.l(n4kVar);
                } else {
                    x340Var21.v0();
                }
                nko1.H(gfh0VarC3, x340Var19, y580.O0);
                nko1.H(xos0VarM8, x340Var19, y580.N0);
                nko1.H(Integer.valueOf(iHashCode8), x340Var19, y580.R0);
                nko1.F(x340Var19);
                nko1.H(qim0VarE8, x340Var19, y580.Y);
                otw.c(q1o1.u(pa01Var.b, (qim0) null, (FrameLayout.LayoutParams) null, 7), dbg1Var, anm1.N("transcript", h2c.a.b(qim0Var2)), (ipb1) null, x340Var19, 0, 8);
                x340Var21.r(true);
                return rih1Var;
            case 12:
                ((Number) obj3).intValue();
                otw.c((dc8) obj5, new wb8((String) obj4), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
            case 13:
                x340 x340Var22 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ney0 ney0Var = (ney0) obj4;
                    kyo1.h((idd1) obj5, ney0Var.k, ney0Var.n, ney0Var.c, ney0Var.f, ney0Var.q, ney0Var.r, x340Var23, 0);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var24 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    kob1 kob1Var = (kob1) obj4;
                    kyo1.h((idd1) obj5, kob1Var.h, kob1Var.g, kob1Var.c, kob1Var.e, kob1Var.n, kob1Var.o, x340Var25, 0);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var26 = (b0k) obj2;
                ((Number) obj3).intValue();
                rx21 rx21Var = ((lx01) obj5).P0;
                if (rx21Var == null) {
                    x340 x340Var27 = x340Var26;
                    x340Var27.i0(-1574252898);
                    x340Var27.r(false);
                    af5VarA = null;
                } else {
                    x340 x340Var28 = x340Var26;
                    x340Var28.i0(-1574803005);
                    af5VarA = rx21Var.a(x340Var28);
                    x340Var28.r(false);
                }
                if (af5VarA == null) {
                    af5VarA = new af5("");
                    n57.e("AboutRecommendationDisclosureView must be initialized with Resources. Call setResources() before rendering.");
                }
                uwo1.f(af5VarA, (qim0) obj4, (lee1) null, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var26, 0, 0, 4092);
                return rih1Var;
            case 16:
                x340 x340Var29 = (b0k) obj2;
                ((Number) obj3).intValue();
                gy01 gy01Var = (gy01) obj5;
                String str7 = gy01Var.b;
                uwr uwrVar7 = cbx.a;
                lee1 lee1Var2 = cbx.d(x340Var29).g;
                urt0 urt0Var = gy01Var.k;
                if (u890.j(urt0Var, crt0.a)) {
                    x340 x340Var30 = x340Var29;
                    x340Var30.i0(-535615730);
                    j2 = cbx.a(x340Var30).b.a;
                    x340Var30.r(false);
                } else {
                    if (!u890.j(urt0Var, jrt0.a) && !u890.j(urt0Var, ort0.a)) {
                        throw p3d1.k(x340Var29, -535618033, false);
                    }
                    x340 x340Var31 = x340Var29;
                    x340Var31.i0(-535612746);
                    j2 = cbx.a(x340Var31).b.c;
                    x340Var31.r(false);
                }
                long j5 = j2;
                x340 x340Var32 = x340Var29;
                Object objT7 = x340Var32.T();
                if (objT7 == fkj0.X) {
                    objT7 = zx01.V0;
                    x340Var32.s0(objT7);
                }
                uwo1.e(str7, (qim0) obj4, lee1Var2, j5, (a0e1) null, (iu30) null, 2, false, new ajc0((iu30) objT7), 0, (qx8) null, x340Var32, 0, 0, 1712);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                boolean z3 = false;
                nw31 nw31Var = (nw31) obj;
                x340 x340Var33 = (b0k) obj2;
                ((Number) obj3).intValue();
                qlb qlbVar = (qlb) obj4;
                int i4 = 0;
                for (Object obj6 : o7h.d1(((sy01) obj5).e, 3)) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        Throwable th2 = th;
                        p7h.T();
                        throw th2;
                    }
                    String str8 = (String) obj6;
                    qim0 qim0VarA = nw31Var.a(1.0f, qim0Var2, true);
                    gfh0 gfh0VarC4 = t1c.c(een.d, z3);
                    x340 x340Var34 = x340Var33;
                    int iHashCode9 = Long.hashCode(x340Var34.T);
                    xos0 xos0VarM9 = x340Var34.m();
                    qim0 qim0VarE9 = zr7.E(x340Var33, qim0VarA);
                    hzj.A.getClass();
                    x340 x340Var35 = x340Var33;
                    Throwable th3 = th;
                    if (x340Var35.a == null) {
                        tgp1.p();
                        throw th3;
                    }
                    x340Var35.m0();
                    if (x340Var35.S) {
                        x340Var35.l(n4kVar);
                    } else {
                        x340Var35.v0();
                    }
                    nko1.H(gfh0VarC4, x340Var33, y580.O0);
                    nko1.H(xos0VarM9, x340Var33, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode9), x340Var33, y580.R0);
                    nko1.F(x340Var33);
                    nko1.H(qim0VarE9, x340Var33, y580.Y);
                    String str9 = str8 + "-" + i4;
                    boolean zE = x340Var35.e(i4);
                    Object objT8 = x340Var35.T();
                    if (zE || objT8 == fkj0.X) {
                        objT8 = new po60(i4, (byte) 29);
                        x340Var35.s0(objT8);
                    }
                    dgo1.c(str9, (iu30) objT8, apo.r(-2082895079, new kpw0(qlbVar, str8, (byte) 28), x340Var33), x340Var33, 384);
                    x340Var35.r(true);
                    i4 = i5;
                    th = th3;
                    z3 = false;
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                x340 x340Var36 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var37 = x340Var36;
                if (x340Var37.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    hh11 hh11Var = (hh11) obj4;
                    otw.c((ecd1) obj5, new vkg1(hh11Var.a, hh11Var.g), (qim0) null, (ipb1) null, x340Var37, 0, 12);
                } else {
                    x340Var37.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                x340 x340Var38 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                hh11 hh11Var2 = (hh11) obj4;
                x340 x340Var39 = x340Var38;
                if (x340Var39.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    otw.c((o921) obj5, new n921(hh11Var2.a, !hh11Var2.k.isEmpty(), hh11Var2.g, wxn0.b), (qim0) null, (ipb1) null, x340Var39, 6, 12);
                } else {
                    x340Var39.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return a(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return d(obj, obj2, obj3);
            case 22:
                return e(obj, obj2, obj3);
            case 23:
                return f(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return g(obj, obj2, obj3);
            case 25:
                return h(obj, obj2, obj3);
            case 26:
                return i(obj, obj2, obj3);
            case 27:
                return j(obj, obj2, obj3);
            case 28:
                return k(obj, obj2, obj3);
            default:
                x340 x340Var40 = (b0k) obj2;
                ((Number) obj3).intValue();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                fra fraVar2 = een.N0;
                an11 an11Var = (an11) obj5;
                j2i j2iVar = (j2i) obj4;
                jw31 jw31VarA4 = ew31.a(gex0Var, fraVar2, x340Var40, 0);
                x340 x340Var41 = x340Var40;
                int iHashCode10 = Long.hashCode(x340Var41.T);
                xos0 xos0VarM10 = x340Var41.m();
                qim0 qim0VarE10 = zr7.E(x340Var40, qim0VarF3);
                hzj.A.getClass();
                x340 x340Var42 = x340Var40;
                if (x340Var42.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var42.m0();
                if (x340Var42.S) {
                    x340Var42.l(n4kVar);
                } else {
                    x340Var42.v0();
                }
                llj lljVar9 = y580.O0;
                nko1.H(jw31VarA4, x340Var40, lljVar9);
                llj lljVar10 = y580.N0;
                nko1.H(xos0VarM10, x340Var40, lljVar10);
                Integer numValueOf4 = Integer.valueOf(iHashCode10);
                llj lljVar11 = y580.R0;
                nko1.H(numValueOf4, x340Var40, lljVar11);
                nko1.F(x340Var40);
                llj lljVar12 = y580.Y;
                nko1.H(qim0VarE10, x340Var40, lljVar12);
                Uri uri = Uri.parse(an11Var.d);
                uwr uwrVar8 = cbx.a;
                cbx.a.getClass();
                eso1.e(uri, isl.a, u291.v(u291.h(i1p1.q(nim0Var, er31.b(8.0f)), 80.0f), 80.0f), (p3v) null, (zvx) null, uwr.a(), mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var40, 48, 0, 3992);
                qim0 qim0VarF4 = u291.f(uyn1.B(nim0Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f);
                jw31 jw31VarA5 = ew31.a(gex0Var, fraVar2, x340Var40, 0);
                int iHashCode11 = Long.hashCode(x340Var42.T);
                xos0 xos0VarM11 = x340Var42.m();
                qim0 qim0VarE11 = zr7.E(x340Var40, qim0VarF4);
                x340Var42.m0();
                if (x340Var42.S) {
                    x340Var42.l(n4kVar);
                } else {
                    x340Var42.v0();
                }
                nko1.H(jw31VarA5, x340Var40, lljVar9);
                nko1.H(xos0VarM11, x340Var40, lljVar10);
                i3a.l(iHashCode11, x340Var40, lljVar11, x340Var40);
                nko1.H(qim0VarE11, x340Var40, lljVar12);
                wnb0 wnb0Var2 = new wnb0(1.0f, true);
                mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var40, 0);
                int iHashCode12 = Long.hashCode(x340Var42.T);
                xos0 xos0VarM12 = x340Var42.m();
                qim0 qim0VarE12 = zr7.E(x340Var40, wnb0Var2);
                x340Var42.m0();
                if (x340Var42.S) {
                    x340Var42.l(n4kVar);
                } else {
                    x340Var42.v0();
                }
                nko1.H(mbhVarA3, x340Var40, lljVar9);
                nko1.H(xos0VarM12, x340Var40, lljVar10);
                i3a.l(iHashCode12, x340Var40, lljVar11, x340Var40);
                nko1.H(qim0VarE12, x340Var40, lljVar12);
                uwo1.e(an11Var.b, u291.h(nim0Var, 22.0f), cbx.d(x340Var40).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var40, 0, 0, 2040);
                uwo1.e(xcg1.i(cwl1.o0(x340Var40, 2131962771), " ", an11Var.c), (qim0) null, cbx.d(x340Var40).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var40, 0, 0, 2042);
                x340Var42.r(true);
                j2iVar.invoke(x340Var40, 0);
                x340Var42.r(true);
                x340Var42.r(true);
                return rih1Var;
        }
    }
}
