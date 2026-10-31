package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aqj extends hab0 implements bv30 {
    public static final aqj N0;
    public static final aqj O0;
    public static final aqj P0;
    public static final aqj Q0;
    public static final aqj R0;
    public static final aqj S0;
    public static final aqj T0;
    public static final aqj U0;
    public static final aqj V0;
    public static final aqj W0;
    public static final aqj X;
    public static final aqj X0;
    public static final aqj Y;
    public static final aqj Y0;
    public static final aqj Z;
    public static final aqj Z0;
    public static final aqj a1;
    public static final aqj b;
    public static final aqj b1;
    public static final aqj c;
    public static final aqj c1;
    public static final aqj d;
    public static final aqj d1;
    public static final aqj e;
    public static final aqj e1;
    public static final aqj f;
    public static final aqj g;
    public static final aqj h;
    public static final aqj i;
    public static final aqj t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new aqj(i2, (byte) 0);
        c = new aqj(i2, (byte) 1);
        d = new aqj(i2, (byte) 2);
        e = new aqj(i2, (byte) 3);
        f = new aqj(i2, (byte) 4);
        g = new aqj(i2, (byte) 5);
        h = new aqj(i2, (byte) 6);
        i = new aqj(i2, (byte) 7);
        t = new aqj(i2, (byte) 8);
        X = new aqj(i2, (byte) 9);
        Y = new aqj(i2, (byte) 10);
        Z = new aqj(i2, (byte) 11);
        N0 = new aqj(i2, (byte) 12);
        O0 = new aqj(i2, (byte) 13);
        P0 = new aqj(i2, (byte) 14);
        Q0 = new aqj(i2, (byte) 15);
        R0 = new aqj(i2, (byte) 16);
        S0 = new aqj(i2, (byte) 17);
        T0 = new aqj(i2, (byte) 18);
        U0 = new aqj(i2, (byte) 19);
        V0 = new aqj(i2, (byte) 20);
        W0 = new aqj(i2, (byte) 21);
        X0 = new aqj(i2, (byte) 22);
        Y0 = new aqj(i2, (byte) 23);
        Z0 = new aqj(i2, (byte) 24);
        a1 = new aqj(i2, (byte) 25);
        b1 = new aqj(i2, (byte) 26);
        c1 = new aqj(i2, (byte) 27);
        d1 = new aqj(i2, (byte) 28);
        e1 = new aqj(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aqj(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i2;
        e4k1 e4k1Var = (e4k1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = ((iIntValue & 64) == 0 ? x340Var.g(e4k1Var) : x340Var.i(e4k1Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            qim0 qim0VarR = d7e.r(((ez61) ahl.a).a, u291.v(nim0.a, 220.0f), false);
            a4k1 a4k1Var = e4k1Var.c;
            if (u890.j(a4k1Var, b4k1.a)) {
                x340Var2.i0(1127681305);
                dxo1.k(qim0VarR, x340Var2, 0);
                x340Var2.r(false);
            } else if (u890.j(a4k1Var, z3k1.a)) {
                x340Var2.i0(1127683350);
                boolean z = (i2 & 896) == 256;
                Object objT = x340Var2.T();
                if (z || objT == fkj0.X) {
                    objT = new erj(iu30Var, (byte) 0);
                    x340Var2.s0(objT);
                }
                rwo1.h(0, (Function0) objT, x340Var2, qim0VarR);
                x340Var2.r(false);
            } else {
                if (!(a4k1Var instanceof a4k1)) {
                    throw p3d1.k(x340Var2, 1127679411, false);
                }
                x340Var2.i0(1127686690);
                b2p1.t(a4k1Var.a, qim0VarR, (vu30) null, x340Var2, 0, 4);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        cnx cnxVar = cnx.c;
        String strO0 = cwl1.o0(x340Var, 2131952951);
        String strO1 = cwl1.o0(x340Var, 2131952951);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new erj(iu30Var, (byte) 1);
            x340Var2.s0(objT);
        }
        qim0 qim0VarN = anm1.N("artifact-page-view-error", nim0.a);
        uwr uwrVar = cbx.a;
        hqn1.h(cnxVar, strO0, strO1, (Function0) objT, qim0VarN, cbx.a(x340Var2).b.d, true, false, (max) null, (vu30) null, x340Var2, cnx.d | 1572864, 896);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        cnx cnxVar = cnx.c;
        String strO0 = cwl1.o0(x340Var, 2131953884);
        String strO1 = cwl1.o0(x340Var, 2131953884);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new erj(iu30Var, (byte) 2);
            x340Var2.s0(objT);
        }
        qim0 qim0VarN = anm1.N("artifact-page-view-errors", nim0.a);
        uwr uwrVar = cbx.a;
        hqn1.h(cnxVar, strO0, strO1, (Function0) objT, qim0VarN, cbx.a(x340Var2).b.d, true, false, (max) null, (vu30) null, x340Var2, cnx.d | 1572864, 896);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String strK = ((ypk1) obj2).a;
        if (strK == null) {
            x340 x340Var2 = x340Var;
            strK = x0d.k(x340Var2, -487460653, 2131952952, x340Var2, false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-487461242);
            x340Var3.r(false);
        }
        String str = strK;
        xox xoxVar = xox.c;
        String strO0 = cwl1.o0(x340Var, 2131952952);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var4 = x340Var;
        Object objT = x340Var4.T();
        if (z || objT == fkj0.X) {
            objT = new erj(iu30Var, (byte) 3);
            x340Var4.s0(objT);
        }
        hqn1.h(xoxVar, str, strO0, (Function0) objT, anm1.N("artifact-page-voices-button", nim0.a), 0L, false, false, (max) null, (vu30) null, x340Var4, xox.d, 992);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        qyk1 qyk1Var = (syk1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if (qyk1Var.equals(ryk1.a)) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-909770960);
            x340Var2.r(false);
        } else {
            if (!(qyk1Var instanceof qyk1)) {
                throw p3d1.k(x340Var, -909772288, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(-909769659);
            j82.w(qyk1Var, iu30Var, x340Var3, (iIntValue >> 3) & 126);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        kxk1 kxk1Var = (kxk1) obj2;
        ((Number) obj5).intValue();
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(new mmr0(9, 16));
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        uwr uwrVar = cbx.a;
        cua cuaVar = cbx.b(x340Var).f;
        qim0 qim0VarQ = i1p1.q(nim0.a, er31.b(16.0f));
        Uri uri = Uri.parse(kxk1Var.a);
        fwx fwxVarG = hso1.G(box.c, 0L, 0L, x340Var, box.d, 30);
        fwx fwxVarG2 = hso1.G(cox.c, 0L, 0L, x340Var, cox.d, 30);
        boolean zI = x340Var.i(ven0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new f4g(ven0Var, (byte) 14);
            x340Var.s0(objT2);
        }
        ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, fwxVarG, fwxVarG2, false, false, (j6m) null, (iu30) objT2, (iu30) null, (iu30) null, 0L, x340Var, 2359296, 0, 126878);
        as80 as80Var = mif1.S0;
        String str = kxk1Var.b;
        eso1.h(ni7VarA, !ihc1.y0(str) ? new jsl(str) : isl.a, qim0VarQ, (p3v) null, (zvx) null, new ecx(((Number) ((mmr0) ven0Var.getValue()).a).intValue(), ((Number) ((mmr0) ven0Var.getValue()).b).intValue()), as80Var, (tl3) null, (ColorFilter) null, x340Var, 3072, 400);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj2).intValue();
        b0k b0kVar = (b0k) obj4;
        int iIntValue2 = ((Number) obj5).intValue();
        zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
        uwr uwrVar = cbx.a;
        zov0 zov0Var = cbx.b(b0kVar).g;
        t0c.d(iIntValue, new uvx(0, null, 3, zzq0Var, null, null, null, 0, new p3v(24.0f), 243), (qim0) null, b0kVar, ((iIntValue2 >> 3) & 14) | 64);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new erj(iu30Var, (byte) 4);
            x340Var2.s0(objT);
        }
        op71.i(0, (Function0) objT, x340Var2, (qim0) null);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        obg1.m((cxc0) obj2, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        boolean z;
        int i2;
        int i3;
        int i4;
        max maxVar;
        zen0 zen0Var;
        byte b2 = this.a;
        byte b3 = 22;
        byte b4 = 23;
        byte b5 = 3;
        byte b6 = 16;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                hyi1 hyi1Var = (hyi1) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                dyi1 dyi1Var = new dyi1(hyi1Var.a, hyi1Var.b, hyi1Var.c, hyi1Var.d, hyi1Var.e);
                boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
                x340 x340Var2 = x340Var;
                boolean zI = x340Var2.i(hyi1Var) | z2;
                Object objT = x340Var2.T();
                if (zI || objT == fkj0.X) {
                    objT = new puh(iu30Var, hyi1Var, (byte) 17);
                    x340Var2.s0(objT);
                }
                vyo1.s(dyi1Var, (iu30) objT, (qim0) null, x340Var2, 8);
                return rih1Var;
            case 1:
                o2j1 o2j1Var = (o2j1) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarH = l6o1.H(uyn1.z(cbx.b(x340Var3).b.a, 0.0f, 2, qim0VarF), l6o1.C(0, 0, 1, x340Var3), false, 14);
                era eraVar = een.Q0;
                f36 f36Var = h36.c;
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var3, 0);
                x340 x340Var4 = x340Var3;
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarH);
                hzj.A.getClass();
                x340 x340Var5 = x340Var3;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                boolean z3 = x340Var5.S;
                n4k n4kVar = hmb0.t1;
                if (z3) {
                    x340Var5.l(n4kVar);
                } else {
                    x340Var5.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var3, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var3, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var3, lljVar3);
                nko1.F(x340Var3);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var3, lljVar4);
                cvx cvxVar = cbx.b(x340Var3).b;
                op71.g(x340Var3, u291.h(nim0Var, 16.0f));
                cua cuaVar = cbx.b(x340Var3).f;
                qim0 qim0VarY = uyn1.y(dug.f(u291.f(i1p1.q(nim0Var, er31.b(8.0f)), 1.0f), cbx.a(x340Var3).a.d, d4o1.a), cbx.b(x340Var3).b.a, cbx.b(x340Var3).b.b);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var3, 0);
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarY);
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(n4kVar);
                } else {
                    x340Var5.v0();
                }
                nko1.H(mbhVarA2, x340Var3, lljVar);
                nko1.H(xos0VarM2, x340Var3, lljVar2);
                i3a.l(iHashCode2, x340Var3, lljVar3, x340Var3);
                nko1.H(qim0VarE2, x340Var3, lljVar4);
                g0p1.r(o2j1Var.a, (qim0) null, 0, 0L, x340Var3, 0, 14);
                op71.g(x340Var3, u291.h(nim0Var, cbx.b(x340Var3).b.a));
                zzo1.i(mqo1.A(o2j1Var.b), (qim0) null, (lee1) null, 0L, 3, (iu30) null, x340Var3, 0, 46);
                op71.g(x340Var3, u291.h(nim0Var, cbx.b(x340Var3).b.c));
                boolean z4 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var5.g(iu30Var2)) || (iIntValue2 & 384) == 256;
                Object objT2 = x340Var5.T();
                if (z4 || objT2 == fkj0.X) {
                    objT2 = new uoj(iu30Var2, (byte) 15);
                    x340Var5.s0(objT2);
                }
                foo1.c(new gbx(z50.c, (Function0) objT2), new idx(4), uyn1.z(cbx.b(x340Var3).b.a, 0.0f, 2, nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, eqj.a, x340Var3, 0, 48, 2040);
                x340Var5.r(true);
                x340Var5.r(true);
                return rih1Var;
            case 2:
                d4j1 d4j1Var = (d4j1) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                String strO0 = cwl1.o0(x340Var6, 2131962052);
                boolean z5 = (((iIntValue3 & 896) ^ 384) > 256 && x340Var6.g(iu30Var3)) || (iIntValue3 & 384) == 256;
                x340 x340Var7 = x340Var6;
                Object objT3 = x340Var7.T();
                if (z5 || objT3 == fkj0.X) {
                    objT3 = new uoj(iu30Var3, b6);
                    x340Var7.s0(objT3);
                }
                Function0 function0 = (Function0) objT3;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                jto1.b(u291.f(nim0Var, 1.0f), (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, new gbx(new y50(strO0), function0), (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-830642445, new hqj(d4j1Var, (byte) 0), x340Var7), (xu30) null, (xu30) null, apo.r(1314089654, new hqj(d4j1Var, (byte) 1), x340Var7), x340Var7, 0, 196992, 28542);
                return rih1Var;
            case 3:
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                boolean z6 = ((u4j1) obj2).a;
                int i5 = (iIntValue4 & 896) ^ 384;
                boolean z7 = (i5 > 256 && x340Var8.g(iu30Var4)) || (iIntValue4 & 384) == 256;
                x340 x340Var9 = x340Var8;
                Object objT4 = x340Var9.T();
                if (z7 || objT4 == m4cVar) {
                    objT4 = new uoj(iu30Var4, (byte) 17);
                    x340Var9.s0(objT4);
                }
                Function0 function1 = (Function0) objT4;
                boolean z8 = (i5 > 256 && x340Var9.g(iu30Var4)) || (iIntValue4 & 384) == 256;
                Object objT5 = x340Var9.T();
                if (z8 || objT5 == m4cVar) {
                    objT5 = new uoj(iu30Var4, (byte) 18);
                    x340Var9.s0(objT5);
                }
                Function0 function2 = (Function0) objT5;
                z = (i5 > 256 && x340Var9.g(iu30Var4)) || (iIntValue4 & 384) == 256;
                Object objT6 = x340Var9.T();
                if (z || objT6 == m4cVar) {
                    objT6 = new uoj(iu30Var4, (byte) 19);
                    x340Var9.s0(objT6);
                }
                u0p1.h(z6, function1, function2, (Function0) objT6, (qim0) null, x340Var9, 3072);
                return rih1Var;
            case 4:
                pgj1 pgj1Var = (pgj1) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                if ((iIntValue5 & 48) == 0) {
                    i2 = iIntValue5 | ((iIntValue5 & 64) == 0 ? x340Var10.g(pgj1Var) : x340Var10.i(pgj1Var) ? (byte) 32 : (byte) 16);
                } else {
                    i2 = iIntValue5;
                }
                if ((iIntValue5 & 384) == 0) {
                    i2 |= x340Var10.i(iu30Var5) ? 256 : 128;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    qim0 qim0VarR = d7e.r(((ez61) ahl.a).a, u291.v(nim0Var, 220.0f), false);
                    mgj1 mgj1Var = pgj1Var.b;
                    if (u890.j(mgj1Var, ngj1.a)) {
                        x340Var11.i0(876185762);
                        dxo1.k(qim0VarR, x340Var11, 0);
                        x340Var11.r(false);
                    } else if (u890.j(mgj1Var, lgj1.a)) {
                        x340Var11.i0(876187807);
                        boolean z9 = (i2 & 896) == 256;
                        Object objT7 = x340Var11.T();
                        if (z9 || objT7 == fkj0.X) {
                            objT7 = new uoj(iu30Var5, (byte) 20);
                            x340Var11.s0(objT7);
                        }
                        rwo1.h(0, (Function0) objT7, x340Var11, qim0VarR);
                        x340Var11.r(false);
                    } else {
                        if (!(mgj1Var instanceof mgj1)) {
                            throw p3d1.k(x340Var11, 876183868, false);
                        }
                        x340Var11.i0(876191147);
                        b2p1.t(mgj1Var.a, qim0VarR, (vu30) null, x340Var11, 0, 4);
                        x340Var11.r(false);
                    }
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 5:
                lij1 lij1Var = (lij1) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                if ((iIntValue6 & 48) == 0) {
                    i3 = iIntValue6 | (x340Var12.g(lij1Var) ? (byte) 32 : (byte) 16);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 384) == 0) {
                    i3 |= x340Var12.i(iu30Var6) ? 256 : 128;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    String strO1 = cwl1.o0(x340Var13, 2131958138);
                    String strO2 = cwl1.o0(x340Var13, lij1Var.b ? 2131958137 : 2131958136);
                    boolean z10 = lij1Var.a;
                    z = (i3 & 896) == 256;
                    Object objT8 = x340Var13.T();
                    if (z || objT8 == fkj0.X) {
                        objT8 = new k4j(iu30Var6, (byte) 27);
                        x340Var13.s0(objT8);
                    }
                    zxo1.a(strO1, strO2, (qim0) null, z10, true, (iu30) objT8, x340Var13, 24576, 4);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 6:
                rij1 rij1Var = (rij1) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                if ((iIntValue7 & 48) == 0) {
                    i4 = iIntValue7 | (x340Var14.g(rij1Var) ? (byte) 32 : (byte) 16);
                } else {
                    i4 = iIntValue7;
                }
                if ((iIntValue7 & 384) == 0) {
                    i4 |= x340Var14.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    gto1.f(cwl1.o0(x340Var15, 2131958499), cwl1.o0(x340Var15, 2131958498), anm1.N("video-toggle-row", nim0Var), rij1Var.a, false, iu30Var7, x340Var15, ((i4 << 9) & 458752) | 384, 16);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 7:
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                l090 l090VarA = ((xpj1) obj2).a();
                if (l090VarA != null) {
                    int i6 = (iIntValue8 & 896) ^ 384;
                    boolean z11 = (i6 > 256 && x340Var16.g(iu30Var8)) || (iIntValue8 & 384) == 256;
                    x340 x340Var17 = x340Var16;
                    Object objT9 = x340Var17.T();
                    if (z11 || objT9 == m4cVar2) {
                        objT9 = new uoj(iu30Var8, (byte) 21);
                        x340Var17.s0(objT9);
                    }
                    Function0 function3 = (Function0) objT9;
                    boolean z12 = (i6 > 256 && x340Var17.g(iu30Var8)) || (iIntValue8 & 384) == 256;
                    Object objT10 = x340Var17.T();
                    if (z12 || objT10 == m4cVar2) {
                        objT10 = new uoj(iu30Var8, b3);
                        x340Var17.s0(objT10);
                    }
                    i3p1.n(l090VarA, function3, (Function0) objT10, x340Var17, 0);
                }
                return rih1Var;
            case 8:
                cwj1 cwj1Var = (cwj1) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                z = (((iIntValue9 & 896) ^ 384) > 256 && x340Var18.g(iu30Var9)) || (iIntValue9 & 384) == 256;
                x340 x340Var19 = x340Var18;
                Object objT11 = x340Var19.T();
                if (z || objT11 == fkj0.X) {
                    objT11 = new k4j(iu30Var9, (byte) 28);
                    x340Var19.s0(objT11);
                }
                o4p1.h(cwj1Var, (iu30) objT11, (qim0) null, x340Var19, (iIntValue9 >> 3) & 14);
                return rih1Var;
            case 9:
                hwj1 hwj1Var = (hwj1) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                z = (((iIntValue10 & 896) ^ 384) > 256 && x340Var20.g(iu30Var10)) || (iIntValue10 & 384) == 256;
                x340 x340Var21 = x340Var20;
                Object objT12 = x340Var21.T();
                if (z || objT12 == fkj0.X) {
                    objT12 = new uoj(iu30Var10, b4);
                    x340Var21.s0(objT12);
                }
                r4p1.g(hwj1Var, (Function0) objT12, (qim0) null, x340Var21, (iIntValue10 >> 3) & 14);
                return rih1Var;
            case 10:
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                int i7 = ((uxj1) obj2).a;
                boolean z13 = (((iIntValue11 & 896) ^ 384) > 256 && x340Var22.g(iu30Var11)) || (iIntValue11 & 384) == 256;
                x340 x340Var23 = x340Var22;
                Object objT13 = x340Var23.T();
                if (z13 || objT13 == fkj0.X) {
                    objT13 = new uoj(iu30Var11, (byte) 24);
                    x340Var23.s0(objT13);
                }
                z4p1.q(i7, 0, (Function0) objT13, x340Var23);
                return rih1Var;
            case 11:
                yxj1 yxj1Var = (yxj1) obj2;
                ((Number) obj5).intValue();
                Object[] objArr = new Object[0];
                x340 x340Var24 = (b0k) obj4;
                Object objT14 = x340Var24.T();
                if (objT14 == fkj0.X) {
                    objT14 = fki.f;
                    x340Var24.s0(objT14);
                }
                ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT14, x340Var24, 48);
                fvz fvzVar = yxj1Var.a;
                if (fvzVar != null) {
                    ven0Var.setValue(fvzVar.a);
                }
                b5p1.g((Long) ven0Var.getValue(), (qim0) null, x340Var24, 0);
                return rih1Var;
            case 12:
                mzj1 mzj1Var = (mzj1) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var25 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                String str = mzj1Var.a;
                String str2 = mzj1Var.b;
                String str3 = mzj1Var.c;
                boolean z14 = mzj1Var.d;
                z = (((iIntValue12 & 896) ^ 384) > 256 && x340Var25.g(iu30Var12)) || (iIntValue12 & 384) == 256;
                x340 x340Var26 = x340Var25;
                Object objT15 = x340Var26.T();
                if (z || objT15 == fkj0.X) {
                    objT15 = new uoj(iu30Var12, (byte) 25);
                    x340Var26.s0(objT15);
                }
                h5p1.l(str, str2, str3, z14, (Function0) objT15, qim0VarF2, x340Var26, 0);
                return rih1Var;
            case 13:
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var27 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                boolean z15 = ((tzj1) obj2).a;
                boolean z16 = (((iIntValue13 & 896) ^ 384) > 256 && x340Var27.g(iu30Var13)) || (iIntValue13 & 384) == 256;
                x340 x340Var28 = x340Var27;
                Object objT16 = x340Var28.T();
                if (z16 || objT16 == fkj0.X) {
                    objT16 = new uoj(iu30Var13, (byte) 26);
                    x340Var28.s0(objT16);
                }
                k5p1.j(0, (Function0) objT16, x340Var28, qim0VarF3, z15);
                return rih1Var;
            case 14:
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                qim0 qim0VarN = anm1.N("nowplaying-elements-videosettings", nim0Var);
                ldx ldxVar = ldx.c;
                gdx gdxVarA = yla.r(x340Var29).a();
                String strO3 = cwl1.o0(x340Var29, 2131959266);
                z = (((iIntValue14 & 896) ^ 384) > 256 && x340Var29.g(iu30Var14)) || (iIntValue14 & 384) == 256;
                x340 x340Var30 = x340Var29;
                Object objT17 = x340Var30.T();
                if (z || objT17 == fkj0.X) {
                    objT17 = new uoj(iu30Var14, (byte) 27);
                    x340Var30.s0(objT17);
                }
                Function0 function4 = (Function0) objT17;
                if (ihc1.y0(strO3)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                wro1.h(new gbx(new y50(strO3), function4), ldxVar, qim0VarN, (max) null, gdxVarA, (vzq0) null, false, (idn0) null, (ga80) null, arj.a, x340Var30, 0, 6, 984);
                return rih1Var;
            case 15:
                iu30 iu30Var15 = (iu30) obj3;
                x340 x340Var31 = (b0k) obj4;
                int iIntValue15 = ((Number) obj5).intValue();
                if ((iIntValue15 & 384) == 0) {
                    iIntValue15 |= x340Var31.i(iu30Var15) ? 256 : 128;
                }
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue15 & 1, (iIntValue15 & 1153) != 1152)) {
                    String strO4 = cwl1.o0(x340Var32, 2131961022);
                    String strO5 = cwl1.o0(x340Var32, 2131961021);
                    pm31 pm31Var = new pm31(0);
                    z = (iIntValue15 & 896) == 256;
                    Object objT18 = x340Var32.T();
                    if (z || objT18 == fkj0.X) {
                        objT18 = new uoj(iu30Var15, (byte) 28);
                        x340Var32.s0(objT18);
                    }
                    yxo1.a(strO4, strO5, bin.x(nim0.a, false, (String) null, pm31Var, (idn0) null, (Function0) objT18, 11), true, x340Var32, 3072, 0);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 16:
                iu30 iu30Var16 = (iu30) obj3;
                x340 x340Var33 = (b0k) obj4;
                int iIntValue16 = ((Number) obj5).intValue();
                if ((iIntValue16 & 384) == 0) {
                    iIntValue16 |= x340Var33.i(iu30Var16) ? 256 : 128;
                }
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue16 & 1, (iIntValue16 & 1153) != 1152)) {
                    String strO6 = cwl1.o0(x340Var34, 2131958159);
                    String strO7 = cwl1.o0(x340Var34, 2131958158);
                    pm31 pm31Var2 = new pm31(0);
                    z = (iIntValue16 & 896) == 256;
                    Object objT19 = x340Var34.T();
                    if (z || objT19 == fkj0.X) {
                        objT19 = new uoj(iu30Var16, (byte) 29);
                        x340Var34.s0(objT19);
                    }
                    yxo1.a(strO6, strO7, bin.x(nim0.a, false, (String) null, pm31Var2, (idn0) null, (Function0) objT19, 11), true, x340Var34, 3072, 0);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                q2k1 q2k1Var = (q2k1) obj2;
                iu30 iu30Var17 = (iu30) obj3;
                x340 x340Var35 = (b0k) obj4;
                int iIntValue17 = ((Number) obj5).intValue();
                if (q2k1Var instanceof o2k1) {
                    if (((o2k1) q2k1Var).b) {
                        x340 x340Var36 = x340Var35;
                        x340Var36.i0(1479522481);
                        x340Var36.r(false);
                        maxVar = jax.a;
                    } else {
                        x340 x340Var37 = x340Var35;
                        x340Var37.i0(1479524031);
                        max haxVar = new hax(cwl1.o0(x340Var37, 2131963809));
                        x340Var37.r(false);
                        maxVar = haxVar;
                    }
                    String strO8 = cwl1.o0(x340Var35, 2131963807);
                    boolean z17 = ((((iIntValue17 & 112) ^ 48) > 32 && x340Var35.i(q2k1Var)) || (iIntValue17 & 48) == 32) | ((((iIntValue17 & 896) ^ 384) > 256 && x340Var35.g(iu30Var17)) || (iIntValue17 & 384) == 256);
                    x340 x340Var38 = x340Var35;
                    Object objT20 = x340Var38.T();
                    if (z17 || objT20 == fkj0.X) {
                        objT20 = new gmj(b5, q2k1Var, iu30Var17);
                        x340Var38.s0(objT20);
                    }
                    Function0 function5 = (Function0) objT20;
                    if (ihc1.y0(strO8)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    jto1.b((qim0) null, (uvx) null, maxVar, false, (idn0) null, (ga80) null, new gbx(new y50(strO8), function5), (gbx) null, drj.a, (xu30) null, (xu30) null, apo.r(-2013593691, new okg(q2k1Var, (byte) 22), x340Var38), drj.b, (xu30) null, (xu30) null, drj.c, x340Var38, 100663296, 197040, 26299);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return a(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return d(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return e(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return f(obj, obj2, obj3, obj4, obj5);
            case 22:
                return g(obj, obj2, obj3, obj4, obj5);
            case 23:
                ((Number) obj5).intValue();
                ((bvk1) obj2).b.invoke((b0k) obj4, 0);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                uwk1 uwk1Var = (uwk1) obj2;
                z47.p(uwk1Var.a, uwk1Var.b, (iu30) obj3, uwk1Var.e, (qim0) null, (b0k) obj4, ((Number) obj5).intValue() & 896);
                return rih1Var;
            case 25:
                return h(obj, obj2, obj3, obj4, obj5);
            case 26:
                return i(obj, obj2, obj3, obj4, obj5);
            case 27:
                return j(obj, obj2, obj3, obj4, obj5);
            case 28:
                return k(obj, obj2, obj3, obj4, obj5);
            default:
                mq51 mq51Var = (mq51) obj2;
                int iIntValue18 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                x340 x340Var39 = (b0k) obj4;
                lq51 lq51Var = (lq51) mq51Var.a.get(Integer.valueOf(((Number) x340Var39.k(qrj0.a)).intValue()));
                if (lq51Var != null) {
                    x340Var39.i0(-1363707602);
                    Object[] objArr2 = new Object[0];
                    int i8 = (iIntValue18 & 112) ^ 48;
                    boolean z18 = (i8 > 32 && x340Var39.g(mq51Var)) || (iIntValue18 & 48) == 32;
                    Object objT21 = x340Var39.T();
                    if (z18 || objT21 == m4cVar3) {
                        objT21 = new vjh(mq51Var, (byte) 10);
                        x340Var39.s0(objT21);
                    }
                    ven0 ven0Var2 = (ven0) k5p1.s(objArr2, (Function0) objT21, x340Var39, 0);
                    Object objT22 = x340Var39.T();
                    if (objT22 == m4cVar3) {
                        Boolean bool = (Boolean) ven0Var2.getValue();
                        bool.getClass();
                        objT22 = new zen0(bool);
                        x340Var39.s0(objT22);
                    }
                    zen0 zen0Var2 = (zen0) objT22;
                    Boolean boolValueOf = Boolean.valueOf(mq51Var.b);
                    boolean zI2 = x340Var39.i(zen0Var2) | ((i8 > 32 && x340Var39.g(mq51Var)) || (iIntValue18 & 48) == 32) | x340Var39.i(ven0Var2);
                    Object objT23 = x340Var39.T();
                    if (zI2 || objT23 == m4cVar3) {
                        objT23 = new gke(zen0Var2, mq51Var, ven0Var2, (lnm) null, (byte) 8);
                        zen0Var = zen0Var2;
                        x340Var39.s0(objT23);
                    } else {
                        zen0Var = zen0Var2;
                    }
                    qxd0.t(boolValueOf, x340Var39, (vu30) objT23);
                    uwr uwrVar2 = cbx.a;
                    fq7.d(zen0Var, (qim0) null, xay.e(2, new pxg1((int) jfv.h(cbx.c(x340Var39).b.b), (int) jfv.h(cbx.c(x340Var39).b.a), ((jhx) cbx.c(x340Var39).a.b).a)), xay.f(2, irn1.o0((int) jfv.h(cbx.c(x340Var39).b.a), 0, ((jhx) cbx.c(x340Var39).a.c).a, 2)), (String) null, apo.r(1654727608, new okg(lq51Var, (byte) 23), x340Var39), x340Var39, 196608, 18);
                    x340Var39.r(false);
                } else {
                    x340Var39.i0(-1362616867);
                    x340Var39.r(false);
                }
                return rih1Var;
        }
    }
}
