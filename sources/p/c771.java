package p;

import android.os.Parcelable;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c771 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ avl1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c771(avl1 avl1Var, byte b) {
        super(5);
        this.a = b;
        this.b = avl1Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        ze71 ze71Var;
        xx71 xx71Var = (xx71) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        res resVar = this.b;
        String str = xx71Var.a;
        if ((iIntValue & 48) == 0) {
            i = ((iIntValue & 64) == 0 ? x340Var.g(xx71Var) : x340Var.i(xx71Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            boolean zG = x340Var2.g(str);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                w1q w1qVar = (w1q) resVar.d;
                Set set = pcf.a;
                String strConcat = "spotify:chat-shares:".concat(str);
                switch (w1qVar.a) {
                    case 0:
                        i2q i2qVar = w1qVar.b;
                        teq teqVar = i2qVar.b;
                        ze71Var = new ze71((lzn0) teqVar.i.get(), teqVar.a.A(), (a9d) i2qVar.c.g3.get(), str, strConcat);
                        break;
                    default:
                        teq teqVar2 = w1qVar.b.c;
                        ze71Var = new ze71((lzn0) teqVar2.i.get(), teqVar2.a.A(), (a9d) teqVar2.b.V1.get(), str, strConcat);
                        break;
                }
                objT = ze71Var;
                x340Var2.s0(objT);
            }
            lte lteVar = (lte) resVar.e;
            Parcelable.Creator creator = w4i1.CREATOR;
            u4p1.G(xx71Var, (ze71) objT, lteVar, iu30Var, (qim0) null, x340Var2, ((i >> 3) & 14) | ((i << 3) & 7168));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Number) obj5).intValue();
        o6p1.d(((y581) obj2).a, (yup0) this.b.d, (qim0) null, (b0k) obj4, 0);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        qim0 qim0VarT = l6o1.t(nim0.a, l6o1.C(0, 0, 1, x340Var), 14);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        d36 d36Var = new d36(8.0f, true, new um5(false));
        jd6 jd6Var = this.b;
        jw31 jw31VarA = ew31.a(d36Var, een.Z, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarT);
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
        x340Var3.i0(1063477709);
        Iterator it = ((List) jd6Var.f).iterator();
        while (it.hasNext()) {
            otw.c((tyq) it.next(), obj2, (qim0) null, (ipb1) null, x340Var, iIntValue & 112, 12);
        }
        x340Var3.r(false);
        x340Var3.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i;
        ag81 ag81Var = (cg81) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = ((iIntValue & 64) == 0 ? x340Var.g(ag81Var) : x340Var.i(ag81Var) ? 32 : 16) | iIntValue;
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
        dea0 dea0Var = this.b;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var2, nim0.a);
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
        nko1.H(mbhVarA, x340Var2, y580.O0);
        nko1.H(xos0VarM, x340Var2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
        nko1.F(x340Var2);
        nko1.H(qim0VarE, x340Var2, y580.Y);
        if (ag81Var.equals(zf81.a)) {
            x340Var2.i0(905757154);
            x340Var2.r(false);
        } else if (ag81Var.equals(bg81.a)) {
            x340Var2.i0(905758319);
            dea0Var.g(x340Var2, 6);
            x340Var2.r(false);
        } else if (ag81Var.equals(yf81.a)) {
            x340Var2.i0(905759829);
            dea0Var.e(iu30Var, x340Var2, ((i >> 3) & 112) | 6);
            x340Var2.r(false);
        } else {
            if (!(ag81Var instanceof ag81)) {
                throw p3d1.k(x340Var2, 905756261, false);
            }
            x340Var2.i0(-1986155208);
            dea0Var.f(ag81Var, x340Var2, (i >> 3) & 14);
            boolean zI = x340Var2.i(dea0Var);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new dg81(dea0Var, (lnm) null, (byte) 1);
                x340Var2.s0(objT);
            }
            qxd0.t(rih1Var, x340Var2, (vu30) objT);
            x340Var2.r(false);
        }
        x340Var2.r(true);
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i;
        gg81 gg81Var = (ig81) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        jg81 jg81Var = this.b;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(gg81Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (!x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            x340Var2.b0();
        } else if (gg81Var instanceof hg81) {
            x340Var2.i0(2824069);
            jg81Var.e(x340Var2, 0);
            x340Var2.r(false);
        } else {
            if (!(gg81Var instanceof gg81)) {
                throw p3d1.k(x340Var2, 2822847, false);
            }
            x340Var2.i0(2825724);
            String str = gg81Var.a;
            rhq rhqVar = jg81Var.b;
            boolean z = (i & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new pc81(iu30Var, (byte) 6);
                x340Var2.s0(objT);
            }
            h1p1.f(str, rhqVar, (qim0) null, (Function0) objT, x340Var2, 0);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x021f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0281  */
    /* JADX WARN: Code duplicated, block: B:76:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x02cf  */
    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        tl3 tl3Var;
        boolean z;
        Function0 function0;
        m4c m4cVar;
        iu30 iu30Var;
        boolean z2;
        boolean z3;
        Object objT;
        erl1 erl1Var;
        iu30 iu30Var2;
        Function0 function1;
        boolean z4;
        Object objT2;
        wg81 wg81Var = (wg81) obj2;
        iu30 iu30Var3 = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        tl3 tl3Var2 = een.d;
        m4c m4cVar2 = fkj0.X;
        WeakHashMap weakHashMap = osl1.x;
        erl1 mih1Var = new mih1(lhc.g(x340Var).g, lhc.g(x340Var).b);
        zg81 zg81Var = this.b;
        if (!zg81Var.k(wg81Var) || wg81Var.d) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1445217090);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1445159430);
            boolean z5 = (((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var3)) || (iIntValue & 384) == 256;
            Object objT3 = x340Var3.T();
            if (z5 || objT3 == m4cVar2) {
                objT3 = new pc81(iu30Var3, (byte) 9);
                x340Var3.s0(objT3);
            }
            q3p1.b(0, 1, (Function0) objT3, x340Var3, false);
            x340Var3.r(false);
        }
        nim0 nim0Var = nim0.a;
        qim0 qim0VarD = u291.d(nim0Var, 1.0f);
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var4 = x340Var;
        int iHashCode = Long.hashCode(x340Var4.T);
        xos0 xos0VarM = x340Var4.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
        hzj.A.getClass();
        x340 x340Var5 = x340Var;
        if (x340Var5.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var5.m0();
        boolean z6 = x340Var5.S;
        Function0 function2 = hmb0.t1;
        if (z6) {
            x340Var5.l(function2);
        } else {
            x340Var5.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(mbhVarA, x340Var, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var, lljVar3);
        nko1.F(x340Var);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var, lljVar4);
        int iA = zg81Var.a.a();
        int i = rqt0.f;
        boolean z7 = true;
        if (iA == 1) {
            x340Var5.i0(1234493073);
            qim0 qim0VarY = too1.y(nim0Var, new bgc0(mih1Var, 16 | i));
            gfh0 gfh0VarC = t1c.c(tl3Var2, false);
            int iHashCode2 = Long.hashCode(x340Var5.T);
            xos0 xos0VarM2 = x340Var5.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
            x340Var5.m0();
            tl3Var = tl3Var2;
            if (x340Var5.S) {
                x340Var5.l(function2);
            } else {
                x340Var5.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            i3a.l(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            zg81Var.i(wg81Var, iu30Var3, x340Var, (iIntValue >> 3) & 126);
            z7 = true;
            x340Var5.r(true);
            z = false;
            zg81Var.j(null, x340Var, 0);
            x340Var5.r(false);
        } else {
            tl3Var = tl3Var2;
            z = false;
            x340Var5.i0(1234703532);
            x340Var5.r(false);
        }
        qim0 qim0VarF = u291.f(new wnb0(1.0f, z7), 1.0f);
        tl3 tl3Var3 = tl3Var;
        gfh0 gfh0VarC2 = t1c.c(tl3Var3, z);
        int iHashCode3 = Long.hashCode(x340Var5.T);
        xos0 xos0VarM3 = x340Var5.m();
        qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF);
        x340Var5.m0();
        if (x340Var5.S) {
            function0 = function2;
            x340Var5.l(function0);
        } else {
            function0 = function2;
            x340Var5.v0();
        }
        nko1.H(gfh0VarC2, x340Var, lljVar);
        nko1.H(xos0VarM3, x340Var, lljVar2);
        i3a.l(iHashCode3, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE3, x340Var, lljVar4);
        x340Var5.i0(-967602184);
        qim0 qim0VarY2 = too1.y(u291.d(nim0Var, 1.0f), new bgc0(mih1Var, i));
        if (zg81Var.k(wg81Var)) {
            Object objT4 = x340Var5.T();
            m4cVar = m4cVar2;
            if (objT4 == m4cVar) {
                objT4 = oa81.S0;
                x340Var5.s0(objT4);
            }
            qim0VarY2 = qim0VarY2.then(s161.a(nim0Var, (iu30) objT4));
        } else {
            m4cVar = m4cVar2;
        }
        x340Var5.r(false);
        boolean zI = x340Var5.i(zg81Var) | x340Var5.i(mih1Var) | x340Var5.i(wg81Var);
        int i2 = (iIntValue & 896) ^ 384;
        if (i2 <= 256 || !x340Var5.g(iu30Var3)) {
            iu30Var = iu30Var3;
            if ((iIntValue & 384) != 256) {
                z2 = false;
            }
            z3 = z2 | zI;
            objT = x340Var5.T();
            if (!z3 || objT == m4cVar) {
                iu30 iu30Var4 = iu30Var;
                objT = new e971((Object) zg81Var, (Object) wg81Var, (Object) mih1Var, (Object) iu30Var4, (byte) 6);
                erl1Var = mih1Var;
                iu30Var2 = iu30Var4;
                x340Var5.s0(objT);
            } else {
                erl1Var = mih1Var;
                iu30Var2 = iu30Var;
            }
            erl1 erl1Var2 = erl1Var;
            function1 = function0;
            h4o1.c(qim0VarY2, (es41) null, (g36) null, (nl3) null, false, (iu30) objT, x340Var, 0);
            boolean zK = zg81Var.k(wg81Var);
            z4 = (i2 <= 256 && x340Var5.g(iu30Var2)) || (iIntValue & 384) == 256;
            objT2 = x340Var5.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new pc81(iu30Var2, (byte) 10);
                x340Var5.s0(objT2);
            }
            zg81Var.e(0, (Function0) objT2, x340Var, h2c.a.b(nim0Var), zK);
            x340Var5.r(true);
            qim0 qim0VarD2 = yoo1.D(nim0Var, erl1Var2);
            gfh0 gfh0VarC3 = t1c.c(tl3Var3, false);
            int iHashCode4 = Long.hashCode(x340Var5.T);
            xos0 xos0VarM4 = x340Var5.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarD2);
            x340Var5.m0();
            if (x340Var5.S) {
                x340Var5.l(function1);
            } else {
                x340Var5.v0();
            }
            nko1.H(gfh0VarC3, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            i3a.l(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            zg81Var.j(null, x340Var, 0);
            x340Var5.r(true);
            x340Var5.r(true);
            return rih1.a;
        }
        iu30Var = iu30Var3;
        z2 = true;
        z3 = z2 | zI;
        objT = x340Var5.T();
        if (z3) {
            iu30 iu30Var5 = iu30Var;
            objT = new e971((Object) zg81Var, (Object) wg81Var, (Object) mih1Var, (Object) iu30Var5, (byte) 6);
            erl1Var = mih1Var;
            iu30Var2 = iu30Var5;
            x340Var5.s0(objT);
        } else {
            iu30 iu30Var6 = iu30Var;
            objT = new e971((Object) zg81Var, (Object) wg81Var, (Object) mih1Var, (Object) iu30Var6, (byte) 6);
            erl1Var = mih1Var;
            iu30Var2 = iu30Var6;
            x340Var5.s0(objT);
        }
        erl1 erl1Var3 = erl1Var;
        function1 = function0;
        h4o1.c(qim0VarY2, (es41) null, (g36) null, (nl3) null, false, (iu30) objT, x340Var, 0);
        boolean zK2 = zg81Var.k(wg81Var);
        if (i2 <= 256) {
        }
        objT2 = x340Var5.T();
        if (z4) {
            objT2 = new pc81(iu30Var2, (byte) 10);
            x340Var5.s0(objT2);
        } else {
            objT2 = new pc81(iu30Var2, (byte) 10);
            x340Var5.s0(objT2);
        }
        zg81Var.e(0, (Function0) objT2, x340Var, h2c.a.b(nim0Var), zK2);
        x340Var5.r(true);
        qim0 qim0VarD3 = yoo1.D(nim0Var, erl1Var3);
        gfh0 gfh0VarC4 = t1c.c(tl3Var3, false);
        int iHashCode5 = Long.hashCode(x340Var5.T);
        xos0 xos0VarM5 = x340Var5.m();
        qim0 qim0VarE5 = zr7.E(x340Var, qim0VarD3);
        x340Var5.m0();
        if (x340Var5.S) {
            x340Var5.l(function1);
        } else {
            x340Var5.v0();
        }
        nko1.H(gfh0VarC4, x340Var, lljVar);
        nko1.H(xos0VarM5, x340Var, lljVar2);
        i3a.l(iHashCode5, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE5, x340Var, lljVar4);
        zg81Var.j(null, x340Var, 0);
        x340Var5.r(true);
        x340Var5.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        xu30 xu30Var;
        ksw kswVar = (ksw) obj;
        ci81 ci81Var = (ci81) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        if (ci81Var.d) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1773831832);
            boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new pc81(iu30Var, (byte) 11);
                x340Var2.s0(objT);
            }
            aym.f(kswVar, 0, (Function0) objT, x340Var2, iIntValue & 14, 1);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1773893336);
            x340Var3.r(false);
        }
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        x340 x340Var4 = x340Var;
        x340Var4.i0(472868281);
        uvx uvxVar = (uvx) x340Var4.k(vvx.a);
        tvx tvxVarB = uvxVar.f;
        if (tvxVarB == null) {
            x340Var4.i0(734505134);
            tvxVarB = gto1.B(uvxVar.a, x340Var4, uvxVar.c);
        } else {
            x340Var4.i0(734503832);
        }
        x340Var4.r(false);
        uvx uvxVarB = uvx.b(uvxVar, 0, tvx.a(tvxVarB, 0.0f, 6), (p3v) null, 23);
        x340Var4.r(false);
        fi81 fi81Var = ci81Var.e;
        if (fi81Var.equals(fi81.a)) {
            x340Var4.i0(1774424707);
            xu30 xu30VarR = apo.r(1049139328, new k681(this.b, (byte) 7), x340Var4);
            x340Var4.r(false);
            xu30Var = xu30VarR;
        } else {
            if (!fi81Var.equals(fi81.b)) {
                throw p3d1.k(x340Var4, 472878754, false);
            }
            x340Var4.i0(1774533299);
            x340Var4.r(false);
            xu30Var = null;
        }
        List list = ci81Var.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj6 : list) {
            if (!u890.j((n4d1) obj6, new m4d1(3))) {
                arrayList.add(obj6);
            }
        }
        j2i j2iVarZ = i9p1.z(arrayList, (j2i) null);
        String strO0 = cwl1.o0(x340Var4, 2131957343);
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var4.T();
        if (z2 || objT2 == m4cVar) {
            objT2 = new pc81(iu30Var, (byte) 12);
            x340Var4.s0(objT2);
        }
        Function0 function0 = (Function0) objT2;
        if (ihc1.y0(strO0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        jto1.b(qim0VarF, uvxVarB, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, apo.r(-1601665100, new ei81(ci81Var, (byte) 0), x340Var4), (xu30) null, (xu30) null, j2iVarZ, xu30Var, (xu30) null, (xu30) null, apo.r(1545899502, new ei81(ci81Var, (byte) 1), x340Var4), x340Var4, 100663360, 196608, 26300);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        gbx gbxVar;
        Object oi81Var;
        ti81 ti81Var = (ti81) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        li81 li81Var = ti81Var.h;
        boolean z = ti81Var.e;
        boolean z2 = ti81Var.j && z;
        Function0 function0 = null;
        li81 li81Var2 = (li81Var == null || !ti81Var.f || z) ? null : li81Var;
        if (li81Var2 == null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-409274660);
            x340Var2.r(false);
            gbxVar = null;
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-409274659);
            String strO0 = cwl1.o0(x340Var3, 2131962464);
            boolean zI = ((((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var3.i(li81Var2);
            Object objT = x340Var3.T();
            if (zI || objT == m4cVar) {
                objT = new pc81(iu30Var, li81Var2);
                x340Var3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            gbx gbxVar2 = new gbx(new y50(strO0), function1);
            x340Var3.r(false);
            gbxVar = gbxVar2;
        }
        int i = (iIntValue & 896) ^ 384;
        boolean z3 = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var4 = x340Var;
        Object objT2 = x340Var4.T();
        if (z3 || objT2 == m4cVar) {
            objT2 = new pc81(iu30Var, (byte) 14);
            x340Var4.s0(objT2);
        }
        Function0 function2 = (Function0) objT2;
        if (li81Var == null) {
            oi81Var = null;
        } else {
            if (gbxVar != null) {
                li81Var = null;
            }
            if (li81Var != null) {
                oi81Var = z != 0 ? new oi81() : new pi81();
            } else {
                oi81Var = null;
            }
        }
        if (oi81Var == null) {
            x340Var4.i0(-408684854);
        } else {
            x340Var4.i0(-408684853);
            boolean zI2 = x340Var4.i(oi81Var) | ((i > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256);
            Object objT3 = x340Var4.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new fh61(iu30Var, oi81Var, (byte) 24);
                x340Var4.s0(objT3);
            }
            function0 = (Function0) objT3;
        }
        x340Var4.r(false);
        Function0 function3 = function0;
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var4).b;
        qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 0.0f, 13);
        cvx cvxVar2 = cbx.b(x340Var4).b;
        qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, qim0VarB);
        Object objT4 = x340Var4.T();
        if (objT4 == m4cVar) {
            objT4 = yd81.t;
            x340Var4.s0(objT4);
        }
        kgx kgxVar = new kgx(0, (vu30) objT4, (vu30) null, (vu30) null, 13);
        cua cuaVar = cbx.b(x340Var4).f;
        cr31 cr31VarB = er31.b(8.0f);
        vzq0.a.getClass();
        cwl1.b(qim0VarZ, (tl3) null, cr31VarB, kgxVar, uzq0.b, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(313859569, new hh1(this.b, ti81Var, function2, function3, z2, (byte) 13), x340Var4), x340Var4, 0, 48, 1506);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        uwr uwrVar = cbx.a;
        sv71.a(48, 1, apo.r(1950675136, new nhg((aj81) obj2, jfv.h(cbx.c(b0kVar).b.b), this.b, (iu30) obj3), b0kVar), b0kVar, (qim0) null);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        lbt0 lbt0Var = (lbt0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        xfx xfxVar = this.b.a;
        qim0 qim0VarN = anm1.N("single_user", uyn1.x(nim0.a, 16.0f));
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new et61(iu30Var, (byte) 12);
            x340Var2.s0(objT);
        }
        xfo1.i(xfxVar, lbt0Var, qim0VarN, (iu30) objT, x340Var2, iIntValue & 112);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Number) obj5).intValue();
        this.b.f(uyn1.B(nim0.a, 0.0f, 0.0f, 8.0f, 0.0f, 11), (b0k) obj4, 0);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:212:0x0579  */
    /* JADX WARN: Code duplicated, block: B:216:0x0592  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        String str;
        Object obj6;
        Object obj7;
        int i;
        x340 x340Var;
        Object obj8;
        Object obj9;
        int i2;
        Object obj10;
        int i3;
        int i4;
        int i5;
        Object obj11;
        x340 x340Var2;
        Object objT;
        m4c m4cVar;
        Object objI;
        drr0 drr0Var;
        boolean zI;
        Object obj12;
        int i6;
        int i7;
        Object obj13;
        Object obj14;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        byte b2 = 2;
        nim0 nim0Var = nim0.a;
        Function0 function0 = null;
        boolean z = true;
        boolean z2 = false;
        rih1 rih1Var = rih1.a;
        c491 c491Var = this.b;
        switch (b) {
            case 0:
                x671 x671Var = (x671) obj2;
                iu30 iu30Var = (iu30) obj3;
                b0k b0kVar = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                u7p0 u7p0Var = (u7p0) c491Var;
                q671 q671Var = x671Var.a;
                if (q671Var instanceof q671) {
                    str = q671Var.b;
                } else {
                    if (!(q671Var instanceof r671)) {
                        eg.o();
                        return null;
                    }
                    str = x671Var.b.b;
                }
                u7p0Var.e(str, q671Var.getEnabled(), iu30Var, b0kVar, iIntValue & 896);
                return rih1Var;
            case 1:
                p871 p871Var = (p871) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                ((Number) obj5).intValue();
                z3i0 z3i0Var = (z3i0) c491Var;
                x340 x340Var3 = (b0k) obj4;
                boolean zI2 = x340Var3.i(z3i0Var);
                Object objT2 = x340Var3.T();
                if (zI2 || objT2 == fkj0.X) {
                    obj6 = objT2;
                    qv61 qv61Var = new qv61(z3i0Var, (byte) 7);
                    x340Var3.s0(qv61Var);
                    obj6 = qv61Var;
                }
                obj6 = objT2;
                cbp1.g((qim0) null, 0.0f, (Function0) obj6, apo.r(1533954825, new jt41(p871Var, iu30Var2, (byte) 18), x340Var3), x340Var3, 3072);
                return rih1Var;
            case 2:
                aa71 aa71Var = (aa71) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                ka71 ka71Var = (ka71) c491Var;
                boolean z3 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var4.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                x340 x340Var5 = x340Var4;
                Object objT3 = x340Var5.T();
                if (z3 || objT3 == fkj0.X) {
                    obj7 = objT3;
                    v5a v5aVar = new v5a(iu30Var3, (lnm) null, (byte) 12);
                    x340Var5.s0(v5aVar);
                    obj7 = v5aVar;
                }
                obj7 = objT3;
                qxd0.t(rih1Var, x340Var5, (vu30) obj7);
                mod.c(new ely0[]{oi7.a.a(ka71Var.a), mge0.a.a(ka71Var.b), mge0.b.a(ka71Var.c), mge0.c.a(ka71Var.d)}, apo.r(319665797, new hl11((Object) aa71Var, (Object) iu30Var3, (Object) ka71Var, (byte) 29), x340Var5), x340Var5, 56);
                return rih1Var;
            case 3:
                ra71 ra71Var = (ra71) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                h4p1 h4p1Var = ra71Var.j;
                if ((iIntValue3 & 48) == 0) {
                    i = iIntValue3 | (x340Var6.g(ra71Var) ? 32 : 16);
                } else {
                    i = iIntValue3;
                }
                if ((iIntValue3 & 384) == 0) {
                    i |= x340Var6.i(iu30Var4) ? 256 : 128;
                }
                x340 x340Var7 = x340Var6;
                if (!x340Var7.Y(i & 1, (i & 1169) != 1168)) {
                    x340Var7.b0();
                    return rih1Var;
                }
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                sa71 sa71Var = (sa71) c491Var;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var7.T);
                xos0 xos0VarM = x340Var7.m();
                qim0 qim0VarE = zr7.E(x340Var7, qim0VarD);
                hzj.A.getClass();
                if (x340Var7.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var7.m0();
                if (x340Var7.S) {
                    x340Var7.l(n4kVar);
                } else {
                    x340Var7.v0();
                }
                nko1.H(gfh0VarC, x340Var7, y580.O0);
                nko1.H(xos0VarM, x340Var7, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var7, y580.R0);
                nko1.F(x340Var7);
                nko1.H(qim0VarE, x340Var7, y580.Y);
                boolean z4 = (!hon1.x(ra71Var.a.toString()) || ra71Var.k == null || ra71Var.l == null) ? false : true;
                qim0 qim0VarR = z4 ? u291.r(nim0Var, 0.0f) : u291.d(nim0Var, 1.0f);
                boolean z5 = z4;
                ta71 ta71Var = new ta71(ra71Var.a, ra71Var.b, ra71Var.c, ra71Var.g, ra71Var.e, ra71Var.f, ra71Var.d, ra71Var.h, ra71Var.i);
                xwa xwaVar = !z5 ? sa71Var.c : null;
                boolean z6 = (i & 896) == 256;
                Object objT4 = x340Var7.T();
                if (z6 || objT4 == fkj0.X) {
                    objT4 = new iuy0(iu30Var4, (byte) 14);
                    x340Var = x340Var7;
                    x340Var.s0(objT4);
                } else {
                    x340Var = x340Var7;
                }
                if (!(h4p1Var instanceof ovj1)) {
                    objT4 = null;
                }
                no71.a(ta71Var, sa71Var.b, sa71Var.a, qim0VarR, xwaVar, (vu30) objT4, x340Var, 0, 0);
                if (z5) {
                    x340Var.i0(653844347);
                    und.a(sa71Var.c, null, 0.0f, apo.r(-840189331, new u841(ra71Var, (byte) 25), x340Var), x340Var, 3072, 6);
                    x340Var.r(false);
                } else {
                    x340Var.i0(654176853);
                    x340Var.r(false);
                }
                if (h4p1Var instanceof ovj1) {
                    x340Var.i0(654265978);
                    qim0 qim0VarA = h2c.a.a(u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3), een.X);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    k4p1.g(0.0f, 0, x340Var, anm1.N("media.share.playerprogressbar", uyn1.B(qim0VarA, 16.0f, 0.0f, 16.0f, 8.0f, 2)));
                    x340Var.r(false);
                } else {
                    x340Var.i0(654761141);
                    x340Var.r(false);
                }
                x340Var.r(true);
                return rih1Var;
            case 4:
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                bd71 bd71Var = (bd71) c491Var;
                a1g a1gVar = bd71Var.a;
                dwr0 dwr0Var = bd71Var.b;
                vur0 vur0Var = ((zc71) obj2).a;
                boolean z7 = (((iIntValue4 & 896) ^ 384) > 256 && x340Var8.g(iu30Var5)) || (iIntValue4 & 384) == 256;
                x340 x340Var9 = x340Var8;
                Object objT5 = x340Var9.T();
                if (z7 || objT5 == fkj0.X) {
                    obj8 = objT5;
                    m861 m861Var = new m861(iu30Var5, (byte) 10);
                    x340Var9.s0(m861Var);
                    obj8 = m861Var;
                }
                obj8 = objT5;
                u0p1.e(a1gVar, dwr0Var, vur0Var, (Function0) obj8, (qim0) null, x340Var9, 0);
                return rih1Var;
            case 5:
                xe71 xe71Var = (xe71) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                uvx uvxVar = new uvx((pgx) null, 0, (tvx) null, (p3v) null, 30);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                boolean z8 = (((iIntValue5 & 896) ^ 384) > 256 && x340Var10.g(iu30Var6)) || (iIntValue5 & 384) == 256;
                x340 x340Var11 = x340Var10;
                Object objT6 = x340Var11.T();
                if (z8 || objT6 == fkj0.X) {
                    obj9 = objT6;
                    m861 m861Var2 = new m861(iu30Var6, (byte) 11);
                    x340Var11.s0(m861Var2);
                    obj9 = m861Var2;
                }
                obj9 = objT6;
                gbx gbxVar = new gbx(z50.c, (Function0) obj9);
                x340Var11.i0(1549851762);
                j2i j2iVarR = apo.r(-642041897, new ict0(iu30Var6, (byte) 9), x340Var11);
                x340Var11.r(false);
                jto1.b(qim0VarF, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(1867519910, new ye71(xe71Var, z2 ? 1 : 0), x340Var11), (xu30) null, apo.r(266149543, new rt11(c491Var, (Object) xe71Var, (byte) 19), x340Var11), apo.r(-301822680, new ye71(xe71Var, (byte) 1), x340Var11), j2iVarR, (xu30) null, (xu30) null, apo.r(1721255724, new ye71(xe71Var, b2), x340Var11), x340Var11, 100663360, 196662, 25276);
                return rih1Var;
            case 6:
                gf71 gf71Var = (gf71) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                if ((iIntValue6 & 48) == 0) {
                    i2 = iIntValue6 | (x340Var12.g(gf71Var) ? 32 : 16);
                } else {
                    i2 = iIntValue6;
                }
                if ((iIntValue6 & 384) == 0) {
                    i2 |= x340Var12.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    rwj rwjVar = (rwj) c491Var;
                    boolean z9 = (i2 & 896) == 256;
                    Object objT7 = x340Var13.T();
                    if (z9 || objT7 == fkj0.X) {
                        obj10 = objT7;
                        m861 m861Var3 = new m861(iu30Var7, (byte) 13);
                        x340Var13.s0(m861Var3);
                        obj10 = m861Var3;
                    }
                    obj10 = objT7;
                    rwjVar.k(gf71Var, (Function0) obj10, x340Var13, (i2 >> 3) & 14);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 7:
                ii71 ii71Var = (ii71) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                if ((iIntValue7 & 48) == 0) {
                    i3 = iIntValue7 | (x340Var14.g(ii71Var) ? 32 : 16);
                } else {
                    i3 = iIntValue7;
                }
                if ((iIntValue7 & 384) == 0) {
                    i3 |= x340Var14.i(iu30Var8) ? 256 : 128;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    ((ki71) c491Var).e(ii71Var, iu30Var8, x340Var15, (i3 >> 3) & 126);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 8:
                wi71 wi71Var = (wi71) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                if ((iIntValue8 & 48) == 0) {
                    i4 = iIntValue8 | (x340Var16.g(wi71Var) ? 32 : 16);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 384) == 0) {
                    i4 |= x340Var16.i(iu30Var9) ? 256 : 128;
                }
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    ((aj71) c491Var).f(wi71Var, iu30Var9, x340Var17, (i4 >> 3) & 126);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 9:
                qk71 qk71Var = (qk71) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                tk71 tk71Var = (tk71) c491Var;
                m4c m4cVar2 = fkj0.X;
                if ((iIntValue9 & 48) == 0) {
                    i5 = iIntValue9 | (x340Var18.g(qk71Var) ? 32 : 16);
                } else {
                    i5 = iIntValue9;
                }
                if ((iIntValue9 & 384) == 0) {
                    i5 |= x340Var18.i(iu30Var10) ? 256 : 128;
                }
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(i5 & 1, (i5 & 1169) != 1168)) {
                    flw0 flw0Var = tk71Var.a;
                    int i8 = i5 & 896;
                    boolean z10 = i8 == 256;
                    Object objT8 = x340Var19.T();
                    Object obj15 = objT8;
                    if (z10 || objT8 == m4cVar2) {
                        et61 et61Var = new et61(iu30Var10, (byte) 3);
                        x340Var19.s0(et61Var);
                        obj15 = et61Var;
                    }
                    o2p1.d(flw0Var, (iu30) obj15, x340Var19, 0);
                    if (qk71Var instanceof ok71) {
                        x340Var19.i0(1866816503);
                        ok71 ok71Var = (ok71) qk71Var;
                        hl71 hl71Var = ok71Var.c;
                        if (hl71Var instanceof fl71) {
                            x340Var19.i0(1866868118);
                            c380 c380VarA = hl71Var.a();
                            boolean zG = x340Var19.g(c380VarA);
                            Object objT9 = x340Var19.T();
                            if (zG || objT9 == m4cVar2) {
                                obj11 = objT9;
                                Iterator it = c380VarA.iterator();
                                int i9 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i9 = -1;
                                    } else if (!((bb71) it.next()).a()) {
                                        i9++;
                                    }
                                }
                                if (i9 < 0) {
                                    i9 = 0;
                                }
                                Integer numValueOf = Integer.valueOf(i9);
                                x340Var19.s0(numValueOf);
                                obj11 = numValueOf;
                            }
                            int iIntValue10 = ((Number) obj11).intValue();
                            Object[] objArr = new Object[0];
                            df41 df41Var = dl71.b;
                            boolean zE = x340Var19.e(iIntValue10);
                            Object objT10 = x340Var19.T();
                            Object obj16 = objT10;
                            if (zE || objT10 == m4cVar2) {
                                ia9 ia9Var = new ia9(iIntValue10, (byte) 3);
                                x340Var19.s0(ia9Var);
                                obj16 = ia9Var;
                            }
                            dl71 dl71Var = (dl71) k5p1.u(objArr, df41Var, (Function0) obj16, x340Var19, 0);
                            tk71Var.e(dl71Var, mqo1.F(c380VarA), iu30Var10, x340Var19, i8);
                            vby0.a(384, apo.r(-1715020972, new gh61(qk71Var, tk71Var, dl71Var, iu30Var10, (byte) 5), x340Var19), x340Var19, (qim0) null, ok71Var.d instanceof qe71);
                            x340Var19.r(false);
                        } else if (u890.j(hl71Var, gl71.a)) {
                            x340Var19.i0(1868529718);
                            k5p1.f(anm1.N("share.sheet.share.preview.sections.loading", u291.i(u291.f(nim0Var, 1.0f), 0.0f, 478.0f)), x340Var19, 0);
                            x340Var19.r(false);
                        } else {
                            x340Var19.i0(1868798798);
                            x340Var19.r(false);
                        }
                        x340Var19.r(false);
                    } else {
                        x340Var19.i0(1868806734);
                        x340Var19.r(false);
                    }
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 10:
                km71 km71Var = (km71) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                mm71 mm71Var = (mm71) c491Var;
                List list = km71Var.a;
                if ((list instanceof Collection) && list.isEmpty()) {
                    x340Var2 = x340Var20;
                    x340Var2.i0(1418521376);
                    objT = x340Var2.T();
                    m4cVar = fkj0.X;
                    objI = objT;
                    if (objT == m4cVar) {
                        objI = us71.i(-1.0f, x340Var2);
                    }
                    drr0Var = (drr0) objI;
                    zI = x340Var2.i(mm71Var) | x340Var2.i(drr0Var);
                    Object objT11 = x340Var2.T();
                    obj12 = objT11;
                    if (zI) {
                        lm61 lm61Var = new lm61(mm71Var, drr0Var, function0, (byte) 13);
                        x340Var2.s0(lm61Var);
                        obj12 = lm61Var;
                    } else {
                        lm61 lm61Var2 = new lm61(mm71Var, drr0Var, function0, (byte) 13);
                        x340Var2.s0(lm61Var2);
                        obj12 = lm61Var2;
                    }
                    qxd0.t(rih1Var, x340Var2, (vu30) obj12);
                    g2p1.y(km71Var, drr0Var.s(), iu30Var11, x340Var2, (iIntValue11 & 896) | ((iIntValue11 >> 3) & 14));
                    x340Var2.r(false);
                } else {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (ihc1.y0((String) it2.next())) {
                            x340 x340Var21 = x340Var20;
                            x340Var21.i0(1418991367);
                            g2p1.r(x340Var21, 0);
                            x340Var21.r(false);
                        }
                    }
                    x340Var2 = x340Var20;
                    x340Var2.i0(1418521376);
                    objT = x340Var2.T();
                    m4cVar = fkj0.X;
                    objI = objT;
                    if (objT == m4cVar) {
                        objI = us71.i(-1.0f, x340Var2);
                    }
                    drr0Var = (drr0) objI;
                    zI = x340Var2.i(mm71Var) | x340Var2.i(drr0Var);
                    Object objT12 = x340Var2.T();
                    obj12 = objT12;
                    if (zI || objT12 == m4cVar) {
                        lm61 lm61Var3 = new lm61(mm71Var, drr0Var, function0, (byte) 13);
                        x340Var2.s0(lm61Var3);
                        obj12 = lm61Var3;
                    }
                    qxd0.t(rih1Var, x340Var2, (vu30) obj12);
                    g2p1.y(km71Var, drr0Var.s(), iu30Var11, x340Var2, (iIntValue11 & 896) | ((iIntValue11 >> 3) & 14));
                    x340Var2.r(false);
                }
                return rih1Var;
            case 11:
                fp71 fp71Var = (fp71) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                kp71 kp71Var = (kp71) c491Var;
                cb0 cb0Var = kp71Var.t;
                tln tlnVar = kp71Var.e;
                if ((iIntValue12 & 48) == 0) {
                    i6 = iIntValue12 | (x340Var22.g(fp71Var) ? 32 : 16);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 384) == 0) {
                    i6 |= x340Var22.i(iu30Var12) ? 256 : 128;
                }
                x340 x340Var23 = x340Var22;
                if (!x340Var23.Y(i6 & 1, (i6 & 1169) != 1168)) {
                    x340Var23.b0();
                } else if (fp71Var instanceof dp71) {
                    dp71 dp71Var = (dp71) fp71Var;
                    int iC = l1d.C(dp71Var.c);
                    if (iC == 0) {
                        x340Var23.i0(-1255851318);
                        g3p1.j(dp71Var, (qim0) null, x340Var23, (i6 >> 3) & 14);
                        x340Var23.r(false);
                    } else if (iC == 1) {
                        x340Var23.i0(-1255844983);
                        if (dp71Var.a.isEmpty()) {
                            x340Var23.i0(-276472997);
                            d4o1.c(dp71Var, kp71Var.a, tlnVar, iu30Var12, cb0Var, (qim0) null, x340Var23, ((i6 >> 3) & 14) | ((i6 << 3) & 7168));
                            x340Var23.r(false);
                        } else {
                            x340Var23.i0(-276139313);
                            u2p1.d(dp71Var, iu30Var12, kp71Var.a, kp71Var.c, (q251) kp71Var.Y.getValue(), kp71Var.d, tlnVar, kp71Var.X, cb0Var, (qim0) null, x340Var23, (i6 >> 3) & 126);
                            x340Var23.r(false);
                        }
                        x340Var23.r(false);
                    } else {
                        if (iC != 2) {
                            throw p3d1.k(x340Var23, -1255852076, false);
                        }
                        x340Var23.i0(-1255849296);
                        x2p1.d(dp71Var, kp71Var.f, iu30Var12, (qim0) null, x340Var23, ((i6 >> 3) & 14) | (i6 & 896));
                        x340Var23.r(false);
                    }
                }
                return rih1Var;
            case 12:
                vp71 vp71Var = (wp71) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var24 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                yp71 yp71Var = (yp71) c491Var;
                if ((iIntValue13 & 48) == 0) {
                    i7 = iIntValue13 | (x340Var24.g(vp71Var) ? 32 : 16);
                } else {
                    i7 = iIntValue13;
                }
                if ((iIntValue13 & 384) == 0) {
                    i7 |= x340Var24.i(iu30Var13) ? 256 : 128;
                }
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(i7 & 1, (i7 & 1169) != 1168)) {
                    qim0 qim0VarK = d9y0.k(nim0Var, vp71Var.getEnabled() ? 1.0f : 0.3f);
                    if (vp71Var instanceof up71) {
                        x340Var25.i0(-1906029748);
                        xto1.a((up71) vp71Var, yp71Var.e, iu30Var13, qim0VarK, x340Var25, (i7 & 896) | ((i7 >> 3) & 14));
                        x340Var25.r(false);
                    } else {
                        if (!(vp71Var instanceof vp71)) {
                            throw p3d1.k(x340Var25, -1906030830, false);
                        }
                        x340Var25.i0(-1906027054);
                        wro1.A(vp71Var, yp71Var.e, iu30Var13, qim0VarK, x340Var25, (i7 & 896) | ((i7 >> 3) & 14));
                        x340Var25.r(false);
                    }
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 13:
                bq71 bq71Var = (bq71) obj2;
                x340 x340Var26 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                yxb0 yxb0Var = (yxb0) c491Var;
                if ((iIntValue14 & 48) == 0) {
                    iIntValue14 |= x340Var26.g(bq71Var) ? 32 : 16;
                }
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(iIntValue14 & 1, (iIntValue14 & 1041) != 1040)) {
                    mod.b(fm31.a.a((em31) yxb0Var.f), apo.r(970545673, new jt41(bq71Var, yxb0Var, (byte) 26), x340Var27), x340Var27, 56);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            case 14:
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var28 = (b0k) obj4;
                int iIntValue15 = ((Number) obj5).intValue();
                w4i1 w4i1Var = ((ks71) obj2).a;
                rgi1 rgi1Var = new rgi1(Collections.singletonList(w4i1Var), w4i1Var.b, new mgi1(new pgi1(cwl1.o0(x340Var28, 2131962355), tsx.c, (Function0) null)));
                gw70 gw70Var = ((ls71) c491Var).a;
                if ((((iIntValue15 & 896) ^ 384) <= 256 || !x340Var28.g(iu30Var14)) && (iIntValue15 & 384) != 256) {
                    z = false;
                }
                x340 x340Var29 = x340Var28;
                Object objT13 = x340Var29.T();
                if (z || objT13 == fkj0.X) {
                    obj13 = objT13;
                    m861 m861Var4 = new m861(iu30Var14, (byte) 22);
                    x340Var29.s0(m861Var4);
                    obj13 = m861Var4;
                }
                obj13 = objT13;
                ero1.f(rgi1Var, (Function0) obj13, gw70Var, (qim0) null, x340Var29, 0, 8);
                return rih1Var;
            case 15:
                os71 os71Var = (os71) obj2;
                iu30 iu30Var15 = (iu30) obj3;
                x340 x340Var30 = (b0k) obj4;
                int iIntValue16 = ((Number) obj5).intValue();
                ls71 ls71Var = (ls71) ((ps71) c491Var).d.getValue();
                if ((((iIntValue16 & 896) ^ 384) <= 256 || !x340Var30.g(iu30Var15)) && (iIntValue16 & 384) != 256) {
                    z = false;
                }
                x340 x340Var31 = x340Var30;
                Object objT14 = x340Var31.T();
                if (z || objT14 == fkj0.X) {
                    obj14 = objT14;
                    m861 m861Var5 = new m861(iu30Var15, (byte) 23);
                    x340Var31.s0(m861Var5);
                    obj14 = m861Var5;
                }
                obj14 = objT14;
                n3p1.f(os71Var, (Function0) obj14, ls71Var, (qim0) null, x340Var31, (iIntValue16 >> 3) & 14);
                return rih1Var;
            case 16:
                return a(obj, obj2, obj3, obj4, obj5);
            case 17:
                n081 n081Var = (n081) obj2;
                iu30 iu30Var16 = (iu30) obj3;
                x340 x340Var32 = (b0k) obj4;
                int iIntValue17 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                gw70 gw70Var2 = ((p081) c491Var).b;
                int i10 = (iIntValue17 & 896) ^ 384;
                boolean z11 = (i10 > 256 && x340Var32.g(iu30Var16)) || (iIntValue17 & 384) == 256;
                x340 x340Var33 = x340Var32;
                Object objT15 = x340Var33.T();
                Object obj17 = objT15;
                if (z11 || objT15 == m4cVar3) {
                    m861 m861Var6 = new m861(iu30Var16, (byte) 27);
                    x340Var33.s0(m861Var6);
                    obj17 = m861Var6;
                }
                Function0 function1 = (Function0) obj17;
                if (n081Var.i) {
                    x340Var33.i0(736266328);
                    if ((i10 <= 256 || !x340Var33.g(iu30Var16)) && (iIntValue17 & 384) != 256) {
                        z = false;
                    }
                    Object objT16 = x340Var33.T();
                    Object obj18 = objT16;
                    if (z || objT16 == m4cVar3) {
                        m861 m861Var7 = new m861(iu30Var16, (byte) 28);
                        x340Var33.s0(m861Var7);
                        obj18 = m861Var7;
                    }
                    function0 = (Function0) obj18;
                } else {
                    x340Var33.i0(736307991);
                }
                x340Var33.r(false);
                a081.b(n081Var, gw70Var2, function1, function0, (qim0) null, x340Var33, (iIntValue17 >> 3) & 14);
                return rih1Var;
            case 18:
                i181 i181Var = (i181) c491Var;
                h5p1.j((h181) obj2, (p081) i181Var.i.getValue(), i181Var.c, (iuj) i181Var.e.get(), (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 19:
                return d(obj, obj2, obj3, obj4, obj5);
            case 20:
                return e(obj, obj2, obj3, obj4, obj5);
            case 21:
                return f(obj, obj2, obj3, obj4, obj5);
            case 22:
                return g(obj, obj2, obj3, obj4, obj5);
            case 23:
                return h(obj, obj2, obj3, obj4, obj5);
            case 24:
                return i(obj, obj2, obj3, obj4, obj5);
            case 25:
                return j(obj, obj2, obj3, obj4, obj5);
            case 26:
                return k(obj, obj2, obj3, obj4, obj5);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return m(obj, obj2, obj3, obj4, obj5);
            case 28:
                return n(obj, obj2, obj3, obj4, obj5);
            default:
                ((Number) obj5).intValue();
                k491 k491Var = ((b491) obj2).a;
                x340 x340Var34 = (b0k) obj4;
                wat watVar = (wat) x340Var34.k(t4k.h);
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var34).k;
                cpr0 cpr0Var = lee1Var.b;
                float fY = TextUnit.e(cpr0Var.c) ? watVar.y(cpr0Var.c) : watVar.y(lee1Var.a.b) * 1.3f;
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarB = u291.B(nim0Var2, (gra) null, 3);
                c491 c491Var2 = c491Var;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var34, 0);
                int iHashCode2 = Long.hashCode(x340Var34.T);
                xos0 xos0VarM2 = x340Var34.m();
                qim0 qim0VarE2 = zr7.E(x340Var34, qim0VarB);
                hzj.A.getClass();
                if (x340Var34.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var34.m0();
                if (x340Var34.S) {
                    x340Var34.l(n4kVar);
                } else {
                    x340Var34.v0();
                }
                nko1.H(mbhVarA, x340Var34, y580.O0);
                nko1.H(xos0VarM2, x340Var34, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var34, y580.R0);
                nko1.F(x340Var34);
                nko1.H(qim0VarE2, x340Var34, y580.Y);
                c491Var2.e(k491Var.a, k491Var.b, 0, 4, x340Var34, (qim0) null);
                x340Var34.i0(1358874587);
                int i11 = 0;
                while (i11 < 2) {
                    c491Var2.e(k491Var.a, fY, 0, 0, x340Var34, uyn1.B(nim0Var2, 0.0f, i11 == 0 ? 10.0f : 6.0f, 0.0f, 0.0f, 13));
                    i11++;
                }
                x340Var34.r(false);
                x340Var34.r(true);
                return rih1Var;
        }
    }
}
