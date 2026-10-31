package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.TextUnit;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aso0 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aso0(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Map map;
        List list;
        jo70 jo70Var = (jo70) obj;
        hll hllVar = (hll) obj2;
        qxc0 qxc0Var = (qxc0) obj3;
        String str = (String) obj4;
        String str2 = (String) obj5;
        String str3 = jo70Var != null ? jo70Var.a : null;
        boolean z = false;
        if (hllVar != null && (list = hllVar.d) != null && list.contains(fll.c)) {
            z = true;
        }
        boolean z2 = qxc0Var != null ? qxc0Var.h : true;
        if (qxc0Var == null || (map = qxc0Var.X) == null) {
            map = b7x.a;
        }
        return new r0q0(str3, z, new t0q0(map, z2), ((y0q0) this.b).d.a(str, str2));
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b3q0 b3q0Var = (b3q0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if (b3q0Var.a) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-409368768);
            fra fraVar = een.N0;
            et90 et90Var = (et90) this.b;
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).j;
            long j = ((vex) zex.a.b).l;
            Resources resources = ((Context) et90Var.d).getResources();
            int i = b3q0Var.b;
            uwo1.e(resources.getQuantityString(2131820779, i, Integer.valueOf(i)), null, lee1Var, j, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2034);
            op71.g(x340Var2, u291.v(nim0Var, 8.0f));
            eox eoxVar = eox.c;
            long j2 = cbx.a(x340Var2).b.b;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarR = u291.r(nim0Var, 12.0f);
            boolean zI = ((((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256) | ((((iIntValue & 112) ^ 48) > 32 && x340Var2.g(b3q0Var)) || (iIntValue & 48) == 32) | x340Var2.i(et90Var);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new pcp0(iu30Var, b3q0Var, et90Var, (byte) 11);
                x340Var2.s0(objT);
            }
            w0h1.a(eoxVar, isl.a, bin.x(qim0VarR, false, null, null, null, (Function0) objT, 15), j2, 0L, false, x340Var2, eox.d | 48, 48);
            x340Var2.r(true);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-408260735);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        c9q0 c9q0Var = (c9q0) obj2;
        iu30 iu30Var = (iu30) obj3;
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        n0o n0oVar = (n0o) this.b;
        k900 k900Var = c9q0Var.b;
        if (k900Var != null) {
            mod.b(oi7.a.a((gw70) n0oVar.g), apo.r(-936351870, new b2o0(n0oVar, k900Var, c9q0Var, iu30Var, (byte) 3), b0kVar), b0kVar, 56);
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        TextUnit textUnit;
        jeq0 jeq0Var = (jeq0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = jeq0Var.e;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        era eraVar = een.Q0;
        leq0 leq0Var = (leq0) this.b;
        jtl1 jtl1Var = leq0Var.a;
        mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
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
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        htl1 htl1Var = (htl1) f4p1.k(jtl1Var.b, (iac0) null, x340Var, 7).getValue();
        if (u890.j(htl1Var != null ? htl1Var.b : null, brl1.b)) {
            x340Var3.i0(-704432721);
            x340Var3.r(false);
        } else {
            x340Var3.i0(-704517289);
            uwr uwrVar = cbx.a;
            ydh.l(nim0Var, cbx.b(x340Var).b.c, x340Var, x340Var3, false);
        }
        String str = jeq0Var.a;
        String str2 = jeq0Var.b;
        c380 c380VarA = mqo1.A(jeq0Var.c);
        j2i j2iVarR = apo.r(575445508, new n8k0(leq0Var, z, iu30Var, (byte) 2), x340Var);
        String str3 = z ? jeq0Var.d : null;
        a0e1 a0e1Var = z ? new a0e1(5) : null;
        if (z) {
            x340Var3.i0(-853990149);
            uwr uwrVar2 = cbx.a;
            long j = cbx.d(x340Var).d.a.b;
            x340Var3.r(false);
            textUnit = new TextUnit(j);
        } else {
            x340Var3.i0(-703877078);
            x340Var3.r(false);
            textUnit = null;
        }
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT = x340Var3.T();
        if (z2 || objT == fkj0.X) {
            objT = new wck0(iu30Var, (byte) 18);
            x340Var3.s0(objT);
        }
        yzo1.i(jtl1Var, str, str2, c380VarA, 5, j2iVarR, null, str3, a0e1Var, textUnit, (iu30) objT, x340Var, 196608, 64);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ofq0 ofq0Var = (ofq0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new tro0(iu30Var, (byte) 29);
            x340Var2.s0(objT);
        }
        x74.f((Function0) objT, (scx) null, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(411780018, new ukm0((smp0) this.b, ofq0Var, (byte) 13), x340Var2), x340Var2, 12582912, 48, 1918);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        igq0 igq0Var = (igq0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = igq0Var.d;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        era eraVar = een.Q0;
        jtl1 jtl1Var = ((kgq0) this.b).a;
        mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        TextUnit textUnit = null;
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
        htl1 htl1Var = (htl1) f4p1.k(jtl1Var.b, (iac0) null, x340Var, 7).getValue();
        if (u890.j(htl1Var != null ? htl1Var.b : null, brl1.b)) {
            x340Var3.i0(-1269178721);
            x340Var3.r(false);
        } else {
            x340Var3.i0(-1269263289);
            uwr uwrVar = cbx.a;
            ydh.l(nim0Var, cbx.b(x340Var).b.c, x340Var, x340Var3, false);
        }
        String str = igq0Var.a;
        String str2 = igq0Var.b;
        c380 c380VarA = mqo1.A(igq0Var.c);
        j2i j2iVar = d5j.a;
        a0e1 a0e1Var = z ? new a0e1(5) : null;
        if (z) {
            x340Var3.i0(97619531);
            uwr uwrVar2 = cbx.a;
            long j = cbx.d(x340Var).d.a.b;
            x340Var3.r(false);
            textUnit = new TextUnit(j);
        } else {
            x340Var3.i0(-1268748070);
            x340Var3.r(false);
        }
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT = x340Var3.T();
        if (z2 || objT == fkj0.X) {
            objT = new wck0(iu30Var, (byte) 20);
            x340Var3.s0(objT);
        }
        yzo1.i(jtl1Var, str, str2, c380VarA, 5, j2iVar, null, null, a0e1Var, textUnit, (iu30) objT, x340Var, 196608, 192);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        rhq0 rhq0Var = (rhq0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = ((iIntValue & 64) == 0 ? x340Var.g(rhq0Var) : x340Var.i(rhq0Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            mod.b(oi7.a.a(((thq0) this.b).a), apo.r(-1027315675, new jyo0(rhq0Var, iu30Var, (byte) 12), x340Var2), x340Var2, 56);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        uwr uwrVar = cbx.a;
        long j = cbx.a(x340Var).a.c;
        u5j1 u5j1Var = d4o1.a;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, u291.f(dug.f(nim0Var, j, u5j1Var), 1.0f));
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, cbx.b(x340Var).b.b, 5);
        ymq0 ymq0Var = (ymq0) this.b;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        era eraVar = een.Q0;
        uwo1.e(cwl1.n0(2131953795, new Object[]{ymq0Var.a}, x340Var), ktd.m(eraVar, qim0VarF), cbx.d(x340Var).h, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
        qim0 qim0VarM = ktd.m(eraVar, u291.f(nim0Var, 1.0f));
        cvx cvxVar2 = cbx.b(x340Var).b;
        uwo1.e(cwl1.o0(x340Var, 2131953794), uyn1.B(qim0VarM, 0.0f, 4.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).m, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        i541 i541VarA = ((svb0) this.b).a((toq0) obj2);
        int i = (iIntValue & 896) ^ 384;
        boolean z = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == m4cVar) {
            objT = new dgq0(iu30Var, (byte) 1);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        boolean z2 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var2.T();
        if (z2 || objT2 == m4cVar) {
            objT2 = new dgq0(iu30Var, (byte) 2);
            x340Var2.s0(objT2);
        }
        Function0 function1 = (Function0) objT2;
        boolean z3 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT3 = x340Var2.T();
        if (z3 || objT3 == m4cVar) {
            objT3 = new dgq0(iu30Var, (byte) 3);
            x340Var2.s0(objT3);
        }
        Function0 function2 = (Function0) objT3;
        boolean z4 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT4 = x340Var2.T();
        if (z4 || objT4 == m4cVar) {
            objT4 = new dgq0(iu30Var, (byte) 4);
            x340Var2.s0(objT4);
        }
        Function0 function3 = (Function0) objT4;
        boolean z5 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT5 = x340Var2.T();
        if (z5 || objT5 == m4cVar) {
            objT5 = new dgq0(iu30Var, (byte) 5);
            x340Var2.s0(objT5);
        }
        Function0 function4 = (Function0) objT5;
        boolean z6 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT6 = x340Var2.T();
        if (z6 || objT6 == m4cVar) {
            objT6 = new dgq0(iu30Var, (byte) 6);
            x340Var2.s0(objT6);
        }
        Function0 function5 = (Function0) objT6;
        boolean z7 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT7 = x340Var2.T();
        if (z7 || objT7 == m4cVar) {
            objT7 = new dgq0(iu30Var, (byte) 7);
            x340Var2.s0(objT7);
        }
        Function0 function6 = (Function0) objT7;
        boolean z8 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT8 = x340Var2.T();
        if (z8 || objT8 == m4cVar) {
            objT8 = new dgq0(iu30Var, (byte) 8);
            x340Var2.s0(objT8);
        }
        Function0 function7 = (Function0) objT8;
        boolean z9 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT9 = x340Var2.T();
        if (z9 || objT9 == m4cVar) {
            objT9 = new dgq0(iu30Var, (byte) 9);
            x340Var2.s0(objT9);
        }
        c921.i(i541VarA, function0, function1, function2, function3, function4, function5, function6, function7, (Function0) objT9, cwl1.o0(x340Var2, 2131960694), cwl1.o0(x340Var2, 2131960693), cwl1.o0(x340Var2, 2131960692), (qim0) null, x340Var2, 0);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        qim0 qim0VarX;
        uwr uwrVar = cbx.a;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        String strO0 = cwl1.o0(x340Var, 2131959463);
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        if (((prq0) obj2).a) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(44460740);
            qim0VarX = uyn1.z(cbx.b(x340Var2).b.b, 0.0f, 2, nim0Var);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(44463159);
            qim0VarX = uyn1.x(nim0Var, cbx.b(x340Var3).b.b);
            x340Var3.r(false);
        }
        qim0 qim0VarN = anm1.N("outbound_hint_container", qim0VarF.then(qim0VarX));
        era eraVar = een.Q0;
        cvx cvxVar = cbx.b(x340Var).b;
        d36 d36Var = new d36(16.0f, true, new um5(false));
        nu nuVar = (nu) this.b;
        mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
        x340 x340Var4 = x340Var;
        int iHashCode = Long.hashCode(x340Var4.T);
        xos0 xos0VarM = x340Var4.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
        hzj.A.getClass();
        x340 x340Var5 = x340Var;
        if (x340Var5.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var5.m0();
        if (x340Var5.S) {
            x340Var5.l(hmb0.t1);
        } else {
            x340Var5.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        nuVar.e(strO0, x340Var, 0);
        x340Var5.r(true);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x0127  */
    /* JADX WARN: Code duplicated, block: B:55:0x014b  */
    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vg41 vg41Var;
        vg41 vg41Var2;
        x340 x340Var;
        Object objT;
        Object obj6;
        orq0 orq0Var;
        boolean z;
        usq0 usq0Var;
        boolean zI;
        Object objT2;
        usq0 usq0Var2;
        boolean zA;
        Object objT3;
        j2i j2iVarR;
        Object objT4;
        j2i j2iVarR2;
        boolean z2;
        isq0 isq0Var = (isq0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var2 = (b0k) obj4;
        ((Number) obj5).intValue();
        osq0 osq0Var = (osq0) this.b;
        if (isq0Var.c) {
            usq0 usq0Var3 = isq0Var.a;
            boolean zEquals = usq0Var3.equals(tsq0.a);
            rsq0 rsq0Var = rsq0.a;
            urq0 urq0Var = null;
            if (zEquals || usq0Var3.equals(rsq0Var)) {
                vg41Var = vg41.a;
            } else {
                boolean zEquals2 = usq0Var3.equals(vsq0.a);
                vg41Var = vg41.b;
                if (!zEquals2) {
                    boolean z3 = usq0Var3 instanceof usq0;
                    vg41Var2 = vg41.c;
                    if (z3) {
                        if (!(usq0Var3.b instanceof trq0)) {
                        }
                    } else if (!usq0Var3.equals(ssq0.a)) {
                        eg.o();
                        return null;
                    }
                }
                x340Var = x340Var2;
                objT = x340Var.T();
                obj6 = fkj0.X;
                if (objT == obj6) {
                    objT = new orq0(new wao0(1, osq0Var.P0, n8r0.class, "perform", "perform(Lcom/spotify/pagematch/scanningcommon/hapticfeedback/PageMatchHapticType;)V", 0, (byte) 14), ((long) osq0Var.Y.a()) * 1000);
                    x340Var.s0(objT);
                }
                orq0Var = (orq0) objT;
                z = usq0Var3 instanceof usq0;
                if (z) {
                    usq0Var = usq0Var3;
                } else {
                    usq0Var = null;
                }
                zI = x340Var.i(usq0Var) | x340Var.i(orq0Var);
                objT2 = x340Var.T();
                if (zI || objT2 == obj6) {
                    objT2 = new e3p0(usq0Var, orq0Var, urq0Var, (byte) 10);
                    x340Var.s0(objT2);
                }
                qxd0.t(usq0Var, x340Var, (vu30) objT2);
                if (z) {
                    usq0Var2 = usq0Var3;
                } else {
                    usq0Var2 = null;
                }
                boolean z4 = (usq0Var2 != null ? usq0Var2.b : null) instanceof trq0;
                zA = osq0Var.Z.a();
                objT3 = x340Var.T();
                if (objT3 == obj6) {
                    if (zA || !usq0Var3.equals(rsq0Var)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    objT3 = Boolean.valueOf(z2);
                    x340Var.s0(objT3);
                }
                j2iVarR = apo.r(276207092, new erc(zA, osq0Var, isq0Var, ((Boolean) objT3).booleanValue(), iu30Var, usq0Var3), x340Var);
                objT4 = x340Var.T();
                if (objT4 == obj6) {
                    objT4 = (a4d) osq0Var.e.get();
                    x340Var.s0(objT4);
                }
                j2iVarR2 = apo.r(23075235, new aa6((a4d) objT4, zA, usq0Var3, z4, isq0Var, j2iVarR, vg41Var2, iu30Var, osq0Var), x340Var);
                if (zA) {
                    x340Var.i0(768697212);
                    uwr uwrVar = cbx.a;
                    fap1.a(j2iVarR2, j2iVarR, cbx.a(x340Var).a.a.a(), null, x340Var, 54);
                    x340Var.r(false);
                } else {
                    x340Var.i0(768859528);
                    j2iVarR2.invoke(x340Var, 6);
                    x340Var.r(false);
                }
            }
            vg41Var2 = vg41Var;
            x340Var = x340Var2;
            objT = x340Var.T();
            obj6 = fkj0.X;
            if (objT == obj6) {
                objT = new orq0(new wao0(1, osq0Var.P0, n8r0.class, "perform", "perform(Lcom/spotify/pagematch/scanningcommon/hapticfeedback/PageMatchHapticType;)V", 0, (byte) 14), ((long) osq0Var.Y.a()) * 1000);
                x340Var.s0(objT);
            }
            orq0Var = (orq0) objT;
            z = usq0Var3 instanceof usq0;
            if (z) {
                usq0Var = usq0Var3;
            } else {
                usq0Var = null;
            }
            zI = x340Var.i(usq0Var) | x340Var.i(orq0Var);
            objT2 = x340Var.T();
            if (zI) {
                objT2 = new e3p0(usq0Var, orq0Var, urq0Var, (byte) 10);
                x340Var.s0(objT2);
            } else {
                objT2 = new e3p0(usq0Var, orq0Var, urq0Var, (byte) 10);
                x340Var.s0(objT2);
            }
            qxd0.t(usq0Var, x340Var, (vu30) objT2);
            if (z) {
                usq0Var2 = usq0Var3;
            } else {
                usq0Var2 = null;
            }
            boolean z5 = (usq0Var2 != null ? usq0Var2.b : null) instanceof trq0;
            zA = osq0Var.Z.a();
            objT3 = x340Var.T();
            if (objT3 == obj6) {
                if (zA) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                objT3 = Boolean.valueOf(z2);
                x340Var.s0(objT3);
            }
            j2iVarR = apo.r(276207092, new erc(zA, osq0Var, isq0Var, ((Boolean) objT3).booleanValue(), iu30Var, usq0Var3), x340Var);
            objT4 = x340Var.T();
            if (objT4 == obj6) {
                objT4 = (a4d) osq0Var.e.get();
                x340Var.s0(objT4);
            }
            j2iVarR2 = apo.r(23075235, new aa6((a4d) objT4, zA, usq0Var3, z5, isq0Var, j2iVarR, vg41Var2, iu30Var, osq0Var), x340Var);
            if (zA) {
                x340Var.i0(768697212);
                uwr uwrVar2 = cbx.a;
                fap1.a(j2iVarR2, j2iVarR, cbx.a(x340Var).a.a.a(), null, x340Var, 54);
                x340Var.r(false);
            } else {
                x340Var.i0(768859528);
                j2iVarR2.invoke(x340Var, 6);
                x340Var.r(false);
            }
        }
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ksw kswVar = (ksw) obj;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarA = uyn1.A(nim0.a, 16.0f, 16.0f, 16.0f, 8.0f);
        ng20 ng20Var = (ng20) this.b;
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        ((w460) ng20Var.b).f.a(((iIntValue << 6) & 896) | ((iIntValue >> 3) & 126), obj2, x340Var, kswVar, iu30Var);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        g5r0 g5r0Var;
        x340 x340Var;
        ahi0 ahi0Var;
        boolean z;
        g5r0 g5r0Var2 = (g5r0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var2 = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        ahi0 ahi0Var2 = (ahi0) this.b;
        m4c m4cVar = fkj0.X;
        List list = g5r0Var2.g;
        List list2 = g5r0Var2.h;
        if ((iIntValue & 48) == 0) {
            i = (x340Var2.g(g5r0Var2) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var2.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var3 = x340Var2;
        boolean zY = x340Var3.Y(i & 1, (i & 1169) != 1168);
        rih1 rih1Var = rih1.a;
        if (!zY) {
            x340Var3.b0();
            return rih1Var;
        }
        ven0 ven0VarA = gfe0.a(x340Var3);
        boolean z2 = ((Configuration) x340Var3.k(AndroidCompositionLocals_androidKt.a)).screenHeightDp < 600;
        Object objT = x340Var3.T();
        if (objT == m4cVar) {
            objT = bb00.h(0, x340Var3);
        }
        err0 err0Var = (hdn0) objT;
        Object objT2 = x340Var3.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q(Boolean.TRUE);
            x340Var3.s0(objT2);
        }
        ven0 ven0Var = (ven0) objT2;
        los losVar = (los) ahi0Var2.R0;
        boolean zI = x340Var3.i(ahi0Var2) | ((i & 896) == 256);
        Object objT3 = x340Var3.T();
        boolean z3 = z2;
        if (zI || objT3 == m4cVar) {
            objT3 = new mvn0(ahi0Var2, ven0Var, iu30Var, (byte) 14);
            x340Var3.s0(objT3);
        }
        int i2 = i >> 3;
        qxd0.h(losVar, iu30Var, (iu30) objT3, x340Var3);
        Object objT4 = x340Var3.T();
        if (objT4 == m4cVar) {
            objT4 = v8r.q(Boolean.FALSE);
            x340Var3.s0(objT4);
        }
        ven0 ven0Var2 = (ven0) objT4;
        Boolean boolValueOf = Boolean.valueOf(list2.isEmpty());
        boolean z4 = (i & 112) == 32;
        Object objT5 = x340Var3.T();
        byte b = 17;
        lnm lnmVar = null;
        if (z4 || objT5 == m4cVar) {
            objT5 = new e3p0(g5r0Var2, ven0Var2, lnmVar, b);
            x340Var3.s0(objT5);
        }
        qxd0.t(boolValueOf, x340Var3, (vu30) objT5);
        boolean z5 = ((Boolean) ven0Var2.getValue()).booleanValue() && !list2.isEmpty();
        Object objT6 = x340Var3.T();
        if (objT6 == m4cVar) {
            objT6 = new q2j0(ven0Var2, (byte) 17);
            x340Var3.s0(objT6);
        }
        Function0 function0 = (Function0) objT6;
        yv31 yv31Var = (yv31) o7h.s0(g5r0Var2.a);
        String str = yv31Var != null ? yv31Var.a : null;
        Object objT7 = x340Var3.T();
        if (objT7 == m4cVar) {
            objT7 = new vk1(ven0Var2, (lnm) null, (byte) 22);
            x340Var3.s0(objT7);
        }
        qxd0.t(str, x340Var3, (vu30) objT7);
        List list3 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((zv31) it.next()).a);
        }
        Set setP1 = o7h.p1(arrayList);
        boolean zG = x340Var3.g(str);
        Object objT8 = x340Var3.T();
        if (zG || objT8 == m4cVar) {
            objT8 = v8r.q(setP1);
            x340Var3.s0(objT8);
        }
        ven0 ven0Var3 = (ven0) objT8;
        boolean z6 = !setP1.equals((Set) ven0Var3.getValue()) && (!((Set) ven0Var3.getValue()).isEmpty() || ((Boolean) ven0Var2.getValue()).booleanValue());
        boolean zG2 = x340Var3.g(ven0Var3) | x340Var3.g(setP1);
        Object objT9 = x340Var3.T();
        if (zG2 || objT9 == m4cVar) {
            objT9 = new e3p0(setP1, ven0Var3, null, (byte) 18);
            x340Var3.s0(objT9);
        }
        qxd0.s(str, setP1, (vu30) objT9, x340Var3);
        err0 err0Var2 = err0Var;
        qim0 qim0VarB = uyn1.B(u291.d(nim0.a, 1.0f), 0.0f, 0.0f, 0.0f, ((wat) x340Var3.k(t4k.h)).M0(err0Var2.s()), 7);
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var3, 0);
        int iHashCode = Long.hashCode(x340Var3.T);
        xos0 xos0VarM = x340Var3.m();
        qim0 qim0VarE = zr7.E(x340Var3, qim0VarB);
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
        otw.c((maa) ((ynb0) ahi0Var2.e).get(), rih1Var, (qim0) null, (ipb1) null, x340Var3, 48, 12);
        if (z3) {
            x340Var3.i0(-1837244767);
            ahi0Var2.e(g5r0Var2, z5, function0, x340Var3, (i2 & 14) | 384);
            ahi0Var = ahi0Var2;
            g5r0Var = g5r0Var2;
            x340Var = x340Var3;
            x340Var.r(false);
        } else {
            boolean z7 = z5;
            x340Var = x340Var3;
            ahi0Var = ahi0Var2;
            if (list.isEmpty()) {
                g5r0Var = g5r0Var2;
                x340Var.i0(-1836760547);
                int i3 = i2 & 14;
                ahi0Var.h(g5r0Var, x340Var, i3);
                ahi0Var.j(g5r0Var, z7, function0, x340Var, i3 | 384);
                x340Var.r(false);
            } else {
                g5r0Var = g5r0Var2;
                x340Var.i0(-1837056442);
                ahi0Var.i(g5r0Var, z7, function0, z6, x340Var, (i2 & 14) | 384);
                x340Var.r(false);
            }
        }
        if (g5r0Var.e.isEmpty()) {
            x340Var.i0(-1835859315);
            x340Var.r(false);
        } else {
            x340Var.i0(-1836442890);
            its itsVar = (its) ((ynb0) ahi0Var.Q0).get();
            op80 op80Var = (op80) ven0VarA.getValue();
            j2i j2iVarR = apo.r(-1396398372, new f5r0(ahi0Var, g5r0Var, (byte) 2), x340Var);
            Object objT10 = x340Var.T();
            if (objT10 == m4cVar) {
                z = false;
                objT10 = new k5r0(err0Var2, (byte) 0);
                x340Var.s0(objT10);
            } else {
                z = false;
            }
            itsVar.a(j2iVarR, (iu30) objT10, op80Var, x340Var, 3126);
            x340Var.r(z);
        }
        x340Var.r(true);
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        boolean z;
        g471 g471Var;
        c380 c380VarA;
        String strK;
        byte b = this.a;
        z50 z50Var = z50.c;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        ArrayList arrayList = null;
        boolean z2 = true;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                qj0 qj0Var = (qj0) obj6;
                ilo1.n((zro0) obj2, (qj0) qj0Var.d, (umf0) qj0Var.e, (b0k) obj4, ((((Number) obj5).intValue() >> 3) & 14) | 576);
                return rih1Var;
            case 1:
                zyo0 zyo0Var = (zyo0) obj6;
                yyo0 yyo0Var = (yyo0) obj2;
                int iIntValue = ((Number) obj5).intValue();
                Set set = yyo0Var.a;
                x340 x340Var = (b0k) obj4;
                Object objT = x340Var.T();
                j06 j06Var = x340Var.a;
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(o7h.l1(set));
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                boolean zI = ((((iIntValue & 112) ^ 48) > 32 && x340Var.i(yyo0Var)) || (iIntValue & 48) == 32) | x340Var.i(ven0Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new hyg0(yyo0Var, ven0Var, (lnm) null, (byte) 28);
                    x340Var.s0(objT2);
                }
                qxd0.t(set, x340Var, (vu30) objT2);
                qim0 qim0VarH = u291.h(nim0Var, 0.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                zyo0Var.a.a(x340Var, 6);
                x340Var.r(true);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                x340Var.i0(1745124503);
                Iterator it = ((List) ven0Var.getValue()).iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    vyo0 vyo0Var = (vyo0) next;
                    x340Var.f0(742679986, vyo0Var);
                    Object objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT3);
                    }
                    ven0 ven0Var2 = (ven0) objT3;
                    boolean zContains = set.contains(vyo0Var);
                    Boolean boolValueOf = Boolean.valueOf(zContains);
                    boolean zI2 = x340Var.i(ven0Var2) | x340Var.h(zContains);
                    Object objT4 = x340Var.T();
                    if (zI2 || objT4 == m4cVar) {
                        objT4 = new hj6(zContains, ven0Var2, (lnm) null, (byte) 16);
                        x340Var.s0(objT4);
                    }
                    qxd0.t(boolValueOf, x340Var, (vu30) objT4);
                    boolean zBooleanValue = ((Boolean) ven0Var2.getValue()).booleanValue();
                    uwr uwrVar = cbx.a;
                    zyo0 zyo0Var2 = zyo0Var;
                    fq7.b(pbh.a, zBooleanValue, (qim0) null, xay.d(irn1.o0((int) jfv.h(cbx.c(x340Var).b.a), 0, ((jhx) cbx.c(x340Var).a.d).a, 2), (fra) null, 14), xay.l(14, irn1.o0((int) jfv.h(cbx.c(x340Var).b.a), 0, ((jhx) cbx.c(x340Var).a.d).a, 2)), (String) null, apo.r(1211913747, new tj6(zyo0Var2, vyo0Var, yyo0Var, i, ven0Var, ven0Var2), x340Var), x340Var, 1572870, 18);
                    x340Var.r(false);
                    it = it;
                    zyo0Var = zyo0Var2;
                    i = i2;
                    set = set;
                }
                x340Var.r(false);
                x340Var.r(true);
                return rih1Var;
            case 2:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                ((a2p0) obj6).c.invoke(apo.r(1426085900, new jyo0((y1p0) obj2, (iu30) obj3, (byte) 1), b0kVar), b0kVar, 6);
                return rih1Var;
            case 3:
                l6p0 l6p0Var = (l6p0) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var2 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                long jC = cbx.a(x340Var2).a.a.c();
                cua cuaVar = cbx.b(x340Var2).f;
                qim0 qim0VarF2 = dug.f(qim0VarF, jC, er31.b(16.0f));
                cvx cvxVar = cbx.b(x340Var2).b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                qim0 qim0VarY = uyn1.y(qim0VarF2, 4.0f, 8.0f);
                m6p0 m6p0Var = (m6p0) obj6;
                mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var2, 0);
                x340 x340Var3 = x340Var2;
                int iHashCode3 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM3 = x340Var3.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarY);
                hzj.A.getClass();
                x340 x340Var4 = x340Var2;
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
                nko1.H(mbhVarA2, x340Var2, y580.O0);
                nko1.H(xos0VarM3, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE3, x340Var2, y580.Y);
                x340Var4.i0(-1545960409);
                poo1.l(l6p0Var, m6p0Var.a, x340Var2, (iIntValue2 >> 3) & 14);
                cvx cvxVar3 = cbx.b(x340Var2).b;
                cvx cvxVar4 = cbx.b(x340Var2).b;
                rqo1.g(0, 0, x340Var2, uyn1.y(nim0Var, 12.0f, 8.0f));
                x340Var4.r(false);
                boolean z3 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var4.g(iu30Var)) || (iIntValue2 & 384) == 256;
                Object objT5 = x340Var4.T();
                if (z3 || objT5 == fkj0.X) {
                    objT5 = new tro0(iu30Var, (byte) 6);
                    x340Var4.s0(objT5);
                }
                poo1.j(new gbx(z50Var, (Function0) objT5), x340Var2, 0);
                x340Var4.r(true);
                return rih1Var;
            case 4:
                p7p0 p7p0Var = (p7p0) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                z72 z72Var = (z72) obj6;
                ynb0 ynb0Var = (ynb0) z72Var.t;
                tra0 tra0Var = (tra0) z72Var.i;
                ven0 ven0VarH = rwq.h(((yo2) ynb0Var.get()).s, x340Var5, 0);
                x340 x340Var6 = x340Var5;
                Object objT6 = x340Var6.T();
                Object obj7 = fkj0.X;
                if (objT6 == obj7) {
                    objT6 = v8r.q(Boolean.FALSE);
                    x340Var6.s0(objT6);
                }
                ven0 ven0Var3 = (ven0) objT6;
                Object objT7 = x340Var6.T();
                if (objT7 == obj7) {
                    objT7 = v8r.q((Object) null);
                    x340Var6.s0(objT7);
                }
                ven0 ven0Var4 = (ven0) objT7;
                boolean zP = too1.p((jre) ven0VarH.getValue());
                boolean zH = x340Var6.h(zP) | x340Var6.i(ven0Var3);
                Object objT8 = x340Var6.T();
                if (zH || objT8 == obj7) {
                    objT8 = new y72(zP, ven0Var3, (byte) 1);
                    x340Var6.s0(objT8);
                }
                qxd0.S((Function0) objT8, x340Var6);
                if (!((mr4) z72Var.f).s() || ((pe) z72Var.g).e()) {
                    x340Var6.i0(578605705);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(577402533);
                    Object objT9 = x340Var6.T();
                    if (objT9 == obj7) {
                        objT9 = v8r.q(Boolean.FALSE);
                        x340Var6.s0(objT9);
                    }
                    ven0 ven0Var5 = (ven0) objT9;
                    if (((Boolean) ven0Var3.getValue()).booleanValue()) {
                        ven0Var5.setValue(Boolean.TRUE);
                    }
                    if (((Boolean) ven0Var5.getValue()).booleanValue()) {
                        x340Var6.i0(577540731);
                        Object objT10 = x340Var6.T();
                        if (objT10 == obj7) {
                            objT10 = v8r.q(Boolean.FALSE);
                            x340Var6.s0(objT10);
                        }
                        ven0 ven0Var6 = (ven0) objT10;
                        boolean zI3 = x340Var6.i(ven0Var6);
                        Object objT11 = x340Var6.T();
                        if (zI3 || objT11 == obj7) {
                            objT11 = new vk1(ven0Var6, (lnm) null, (byte) 21);
                            x340Var6.s0(objT11);
                        }
                        qxd0.t(rih1Var, x340Var6, (vu30) objT11);
                        boolean zG = x340Var6.g(tra0Var);
                        Object objT12 = x340Var6.T();
                        if (zG || objT12 == obj7) {
                            objT12 = tra0Var.a((w9u0) z72Var.X, new q2j0(ven0Var3, (byte) 11));
                            x340Var6.s0(objT12);
                        }
                        otw.c((wra0) objT12, new ura0(((Boolean) ven0Var6.getValue()).booleanValue() && ((Boolean) ven0Var3.getValue()).booleanValue() && !zP, rq2.NPV_MARTINI_CHAT, "npv_martini_chat", p7p0Var.b ? 2 : p7p0Var.c ? 3 : 4, (String) ven0Var4.getValue(), (String) null, "spotify:internal:npv-mini-chat", 160), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                        z = false;
                        x340Var6.r(false);
                    } else {
                        z = false;
                        x340Var6.i0(578599753);
                        x340Var6.r(false);
                    }
                    x340Var6.r(z);
                }
                boolean zI4 = x340Var6.i(z72Var) | x340Var6.i(ven0Var4) | x340Var6.i(ven0Var3);
                Object objT13 = x340Var6.T();
                if (zI4 || objT13 == obj7) {
                    objT13 = new ofk0(z72Var, ven0Var4, ven0Var3, (lnm) null);
                    x340Var6.s0(objT13);
                }
                qxd0.t(rih1Var, x340Var6, (vu30) objT13);
                boolean z4 = p7p0Var.a;
                boolean z5 = (((iIntValue3 & 896) ^ 384) > 256 && x340Var6.g(iu30Var2)) || (iIntValue3 & 384) == 256;
                Object objT14 = x340Var6.T();
                if (z5 || objT14 == obj7) {
                    objT14 = new tro0(iu30Var2, (byte) 7);
                    x340Var6.s0(objT14);
                }
                too1.f(0, (Function0) objT14, x340Var6, z4);
                return rih1Var;
            case 5:
                wlp0 wlp0Var = (wlp0) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                String str = wlp0Var.d;
                zlp0 zlp0Var = (zlp0) obj6;
                gmp0 gmp0Var = new gmp0(str, zlp0Var.b.f());
                int i3 = (iIntValue4 & 896) ^ 384;
                boolean z6 = (i3 > 256 && x340Var7.g(iu30Var3)) || (iIntValue4 & 384) == 256;
                x340 x340Var8 = x340Var7;
                Object objT15 = x340Var8.T();
                if (z6 || objT15 == m4cVar2) {
                    objT15 = new wck0(iu30Var3, (byte) 16);
                    x340Var8.s0(objT15);
                }
                boolean z7 = false;
                hap1.b(gmp0Var, (iu30) objT15, null, x340Var8, 0);
                int i4 = wlp0Var.a;
                if (i4 == 0) {
                    x340Var8.i0(197541212);
                    x340Var8.r(false);
                } else {
                    x340Var8.i0(197541213);
                    if (ylp0.a[l1d.C(i4)] != 1) {
                        throw p3d1.k(x340Var8, -1660372825, false);
                    }
                    x340Var8.i0(-1660370787);
                    ic9 ic9Var = zlp0Var.a;
                    boolean z8 = (i3 > 256 && x340Var8.g(iu30Var3)) || (iIntValue4 & 384) == 256;
                    Object objT16 = x340Var8.T();
                    if (z8 || objT16 == m4cVar2) {
                        objT16 = new tro0(iu30Var3, (byte) 13);
                        x340Var8.s0(objT16);
                    }
                    ic9Var.q(((Context) ic9Var.b).getString(2131953679, str), (Function0) objT16);
                    z7 = false;
                    x340Var8.r(false);
                    x340Var8.r(false);
                }
                int i5 = wlp0Var.c;
                if (i5 == 0) {
                    x340Var8.i0(197774487);
                    x340Var8.r(z7);
                } else {
                    x340Var8.i0(197774488);
                    if (ylp0.b[l1d.C(i5)] != 1) {
                        throw p3d1.k(x340Var8, -140570479, false);
                    }
                    x340Var8.i0(-140568534);
                    boolean z9 = (i3 > 256 && x340Var8.g(iu30Var3)) || (iIntValue4 & 384) == 256;
                    Object objT17 = x340Var8.T();
                    if (z9 || objT17 == m4cVar2) {
                        objT17 = new tro0(iu30Var3, (byte) 14);
                        x340Var8.s0(objT17);
                    }
                    Function0 function0 = (Function0) objT17;
                    boolean z10 = (i3 > 256 && x340Var8.g(iu30Var3)) || (iIntValue4 & 384) == 256;
                    Object objT18 = x340Var8.T();
                    if (z10 || objT18 == m4cVar2) {
                        objT18 = new tro0(iu30Var3, (byte) 15);
                        x340Var8.s0(objT18);
                    }
                    yto1.a(str, function0, (Function0) objT18, x340Var8, 0);
                    x340Var8.r(false);
                    x340Var8.r(false);
                }
                return rih1Var;
            case 6:
                kmp0 kmp0Var = (kmp0) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var9 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                pt ptVar = (pt) obj6;
                o571 o571Var = kmp0Var.a;
                int i6 = (iIntValue5 & 48) == 0 ? iIntValue5 | ((iIntValue5 & 64) == 0 ? x340Var9.g(kmp0Var) : x340Var9.i(kmp0Var) ? 32 : 16) : iIntValue5;
                if ((iIntValue5 & 384) == 0) {
                    i6 |= x340Var9.i(iu30Var4) ? 256 : 128;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(i6 & 1, (i6 & 1169) != 1168)) {
                    Object[] objArr = {o571Var};
                    Object objT19 = x340Var10.T();
                    m4c m4cVar3 = fkj0.X;
                    if (objT19 == m4cVar3) {
                        objT19 = wso0.P0;
                        x340Var10.s0(objT19);
                    }
                    ven0 ven0Var7 = (ven0) k5p1.s(objArr, (Function0) objT19, x340Var10, 48);
                    g471 g471VarH = ((drj0) ptVar.i).h(o571Var);
                    Boolean boolValueOf2 = Boolean.valueOf(kmp0Var.e);
                    int i7 = i6 & 112;
                    boolean zG2 = (i7 == 32 || ((i6 & 64) != 0 && x340Var10.i(kmp0Var))) | x340Var10.g(ven0Var7) | x340Var10.i(ptVar) | x340Var10.g(g471VarH);
                    Object objT20 = x340Var10.T();
                    if (zG2 || objT20 == m4cVar3) {
                        objT20 = new c6h0(kmp0Var, ptVar, g471VarH, ven0Var7, (lnm) null, (byte) 7);
                        g471Var = g471VarH;
                        x340Var10.s0(objT20);
                    } else {
                        g471Var = g471VarH;
                    }
                    idd1 idd1Var = o571.c;
                    qxd0.s(boolValueOf2, o571Var, (vu30) objT20, x340Var10);
                    ven0 ven0VarS = v8r.s(iu30Var4, x340Var10);
                    qim0 qim0VarN = anm1.N(o571Var.a, nim0Var);
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int i8 = i6;
                    int iHashCode4 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM4 = x340Var10.m();
                    qim0 qim0VarE4 = zr7.E(x340Var10, qim0VarN);
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
                    nko1.H(gfh0VarC2, x340Var10, y580.O0);
                    nko1.H(xos0VarM4, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE4, x340Var10, y580.Y);
                    String strO0 = cwl1.o0(x340Var10, g471Var.c());
                    boolean zG3 = x340Var10.g(ven0VarS);
                    Object objT21 = x340Var10.T();
                    if (zG3 || objT21 == m4cVar3) {
                        objT21 = new q2j0(ven0VarS, (byte) 12);
                        x340Var10.s0(objT21);
                    }
                    Function0 function1 = (Function0) objT21;
                    boolean zI5 = x340Var10.i(ptVar) | (i7 == 32 || ((i8 & 64) != 0 && x340Var10.i(kmp0Var)));
                    Object objT22 = x340Var10.T();
                    if (zI5 || objT22 == m4cVar3) {
                        objT22 = new pdp0(ptVar, kmp0Var);
                        x340Var10.s0(objT22);
                    }
                    r1p1.b(strO0, function1, null, (Function0) objT22, apo.r(1786494418, new jyo0(g471Var, kmp0Var, (byte) 3), x340Var10), x340Var10, 24576, 4);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 7:
                fop0 fop0Var = (fop0) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var11 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (fop0Var instanceof eop0) {
                    x340 x340Var12 = x340Var11;
                    x340Var12.i0(-158716644);
                    mod.b(oi7.a.a(((lop0) obj6).b), apo.r(1029468934, new jyo0(fop0Var, iu30Var5, (byte) 4), x340Var12), x340Var12, 56);
                    x340Var12.r(false);
                } else {
                    x340 x340Var13 = x340Var11;
                    x340Var13.i0(-158044905);
                    x340Var13.r(false);
                }
                return rih1Var;
            case 8:
                iu30 iu30Var6 = (iu30) obj3;
                int iIntValue6 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                boolean z11 = ((oop0) obj2).a;
                x340 x340Var14 = (b0k) obj4;
                boolean zH2 = x340Var14.h(z11);
                Object objT23 = x340Var14.T();
                if (zH2 || objT23 == m4cVar4) {
                    objT23 = z11 ? nop0.b : nop0.a;
                    x340Var14.s0(objT23);
                }
                nop0 nop0Var = (nop0) objT23;
                boolean zH3 = x340Var14.h(z11);
                res resVar = (res) obj6;
                Object objT24 = x340Var14.T();
                if (zH3 || objT24 == m4cVar4) {
                    objT24 = new pk1(z11 ? qk1.b : qk1.a, false, (String) resVar.g, (String) resVar.h, (j7p1) null, 18);
                    x340Var14.s0(objT24);
                }
                pk1 pk1Var = (pk1) objT24;
                qim0 qim0VarN2 = anm1.N("offline_backup_add_to_header_action_" + z11, nim0Var);
                if ((((iIntValue6 & 896) ^ 384) <= 256 || !x340Var14.g(iu30Var6)) && (iIntValue6 & 384) != 256) {
                    z2 = false;
                }
                boolean zE = x340Var14.e(nop0Var.ordinal()) | z2;
                Object objT25 = x340Var14.T();
                if (zE || objT25 == m4cVar4) {
                    objT25 = new ocp0(iu30Var6, nop0Var, (byte) 26);
                    x340Var14.s0(objT25);
                }
                h7p1.a(pk1Var, new gbx(z50Var, (Function0) objT25), qim0VarN2, null, null, x340Var14, 0, 24);
                return rih1Var;
            case 9:
                hwq hwqVar = (hwq) obj2;
                x340 x340Var15 = (b0k) obj4;
                ((Number) obj5).intValue();
                l1b l1bVar = (l1b) obj6;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var15, 0);
                x340 x340Var16 = x340Var15;
                int iHashCode5 = Long.hashCode(x340Var16.T);
                xos0 xos0VarM5 = x340Var16.m();
                qim0 qim0VarE5 = zr7.E(x340Var15, nim0Var);
                hzj.A.getClass();
                x340 x340Var17 = x340Var15;
                if (x340Var17.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var17.m0();
                if (x340Var17.S) {
                    x340Var17.l(n4kVar);
                } else {
                    x340Var17.v0();
                }
                nko1.H(jw31VarA, x340Var15, y580.O0);
                nko1.H(xos0VarM5, x340Var15, y580.N0);
                nko1.H(Integer.valueOf(iHashCode5), x340Var15, y580.R0);
                nko1.F(x340Var15);
                nko1.H(qim0VarE5, x340Var15, y580.Y);
                uq8 uq8Var = l1bVar.b;
                j7e0 j7e0Var = hwqVar.g;
                boolean z12 = j7e0Var instanceof j7e0;
                fbp1 fbp1Var = z12 ? j7e0Var.a.n : swp0.c;
                if (z12) {
                    zuc0 zuc0Var = j7e0Var.a;
                    smc0 smc0VarN = k4p1.n();
                    if (zuc0Var.c()) {
                        smc0VarN.add(ell.d);
                    }
                    if (zuc0Var.k) {
                        smc0VarN.add(ell.b);
                    }
                    c380VarA = mqo1.A(k4p1.k(smc0VarN));
                } else {
                    c380VarA = fg91.b;
                }
                uq8Var.D(false, 1, fbp1Var, c380VarA, (vu30) null, x340Var15, 24630);
                x340Var17.r(true);
                return rih1Var;
            case 10:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                doe doeVar = (doe) obj6;
                j7e0 j7e0Var2 = ((hwq) obj2).g;
                boolean z13 = j7e0Var2 instanceof j7e0;
                ArrayList arrayList2 = z6x.a;
                if (z13) {
                    fjf1 fjf1Var = j7e0Var2.a.p;
                    fjf1 fjf1Var2 = fjf1Var instanceof fjf1 ? fjf1Var : null;
                    if (fjf1Var2 != null) {
                        List list = fjf1Var2.b;
                        ArrayList arrayList3 = new ArrayList(q7h.U(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((yif1) it2.next()).a);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj8 : arrayList3) {
                            if (((String) obj8).length() > 0) {
                                arrayList4.add(obj8);
                            }
                        }
                        arrayList = arrayList4;
                    }
                    if (arrayList != null) {
                        arrayList2 = arrayList;
                    }
                }
                doeVar.e(arrayList2, b0kVar2, 0);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                hwq hwqVar2 = (hwq) obj2;
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                foe foeVar = (foe) obj6;
                j7e0 j7e0Var3 = hwqVar2.g;
                foeVar.e(j7e0Var3 instanceof j7e0 ? j7e0Var3.a.i : "", hwqVar2.c ? zkt0.a : hwqVar2.b ? zkt0.b : zkt0.c, b0kVar3, 0);
                return rih1Var;
            case grn1.d /* 12 */:
                zqp0 zqp0Var = (zqp0) obj2;
                x340 x340Var18 = (b0k) obj4;
                ((Number) obj5).intValue();
                boolean z14 = zqp0Var.a;
                qim0 qim0VarI = zr7.i(pqo.h(nim0Var, z14), new epe0((byte) 7, z14));
                qlb qlbVar = (qlb) obj6;
                gfh0 gfh0VarC3 = t1c.c(een.d, false);
                x340 x340Var19 = x340Var18;
                int iHashCode6 = Long.hashCode(x340Var19.T);
                xos0 xos0VarM6 = x340Var19.m();
                qim0 qim0VarE6 = zr7.E(x340Var18, qim0VarI);
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
                nko1.H(gfh0VarC3, x340Var18, y580.O0);
                nko1.H(xos0VarM6, x340Var18, y580.N0);
                nko1.H(Integer.valueOf(iHashCode6), x340Var18, y580.R0);
                nko1.F(x340Var18);
                nko1.H(qim0VarE6, x340Var18, y580.Y);
                otw.c((xzq) qlbVar.e, zqp0Var.b, (qim0) null, (ipb1) null, x340Var18, 0, 12);
                x340Var20.r(true);
                return rih1Var;
            case 13:
                b0k b0kVar4 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(-912337769, new jyo0((et90) obj6, (hrp0) obj2, (byte) 6), b0kVar4), b0kVar4, 3078, 6);
                return rih1Var;
            case 14:
                b0k b0kVar5 = (b0k) obj4;
                ((Number) obj5).intValue();
                z72 z72Var2 = (z72) obj6;
                mod.b(oi7.a.a((gw70) z72Var2.Y), apo.r(511686570, new jyo0((zrp0) obj2, z72Var2, (byte) 7), b0kVar5), b0kVar5, 56);
                return rih1Var;
            case 15:
                ntp0 ntp0Var = (ntp0) obj2;
                x340 x340Var21 = (b0k) obj4;
                ((Number) obj5).intValue();
                jfv jfvVar = ntp0Var.b;
                jfv jfvVar2 = ntp0Var.a;
                if (jfvVar2 == null || jfvVar == null) {
                    x340 x340Var22 = x340Var21;
                    x340Var22.i0(2021838492);
                    x340Var22.r(false);
                } else {
                    x340 x340Var23 = x340Var21;
                    x340Var23.i0(2021544426);
                    long jP = jfv.p(pap1.z(jfvVar2, jfvVar).a, fdg1.l0(((qtp0) obj6).a.b(), ngv.d));
                    boolean zF = x340Var23.f(jP);
                    Object objT26 = x340Var23.T();
                    if (zF || objT26 == fkj0.X) {
                        objT26 = new mvc((byte) 1, jP);
                        x340Var23.s0(objT26);
                    }
                    idd1 idd1Var2 = new idd1((Function0) objT26);
                    if (jfv.h(jP) <= 0) {
                        strK = x0d.k(x340Var23, 114149575, 2131961917, x340Var23, false);
                    } else if (((Number) idd1Var2.getValue()).intValue() > 0) {
                        x340Var23.i0(114153008);
                        strK = cwl1.U(2131820892, ((Number) idd1Var2.getValue()).intValue(), new Object[]{Integer.valueOf(((Number) idd1Var2.getValue()).intValue())}, x340Var23);
                        x340Var23.r(false);
                    } else {
                        strK = x0d.k(x340Var23, 114158001, 2131961918, x340Var23, false);
                    }
                    p9p1.j(0, strK, x340Var23, null);
                    x340Var23.r(false);
                }
                return rih1Var;
            case 16:
                return a(obj, obj2, obj3, obj4, obj5);
            case 17:
                return d(obj, obj2, obj3, obj4, obj5);
            case 18:
                return e(obj, obj2, obj3, obj4, obj5);
            case 19:
                return f(obj, obj2, obj3, obj4, obj5);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return g(obj, obj2, obj3, obj4, obj5);
            case 21:
                return h(obj, obj2, obj3, obj4, obj5);
            case 22:
                return i(obj, obj2, obj3, obj4, obj5);
            case 23:
                return j(obj, obj2, obj3, obj4, obj5);
            case 24:
                return k(obj, obj2, obj3, obj4, obj5);
            case 25:
                return m(obj, obj2, obj3, obj4, obj5);
            case 26:
                return n(obj, obj2, obj3, obj4, obj5);
            case 27:
                return o(obj, obj2, obj3, obj4, obj5);
            case 28:
                return p(obj, obj2, obj3, obj4, obj5);
            default:
                k8r0 k8r0Var = (k8r0) obj2;
                l8r0 l8r0Var = (l8r0) obj6;
                l8r0Var.e(k8r0Var.b, k8r0Var.d, l8r0Var.b.a() && k8r0Var.c, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() << 6) & 57344);
                return rih1Var;
        }
    }
}
