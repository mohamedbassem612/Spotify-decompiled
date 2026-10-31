package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u491 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u491(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x020f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0211  */
    /* JADX WARN: Code duplicated, block: B:63:0x023f  */
    /* JADX WARN: Code duplicated, block: B:64:0x024c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0274  */
    /* JADX WARN: Code duplicated, block: B:68:0x027f  */
    /* JADX WARN: Code duplicated, block: B:71:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:73:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:75:0x030c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x030e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0336  */
    /* JADX WARN: Code duplicated, block: B:80:0x0346 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0348  */
    /* JADX WARN: Code duplicated, block: B:85:0x0373  */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        Float f;
        Float fValueOf;
        nmw0 nmw0Var;
        boolean z2;
        rih1 rih1Var;
        boolean zG;
        Object objT;
        boolean z3;
        boolean zG2;
        Object objT2;
        hua1 hua1Var = (hua1) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        float f2 = hua1Var.g;
        Float f3 = hua1Var.e;
        boolean z4 = hua1Var.h;
        String str = hua1Var.d;
        tva1 tva1Var = (tva1) this.b;
        hrq hrqVar = (hrq) tva1Var.t;
        lrq lrqVar = (lrq) tva1Var.N0;
        mrq mrqVar = (mrq) tva1Var.O0;
        krq krqVar = (krq) tva1Var.Z;
        jrq jrqVar = (jrq) tva1Var.Y;
        irq irqVar = (irq) tva1Var.X;
        x340 x340Var = (b0k) obj4;
        boolean zG3 = x340Var.g(hrqVar);
        Object objT3 = x340Var.T();
        if (zG3 || objT3 == m4cVar) {
            et61 et61Var = new et61(iu30Var, (byte) 21);
            hrqVar.getClass();
            ita1 ita1Var = new ita1(et61Var);
            x340Var.s0(ita1Var);
            objT3 = ita1Var;
        }
        ita1 ita1Var2 = (ita1) objT3;
        boolean zG4 = x340Var.g(irqVar);
        Object objT4 = x340Var.T();
        if (zG4 || objT4 == m4cVar) {
            et61 et61Var2 = new et61(iu30Var, (byte) 24);
            irqVar.getClass();
            objT4 = new ewa1(et61Var2);
            x340Var.s0(objT4);
        }
        ewa1 ewa1Var = (ewa1) objT4;
        boolean zG5 = x340Var.g(jrqVar);
        Object objT5 = x340Var.T();
        if (zG5 || objT5 == m4cVar) {
            et61 et61Var3 = new et61(iu30Var, (byte) 22);
            jrqVar.getClass();
            objT5 = new lva1(et61Var3);
            x340Var.s0(objT5);
        }
        lva1 lva1Var = (lva1) objT5;
        boolean zG6 = x340Var.g(krqVar);
        Object objT6 = x340Var.T();
        if (zG6 || objT6 == m4cVar) {
            objT6 = new bdd1((d0r) ((jly0) ((wdm) krqVar.a.c).e).get(), new et61(iu30Var, (byte) 25));
            x340Var.s0(objT6);
        }
        bdd1 bdd1Var = (bdd1) objT6;
        if (str != null) {
            x340Var.i0(-525348160);
            boolean zG7 = x340Var.g(str);
            Object objT7 = x340Var.T();
            if (zG7 || objT7 == m4cVar) {
                objT7 = d3p1.H(tva1Var.b, (o3r) tva1Var.c, str);
                x340Var.s0(objT7);
            }
            ven0 ven0VarH = rwq.h((zob1) objT7, x340Var, 0);
            Float f4 = (Float) ven0VarH.getValue();
            boolean zI = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var.i(ven0VarH);
            Object objT8 = x340Var.T();
            if (zI || objT8 == m4cVar) {
                objT8 = new h43(iu30Var, ven0VarH, (lnm) null, (byte) 3);
                x340Var.s0(objT8);
            }
            qxd0.t(f4, x340Var, (vu30) objT8);
            x340Var.r(false);
        } else {
            x340Var.i0(-525142506);
            x340Var.r(false);
        }
        los losVar = (los) tva1Var.g;
        esa1 esa1Var = (esa1) tva1Var.f;
        boolean zI2 = x340Var.i(tva1Var);
        Object objT9 = x340Var.T();
        if (zI2 || objT9 == m4cVar) {
            objT9 = new sva1(tva1Var, (byte) 1);
            x340Var.s0(objT9);
        }
        qxd0.h(losVar, esa1Var, (iu30) objT9, x340Var);
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        WeakHashMap weakHashMap = osl1.x;
        qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF);
        uwr uwrVar = cbx.a;
        qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).e.c, 0.0f, 2, qim0VarP);
        mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
        hzj.A.getClass();
        if (x340Var.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var.m0();
        if (x340Var.S) {
            x340Var.l(hmb0.t1);
        } else {
            x340Var.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        Float f5 = hua1Var.f;
        float fFloatValue = f5 != null ? f5.floatValue() : 1.0f;
        if (f3 != null) {
            float fFloatValue2 = f3.floatValue();
            if (jch0.U(fFloatValue2 * f2) != jch0.U(fFloatValue2 * fFloatValue)) {
                z = z4 ? false : true;
            }
            otw.c(ita1Var2, new hta1(z4, z), (qim0) null, (ipb1) null, x340Var, 0, 12);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            String str2 = hua1Var.d;
            float f6 = hua1Var.g;
            f = hua1Var.e;
            if (f != null) {
                fValueOf = Float.valueOf(f.floatValue() * f2);
            } else {
                fValueOf = null;
            }
            otw.c(ewa1Var, new dwa1(str2, f6, f, fValueOf, ((oqa1) tva1Var.h).g), (qim0) null, (ipb1) null, x340Var, 0, 12);
            nmw0Var = hua1Var.o;
            if (nmw0Var == null) {
                x340Var.i0(-556340750);
                x340Var.r(false);
            } else {
                x340Var.i0(-556340749);
                op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
                otw.c(bdd1Var, new xcd1(nmw0Var.b, nmw0Var.c, f3), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            }
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            otw.c(lva1Var, new kva1(str, !(hua1Var.n instanceof exa1), hua1Var.b()), (qim0) null, (ipb1) null, x340Var, 0, 12);
            cvx cvxVar = cbx.b(x340Var).b;
            x0d.s(nim0Var, 16.0f, x340Var, true);
            z2 = hua1Var.k;
            rih1Var = rih1.a;
            if (!z2) {
                x340Var.i0(-521724074);
                x340Var.r(false);
                return rih1Var;
            }
            x340Var.i0(-522786940);
            if (hua1Var.l) {
                x340Var.i0(-522758606);
                zG2 = x340Var.g(mrqVar);
                objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    et61 et61Var4 = new et61(iu30Var, (byte) 23);
                    mrqVar.getClass();
                    objT2 = new wva1(et61Var4);
                    x340Var.s0(objT2);
                }
                otw.c((wva1) objT2, rih1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
                z3 = false;
                x340Var.r(false);
            } else {
                x340Var.i0(-522240317);
                zG = x340Var.g(lrqVar);
                objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    et61 et61Var5 = new et61(iu30Var, (byte) 20);
                    lrqVar.getClass();
                    objT = new qqa1(et61Var5);
                    x340Var.s0(objT);
                }
                otw.c((qqa1) objT, rih1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
                z3 = false;
                x340Var.r(false);
            }
            x340Var.r(z3);
            return rih1Var;
        }
        if (Math.abs(f2 - fFloatValue) >= 5.0E-4f) {
            if (z4) {
            }
        }
        otw.c(ita1Var2, new hta1(z4, z), (qim0) null, (ipb1) null, x340Var, 0, 12);
        op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
        String str3 = hua1Var.d;
        float f7 = hua1Var.g;
        f = hua1Var.e;
        if (f != null) {
            fValueOf = Float.valueOf(f.floatValue() * f2);
        } else {
            fValueOf = null;
        }
        otw.c(ewa1Var, new dwa1(str3, f7, f, fValueOf, ((oqa1) tva1Var.h).g), (qim0) null, (ipb1) null, x340Var, 0, 12);
        nmw0Var = hua1Var.o;
        if (nmw0Var == null) {
            x340Var.i0(-556340750);
            x340Var.r(false);
        } else {
            x340Var.i0(-556340749);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            otw.c(bdd1Var, new xcd1(nmw0Var.b, nmw0Var.c, f3), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(false);
        }
        op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
        otw.c(lva1Var, new kva1(str, !(hua1Var.n instanceof exa1), hua1Var.b()), (qim0) null, (ipb1) null, x340Var, 0, 12);
        cvx cvxVar2 = cbx.b(x340Var).b;
        x0d.s(nim0Var, 16.0f, x340Var, true);
        z2 = hua1Var.k;
        rih1Var = rih1.a;
        if (!z2) {
            x340Var.i0(-521724074);
            x340Var.r(false);
            return rih1Var;
        }
        x340Var.i0(-522786940);
        if (hua1Var.l) {
            x340Var.i0(-522758606);
            zG2 = x340Var.g(mrqVar);
            objT2 = x340Var.T();
            if (zG2) {
                et61 et61Var6 = new et61(iu30Var, (byte) 23);
                mrqVar.getClass();
                objT2 = new wva1(et61Var6);
                x340Var.s0(objT2);
            } else {
                et61 et61Var7 = new et61(iu30Var, (byte) 23);
                mrqVar.getClass();
                objT2 = new wva1(et61Var7);
                x340Var.s0(objT2);
            }
            otw.c((wva1) objT2, rih1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
            z3 = false;
            x340Var.r(false);
        } else {
            x340Var.i0(-522240317);
            zG = x340Var.g(lrqVar);
            objT = x340Var.T();
            if (zG) {
                et61 et61Var8 = new et61(iu30Var, (byte) 20);
                lrqVar.getClass();
                objT = new qqa1(et61Var8);
                x340Var.s0(objT);
            } else {
                et61 et61Var9 = new et61(iu30Var, (byte) 20);
                lrqVar.getClass();
                objT = new qqa1(et61Var9);
                x340Var.s0(objT);
            }
            otw.c((qqa1) objT, rih1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
            z3 = false;
            x340Var.r(false);
        }
        x340Var.r(z3);
        return rih1Var;
        otw.c(ita1Var2, new hta1(z4, z), (qim0) null, (ipb1) null, x340Var, 0, 12);
        op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
        String str4 = hua1Var.d;
        float f8 = hua1Var.g;
        f = hua1Var.e;
        if (f != null) {
            fValueOf = Float.valueOf(f.floatValue() * f2);
        } else {
            fValueOf = null;
        }
        otw.c(ewa1Var, new dwa1(str4, f8, f, fValueOf, ((oqa1) tva1Var.h).g), (qim0) null, (ipb1) null, x340Var, 0, 12);
        nmw0Var = hua1Var.o;
        if (nmw0Var == null) {
            x340Var.i0(-556340750);
            x340Var.r(false);
        } else {
            x340Var.i0(-556340749);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            otw.c(bdd1Var, new xcd1(nmw0Var.b, nmw0Var.c, f3), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(false);
        }
        op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
        otw.c(lva1Var, new kva1(str, !(hua1Var.n instanceof exa1), hua1Var.b()), (qim0) null, (ipb1) null, x340Var, 0, 12);
        cvx cvxVar3 = cbx.b(x340Var).b;
        x0d.s(nim0Var, 16.0f, x340Var, true);
        z2 = hua1Var.k;
        rih1Var = rih1.a;
        if (!z2) {
            x340Var.i0(-521724074);
            x340Var.r(false);
            return rih1Var;
        }
        x340Var.i0(-522786940);
        if (hua1Var.l) {
            x340Var.i0(-522758606);
            zG2 = x340Var.g(mrqVar);
            objT2 = x340Var.T();
            if (zG2) {
                et61 et61Var10 = new et61(iu30Var, (byte) 23);
                mrqVar.getClass();
                objT2 = new wva1(et61Var10);
                x340Var.s0(objT2);
            } else {
                et61 et61Var11 = new et61(iu30Var, (byte) 23);
                mrqVar.getClass();
                objT2 = new wva1(et61Var11);
                x340Var.s0(objT2);
            }
            otw.c((wva1) objT2, rih1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
            z3 = false;
            x340Var.r(false);
        } else {
            x340Var.i0(-522240317);
            zG = x340Var.g(lrqVar);
            objT = x340Var.T();
            if (zG) {
                et61 et61Var12 = new et61(iu30Var, (byte) 20);
                lrqVar.getClass();
                objT = new qqa1(et61Var12);
                x340Var.s0(objT);
            } else {
                et61 et61Var13 = new et61(iu30Var, (byte) 20);
                lrqVar.getClass();
                objT = new qqa1(et61Var13);
                x340Var.s0(objT);
            }
            otw.c((qqa1) objT, rih1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
            z3 = false;
            x340Var.r(false);
        }
        x340Var.r(z3);
        return rih1Var;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        odb1 odb1Var = (odb1) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        fra fraVar = een.N0;
        ve51 ve51Var = (ve51) this.b;
        jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, nim0.a);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(jw31VarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        uq8 uq8Var = (uq8) ve51Var.f;
        boolean z = odb1Var.a;
        int i = odb1Var.b ? 2 : 1;
        c380 c380Var = odb1Var.d;
        e2v e2vVar = odb1Var.c;
        fbp1 wwp0Var = swp0.c;
        if (e2vVar != null) {
            if (e2vVar instanceof d2v) {
                wwp0Var = mwp0.c;
            } else if (e2vVar instanceof c2v) {
                wwp0Var = iwp0.c;
            } else if (!(e2vVar instanceof f2v)) {
                if (e2vVar instanceof e2v) {
                    wwp0Var = new kwp0((int) (e2vVar.a * 100.0f));
                } else {
                    if (!(e2vVar instanceof g2v)) {
                        eg.o();
                        return null;
                    }
                    wwp0Var = new wwp0(1, 0);
                }
            }
        }
        uq8Var.D(z, i, wwp0Var, c380Var, (vu30) null, x340Var, 24576);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        i1r i1rVar;
        tdb1 tdb1Var;
        List listK;
        cmj1 cmj1Var;
        zuc0 zuc0Var;
        hll hllVarA;
        List list;
        hwq hwqVar = (hwq) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        vdb1 vdb1Var = (vdb1) this.b;
        l7e0 l7e0Var = hwqVar.g;
        boolean z = l7e0Var instanceof j7e0;
        j7e0 j7e0Var = z ? (j7e0) l7e0Var : null;
        int i = 1;
        boolean z2 = ((j7e0Var == null || (zuc0Var = j7e0Var.a) == null || (hllVarA = zuc0Var.q.a(hll.class)) == null || (list = hllVarA.d) == null) ? false : list.contains(fll.c)) && !u890.j(hwqVar.f.c.get("fully_cached_files_only"), "true");
        if (z2) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1724288997);
            Object value = rwq.h(vdb1Var.d, x340Var2, 0).getValue();
            i1rVar = value instanceof i1r ? (i1r) value : null;
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1913431863);
            x340Var3.r(false);
            i1rVar = null;
        }
        boolean z3 = (i1rVar == null || (cmj1Var = (cmj1) i1rVar.a) == null || !t2p1.p(cmj1Var)) ? false : true;
        boolean z4 = vdb1Var.e;
        fbp1 fbp1Var = swp0.c;
        if (z) {
            zuc0 zuc0Var2 = ((j7e0) l7e0Var).a;
            lkj0 lkj0Var = zuc0Var2 != null ? zuc0Var2.p : null;
            fjf1 fjf1Var = lkj0Var instanceof fjf1 ? (fjf1) lkj0Var : null;
            boolean z5 = fjf1Var != null ? fjf1Var.h : false;
            if (z4 && z3 && z2) {
                fbp1 fbp1Var2 = zuc0Var2.o;
                if (fbp1Var2 != null) {
                    fbp1Var = fbp1Var2;
                }
            } else {
                fbp1Var = zuc0Var2.n;
            }
            hll hllVarA2 = zuc0Var2.q.a(hll.class);
            if (hllVarA2 == null || (listK = hllVarA2.b) == null) {
                smc0 smc0VarN = k4p1.n();
                if (zuc0Var2.c()) {
                    smc0VarN.add(ell.d);
                }
                if (zuc0Var2.k) {
                    smc0VarN.add(ell.b);
                }
                listK = k4p1.k(smc0VarN);
            }
            c380 c380VarA = mqo1.A(listK);
            if (z2 && !z3 && (!vdb1Var.c || !rqt0.D(zuc0Var2))) {
                i = 2;
                if (z4) {
                    fbp1 fbp1Var3 = zuc0Var2.o;
                    if (u890.j(fbp1Var3, iwp0.c)) {
                        i = 4;
                    } else if ((fbp1Var3 instanceof kwp0) || (fbp1Var3 instanceof wwp0) || u890.j(fbp1Var3, uwp0.c)) {
                        i = 3;
                    }
                }
            }
            tdb1Var = new tdb1(z5, i, fbp1Var, c380VarA);
        } else {
            tdb1Var = new tdb1(false, 1, fbp1Var, fg91.b);
        }
        vdb1Var.e(tdb1Var, x340Var, 0);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Number) obj5).intValue();
        ((maa1) this.b).e((b0k) obj4, 0);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        xeb1 xeb1Var = (xeb1) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            iIntValue |= x340Var.g(xeb1Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            ((gfb1) this.b).f(xeb1Var, x340Var2, (iIntValue >> 3) & 14);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        kfb1 kfb1Var = (kfb1) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        int i = kfb1Var.c;
        fra fraVar = een.N0;
        qlb qlbVar = (qlb) this.b;
        jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarE = zr7.E(x340Var, nim0Var);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(jw31VarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        if (i != 1) {
            x340Var3.i0(-1479624370);
            qlbVar.i(i, x340Var, 0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 4.0f));
            x340Var3.r(false);
        } else {
            x340Var3.i0(-1479490791);
            x340Var3.r(false);
        }
        qlbVar.l(kfb1Var, x340Var, (iIntValue >> 3) & 14);
        x340Var3.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:275:0x06b5  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException, ParseException {
        int i;
        max maxVar;
        max maxVar2;
        Date date;
        String str;
        Object jaa1Var;
        x340 x340Var;
        String strK;
        Integer num;
        byte b = 17;
        byte b2 = 14;
        vu30 vu30VarR = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                p491 p491Var = (p491) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var2 = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                a4f0 a4f0Var = (a4f0) this.b;
                m4c m4cVar = fkj0.X;
                boolean z2 = p491Var.a;
                Boolean boolValueOf = Boolean.valueOf(z2);
                int i2 = (iIntValue & 896) ^ 384;
                boolean z3 = (i2 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                x340 x340Var3 = x340Var2;
                Object objT = x340Var3.T();
                if (z3 || objT == m4cVar) {
                    objT = new v5a(iu30Var, (lnm) null, (byte) 16);
                    x340Var3.s0(objT);
                }
                qxd0.t(boolValueOf, x340Var3, (vu30) objT);
                if (z2) {
                    int iC = l1d.C(p491Var.b);
                    if (iC == 0) {
                        i = 18;
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        i = 2;
                    }
                    if (p491Var.c) {
                        x340Var3.i0(1755460768);
                        if ((i2 <= 256 || !x340Var3.g(iu30Var)) && (iIntValue & 384) != 256) {
                            z = false;
                        }
                        Object objT2 = x340Var3.T();
                        if (z || objT2 == m4cVar) {
                            objT2 = new pc81(iu30Var, (byte) 16);
                            x340Var3.s0(objT2);
                        }
                        a4f0Var.f(i, 0, (Function0) objT2, x340Var3);
                        x340Var3.r(false);
                    } else {
                        x340Var3.i0(1755553086);
                        if ((i2 <= 256 || !x340Var3.g(iu30Var)) && (iIntValue & 384) != 256) {
                            z = false;
                        }
                        Object objT3 = x340Var3.T();
                        if (z || objT3 == m4cVar) {
                            objT3 = new pc81(iu30Var, (byte) 17);
                            x340Var3.s0(objT3);
                        }
                        a4f0Var.e(i, 0, (Function0) objT3, x340Var3);
                        x340Var3.r(false);
                    }
                }
                return rih1.a;
            case 1:
                m991 m991Var = (m991) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                int iIntValue2 = ((Number) obj5).intValue();
                nim0 nim0Var = nim0.a;
                x340 x340Var4 = (b0k) obj4;
                Object objT4 = x340Var4.T();
                m4c m4cVar2 = fkj0.X;
                if (objT4 == m4cVar2) {
                    objT4 = er81.Z0;
                    x340Var4.s0(objT4);
                }
                qim0 qim0VarB = s161.b(nim0Var, true, (iu30) objT4);
                if (m991Var.a) {
                    x340Var4.i0(-539385502);
                    x340Var4.r(false);
                    maxVar = jax.a;
                } else {
                    x340Var4.i0(-539383399);
                    max haxVar = new hax(cwl1.o0(x340Var4, 2131954446));
                    x340Var4.r(false);
                    maxVar = haxVar;
                }
                if ((((iIntValue2 & 896) ^ 384) <= 256 || !x340Var4.g(iu30Var2)) && (iIntValue2 & 384) != 256) {
                    z = false;
                }
                Object objT5 = x340Var4.T();
                if (z || objT5 == m4cVar2) {
                    objT5 = new pc81(iu30Var2, (byte) 20);
                    x340Var4.s0(objT5);
                }
                jto1.b(qim0VarB, (uvx) null, maxVar, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT5), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(1994748586, new k681((n991) this.b, m991Var, (byte) 15), x340Var4), x340Var4, 0, 196608, 32698);
                return rih1.a;
            case 2:
                s991 s991Var = (s991) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                int iIntValue3 = ((Number) obj5).intValue();
                nim0 nim0Var2 = nim0.a;
                x340 x340Var5 = (b0k) obj4;
                Object objT6 = x340Var5.T();
                m4c m4cVar3 = fkj0.X;
                if (objT6 == m4cVar3) {
                    objT6 = er81.b1;
                    x340Var5.s0(objT6);
                }
                qim0 qim0VarB2 = s161.b(nim0Var2, true, (iu30) objT6);
                if (s991Var.a) {
                    x340Var5.i0(-1212675198);
                    x340Var5.r(false);
                    maxVar2 = jax.a;
                } else {
                    x340Var5.i0(-1212673095);
                    max haxVar2 = new hax(cwl1.o0(x340Var5, 2131954446));
                    x340Var5.r(false);
                    maxVar2 = haxVar2;
                }
                if ((((iIntValue3 & 896) ^ 384) <= 256 || !x340Var5.g(iu30Var3)) && (iIntValue3 & 384) != 256) {
                    z = false;
                }
                Object objT7 = x340Var5.T();
                if (z || objT7 == m4cVar3) {
                    objT7 = new pc81(iu30Var3, (byte) 21);
                    x340Var5.s0(objT7);
                }
                jto1.b(qim0VarB2, (uvx) null, maxVar2, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT7), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-1581520694, new k681((t991) this.b, s991Var, (byte) 16), x340Var5), x340Var5, 0, 196608, 32698);
                return rih1.a;
            case 3:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                kiv kivVar = vvx.a;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar).b;
                mod.b(kivVar.a(new uvx(0, null, 2, null, uyn1.h(2, 4.0f, 0.0f), null, null, 0, null, 491)), apo.r(-1667208210, new q081((x991) this.b, (w991) obj2, b2), b0kVar), b0kVar, 56);
                return rih1.a;
            case 4:
                de91 de91Var = (de91) obj2;
                int iIntValue4 = ((Number) obj5).intValue();
                ngs0 ngs0Var = (ngs0) this.b;
                x340 x340Var6 = (b0k) obj4;
                boolean zI = x340Var6.i(ngs0Var);
                if ((((iIntValue4 & 112) ^ 48) <= 32 || !x340Var6.g(de91Var)) && (iIntValue4 & 48) != 32) {
                    z = false;
                }
                boolean z4 = zI | z;
                Object objT8 = x340Var6.T();
                if (z4 || objT8 == fkj0.X) {
                    objT8 = new ft0(ngs0Var, de91Var, (byte) 22);
                    x340Var6.s0(objT8);
                }
                c97.d((Function0) objT8, x340Var6, 0);
                return rih1.a;
            case 5:
                v6a1 v6a1Var = (v6a1) obj2;
                ((Number) obj5).intValue();
                u6a1 u6a1Var = v6a1Var.a;
                ((w6a1) this.b).f(v6a1Var.b, mqo1.A(v6a1Var.c), u6a1Var.d, u6a1Var.c, u6a1Var.b, (b0k) obj4, 0);
                return rih1.a;
            case 6:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((s7a1) this.b).a), apo.r(1724871883, new m7a1((a8a1) obj2, (iu30) obj3, (byte) 2), b0kVar2), b0kVar2, 56);
                return rih1.a;
            case 7:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((v7a1) this.b).a), apo.r(-225934709, new m7a1((a8a1) obj2, (iu30) obj3, (byte) 3), b0kVar3), b0kVar3, 56);
                return rih1.a;
            case 8:
                m9a1 m9a1Var = (m9a1) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                int iIntValue5 = ((Number) obj5).intValue();
                String string = "";
                x340 x340Var7 = (b0k) obj4;
                Context context = (Context) x340Var7.k(AndroidCompositionLocals_androidKt.b);
                cm0 cm0Var = (cm0) this.b;
                if (!((a7a1) cm0Var.c).d || !m9a1Var.f) {
                    if (cm0Var.l(m9a1Var) != null) {
                        string = context.getString(2131962702);
                    } else if (!m9a1Var.b.isEmpty()) {
                        string = context.getString(2131962767);
                    }
                }
                String str2 = string;
                nim0 nim0Var3 = nim0.a;
                Object objT9 = x340Var7.T();
                m4c m4cVar4 = fkj0.X;
                if (objT9 == m4cVar4) {
                    objT9 = p9a1.b;
                    x340Var7.s0(objT9);
                }
                qim0 qim0VarB3 = s161.b(nim0Var3, false, (iu30) objT9);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarZ = uyn1.z(cbx.b(x340Var7).e.b, 0.0f, 2, qim0VarB3);
                xqn0 xqn0Var = new xqn0(1, m9a1Var.a, str2, (String) null, false, false, false);
                if (m9a1Var.d) {
                    x340Var7.i0(-201835908);
                    vu30VarR = apo.r(1242542790, new q081(iu30Var4, context, (byte) 19), x340Var7);
                    x340Var7.r(false);
                } else {
                    x340Var7.i0(-201172787);
                    x340Var7.r(false);
                }
                vu30 vu30Var = vu30VarR;
                if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var7.g(iu30Var4)) && (iIntValue5 & 384) != 256) {
                    z = false;
                }
                Object objT10 = x340Var7.T();
                if (z || objT10 == m4cVar4) {
                    objT10 = new pc81(iu30Var4, (byte) 28);
                    x340Var7.s0(objT10);
                }
                eqn1.c(xqn0Var, false, false, (Function0) objT10, qim0VarZ, 3, false, vu30Var, (Function0) null, x340Var7, 197040, 320);
                return rih1.a;
            case 9:
                s9a1 s9a1Var = (s9a1) obj2;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                hw2 hw2Var = (hw2) this.b;
                qtt0 qtt0Var = s9a1Var.f;
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= x340Var8.g(s9a1Var) ? 32 : 16;
                }
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue6 & 1, (iIntValue6 & 1041) != 1040)) {
                    iac0 iac0Var = (iac0) x340Var9.k(jfe0.a);
                    boolean zE = x340Var9.e(qtt0Var.ordinal());
                    Object objT11 = x340Var9.T();
                    if (zE || objT11 == fkj0.X) {
                        jyo jyoVar = (jyo) hw2Var.f;
                        crq crqVar = (crq) hw2Var.g;
                        String str3 = s9a1Var.a;
                        b9u0 b9u0Var = (b9u0) hw2Var.h;
                        yjq yjqVar = (yjq) crqVar.a.c;
                        zeu0 zeu0Var = (zeu0) ((mzr0) yjqVar.c).c;
                        c8o.l(zeu0Var);
                        mzr0 mzr0Var = (mzr0) yjqVar.c;
                        yqg yqgVar = (yqg) mzr0Var.a;
                        c8o.l(yqgVar);
                        ruz ruzVarA = ((t8u0) mzr0Var.b).a(krw0.i.f).a();
                        b7r0 b7r0Var = (b7r0) mzr0Var.d;
                        c8o.l(b7r0Var);
                        xrc0 xrc0Var = (xrc0) mzr0Var.f;
                        c8o.l(xrc0Var);
                        q8n q8nVarX = brt.x();
                        y390 y390Var = (y390) mzr0Var.e;
                        c8o.l(y390Var);
                        objT11 = jyoVar.a(new baa1(zeu0Var, yqgVar, ruzVarA, b7r0Var, xrc0Var, q8nVarX, y390Var, qtt0Var, iac0Var, str3, b9u0Var, (r6h1) yjqVar.d), new u9a1(3, (lnm) null, (byte) 0));
                        x340Var9.s0(objT11);
                    }
                    nyx.a(2, (wux) null, apo.r(-66335203, new qm71(s9a1Var, hw2Var, (gft0) objT11, (byte) 17), x340Var9), x340Var9, 3078, 6);
                } else {
                    x340Var9.b0();
                }
                return rih1.a;
            case 10:
                haa1 haa1Var = (haa1) obj2;
                b0k b0kVar4 = (b0k) obj4;
                ((Number) obj5).intValue();
                iaa1 iaa1Var = (iaa1) this.b;
                String str4 = haa1Var.a;
                if (str4 != null) {
                    try {
                        try {
                            date = new Date(Instant.parse(str4).toEpochMilli());
                        } catch (Exception unused) {
                            date = null;
                        }
                    } catch (DateTimeException unused2) {
                        SimpleDateFormat simpleDateFormat = iaa1.f;
                        synchronized (simpleDateFormat) {
                            date = simpleDateFormat.parse(str4);
                        }
                    }
                    if (date != null) {
                        DateFormat dateInstance = DateFormat.getDateInstance(2, iaa1Var.b);
                        dateInstance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                        str = dateInstance.format(date);
                    } else {
                        str = null;
                    }
                    break;
                } else {
                    str = null;
                }
                int i3 = haa1Var.b;
                Integer numValueOf = Integer.valueOf(i3);
                if (i3 <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue7 = numValueOf.intValue();
                    vu30VarR = iaa1Var.a.getQuantityString(2131820925, iIntValue7, Integer.valueOf(iIntValue7));
                }
                String strY0 = o7h.y0(f46.i0(new String[]{str, vu30VarR}), " • ", (String) null, (String) null, (iu30) null, 62);
                uwr uwrVar3 = cbx.a;
                uwo1.e(strY0, anm1.N("songdnacovers_header_metadata", nim0.a), cbx.d(b0kVar4).j, cbx.a(b0kVar4).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, 0, 0, 2032);
                return rih1.a;
            case 11:
                x340 x340Var10 = (b0k) obj4;
                ((Number) obj5).intValue();
                boe boeVar = (boe) this.b;
                qdn qdnVar = qdn.a;
                l7e0 l7e0Var = ((hwq) obj2).g;
                if (l7e0Var instanceof j7e0) {
                    zuc0 zuc0Var = ((j7e0) l7e0Var).a;
                    String str5 = (String) zuc0Var.g.get("current_pos");
                    if (str5 == null) {
                        jaa1Var = kaa1.a;
                    } else {
                        Integer numC0 = nhc1.c0(str5);
                        int iIntValue8 = numC0 != null ? numC0.intValue() : 0;
                        Enum[] enumArr = (Enum[]) qdn.class.getEnumConstants();
                        HashMap map = new HashMap(mno1.k(enumArr.length));
                        for (Enum r11 : enumArr) {
                            map.put(r11.name().toUpperCase(Locale.US), r11);
                        }
                        String str6 = (String) zuc0Var.g.get("status");
                        if (str6 == null) {
                            str6 = "UNKNOWN";
                        }
                        Enum r1 = (Enum) map.get(str6.toUpperCase(Locale.US));
                        jaa1Var = new jaa1(iIntValue8, (qdn) (r1 != null ? new i5w0(r1) : j5.a).e(qdnVar));
                    }
                } else {
                    jaa1Var = new jaa1(0, qdnVar);
                }
                if (jaa1Var instanceof kaa1) {
                    x340 x340Var11 = x340Var10;
                    x340Var11.i0(-27689030);
                    boeVar.f(x340Var11, 0);
                    x340Var11.r(false);
                } else {
                    if (!(jaa1Var instanceof jaa1)) {
                        throw p3d1.k(x340Var10, -27690956, false);
                    }
                    x340 x340Var12 = x340Var10;
                    x340Var12.i0(-27687773);
                    boeVar.g((jaa1) jaa1Var, x340Var12, 0);
                    x340Var12.r(false);
                }
                return rih1.a;
            case 12:
                ((jd6) this.b).g((paa1) obj2, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1.a;
            case 13:
                oba1 oba1Var = (oba1) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                kba1 kba1Var = oba1Var.a;
                int i4 = kba1Var.c;
                boolean z5 = oba1Var.c;
                if (((qba1) this.b).a == null) {
                    x340Var = x340Var13;
                    x340Var.i0(-1006311524);
                } else {
                    x340Var = x340Var13;
                    x340Var.i0(-1006311523);
                    boolean z6 = (((iIntValue9 & 896) ^ 384) > 256 && x340Var.g(iu30Var5)) || (iIntValue9 & 384) == 256;
                    Object objT12 = x340Var.T();
                    if (z6 || objT12 == m4cVar5) {
                        objT12 = new pc81(iu30Var5, (byte) 29);
                        x340Var.s0(objT12);
                    }
                    vu30VarR = (Function0) objT12;
                }
                x340Var.r(false);
                vu30 vu30Var2 = vu30VarR;
                qim0 qim0VarN = anm1.N("song_dna_search_chip_".concat(kba1Var.a), nim0.a);
                if ((((iIntValue9 & 896) ^ 384) <= 256 || !x340Var13.g(iu30Var5)) && (iIntValue9 & 384) != 256) {
                    z = false;
                }
                x340 x340Var14 = x340Var13;
                Object objT13 = x340Var14.T();
                if (z || objT13 == m4cVar5) {
                    objT13 = new pba1(iu30Var5, (byte) 0);
                    x340Var14.s0(objT13);
                }
                rqg0.n(i4, 0, (Function0) objT13, vu30Var2, x340Var14, qim0VarN, z5);
                return rih1.a;
            case 14:
                fea1 fea1Var = (fea1) obj2;
                b0k b0kVar5 = (b0k) obj4;
                ((Number) obj5).intValue();
                hqq0.z(fea1Var.b, apo.r(-1803364331, new nu31(fea1Var, (iu30) obj3, (iea1) this.b, b), b0kVar5), b0kVar5, 48);
                return rih1.a;
            case 15:
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                g3d0 g3d0Var = ((gha1) obj2).a;
                boolean z7 = (!((d2f1) ((et90) this.b).c).d || g3d0Var == null || (g3d0Var instanceof u2d0)) ? false : true;
                if (z7) {
                    x340 x340Var16 = x340Var15;
                    x340Var16.i0(1829722479);
                    if (g3d0Var instanceof u2d0) {
                        num = null;
                    } else if ((g3d0Var instanceof x2d0) || (g3d0Var instanceof y2d0)) {
                        num = 2131962803;
                    } else if ((g3d0Var instanceof m2d0) || (g3d0Var instanceof n2d0)) {
                        num = 2131962800;
                    } else if ((g3d0Var instanceof s2d0) || (g3d0Var instanceof t2d0)) {
                        num = 2131962798;
                    } else if ((g3d0Var instanceof q2d0) || (g3d0Var instanceof r2d0)) {
                        num = 2131962797;
                    } else if (g3d0Var instanceof e3d0) {
                        num = 2131962802;
                    } else if (g3d0Var instanceof c3d0) {
                        num = 2131962801;
                    } else if (g3d0Var instanceof w2d0) {
                        num = 2131962799;
                    } else if (g3d0Var instanceof o2d0) {
                        num = 2131962796;
                    } else {
                        if (!(g3d0Var instanceof v2d0) && !(g3d0Var instanceof f3d0) && !(g3d0Var instanceof p2d0) && !(g3d0Var instanceof z2d0) && !(g3d0Var instanceof a3d0)) {
                            eg.o();
                            return null;
                        }
                        num = null;
                    }
                    if (num == null) {
                        x340Var16.i0(1829762499);
                        x340Var16.r(false);
                        strK = null;
                    } else {
                        strK = kk0.k(x340Var16, 1829762500, num, x340Var16, false);
                    }
                    if (strK == null) {
                        strK = x0d.k(x340Var16, 1444499231, 2131954740, x340Var16, false);
                    } else {
                        x340Var16.i0(1444496627);
                        x340Var16.r(false);
                    }
                    x340Var16.r(false);
                } else {
                    x340 x340Var17 = x340Var15;
                    strK = x0d.k(x340Var17, 1829876177, 2131954740, x340Var17, false);
                }
                String str7 = strK;
                t2g t2gVar = z7 ? new t2g(true, false, (qex) null, 6) : new u2g(3, false);
                rsx rsxVar = rsx.c;
                qim0 qim0VarN2 = anm1.N("SORT_CURATION_ACTION_BUTTON", nim0.a);
                String strO0 = cwl1.o0(x340Var15, 2131954739);
                if ((((iIntValue10 & 896) ^ 384) <= 256 || !x340Var15.g(iu30Var6)) && (iIntValue10 & 384) != 256) {
                    z = false;
                }
                x340 x340Var18 = x340Var15;
                Object objT14 = x340Var18.T();
                if (z || objT14 == fkj0.X) {
                    objT14 = new pba1(iu30Var6, (byte) 2);
                    x340Var18.s0(objT14);
                }
                kyo1.c(str7, rsxVar, (Function0) objT14, qim0VarN2, false, strO0, t2gVar, (vu30) null, x340Var18, rsx.d << 3, 144);
                return rih1.a;
            case 16:
                b0k b0kVar6 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(319945736, new q081((cka1) obj2, (ngs0) this.b, (byte) 27), b0kVar6), b0kVar6, 3078, 6);
                return rih1.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return a(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                vwa1 vwa1Var = (vwa1) obj2;
                x340 x340Var19 = (b0k) obj4;
                ((Number) obj5).intValue();
                uq8 uq8Var = (uq8) ((nm1) this.b).f;
                boolean z8 = vwa1Var.c;
                int i5 = vwa1Var.d ? 2 : 1;
                c380 c380Var = vwa1Var.f;
                e2v e2vVar = vwa1Var.e;
                fbp1 wwp0Var = swp0.c;
                if (e2vVar != null) {
                    if (e2vVar instanceof d2v) {
                        wwp0Var = mwp0.c;
                    } else if (e2vVar instanceof c2v) {
                        wwp0Var = iwp0.c;
                    } else if (!(e2vVar instanceof f2v)) {
                        if (e2vVar instanceof e2v) {
                            wwp0Var = new kwp0((int) (e2vVar.a * 100.0f));
                        } else {
                            if (!(e2vVar instanceof g2v)) {
                                eg.o();
                                return null;
                            }
                            wwp0Var = new wwp0(1, 0);
                        }
                    }
                }
                fbp1 fbp1Var = wwp0Var;
                Integer num2 = vwa1Var.a;
                if (num2 == null) {
                    x340 x340Var20 = x340Var19;
                    x340Var20.i0(-599943029);
                    x340Var20.r(false);
                } else {
                    x340 x340Var21 = x340Var19;
                    x340Var21.i0(-599943028);
                    vu30VarR = apo.r(1085818632, new ug50(num2.intValue(), vwa1Var), x340Var21);
                    x340Var21.r(false);
                }
                uq8Var.D(z8, i5, fbp1Var, c380Var, vu30VarR, x340Var19, 0);
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                int iIntValue11 = ((Number) obj5).intValue();
                r8s r8sVar = (r8s) this.b;
                ((ur00) r8sVar.t).c((c0b1) obj2, (zob1) r8sVar.X, (iu30) obj3, (b0k) obj4, (iIntValue11 & 896) | ((iIntValue11 >> 3) & 14));
                return rih1.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ubb1 ubb1Var = (ubb1) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                res resVar = (res) this.b;
                int i6 = (iIntValue12 & 48) == 0 ? ((iIntValue12 & 64) == 0 ? x340Var22.g(ubb1Var) : x340Var22.i(ubb1Var) ? 32 : 16) | iIntValue12 : iIntValue12;
                if ((iIntValue12 & 384) == 0) {
                    i6 |= x340Var22.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(i6 & 1, (i6 & 1169) != 1168)) {
                    yqi1 yqi1Var = yqi1.b;
                    xb10 xb10VarO = x4p1.o(x340Var23);
                    smr0 smr0VarA = xb10VarO.a();
                    boolean zG = x340Var23.g(xb10VarO) | x340Var23.i(resVar);
                    Object objT15 = x340Var23.T();
                    if (zG || objT15 == fkj0.X) {
                        objT15 = new wp41(xb10VarO, resVar, (lnm) null, (byte) 29);
                        x340Var23.s0(objT15);
                    }
                    qxd0.t(smr0VarA, x340Var23, (vu30) objT15);
                    resVar.p(ubb1Var, ubb1Var.d, iu30Var7, xb10VarO, yqi1Var, x340Var23, ((i6 >> 3) & 14) | (i6 & 896));
                } else {
                    x340Var23.b0();
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                int iIntValue13 = ((Number) obj5).intValue();
                z72 z72Var = (z72) this.b;
                wp20 wp20Var = (wp20) z72Var.Y;
                jha1 jha1Var = new jha1((zob1) z72Var.Z, (byte) 5);
                int i7 = iIntValue13 >> 3;
                wp20Var.f((qcb1) obj2, (iu30) obj3, jha1Var, (b0k) obj4, (i7 & 112) | (i7 & 14) | 3072);
                return rih1.a;
            case 22:
                return d(obj, obj2, obj3, obj4, obj5);
            case 23:
                return e(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                beb1 beb1Var = (beb1) obj2;
                ((Number) obj5).intValue();
                aeb1 aeb1Var = beb1Var.a;
                rdb1 rdb1Var = rdb1.S0;
                x340 x340Var24 = (b0k) obj4;
                Object objT16 = x340Var24.T();
                if (objT16 == fkj0.X) {
                    objT16 = rdb1.R0;
                    x340Var24.s0(objT16);
                }
                hm5.a(aeb1Var, (qim0) null, rdb1Var, (tl3) null, "artwork", (iu30) objT16, apo.r(-850400438, new juy0((fob) this.b, beb1Var, (byte) 7), x340Var24), x340Var24, 1794432, 10);
                return rih1.a;
            case 25:
                ((jeb1) this.b).g((hwq) obj2, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1.a;
            case 26:
                return f(obj, obj2, obj3, obj4, obj5);
            case 27:
                return g(obj, obj2, obj3, obj4, obj5);
            case 28:
                return h(obj, obj2, obj3, obj4, obj5);
            default:
                lsb1 lsb1Var = (lsb1) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var25 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                boolean z9 = (((iIntValue14 & 896) ^ 384) > 256 && x340Var25.g(iu30Var8)) || (iIntValue14 & 384) == 256;
                x340 x340Var26 = x340Var25;
                Object objT17 = x340Var26.T();
                if (z9 || objT17 == fkj0.X) {
                    objT17 = new et61(iu30Var8, (byte) 26);
                    x340Var26.s0(objT17);
                }
                mod.b(oi7.a.a(((qsb1) this.b).b), apo.r(375340350, new psb1(lsb1Var, (iu30) objT17, (byte) 1), x340Var26), x340Var26, 56);
                return rih1.a;
        }
    }
}
