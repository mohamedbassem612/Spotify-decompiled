package p;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nzd extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzd(iyb iybVar, kvt kvtVar, iu30 iu30Var) {
        super(3);
        this.a = (byte) 19;
        this.b = iybVar;
        this.c = kvtVar;
        this.d = iu30Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        aqb0 aqb0Var = (aqb0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        j2i j2iVar = (j2i) this.b;
        scr scrVar = (scr) this.c;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(aqb0Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            iu30 iu30Var = scrVar.d;
            if (iu30Var == null || !((Boolean) iu30Var.invoke((wu61) this.d)).booleanValue()) {
                x340Var2.i0(1486122445);
                j2iVar.invoke(aqb0Var, x340Var2, Integer.valueOf(iIntValue & 14));
                x340Var2.r(false);
            } else {
                x340Var2.i0(1485839725);
                boolean zBooleanValue = ((Boolean) scrVar.c.getValue()).booleanValue();
                boolean zI = x340Var2.i(scrVar);
                Object objT = x340Var2.T();
                if (zI || objT == fkj0.X) {
                    objT = new z5o(scrVar, (byte) 16);
                    x340Var2.s0(objT);
                }
                p6p1.j(zBooleanValue, (Function0) objT, apo.r(751359316, new g1o(j2iVar, aqb0Var, (byte) 10), x340Var2), x340Var2, 384);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object d(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        boolean z;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        oyn oynVar = (oyn) this.b;
        String str = oynVar.c;
        x340 x340Var = (b0k) obj2;
        boolean zI = x340Var.i(oynVar);
        j06 j06Var = x340Var.a;
        err errVar = (err) this.c;
        boolean zI2 = zI | x340Var.i(errVar);
        Object objT = x340Var.T();
        if (zI2 || objT == m4cVar) {
            objT = new y0o(oynVar, errVar, (byte) 16);
            x340Var.s0(objT);
        }
        nim0 nim0Var = nim0.a;
        qim0 qim0VarB = s161.b(nim0Var, true, (iu30) objT);
        cyn cynVar = oynVar.o;
        int i = oynVar.f;
        n4k n4kVar = hmb0.t1;
        if (cynVar == null || i == 0) {
            x340Var.i0(-513114495);
            int i2 = i == 0 ? -1 : arr.a[l1d.C(i)];
            Object obj4 = this.d;
            if (i2 == -1) {
                x340Var.i0(-511697361);
                uwo1.e(str, qim0VarB, (lee1) obj4, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1720);
                x340Var = x340Var;
                z = false;
                x340Var.r(false);
            } else if (i2 == 1) {
                x340Var.i0(-513050914);
                lee1 lee1Var = (lee1) obj4;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar4);
                nko1.H(xos0VarM, x340Var, lljVar3);
                x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE, x340Var, lljVar);
                uwo1.e(str, (qim0) null, lee1Var, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1722);
                op71.g(x340Var, u291.v(nim0Var, 4.0f));
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(wtx.c, isl.a, u291.r(nim0Var, 16.0f), ((wex) ((gmt) zex.a.c).c).b, 0L, true, x340Var, wtx.d | 196656, 16);
                x340Var = x340Var;
                x340Var.r(true);
                z = false;
                x340Var.r(false);
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw p3d1.k(x340Var, 1646015905, false);
                }
                x340Var.i0(-511987459);
                h7p1.f(str, (lee1) obj4, qim0VarB, x340Var, 0);
                x340Var.r(false);
                z = false;
            }
            x340Var.r(z);
        } else {
            x340Var.i0(-513444087);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new dyn();
                x340Var.s0(objT2);
            }
            dyn dynVar = (dyn) objT2;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar4);
            nko1.H(xos0VarM2, x340Var, lljVar3);
            x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar);
            otw.c(dynVar, oynVar.o, (qim0) null, (ipb1) null, x340Var, 72, 12);
            x340Var.r(true);
            x340Var.r(false);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0366  */
    /* JADX WARN: Code duplicated, block: B:109:0x0381  */
    /* JADX WARN: Code duplicated, block: B:112:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:114:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:117:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:120:0x0424  */
    /* JADX WARN: Code duplicated, block: B:123:0x045c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0460  */
    /* JADX WARN: Code duplicated, block: B:127:0x0476  */
    /* JADX WARN: Code duplicated, block: B:129:0x0482  */
    /* JADX WARN: Code duplicated, block: B:131:0x0499  */
    private final Object e(Object obj, Object obj2, Object obj3) {
        llj lljVar;
        m4c m4cVar;
        boolean zI;
        Object objT;
        boolean zG;
        Object objT2;
        Function0 function0;
        vu30 vu30Var;
        vu30 vu30Var2;
        llj lljVar2;
        vu30 vu30Var3;
        boolean z;
        boolean zG2;
        Object objT3;
        aqw aqwVar;
        boolean z2;
        boolean z3;
        i2c i2cVar = (i2c) obj;
        ((Number) obj3).intValue();
        iu30 iu30Var = (iu30) this.d;
        m4c m4cVar2 = fkj0.X;
        jfj0 jfj0Var = (jfj0) this.b;
        r8s r8sVar = (r8s) this.c;
        aqw aqwVar2 = (aqw) r8sVar.g;
        kiv kivVar = AndroidCompositionLocals_androidKt.a;
        x340 x340Var = (b0k) obj2;
        Object objK = x340Var.k(kivVar);
        j06 j06Var = x340Var.a;
        boolean z4 = ((Configuration) objK).smallestScreenWidthDp >= 600;
        boolean z5 = jfj0Var.b;
        float fD = i2cVar.d();
        if (fD > 375.0f) {
            fD = 375.0f;
        }
        p3v p3vVar = new p3v(fD);
        Set setSingleton = null;
        if (!z4) {
            p3vVar = null;
        }
        float fD2 = p3vVar != null ? p3vVar.a : i2cVar.d();
        float fC = 1.75f * fD2;
        float fC2 = i2cVar.c() * 0.7f;
        if (fC <= fC2) {
            fC2 = fC;
        }
        if (!z5) {
            fC = 0.74f * i2cVar.c();
        } else if (!z5 || !z4) {
            fC = i2cVar.c();
        }
        boolean zG3 = x340Var.g(aqwVar2.b);
        Object objT4 = x340Var.T();
        if (zG3 || objT4 == m4cVar2) {
            objT4 = v8r.q(Boolean.FALSE);
            x340Var.s0(objT4);
        }
        ven0 ven0Var = (ven0) objT4;
        boolean zBooleanValue = !z5 ? ((Boolean) ven0Var.getValue()).booleanValue() : true;
        if (zBooleanValue) {
            fC2 = fC;
        }
        float fC3 = i2cVar.c();
        float f = zBooleanValue ? fC3 * 0.13f : fC3 * 0.15f;
        float fC4 = i2cVar.c();
        float f2 = zBooleanValue ? fC4 * 0.13f : fC4 * 0.15f;
        Object objT5 = x340Var.T();
        if (objT5 == m4cVar2) {
            objT5 = c97.b(1.0f);
            x340Var.s0(objT5);
        }
        o95 o95Var = (o95) objT5;
        Object objT6 = x340Var.T();
        if (objT6 == m4cVar2) {
            objT6 = new cx81();
            x340Var.s0(objT6);
        }
        cx81 cx81Var = (cx81) objT6;
        Object objT7 = x340Var.T();
        if (objT7 == m4cVar2) {
            objT7 = new cx81();
            x340Var.s0(objT7);
        }
        cx81 cx81Var2 = (cx81) objT7;
        boolean zG4 = x340Var.g(aqwVar2.b) | x340Var.g((paj0) r8sVar.e);
        Object objT8 = x340Var.T();
        if (zG4 || objT8 == m4cVar2) {
            objT8 = new q8s(r8sVar, iu30Var, ven0Var);
            x340Var.s0(objT8);
        }
        q8s q8sVar = (q8s) objT8;
        Object objT9 = x340Var.T();
        if (objT9 == m4cVar2) {
            objT9 = v8r.q(Boolean.FALSE);
            x340Var.s0(objT9);
        }
        ven0 ven0Var2 = (ven0) objT9;
        Object objT10 = x340Var.T();
        if (objT10 == m4cVar2) {
            objT10 = qxd0.M(o6x.a, x340Var);
            x340Var.s0(objT10);
        }
        float f3 = fC2;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarD = u291.d(nim0Var, 1.0f);
        c9n c9nVar = (c9n) objT10;
        mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
        hzj.A.getClass();
        if (j06Var == null) {
            tgp1.p();
            throw null;
        }
        x340Var.m0();
        boolean z6 = x340Var.S;
        Function0 function1 = hmb0.t1;
        if (z6) {
            x340Var.l(function1);
        } else {
            x340Var.v0();
        }
        vu30 vu30Var4 = y580.O0;
        nko1.H(mbhVarA, x340Var, vu30Var4);
        vu30 vu30Var5 = y580.N0;
        nko1.H(xos0VarM, x340Var, vu30Var5);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var, lljVar3);
        nko1.F(x340Var);
        vu30 vu30Var6 = y580.Y;
        nko1.H(qim0VarE, x340Var, vu30Var6);
        if (z5) {
            c9nVar = c9nVar;
            vu30Var6 = vu30Var6;
            f3 = f3;
            lljVar = lljVar3;
            function1 = function1;
            vu30Var5 = vu30Var5;
            vu30Var4 = vu30Var4;
            x340Var.i0(-401890315);
            x340Var.r(false);
        } else {
            x340Var.i0(-402270871);
            qim0 qim0VarN = anm1.N((String) r8sVar.t, d9y0.k(u291.j(0.0f, f, 1, u291.v(nim0Var, fD2)), ((Number) o95Var.e()).floatValue()));
            gfh0 gfh0VarC = t1c.c(een.X, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, vu30Var4);
            nko1.H(xos0VarM2, x340Var, vu30Var5);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, vu30Var6);
            aqw aqwVar3 = (aqw) r8sVar.f;
            if (aqwVar3 == null) {
                x340Var.i0(-974271422);
                z3 = false;
                x340Var.r(false);
                lljVar = lljVar3;
            } else {
                z3 = false;
                x340Var.i0(1492592543);
                lljVar = lljVar3;
                aqwVar3.a(cx81Var, (qe41) null, x340Var, 0, 2);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(z3);
        }
        x340Var.i0(818324653);
        qim0 qim0VarS = u291.s(nim0Var, fD2, f3);
        if (!z5) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.a, 0.0f, 2, nim0Var);
            boolean z7 = !((Boolean) ven0Var2.getValue()).booleanValue();
            cua cuaVar = cbx.b(x340Var).f;
            qim0VarS = qim0VarS.then(i541.D(qim0VarZ, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, er31.b(6.0f), z7, 0L, 0L, 0, (f2b) null, 1042431));
        }
        x340Var.r(false);
        qim0 qim0VarN2 = anm1.N((String) r8sVar.X, qim0VarS);
        float f4 = ((Configuration) x340Var.k(kivVar)).screenWidthDp / 3;
        boolean z8 = jfj0Var.c;
        Set set = jfj0Var.d;
        if (set != null && !set.isEmpty()) {
            setSingleton = set;
        }
        if (setSingleton == null) {
            x340Var.i0(818365334);
            wat watVar = (wat) x340Var.k(t4k.h);
            setSingleton = Collections.singleton(new whf1(0.0f, 0.0f, watVar.X0(f3), watVar.X0(fD2)));
            x340Var.r(false);
        } else {
            x340Var.i0(818362637);
            x340Var.r(false);
        }
        Set set2 = setSingleton;
        boolean zI2 = x340Var.i(ven0Var2) | x340Var.i(c9nVar) | x340Var.i(o95Var);
        Object objT11 = x340Var.T();
        if (!zI2) {
            if (objT11 == m4cVar) {
            }
            m4cVar = m4cVar2;
            Function0 function2 = (Function0) objT11;
            zI = x340Var.i(ven0Var2) | x340Var.i(c9nVar) | x340Var.i(o95Var);
            objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new p8s(c9nVar, ven0Var2, o95Var, (byte) 1);
                x340Var.s0(objT);
            }
            Function0 function3 = (Function0) objT;
            zG = x340Var.g(iu30Var);
            objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new qzn(iu30Var, (byte) 26);
                x340Var.s0(objT2);
            }
            qim0 qim0VarI = zr7.i(qim0VarN2, new u8s(z8, function3, set2, function2, (Function0) objT2, f4));
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarI);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function1;
                x340Var.l(function0);
            } else {
                function0 = function1;
                x340Var.v0();
            }
            vu30Var = vu30Var4;
            nko1.H(gfh0VarC2, x340Var, vu30Var);
            vu30Var2 = vu30Var5;
            nko1.H(xos0VarM3, x340Var, vu30Var2);
            lljVar2 = lljVar;
            x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
            vu30Var3 = vu30Var6;
            nko1.H(qim0VarE3, x340Var, vu30Var3);
            ((aqw) r8sVar.g).a(q8sVar, (qe41) null, x340Var, 0, 2);
            z = true;
            x340Var.r(true);
            if (z5) {
                x340Var.i0(-399105771);
                x340Var.r(false);
            } else {
                x340Var.i0(-399545909);
                qim0 qim0VarN3 = anm1.N((String) r8sVar.Y, d9y0.k(u291.j(0.0f, f2, 1, u291.v(nim0Var, fD2)), ((Number) o95Var.e()).floatValue()));
                zG2 = x340Var.g(iu30Var);
                objT3 = x340Var.T();
                if (zG2 || objT3 == m4cVar) {
                    objT3 = new qzn(iu30Var, (byte) 27);
                    x340Var.s0(objT3);
                }
                qim0 qim0VarX = bin.x(qim0VarN3, false, (String) null, (pm31) null, (idn0) null, (Function0) objT3, 15);
                gfh0 gfh0VarC3 = t1c.c(een.e, false);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarX);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, vu30Var);
                nko1.H(xos0VarM4, x340Var, vu30Var2);
                x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE4, x340Var, vu30Var3);
                aqwVar = (aqw) r8sVar.h;
                if (aqwVar == null) {
                    x340Var.i0(1916474553);
                    z2 = false;
                } else {
                    z2 = false;
                    x340Var.i0(338916424);
                    aqwVar.a(cx81Var2, (qe41) null, x340Var, 0, 2);
                }
                x340Var.r(z2);
                z = true;
                x340Var.r(true);
                x340Var.r(z2);
            }
            x340Var.r(z);
            return rih1.a;
        }
        m4cVar = m4cVar2;
        m4cVar = m4cVar2;
        objT11 = new p8s(c9nVar, ven0Var2, o95Var, (byte) 0);
        x340Var.s0(objT11);
        m4cVar = m4cVar2;
        Function0 function4 = (Function0) objT11;
        zI = x340Var.i(ven0Var2) | x340Var.i(c9nVar) | x340Var.i(o95Var);
        objT = x340Var.T();
        if (zI) {
            objT = new p8s(c9nVar, ven0Var2, o95Var, (byte) 1);
            x340Var.s0(objT);
        } else {
            objT = new p8s(c9nVar, ven0Var2, o95Var, (byte) 1);
            x340Var.s0(objT);
        }
        Function0 function5 = (Function0) objT;
        zG = x340Var.g(iu30Var);
        objT2 = x340Var.T();
        if (zG) {
            objT2 = new qzn(iu30Var, (byte) 26);
            x340Var.s0(objT2);
        } else {
            objT2 = new qzn(iu30Var, (byte) 26);
            x340Var.s0(objT2);
        }
        qim0 qim0VarI2 = zr7.i(qim0VarN2, new u8s(z8, function5, set2, function4, (Function0) objT2, f4));
        gfh0 gfh0VarC4 = t1c.c(een.h, false);
        int iHashCode5 = Long.hashCode(x340Var.T);
        xos0 xos0VarM5 = x340Var.m();
        qim0 qim0VarE5 = zr7.E(x340Var, qim0VarI2);
        x340Var.m0();
        if (x340Var.S) {
            function0 = function1;
            x340Var.l(function0);
        } else {
            function0 = function1;
            x340Var.v0();
        }
        vu30Var = vu30Var4;
        nko1.H(gfh0VarC4, x340Var, vu30Var);
        vu30Var2 = vu30Var5;
        nko1.H(xos0VarM5, x340Var, vu30Var2);
        lljVar2 = lljVar;
        x0d.q(iHashCode5, x340Var, lljVar2, x340Var);
        vu30Var3 = vu30Var6;
        nko1.H(qim0VarE5, x340Var, vu30Var3);
        ((aqw) r8sVar.g).a(q8sVar, (qe41) null, x340Var, 0, 2);
        z = true;
        x340Var.r(true);
        if (z5) {
            x340Var.i0(-399545909);
            qim0 qim0VarN4 = anm1.N((String) r8sVar.Y, d9y0.k(u291.j(0.0f, f2, 1, u291.v(nim0Var, fD2)), ((Number) o95Var.e()).floatValue()));
            zG2 = x340Var.g(iu30Var);
            objT3 = x340Var.T();
            if (zG2) {
                objT3 = new qzn(iu30Var, (byte) 27);
                x340Var.s0(objT3);
            } else {
                objT3 = new qzn(iu30Var, (byte) 27);
                x340Var.s0(objT3);
            }
            qim0 qim0VarX2 = bin.x(qim0VarN4, false, (String) null, (pm31) null, (idn0) null, (Function0) objT3, 15);
            gfh0 gfh0VarC5 = t1c.c(een.e, false);
            int iHashCode6 = Long.hashCode(x340Var.T);
            xos0 xos0VarM6 = x340Var.m();
            qim0 qim0VarE6 = zr7.E(x340Var, qim0VarX2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC5, x340Var, vu30Var);
            nko1.H(xos0VarM6, x340Var, vu30Var2);
            x0d.q(iHashCode6, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE6, x340Var, vu30Var3);
            aqwVar = (aqw) r8sVar.h;
            if (aqwVar == null) {
                x340Var.i0(1916474553);
                z2 = false;
            } else {
                z2 = false;
                x340Var.i0(338916424);
                aqwVar.a(cx81Var2, (qe41) null, x340Var, 0, 2);
            }
            x340Var.r(z2);
            z = true;
            x340Var.r(true);
            x340Var.r(z2);
        } else {
            x340Var.i0(-399105771);
            x340Var.r(false);
        }
        x340Var.r(z);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0244  */
    /* JADX WARN: Code duplicated, block: B:45:0x0273  */
    /* JADX WARN: Code duplicated, block: B:47:0x02a9  */
    private final Object f(Object obj, Object obj2, Object obj3) {
        x340 x340Var;
        boolean z;
        String strK;
        boolean z2;
        hax haxVar;
        m4c m4cVar;
        boolean zG;
        Object objT;
        int i;
        x340 x340Var2 = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar2 = fkj0.X;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarW = uyn1.w(nim0Var, (vzq0) obj);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var2).b;
        qim0 qim0VarX = uyn1.x(qim0VarW, 16.0f);
        d8t d8tVar = (d8t) this.b;
        t8t t8tVar = d8tVar.c;
        Function0 function0 = (Function0) this.c;
        Function0 function1 = (Function0) this.d;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
        x340 x340Var3 = x340Var2;
        int iHashCode = Long.hashCode(x340Var3.T);
        xos0 xos0VarM = x340Var3.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
        hzj.A.getClass();
        x340 x340Var4 = x340Var2;
        if (x340Var4.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var4.m0();
        if (x340Var4.S) {
            x340Var4.l(hmb0.t1);
        } else {
            x340Var4.v0();
        }
        nko1.H(mbhVarA, x340Var2, y580.O0);
        nko1.H(xos0VarM, x340Var2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
        nko1.F(x340Var2);
        nko1.H(qim0VarE, x340Var2, y580.Y);
        uwo1.e(cwl1.o0(x340Var2, 2131954932), (qim0) null, cbx.d(x340Var2).d, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
        cvx cvxVar2 = cbx.b(x340Var2).b;
        op71.g(x340Var2, u291.h(nim0Var, 8.0f));
        boolean z3 = d8tVar.d;
        String str = t8tVar != null ? t8tVar.a : null;
        if (str == null || !((i = d8tVar.b) == 2 || i == 4)) {
            x340Var = x340Var4;
            z = false;
            strK = x0d.k(x340Var, -63196354, 2131954925, x340Var, false);
        } else {
            x340Var = x340Var4;
            x340Var.i0(-63288300);
            strK = cwl1.n0(2131954926, new Object[]{str}, x340Var);
            z = false;
            x340Var.r(false);
        }
        x340 x340Var5 = x340Var;
        uwo1.e(strK, (qim0) null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
        if (t8tVar == null || !t8tVar.b) {
            z2 = false;
            x340Var5.i0(782903359);
            x340Var5.r(false);
        } else {
            x340Var5.i0(782618903);
            uwo1.e(eqq.n(nim0Var, cbx.b(x340Var2).b.e, x340Var2, 2131954927, x340Var2), (qim0) null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.e, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
            z2 = false;
            x340Var5.r(false);
        }
        op71.g(x340Var2, u291.h((qim0) 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01a6: INVOKE 
              (r14v1 'x340Var2' p.x340)
              (wrap p.qim0:0x01a2: INVOKE 
              (wrap p.qim0:?: CAST (p.qim0) (r24v1 ?? I:??[OBJECT, ARRAY]))
              (wrap float:0x01a0: IGET 
              (wrap p.cvx:0x019e: IGET (wrap p.wux:0x019a: INVOKE (r14v1 'x340Var2' p.x340) STATIC call: p.cbx.b(p.b0k):p.wux A[WRAPPED] (LINE:411)) A[WRAPPED] (LINE:415) p.wux.b p.cvx)
             A[WRAPPED] (LINE:417) p.cvx.b float)
             STATIC call: p.u291.h(p.qim0, float):p.qim0 A[WRAPPED] (LINE:419))
             STATIC call: p.op71.g(p.b0k, p.qim0):void (LINE:423) in method: p.nzd.f(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes7.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v1 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            */
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nzd.f(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        uwr uwrVar = cbx.a;
        cua cuaVar = cbx.b(b0kVar).f;
        cua cuaVar2 = cbx.b(b0kVar).f;
        t890.a(apo.r(-1210924759, new lvt((kvt) this.c, (iu30) this.d, (byte) 1), b0kVar), (iyb) this.b, 0.0f, 0.0f, er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12), 0L, 0L, 8.0f, (vu30) null, false, (xu30) null, u7h.j, 0L, hji.a, b0kVar, 6, 1572864, 48600);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        p0v p0vVar = (p0v) this.b;
        r0v r0vVar = (r0v) this.c;
        qxy0.p(p0vVar, r0vVar != null ? r0vVar.a : null, (iu30) this.d, b0kVar, 0);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        q220 q220Var = (q220) this.b;
        c380<z9v> c380Var = q220Var.c;
        iu30 iu30Var = (iu30) this.c;
        ven0 ven0Var = (ven0) this.d;
        for (z9v z9vVar : c380Var) {
            j2i j2iVarR = apo.r(385431239, new utt(z9vVar, (byte) 9), x340Var);
            x340 x340Var2 = x340Var;
            boolean zG = x340Var2.g(iu30Var) | x340Var2.g(z9vVar) | x340Var2.g(q220Var) | x340Var2.i(ven0Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                jzm jzmVar = new jzm(iu30Var, z9vVar, q220Var, ven0Var, (byte) 8);
                x340Var2.s0(jzmVar);
                objT = jzmVar;
            }
            gt4.b(j2iVarR, (Function0) objT, (qim0) null, (vu30) null, false, (wsi0) null, (vzq0) null, x340Var2, 6, 508);
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        lia1 lia1Var = (lia1) this.b;
        iu30 iu30Var = (iu30) this.c;
        x340 x340Var = (b0k) obj2;
        boolean zG = x340Var.g(iu30Var);
        scx scxVar = (scx) this.d;
        boolean zI = zG | x340Var.i(scxVar);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new wrs(iu30Var, scxVar, (byte) 21);
            x340Var.s0(objT);
        }
        WeakHashMap weakHashMap = osl1.x;
        zdv.b(lia1Var, (iu30) objT, td6.o(lhc.g(x340Var).g, 32, nim0.a), x340Var, 0);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        qvv qvvVar = (qvv) this.b;
        qwv qwvVar = (qwv) this.c;
        iu30 iu30Var = (iu30) this.d;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        qvvVar.c(null, null, ali.c, x340Var, 384);
        qvvVar.a(qwvVar.b.size(), iu30Var, x340Var, 0);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        uwr uwrVar = cbx.a;
        hdh hdhVarN = lnn1.n((vzq0) obj, uyn1.h(1, 0.0f, cbx.b(x340Var).b.c));
        nim0 nim0Var = nim0.a;
        qim0 qim0VarW = uyn1.w(nim0Var, hdhVarN);
        y7e1 y7e1Var = (y7e1) this.b;
        m3w m3wVar = (m3w) this.c;
        iu30 iu30Var = (iu30) this.d;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
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
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        job1 job1Var = m3wVar.c;
        cvx cvxVar = cbx.b(x340Var).b;
        cvx cvxVar2 = cbx.b(x340Var).b;
        cvx cvxVar3 = cbx.b(x340Var).b;
        o2w.e(y7e1Var, job1Var, iu30Var, uyn1.B(nim0Var, 16.0f, 0.0f, 16.0f, 16.0f, 2), x340Var, 0);
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        cvx cvxVar4 = cbx.b(x340Var).b;
        rqo1.g(0, 0, x340Var, uyn1.z(0.0f, 8.0f, 1, qim0VarF));
        lrz0 lrz0Var = m3wVar.e;
        cvx cvxVar5 = cbx.b(x340Var).b;
        o2w.d(lrz0Var, uyn1.x(nim0Var, 16.0f), x340Var, 0);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        rrn1.q(0, ((d6w) this.b).a, (Function0) this.c, (b0k) obj2, (qim0) this.d);
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        ven0 ven0Var = (ven0) this.d;
        kw9 kw9Var = (kw9) this.b;
        if (kw9Var != null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-74389626);
            float f = pap1.A(new p3v(368.0f), new p3v(i2cVar.d()), new p3v(i2cVar.c())).a;
            ax70 ax70VarB = ((v9y) this.c).b();
            String str = ax70VarB != null ? ax70VarB.b : null;
            qim0 qim0VarR = u291.r(nim0.a, f);
            boolean zI = x340Var2.i(ven0Var);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new d7v(ven0Var, (byte) 15);
                x340Var2.s0(objT);
            }
            bof0.d(kw9Var, ern1.x(qim0VarR, (iu30) objT), str, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-73656383);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            ((ck41) this.b).a.c1(i2cVar, Boolean.valueOf(((rk41) this.c).a), Boolean.valueOf(((dyy) this.d).d), x340Var2, Integer.valueOf(iIntValue & 14));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0186  */
    /* JADX WARN: Code duplicated, block: B:52:0x0199  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:73:0x02b5  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v20 java.lang.Object, still in use, count: 2, list:
          (r11v20 java.lang.Object) from 0x0182: PHI (r11 I:??) = (r11v17 java.lang.Object), (r11v20 java.lang.Object) binds: [B:48:0x0181, B:348:0x0182] A[DONT_GENERATE, DONT_INLINE]
          (r11v20 java.lang.Object) from 0x0174: CHECK_CAST (p.acr0) (r11v20 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object invoke(java.lang.Object r46, java.lang.Object r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 3568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nzd.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nzd(Object obj, Object obj2, Object obj3, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzd(j2i j2iVar, xu30 xu30Var, j2i j2iVar2) {
        super(3);
        this.a = (byte) 0;
        this.b = j2iVar;
        this.d = xu30Var;
        this.c = j2iVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzd(scr scrVar, wu61 wu61Var, j2i j2iVar) {
        super(3);
        this.a = (byte) 15;
        this.c = scrVar;
        this.d = wu61Var;
        this.b = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzd(gmt gmtVar, tau tauVar, Context context, View view) {
        super(3);
        this.a = (byte) 20;
        this.b = gmtVar;
        this.c = context;
        this.d = view;
    }
}
