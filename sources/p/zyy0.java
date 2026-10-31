package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zyy0 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zyy0(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x340 x340Var;
        tsz0 tsz0Var = (tsz0) obj2;
        x340 x340Var2 = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var2).b;
        qim0 qim0VarD = l6o1.D(uyn1.z(16.0f, 0.0f, 2, qim0VarF), l6o1.C(0, 0, 1, x340Var2), true, false, false);
        et90 et90Var = (et90) this.b;
        jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
        x340 x340Var3 = x340Var2;
        int iHashCode = Long.hashCode(x340Var3.T);
        xos0 xos0VarM = x340Var3.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
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
        nko1.H(jw31VarA, x340Var2, y580.O0);
        nko1.H(xos0VarM, x340Var2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
        nko1.F(x340Var2);
        nko1.H(qim0VarE, x340Var2, y580.Y);
        boolean zI = ((((iIntValue & 112) ^ 48) > 32 && x340Var4.g(tsz0Var)) || (iIntValue & 48) == 32) | x340Var4.i(et90Var);
        Object objT = x340Var4.T();
        if (zI || objT == fkj0.X) {
            objT = new j3y0((Object) et90Var, (Object) tsz0Var, (byte) 16);
            x340Var4.s0(objT);
        }
        dm5.a((iu30) objT, (qim0) null, (iu30) null, x340Var2, 0, 6);
        if (tsz0Var.b) {
            x340Var4.i0(521681755);
            uwo1.e(cwl1.o0(x340Var2, 2131961630), uyn1.z(6.0f, 0.0f, 2, nim0Var).then(new i5j1(een.N0)), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            otw.c((rm0) et90Var.d, new y4e(tsz0Var.a, 2), (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var = x340Var4;
            x340Var.r(false);
        } else {
            x340Var = x340Var4;
            x340Var.i0(522101712);
            x340Var.r(false);
        }
        x340Var.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        b001 b001Var = (b001) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        h001 h001Var = (h001) this.b;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(b001Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            boolean z4 = b001Var instanceof zzz0;
            mzz0 mzz0Var = mzz0.a;
            if (z4) {
                x340Var2.i0(-1303726921);
                zzz0 zzz0Var = (zzz0) b001Var;
                xzz0 xzz0Var = zzz0Var.e;
                qzz0 qzz0Var = zzz0Var.l;
                if (qzz0Var.equals(mzz0Var)) {
                    x340Var2.i0(-1981718439);
                    x340Var2.r(false);
                    z3 = false;
                } else {
                    x340Var2.i0(-1303633053);
                    String str = zzz0Var.j;
                    String str2 = zzz0Var.f55p;
                    vzz0 vzz0Var = xzz0Var.a;
                    String str3 = vzz0Var.a;
                    String str4 = vzz0Var.b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    tom tomVar = new tom(str, str2, new w4i1(str3, str4, 12, (String) null), 0L, true, new lpl(zzz0Var.b, (bc71) null, (String) null, (kpl) null, (hmp0) null, (String) null, (String) null, 122), (rom) null, (ArrayList) null, (ArrayList) null, (nom) null, zzz0Var.o, (xo2) null, 3008);
                    lgq lgqVar = h001Var.h;
                    boolean z5 = (i & 896) == 256;
                    Object objT = x340Var2.T();
                    if (z5 || objT == m4cVar) {
                        objT = new j9z0(iu30Var, (byte) 9);
                        x340Var2.s0(objT);
                    }
                    oa0 oa0VarA = lgqVar.a(tomVar, (Function0) objT);
                    boolean zA = xzz0Var.a();
                    boolean z6 = (qzz0Var instanceof pzz0) || (qzz0Var instanceof ozz0) || (qzz0Var instanceof kzz0);
                    smc0 smc0VarN = k4p1.n();
                    if (!zA && !z6) {
                        smc0VarN.add(fa0.d);
                    }
                    smc0VarN.add((zA && zzz0Var.o) ? new z90(true) : ba0.d);
                    c9 c9VarF = mqo1.F(k4p1.k(smc0VarN));
                    int i2 = i;
                    lik1 lik1Var = h001Var.X;
                    k4p1.e(zzz0Var, lik1Var, c9VarF, iu30Var, h001Var.e, oa0VarA, h001Var.i.a(lik1Var.a, h001Var.Y), h001Var.t.a(zzz0Var.j, true), h001Var.Z, (qim0) null, x340Var2, ((i2 >> 3) & 14) | ((i2 << 3) & 7168));
                    z3 = false;
                    x340Var2.r(false);
                }
                x340Var2.r(z3);
            } else {
                int i3 = i;
                if (b001Var instanceof a001) {
                    x340Var2.i0(-1301284865);
                    a001 a001Var = (a001) b001Var;
                    if (a001Var.e.equals(mzz0Var)) {
                        x340Var2.i0(-1981637479);
                        z2 = false;
                        x340Var2.r(false);
                    } else {
                        z2 = false;
                        x340Var2.i0(-1301190997);
                        e6p1.c(a001Var, h001Var.X, h001Var.Z, (qim0) null, x340Var2, (i3 >> 3) & 14);
                        x340Var2.r(false);
                    }
                    x340Var2.r(z2);
                } else {
                    if (!(b001Var instanceof yzz0)) {
                        throw p3d1.k(x340Var2, -1981719069, false);
                    }
                    x340Var2.i0(-1300945942);
                    yzz0 yzz0Var = (yzz0) b001Var;
                    if (yzz0Var.g.equals(mzz0Var)) {
                        x340Var2.i0(-1981626695);
                        z = false;
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1300838992);
                        lik1 lik1Var2 = h001Var.X;
                        idm idmVar = h001Var.Z;
                        fqm fqmVar = h001Var.N0;
                        boolean z7 = (i3 & 896) == 256;
                        Object objT2 = x340Var2.T();
                        if (z7 || objT2 == m4cVar) {
                            objT2 = new j9z0(iu30Var, (byte) 8);
                            x340Var2.s0(objT2);
                        }
                        buo1.g(lik1Var2, yzz0Var, idmVar, fqmVar, (Function0) objT2, (qim0) null, x340Var2, i3 & 112);
                        z = false;
                        x340Var2.r(false);
                    }
                    x340Var2.r(z);
                }
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        a101 a101Var = (a101) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(a101Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            c101 c101Var = (c101) this.b;
            p601.a(a101Var, c101Var.c, iu30Var, c101Var.d, (fqm) c101Var.f.getValue(), (qim0) null, x340Var2, ((i >> 3) & 14) | (i & 896));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        t201 t201Var = (t201) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        List list = t201Var.a;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (u890.j(((s201) it.next()).a, t201Var.b)) {
                break;
            }
            i++;
        }
        w201 w201Var = new w201(list, Integer.valueOf(i), ((u201) this.b).a);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new ppv0(iu30Var, (byte) 28);
            x340Var2.s0(objT);
        }
        iqo1.i(w201Var, (iu30) objT, (qim0) null, x340Var2, 0);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        a401 a401Var = (a401) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = ((iIntValue & 64) == 0 ? x340Var.g(a401Var) : x340Var.i(a401Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            et90 et90Var = (et90) this.b;
            ((b0i0) et90Var.d).g(a401Var, (fjb) et90Var.e, iu30Var, x340Var2, ((i >> 3) & 14) | (i & 896));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        boolean z;
        gbe0 gbe0Var;
        rxz0 rxz0Var;
        c380 c380Var;
        o501 o501Var = (o501) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        q401 q401Var = (q401) this.b;
        gbe0 gbe0Var2 = o501Var.c;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(o501Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(i & 1, (i & 1169) != 1168);
        rih1 rih1Var = rih1.a;
        if (!zY) {
            x340Var2.b0();
            return rih1Var;
        }
        Object objT = x340Var2.T();
        Object obj6 = fkj0.X;
        if (objT == obj6) {
            objT = Boolean.valueOf(gbe0Var2 instanceof gbe0);
            x340Var2.s0(objT);
        }
        boolean zBooleanValue = ((Boolean) objT).booleanValue();
        Object objT2 = x340Var2.T();
        if (objT2 == obj6) {
            objT2 = q401Var.b.a(q401Var.g, q401Var.f, iu30Var);
            x340Var2.s0(objT2);
        }
        e601 e601Var = (e601) objT2;
        boolean z2 = q401Var.e.getResources().getConfiguration().orientation == 2;
        WeakHashMap weakHashMap = osl1.x;
        u85 u85Var = lhc.g(x340Var2).c;
        boolean z3 = u85Var.e().d > 0;
        Boolean boolValueOf = Boolean.valueOf(z3);
        boolean zH = x340Var2.h(z3) | x340Var2.h(z2) | x340Var2.i(q401Var);
        Object objT3 = x340Var2.T();
        if (zH || objT3 == obj6) {
            boolean z4 = z3;
            objT3 = new oy3(z4, z2, q401Var, (lnm) null, (byte) 16);
            z = z4;
            gbe0Var = null;
            x340Var2.s0(objT3);
        } else {
            z = z3;
            gbe0Var = null;
        }
        qxd0.t(boolValueOf, x340Var2, (vu30) objT3);
        boolean zI = x340Var2.i(q401Var);
        Object objT4 = x340Var2.T();
        if (zI || objT4 == obj6) {
            objT4 = new fbz0(q401Var, (byte) 20);
            x340Var2.s0(objT4);
        }
        qxd0.i(rih1Var, (iu30) objT4, x340Var2);
        boolean z5 = !(gbe0Var2 instanceof qbe0);
        Object objT5 = x340Var2.T();
        if (objT5 == obj6) {
            objT5 = v8r.q(Boolean.FALSE);
            x340Var2.s0(objT5);
        }
        ven0 ven0Var = (ven0) objT5;
        Object objT6 = x340Var2.T();
        if (objT6 == obj6) {
            objT6 = bb00.h(0, x340Var2);
        }
        hdn0 hdn0Var = (hdn0) objT6;
        Boolean boolValueOf2 = Boolean.valueOf(z5);
        boolean zH2 = x340Var2.h(z5) | x340Var2.h(z2) | x340Var2.i(q401Var);
        Object objT7 = x340Var2.T();
        if (zH2 || objT7 == obj6) {
            dw8 dw8Var = new dw8(z5, z2, q401Var, ven0Var, (lnm) null, (byte) 4);
            x340Var2.s0(dw8Var);
            objT7 = dw8Var;
        }
        qxd0.t(boolValueOf2, x340Var2, (vu30) objT7);
        gbe0 gbe0Var3 = gbe0Var2 instanceof gbe0 ? gbe0Var2 : gbe0Var;
        nyx.a(2, (wux) null, apo.r(204798949, new ebh0(q401Var, z, z2, (gbe0Var3 == null || (rxz0Var = gbe0Var3.a) == null || (c380Var = rxz0Var.a) == null || !(c380Var.isEmpty() ^ true)) ? false : true, o501Var, ven0Var, hdn0Var, zBooleanValue, e601Var), x340Var2), x340Var2, 3078, 6);
        return rih1Var;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m601 m601Var = (m601) this.b;
        boolean z = ((l601) obj2).a;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new ppv0(iu30Var, (byte) 29);
            x340Var2.s0(objT);
        }
        m601Var.e(z, (iu30) objT, x340Var2, 0);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        long jE;
        Object vvu0Var;
        a701 a701Var = (c701) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        boolean z = a701Var instanceof b701;
        if (z) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-57705515);
            uwr uwrVar = cbx.a;
            jE = cbx.a(x340Var2).a.a.a();
            x340Var2.r(false);
        } else {
            if (!(a701Var instanceof a701)) {
                throw p3d1.k(x340Var, -57708010, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(-57704333);
            x340Var3.r(false);
            jE = z4p1.e(a701Var.a.b);
        }
        tob1 tob1VarA = w191.a(jE, (fe5) null, (String) null, x340Var, 0, 14);
        String strO0 = cwl1.o0(x340Var, 2131960884);
        String strO1 = cwl1.o0(x340Var, 2131960882);
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(anm1.N("read-along-element", nim0Var), 1.0f);
        long j = ((u7h) tob1VarA.getValue()).a;
        uwr uwrVar2 = cbx.a;
        cua cuaVar = cbx.b(x340Var).f;
        qim0 qim0VarF2 = dug.f(qim0VarF, j, er31.b(16.0f));
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
        boolean z2 = (((iIntValue & 112) ^ 48) > 32 && x340Var.i(a701Var)) || (iIntValue & 48) == 32;
        x340 x340Var4 = x340Var;
        boolean zG = x340Var4.g(strO1);
        j06 j06Var = x340Var4.a;
        boolean z3 = z2 | zG;
        int i = (iIntValue & 896) ^ 384;
        boolean zG2 = z3 | ((i > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var4.g(strO0);
        Object objT = x340Var4.T();
        if (zG2 || objT == m4cVar) {
            vvu0Var = new vvu0(a701Var, strO1, strO0, iu30Var, (byte) 13);
            x340Var4.s0(vvu0Var);
        } else {
            vvu0Var = objT;
        }
        qim0 qim0VarB = s161.b(qim0VarX, true, (iu30) vvu0Var);
        boolean z4 = a701Var instanceof a701;
        String strO2 = cwl1.o0(x340Var4, 2131960883);
        pm31 pm31Var = new pm31(0);
        boolean z5 = (i > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var4.T();
        if (z5 || objT2 == m4cVar) {
            objT2 = new j9z0(iu30Var, (byte) 15);
            x340Var4.s0(objT2);
        }
        qim0 qim0VarX2 = bin.x(qim0VarB, z4, strO2, pm31Var, (idn0) null, (Function0) objT2, 8);
        e701 e701Var = (e701) this.b;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var4, 0);
        int iHashCode = Long.hashCode(x340Var4.T);
        xos0 xos0VarM = x340Var4.m();
        qim0 qim0VarE = zr7.E(x340Var4, qim0VarX2);
        hzj.A.getClass();
        if (j06Var == null) {
            tgp1.p();
            throw null;
        }
        x340Var4.m0();
        boolean z6 = x340Var4.S;
        n4k n4kVar = hmb0.t1;
        if (z6) {
            x340Var4.l(n4kVar);
        } else {
            x340Var4.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(mbhVarA, x340Var4, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var4, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var4, lljVar3);
        nko1.F(x340Var4);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var4, lljVar4);
        qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
        cvx cvxVar2 = cbx.b(x340Var4).b;
        qim0 qim0VarB2 = uyn1.B(qim0VarF3, 0.0f, 0.0f, 0.0f, 16.0f, 7);
        jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var4, 0);
        int iHashCode2 = Long.hashCode(x340Var4.T);
        xos0 xos0VarM2 = x340Var4.m();
        qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarB2);
        x340Var4.m0();
        if (x340Var4.S) {
            x340Var4.l(n4kVar);
        } else {
            x340Var4.v0();
        }
        nko1.H(jw31VarA, x340Var4, lljVar);
        nko1.H(xos0VarM2, x340Var4, lljVar2);
        x0d.q(iHashCode2, x340Var4, lljVar3, x340Var4);
        nko1.H(qim0VarE2, x340Var4, lljVar4);
        uwo1.e(cwl1.o0(x340Var4, 2131960885), new wnb0(1.0f, true), cbx.d(x340Var4).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2040);
        boolean z7 = z4 && a701Var.a.h;
        fsx fsxVar = fsx.c;
        boolean z8 = (i > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT3 = x340Var4.T();
        if (z8 || objT3 == m4cVar) {
            objT3 = new j9z0(iu30Var, (byte) 16);
            x340Var4.s0(objT3);
        }
        z50 z50Var = z50.c;
        gbx gbxVar = new gbx(z50Var, (Function0) objT3);
        cvx cvxVar3 = cbx.b(x340Var4).b;
        vqo1.b(z7, fsxVar, gbxVar, "share", uyn1.B(nim0Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), x340Var4, (fsx.d << 3) | 3072, 0);
        inx inxVar = inx.c;
        boolean z9 = (i > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT4 = x340Var4.T();
        if (z9 || objT4 == m4cVar) {
            objT4 = new j9z0(iu30Var, (byte) 17);
            x340Var4.s0(objT4);
        }
        vqo1.b(z4, inxVar, new gbx(z50Var, (Function0) objT4), "expand", (qim0) null, x340Var4, (inx.d << 3) | 3072, 16);
        x340Var4.r(true);
        bby bbyVarE = xay.e(3, (ni20) null);
        ln00 ln00VarF = xay.f(3, (ni20) null);
        j2i j2iVar = kbj.a;
        pbh pbhVar = pbh.a;
        fq7.b(pbhVar, z, (qim0) null, bbyVarE, ln00VarF, (String) null, j2iVar, x340Var4, 1572870, 18);
        fq7.b(pbhVar, z4, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(-1784719860, new hho0(a701Var, e701Var, iu30Var, (byte) 15), x340Var4), x340Var4, 1572870, 30);
        x340Var4.r(true);
        return rih1.a;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v3 ??, new type: java.lang.Number
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v3 ??, new type: java.lang.Number
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    private final java.lang.Object k(java.lang.Object r36, java.lang.Object r37, java.lang.Object r38, java.lang.Object r39, java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zyy0.k(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        rd01 rd01Var = (rd01) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        nl9 nl9Var = (nl9) this.b;
        if (rd01Var.a) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1248054385);
            dc8 dc8Var = (dc8) ((idd1) nl9Var.h).getValue();
            String str = rd01Var.b;
            List list = rd01Var.c;
            lgu0 lgu0Var = (lgu0) ((idd1) nl9Var.t).getValue();
            int i = (iIntValue & 896) ^ 384;
            boolean z = true;
            boolean z2 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                objT = new n601(iu30Var, (byte) 1);
                x340Var2.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            if ((i <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT2 = x340Var2.T();
            if (z || objT2 == m4cVar) {
                objT2 = new j9z0(iu30Var, (byte) 24);
                x340Var2.s0(objT2);
            }
            tro1.j(dc8Var, str, list, lgu0Var, iu30Var2, (Function0) objT2, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1248395540);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        ven0 ven0VarH = rwq.h(((yg01) this.b).d, x340Var, 0);
        gox goxVar = gox.c;
        String strO0 = cwl1.o0(x340Var, 2131958048);
        t2g t2gVar = new t2g(((Boolean) ven0VarH.getValue()).booleanValue(), false, new nex(6), 2);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new j9z0(iu30Var, (byte) 25);
            x340Var2.s0(objT);
        }
        kyo1.c(strO0, goxVar, (Function0) objT, (qim0) null, false, (String) null, t2gVar, (vu30) null, x340Var2, gox.d << 3, 184);
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ci01 ci01Var = (ci01) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        u601 u601VarC = gfe0.c(x340Var);
        x340 x340Var2 = x340Var;
        boolean zI = x340Var2.i(u601VarC);
        a4f0 a4f0Var = (a4f0) this.b;
        boolean zI2 = zI | x340Var2.i(a4f0Var) | ((((iIntValue & 112) ^ 48) > 32 && x340Var2.i(ci01Var)) || (iIntValue & 48) == 32);
        Object objT = x340Var2.T();
        if (zI2 || objT == m4cVar) {
            objT = new os20(u601VarC, a4f0Var, ci01Var, (lnm) null, (byte) 2);
            x340Var2.s0(objT);
        }
        rih1 rih1Var = rih1.a;
        qxd0.t(rih1Var, x340Var2, (vu30) objT);
        Object objT2 = x340Var2.T();
        if (objT2 == m4cVar) {
            objT2 = ijz0.Y;
            x340Var2.s0(objT2);
        }
        mqo1.e((Function0) objT2, (i3u) null, (vu30) null, apo.r(-1599161887, new di01(ci01Var, (byte) 0), x340Var2), apo.r(-1959621598, new di01(ci01Var, (byte) 1), x340Var2), apo.r(1974885987, new iuy0(iu30Var, (byte) 3), x340Var2), (vu30) null, x340Var2, 224262, 70);
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:86:0x0268  */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v20 */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws Throwable {
        Throwable th;
        boolean z;
        qim0 qim0VarD;
        x340 x340Var;
        boolean z2;
        Boolean bool;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        xpz0 xpz0Var = null;
        boolean z3 = true;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                boolean z4 = false;
                yyy0 yyy0Var = (yyy0) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var2 = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                String str = yyy0Var.a;
                c380 c380VarA = mqo1.A(yyy0Var.b);
                String str2 = yyy0Var.c;
                jtl1 jtl1Var = ((azy0) obj6).b;
                if ((((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256) {
                    z4 = true;
                }
                x340 x340Var3 = x340Var2;
                Object objT = x340Var3.T();
                if (z4 || objT == fkj0.X) {
                    objT = new ccy0(iu30Var, (byte) 21);
                    x340Var3.s0(objT);
                }
                vgo1.l(str, c380VarA, str2, jtl1Var, (Function0) objT, (qim0) null, x340Var3, 0);
                return rih1Var;
            case 1:
                u1z0 u1z0Var = (u1z0) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                Function0 function0 = u1z0Var.f;
                k1z0 k1z0Var = u1z0Var.a;
                boolean z5 = u1z0Var.e;
                x340 x340Var4 = (b0k) obj4;
                Object objK = x340Var4.k(bka1.a);
                j06 j06Var = x340Var4.a;
                aka1 aka1Var = (aka1) objK;
                t1z0 t1z0Var = u1z0Var.b;
                v1z0 v1z0Var = (v1z0) obj6;
                boolean zI = x340Var4.i(u1z0Var) | x340Var4.i(v1z0Var) | x340Var4.i(aka1Var);
                Object objT2 = x340Var4.T();
                lnm lnmVar = null;
                if (zI || objT2 == m4cVar) {
                    objT2 = new i3y0((Object) u1z0Var, (Object) v1z0Var, (Object) aka1Var, lnmVar, (byte) 4);
                    th = null;
                    x340Var4.s0(objT2);
                } else {
                    th = null;
                }
                qxd0.t(t1z0Var, x340Var4, (vu30) objT2);
                Object objT3 = x340Var4.T();
                if (objT3 == m4cVar) {
                    v1z0Var.a.getClass();
                    objT3 = new lbe1();
                    x340Var4.s0(objT3);
                }
                lbe1 lbe1Var = (lbe1) objT3;
                Throwable th2 = th;
                Object objT4 = x340Var4.T();
                if (objT4 == m4cVar) {
                    ojq ojqVar = (ojq) v1z0Var.b.a.c;
                    yqg yqgVar = (yqg) ((jiz0) ojqVar.b).k.get();
                    c8o.l(yqgVar);
                    gw70 gw70VarB = ((ivj) ojqVar.i1).b();
                    c8o.l(gw70VarB);
                    q8n q8nVarA = ((jiz0) ojqVar.b).a();
                    c8o.l(q8nVarA);
                    py70 py70Var = new py70(yqgVar, gw70VarB, q8nVarA);
                    x340Var4.s0(py70Var);
                    objT4 = py70Var;
                }
                py70 py70Var2 = (py70) objT4;
                Object objT5 = x340Var4.T();
                if (objT5 == m4cVar) {
                    v1z0Var.d.getClass();
                    objT5 = new ylz0();
                    x340Var4.s0(objT5);
                }
                ylz0 ylz0Var = (ylz0) objT5;
                hh5 hh5Var = k1z0Var.d;
                String str3 = k1z0Var.a;
                boolean z6 = t1z0Var instanceof s1z0;
                zg5 zg5Var = new zg5(hh5Var, z6, z5);
                boolean zG = x340Var4.g(str3);
                Object objT6 = x340Var4.T();
                if (zG || objT6 == m4cVar) {
                    olq olqVar = v1z0Var.e;
                    ppv0 ppv0Var = new ppv0(iu30Var2, (byte) 19);
                    ccy0 ccy0Var = new ccy0(iu30Var2, (byte) 22);
                    ojq ojqVar2 = (ojq) olqVar.a.c;
                    objT6 = new ah5(zg5Var, ppv0Var, ccy0Var, (plq) ojqVar2.U0.get(), (qlq) ojqVar2.V0.get());
                    x340Var4.s0(objT6);
                }
                ah5 ah5Var = (ah5) objT6;
                qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var4).b;
                qim0 qim0VarB = uyn1.B(uyn1.z(16.0f, 0.0f, 2, qim0VarD2), 0.0f, 0.0f, 0.0f, cbx.b(x340Var4).b.b, 7);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var4, 0);
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var4, qim0VarB);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw th2;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var4, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var4, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var4, lljVar3);
                nko1.F(x340Var4);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var4, lljVar4);
                String str4 = k1z0Var.h;
                if (str4 == null) {
                    x340Var4.i0(-1118747598);
                    x340Var4.r(false);
                    z = false;
                } else {
                    x340Var4.i0(-1118747597);
                    lee1 lee1Var = cbx.d(x340Var4).g;
                    long j = cbx.a(x340Var4).b.a;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    uwo1.e(str4, uyn1.B(qim0VarF, 0.0f, 12.0f, 0.0f, 0.0f, 13), lee1Var, j, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2016);
                    cvx cvxVar3 = cbx.b(x340Var4).b;
                    z = false;
                    x0d.s(nim0Var, 4.0f, x340Var4, false);
                }
                pbh pbhVar = pbh.a;
                if (z5) {
                    x340Var4.i0(-1118311365);
                    z = false;
                    qim0VarD = l6o1.H(u291.f(pbhVar.a(1.0f, nim0Var, true), 1.0f), l6o1.C(0, 0, 1, x340Var4), false, 14);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-1118213374);
                    x340Var4.r(z);
                    qim0VarD = u291.d(pbhVar.a(1.0f, nim0Var, true), 1.0f);
                }
                gfh0 gfh0VarC = t1c.c(een.d, z);
                int iHashCode2 = Long.hashCode(x340Var4.T);
                xos0 xos0VarM2 = x340Var4.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarD);
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(gfh0VarC, x340Var4, lljVar);
                nko1.H(xos0VarM2, x340Var4, lljVar2);
                x0d.q(iHashCode2, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE2, x340Var4, lljVar4);
                w3z0 w3z0Var = k1z0Var.c;
                if (w3z0Var instanceof w3z0) {
                    x340Var4.i0(-78787803);
                    otw.c(lbe1Var, new kbe1(w3z0Var, z5, function0), u291.f(nim0Var, 1.0f), (ipb1) null, x340Var4, 72, 8);
                    x340Var4.r(false);
                } else if (w3z0Var instanceof t3z0) {
                    x340Var4.i0(-78774693);
                    t3z0 t3z0Var = (t3z0) w3z0Var;
                    Long l = u1z0Var.c;
                    Long l2 = u1z0Var.d;
                    boolean z7 = u1z0Var.e;
                    otw.c(py70Var2, new ky70(t3z0Var, l, l2, z6, z7, u1z0Var.f), z7 ? u291.f(nim0Var, 1.0f) : u291.d(nim0Var, 1.0f), (ipb1) null, x340Var4, 72, 8);
                    x340Var4.r(false);
                } else if (w3z0Var instanceof u3z0) {
                    x340Var4.i0(1853596894);
                    k3n0 k3n0Var = new k3n0((u3z0) w3z0Var, t1z0Var instanceof r1z0, z5, function0);
                    boolean zG2 = x340Var4.g(str3);
                    Object objT7 = x340Var4.T();
                    if (zG2 || objT7 == m4cVar) {
                        ojq ojqVar3 = (ojq) v1z0Var.c.a.c;
                        uu00 uu00Var = (uu00) ((jiz0) ojqVar3.b).i.get();
                        c8o.l(uu00Var);
                        hv00 hv00Var = new hv00(uu00Var);
                        mlq mlqVar = (mlq) ojqVar3.R0.get();
                        q8n q8nVarA2 = ((jiz0) ojqVar3.b).a();
                        c8o.l(q8nVarA2);
                        objT7 = new n3n0(k3n0Var, hv00Var, mlqVar, q8nVarA2);
                        x340Var4.s0(objT7);
                    }
                    otw.c((n3n0) objT7, k3n0Var, z5 ? u291.f(nim0Var, 1.0f) : u291.d(nim0Var, 1.0f), (ipb1) null, x340Var4, 72, 8);
                    x340Var4.r(false);
                } else {
                    if (!(w3z0Var instanceof v3z0)) {
                        throw p3d1.k(x340Var4, -78789107, false);
                    }
                    x340Var4.i0(-78728977);
                    otw.c(ylz0Var, new xlz0((v3z0) w3z0Var, z5, function0), u291.f(nim0Var, 1.0f), (ipb1) null, x340Var4, 72, 8);
                    x340Var4.r(false);
                }
                x340Var4.r(true);
                otw.c(ah5Var, zg5Var, (qim0) null, (ipb1) null, x340Var4, 72, 12);
                x340Var4.r(true);
                return rih1Var;
            case 2:
                int iIntValue2 = ((Number) obj5).intValue();
                h2z0 h2z0Var = (h2z0) obj6;
                tho1.k((e2z0) obj2, h2z0Var.a, h2z0Var.b, h2z0Var.d, (iu30) obj3, (b0k) obj4, ((iIntValue2 >> 3) & 14) | ((iIntValue2 << 6) & 57344));
                return rih1Var;
            case 3:
                p3z0 p3z0Var = (p3z0) obj2;
                who1.k(p3z0Var.h, p3z0Var.d, (zja1) obj6, p3z0Var.e, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() << 6) & 57344);
                return rih1Var;
            case 4:
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                hf2 hf2Var = (hf2) obj6;
                jtl1 jtl1Var2 = (jtl1) hf2Var.d;
                boolean z8 = (((iIntValue3 & 896) ^ 384) > 256 && x340Var5.g(iu30Var3)) || (iIntValue3 & 384) == 256;
                x340 x340Var6 = x340Var5;
                Object objT8 = x340Var6.T();
                if (z8 || objT8 == fkj0.X) {
                    objT8 = new j9z0(iu30Var3, (byte) 0);
                    x340Var6.s0(objT8);
                }
                grn1.e(0, (Function0) objT8, x340Var6, (qim0) null, jtl1Var2, hf2Var.b);
                return rih1Var;
            case 5:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(-455844290, new ffx0((p9z0) obj2, (iu30) obj3, (q9z0) obj6, (byte) 6), b0kVar), b0kVar, 3078, 6);
                return rih1Var;
            case 6:
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                boolean z9 = ((gaz0) obj2).b;
                jtl1 jtl1Var3 = (jtl1) ((nl9) obj6).b;
                boolean z10 = (((iIntValue4 & 896) ^ 384) > 256 && x340Var7.g(iu30Var4)) || (iIntValue4 & 384) == 256;
                x340 x340Var8 = x340Var7;
                Object objT9 = x340Var8.T();
                if (z10 || objT9 == fkj0.X) {
                    objT9 = new j9z0(iu30Var4, (byte) 2);
                    x340Var8.s0(objT9);
                }
                n1p1.e(0, (Function0) objT9, x340Var8, (qim0) null, jtl1Var3, z9);
                return rih1Var;
            case 7:
                qcz0 qcz0Var = (qcz0) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var9 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                ven0 ven0VarJ = f4p1.j(new nev0(((jtl1) ((rwj) obj6).g).b, (byte) 1), Boolean.FALSE, (iac0) null, x340Var9, 48, 14);
                int i = qcz0Var.a;
                String strO0 = cwl1.o0(x340Var9, i);
                long jC = upo1.C(true, x340Var9);
                String strO1 = cwl1.o0(x340Var9, i);
                boolean z11 = (((iIntValue5 & 896) ^ 384) > 256 && x340Var9.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                x340 x340Var10 = x340Var9;
                Object objT10 = x340Var10.T();
                if (z11 || objT10 == fkj0.X) {
                    objT10 = new j9z0(iu30Var5, (byte) 3);
                    x340Var10.s0(objT10);
                }
                Function0 function1 = (Function0) objT10;
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                upo1.l(strO0, jC, new gbx(new y50(strO1), function1), true, ((Boolean) ven0VarJ.getValue()).booleanValue(), (qim0) null, false, (String) null, apo.r(1946451039, new y6w0(qcz0Var, (byte) 28), x340Var10), x340Var10, 805306368, 288);
                return rih1Var;
            case 8:
                iez0 iez0Var = (iez0) obj2;
                x340 x340Var11 = (b0k) obj4;
                ((Number) obj5).intValue();
                kuy kuyVar = (kuy) obj6;
                bez0 bez0Var = iez0Var.a;
                int size = bez0Var != null ? bez0Var.b.size() : 0;
                boolean z12 = kuyVar.b;
                boolean z13 = kuyVar.c;
                ?? r15 = (!z12 || (z13 && size >= 6)) ? 0 : 1;
                if (size > 0 || r15 != 0) {
                    x340 x340Var12 = x340Var11;
                    x340Var12.i0(2044556390);
                    if (z13) {
                        x340Var12.i0(2044565163);
                        List listD1 = bez0Var != null ? o7h.d1(bez0Var.b, 6) : null;
                        if (listD1 == null) {
                            listD1 = z6x.a;
                        }
                        mez0.a(listD1.size() + r15, null, null, 0.0f, apo.r(2045713752, new hho0(listD1, kuyVar, iez0Var, (byte) 13), x340Var12), x340Var12, 24576);
                        if (bez0Var == null) {
                            x340Var12.i0(2044999286);
                            z2 = false;
                        } else {
                            z2 = false;
                            x340Var12.i0(2044999287);
                            kuyVar.e(bez0Var, x340Var12, 0);
                        }
                        x340Var12.r(z2);
                        x340Var12.r(z2);
                        x340Var = x340Var12;
                    } else {
                        x340Var12.i0(2045048236);
                        mez0.b(null, null, 0.0f, apo.r(1700074588, new r7e0(iez0Var, (boolean) r15, kuyVar, (byte) 17), x340Var12), x340Var12, 24582);
                        x340Var = x340Var12;
                        z2 = false;
                        x340Var.r(false);
                    }
                    x340Var.r(z2);
                } else {
                    x340 x340Var13 = x340Var11;
                    x340Var13.i0(2045396304);
                    x340Var13.r(false);
                }
                return rih1Var;
            case 9:
                miz0 miz0Var = (miz0) obj6;
                jmo1.b((fiz0) obj2, (iu30) obj3, miz0Var.b, miz0Var.c, miz0Var.d, miz0Var.e, miz0Var.f, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 10:
                uiz0 uiz0Var = (uiz0) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                int iIntValue6 = ((Number) obj5).intValue();
                xiz0 xiz0Var = (xiz0) obj6;
                x340 x340Var14 = (b0k) obj4;
                Object objT11 = x340Var14.T();
                m4c m4cVar2 = fkj0.X;
                if (objT11 == m4cVar2) {
                    objT11 = v8r.q(Boolean.FALSE);
                    x340Var14.s0(objT11);
                }
                ven0 ven0Var = (ven0) objT11;
                Object objT12 = x340Var14.T();
                if (objT12 == m4cVar2) {
                    switch (xiz0Var.c.a) {
                        case 0:
                            objT12 = new bn00();
                            break;
                        default:
                            objT12 = new bn00();
                            break;
                    }
                    x340Var14.s0(objT12);
                }
                bn00 bn00Var = (bn00) objT12;
                cir0 cir0Var = (cir0) x340Var14.k(k2r0.a);
                ven0 ven0VarS = v8r.s(Boolean.valueOf(uiz0Var.b), x340Var14);
                int i2 = (iIntValue6 & 896) ^ 384;
                boolean zI2 = x340Var14.i(cir0Var) | x340Var14.i(ven0VarS) | x340Var14.i(ven0Var) | ((i2 > 256 && x340Var14.g(iu30Var6)) || (iIntValue6 & 384) == 256);
                Object objT13 = x340Var14.T();
                if (zI2 || objT13 == m4cVar2) {
                    objT13 = new c6h0((Object) cir0Var, iu30Var6, (Object) ven0VarS, ven0Var, (lnm) null, (byte) 19);
                    x340Var14.s0(objT13);
                }
                qxd0.t(rih1Var, x340Var14, (vu30) objT13);
                rgn0 rgn0Var = xiz0Var.d;
                if (rgn0Var == null) {
                    x340Var14.i0(-1741463432);
                    x340Var14.r(false);
                    bool = null;
                } else {
                    x340Var14.i0(-1741463431);
                    Boolean bool2 = (Boolean) rwq.g(rgn0Var.a(), Boolean.valueOf(rgn0Var.b.getValue() instanceof ngn0), (o8n) null, x340Var14, 0, 2).getValue();
                    bool2.getClass();
                    x340Var14.r(false);
                    bool = bool2;
                }
                String str5 = uiz0Var.a;
                boolean z14 = uiz0Var.c;
                jlz0 jlz0Var = uiz0Var.d;
                boolean zI3 = ((i2 > 256 && x340Var14.g(iu30Var6)) || (iIntValue6 & 384) == 256) | ((((iIntValue6 & 112) ^ 48) > 32 && x340Var14.i(uiz0Var)) || (iIntValue6 & 48) == 32) | x340Var14.i(ven0Var);
                Object objT14 = x340Var14.T();
                if (zI3 || objT14 == m4cVar2) {
                    objT14 = new d4v0(iu30Var6, uiz0Var, ven0Var, (byte) 11);
                    x340Var14.s0(objT14);
                }
                Function0 function2 = (Function0) objT14;
                boolean z15 = (i2 > 256 && x340Var14.g(iu30Var6)) || (iIntValue6 & 384) == 256;
                Object objT15 = x340Var14.T();
                if (z15 || objT15 == m4cVar2) {
                    objT15 = new ppv0(iu30Var6, (byte) 21);
                    x340Var14.s0(objT15);
                }
                jlz0 jlz0Var2 = jlz0.i;
                mmo1.n(str5, bool, z14, jlz0Var, function2, (iu30) objT15, (qim0) null, x340Var14, 0);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    x340Var14.i0(-1740901649);
                    boolean zI4 = x340Var14.i(ven0Var);
                    Object objT16 = x340Var14.T();
                    if (zI4 || objT16 == m4cVar2) {
                        objT16 = new g8y0(ven0Var, (byte) 1);
                        x340Var14.s0(objT16);
                    }
                    Function0 function3 = (Function0) objT16;
                    boolean zI5 = x340Var14.i(ven0Var) | ((i2 > 256 && x340Var14.g(iu30Var6)) || (iIntValue6 & 384) == 256);
                    Object objT17 = x340Var14.T();
                    if (zI5 || objT17 == m4cVar2) {
                        objT17 = new wq9(iu30Var6, ven0Var, (byte) 29);
                        x340Var14.s0(objT17);
                    }
                    otw.c(bn00Var, new an00(function3, (Function0) objT17), (qim0) null, (ipb1) null, x340Var14, 8, 12);
                    x340Var14.r(false);
                } else {
                    x340Var14.i0(-1740567221);
                    x340Var14.r(false);
                }
                return rih1Var;
            case 11:
                gjz0 gjz0Var = (gjz0) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                ((Number) obj5).intValue();
                xip xipVar = (xip) obj6;
                x340 x340Var15 = (b0k) obj4;
                Object objT18 = x340Var15.T();
                if (objT18 == fkj0.X) {
                    objT18 = xipVar.a((rgn0) null);
                    x340Var15.s0(objT18);
                }
                irn1.u((qim0) null, apo.r(940502497, new kpw0((xiz0) objT18, gjz0Var, (byte) 14), x340Var15), (vu30) null, (erl1) null, apo.r(-1280955045, new hov0(gjz0Var, iu30Var7, (byte) 7), x340Var15), x340Var15, 24624, 13);
                return rih1Var;
            case 12:
                xjz0 xjz0Var = (xjz0) obj2;
                b0k b0kVar2 = (b0k) obj4;
                yjz0 yjz0Var = (yjz0) obj6;
                yjz0Var.e((iu30) obj3, b0kVar2, (((Number) obj5).intValue() >> 6) & 14);
                smo1.k(xjz0Var.a, yjz0Var.b, xjz0Var.b, (qim0) null, b0kVar2, 0);
                return rih1Var;
            case 13:
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                ((ngs0) obj6).g(iu30Var8, x340Var16, (iIntValue7 >> 6) & 14);
                c380 c380Var = ((dlz0) obj2).b;
                if ((((iIntValue7 & 896) ^ 384) <= 256 || !x340Var16.g(iu30Var8)) && (iIntValue7 & 384) != 256) {
                    z3 = false;
                }
                x340 x340Var17 = x340Var16;
                Object objT19 = x340Var17.T();
                if (z3 || objT19 == fkj0.X) {
                    objT19 = new ppv0(iu30Var8, (byte) 24);
                    x340Var17.s0(objT19);
                }
                zmo1.h(0, x340Var17, (iu30) objT19, c380Var, (qim0) null);
                return rih1Var;
            case 14:
                elz0 elz0Var = (elz0) obj2;
                hlz0.c(elz0Var, ((flz0) obj6).a, elz0Var.h, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 15:
                tpz0 tpz0Var = (tpz0) obj2;
                x340 x340Var18 = (b0k) obj4;
                ((Number) obj5).intValue();
                hf2 hf2Var2 = (hf2) obj6;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var18, 0);
                x340 x340Var19 = x340Var18;
                int iHashCode3 = Long.hashCode(x340Var19.T);
                xos0 xos0VarM3 = x340Var19.m();
                qim0 qim0VarE3 = zr7.E(x340Var18, nim0Var);
                hzj.A.getClass();
                x340 x340Var20 = x340Var18;
                if (x340Var20.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var20.m0();
                if (x340Var20.S) {
                    x340Var20.l(n4kVar);
                } else {
                    x340Var20.v0();
                }
                nko1.H(jw31VarA, x340Var18, y580.O0);
                nko1.H(xos0VarM3, x340Var18, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var18, y580.R0);
                nko1.F(x340Var18);
                nko1.H(qim0VarE3, x340Var18, y580.Y);
                String strL = xfo1.l((Context) x340Var20.k(AndroidCompositionLocals_androidKt.b), tpz0Var.b, tpz0Var.a, hf2Var2.b);
                uwr uwrVar2 = cbx.a;
                uwo1.e(strL, anm1.N("radio_header_metadata_text", nim0Var), cbx.d(x340Var18).j, cbx.a(x340Var18).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var18, 0, 0, 2032);
                ven0 ven0VarH = rwq.h((bpb1) hf2Var2.e, x340Var18, 0);
                xpz0 xpz0Var2 = tpz0Var.c;
                if (xpz0Var2 instanceof vpz0) {
                    vpz0 vpz0Var = (vpz0) xpz0Var2;
                    umw0 umw0Var = (umw0) ven0VarH.getValue();
                    if (vpz0Var.b) {
                        xpz0Var = xpz0Var2;
                    } else {
                        Instant instant = vpz0Var.a;
                        if (instant != null) {
                            if (umw0Var.equals(smw0.a)) {
                                xpz0Var = xpz0Var2;
                            } else if (!umw0Var.equals(tmw0.a)) {
                                if (!(umw0Var instanceof rmw0)) {
                                    eg.o();
                                    return null;
                                }
                                if (((rmw0) umw0Var).a < instant.toEpochMilli()) {
                                    xpz0Var = xpz0Var2;
                                }
                            }
                        }
                    }
                } else {
                    xpz0Var = xpz0Var2;
                }
                if (xpz0Var instanceof upz0) {
                    x340Var20.i0(118211722);
                    otw.c((yby0) ((idd1) hf2Var2.f).getValue(), new wby0(null, null, ((upz0) xpz0Var).a, true, false, strL.length() > 0), (qim0) null, (ipb1) null, x340Var18, 0, 12);
                    x340Var20.r(false);
                } else if (u890.j(xpz0Var, wpz0.a) || (xpz0Var instanceof vpz0)) {
                    x340Var20.i0(-630001222);
                    if (strL.length() > 0) {
                        x340Var20.i0(-629980142);
                        uwo1.e(" • ", (qim0) null, cbx.d(x340Var18).j, cbx.a(x340Var18).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var18, 6, 0, 2034);
                        x340Var20.r(false);
                    } else {
                        x340Var20.i0(-629779293);
                        x340Var20.r(false);
                    }
                    boolean z16 = xpz0Var instanceof vpz0;
                    uwo1.e(cwl1.o0((b0k) 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x036a: INVOKE 
                          (wrap java.lang.String:0x0329: INVOKE 
                          (wrap p.b0k:?: CAST (p.b0k) (r28v6 ?? I:??[OBJECT, ARRAY]))
                          (wrap int:?: TERNARY null = ((r0v138 'z16' boolean) != false) ? (2131960821 int) : (2131960822 int))
                         STATIC call: p.cwl1.o0(p.b0k, int):java.lang.String A[WRAPPED] (LINE:810))
                          (wrap p.qim0:0x034c: INVOKE 
                          (wrap java.lang.String:?: TERNARY null = ((r0v138 'z16' boolean) != false) ? ("radio_header_update_failed_text") : ("radio_header_updated_text"))
                          (wrap p.wnb0:0x0342: CONSTRUCTOR (1.0f float), false A[WRAPPED] (LINE:835) call: p.wnb0.<init>(float, boolean):void type: CONSTRUCTOR)
                         STATIC call: p.anm1.N(java.lang.String, p.qim0):p.qim0 A[WRAPPED] (LINE:845))
                          (wrap p.lee1:0x0331: IGET 
                          (wrap p.uyx:0x032d: INVOKE (wrap p.b0k:?: CAST (p.b0k) (r28v6 ?? I:??[OBJECT, ARRAY])) STATIC call: p.cbx.d(p.b0k):p.uyx A[WRAPPED] (LINE:814))
                         A[WRAPPED] (LINE:818) p.uyx.j p.lee1)
                          (wrap long:0x0339: IGET 
                          (wrap p.yxx:0x0337: IGET 
                          (wrap p.afx:0x0333: INVOKE (wrap p.b0k:?: CAST (p.b0k) (r28v6 ?? I:??[OBJECT, ARRAY])) STATIC call: p.cbx.a(p.b0k):p.afx A[WRAPPED] (LINE:820))
                         A[WRAPPED] (LINE:824) p.afx.b p.yxx)
                         A[WRAPPED] (LINE:826) p.yxx.a long)
                          (wrap p.a0e1:?: CAST (p.a0e1) (null p.a0e1))
                          (wrap p.iu30:?: CAST (p.iu30) (null p.iu30))
                          (2 int)
                          false
                          (wrap p.cjc0:0x033d: CONSTRUCTOR (1 int) A[WRAPPED] (LINE:830) call: p.cjc0.<init>(int):void type: CONSTRUCTOR)
                          (0 int)
                          (wrap p.qx8:?: CAST (p.qx8) (null p.qx8))
                          (r1v113 'x340Var18' p.x340)
                          (0 int)
                          (0 int)
                          (1712 int)
                         STATIC call: p.uwo1.e(java.lang.String, p.qim0, p.lee1, long, p.a0e1, p.iu30, int, boolean, p.djc0, int, p.qx8, p.b0k, int, int, int):void (LINE:875) in method: p.zyy0.c1(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes8.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v6 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 3602
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.zyy0.c1(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }
