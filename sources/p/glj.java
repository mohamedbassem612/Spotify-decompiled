package p;

import android.R;
import android.net.Uri;
import com.spotify.scrollsita.v1.Section;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class glj extends hab0 implements bv30 {
    public static final glj N0;
    public static final glj O0;
    public static final glj P0;
    public static final glj Q0;
    public static final glj R0;
    public static final glj S0;
    public static final glj T0;
    public static final glj U0;
    public static final glj V0;
    public static final glj W0;
    public static final glj X;
    public static final glj X0;
    public static final glj Y;
    public static final glj Y0;
    public static final glj Z;
    public static final glj Z0;
    public static final glj a1;
    public static final glj b;
    public static final glj b1;
    public static final glj c;
    public static final glj c1;
    public static final glj d;
    public static final glj d1;
    public static final glj e;
    public static final glj e1;
    public static final glj f;
    public static final glj g;
    public static final glj h;
    public static final glj i;
    public static final glj t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new glj(i2, (byte) 0);
        c = new glj(i2, (byte) 1);
        d = new glj(i2, (byte) 2);
        e = new glj(i2, (byte) 3);
        f = new glj(i2, (byte) 4);
        g = new glj(i2, (byte) 5);
        h = new glj(i2, (byte) 6);
        i = new glj(i2, (byte) 7);
        t = new glj(i2, (byte) 8);
        X = new glj(i2, (byte) 9);
        Y = new glj(i2, (byte) 10);
        Z = new glj(i2, (byte) 11);
        N0 = new glj(i2, (byte) 12);
        O0 = new glj(i2, (byte) 13);
        P0 = new glj(i2, (byte) 14);
        Q0 = new glj(i2, (byte) 15);
        R0 = new glj(i2, (byte) 16);
        S0 = new glj(i2, (byte) 17);
        T0 = new glj(i2, (byte) 18);
        U0 = new glj(i2, (byte) 19);
        V0 = new glj(i2, (byte) 20);
        W0 = new glj(i2, (byte) 21);
        X0 = new glj(i2, (byte) 22);
        Y0 = new glj(i2, (byte) 23);
        Z0 = new glj(i2, (byte) 24);
        a1 = new glj(i2, (byte) 25);
        b1 = new glj(i2, (byte) 26);
        c1 = new glj(i2, (byte) 27);
        d1 = new glj(i2, (byte) 28);
        e1 = new glj(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glj(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        qim0 qim0VarR = d7e.r(1.0f, u291.v(nim0.a, 220.0f), false);
        s1e1 s1e1Var = ((u1e1) obj2).d;
        if (u890.j(s1e1Var, r1e1.a)) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-801055708);
            dxo1.k(qim0VarR, x340Var2, 0);
            x340Var2.r(false);
        } else if (u890.j(s1e1Var, p1e1.a)) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-801053663);
            boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT = x340Var3.T();
            if (z || objT == fkj0.X) {
                objT = new qkj(iu30Var, (byte) 19);
                x340Var3.s0(objT);
            }
            rwo1.h(0, (Function0) objT, x340Var3, qim0VarR);
            x340Var3.r(false);
        } else {
            if (!(s1e1Var instanceof q1e1)) {
                throw p3d1.k(x340Var, -801057287, false);
            }
            x340 x340Var4 = x340Var;
            x340Var4.i0(937253530);
            q1e1 q1e1Var = (q1e1) s1e1Var;
            String str = q1e1Var.a;
            String str2 = q1e1Var.b;
            if (str2 == null) {
                str2 = "";
            }
            j2p1.o(str, Uri.parse(str2), q1e1Var.c, q1e1Var.d, q1e1Var.e, q1e1Var.f, q1e1Var.g, qim0VarR, x340Var4, 0, 0);
            x340Var4.r(false);
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        g8e1 g8e1Var = (g8e1) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
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
        uwr uwrVar = cbx.a;
        long j = cbx.a(x340Var).b.a;
        lee1 lee1Var = cbx.d(x340Var).d;
        uwo1.e(cwl1.n0(2131959941, new Object[]{g8e1Var.a}, x340Var), uyn1.z(cbx.b(x340Var).b.c, 0.0f, 2, u291.f(nim0Var, 1.0f)), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
        cvx cvxVar = cbx.b(x340Var).b;
        op71.g(x340Var, u291.h(nim0Var, 12.0f));
        long j2 = cbx.a(x340Var).b.b;
        lee1 lee1Var2 = cbx.d(x340Var).h;
        uwo1.e(cwl1.o0(x340Var, 2131959940), uyn1.z(cbx.b(x340Var).b.e, 0.0f, 2, u291.f(nim0Var, 1.0f)), lee1Var2, j2, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vce1 vce1Var = (vce1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        uce1 uce1Var = vce1Var.a;
        String str = uce1Var.b;
        z0e1 z0e1Var = uce1Var.c;
        q061 q061Var = vce1Var.b;
        boolean z = uce1Var.d;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new qkj(iu30Var, (byte) 20);
            x340Var2.s0(objT);
        }
        m6p1.m(str, z0e1Var, q061Var, z, (Function0) objT, x340Var2, 0);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        tfe1 tfe1Var = (tfe1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        uvx uvxVar = new uvx((pgx) null, 3, (tvx) null, (p3v) null, 27);
        String str = tfe1Var.a;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        byte b2 = 21;
        if (z || objT == fkj0.X) {
            objT = new qkj(iu30Var, b2);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if (ihc1.y0(str)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        jto1.b((qim0) null, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(str), function0), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, anj.a, (xu30) null, (xu30) null, apo.r(-1188752176, new okg(tfe1Var, b2), x340Var2), x340Var2, 64, 196992, 28605);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        qie1 qie1Var = (qie1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        wr21 wr21Var = qie1Var.a;
        boolean z = qie1Var.e;
        iu30 iu30Var2 = qie1Var.f;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new qkj(iu30Var, (byte) 22);
            x340Var2.s0(objT);
        }
        w6k.e(wr21Var, z, iu30Var2, (Function0) objT, u291.d(nim0.a, 1.0f), x340Var2, 0);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        zie1 zie1Var = (zie1) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(Boolean.FALSE);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        boolean zI = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var.i(ven0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new gp0(iu30Var, ven0Var, (byte) 10);
            x340Var.s0(objT2);
        }
        iu30 iu30Var2 = (iu30) objT2;
        Boolean boolValueOf = Boolean.valueOf(zie1Var.f);
        boolean zI2 = x340Var.i(zie1Var) | x340Var.g(iu30Var2);
        Object objT3 = x340Var.T();
        if (zI2 || objT3 == m4cVar) {
            objT3 = new zti(zie1Var, iu30Var2, (lnm) null);
            x340Var.s0(objT3);
        }
        qxd0.t(boolValueOf, x340Var, (vu30) objT3);
        x9p1.d(zie1Var.a, iu30Var2, x340Var, 0);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x021a  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        long j;
        int i2;
        int i3;
        Float fValueOf;
        boolean z;
        xu30 xu30Var;
        String str;
        List list;
        ho70 ho70Var;
        byte b2 = this.a;
        z50 z50Var = z50.c;
        byte b3 = 15;
        nim0 nim0Var = nim0.a;
        byte b4 = 14;
        xu30 xu30VarR = null;
        boolean z2 = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                n0c1 n0c1Var = (n0c1) obj2;
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                uqo uqoVar = n0c1Var.a;
                String strU = zmo1.u(uqoVar.a, uqoVar.b, b0kVar);
                o0c1 o0c1Var = n0c1Var.b;
                lgo1.k(strU, o0c1Var != null ? Double.valueOf(o0c1Var.a) : null, o0c1Var != null ? Double.valueOf(o0c1Var.b) : null, o0c1Var != null ? Double.valueOf(o0c1Var.c) : null, o0c1Var != null ? Double.valueOf(o0c1Var.d) : null, (qim0) null, b0kVar, 0);
                return rih1Var;
            case 1:
                j1c1 j1c1Var = (j1c1) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                uqo uqoVar2 = j1c1Var.a;
                String strB = tro1.B(uqoVar2, x340Var, 0);
                if5 if5VarO = tro1.o(uqoVar2);
                c380 c380VarA = mqo1.A(j1c1Var.b);
                int i4 = (iIntValue & 896) ^ 384;
                boolean z3 = (i4 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
                x340 x340Var2 = x340Var;
                Object objT = x340Var2.T();
                if (z3 || objT == m4cVar) {
                    objT = new k4j(iu30Var, (byte) 22);
                    x340Var2.s0(objT);
                }
                iu30 iu30Var2 = (iu30) objT;
                boolean z4 = (i4 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT2 = x340Var2.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = new k4j(iu30Var, (byte) 23);
                    x340Var2.s0(objT2);
                }
                qgo1.h(strB, if5VarO, c380VarA, iu30Var2, (iu30) objT2, (qim0) null, j1c1Var.d, x340Var2, 64);
                String str2 = j1c1Var.e;
                if (str2 == null) {
                    x340Var2.i0(-728218752);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-728218751);
                    boolean z5 = (i4 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                    Object objT3 = x340Var2.T();
                    if (z5 || objT3 == m4cVar) {
                        objT3 = new qkj(iu30Var, (byte) 5);
                        x340Var2.s0(objT3);
                    }
                    Function0 function0 = (Function0) objT3;
                    String strO0 = cwl1.o0(x340Var2, 2131962034);
                    String strO1 = cwl1.o0(x340Var2, 2131962032);
                    String strO2 = cwl1.o0(x340Var2, 2131962033);
                    boolean zG = ((i4 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var2.g(str2);
                    Object objT4 = x340Var2.T();
                    if (zG || objT4 == m4cVar) {
                        objT4 = new are(iu30Var, str2, (byte) 4);
                        x340Var2.s0(objT4);
                    }
                    zgx zgxVar = new zgx(strO2, new gbx(z50Var, (Function0) objT4));
                    String strO3 = cwl1.o0(x340Var2, R.string.cancel);
                    if ((i4 <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
                        z2 = false;
                    }
                    Object objT5 = x340Var2.T();
                    if (z2 || objT5 == m4cVar) {
                        objT5 = new qkj(iu30Var, (byte) 6);
                        x340Var2.s0(objT5);
                    }
                    mqo1.d(function0, (i3u) null, (hux) null, strO0, strO1, zgxVar, new zgx(strO3, new gbx(z50Var, (Function0) objT5)), x340Var2, 2359296, 6);
                    x340Var2.r(false);
                }
                return rih1Var;
            case 2:
                m6c1 m6c1Var = (m6c1) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                vnr0 vnr0Var = m6c1Var.b;
                boolean z6 = m6c1Var.c;
                vnr0 vnr0Var2 = m6c1Var.d;
                int i5 = m6c1Var.e;
                String str3 = m6c1Var.f;
                float f2 = m6c1Var.g;
                k6c1 k6c1Var = m6c1Var.i;
                String str4 = k6c1Var.a;
                dzo1 dzo1Var = k6c1Var.b;
                if ((((iIntValue2 & 896) ^ 384) <= 256 || !x340Var3.g(iu30Var3)) && (iIntValue2 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var4 = x340Var3;
                Object objT6 = x340Var4.T();
                if (z2 || objT6 == fkj0.X) {
                    objT6 = new qkj(iu30Var3, (byte) 7);
                    x340Var4.s0(objT6);
                }
                nho1.i(vnr0Var, z6, vnr0Var2, i5, str3, f2, str4, dzo1Var, (qim0) null, (Function0) objT6, x340Var4, 520);
                return rih1Var;
            case 3:
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                qmx qmxVar = qmx.c;
                String strO4 = cwl1.o0(x340Var5, 2131962974);
                if ((((iIntValue3 & 896) ^ 384) <= 256 || !x340Var5.g(iu30Var4)) && (iIntValue3 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var6 = x340Var5;
                Object objT7 = x340Var6.T();
                if (z2 || objT7 == fkj0.X) {
                    objT7 = new qkj(iu30Var4, (byte) 8);
                    x340Var6.s0(objT7);
                }
                kyo1.c(strO4, qmxVar, (Function0) objT7, (qim0) null, false, (String) null, (v2g) null, (vu30) null, x340Var6, qmx.d << 3, 248);
                return rih1Var;
            case 4:
                wlc1 wlc1Var = (wlc1) obj2;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= (iIntValue4 & 64) == 0 ? x340Var7.g(wlc1Var) : x340Var7.i(wlc1Var) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 1041) != 1040)) {
                    if (wlc1Var.d) {
                        x340Var8.i0(156780790);
                        uwr uwrVar = cbx.a;
                        j = cbx.a(x340Var8).b.c;
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(156782382);
                        uwr uwrVar2 = cbx.a;
                        j = cbx.a(x340Var8).b.a;
                        x340Var8.r(false);
                    }
                    boolean z7 = (iIntValue4 & 112) == 32 || ((iIntValue4 & 64) != 0 && x340Var8.i(wlc1Var));
                    Object objT8 = x340Var8.T();
                    if (z7 || objT8 == fkj0.X) {
                        objT8 = new mwh(wlc1Var, (byte) 7);
                        x340Var8.s0(objT8);
                    }
                    qim0 qim0VarN = anm1.N("SubjectSettingsRow", s161.b(nim0Var, true, (iu30) objT8));
                    uvx uvxVarB = uvx.b((uvx) x340Var8.k(vvx.a), 0, (tvx) null, (p3v) null, 30);
                    String str5 = wlc1Var.c;
                    if (str5 == null) {
                        x340Var8.i0(566001376);
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(566001377);
                        xu30VarR = apo.r(776662178, new kaf(str5, (byte) 14), x340Var8);
                        x340Var8.r(false);
                    }
                    jto1.b(qim0VarN, uvxVarB, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(1802308404, new nlj(wlc1Var, j, (byte) 0), x340Var8), (xu30) null, (xu30) null, (xu30) null, (xu30) null, xu30VarR, (xu30) null, apo.r(998116334, new nlj(wlc1Var, j, (byte) 1), x340Var8), x340Var8, 100663360, 196608, 24316);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                hyo1.f((lbt0) obj2, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 6:
                coc1 coc1Var = (coc1) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var9 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                boolean z8 = (((iIntValue5 & 896) ^ 384) > 256 && x340Var9.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                if ((((iIntValue5 & 112) ^ 48) <= 32 || !x340Var9.i(coc1Var)) && (iIntValue5 & 48) != 32) {
                    z2 = false;
                }
                boolean z9 = z8 | z2;
                x340 x340Var10 = x340Var9;
                Object objT9 = x340Var10.T();
                if (z9 || objT9 == fkj0.X) {
                    objT9 = new qlj(iu30Var5, coc1Var, (byte) 0);
                    x340Var10.s0(objT9);
                }
                epo1.x(coc1Var, qim0VarB, (Function0) objT9, x340Var10, (iIntValue5 >> 3) & 14);
                return rih1Var;
            case 7:
                coc1 coc1Var2 = (coc1) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var11 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                qim0 qim0VarB2 = uyn1.B(nim0.a, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                boolean z10 = ((((iIntValue6 & 896) ^ 384) > 256 && x340Var11.g(iu30Var6)) || (iIntValue6 & 384) == 256) | ((((iIntValue6 & 112) ^ 48) > 32 && x340Var11.i(coc1Var2)) || (iIntValue6 & 48) == 32);
                x340 x340Var12 = x340Var11;
                Object objT10 = x340Var12.T();
                if (z10 || objT10 == fkj0.X) {
                    objT10 = new qlj(iu30Var6, coc1Var2, (byte) 1);
                    x340Var12.s0(objT10);
                }
                epo1.x(coc1Var2, qim0VarB2, (Function0) objT10, x340Var12, (iIntValue6 >> 3) & 14);
                return rih1Var;
            case 8:
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                if ((iIntValue7 & 384) == 0) {
                    iIntValue7 |= x340Var13.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 1153) != 1152)) {
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
                    mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var14, 48);
                    int iHashCode = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM = x340Var14.m();
                    qim0 qim0VarE = zr7.E(x340Var14, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var14.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(hmb0.t1);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(mbhVarA, x340Var14, y580.O0);
                    nko1.H(xos0VarM, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE, x340Var14, y580.Y);
                    String strO5 = cwl1.o0(x340Var14, 2131953775);
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(strO5, (qim0) null, cbx.d(x340Var14).f, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2026);
                    String strO6 = cwl1.o0(x340Var14, 2131953774);
                    lee1 lee1Var = cbx.d(x340Var14).j;
                    long j2 = cbx.a(x340Var14).b.b;
                    cvx cvxVar = cbx.b(x340Var14).b;
                    uwo1.e(strO6, uyn1.B(nim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), lee1Var, j2, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2016);
                    qim0 qim0VarB3 = uyn1.B(nim0Var2, 0.0f, cbx.b(x340Var14).b.a, 0.0f, 0.0f, 13);
                    idx idxVar = new idx();
                    boolean z11 = (iIntValue7 & 896) == 256;
                    Object objT11 = x340Var14.T();
                    if (z11 || objT11 == fkj0.X) {
                        objT11 = new qkj(iu30Var7, (byte) 9);
                        x340Var14.s0(objT11);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT11), idxVar, qim0VarB3, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, ylj.a, x340Var14, 0, 48, 2040);
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 9:
                mtc1 mtc1Var = (mtc1) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                if ((iIntValue8 & 48) == 0) {
                    i2 = (x340Var15.g(mtc1Var) ? 32 : 16) | iIntValue8;
                } else {
                    i2 = iIntValue8;
                }
                if ((iIntValue8 & 384) == 0) {
                    i2 |= x340Var15.i(iu30Var8) ? 256 : 128;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    String str6 = mtc1Var.a;
                    boolean z12 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                    Object objT12 = x340Var16.T();
                    if (z12 || objT12 == fkj0.X) {
                        objT12 = new puh(iu30Var8, mtc1Var, (byte) 16);
                        x340Var16.s0(objT12);
                    }
                    vqo1.f(str6, (iu30) objT12, (qim0) null, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 10:
                iuc1 iuc1Var = (iuc1) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var17 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                bxc1 bxc1Var = iuc1Var.a;
                qim0 qim0Var = iuc1Var.c;
                if ((((iIntValue9 & 896) ^ 384) <= 256 || !x340Var17.g(iu30Var9)) && (iIntValue9 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var18 = x340Var17;
                Object objT13 = x340Var18.T();
                if (z2 || objT13 == fkj0.X) {
                    objT13 = new qkj(iu30Var9, (byte) 10);
                    x340Var18.s0(objT13);
                }
                bro1.i(bxc1Var, (Function0) objT13, qim0Var, x340Var18, 0);
                return rih1Var;
            case 11:
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var19 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                String str7 = ((tuc1) obj2).a;
                int i6 = (iIntValue10 & 896) ^ 384;
                boolean z13 = (i6 > 256 && x340Var19.g(iu30Var10)) || (iIntValue10 & 384) == 256;
                x340 x340Var20 = x340Var19;
                Object objT14 = x340Var20.T();
                if (z13 || objT14 == m4cVar2) {
                    objT14 = new qkj(iu30Var10, (byte) 11);
                    x340Var20.s0(objT14);
                }
                Function0 function1 = (Function0) objT14;
                if ((i6 <= 256 || !x340Var20.g(iu30Var10)) && (iIntValue10 & 384) != 256) {
                    z2 = false;
                }
                Object objT15 = x340Var20.T();
                if (z2 || objT15 == m4cVar2) {
                    objT15 = new qkj(iu30Var10, (byte) 12);
                    x340Var20.s0(objT15);
                }
                ero1.d(0, str7, function1, (Function0) objT15, x340Var20, (qim0) null);
                return rih1Var;
            case 12:
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var21 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                String str8 = ((hvc1) obj2).a;
                if ((((iIntValue11 & 896) ^ 384) <= 256 || !x340Var21.g(iu30Var11)) && (iIntValue11 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var22 = x340Var21;
                Object objT16 = x340Var22.T();
                if (z2 || objT16 == fkj0.X) {
                    objT16 = new qkj(iu30Var11, (byte) 13);
                    x340Var22.s0(objT16);
                }
                lro1.k(0, str8, (Function0) objT16, x340Var22, (qim0) null);
                return rih1Var;
            case 13:
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                iys0 iys0Var = ((zvc1) obj2).a;
                if ((((iIntValue12 & 896) ^ 384) <= 256 || !x340Var23.g(iu30Var12)) && (iIntValue12 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var24 = x340Var23;
                Object objT17 = x340Var24.T();
                if (z2 || objT17 == fkj0.X) {
                    objT17 = new qkj(iu30Var12, b4);
                    x340Var24.s0(objT17);
                }
                qro1.k(iys0Var, (Function0) objT17, (qim0) null, x340Var24, 0);
                return rih1Var;
            case 14:
                azc1 azc1Var = (azc1) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var25 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                int i7 = azc1Var.c;
                String str9 = azc1Var.d;
                jxc1 jxc1Var = azc1Var.b;
                xyc1 xyc1Var = azc1Var.g;
                String str10 = xyc1Var.a;
                dzo1 dzo1Var2 = xyc1Var.b;
                if ((((iIntValue13 & 896) ^ 384) <= 256 || !x340Var25.g(iu30Var13)) && (iIntValue13 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var26 = x340Var25;
                Object objT18 = x340Var26.T();
                if (z2 || objT18 == fkj0.X) {
                    objT18 = new qkj(iu30Var13, b3);
                    x340Var26.s0(objT18);
                }
                tto1.g(jxc1Var, i7, str9, str10, dzo1Var2, (qim0) null, (Function0) objT18, x340Var26, 0);
                return rih1Var;
            case 15:
                c9d1 c9d1Var = (c9d1) obj2;
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var27 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                if ((iIntValue14 & 48) == 0) {
                    i3 = iIntValue14 | (x340Var27.g(c9d1Var) ? 32 : 16);
                } else {
                    i3 = iIntValue14;
                }
                if ((iIntValue14 & 384) == 0) {
                    i3 |= x340Var27.i(iu30Var14) ? 256 : 128;
                }
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    v1p1.b(48, 1, apo.r(897390242, new l2i(c9d1Var, iu30Var14, (byte) 19), x340Var28), x340Var28, (qim0) null);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 16:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                fq7.g(((dcd1) obj2).a, null, xay.e(3, (ni20) null), xay.f(3, (ni20) null), null, apo.r(-1344779387, new ip0((iu30) obj3, (byte) 19), b0kVar2), b0kVar2, 196608, 18);
                return rih1Var;
            case 17:
                ycd1 ycd1Var = (ycd1) obj2;
                iu30 iu30Var15 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                int iIntValue15 = ((Number) obj5).intValue();
                xcd1 xcd1Var = ycd1Var.a;
                Float f3 = ycd1Var.d;
                if (f3 != null) {
                    float fFloatValue = f3.floatValue();
                    Float f4 = xcd1Var.b;
                    fValueOf = Float.valueOf(fFloatValue * (f4 != null ? f4.floatValue() : 1.0f));
                } else {
                    fValueOf = null;
                }
                if (fValueOf != null) {
                    float fFloatValue2 = fValueOf.floatValue();
                    Float f5 = xcd1Var.c;
                    if (f5 == null || u890.h(f5, 0.0f)) {
                        z = false;
                    } else {
                        float fFloatValue3 = fFloatValue2 / f5.floatValue();
                        if (0.7f > fFloatValue3 || fFloatValue3 > 1.3f) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                jo70 jo70Var = ycd1Var.b;
                String str11 = jo70Var != null ? jo70Var.a : null;
                String str12 = str11 == null ? "" : str11;
                String str13 = (jo70Var == null || (list = jo70Var.d) == null || (ho70Var = (ho70) o7h.s0(list)) == null) ? null : ho70Var.a;
                String str14 = str13 == null ? "" : str13;
                xkk1 xkk1Var = ycd1Var.c;
                if (xkk1Var != null) {
                    up70 up70VarA = xkk1Var.a.a(vp70.c);
                    if (up70VarA == null || (str = up70VarA.a.a) == null || (xu30Var = Uri.parse(str)) == null) {
                        xu30Var = Uri.EMPTY;
                    }
                    xu30VarR = xu30Var;
                }
                xu30 xu30Var2 = xu30VarR;
                if ((((iIntValue15 & 896) ^ 384) <= 256 || !x340Var29.g(iu30Var15)) && (iIntValue15 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var30 = x340Var29;
                Object objT19 = x340Var30.T();
                if (z2 || objT19 == fkj0.X) {
                    objT19 = new qkj(iu30Var15, (byte) 17);
                    x340Var30.s0(objT19);
                }
                yxo1.k(str12, str14, xu30Var2, fValueOf, z, (Function0) objT19, x340Var30, 0);
                return rih1Var;
            case 18:
                htd1.f((tsd1) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 19:
                vvd1.e((mvd1) obj2, null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 20:
                iu30 iu30Var16 = (iu30) obj3;
                int iIntValue16 = ((Number) obj5).intValue();
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                x340 x340Var31 = (b0k) obj4;
                Object objT20 = x340Var31.T();
                m4c m4cVar3 = fkj0.X;
                if (objT20 == m4cVar3) {
                    objT20 = cjj.f;
                    x340Var31.s0(objT20);
                }
                qim0 qim0VarB4 = s161.b(qim0VarF2, true, (iu30) objT20);
                String strO7 = cwl1.o0(x340Var31, 2131953034);
                if ((((iIntValue16 & 896) ^ 384) <= 256 || !x340Var31.g(iu30Var16)) && (iIntValue16 & 384) != 256) {
                    z2 = false;
                }
                Object objT21 = x340Var31.T();
                if (z2 || objT21 == m4cVar3) {
                    objT21 = new qkj(iu30Var16, (byte) 18);
                    x340Var31.s0(objT21);
                }
                Function0 function2 = (Function0) objT21;
                if (ihc1.y0(strO7)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                jto1.b(qim0VarB4, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO7), function2), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, tmj.a, (xu30) null, (xu30) null, tmj.b, x340Var31, 0, 196992, 28606);
                return rih1Var;
            case 21:
                return a(obj, obj2, obj3, obj4, obj5);
            case 22:
                return d(obj, obj2, obj3, obj4, obj5);
            case 23:
                kbe1 kbe1Var = (kbe1) obj2;
                ((Number) obj5).intValue();
                x340 x340Var32 = (b0k) obj4;
                boolean zI = x340Var32.i(kbe1Var);
                Object objT22 = x340Var32.T();
                if (zI || objT22 == fkj0.X) {
                    objT22 = new hzb(kbe1Var, (lnm) null, (byte) 15);
                    x340Var32.s0(objT22);
                }
                qxd0.t(rih1Var, x340Var32, (vu30) objT22);
                lzj.b(0, 0, kbe1Var.a.a, x340Var32, u291.z(u291.f(nim0Var, 1.0f), een.Z, 2), kbe1Var.b);
                return rih1Var;
            case 24:
                return e(obj, obj2, obj3, obj4, obj5);
            case 25:
                p6p1.q((tde1) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 26:
                return f(obj, obj2, obj3, obj4, obj5);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return g(obj, obj2, obj3, obj4, obj5);
            case 28:
                return h(obj, obj2, obj3, obj4, obj5);
            default:
                ((Number) obj5).intValue();
                nyx.a(0, (wux) null, fnj.a, (b0k) obj4, 3072, 7);
                return rih1Var;
        }
    }
}
