package p;

import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.scrollsita.v1.Section;
import com.spotify.searchview.proto.Entity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uzi extends hab0 implements bv30 {
    public static final uzi N0;
    public static final uzi O0;
    public static final uzi P0;
    public static final uzi Q0;
    public static final uzi R0;
    public static final uzi S0;
    public static final uzi T0;
    public static final uzi U0;
    public static final uzi V0;
    public static final uzi W0;
    public static final uzi X;
    public static final uzi X0;
    public static final uzi Y;
    public static final uzi Y0;
    public static final uzi Z;
    public static final uzi Z0;
    public static final uzi a1;
    public static final uzi b;
    public static final uzi b1;
    public static final uzi c;
    public static final uzi c1;
    public static final uzi d;
    public static final uzi d1;
    public static final uzi e;
    public static final uzi e1;
    public static final uzi f;
    public static final uzi g;
    public static final uzi h;
    public static final uzi i;
    public static final uzi t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new uzi(i2, (byte) 0);
        c = new uzi(i2, (byte) 1);
        d = new uzi(i2, (byte) 2);
        e = new uzi(i2, (byte) 3);
        f = new uzi(i2, (byte) 4);
        g = new uzi(i2, (byte) 5);
        h = new uzi(i2, (byte) 6);
        i = new uzi(i2, (byte) 7);
        t = new uzi(i2, (byte) 8);
        X = new uzi(i2, (byte) 9);
        Y = new uzi(i2, (byte) 10);
        Z = new uzi(i2, (byte) 11);
        N0 = new uzi(i2, (byte) 12);
        O0 = new uzi(i2, (byte) 13);
        P0 = new uzi(i2, (byte) 14);
        Q0 = new uzi(i2, (byte) 15);
        R0 = new uzi(i2, (byte) 16);
        S0 = new uzi(i2, (byte) 17);
        T0 = new uzi(i2, (byte) 18);
        U0 = new uzi(i2, (byte) 19);
        V0 = new uzi(i2, (byte) 20);
        W0 = new uzi(i2, (byte) 21);
        X0 = new uzi(i2, (byte) 22);
        Y0 = new uzi(i2, (byte) 23);
        Z0 = new uzi(i2, (byte) 24);
        a1 = new uzi(i2, (byte) 25);
        b1 = new uzi(i2, (byte) 26);
        c1 = new uzi(i2, (byte) 27);
        d1 = new uzi(i2, (byte) 28);
        e1 = new uzi(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uzi(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        lvj0 lvj0Var = (lvj0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(lvj0Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new c1j(iu30Var, (byte) 8);
                x340Var2.s0(objT);
            }
            x74.f((Function0) objT, (scx) null, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(-1546818202, new ef8((Object) lvj0Var, (Object) iu30Var, (byte) 27), x340Var2), x340Var2, 0, 48, Entity.AUTOCOMPLETE_FIELD_NUMBER);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i2;
        yxj0 yxj0Var = (yxj0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(yxj0Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            int iC = l1d.C(yxj0Var.b);
            if (iC == 0) {
                x340Var2.i0(-1099109708);
                u1p1.j(yxj0Var, iu30Var, x340Var2, (i2 >> 3) & 126);
                x340Var2.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var2, -1099111901, false);
                }
                x340Var2.i0(-1099106606);
                u1p1.l(yxj0Var, iu30Var, x340Var2, (i2 >> 3) & 126);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        p6k0 p6k0Var = (p6k0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(p6k0Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            o6k0 o6k0Var = p6k0Var.a;
            if (o6k0Var.e || o6k0Var.f) {
                x340Var2.i0(-277886192);
                b2p1.l(p6k0Var, iu30Var, x340Var2, (i2 >> 3) & 126);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-277822952);
                b2p1.f(p6k0Var, iu30Var, x340Var2, (i2 >> 3) & 126);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        mmr0 mmr0Var;
        dak0 dak0Var = (dak0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        int i2 = dak0Var.b;
        cak0 cak0Var = dak0Var.a;
        zge1 zge1Var = dak0Var.c;
        zge1 zge1Var2 = (zge1Var == null || zge1Var.c.isEmpty()) ? null : zge1Var;
        boolean z = true;
        boolean z2 = zge1Var2 == null;
        x340 x340Var2 = x340Var;
        boolean zE = x340Var2.e(i2) | x340Var2.h(z2);
        Object objT = x340Var2.T();
        if (zE || objT == m4cVar) {
            objT = z2 ? k1u.q(i2) : null;
            x340Var2.s0(objT);
        }
        jel1 jel1Var = (jel1) objT;
        int i3 = dak0Var.b;
        ijf1 ijf1Var = cak0Var.a;
        int i4 = cak0Var.d;
        int iOrdinal = ijf1Var.ordinal();
        if (iOrdinal == 0) {
            int i5 = (i3 / 2) + 15000;
            int i6 = i3 - i4;
            if (i5 > i6) {
                i5 = i6;
            }
            Integer numValueOf = Integer.valueOf(i5);
            if (i6 < 0) {
                i6 = 0;
            }
            mmr0Var = new mmr0(numValueOf, Integer.valueOf(i6));
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            int i7 = ((i3 / 2) - 15000) - i4;
            if (i7 < 0) {
                i7 = 0;
            }
            mmr0Var = new mmr0(0, Integer.valueOf(i7));
        }
        int iIntValue2 = ((Number) mmr0Var.a).intValue();
        int iIntValue3 = ((Number) mmr0Var.b).intValue();
        uia uiaVar = dak0Var.d;
        uia uiaVar2 = (uiaVar == null || !cak0Var.f) ? null : uiaVar;
        int i8 = cak0Var.c;
        int i9 = cak0Var.d;
        boolean z3 = cak0Var.e;
        if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
            z = false;
        }
        boolean zI = x340Var2.i(dak0Var) | z;
        Object objT2 = x340Var2.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new ef8((Object) iu30Var, (Object) dak0Var, (byte) 28);
            x340Var2.s0(objT2);
        }
        iel1.a(i3, jel1Var, i8, i9, iIntValue2, iIntValue3, z3, (xu30) objT2, (qim0) null, zge1Var2, uiaVar2, x340Var2, 0);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 384) == 0) {
            iIntValue |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1153) != 1152)) {
            boolean z = (iIntValue & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new c1j(iu30Var, (byte) 9);
                x340Var2.s0(objT);
            }
            x74.f((Function0) objT, (scx) null, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(1708383500, new ip0(iu30Var, (byte) 16), x340Var2), x340Var2, 0, 48, Entity.AUTOCOMPLETE_FIELD_NUMBER);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        obk0 obk0Var = (obk0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(obk0Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            fq7.g(obk0Var.d, null, xay.e(2, irn1.o0(300, 0, (dlv) null, 6)), xay.f(2, irn1.o0(300, 0, (dlv) null, 6)), null, apo.r(-1966336385, new ef8((Object) iu30Var, (Object) obk0Var, (byte) 29), x340Var2), x340Var2, 200064, 18);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        boolean z;
        String strK;
        vu30 vu30Var;
        Object next;
        String strU;
        byte b2 = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                ((Number) obj5).intValue();
                kqn1.j((qim0) null, (b0k) obj4, 0);
                return rih1Var;
            case 1:
                tho1.h((iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 6) & 14);
                return rih1Var;
            case 2:
                xio1.f((((Number) obj5).intValue() >> 3) & 112, (b0k) obj4, (iu30) obj3, ((qjh0) obj2).a, (qim0) null);
                return rih1Var;
            case 3:
                int iIntValue = ((Number) obj5).intValue();
                rjo1.e((smh0) obj2, (qim0) null, (iu30) obj3, (b0k) obj4, (iIntValue & 896) | ((iIntValue >> 3) & 14));
                return rih1Var;
            case 4:
                iu30 iu30Var = (iu30) obj3;
                int iIntValue2 = ((Number) obj5).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                x340 x340Var = (b0k) obj4;
                x340Var.i0(-1685979484);
                pv71 pv71Var = (pv71) x340Var.k(frm.a);
                vy30 vy30Var = ((doh0) obj2).a;
                String str = vy30Var.e;
                pv71Var.getClass();
                qim0 qim0VarE = pv71.e(pv71Var, pv71.d(str, x340Var), (cd5) x340Var.k(frm.b));
                x340Var.r(false);
                qim0 qim0VarThen = qim0VarF.then(qim0VarE);
                boolean z2 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue2 & 384) == 256;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new exi(iu30Var, (byte) 15);
                    x340Var.s0(objT);
                }
                qim0 qim0VarX = bin.x(qim0VarThen, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, y580.Y);
                eso1.h(oi7.a(Uri.parse(vy30Var.e), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 131070), isl.a, u291.f(nim0Var, 1.0f), (p3v) null, (zvx) null, new ecx(1, 1), mif1.P0, (tl3) null, (ColorFilter) null, x340Var, 3120, 400);
                if (vy30Var.d == 2) {
                    x340Var.i0(-81666328);
                    q3p1.j(0, vy30Var.f, x340Var, u291.d(nim0Var, 1.0f));
                    x340Var.r(false);
                } else {
                    x340Var.i0(-81529866);
                    x340Var.r(false);
                }
                x340Var.r(true);
                return rih1Var;
            case 5:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                d7e.k(((w7i0) obj2).c, (vu30) null, (vu30) null, apo.r(-871271662, new ip0((iu30) obj3, (byte) 15), b0kVar), b0kVar, 3072, 6);
                return rih1Var;
            case 6:
                xji0 xji0Var = (xji0) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var2 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                uwr uwrVar = cbx.a;
                long j = ((wex) ((gmt) zex.a.c).c).h;
                String strO0 = cwl1.o0(x340Var2, 2131958457);
                boolean z3 = (((iIntValue3 & 896) ^ 384) > 256 && x340Var2.g(iu30Var2)) || (iIntValue3 & 384) == 256;
                x340 x340Var3 = x340Var2;
                Object objT2 = x340Var3.T();
                if (z3 || objT2 == fkj0.X) {
                    objT2 = new exi(iu30Var2, (byte) 17);
                    x340Var3.s0(objT2);
                }
                Function0 function0 = (Function0) objT2;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(strO0), function0), jdx.c, (qim0) null, (max) null, yla.s(x340Var3), (vzq0) null, (idn0) null, (ga80) null, apo.r(-1902056702, new nk7(xji0Var, j, (byte) 1), x340Var3), h0j.a, apo.r(-1974850159, new sre((byte) 3, j), x340Var3), x340Var3, 805306368, 54, 476);
                return rih1Var;
            case 7:
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                jri0 jri0Var = ((cri0) obj2).a;
                if (jri0Var instanceof jri0) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(-1999873885);
                    jri0 jri0Var2 = jri0Var;
                    boolean z4 = (((iIntValue4 & 896) ^ 384) > 256 && x340Var5.g(iu30Var3)) || (iIntValue4 & 384) == 256;
                    Object objT3 = x340Var5.T();
                    if (z4 || objT3 == fkj0.X) {
                        objT3 = new exi(iu30Var3, (byte) 18);
                        x340Var5.s0(objT3);
                    }
                    buo1.i(jri0Var2, (Function0) objT3, (qim0) null, x340Var5, 0);
                    x340Var5.r(false);
                } else {
                    if (!(jri0Var instanceof iri0)) {
                        throw p3d1.k(x340Var4, -1999876960, false);
                    }
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(-1866418926);
                    x340Var6.r(false);
                }
                return rih1Var;
            case 8:
                jri0 jri0Var3 = (kri0) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                if (jri0Var3 instanceof jri0) {
                    x340 x340Var8 = x340Var7;
                    x340Var8.i0(-1861881302);
                    jri0 jri0Var4 = jri0Var3;
                    boolean z5 = (((iIntValue5 & 896) ^ 384) > 256 && x340Var8.g(iu30Var4)) || (iIntValue5 & 384) == 256;
                    Object objT4 = x340Var8.T();
                    if (z5 || objT4 == fkj0.X) {
                        objT4 = new exi(iu30Var4, (byte) 19);
                        x340Var8.s0(objT4);
                    }
                    buo1.i(jri0Var4, (Function0) objT4, (qim0) null, x340Var8, (iIntValue5 >> 3) & 14);
                    x340Var8.r(false);
                } else {
                    if (!(jri0Var3 instanceof iri0)) {
                        throw p3d1.k(x340Var7, -1861883567, false);
                    }
                    x340 x340Var9 = x340Var7;
                    x340Var9.i0(-1883619931);
                    x340Var9.r(false);
                }
                return rih1Var;
            case 9:
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                boolean z6 = (((iIntValue6 & 896) ^ 384) > 256 && x340Var10.g(iu30Var5)) || (iIntValue6 & 384) == 256;
                x340 x340Var11 = x340Var10;
                Object objT5 = x340Var11.T();
                if (z6 || objT5 == fkj0.X) {
                    objT5 = new exi(iu30Var5, (byte) 20);
                    x340Var11.s0(objT5);
                }
                puo1.f((Function0) objT5, x340Var11, 0);
                return rih1Var;
            case 10:
                g7j0 g7j0Var = (g7j0) obj2;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                boolean z7 = (((iIntValue7 & 112) ^ 48) > 32 && x340Var12.g(g7j0Var)) || (iIntValue7 & 48) == 32;
                x340 x340Var13 = x340Var12;
                Object objT6 = x340Var13.T();
                if (z7 || objT6 == m4cVar) {
                    j7j0 j7j0Var = g7j0Var.a;
                    View view = j7j0Var instanceof j7j0 ? j7j0Var.c : null;
                    x340Var13.s0(view);
                    objT6 = view;
                }
                View view2 = (View) objT6;
                if (view2 != null) {
                    x340Var13.i0(2094564802);
                    boolean zI = x340Var13.i(view2);
                    Object objT7 = x340Var13.T();
                    if (zI || objT7 == m4cVar) {
                        objT7 = new xy2(view2, (byte) 4);
                        x340Var13.s0(objT7);
                    }
                    dm5.a((iu30) objT7, (qim0) null, (iu30) null, x340Var13, 0, 6);
                    x340Var13.r(false);
                } else {
                    x340Var13.i0(2094621501);
                    x340Var13.r(false);
                }
                return rih1Var;
            case 11:
                t7j0 t7j0Var = (t7j0) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                int i2 = (iIntValue8 & 48) == 0 ? iIntValue8 | (x340Var14.g(t7j0Var) ? 32 : 16) : iIntValue8;
                if ((iIntValue8 & 384) == 0) {
                    i2 |= x340Var14.i(iu30Var6) ? 256 : 128;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    String strO1 = cwl1.o0(x340Var15, 2131958121);
                    String strO2 = cwl1.o0(x340Var15, 2131958120);
                    boolean z8 = t7j0Var.a;
                    boolean z9 = (i2 & 896) == 256;
                    Object objT8 = x340Var15.T();
                    if (z9 || objT8 == fkj0.X) {
                        objT8 = new cci(iu30Var6, (byte) 27);
                        x340Var15.s0(objT8);
                    }
                    zxo1.a(strO1, strO2, (qim0) null, z8, false, (iu30) objT8, x340Var15, 0, 20);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 12:
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                boolean z10 = (((iIntValue9 & 896) ^ 384) > 256 && x340Var16.g(iu30Var7)) || (iIntValue9 & 384) == 256;
                x340 x340Var17 = x340Var16;
                Object objT9 = x340Var17.T();
                if (z10 || objT9 == fkj0.X) {
                    objT9 = new exi(iu30Var7, (byte) 22);
                    x340Var17.s0(objT9);
                }
                mqo1.e((Function0) objT9, (i3u) null, (vu30) null, w0j.a, w0j.b, apo.r(1346061084, new v0j(iu30Var7, (byte) 0), x340Var17), (vu30) null, x340Var17, 224256, 70);
                return rih1Var;
            case 13:
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                boolean z11 = (((iIntValue10 & 896) ^ 384) > 256 && x340Var18.g(iu30Var8)) || (iIntValue10 & 384) == 256;
                x340 x340Var19 = x340Var18;
                Object objT10 = x340Var19.T();
                if (z11 || objT10 == fkj0.X) {
                    objT10 = new exi(iu30Var8, (byte) 24);
                    x340Var19.s0(objT10);
                }
                mqo1.e((Function0) objT10, (i3u) null, (vu30) null, x0j.a, x0j.b, apo.r(1653881970, new v0j(iu30Var8, (byte) 1), x340Var19), apo.r(-1740017391, new v0j(iu30Var8, (byte) 2), x340Var19), x340Var19, 1797120, 6);
                return rih1Var;
            case 14:
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                qim0 qim0VarN = anm1.N("free_upsell", nim0Var);
                int i3 = (iIntValue11 & 896) ^ 384;
                boolean z12 = (i3 > 256 && x340Var20.g(iu30Var9)) || (iIntValue11 & 384) == 256;
                x340 x340Var21 = x340Var20;
                Object objT11 = x340Var21.T();
                if (z12 || objT11 == m4cVar2) {
                    objT11 = new exi(iu30Var9, (byte) 27);
                    x340Var21.s0(objT11);
                }
                xdc xdcVar = new xdc(2131958780, (Function0) objT11);
                boolean z13 = (i3 > 256 && x340Var21.g(iu30Var9)) || (iIntValue11 & 384) == 256;
                Object objT12 = x340Var21.T();
                if (z13 || objT12 == m4cVar2) {
                    objT12 = new exi(iu30Var9, (byte) 28);
                    x340Var21.s0(objT12);
                }
                xio1.a(xdcVar, new xdc(2131958781, (Function0) objT12), 2131958778, 2131958782, qim0VarN, z0j.a, x340Var21, 196608, 0);
                return rih1Var;
            case 15:
                scj0 scj0Var = (ucj0) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                int i4 = (iIntValue12 & 48) == 0 ? iIntValue12 | (x340Var22.g(scj0Var) ? 32 : 16) : iIntValue12;
                if ((iIntValue12 & 384) == 0) {
                    i4 |= x340Var22.i(iu30Var10) ? 256 : 128;
                }
                x340 x340Var23 = x340Var22;
                if (!x340Var23.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    x340Var23.b0();
                } else if (scj0Var instanceof scj0) {
                    gyo1.v(scj0Var, iu30Var10, (qim0) null, x340Var23, (i4 >> 3) & 126);
                }
                return rih1Var;
            case 16:
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var24 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                qim0 qim0VarN2 = anm1.N("reorder_mix_confirmation", nim0Var);
                int i5 = (iIntValue13 & 896) ^ 384;
                boolean z14 = (i5 > 256 && x340Var24.g(iu30Var11)) || (iIntValue13 & 384) == 256;
                x340 x340Var25 = x340Var24;
                Object objT13 = x340Var25.T();
                if (z14 || objT13 == m4cVar3) {
                    objT13 = new exi(iu30Var11, (byte) 29);
                    x340Var25.s0(objT13);
                }
                xdc xdcVar2 = new xdc(2131958802, (Function0) objT13);
                boolean z15 = (i5 > 256 && x340Var25.g(iu30Var11)) || (iIntValue13 & 384) == 256;
                Object objT14 = x340Var25.T();
                if (z15 || objT14 == m4cVar3) {
                    objT14 = new c1j(iu30Var11, (byte) 0);
                    x340Var25.s0(objT14);
                }
                xio1.a(xdcVar2, new xdc(2131958803, (Function0) objT14), 2131958801, 2131958804, qim0VarN2, (vu30) null, x340Var25, 0, 32);
                return rih1Var;
            case 17:
                hej0 hej0Var = (hej0) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var26 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                boolean z16 = hej0Var.a;
                if (z16) {
                    x340 x340Var27 = x340Var26;
                    z = false;
                    strK = x0d.k(x340Var27, -345955895, 2131958805, x340Var27, false);
                } else {
                    z = false;
                    x340 x340Var28 = x340Var26;
                    strK = x0d.k(x340Var28, -345865251, 2131958821, x340Var28, false);
                }
                if (z16) {
                    x340 x340Var29 = x340Var26;
                    x340Var29.i0(-344483829);
                    vu30 vu30VarR = apo.r(-711297149, new v0j(iu30Var12, (byte) 3), x340Var29);
                    x340Var29.r(z);
                    vu30Var = vu30VarR;
                } else {
                    x340 x340Var30 = x340Var26;
                    x340Var30.i0(-344028284);
                    x340Var30.r(z);
                    vu30Var = null;
                }
                boolean z17 = (((iIntValue14 & 896) ^ 384) > 256 && x340Var26.g(iu30Var12)) || (iIntValue14 & 384) == 256;
                x340 x340Var31 = x340Var26;
                Object objT15 = x340Var31.T();
                if (z17 || objT15 == fkj0.X) {
                    objT15 = new c1j(iu30Var12, (byte) 2);
                    x340Var31.s0(objT15);
                }
                mqo1.e((Function0) objT15, (i3u) null, (vu30) null, e1j.b, apo.r(-1166602939, new pji(strK, (byte) 5), x340Var31), apo.r(-1724587002, new l2i(hej0Var, iu30Var12, (byte) 13), x340Var31), vu30Var, x340Var31, 224256, 6);
                return rih1Var;
            case 18:
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var32 = (b0k) obj4;
                int iIntValue15 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                qim0 qim0VarN3 = anm1.N("shuffle_on_nudge", nim0Var);
                int i6 = (iIntValue15 & 896) ^ 384;
                boolean z18 = (i6 > 256 && x340Var32.g(iu30Var13)) || (iIntValue15 & 384) == 256;
                x340 x340Var33 = x340Var32;
                Object objT16 = x340Var33.T();
                if (z18 || objT16 == m4cVar4) {
                    objT16 = new c1j(iu30Var13, (byte) 5);
                    x340Var33.s0(objT16);
                }
                xdc xdcVar3 = new xdc(2131958825, (Function0) objT16);
                boolean z19 = (i6 > 256 && x340Var33.g(iu30Var13)) || (iIntValue15 & 384) == 256;
                Object objT17 = x340Var33.T();
                if (z19 || objT17 == m4cVar4) {
                    objT17 = new c1j(iu30Var13, (byte) 6);
                    x340Var33.s0(objT17);
                }
                xio1.a(xdcVar3, new xdc(2131958826, (Function0) objT17), 2131958824, 2131958827, qim0VarN3, (vu30) null, x340Var33, 0, 32);
                return rih1Var;
            case 19:
                evj0 evj0Var = (evj0) obj2;
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var34 = (b0k) obj4;
                int iIntValue16 = ((Number) obj5).intValue();
                int i7 = (iIntValue16 & 48) == 0 ? iIntValue16 | (x340Var34.g(evj0Var) ? 32 : 16) : iIntValue16;
                if ((iIntValue16 & 384) == 0) {
                    i7 |= x340Var34.i(iu30Var14) ? 256 : 128;
                }
                x340 x340Var35 = x340Var34;
                if (!x340Var35.Y(i7 & 1, (i7 & 1169) != 1168)) {
                    x340Var35.b0();
                } else if (evj0Var.a != 0) {
                    fq7.g(evj0Var.b, null, xay.e(2, irn1.o0(300, 0, (dlv) null, 6)), xay.f(2, irn1.o0(300, 0, (dlv) null, 6)), null, apo.r(1027774315, new ef8((Object) iu30Var14, (Object) evj0Var, (byte) 26), x340Var35), x340Var35, 200064, 18);
                }
                return rih1Var;
            case 20:
                return a(obj, obj2, obj3, obj4, obj5);
            case 21:
                return d(obj, obj2, obj3, obj4, obj5);
            case 22:
                return e(obj, obj2, obj3, obj4, obj5);
            case 23:
                return f(obj, obj2, obj3, obj4, obj5);
            case 24:
                return g(obj, obj2, obj3, obj4, obj5);
            case 25:
                return h(obj, obj2, obj3, obj4, obj5);
            case 26:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(-44436135, new v0j((iu30) obj3, (byte) 4), b0kVar2), b0kVar2, 3078, 6);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                x340 x340Var36 = (b0k) obj4;
                ((Number) obj5).intValue();
                String str2 = ((zjm0) obj2).a;
                if (str2 != null) {
                    x340 x340Var37 = x340Var36;
                    x340Var37.i0(1818752018);
                    mp10.g(0, str2, x340Var37, (qim0) null);
                    x340Var37.r(false);
                } else {
                    x340 x340Var38 = x340Var36;
                    x340Var38.i0(1818824093);
                    x340Var38.r(false);
                }
                return rih1Var;
            case 28:
                x340 x340Var39 = (b0k) obj4;
                ((Number) obj5).intValue();
                String str3 = ((zjm0) obj2).a;
                if (str3 != null) {
                    x340 x340Var40 = x340Var39;
                    x340Var40.i0(-223071790);
                    mp10.g(0, str3, x340Var40, (qim0) null);
                    x340Var40.r(false);
                } else {
                    x340 x340Var41 = x340Var39;
                    x340Var41.i0(-222999715);
                    x340Var41.r(false);
                }
                return rih1Var;
            default:
                lp61 lp61Var = (lp61) obj2;
                iu30 iu30Var15 = (iu30) obj3;
                x340 x340Var42 = (b0k) obj4;
                int iIntValue17 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                igb1 igb1Var = lp61Var.f;
                int i8 = (iIntValue17 & 48) == 0 ? iIntValue17 | (x340Var42.g(lp61Var) ? 32 : 16) : iIntValue17;
                if ((iIntValue17 & 384) == 0) {
                    i8 |= x340Var42.i(iu30Var15) ? 256 : 128;
                }
                x340 x340Var43 = x340Var42;
                if (x340Var43.Y(i8 & 1, (i8 & 1169) != 1168)) {
                    xxm0 xxm0Var = (xxm0) igb1Var;
                    mxm0 mxm0Var = xxm0Var.e;
                    List list = xxm0Var.a;
                    if (mxm0Var != null) {
                        Integer num = (Integer) lp61Var.d;
                        if (num == null) {
                            num = (Integer) lp61Var.c;
                        }
                        boolean zG = x340Var43.g(num) | x340Var43.g(mxm0Var);
                        Object objT18 = x340Var43.T();
                        if (zG || objT18 == m4cVar5) {
                            objT18 = num != null ? (mr20) mxm0Var.a.invoke(Integer.valueOf(num.intValue())) : new huz(Boolean.FALSE, (byte) 10);
                            x340Var43.s0(objT18);
                        }
                        ven0 ven0VarG = rwq.g((mr20) objT18, Boolean.FALSE, (o8n) null, x340Var43, 48, 2);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj6 : list) {
                            if (!(lp61Var.e.get(Integer.valueOf(((qxm0) obj6).a)) instanceof gax)) {
                                arrayList.add(obj6);
                            }
                        }
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                int i9 = ((qxm0) next).a;
                                if (num != null && i9 == num.intValue()) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        qxm0 qxm0Var = (qxm0) next;
                        if (qxm0Var == null) {
                            x340Var43.i0(1198422694);
                            x340Var43.r(false);
                            strU = null;
                        } else {
                            x340Var43.i0(1198422695);
                            strU = zmo1.u(qxm0Var.b, qxm0Var.c, x340Var43);
                            x340Var43.r(false);
                        }
                        if (strU == null) {
                            strU = "";
                        }
                        jp61 jp61Var = lp61Var.a;
                        iox ioxVar = jp61Var.b.b != null ? iox.c : null;
                        if (ioxVar == null) {
                            ioxVar = ((eez0) jp61Var.d).a;
                        }
                        String strA = lp61Var.a(x340Var43);
                        String str4 = strA != null ? strA : "";
                        boolean zG2 = x340Var43.g(strU);
                        Object objT19 = x340Var43.T();
                        if (zG2 || objT19 == m4cVar5) {
                            objT19 = new irf(strU, (byte) 24);
                            x340Var43.s0(objT19);
                        }
                        qim0 qim0VarB = s161.b(nim0Var, false, (iu30) objT19);
                        boolean zBooleanValue = ((Boolean) ven0VarG.getValue()).booleanValue();
                        lax gaxVar = lp61Var.b;
                        if (!(gaxVar instanceof gax)) {
                            gaxVar = arrayList.size() <= 1 ? new gax((Integer) null, (String) null) : iax.a;
                        }
                        lax laxVar = gaxVar;
                        String strO3 = cwl1.o0(x340Var43, 2131962131);
                        int i10 = i8 & 896;
                        boolean zG3 = ((i8 & 112) == 32) | x340Var43.g(num) | x340Var43.i(mxm0Var) | x340Var43.i(arrayList) | (i10 == 256);
                        Object objT20 = x340Var43.T();
                        if (zG3 || objT20 == m4cVar5) {
                            objT20 = new vt1(num, mxm0Var, arrayList, lp61Var, iu30Var15, (byte) 7);
                            x340Var43.s0(objT20);
                        }
                        Function0 function1 = (Function0) objT20;
                        if (ihc1.y0(strO3)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        } else {
                            gbx gbxVar = new gbx(new y50(strO3), function1);
                            boolean z20 = i10 == 256;
                            Object objT21 = x340Var43.T();
                            if (z20 || objT21 == m4cVar5) {
                                objT21 = new cci(iu30Var15, (byte) 28);
                                x340Var43.s0(objT21);
                            }
                            iko1.m(ioxVar, str4, qim0VarB, zBooleanValue, strU, laxVar, gbxVar, (iu30) objT21, x340Var43, 8, 0);
                        }
                    } else {
                        hhg1.n("Missing cycle behavior");
                    }
                    return null;
                }
                x340Var43.b0();
                return rih1Var;
        }
    }
}
