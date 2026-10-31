package p;

import android.R;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p9i extends hab0 implements bv30 {
    public static final p9i N0;
    public static final p9i O0;
    public static final p9i P0;
    public static final p9i Q0;
    public static final p9i R0;
    public static final p9i S0;
    public static final p9i T0;
    public static final p9i U0;
    public static final p9i V0;
    public static final p9i W0;
    public static final p9i X;
    public static final p9i X0;
    public static final p9i Y;
    public static final p9i Y0;
    public static final p9i Z;
    public static final p9i Z0;
    public static final p9i a1;
    public static final p9i b;
    public static final p9i b1;
    public static final p9i c;
    public static final p9i c1;
    public static final p9i d;
    public static final p9i d1;
    public static final p9i e;
    public static final p9i e1;
    public static final p9i f;
    public static final p9i g;
    public static final p9i h;
    public static final p9i i;
    public static final p9i t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new p9i(i2, (byte) 0);
        c = new p9i(i2, (byte) 1);
        d = new p9i(i2, (byte) 2);
        e = new p9i(i2, (byte) 3);
        f = new p9i(i2, (byte) 4);
        g = new p9i(i2, (byte) 5);
        h = new p9i(i2, (byte) 6);
        i = new p9i(i2, (byte) 7);
        t = new p9i(i2, (byte) 8);
        X = new p9i(i2, (byte) 9);
        Y = new p9i(i2, (byte) 10);
        Z = new p9i(i2, (byte) 11);
        N0 = new p9i(i2, (byte) 12);
        O0 = new p9i(i2, (byte) 13);
        P0 = new p9i(i2, (byte) 14);
        Q0 = new p9i(i2, (byte) 15);
        R0 = new p9i(i2, (byte) 16);
        S0 = new p9i(i2, (byte) 17);
        T0 = new p9i(i2, (byte) 18);
        U0 = new p9i(i2, (byte) 19);
        V0 = new p9i(i2, (byte) 20);
        W0 = new p9i(i2, (byte) 21);
        X0 = new p9i(i2, (byte) 22);
        Y0 = new p9i(i2, (byte) 23);
        Z0 = new p9i(i2, (byte) 24);
        a1 = new p9i(i2, (byte) 25);
        b1 = new p9i(i2, (byte) 26);
        c1 = new p9i(i2, (byte) 27);
        d1 = new p9i(i2, (byte) 28);
        e1 = new p9i(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p9i(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dtd dtdVar = (dtd) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String str = dtdVar.g;
        boolean z = dtdVar.h;
        if ((iIntValue & 48) == 0) {
            iIntValue |= (iIntValue & 64) == 0 ? x340Var.g(dtdVar) : x340Var.i(dtdVar) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = uyn1.x(dug.f(i1p1.q(u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3), er31.b(10.0f)), z4p1.g(4280821800L), d4o1.a), 16.0f);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = ovh.T0;
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarX, true, (iu30) objT);
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            qim0 qim0VarR = u291.r(nim0Var, 16.0f);
            hux huxVar = dtdVar.d;
            uwr uwrVar = cbx.a;
            w0h1.a(huxVar, isl.a, qim0VarR, cbx.a(x340Var2).b.b, 0L, false, x340Var2, 440, 48);
            uwo1.e(dtdVar.e, uyn1.B(ktd.m(eraVar, anm1.N("TITLE", nim0Var)), 0.0f, 8.0f, 0.0f, 0.0f, 13), vgo1.q(cbx.d(x340Var2).k, z, x340Var2), cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            String str2 = dtdVar.f;
            lee1 lee1VarQ = vgo1.q(cbx.d(x340Var2).m, z, x340Var2);
            long j = cbx.a(x340Var2).b.a;
            qim0 qim0VarB2 = uyn1.B(ktd.m(eraVar, anm1.N("DESC", nim0Var)), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            if (!(((double) 1.0f) > 0.0d)) {
                of80.a("invalid weight; must be greater than zero");
            }
            uwo1.e(str2, qim0VarB2.then(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), lee1VarQ, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 2, (qx8) null, x340Var2, 805306368, 0, 1520);
            if (str.length() > 0) {
                x340Var2.i0(1112711123);
                uwo1.e(str, uyn1.B(ktd.m(eraVar, anm1.N("FOOTER", nim0Var)), 0.0f, 16.0f, 0.0f, 0.0f, 13), vgo1.q(cbx.d(x340Var2).k, z, x340Var2), cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1113006398);
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        vgo1.d(((yzd) obj2).a, (iu30) obj3, (qim0) null, (b0k) obj4, (iIntValue >> 3) & 112);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        String strK;
        o8e o8eVar = (o8e) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        int iC = l1d.C(o8eVar.c);
        boolean z = true;
        if (iC == 0) {
            x340 x340Var2 = x340Var;
            strK = x0d.k(x340Var2, -1525046520, 2131956225, x340Var2, false);
        } else {
            if (iC != 1) {
                throw p3d1.k(x340Var, -1525048237, false);
            }
            x340 x340Var3 = x340Var;
            strK = x0d.k(x340Var3, -1525044184, 2131963318, x340Var3, false);
        }
        String str = strK;
        if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var.g(iu30Var)) && (iIntValue & 384) != 256) {
            z = false;
        }
        x340 x340Var4 = x340Var;
        Object objT = x340Var4.T();
        if (z || objT == fkj0.X) {
            objT = new y8i(iu30Var, (byte) 22);
            x340Var4.s0(objT);
        }
        dem1.d((Function0) objT, null, str, 0, 0, 0L, 0.0f, false, false, 0, null, null, null, apo.r(-1680092, new l8i(o8eVar, (byte) 4), x340Var4), x340Var4, 0, 3072, 8186);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ejo1.b((e9e) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String strO0 = cwl1.o0(x340Var, 2131953536);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new y8i(iu30Var, (byte) 23);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if (ihc1.y0(strO0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        foo1.c(new gbx(new y50(strO0), function0), new idx(8), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, fbi.a, x340Var2, 0, 48, 2044);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        d7e.k(((ale) obj2).c, (vu30) null, (vu30) null, apo.r(1776401722, new ip0((iu30) obj3, (byte) 13), b0kVar), b0kVar, 3072, 6);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ile ileVar = (ile) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        String str = ileVar.a;
        if (str.length() > 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1990858500);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).e;
            long j = cbx.a(x340Var2).b.a;
            boolean z = ileVar.b;
            uwo1.e(str, anm1.N("chapter_title_element_text", nim0.a), lee1Var, j, new a0e1(3), (iu30) null, z ? 2 : 1, false, z ? new zic0(2) : bjc0.a, 0, (qx8) null, x340Var2, 0, 0, 1696);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1991254618);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        String str = ((qle) obj2).a;
        uwr uwrVar = cbx.a;
        lee1 lee1Var = cbx.d(x340Var).e;
        long j = cbx.a(x340Var).b.a;
        zic0 zic0Var = new zic0(2);
        qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, u291.f(nim0.a, 1.0f));
        cvx cvxVar = cbx.b(x340Var).b;
        cvx cvxVar2 = cbx.b(x340Var).b;
        qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, 8.0f, 5);
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (objT == fkj0.X) {
            objT = ovh.U0;
            x340Var2.s0(objT);
        }
        uwo1.e(str, s161.b(qim0VarB, false, (iu30) objT), lee1Var, j, (a0e1) null, (iu30) null, 2, false, zic0Var, 0, (qx8) null, x340Var2, 0, 0, 1712);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        zse zseVar = (zse) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        c380 c380Var = zseVar.a;
        int i2 = zseVar.b;
        boolean z = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | ((((iIntValue & 112) ^ 48) > 32 && x340Var.i(zseVar)) || (iIntValue & 48) == 32);
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new puh(iu30Var, zseVar, (byte) 6);
            x340Var2.s0(objT);
        }
        yoo1.e(c380Var, i2, (iu30) objT, (qim0) null, x340Var2, 8);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new y8i(iu30Var, (byte) 25);
            x340Var2.s0(objT);
        }
        wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, obi.a, x340Var2, 0, 6, 1020);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = (((Number) obj5).intValue() >> 6) & 14;
        vzn1.b(iIntValue, (b0k) obj4, (iu30) obj3, (qim0) null);
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        int i2 = (iIntValue & 896) ^ 384;
        boolean z = true;
        boolean z2 = (i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == m4cVar) {
            objT = new y8i(iu30Var, (byte) 26);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        String strO0 = cwl1.o0(x340Var2, 2131953396);
        String strO1 = cwl1.o0(x340Var2, 2131953395);
        String strO2 = cwl1.o0(x340Var2, R.string.ok);
        if ((i2 <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
            z = false;
        }
        Object objT2 = x340Var2.T();
        if (z || objT2 == m4cVar) {
            objT2 = new y8i(iu30Var, (byte) 27);
            x340Var2.s0(objT2);
        }
        mqo1.d(function0, (i3u) null, (hux) null, strO0, strO1, new zgx(strO2, new gbx(z50.c, (Function0) objT2)), (zgx) null, x340Var2, 262144, 70);
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m4f m4fVar = (m4f) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new y8i(iu30Var, (byte) 28);
            x340Var2.s0(objT);
        }
        poo1.e(new gbx(z50.c, (Function0) objT), pex.b, yoo1.z(x340Var2), (qim0) null, 0, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-1288587781, new l8i(m4fVar, (byte) 5), x340Var2), x340Var2, 0, 3072, 8184);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        b0k b0kVar;
        boolean z;
        vrc trcVar;
        byte b2 = this.a;
        byte b3 = 28;
        z50 z50Var = z50.c;
        int i2 = 2;
        nim0 nim0Var = nim0.a;
        boolean z2 = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                apo.b((eob) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 1:
                gwb gwbVar = (gwb) obj2;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                int i3 = (iIntValue & 112) ^ 48;
                boolean z3 = (i3 > 32 && x340Var.g(gwbVar)) || (iIntValue & 48) == 32;
                x340 x340Var2 = x340Var;
                Object objT = x340Var2.T();
                if (z3 || objT == m4cVar) {
                    objT = new vjh(gwbVar, (byte) 6);
                    x340Var2.s0(objT);
                }
                gbx gbxVar = new gbx(z50Var, (Function0) objT);
                lex lexVarZ = yoo1.z(x340Var2);
                boolean z4 = (i3 > 32 && x340Var2.g(gwbVar)) || (iIntValue & 48) == 32;
                Object objT2 = x340Var2.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = new w9i(gwbVar, (byte) 0);
                    x340Var2.s0(objT2);
                }
                poo1.e(gbxVar, new oex(0, (vu30) null, (vu30) objT2, (vu30) null, 11), lexVarZ, (qim0) null, 0, (String) null, (max) null, apo.r(-1444524337, new w9i(gwbVar, (byte) 1), x340Var2), (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(1279268956, new w9i(gwbVar, (byte) 2), x340Var2), x340Var2, 12582912, 3072, 8056);
                return rih1Var;
            case 2:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                ig51 ig51Var = (ig51) obj2;
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                x340 x340Var3 = (x340) b0kVar2;
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
                hzj.A.getClass();
                x340 x340Var4 = (x340) b0kVar2;
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                boolean z5 = x340Var4.S;
                n4k n4kVar = hmb0.t1;
                if (z5) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(mbhVarA, b0kVar2, lljVar4);
                nko1.H(xos0VarM, b0kVar2, lljVar3);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, lljVar2);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, lljVar);
                x340Var4.i0(-1208818037);
                for (hg51 hg51Var : ig51Var.b) {
                    xpw xpwVar = hg51Var.a;
                    int i4 = hg51Var.c;
                    x340Var4.f0(-1677336184, x340Var4.K(xpwVar, hg51Var.b));
                    if (i4 > 0) {
                        x340Var4.i0(-457650005);
                        qim0 qim0VarZ = uyn1.z(((wat) x340Var4.k(t4k.h)).M0(i4), 0.0f, i2, nim0Var);
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        int iHashCode2 = Long.hashCode(x340Var4.T);
                        xos0 xos0VarM2 = x340Var4.m();
                        qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarZ);
                        hzj.A.getClass();
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(n4kVar);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(gfh0VarC, b0kVar2, lljVar4);
                        nko1.H(xos0VarM2, b0kVar2, lljVar3);
                        nko1.H(Integer.valueOf(iHashCode2), b0kVar2, lljVar2);
                        nko1.F(b0kVar2);
                        nko1.H(qim0VarE2, b0kVar2, lljVar);
                        b0kVar = b0kVar2;
                        otw.c(hg51Var.a, hg51Var.b, (qim0) null, (ipb1) null, b0kVar, 0, 12);
                        x340Var4.r(true);
                        z = false;
                        x340Var4.r(false);
                    } else {
                        b0kVar = b0kVar2;
                        z = false;
                        x340Var4.i0(-457357024);
                        otw.c(hg51Var.a, hg51Var.b, (qim0) null, (ipb1) null, b0kVar, 0, 12);
                        x340Var4.r(false);
                    }
                    x340Var4.r(z);
                    b0kVar2 = b0kVar;
                    i2 = 2;
                }
                x340Var4.r(false);
                x340Var4.r(true);
                return rih1Var;
            case 3:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(202004019, new l8i((bac) obj2, (byte) 3), b0kVar3), b0kVar3, 3078, 6);
                return rih1Var;
            case 4:
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var5).b;
                qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                uvx uvxVar = new uvx((pgx) null, 2, (tvx) null, (p3v) null, 27);
                String strO0 = cwl1.o0(x340Var5, 2131962459);
                boolean z6 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var5.g(iu30Var)) || (iIntValue2 & 384) == 256;
                x340 x340Var6 = x340Var5;
                Object objT3 = x340Var6.T();
                if (z6 || objT3 == fkj0.X) {
                    objT3 = new y8i(iu30Var, (byte) 4);
                    x340Var6.s0(objT3);
                }
                Function0 function0 = (Function0) objT3;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                jto1.b(qim0VarB, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, eai.a, x340Var6, 64, 196608, 32700);
                return rih1Var;
            case 5:
                fdg1.b((kat) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 6:
                crc crcVar = (crc) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                int iIntValue3 = ((Number) obj5).intValue();
                uqo uqoVar = crcVar.a;
                x340 x340Var7 = (b0k) obj4;
                Object objT4 = x340Var7.T();
                m4c m4cVar2 = fkj0.X;
                if (objT4 == m4cVar2) {
                    objT4 = pzm.i(x340Var7);
                }
                lz20 lz20Var = (lz20) objT4;
                String strB = tro1.B(uqoVar, x340Var7, 0);
                if5 if5VarO = tro1.o(uqoVar);
                vrc vrcVar = crcVar.b;
                Long l = crcVar.c;
                if (!(vrcVar instanceof trc) || l == null) {
                    trcVar = vrcVar;
                } else {
                    trc trcVar2 = (trc) vrcVar;
                    List list = trcVar2.a;
                    List list2 = krc.a;
                    trcVar = new trc(krc.a(l.longValue(), list), list, false, trcVar2.d);
                }
                int i5 = (iIntValue3 & 896) ^ 384;
                boolean z7 = (i5 > 256 && x340Var7.g(iu30Var2)) || (iIntValue3 & 384) == 256;
                Object objT5 = x340Var7.T();
                if (z7 || objT5 == m4cVar2) {
                    objT5 = new wqf(iu30Var2, (byte) 26);
                    x340Var7.s0(objT5);
                }
                iu30 iu30Var3 = (iu30) objT5;
                boolean z8 = (i5 > 256 && x340Var7.g(iu30Var2)) || (iIntValue3 & 384) == 256;
                Object objT6 = x340Var7.T();
                if (z8 || objT6 == m4cVar2) {
                    objT6 = new wqf(iu30Var2, (byte) 27);
                    x340Var7.s0(objT6);
                }
                iu30 iu30Var4 = (iu30) objT6;
                boolean zI = x340Var7.i(lz20Var) | ((i5 > 256 && x340Var7.g(iu30Var2)) || (iIntValue3 & 384) == 256);
                Object objT7 = x340Var7.T();
                if (zI || objT7 == m4cVar2) {
                    objT7 = new iai(lz20Var, iu30Var2);
                    x340Var7.s0(objT7);
                }
                Function0 function1 = (Function0) objT7;
                boolean z9 = crcVar.e;
                boolean z10 = (i5 > 256 && x340Var7.g(iu30Var2)) || (iIntValue3 & 384) == 256;
                Object objT8 = x340Var7.T();
                if (z10 || objT8 == m4cVar2) {
                    objT8 = new y8i(iu30Var2, (byte) 5);
                    x340Var7.s0(objT8);
                }
                Function0 function2 = (Function0) objT8;
                boolean z11 = (i5 > 256 && x340Var7.g(iu30Var2)) || (iIntValue3 & 384) == 256;
                Object objT9 = x340Var7.T();
                if (z11 || objT9 == m4cVar2) {
                    objT9 = new y8i(iu30Var2, (byte) 6);
                    x340Var7.s0(objT9);
                }
                Function0 function3 = (Function0) objT9;
                boolean z12 = (i5 > 256 && x340Var7.g(iu30Var2)) || (iIntValue3 & 384) == 256;
                Object objT10 = x340Var7.T();
                if (z12 || objT10 == m4cVar2) {
                    objT10 = new wqf(iu30Var2, b3);
                    x340Var7.s0(objT10);
                }
                t4n1.d(strB, if5VarO, trcVar, (qim0) null, iu30Var3, iu30Var4, function1, z9, function2, function3, lz20Var, (iu30) objT10, x340Var7, 64);
                Long l2 = crcVar.d;
                if (l2 == null) {
                    x340Var7.i0(-211735435);
                    x340Var7.r(false);
                } else {
                    x340Var7.i0(-211735434);
                    long jLongValue = l2.longValue();
                    boolean z13 = (i5 > 256 && x340Var7.g(iu30Var2)) || (iIntValue3 & 384) == 256;
                    Object objT11 = x340Var7.T();
                    if (z13 || objT11 == m4cVar2) {
                        objT11 = new y8i(iu30Var2, (byte) 7);
                        x340Var7.s0(objT11);
                    }
                    Function0 function4 = (Function0) objT11;
                    boolean zI2 = x340Var7.i(lz20Var) | ((i5 > 256 && x340Var7.g(iu30Var2)) || (iIntValue3 & 384) == 256);
                    Object objT12 = x340Var7.T();
                    if (zI2 || objT12 == m4cVar2) {
                        objT12 = new iai(iu30Var2, lz20Var);
                        x340Var7.s0(objT12);
                    }
                    dem1.b(jLongValue, function4, (Function0) objT12, x340Var7, 0);
                    x340Var7.r(false);
                }
                return rih1Var;
            case 7:
                o4d o4dVar = (o4d) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                cat catVar = cat.b;
                m4c m4cVar3 = fkj0.X;
                qro1 qro1Var = o4dVar.a;
                boolean z14 = o4dVar.b;
                h981 h981Var = h981.b;
                if ((z14 || !qro1Var.equals(catVar)) && !qro1Var.equals(h981Var)) {
                    x340 x340Var9 = x340Var8;
                    x340Var9.i0(545373726);
                    x340Var9.r(false);
                } else {
                    x340 x340Var10 = x340Var8;
                    x340Var10.i0(544070610);
                    int i6 = (iIntValue4 & 896) ^ 384;
                    boolean z15 = (i6 > 256 && x340Var10.g(iu30Var5)) || (iIntValue4 & 384) == 256;
                    Object objT13 = x340Var10.T();
                    if (z15 || objT13 == m4cVar3) {
                        objT13 = new y8i(iu30Var5, (byte) 8);
                        x340Var10.s0(objT13);
                    }
                    Function0 function5 = (Function0) objT13;
                    i3u i3uVar = new i3u(7, false, false, false);
                    String strK = qro1Var.equals(catVar) ? x0d.k(x340Var10, 544224866, 2131959487, x340Var10, false) : x0d.k(x340Var10, 544322175, 2131959491, x340Var10, false);
                    String strO1 = qro1Var.equals(h981Var) ? cwl1.o0(x340Var10, 2131959490) : null;
                    String strK2 = qro1Var.equals(catVar) ? x0d.k(x340Var10, 544692253, 2131959489, x340Var10, false) : x0d.k(x340Var10, 544794181, 2131959485, x340Var10, false);
                    boolean z16 = (i6 > 256 && x340Var10.g(iu30Var5)) || (iIntValue4 & 384) == 256;
                    Object objT14 = x340Var10.T();
                    if (z16 || objT14 == m4cVar3) {
                        objT14 = new y8i(iu30Var5, (byte) 9);
                        x340Var10.s0(objT14);
                    }
                    zgx zgxVar = new zgx(strK2, new gbx(z50Var, (Function0) objT14));
                    String strK3 = qro1Var.equals(catVar) ? x0d.k(x340Var10, 545079908, 2131959486, x340Var10, false) : x0d.k(x340Var10, 545175264, 2131959488, x340Var10, false);
                    boolean z17 = (i6 > 256 && x340Var10.g(iu30Var5)) || (iIntValue4 & 384) == 256;
                    Object objT15 = x340Var10.T();
                    if (z17 || objT15 == m4cVar3) {
                        objT15 = new y8i(iu30Var5, (byte) 10);
                        x340Var10.s0(objT15);
                    }
                    mqo1.d(function5, i3uVar, (hux) null, strK, strO1, zgxVar, new zgx(strK3, new gbx(z50Var, (Function0) objT15)), x340Var10, 2359296, 4);
                    x340Var10.r(false);
                }
                return rih1Var;
            case 8:
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var11 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                ebd ebdVar = ((gbd) obj2).a;
                if (ebdVar.equals(abd.a)) {
                    x340 x340Var12 = x340Var11;
                    x340Var12.i0(2108095695);
                    int i7 = (iIntValue5 & 896) ^ 384;
                    boolean z18 = (i7 > 256 && x340Var12.g(iu30Var6)) || (iIntValue5 & 384) == 256;
                    Object objT16 = x340Var12.T();
                    if (z18 || objT16 == m4cVar4) {
                        objT16 = new y8i(iu30Var6, (byte) 11);
                        x340Var12.s0(objT16);
                    }
                    Function0 function6 = (Function0) objT16;
                    if ((i7 <= 256 || !x340Var12.g(iu30Var6)) && (iIntValue5 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT17 = x340Var12.T();
                    if (z2 || objT17 == m4cVar4) {
                        objT17 = new y8i(iu30Var6, (byte) 13);
                        x340Var12.s0(objT17);
                    }
                    nyn1.q(function6, (Function0) objT17, x340Var12, 0);
                    x340Var12.r(false);
                } else if (ebdVar.equals(dbd.a)) {
                    x340 x340Var13 = x340Var11;
                    x340Var13.i0(2108101643);
                    if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var13.g(iu30Var6)) && (iIntValue5 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT18 = x340Var13.T();
                    if (z2 || objT18 == m4cVar4) {
                        objT18 = new y8i(iu30Var6, (byte) 14);
                        x340Var13.s0(objT18);
                    }
                    nyn1.z((Function0) objT18, x340Var13, 0);
                    x340Var13.r(false);
                } else if (ebdVar.equals(zad.a)) {
                    x340 x340Var14 = x340Var11;
                    x340Var14.i0(2108104326);
                    if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var14.g(iu30Var6)) && (iIntValue5 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT19 = x340Var14.T();
                    if (z2 || objT19 == m4cVar4) {
                        objT19 = new y8i(iu30Var6, (byte) 15);
                        x340Var14.s0(objT19);
                    }
                    nyn1.p((Function0) objT19, x340Var14, 0);
                    x340Var14.r(false);
                } else if (ebdVar.equals(cbd.a)) {
                    x340 x340Var15 = x340Var11;
                    x340Var15.i0(2108106755);
                    if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var15.g(iu30Var6)) && (iIntValue5 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT20 = x340Var15.T();
                    if (z2 || objT20 == m4cVar4) {
                        objT20 = new y8i(iu30Var6, (byte) 16);
                        x340Var15.s0(objT20);
                    }
                    nyn1.v((Function0) objT20, x340Var15, 0);
                    x340Var15.r(false);
                } else if (ebdVar.equals(vad.a)) {
                    x340 x340Var16 = x340Var11;
                    x340Var16.i0(2108109124);
                    if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var16.g(iu30Var6)) && (iIntValue5 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT21 = x340Var16.T();
                    if (z2 || objT21 == m4cVar4) {
                        objT21 = new y8i(iu30Var6, (byte) 17);
                        x340Var16.s0(objT21);
                    }
                    nyn1.i((Function0) objT21, x340Var16, 0);
                    x340Var16.r(false);
                } else if (ebdVar.equals(xad.a)) {
                    x340 x340Var17 = x340Var11;
                    x340Var17.i0(2108111953);
                    if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var17.g(iu30Var6)) && (iIntValue5 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT22 = x340Var17.T();
                    if (z2 || objT22 == m4cVar4) {
                        objT22 = new y8i(iu30Var6, (byte) 18);
                        x340Var17.s0(objT22);
                    }
                    nyn1.k((Function0) objT22, x340Var17, 0);
                    x340Var17.r(false);
                } else if (ebdVar.equals(yad.a)) {
                    x340 x340Var18 = x340Var11;
                    x340Var18.i0(2108115152);
                    if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var18.g(iu30Var6)) && (iIntValue5 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT23 = x340Var18.T();
                    if (z2 || objT23 == m4cVar4) {
                        objT23 = new y8i(iu30Var6, (byte) 19);
                        x340Var18.s0(objT23);
                    }
                    nyn1.l((Function0) objT23, x340Var18, 0);
                    x340Var18.r(false);
                } else if (ebdVar.equals(wad.a)) {
                    x340 x340Var19 = x340Var11;
                    x340Var19.i0(2108118023);
                    if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var19.g(iu30Var6)) && (iIntValue5 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT24 = x340Var19.T();
                    if (z2 || objT24 == m4cVar4) {
                        objT24 = new y8i(iu30Var6, (byte) 20);
                        x340Var19.s0(objT24);
                    }
                    nyn1.j((Function0) objT24, x340Var19, 0);
                    x340Var19.r(false);
                } else if (ebdVar.equals(uad.a)) {
                    x340 x340Var20 = x340Var11;
                    x340Var20.i0(2108120450);
                    if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var20.g(iu30Var6)) && (iIntValue5 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT25 = x340Var20.T();
                    if (z2 || objT25 == m4cVar4) {
                        objT25 = new y8i(iu30Var6, (byte) 12);
                        x340Var20.s0(objT25);
                    }
                    nyn1.h((Function0) objT25, x340Var20, 0);
                    x340Var20.r(false);
                } else {
                    if (!(ebdVar instanceof bbd)) {
                        throw p3d1.k(x340Var11, 2108095206, false);
                    }
                    x340 x340Var21 = x340Var11;
                    x340Var21.i0(2108123534);
                    if ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var21.g(iu30Var6)) && (iIntValue5 & 384) != 256) {
                        z2 = false;
                    }
                    boolean zI3 = x340Var21.i(ebdVar) | z2;
                    Object objT26 = x340Var21.T();
                    if (zI3 || objT26 == m4cVar4) {
                        objT26 = new pid(iu30Var6, ebdVar, (lnm) null, (byte) 28);
                        x340Var21.s0(objT26);
                    }
                    qxd0.t(rih1Var, x340Var21, (vu30) objT26);
                    x340Var21.r(false);
                }
                return rih1Var;
            case 9:
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                if ((iIntValue6 & 384) == 0) {
                    iIntValue6 |= x340Var22.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue6 & 1, (iIntValue6 & 1153) != 1152)) {
                    uyn1.a((iIntValue6 >> 6) & 14, x340Var23, iu30Var7, (qim0) null);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 10:
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var24 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                if (((wfd) obj2).b) {
                    x340 x340Var25 = x340Var24;
                    x340Var25.i0(1236307931);
                    ryn1.f(x340Var25, 0);
                    x340Var25.r(false);
                } else {
                    x340 x340Var26 = x340Var24;
                    x340Var26.i0(1236349874);
                    ryn1.b(iu30Var8, x340Var26, (iIntValue7 >> 6) & 14);
                    x340Var26.r(false);
                }
                return rih1Var;
            case 11:
                int iIntValue8 = ((Number) obj5).intValue() >> 3;
                xyn1.b((jgd) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (iIntValue8 & 112) | 8 | (iIntValue8 & 14));
                return rih1Var;
            case 12:
                wgd wgdVar = (wgd) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var27 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                j2i j2iVarB = tro1.o(wgdVar.a).b((qim0) null, (lee1) null, (u7h) null, x340Var27, 4096, 7);
                boolean z19 = (((iIntValue9 & 896) ^ 384) > 256 && x340Var27.g(iu30Var9)) || (iIntValue9 & 384) == 256;
                x340 x340Var28 = x340Var27;
                Object objT27 = x340Var28.T();
                if (z19 || objT27 == m4cVar5) {
                    objT27 = new y8i(iu30Var9, (byte) 21);
                    x340Var28.s0(objT27);
                }
                gbx gbxVar2 = new gbx(z50Var, (Function0) objT27);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                Object objT28 = x340Var28.T();
                if (objT28 == m4cVar5) {
                    objT28 = ovh.S0;
                    x340Var28.s0(objT28);
                }
                jto1.b(s161.b(qim0VarF2, true, (iu30) objT28), (uvx) null, (max) null, false, (idn0) null, (ga80) null, gbxVar2, (gbx) null, tai.a, (xu30) null, (xu30) null, j2iVarB, tai.b, (xu30) null, (xu30) null, apo.r(-912179346, new okg(wgdVar, (byte) 16), x340Var28), x340Var28, 100663296, 196992, 26302);
                return rih1Var;
            case 13:
                xmd xmdVar = (xmd) obj2;
                ((Number) obj5).intValue();
                x340 x340Var29 = (b0k) obj4;
                if (((View) x340Var29.k(AndroidCompositionLocals_androidKt.f)).isAttachedToWindow()) {
                    af5 af5Var = xmdVar.b;
                    wmd wmdVar = xmdVar.a;
                    uwo1.f(af5Var, u291.z(anm1.N("text-sentence", u291.d(nim0Var, 1.0f)), een.N0, 2), wmdVar.f, (x9h) null, new a0e1(wmdVar.g), (iu30) null, 0, false, new cjc0(wmdVar.b), 0, (qx8) null, (cqs0) null, x340Var29, 0, 0, 3816);
                }
                return rih1Var;
            case 14:
                return a(obj, obj2, obj3, obj4, obj5);
            case 15:
                gwd gwdVar = (gwd) obj2;
                x340 x340Var30 = (b0k) obj4;
                ago1.a(gwdVar, (iu30) obj3, (qim0) null, (zau0) x340Var30.k(dge0.a), gwdVar.g, x340Var30, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 16:
                fho1.a((zxd) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 17:
                return d(obj, obj2, obj3, obj4, obj5);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return e(obj, obj2, obj3, obj4, obj5);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return f(obj, obj2, obj3, obj4, obj5);
            case 20:
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
                d5f d5fVar = (d5f) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var31 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                m4c m4cVar6 = fkj0.X;
                byte b4 = 29;
                if (d5fVar instanceof b5f) {
                    x340 x340Var32 = x340Var31;
                    x340Var32.i0(-980326472);
                    w4i1 w4i1Var = ((b5f) d5fVar).a;
                    if ((((iIntValue10 & 896) ^ 384) <= 256 || !x340Var32.g(iu30Var10)) && (iIntValue10 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT29 = x340Var32.T();
                    if (z2 || objT29 == m4cVar6) {
                        objT29 = new wqf(iu30Var10, b4);
                        x340Var32.s0(objT29);
                    }
                    Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
                    mqo1.c(w4i1Var, (iu30) objT29, (qim0) null, x340Var32, 0);
                    x340Var32.r(false);
                } else if (d5fVar instanceof c5f) {
                    x340 x340Var33 = x340Var31;
                    x340Var33.i0(-980322023);
                    c5f c5fVar = (c5f) d5fVar;
                    String str = c5fVar.a;
                    jwm jwmVar = c5fVar.c;
                    boolean z20 = c5fVar.b;
                    c380 c380VarA = mqo1.A(c5fVar.d);
                    if ((((iIntValue10 & 896) ^ 384) <= 256 || !x340Var33.g(iu30Var10)) && (iIntValue10 & 384) != 256) {
                        z2 = false;
                    }
                    Object objT30 = x340Var33.T();
                    if (z2 || objT30 == m4cVar6) {
                        objT30 = new y8i(iu30Var10, (byte) 29);
                        x340Var33.s0(objT30);
                    }
                    mqo1.f(str, jwmVar, z20, c380VarA, (Function0) objT30, (qim0) null, x340Var33, 0);
                    x340Var33.r(false);
                } else {
                    if (!(d5fVar instanceof a5f)) {
                        throw p3d1.k(x340Var31, -980328053, false);
                    }
                    x340 x340Var34 = x340Var31;
                    x340Var34.i0(-980314016);
                    w4i1 w4i1Var2 = ((a5f) d5fVar).a;
                    Parcelable.Creator<w4i1> creator2 = w4i1.CREATOR;
                    mqo1.a(w4i1Var2, (qim0) null, x340Var34, 0);
                    x340Var34.r(false);
                }
                return rih1Var;
        }
    }
}
