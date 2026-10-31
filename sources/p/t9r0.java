package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.reactivex.rxjava3.core.Flowable;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t9r0 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9r0(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        xfx xfxVar = ((v7t0) this.b).a;
        zmp0 zmp0Var = ((k8t0) obj2).a;
        u7t0 u7t0Var = new u7t0(zmp0Var.a, zmp0Var.c, zmp0Var.b, zmp0Var.d, String.valueOf(zmp0Var.g), String.valueOf(zmp0Var.h));
        qim0 qim0VarA = uyn1.A(anm1.N("plan_details", nim0.a), 16.0f, 8.0f, 16.0f, 8.0f);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new azr0(iu30Var, (byte) 12);
            x340Var2.s0(objT);
        }
        l6o1.l(xfxVar, u7t0Var, qim0VarA, (iu30) objT, x340Var2, 0);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        c9t0 c9t0Var = (c9t0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(c9t0Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            a9t0 a9t0Var = new a9t0(c9t0Var.b, c9t0Var.c, c9t0Var.d, c9t0Var.a, c9t0Var.e);
            boolean z = ((f9t0) this.b).a;
            boolean z2 = (i & 896) == 256;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new g0s0(iu30Var, (byte) 23);
                x340Var2.s0(objT);
            }
            zxo1.l(a9t0Var, z, (Function0) objT, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vbt0 vbt0Var = (vbt0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        tbt0 tbt0Var = vbt0Var.f;
        lax laxVar = vbt0Var.g;
        zbt0 zbt0Var = (zbt0) this.b;
        boolean zG = zbt0Var.c.b.g();
        nim0 nim0Var = nim0.a;
        if (!zG || u890.j(Build.MANUFACTURER, "Amazon")) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-8939144);
            String str = vbt0Var.a;
            if5 if5VarE = zbt0.e(tbt0Var, x340Var2);
            Integer num = vbt0Var.e;
            max maxVarZ = mmo1.z(laxVar, x340Var2);
            boolean zI = x340Var2.i(zbt0Var);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new wbt0(zbt0Var, (byte) 3);
                x340Var2.s0(objT);
            }
            qim0 qim0VarQ = m0p1.q(nim0Var, laxVar, (iu30) objT);
            boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT2 = x340Var2.T();
            if (z || objT2 == m4cVar) {
                objT2 = new g0s0(iu30Var, (byte) 25);
                x340Var2.s0(objT2);
            }
            cyo1.i(str, if5VarE, num, (Function0) objT2, qim0VarQ, maxVarZ, x340Var2, 64);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-9481241);
            String str2 = vbt0Var.a;
            if5 if5VarE2 = zbt0.e(tbt0Var, x340Var3);
            Integer num2 = vbt0Var.e;
            String str3 = vbt0Var.b;
            Instant instant = vbt0Var.c;
            max maxVarZ2 = mmo1.z(laxVar, x340Var3);
            boolean zI2 = x340Var3.i(zbt0Var);
            Object objT3 = x340Var3.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new wbt0(zbt0Var, (byte) 2);
                x340Var3.s0(objT3);
            }
            qim0 qim0VarQ2 = m0p1.q(nim0Var, laxVar, (iu30) objT3);
            boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT4 = x340Var3.T();
            if (z2 || objT4 == m4cVar) {
                objT4 = new g0s0(iu30Var, (byte) 24);
                x340Var3.s0(objT4);
            }
            byo1.g(if5VarE2, str2, str3, instant, num2, (Function0) objT4, qim0VarQ2, maxVarZ2, x340Var3, 8);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        ((gft0) this.b).e((vet0) obj2, (iu30) obj3, (b0k) obj4, (iIntValue >> 3) & 126);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        ((rit0) this.b).f((lit0) obj2, (iu30) obj3, (b0k) obj4, (iIntValue >> 3) & 126);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iot0 iot0Var = (iot0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        lot0 lot0Var = (lot0) this.b;
        if (lot0Var.b.f() && lot0Var.c.d() && !iot0Var.c) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1639543388);
            v6y0 v6y0Var = iot0Var.b;
            if (v6y0Var == null) {
                x340Var2.i0(-713762523);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-713762522);
                int i = iot0Var.a;
                boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT = x340Var2.T();
                if (z || objT == fkj0.X) {
                    objT = new smt0(iu30Var, (byte) 5);
                    x340Var2.s0(objT);
                }
                i1p1.l(i, v6y0Var, (Function0) objT, x340Var2, 0);
                x340Var2.r(false);
            }
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-713547971);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        tob1 tob1VarH;
        lsm0 lsm0Var;
        tob1 tob1Var;
        Boolean bool;
        mqt0 mqt0Var;
        boolean z;
        ksw kswVar = (ksw) obj;
        lqt0 lqt0Var = (lqt0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        mqt0 mqt0Var2 = (mqt0) this.b;
        String str = lqt0Var.c;
        if ((iIntValue & 6) == 0) {
            i = (x340Var.g(kswVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.g(lqt0Var) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i2 = i;
        x340 x340Var2 = x340Var;
        if (!x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var2.b0();
        } else if (str.length() != 0) {
            Object objT = x340Var2.T();
            Object obj6 = fkj0.X;
            if (objT == obj6) {
                objT = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == obj6) {
                objT2 = ((ttm0) mqt0Var2.c.get()).c(false);
                x340Var2.s0(objT2);
            }
            zau0 zau0Var = (zau0) objT2;
            tob1 tob1VarB = qxy0.B(zau0Var, x340Var2);
            ven0 ven0VarH = rwq.h(zau0Var.b, x340Var2, 0);
            r091 r091Var = (r091) tob1VarB.getValue();
            bpb1 bpb1Var = r091Var != null ? r091Var.g : null;
            if (bpb1Var == null) {
                x340Var2.i0(245881797);
                x340Var2.r(false);
                tob1VarH = null;
            } else {
                x340Var2.i0(1254857660);
                tob1VarH = rwq.h(bpb1Var, x340Var2, 0);
                x340Var2.r(false);
            }
            boolean zG = x340Var2.g(tob1VarH != null ? (i091) tob1VarH.getValue() : null);
            Object objT3 = x340Var2.T();
            if (zG || objT3 == obj6) {
                i091 i091Var = tob1VarH != null ? (i091) tob1VarH.getValue() : null;
                objT3 = Boolean.valueOf(u890.j((i091Var == null || (lsm0Var = i091Var.a) == null) ? null : lsm0Var.a, str) && (ebp1.q(i091Var) || u890.j(i091Var.h, j091.a)) && !i091Var.g);
                x340Var2.s0(objT3);
            }
            boolean zBooleanValue = ((Boolean) objT3).booleanValue();
            tl7 tl7Var = (tl7) mqt0Var2.d.get();
            boolean zI = x340Var2.i(mqt0Var2) | x340Var2.i(zau0Var);
            Object objT4 = x340Var2.T();
            if (zI || objT4 == obj6) {
                objT4 = new shq0(mqt0Var2, zau0Var, (byte) 29);
                x340Var2.s0(objT4);
            }
            i1o1.b(kswVar, tl7Var, "ShareableCardPreview", (Function0) null, (Function0) objT4, x340Var2, (i2 & 14) | 384, 4);
            Boolean bool2 = (Boolean) ven0VarH.getValue();
            bool2.getClass();
            r091 r091Var2 = (r091) tob1VarB.getValue();
            boolean zG2 = x340Var2.g(ven0VarH) | x340Var2.g(tob1VarB) | x340Var2.i(mqt0Var2) | ((i2 & 112) == 32) | x340Var2.i(c9nVar);
            Object objT5 = x340Var2.T();
            if (zG2 || objT5 == obj6) {
                tob1Var = tob1VarB;
                bool = bool2;
                mqt0Var = mqt0Var2;
                ur1 ur1Var = new ur1(ven0VarH, tob1Var, mqt0Var, lqt0Var, c9nVar, (lnm) null);
                x340Var2.s0(ur1Var);
                objT5 = ur1Var;
            } else {
                bool = bool2;
                tob1Var = tob1VarB;
                mqt0Var = mqt0Var2;
            }
            qxd0.s(bool, r091Var2, (vu30) objT5, x340Var2);
            boolean zH = ((i2 & 896) == 256) | x340Var2.h(zBooleanValue) | x340Var2.g(tob1Var) | x340Var2.i(mqt0Var) | x340Var2.i(zau0Var);
            Object objT6 = x340Var2.T();
            if (zH || objT6 == obj6) {
                objT6 = new g96(iu30Var, zBooleanValue, mqt0Var, zau0Var, tob1Var);
                z = zBooleanValue;
                x340Var2.s0(objT6);
            } else {
                z = zBooleanValue;
            }
            n1p1.f(0, (Function0) objT6, x340Var2, (qim0) null, z);
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        rle1 rle1Var;
        tqt0 tqt0Var = (tqt0) obj2;
        ((Number) obj5).intValue();
        x340 x340Var = (b0k) obj4;
        Resources resources = ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getResources();
        gix0 gix0Var = tqt0Var.b;
        sqt0 sqt0Var = tqt0Var.a;
        Long l = sqt0Var.a;
        boolean zG = x340Var.g(gix0Var) | x340Var.g(l);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            if (gix0Var instanceof hix0) {
                resources.getClass();
                ogv ogvVar = new ogv(resources, (byte) 1);
                ytw0 ytw0Var = jfv.b;
                rle1Var = (rle1) ogvVar.invoke(new jfv(fdg1.l0(l != null ? l.longValue() : 0L, ngv.e)));
            } else {
                if (!(gix0Var instanceof gix0)) {
                    eg.o();
                    return null;
                }
                resources.getClass();
                ogv ogvVar2 = new ogv(resources, (byte) 0);
                ytw0 ytw0Var2 = jfv.b;
                gix0 gix0Var2 = gix0Var;
                rle1Var = (rle1) ogvVar2.invoke(new jfv(fdg1.l0(gix0Var2.b - gix0Var2.c, ngv.d)));
            }
            objT = rle1Var.a;
            x340Var.s0(objT);
        }
        String str = (String) objT;
        fra fraVar = een.N0;
        ngs0 ngs0Var = (ngs0) this.b;
        jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
        nko1.H(jw31VarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        if (str.length() > 0) {
            x340Var.i0(-846508814);
            uwr uwrVar = cbx.a;
            uwo1.e(str, uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            x340Var.r(false);
        } else {
            x340Var.i0(-846364416);
            x340Var.r(false);
        }
        otw.c((xgx0) ngs0Var.d, new vgx0(sqt0Var.b, 56.0f), (qim0) null, (ipb1) null, x340Var, 8, 12);
        x340Var.r(true);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        evt0 evt0Var = (evt0) this.b;
        s1p1.n((cvt0) obj2, (hft0) evt0Var.f.getValue(), evt0Var.c, evt0Var.d, (hjv0) evt0Var.e.getValue(), (iu30) obj3, (qim0) null, (b0k) obj4, ((iIntValue >> 3) & 14) | 32768 | ((iIntValue << 9) & 458752));
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        ovt0 ovt0Var = (ovt0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        if (ovt0Var instanceof mvt0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-463859052);
            mod.b(oi7.a.a((gw70) ((nm1) this.b).f), apo.r(-2114902311, new hws0(ovt0Var, iu30Var, (byte) 8), x340Var2), x340Var2, 56);
            x340Var2.r(false);
        } else {
            if (!ovt0Var.equals(nvt0.a)) {
                throw p3d1.k(x340Var, 1370508946, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(-463683437);
            m6p1.c(0, 1, x340Var3, (qim0) null);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        f5p1.e((xju0) obj2, (iu30) obj3, ((cku0) this.b).a, (b0k) obj4, (iIntValue >> 3) & 126);
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        aou0 aou0Var = (aou0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        hou0 hou0Var = (hou0) this.b;
        if (aou0Var.a == null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-344111149);
            hou0Var.j((qim0) null, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-344064308);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, nim0.a);
            hzj.A.getClass();
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
            nko1.H(mbhVarA, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            boolean z = ((Configuration) x340Var3.k(AndroidCompositionLocals_androidKt.a)).orientation == 2;
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(x340Var3).c;
            fq7.b(pbh.a, (z && (u85Var.e().d > 0)) ? false : true, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(715395107, new hho0(hou0Var, aou0Var, iu30Var, (byte) 6), x340Var3), x340Var3, 1572870, 30);
            hou0Var.g(aou0Var, iu30Var, x340Var3, (iIntValue >> 3) & 126);
            x340Var3.r(true);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:204:0x06f2  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        boolean z;
        Integer numValueOf;
        Integer num;
        String strK;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                lp61 lp61Var = (lp61) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                int i = (iIntValue & 48) == 0 ? iIntValue | (x340Var.g(lp61Var) ? 32 : 16) : iIntValue;
                if ((iIntValue & 384) == 0) {
                    i |= x340Var.i(iu30Var) ? 256 : 128;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
                    Integer num2 = (Integer) lp61Var.d;
                    if (num2 == null) {
                        num2 = (Integer) lp61Var.c;
                    }
                    String strB = lp61Var.b(x340Var2);
                    if5 if5Var = (if5) lp61Var.g.getValue();
                    x340Var2.i0(-394346925);
                    List<qxm0> list = lp61Var.f.a;
                    u9r0 u9r0Var = (u9r0) obj6;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    for (qxm0 qxm0Var : list) {
                        boolean z2 = num2 != null && qxm0Var.a == num2.intValue();
                        String strO0 = cwl1.o0(x340Var2, 2131961698);
                        int i2 = i & 896;
                        boolean zI = (i2 == 256) | x340Var2.i(qxm0Var);
                        Object objT = x340Var2.T();
                        if (zI || objT == m4cVar) {
                            objT = new shq0((byte) 5, qxm0Var, iu30Var);
                            x340Var2.s0(objT);
                        }
                        Function0 function0 = (Function0) objT;
                        if (ihc1.y0(strO0)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return null;
                        }
                        gbx gbxVar = new gbx(new y50(strO0), function0);
                        boolean z3 = i2 == 256;
                        Object objT2 = x340Var2.T();
                        if (z3 || objT2 == m4cVar) {
                            objT2 = new wck0(iu30Var, (byte) 24);
                            x340Var2.s0(objT2);
                        }
                        iu30 iu30Var2 = (iu30) objT2;
                        iax iaxVar = (lax) lp61Var.e.get(Integer.valueOf(qxm0Var.a));
                        if (iaxVar == null) {
                            iaxVar = iax.a;
                        }
                        iax iaxVar2 = iaxVar;
                        boolean z4 = u9r0Var.a;
                        String strU = zmo1.u(qxm0Var.b, qxm0Var.c, x340Var2);
                        strU.getClass();
                        if5 if5Var2 = new if5(qxm0Var.d, (String) null, qxm0Var.e, (hf5) null, 8);
                        String strU2 = zmo1.u((Integer) null, (String) null, x340Var2);
                        wxm0 wxm0Var = qxm0Var.g;
                        if (wxm0Var != null) {
                            z = z4;
                            boolean z5 = wxm0Var.a;
                            arrayList.add(new zxm0(strU, if5Var2, strU2, z2, gbxVar, iu30Var2, iaxVar2, z5, z));
                        } else {
                            z = z4;
                        }
                        arrayList.add(new zxm0(strU, if5Var2, strU2, z2, gbxVar, iu30Var2, iaxVar2, z5, z));
                    }
                    x340Var2.r(false);
                    c921.h(strB, if5Var, mqo1.A(arrayList), (qim0) null, (if5) lp61Var.h.getValue(), lp61Var.b, false, x340Var2, 33344, 72);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                dmr0 dmr0Var = (dmr0) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                gw70 gw70Var = (gw70) ((ug3) obj6).c;
                boolean z6 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var3.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                x340 x340Var4 = x340Var3;
                Object objT3 = x340Var4.T();
                if (z6 || objT3 == fkj0.X) {
                    objT3 = new dgq0(iu30Var3, (byte) 15);
                    x340Var4.s0(objT3);
                }
                y2o1.b(dmr0Var, gw70Var, (Function0) objT3, x340Var4, (iIntValue2 >> 3) & 14);
                return rih1Var;
            case 2:
                axr0 axr0Var = (axr0) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                bxr0 bxr0Var = axr0Var.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                boolean z7 = axr0Var.b;
                pm31 pm31Var = new pm31(2);
                boolean z8 = (((iIntValue3 & 896) ^ 384) > 256 && x340Var5.g(iu30Var4)) || (iIntValue3 & 384) == 256;
                x340 x340Var6 = x340Var5;
                Object objT4 = x340Var6.T();
                j06 j06Var = x340Var6.a;
                if (z8 || objT4 == m4cVar2) {
                    objT4 = new wck0(iu30Var4, (byte) 29);
                    x340Var6.s0(objT4);
                }
                qim0 qim0VarD = qmo1.D(qim0VarF, z7, false, pm31Var, (iu30) objT4, 10);
                Object objT5 = x340Var6.T();
                if (objT5 == m4cVar2) {
                    objT5 = wvr0.h;
                    x340Var6.s0(objT5);
                }
                qim0 qim0VarN = anm1.N(bxr0Var.name().toLowerCase(Locale.ROOT).concat("_parental_control_toggle_row"), s161.b(qim0VarD, true, (iu30) objT5));
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var6).b;
                qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarN);
                cxr0 cxr0Var = (cxr0) obj6;
                era eraVar = een.P0;
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var6, 0);
                int iHashCode = Long.hashCode(x340Var6.T);
                xos0 xos0VarM = x340Var6.m();
                qim0 qim0VarE = zr7.E(x340Var6, qim0VarZ);
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
                nko1.H(mbhVarA, x340Var6, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var6, lljVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf2, x340Var6, lljVar3);
                nko1.F(x340Var6);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var6, lljVar4);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var6, 0);
                int iHashCode2 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM2 = x340Var6.m();
                qim0 qim0VarE2 = zr7.E(x340Var6, qim0VarF2);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(jw31VarA, x340Var6, lljVar);
                nko1.H(xos0VarM2, x340Var6, lljVar2);
                x0d.q(iHashCode2, x340Var6, lljVar3, x340Var6);
                wnb0 wnb0VarQ = kk0.q(x340Var6, qim0VarE2, lljVar4, 1.0f, true);
                cvx cvxVar2 = cbx.b(x340Var6).b;
                qim0 qim0VarB = uyn1.B(wnb0VarQ, 0.0f, 0.0f, 12.0f, 0.0f, 11);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var6, 0);
                int iHashCode3 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM3 = x340Var6.m();
                qim0 qim0VarE3 = zr7.E(x340Var6, qim0VarB);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA2, x340Var6, lljVar);
                nko1.H(xos0VarM3, x340Var6, lljVar2);
                x0d.q(iHashCode3, x340Var6, lljVar3, x340Var6);
                nko1.H(qim0VarE3, x340Var6, lljVar4);
                cxr0Var.g(bxr0Var, (qim0) null, x340Var6, 0);
                cxr0Var.f(bxr0Var, x340Var6, 0);
                x340Var6.r(true);
                ljo1.j(axr0Var.b, (iu30) null, (qim0) null, false, hxo1.m(cbx.a(x340Var6).b.a, f0o1.q(cxr0Var.a, x340Var6), cbx.a(x340Var6).b.b, cbx.a(x340Var6).a.b.a(), cbx.a(x340Var6).b.b, x340Var6, 65420), (idn0) null, x340Var6, 48, 92);
                x340Var6.r(true);
                x340Var6.r(true);
                return rih1Var;
            case 3:
                xxr0 xxr0Var = (xxr0) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                int iC = l1d.C(xxr0Var.l);
                if (iC == 0) {
                    x340 x340Var8 = x340Var7;
                    x340Var8.i0(-1808438816);
                    hyr0.c(xxr0Var, x340Var8, (iIntValue4 >> 3) & 14);
                    x340Var8.r(false);
                } else if (iC == 1) {
                    x340 x340Var9 = x340Var7;
                    x340Var9.i0(-1808437282);
                    hyr0.b(xxr0Var, (j2i) obj6, iu30Var5, x340Var9, (iIntValue4 & 896) | ((iIntValue4 >> 3) & 14));
                    x340Var9.r(false);
                } else {
                    if (iC != 2) {
                        throw p3d1.k(x340Var7, -1808440561, false);
                    }
                    x340 x340Var10 = x340Var7;
                    x340Var10.i0(-1808434861);
                    x340Var10.r(false);
                }
                return rih1Var;
            case 4:
                e0s0 e0s0Var = (e0s0) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var11 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                r8s r8sVar = (r8s) obj6;
                int i3 = (iIntValue5 & 48) == 0 ? iIntValue5 | (x340Var11.g(e0s0Var) ? 32 : 16) : iIntValue5;
                if ((iIntValue5 & 384) == 0) {
                    i3 |= x340Var11.i(iu30Var6) ? 256 : 128;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    los losVar = (los) r8sVar.f;
                    int i4 = i3 & 896;
                    boolean z9 = i4 == 256;
                    Object objT6 = x340Var12.T();
                    if (z9 || objT6 == m4cVar3) {
                        objT6 = new g0s0(iu30Var6, (byte) 0);
                        x340Var12.s0(objT6);
                    }
                    Function0 function1 = (Function0) objT6;
                    boolean z10 = i4 == 256;
                    Object objT7 = x340Var12.T();
                    if (z10 || objT7 == m4cVar3) {
                        objT7 = new g0s0(iu30Var6, (byte) 1);
                        x340Var12.s0(objT7);
                    }
                    i9p1.k(losVar, function1, (Function0) objT7, x340Var12, 0);
                    smo1.j(e0s0Var, (pkp) r8sVar.e, (b7b) r8sVar.g, iu30Var6, x340Var12, ((i3 >> 3) & 14) | ((i3 << 3) & 7168));
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 5:
                c2s0 c2s0Var = (c2s0) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                lax laxVar = c2s0Var.g;
                boolean z11 = c2s0Var.e;
                l2s0 l2s0Var = c2s0Var.f;
                h2s0 h2s0Var = c2s0Var.d;
                String str = c2s0Var.a;
                u1s0 u1s0Var = new u1s0(c2s0Var.c);
                uqo uqoVar = c2s0Var.b;
                String strU3 = zmo1.u(uqoVar.a, uqoVar.b, x340Var13);
                if (strU3 == null) {
                    strU3 = "";
                }
                String str2 = strU3;
                if5 if5VarO = tro1.o(uqoVar);
                if (l2s0Var instanceof k2s0) {
                    numValueOf = null;
                } else if (!z11) {
                    numValueOf = 2131961864;
                } else if (l2s0Var instanceof i2s0) {
                    numValueOf = Integer.valueOf((h2s0Var == null || (num = h2s0Var.b) == null) ? 2131961862 : num.intValue());
                } else if (l2s0Var instanceof j2s0) {
                    numValueOf = Integer.valueOf(h2s0Var != null ? h2s0Var.a.intValue() : 2131961861);
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    x340 x340Var14 = x340Var13;
                    x340Var14.i0(-1147738948);
                    x340Var14.r(false);
                    strK = null;
                } else {
                    x340 x340Var15 = x340Var13;
                    strK = kk0.k(x340Var15, -1147738947, numValueOf, x340Var15, false);
                }
                lax gaxVar = laxVar instanceof gax ? laxVar : (z11 && (l2s0Var instanceof i2s0)) ? new gax((Integer) null, ((Context) ((yup0) obj6).c).getString(2131961863)) : iax.a;
                x340 x340Var16 = x340Var13;
                int i5 = (iIntValue6 & 896) ^ 384;
                boolean zI2 = x340Var16.i(c2s0Var) | ((i5 > 256 && x340Var16.g(iu30Var7)) || (iIntValue6 & 384) == 256);
                Object objT8 = x340Var16.T();
                if (zI2 || objT8 == m4cVar4) {
                    objT8 = new shq0(c2s0Var, iu30Var7, (byte) 15);
                    x340Var16.s0(objT8);
                }
                Function0 function2 = (Function0) objT8;
                boolean z12 = (i5 > 256 && x340Var16.g(iu30Var7)) || (iIntValue6 & 384) == 256;
                Object objT9 = x340Var16.T();
                if (z12 || objT9 == m4cVar4) {
                    objT9 = new azr0(iu30Var7, (byte) 1);
                    x340Var16.s0(objT9);
                }
                iu30 iu30Var8 = (iu30) objT9;
                boolean z13 = (i5 > 256 && x340Var16.g(iu30Var7)) || (iIntValue6 & 384) == 256;
                Object objT10 = x340Var16.T();
                if (z13 || objT10 == m4cVar4) {
                    objT10 = new azr0(iu30Var7, (byte) 2);
                    x340Var16.s0(objT10);
                }
                bno1.f(str, u1s0Var, str2, if5VarO, strK, function2, iu30Var8, (iu30) objT10, (qim0) null, gaxVar, laxVar, x340Var16, 4096, 256);
                return rih1Var;
            case 6:
                tgs0 tgs0Var = (ugs0) obj2;
                x340 x340Var17 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                if (tgs0Var instanceof sgs0) {
                    x340 x340Var18 = x340Var17;
                    x340Var18.i0(1890484164);
                    x340Var18.r(false);
                } else {
                    if (!(tgs0Var instanceof tgs0)) {
                        throw p3d1.k(x340Var17, 2139192264, false);
                    }
                    x340 x340Var19 = x340Var17;
                    x340Var19.i0(1890515908);
                    smp0 smp0Var = (smp0) obj6;
                    mqo1.h(tgs0Var, (pjp) smp0Var.c, (lbl0) smp0Var.d, x340Var19, (iIntValue7 >> 3) & 14);
                    x340Var19.r(false);
                }
                return rih1Var;
            case 7:
                ((Number) obj5).intValue();
                ahs0 ahs0Var = (ahs0) obj6;
                oqo1.e(ahs0Var.a, ahs0Var.b, ahs0Var.c, (qim0) null, (b0k) obj4, 0);
                return rih1Var;
            case 8:
                nis0 nis0Var = (nis0) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (nis0Var.b) {
                    x340 x340Var21 = x340Var20;
                    x340Var21.i0(-1502758701);
                    qim0 qim0VarR = u291.r(nim0Var, 1.0f);
                    Object objT11 = x340Var21.T();
                    if (objT11 == fkj0.X) {
                        objT11 = egs0.t;
                        x340Var21.s0(objT11);
                    }
                    op71.g(x340Var21, s161.a(qim0VarR, (iu30) objT11));
                    nyx.a(2, (wux) null, apo.r(-505930312, new tbs0(nis0Var, iu30Var9, (pt) obj6, (byte) 3), x340Var21), x340Var21, 3078, 6);
                    x340Var21.r(false);
                } else {
                    x340 x340Var22 = x340Var20;
                    x340Var22.i0(-1502012004);
                    x340Var22.r(false);
                }
                return rih1Var;
            case 9:
                vms0 vms0Var = (vms0) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                svh0 svh0Var = (svh0) ((yxb0) obj6).f;
                boolean z14 = (((iIntValue8 & 896) ^ 384) > 256 && x340Var23.g(iu30Var10)) || (iIntValue8 & 384) == 256;
                x340 x340Var24 = x340Var23;
                Object objT12 = x340Var24.T();
                if (z14 || objT12 == fkj0.X) {
                    objT12 = new azr0(iu30Var10, (byte) 5);
                    x340Var24.s0(objT12);
                }
                vzn1.c(svh0Var, (iu30) objT12, apo.r(-597130408, new jyo0(vms0Var, iu30Var10, (byte) 28), x340Var24), x340Var24, 392);
                return rih1Var;
            case 10:
                bss0 bss0Var = (bss0) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                int iIntValue9 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                x340 x340Var25 = (b0k) obj4;
                g431 g431VarH = ((cir0) x340Var25.k(k2r0.a)).h();
                ven0 ven0VarS = v8r.s(iu30Var11, x340Var25);
                boolean zG = x340Var25.g(g431VarH);
                Object objT13 = x340Var25.T();
                if (zG || objT13 == m4cVar5) {
                    objT13 = g431VarH.a(uj1.p, new yw1(ven0VarS, (byte) 4));
                    x340Var25.s0(objT13);
                }
                b431 b431Var = (b431) objT13;
                et90 et90Var = (et90) obj6;
                p40 p40Var = (p40) et90Var.c;
                hz5 hz5Var = (hz5) et90Var.e;
                boolean z15 = (((iIntValue9 & 896) ^ 384) > 256 && x340Var25.g(iu30Var11)) || (iIntValue9 & 384) == 256;
                Object objT14 = x340Var25.T();
                if (z15 || objT14 == m4cVar5) {
                    objT14 = new g0s0(iu30Var11, (byte) 13);
                    x340Var25.s0(objT14);
                }
                Function0 function3 = (Function0) objT14;
                boolean zI3 = x340Var25.i(b431Var);
                Object objT15 = x340Var25.T();
                if (zI3 || objT15 == m4cVar5) {
                    objT15 = new w3i0(b431Var, (byte) 1);
                    x340Var25.s0(objT15);
                }
                jto1.j(bss0Var, p40Var, hz5Var, function3, (iu30) objT15, (qim0) null, x340Var25, ((iIntValue9 >> 3) & 14) | 48);
                return rih1Var;
            case 11:
                rus0 rus0Var = (rus0) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var26 = (b0k) obj4;
                ((Number) obj5).intValue();
                uus0 uus0Var = (uus0) obj6;
                if (rus0Var.h) {
                    x340 x340Var27 = x340Var26;
                    x340Var27.i0(417583506);
                    mod.b(oi7.a.a(uus0Var.d), apo.r(-1324029053, new tbs0(rus0Var, iu30Var12, uus0Var, (byte) 5), x340Var27), x340Var27, 56);
                    x340Var27.r(false);
                } else {
                    x340 x340Var28 = x340Var26;
                    x340Var28.i0(418154340);
                    x340Var28.r(false);
                }
                return rih1Var;
            case 12:
                nvs0 nvs0Var = (nvs0) obj6;
                xto1.o((ovs0) obj2, nvs0Var.a, nvs0Var.b, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 13:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((iws0) obj6).a), apo.r(-28349880, new hws0((fws0) obj2, (iu30) obj3, (byte) 0), b0kVar), b0kVar, 56);
                return rih1Var;
            case 14:
                kxs0 kxs0Var = (kxs0) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                smp0 smp0Var2 = (smp0) obj6;
                boolean z16 = (((iIntValue10 & 896) ^ 384) > 256 && x340Var29.g(iu30Var13)) || (iIntValue10 & 384) == 256;
                x340 x340Var30 = x340Var29;
                boolean zI4 = x340Var30.i(smp0Var2) | z16;
                Object objT16 = x340Var30.T();
                if (zI4 || objT16 == fkj0.X) {
                    objT16 = new shq0((byte) 22, smp0Var2, iu30Var13);
                    x340Var30.s0(objT16);
                }
                gbx gbxVar2 = new gbx(z50.c, (Function0) objT16);
                idx idxVar = new idx();
                gdx gdxVarR = yla.r(x340Var30);
                uwr uwrVar2 = cbx.a;
                float f = cbx.b(x340Var30).b.c;
                cvx cvxVar3 = cbx.b(x340Var30).b;
                gdx gdxVarB = gdx.b(gdxVarR, new zzq0(f, 8.0f, f, 8.0f), 0.0f, 0.0f, 0.0f, 62);
                cvx cvxVar4 = cbx.b(x340Var30).b;
                foo1.c(gbxVar2, idxVar, anm1.N("allboarding_picker_primary_button", uyn1.z(16.0f, 0.0f, 2, nim0Var)), (max) null, gdxVarB, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(348906155, new nso0(kxs0Var, (byte) 28), x340Var30), x340Var30, 0, 48, 2008);
                return rih1Var;
            case 15:
                oxs0 oxs0Var = (oxs0) obj2;
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var31 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                kls0 kls0Var = (kls0) obj6;
                boolean z17 = (((iIntValue11 & 896) ^ 384) > 256 && x340Var31.g(iu30Var14)) || (iIntValue11 & 384) == 256;
                x340 x340Var32 = x340Var31;
                boolean zI5 = x340Var32.i(kls0Var) | z17;
                Object objT17 = x340Var32.T();
                if (zI5 || objT17 == fkj0.X) {
                    objT17 = new shq0((byte) 23, kls0Var, iu30Var14);
                    x340Var32.s0(objT17);
                }
                gbx gbxVar3 = new gbx(z50.c, (Function0) objT17);
                ldx ldxVar = ldx.c;
                gdx gdxVarR2 = yla.r(x340Var32);
                uwr uwrVar3 = cbx.a;
                float f2 = cbx.b(x340Var32).b.c;
                cvx cvxVar5 = cbx.b(x340Var32).b;
                gdx gdxVarB2 = gdx.b(gdxVarR2, new zzq0(f2, 8.0f, f2, 8.0f), 0.0f, 0.0f, 0.0f, 62);
                qim0 qim0VarN2 = anm1.N("allboarding_picker_secondary_button", nim0Var);
                cvx cvxVar6 = cbx.b(x340Var32).b;
                cvx cvxVar7 = cbx.b(x340Var32).b;
                cvx cvxVar8 = cbx.b(x340Var32).b;
                foo1.c(gbxVar3, ldxVar, uyn1.B(qim0VarN2, 16.0f, 8.0f, 16.0f, 0.0f, 8), (max) null, gdxVarB2, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1360723947, new nso0(oxs0Var, (byte) 29), x340Var32), x340Var32, 0, 48, 2008);
                return rih1Var;
            case 16:
                j3t0 j3t0Var = (j3t0) obj2;
                iu30 iu30Var15 = (iu30) obj3;
                x340 x340Var33 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                m4c m4cVar6 = fkj0.X;
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                yup0 yup0Var = (yup0) obj6;
                mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var33, 0);
                x340 x340Var34 = x340Var33;
                int iHashCode4 = Long.hashCode(x340Var34.T);
                xos0 xos0VarM4 = x340Var34.m();
                qim0 qim0VarE4 = zr7.E(x340Var33, qim0VarF3);
                hzj.A.getClass();
                x340 x340Var35 = x340Var33;
                if (x340Var35.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var35.m0();
                if (x340Var35.S) {
                    x340Var35.l(n4kVar);
                } else {
                    x340Var35.v0();
                }
                nko1.H(mbhVarA3, x340Var33, y580.O0);
                nko1.H(xos0VarM4, x340Var33, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var33, y580.R0);
                nko1.F(x340Var33);
                nko1.H(qim0VarE4, x340Var33, y580.Y);
                qim0 qim0VarN3 = anm1.N("pip_setting_element_setting_row", nim0Var);
                String strO1 = cwl1.o0(x340Var33, 2131959758);
                int i6 = (iIntValue12 & 896) ^ 384;
                boolean z18 = ((((iIntValue12 & 112) ^ 48) > 32 && x340Var35.g(j3t0Var)) || (iIntValue12 & 48) == 32) | ((i6 > 256 && x340Var35.g(iu30Var15)) || (iIntValue12 & 384) == 256);
                Object objT18 = x340Var35.T();
                if (z18 || objT18 == m4cVar6) {
                    objT18 = new shq0(j3t0Var, iu30Var15, (byte) 25);
                    x340Var35.s0(objT18);
                }
                Function0 function4 = (Function0) objT18;
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                jto1.b(qim0VarN3, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO1), function4), (gbx) null, q7j.a, (xu30) null, (xu30) null, q7j.b, apo.r(-1112164435, new ukm0(j3t0Var, iu30Var15, (byte) 22), x340Var33), (xu30) null, (xu30) null, q7j.c, x340Var33, 100663296, 197040, 26302);
                if (j3t0Var.b) {
                    x340Var35.i0(-1240260964);
                    qim0 qim0VarZ2 = uyn1.z(14.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
                    boolean z19 = (i6 > 256 && x340Var35.g(iu30Var15)) || (iIntValue12 & 384) == 256;
                    Object objT19 = x340Var35.T();
                    if (z19 || objT19 == m4cVar6) {
                        objT19 = new g0s0(iu30Var15, (byte) 22);
                        x340Var35.s0(objT19);
                    }
                    yup0Var.e(0, (Function0) objT19, x340Var33, qim0VarZ2);
                    x340Var35.r(false);
                } else {
                    x340Var35.i0(-1240076452);
                    x340Var35.r(false);
                }
                x340Var35.r(true);
                return rih1Var;
            case 17:
                return a(obj, obj2, obj3, obj4, obj5);
            case 18:
                return d(obj, obj2, obj3, obj4, obj5);
            case 19:
                return e(obj, obj2, obj3, obj4, obj5);
            case 20:
                return f(obj, obj2, obj3, obj4, obj5);
            case 21:
                return g(obj, obj2, obj3, obj4, obj5);
            case 22:
                return h(obj, obj2, obj3, obj4, obj5);
            case 23:
                return i(obj, obj2, obj3, obj4, obj5);
            case 24:
                return j(obj, obj2, obj3, obj4, obj5);
            case 25:
                return k(obj, obj2, obj3, obj4, obj5);
            case 26:
                return m(obj, obj2, obj3, obj4, obj5);
            case 27:
                return n(obj, obj2, obj3, obj4, obj5);
            case 28:
                return o(obj, obj2, obj3, obj4, obj5);
            default:
                oqu0 oqu0Var = (oqu0) obj2;
                iu30 iu30Var16 = (iu30) obj3;
                x340 x340Var36 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                String str3 = oqu0Var.a;
                if (oqu0Var.e) {
                    x340 x340Var37 = x340Var36;
                    x340Var37.i0(-83329056);
                    squ0.b(0, "playlist_preview_track_row:" + str3 + ":loading", x340Var37, (qim0) null);
                    x340Var37.r(false);
                } else {
                    x340 x340Var38 = x340Var36;
                    x340Var38.i0(-83222695);
                    Flowable flowable = ((rqu0) obj6).a;
                    vbm[] vbmVarArr = q601.a;
                    kge kgeVar = new kge(flowable);
                    String strF = f4i1.f("playlist_preview_track_row:", str3, ":content");
                    boolean z20 = ((((iIntValue13 & 896) ^ 384) > 256 && x340Var38.g(iu30Var16)) || (iIntValue13 & 384) == 256) | ((((iIntValue13 & 112) ^ 48) > 32 && x340Var38.g(oqu0Var)) || (iIntValue13 & 48) == 32);
                    Object objT20 = x340Var38.T();
                    if (z20 || objT20 == fkj0.X) {
                        objT20 = new wpu0(iu30Var16, oqu0Var, (byte) 2);
                        x340Var38.s0(objT20);
                    }
                    squ0.a(oqu0Var, kgeVar, strF, (Function0) objT20, (qim0) null, x340Var38, (iIntValue13 >> 3) & 14);
                    x340Var38.r(false);
                }
                return rih1Var;
        }
    }
}
