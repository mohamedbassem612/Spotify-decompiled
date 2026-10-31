package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b8j extends hab0 implements bv30 {
    public static final b8j N0;
    public static final b8j O0;
    public static final b8j P0;
    public static final b8j Q0;
    public static final b8j R0;
    public static final b8j S0;
    public static final b8j T0;
    public static final b8j U0;
    public static final b8j V0;
    public static final b8j W0;
    public static final b8j X;
    public static final b8j X0;
    public static final b8j Y;
    public static final b8j Y0;
    public static final b8j Z;
    public static final b8j Z0;
    public static final b8j a1;
    public static final b8j b;
    public static final b8j b1;
    public static final b8j c;
    public static final b8j c1;
    public static final b8j d;
    public static final b8j d1;
    public static final b8j e;
    public static final b8j e1;
    public static final b8j f;
    public static final b8j g;
    public static final b8j h;
    public static final b8j i;
    public static final b8j t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new b8j(i2, (byte) 0);
        c = new b8j(i2, (byte) 1);
        d = new b8j(i2, (byte) 2);
        e = new b8j(i2, (byte) 3);
        f = new b8j(i2, (byte) 4);
        g = new b8j(i2, (byte) 5);
        h = new b8j(i2, (byte) 6);
        i = new b8j(i2, (byte) 7);
        t = new b8j(i2, (byte) 8);
        X = new b8j(i2, (byte) 9);
        Y = new b8j(i2, (byte) 10);
        Z = new b8j(i2, (byte) 11);
        N0 = new b8j(i2, (byte) 12);
        O0 = new b8j(i2, (byte) 13);
        P0 = new b8j(i2, (byte) 14);
        Q0 = new b8j(i2, (byte) 15);
        R0 = new b8j(i2, (byte) 16);
        S0 = new b8j(i2, (byte) 17);
        T0 = new b8j(i2, (byte) 18);
        U0 = new b8j(i2, (byte) 19);
        V0 = new b8j(i2, (byte) 20);
        W0 = new b8j(i2, (byte) 21);
        X0 = new b8j(i2, (byte) 22);
        Y0 = new b8j(i2, (byte) 23);
        Z0 = new b8j(i2, (byte) 24);
        a1 = new b8j(i2, (byte) 25);
        b1 = new b8j(i2, (byte) 26);
        c1 = new b8j(i2, (byte) 27);
        d1 = new b8j(i2, (byte) 28);
        e1 = new b8j(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8j(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        bfx0 bfx0Var = (bfx0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if (bfx0Var.equals(zex0.a)) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1939420736);
            boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new n9j(iu30Var, (byte) 7);
                x340Var2.s0(objT);
            }
            j1e1.e(0, (Function0) objT, x340Var2, (qim0) null);
            x340Var2.r(false);
        } else {
            if (!bfx0Var.equals(afx0.a)) {
                throw p3d1.k(x340Var, 1939419662, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(1939422911);
            j1e1.i((qim0) null, x340Var3, 0);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ijx0 ijx0Var = (ijx0) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        int i2 = ijx0Var.d;
        int i3 = ijx0Var.e;
        boolean z = ijx0Var.f;
        if ((iIntValue & 48) == 0) {
            iIntValue |= x340Var.g(ijx0Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040);
        j06 j06Var = x340Var2.a;
        if (zY) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarX = uyn1.x(dug.f(i1p1.q(qim0VarZ, er31.b(6.0f)), cbx.a(x340Var2).a.a.a(), d4o1.a), 16.0f);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = oqi.R0;
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarX, true, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            uwo1.e(ijx0Var.b, anm1.N("PROGRESS_TRACKER_TITLE", nim0Var), vgo1.q(cbx.d(x340Var2).k, z, x340Var2), cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var2, 48, 0, 2032);
            op71.g(x340Var2, u291.h(nim0Var, 4.0f));
            uwo1.e(ijx0Var.c, anm1.N("PROGRESS_TRACKER_SUBTITLE", nim0Var), vgo1.q(cbx.d(x340Var2).j, z, x340Var2), cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, 48, 0, 2032);
            op71.g(x340Var2, u291.h(nim0Var, 16.0f));
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 48);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            tto1.d(i3 > 0 ? i2 / i3 : 0.0f, 0, 12, 0L, 0L, x340Var2, anm1.N("PROGRESS_TRACKER_BAR", i1p1.q(u291.h(new wnb0(1.0f, true), 4.0f), er31.b(2.0f))));
            uwo1.e(ab80.m(i2, i3, "/"), anm1.N("PROGRESS_TRACKER_LABEL", uyn1.B(nim0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14)), vgo1.q(cbx.d(x340Var2).j, z, x340Var2), cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, 48, 0, 2032);
            x340Var2.r(true);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        rlx0 rlx0Var = (rlx0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new n9j(iu30Var, (byte) 8);
            x340Var2.s0(objT);
        }
        dem1.k(rlx0Var, (Function0) objT, (qim0) null, x340Var2, ((iIntValue >> 3) & 14) | 8);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        kmx0 kmx0Var = (kmx0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new n9j(iu30Var, (byte) 9);
            x340Var2.s0(objT);
        }
        vvm1.k(kmx0Var, hqn1.s("promo-preview-card", cwl1.o0(x340Var2, 2131956566), (Function0) objT, nim0.a), x340Var2, ((iIntValue >> 3) & 14) | 8);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Number) obj5).intValue();
        fq7.g(((ipx0) obj2).a, (qim0) null, xay.e(3, (ni20) null).a(xay.n(3, (iu30) null)), xay.f(3, (ni20) null).a(xay.r(3, (iu30) null)), (String) null, gaj.b, (b0k) obj4, 196608, 18);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String str = ((rwx0) obj2).a;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new n9j(iu30Var, (byte) 10);
            x340Var2.s0(objT);
        }
        irn1.x(0, str, (Function0) objT, x340Var2, null);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:424:0x0a6b  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i2;
        Object obj6;
        String strN0;
        String strK;
        x340 x340Var;
        int i3;
        Object objT;
        Object obj7;
        int i4;
        Object obj8;
        Object obj9;
        Object obj10;
        int i5;
        int i6;
        Object obj11;
        Object obj12;
        Object obj13;
        String strK2;
        Object obj14;
        int i7;
        Object obj15;
        Object obj16;
        String strK3;
        Object obj17;
        qim0 qim0VarB;
        byte b2 = this.a;
        qim0 qim0Var = nim0.a;
        j2i j2iVarN0 = null;
        byte b3 = 1;
        z = true;
        boolean z = true;
        z = true;
        boolean z2 = true;
        z = true;
        boolean z3 = true;
        z = true;
        boolean z4 = true;
        c = 1;
        char c2 = 1;
        c = 1;
        char c3 = 1;
        b3 = 1;
        byte b4 = 0;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                dzo1.e((iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 6) & 14);
                return rih1Var;
            case 1:
                tet0 tet0Var = (tet0) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var2 = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                if ((iIntValue & 48) == 0) {
                    i2 = (x340Var2.g(tet0Var) ? 32 : 16) | iIntValue;
                } else {
                    i2 = iIntValue;
                }
                if ((iIntValue & 384) == 0) {
                    i2 |= x340Var2.i(iu30Var) ? 256 : 128;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    boolean zE = x340Var3.e(tet0Var.d);
                    Object objT2 = x340Var3.T();
                    if (zE || objT2 == m4cVar) {
                        obj6 = objT2;
                        mdt mdtVarA = yv91.a(new vjh(tet0Var, (byte) 8));
                        x340Var3.s0(mdtVarA);
                        obj6 = mdtVarA;
                    }
                    tob1 tob1Var = (tob1) obj6;
                    Object objT3 = x340Var3.T();
                    Object obj18 = objT3;
                    if (objT3 == m4cVar) {
                        hrr0 hrr0VarQ = v8r.q("");
                        x340Var3.s0(hrr0VarQ);
                        obj18 = hrr0VarQ;
                    }
                    ven0 ven0Var = (ven0) obj18;
                    String str = tet0Var.c;
                    if (str == null) {
                        x340Var3.i0(-1383423608);
                        x340Var3.r(false);
                    } else {
                        x340Var3.i0(-1383423607);
                        j2iVarN0 = cwl1.n0(2131959804, new Object[]{str, (String) tob1Var.getValue()}, x340Var3);
                        x340Var3.r(false);
                    }
                    if (j2iVarN0 == null) {
                        x340Var3.i0(1063755455);
                        j2iVarN0 = cwl1.n0(2131959806, new Object[]{(String) tob1Var.getValue()}, x340Var3);
                    } else {
                        x340Var3.i0(1063751549);
                    }
                    x340Var3.r(false);
                    ven0Var.setValue(j2iVarN0);
                    b4 = (i2 & 896) == 256 ? (byte) 1 : (byte) 0;
                    Object objT4 = x340Var3.T();
                    Object obj19 = objT4;
                    if (b4 != 0 || objT4 == m4cVar) {
                        q4j q4jVar = new q4j(iu30Var, (byte) 27);
                        x340Var3.s0(q4jVar);
                        obj19 = q4jVar;
                    }
                    foo1.c(new gbx(z50.c, (Function0) obj19), new idx(1), anm1.N("button", qim0Var), null, yla.s(x340Var3), null, null, null, null, null, apo.r(-895104301, new xd2(ven0Var, (byte) 4), x340Var3), x340Var3, 384, 48, 2008);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 2:
                yjt0 yjt0Var = (yjt0) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                String str2 = yjt0Var.c;
                String str3 = yjt0Var.a;
                wjt0 wjt0Var = yjt0Var.b;
                if (!(wjt0Var instanceof vjt0) && !wjt0Var.equals(ujt0.a)) {
                    if (wjt0Var.equals(tjt0.a)) {
                        x340 x340Var5 = x340Var4;
                        strK = x0d.k(x340Var5, 1054638036, 2131959502, x340Var5, false);
                    } else {
                        if (!wjt0Var.equals(rjt0.a) && !wjt0Var.equals(sjt0.a)) {
                            throw p3d1.k(x340Var4, 1054626574, false);
                        }
                        x340 x340Var6 = x340Var4;
                        x340Var6.i0(1054642500);
                        strN0 = cwl1.n0(2131959508, new Object[]{str3}, x340Var6);
                        x340Var6.r(false);
                    }
                    idx idxVar = new idx(4);
                    if ((((iIntValue2 & 896) ^ 384) > 256 || !x340Var4.g(iu30Var2)) && (iIntValue2 & 384) != 256) {
                    }
                    x340Var = x340Var4;
                    i3 = (x340Var.g(strK) ? 1 : 0) | b3;
                    objT = x340Var.T();
                    if (i3 == 0 || objT == fkj0.X) {
                        obj7 = objT;
                        are areVar = new are(iu30Var2, strK, (byte) 2);
                        x340Var.s0(areVar);
                        obj7 = areVar;
                    }
                    obj7 = objT;
                    foo1.c(new gbx(z50.c, (Function0) obj7), idxVar, anm1.N("play_from_here_button", qim0Var), null, null, null, null, null, g8j.a, null, g8j.b, x340Var, 805306368, 48, 1528);
                    return rih1Var;
                }
                x340 x340Var7 = x340Var4;
                x340Var7.i0(1054629484);
                if (str2 != null) {
                    x340Var7.i0(-1666198725);
                    strN0 = cwl1.n0(2131959507, new Object[]{str2}, x340Var7);
                    x340Var7.r(false);
                } else {
                    x340Var7.i0(-1666087900);
                    strN0 = cwl1.n0(2131959508, new Object[]{str3}, x340Var7);
                    x340Var7.r(false);
                }
                x340Var7.r(false);
                strK = strN0;
                idx idxVar2 = new idx(4);
                b3 = ((iIntValue2 & 896) ^ 384) > 256 ? (byte) 0 : (byte) 0;
                x340Var = x340Var4;
                i3 = (x340Var.g(strK) ? 1 : 0) | b3;
                objT = x340Var.T();
                if (i3 == 0) {
                    obj7 = objT;
                    are areVar2 = new are(iu30Var2, strK, (byte) 2);
                    x340Var.s0(areVar2);
                    obj7 = areVar2;
                } else {
                    obj7 = objT;
                    are areVar3 = new are(iu30Var2, strK, (byte) 2);
                    x340Var.s0(areVar3);
                    obj7 = areVar3;
                }
                obj7 = objT;
                foo1.c(new gbx(z50.c, (Function0) obj7), idxVar2, anm1.N("play_from_here_button", qim0Var), null, null, null, null, null, g8j.a, null, g8j.b, x340Var, 805306368, 48, 1528);
                return rih1Var;
            case 3:
                ecu0 ecu0Var = (ecu0) obj2;
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                jto1.b(u291.f(qim0Var, 1.0f), null, null, false, null, null, null, null, null, null, null, null, apo.r(202899547, new n8j(ecu0Var, b4), b0kVar), null, null, apo.r(491745656, new n8j(ecu0Var, b3), b0kVar), b0kVar, 0, 196992, 28670);
                return rih1Var;
            case 4:
                x340 x340Var8 = (b0k) obj4;
                ((Number) obj5).intValue();
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var8).g;
                String str4 = ((kgu0) obj2).a;
                int length = str4.length();
                isl islVar = isl.a;
                if (length > 0) {
                    x340 x340Var9 = x340Var8;
                    x340Var9.i0(231983535);
                    ni7 ni7VarA = oi7.a(Uri.parse(str4), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var9, 0, 0, 131070);
                    p3v p3vVar = new p3v(48.0f);
                    cua cuaVar = cbx.b(x340Var9).f;
                    cua cuaVar2 = cbx.b(x340Var9).f;
                    eso1.h(ni7VarA, islVar, (qim0) null, p3vVar, new zvx(), (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var9, 48, 484);
                    x340Var9.r(false);
                } else {
                    x340 x340Var10 = x340Var8;
                    x340Var10.i0(232246508);
                    qim0 qim0VarR = u291.r(qim0Var, 48.0f);
                    cua cuaVar3 = cbx.b(x340Var10).f;
                    qim0 qim0VarF = dug.f(i1p1.q(qim0VarR, er31.b(4.0f)), ((vex) zex.a.e).i, d4o1.a);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM = x340Var10.m();
                    qim0 qim0VarE = zr7.E(x340Var10, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(hmb0.t1);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(gfh0VarC, x340Var10, y580.O0);
                    nko1.H(xos0VarM, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE, x340Var10, y580.Y);
                    w0h1.a(grx.c, islVar, u291.r(qim0Var, 24.0f), cbx.a(x340Var10).b.b, 0L, false, x340Var10, grx.d | 48, 48);
                    x340Var10.r(true);
                    x340Var10.r(false);
                }
                return rih1Var;
            case 5:
                z5p1.f((lnu0) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 6:
                j6p1.g((ovu0) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 7:
                m6p1.d((gwu0) obj2, null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 8:
                a0v0 a0v0Var = (a0v0) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var11 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                if ((iIntValue3 & 48) == 0) {
                    i4 = iIntValue3 | (x340Var11.g(a0v0Var) ? 32 : 16);
                } else {
                    i4 = iIntValue3;
                }
                if ((iIntValue3 & 384) == 0) {
                    i4 |= x340Var11.i(iu30Var3) ? 256 : 128;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    String strO0 = cwl1.o0(x340Var12, 2131958129);
                    String strO1 = cwl1.o0(x340Var12, 2131958127);
                    boolean z5 = a0v0Var.a;
                    boolean z6 = (i4 & 896) == 256;
                    Object objT5 = x340Var12.T();
                    if (z6 || objT5 == fkj0.X) {
                        obj8 = objT5;
                        k4j k4jVar = new k4j(iu30Var3, (byte) 6);
                        x340Var12.s0(k4jVar);
                        obj8 = k4jVar;
                    }
                    obj8 = objT5;
                    zxo1.a(strO0, strO1, null, z5, false, (iu30) obj8, x340Var12, 0, 20);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj5).intValue();
                x340 x340Var13 = (b0k) obj4;
                if (((unb1) obj2) instanceof jmb1) {
                    x340Var13.i0(710984826);
                } else {
                    x340Var13.i0(1824048793);
                    s9p1.t(6, x340Var13, null, false);
                }
                x340Var13.r(false);
                return rih1Var;
            case 10:
                ydv0 ydv0Var = (ydv0) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                List list = ydv0Var.a;
                char c4 = ((((iIntValue4 & 896) ^ 384) <= 256 || !x340Var14.g(iu30Var4)) && (iIntValue4 & 384) != 256) ? (char) 0 : (char) 1;
                if ((((iIntValue4 & 112) ^ 48) <= 32 || !x340Var14.g(ydv0Var)) && (iIntValue4 & 48) != 32) {
                    c3 = 0;
                }
                int i8 = c4 | c3;
                x340 x340Var15 = x340Var14;
                Object objT6 = x340Var15.T();
                if (i8 != 0 || objT6 == fkj0.X) {
                    obj9 = objT6;
                    puh puhVar = new puh(iu30Var4, ydv0Var, (byte) 14);
                    x340Var15.s0(puhVar);
                    obj9 = puhVar;
                }
                obj9 = objT6;
                v9p1.n(list, (iu30) obj9, x340Var15, 0);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                bfv0 bfv0Var = (bfv0) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                String strN1 = cwl1.n0(2131960258, new Object[]{Integer.valueOf(bfv0Var.b), bfv0Var.a}, x340Var16);
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var16).k;
                qim0 qim0VarN = anm1.N("PopularityIndicator", qim0Var);
                char c5 = ((((iIntValue5 & 896) ^ 384) <= 256 || !x340Var16.g(iu30Var5)) && (iIntValue5 & 384) != 256) ? (char) 0 : (char) 1;
                if ((((iIntValue5 & 112) ^ 48) <= 32 || !x340Var16.g(bfv0Var)) && (iIntValue5 & 48) != 32) {
                    c2 = 0;
                }
                int i9 = c5 | c2;
                x340 x340Var17 = x340Var16;
                Object objT7 = x340Var17.T();
                if (i9 != 0 || objT7 == fkj0.X) {
                    obj10 = objT7;
                    dfi dfiVar = new dfi(iu30Var5, bfv0Var, (byte) 19);
                    x340Var17.s0(dfiVar);
                    obj10 = dfiVar;
                }
                obj10 = objT7;
                uwo1.e(strN1, bin.x(qim0VarN, false, null, null, null, (Function0) obj10, 15), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var17, 0, 0, 2040);
                return rih1Var;
            case grn1.d /* 12 */:
                ebp1.e((ziv0) obj2, (iu30) obj3, null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 13:
                yiv0 yiv0Var = (yiv0) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                if ((iIntValue6 & 48) == 0) {
                    i5 = iIntValue6 | (x340Var18.g(yiv0Var) ? 32 : 16);
                } else {
                    i5 = iIntValue6;
                }
                if ((iIntValue6 & 384) == 0) {
                    i5 |= x340Var18.i(iu30Var6) ? 256 : 128;
                }
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(i5 & 1, (i5 & 1169) != 1168)) {
                    cbp1.e(yiv0Var, iu30Var6, null, x340Var19, (i5 >> 3) & 126);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 14:
                ajv0 ajv0Var = (ajv0) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                if ((iIntValue7 & 48) == 0) {
                    i6 = iIntValue7 | (x340Var20.g(ajv0Var) ? 32 : 16);
                } else {
                    i6 = iIntValue7;
                }
                if ((iIntValue7 & 384) == 0) {
                    i6 |= x340Var20.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(i6 & 1, (i6 & 1169) != 1168)) {
                    vho vhoVar = new vho(ajv0Var.c, ajv0Var.a, ajv0Var.b, new sho(), (nho) null, (String) null, (String) null, 240);
                    jho jhoVar = new jho();
                    boolean z7 = (i6 & 896) == 256;
                    Object objT8 = x340Var21.T();
                    if (z7 || objT8 == fkj0.X) {
                        obj11 = objT8;
                        k4j k4jVar2 = new k4j(iu30Var7, (byte) 7);
                        x340Var21.s0(k4jVar2);
                        obj11 = k4jVar2;
                    }
                    obj11 = objT8;
                    fbp1.h(vhoVar, jhoVar, (iu30) obj11, anm1.N("curation-button", qim0Var), x340Var21, 3072);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 15:
                z47.m((eov0) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 16:
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                String str5 = ((ewv0) obj2).a;
                int i10 = (iIntValue8 & 896) ^ 384;
                boolean z8 = (i10 > 256 && x340Var22.g(iu30Var8)) || (iIntValue8 & 384) == 256;
                x340 x340Var23 = x340Var22;
                Object objT9 = x340Var23.T();
                Object obj20 = objT9;
                if (z8 || objT9 == m4cVar2) {
                    q4j q4jVar2 = new q4j(iu30Var8, (byte) 29);
                    x340Var23.s0(q4jVar2);
                    obj20 = q4jVar2;
                }
                Function0 function0 = (Function0) obj20;
                boolean z9 = (i10 > 256 && x340Var23.g(iu30Var8)) || (iIntValue8 & 384) == 256;
                Object objT10 = x340Var23.T();
                Object obj21 = objT10;
                if (z9 || objT10 == m4cVar2) {
                    n9j n9jVar = new n9j(iu30Var8, (byte) 0);
                    x340Var23.s0(n9jVar);
                    obj21 = n9jVar;
                }
                Function0 function1 = (Function0) obj21;
                b4 = ((i10 > 256 && x340Var23.g(iu30Var8)) || (iIntValue8 & 384) == 256) ? (byte) 1 : (byte) 0;
                Object objT11 = x340Var23.T();
                Object obj22 = objT11;
                if (b4 != 0 || objT11 == m4cVar2) {
                    n9j n9jVar2 = new n9j(iu30Var8, (byte) 1);
                    x340Var23.s0(n9jVar2);
                    obj22 = n9jVar2;
                }
                lcc.r(str5, (qim0) null, function0, function1, (Function0) obj22, x340Var23, 0);
                return rih1Var;
            case 17:
                r8w0 r8w0Var = (r8w0) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var24 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                if ((((iIntValue9 & 896) ^ 384) <= 256 || !x340Var24.g(iu30Var9)) && (iIntValue9 & 384) != 256) {
                    z4 = false;
                }
                x340 x340Var25 = x340Var24;
                Object objT12 = x340Var25.T();
                if (z4 || objT12 == fkj0.X) {
                    obj12 = objT12;
                    n9j n9jVar3 = new n9j(iu30Var9, (byte) 2);
                    x340Var25.s0(n9jVar3);
                    obj12 = n9jVar3;
                }
                obj12 = objT12;
                yto.g(r8w0Var, (Function0) obj12, x340Var25, (iIntValue9 >> 3) & 14);
                return rih1Var;
            case 18:
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var26 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                no90 no90Var = ((fnw0) obj2).a;
                if (no90Var == null) {
                    x340 x340Var27 = x340Var26;
                    x340Var27.i0(359070825);
                    hax haxVar = new hax("Select an option");
                    Object objT13 = x340Var27.T();
                    if (objT13 == m4cVar3) {
                        obj13 = objT13;
                        fki fkiVar = fki.e;
                        x340Var27.s0(fkiVar);
                        obj13 = fkiVar;
                    }
                    obj13 = objT13;
                    t890.c(2131956953, haxVar, (Function0) obj13, x340Var27, 384, 0);
                    x340Var27.r(false);
                } else {
                    x340 x340Var28 = x340Var26;
                    x340Var28.i0(359238225);
                    boolean z10 = no90Var.b.a;
                    if (z10) {
                        x340Var28.i0(-819693963);
                        if ((((iIntValue10 & 896) ^ 384) <= 256 || !x340Var28.g(iu30Var10)) && (iIntValue10 & 384) != 256) {
                            z2 = false;
                        }
                        Object objT14 = x340Var28.T();
                        Object obj23 = objT14;
                        if (z2 || objT14 == m4cVar3) {
                            n9j n9jVar4 = new n9j(iu30Var10, (byte) 3);
                            x340Var28.s0(n9jVar4);
                            obj23 = n9jVar4;
                        }
                        t890.c(2131952475, (max) null, (Function0) obj23, x340Var28, 0, 2);
                        x340Var28.r(false);
                    } else {
                        if (z10) {
                            throw p3d1.k(x340Var28, -819695663, false);
                        }
                        x340Var28.i0(-819690711);
                        if ((((iIntValue10 & 896) ^ 384) <= 256 || !x340Var28.g(iu30Var10)) && (iIntValue10 & 384) != 256) {
                            z3 = false;
                        }
                        Object objT15 = x340Var28.T();
                        Object obj24 = objT15;
                        if (z3 || objT15 == m4cVar3) {
                            n9j n9jVar5 = new n9j(iu30Var10, (byte) 4);
                            x340Var28.s0(n9jVar5);
                            obj24 = n9jVar5;
                        }
                        t890.c(2131956953, (max) null, (Function0) obj24, x340Var28, 0, 2);
                        x340Var28.r(false);
                    }
                    x340Var28.r(false);
                }
                return rih1Var;
            case 19:
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                boolean z11 = ((dpw0) obj2).a;
                orx orxVar = z11 ? orx.c : pox.c;
                if (z11) {
                    x340 x340Var30 = x340Var29;
                    strK2 = x0d.k(x340Var30, 1268328897, 2131953874, x340Var30, false);
                } else {
                    x340 x340Var31 = x340Var29;
                    strK2 = x0d.k(x340Var31, 1268400352, 2131953873, x340Var31, false);
                }
                String str6 = strK2;
                String strO2 = cwl1.o0(x340Var29, 2131953872);
                b4 = ((((iIntValue11 & 896) ^ 384) > 256 && x340Var29.g(iu30Var11)) || (iIntValue11 & 384) == 256) ? (byte) 1 : (byte) 0;
                x340 x340Var32 = x340Var29;
                Object objT16 = x340Var32.T();
                if (b4 != 0 || objT16 == fkj0.X) {
                    obj14 = objT16;
                    n9j n9jVar6 = new n9j(iu30Var11, (byte) 5);
                    x340Var32.s0(n9jVar6);
                    obj14 = n9jVar6;
                }
                obj14 = objT16;
                hqn1.h(orxVar, str6, strO2, (Function0) obj14, null, 0L, !z11, false, null, null, x340Var32, 8, 944);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                t7x0 t7x0Var = (t7x0) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var33 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                if ((iIntValue12 & 48) == 0) {
                    i7 = iIntValue12 | ((iIntValue12 & 64) == 0 ? x340Var33.g(t7x0Var) : x340Var33.i(t7x0Var) ? 32 : 16);
                } else {
                    i7 = iIntValue12;
                }
                if ((iIntValue12 & 384) == 0) {
                    i7 |= x340Var33.i(iu30Var12) ? 256 : 128;
                }
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(i7 & 1, (i7 & 1169) != 1168)) {
                    r7x0 r7x0Var = t7x0Var.a;
                    lww0 lww0Var = t7x0Var.b;
                    boolean z12 = t7x0Var.c;
                    boolean z13 = (i7 & 896) == 256;
                    Object objT17 = x340Var34.T();
                    if (z13 || objT17 == fkj0.X) {
                        obj15 = objT17;
                        k4j k4jVar3 = new k4j(iu30Var12, (byte) 8);
                        x340Var34.s0(k4jVar3);
                        obj15 = k4jVar3;
                    }
                    obj15 = objT17;
                    nb51.i(r7x0Var, lww0Var, z12, (iu30) obj15, x340Var34, 0);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 21:
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var35 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                if ((iIntValue13 & 384) == 0) {
                    iIntValue13 |= x340Var35.i(iu30Var13) ? 256 : 128;
                }
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue13 & 1, (iIntValue13 & 1153) != 1152)) {
                    String strO3 = cwl1.o0(x340Var36, 2131958131);
                    String strO4 = cwl1.o0(x340Var36, 2131958130);
                    pm31 pm31Var = new pm31(0);
                    boolean z14 = (iIntValue13 & 896) == 256;
                    Object objT18 = x340Var36.T();
                    if (z14 || objT18 == fkj0.X) {
                        obj16 = objT18;
                        n9j n9jVar7 = new n9j(iu30Var13, (byte) 6);
                        x340Var36.s0(n9jVar7);
                        obj16 = n9jVar7;
                    }
                    obj16 = objT18;
                    yxo1.a(strO3, strO4, bin.x(nim0.a, false, null, pm31Var, null, (Function0) obj16, 11), true, x340Var36, 3072, 0);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 22:
                return a(obj, obj2, obj3, obj4, obj5);
            case 23:
                return d(obj, obj2, obj3, obj4, obj5);
            case 24:
                return e(obj, obj2, obj3, obj4, obj5);
            case 25:
                return f(obj, obj2, obj3, obj4, obj5);
            case 26:
                return g(obj, obj2, obj3, obj4, obj5);
            case 27:
                ((Number) obj5).intValue();
                throw null;
            case 28:
                return h(obj, obj2, obj3, obj4, obj5);
            default:
                y0y0 y0y0Var = (y0y0) obj2;
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var37 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                boolean z15 = y0y0Var.b;
                boolean z16 = y0y0Var.a;
                if (z16) {
                    x340 x340Var38 = x340Var37;
                    strK3 = x0d.k(x340Var38, -449327705, 2131963445, x340Var38, false);
                } else if (z15) {
                    x340 x340Var39 = x340Var37;
                    strK3 = x0d.k(x340Var39, -449324990, 2131963444, x340Var39, false);
                } else {
                    x340 x340Var40 = x340Var37;
                    x340Var40.i0(-1044104880);
                    x340Var40.r(false);
                    strK3 = null;
                }
                lox loxVar = lox.c;
                String strO5 = cwl1.o0(x340Var37, 2131963446);
                if (strK3 == null) {
                    x340 x340Var41 = x340Var37;
                    x340Var41.i0(-1043887136);
                    x340Var41.r(false);
                    qim0VarB = null;
                } else {
                    x340 x340Var42 = x340Var37;
                    x340Var42.i0(-1043887135);
                    boolean zG = x340Var42.g(strK3);
                    Object objT19 = x340Var42.T();
                    if (zG || objT19 == m4cVar4) {
                        obj17 = objT19;
                        irf irfVar = new irf(strK3, (byte) 25);
                        x340Var42.s0(irfVar);
                        obj17 = irfVar;
                    }
                    qim0VarB = s161.b(qim0Var, false, (iu30) obj17);
                    x340Var42.r(false);
                }
                qim0 qim0Var2 = qim0VarB == null ? qim0Var : qim0VarB;
                u2g u2gVar = new u2g(1, z16);
                if (z15 && !z16) {
                    j2iVarN0 = kaj.a;
                }
                j2i j2iVar = j2iVarN0;
                if ((((iIntValue14 & 896) ^ 384) <= 256 || !x340Var37.g(iu30Var14)) && (iIntValue14 & 384) != 256) {
                    z = false;
                }
                x340 x340Var43 = x340Var37;
                Object objT20 = x340Var43.T();
                Object obj25 = objT20;
                if (z || objT20 == m4cVar4) {
                    n9j n9jVar8 = new n9j(iu30Var14, (byte) 11);
                    x340Var43.s0(n9jVar8);
                    obj25 = n9jVar8;
                }
                kyo1.c(strO5, loxVar, (Function0) obj25, qim0Var2, false, null, u2gVar, j2iVar, x340Var43, lox.d << 3, 48);
                return rih1Var;
        }
    }
}
