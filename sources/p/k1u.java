package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.player.model.PlaybackQuality;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class k1u {
    public static final j2i a;
    public static final j2i b;
    public static final j2i c;
    public static b180 d;
    public static b180 e;

    static {
        new j2i(866784315, new n75((byte) 14), false);
        new j2i(1714259275, new n75((byte) 15), false);
        new j2i(-1836397928, new dh((byte) 7), false);
        new j2i(-1406416085, new n75((byte) 16), false);
        a = new j2i(566090785, new n75((byte) 17), false);
        b = new j2i(-1624772335, new n75((byte) 18), false);
        new j2i(939725476, new dh((byte) 8), false);
        c = new j2i(-1341284559, new n75((byte) 19), false);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void a(qim0 qim0Var, int i, int i2, Function0 function0, b0k b0kVar, int i3, int i4) {
        qim0 qim0Var2;
        int i5;
        Function0 function1;
        byte b2;
        boolean z;
        qim0 qim0Var3;
        int i6;
        h311 h311VarV;
        qim0 qim0Var4;
        Object objT;
        h311 h311VarV2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(52977404);
        int i7 = i4 & 1;
        if (i7 != 0) {
            i5 = i3 | 6;
            qim0Var2 = qim0Var;
        } else if ((i3 & 6) == 0) {
            qim0Var2 = qim0Var;
            i5 = (x340Var.i(qim0Var2) ? 4 : 2) | i3;
        } else {
            qim0Var2 = qim0Var;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 32 : 16;
        }
        int i8 = i5 | 384;
        int i9 = i4 & 8;
        if (i9 == 0) {
            if ((i3 & 3072) == 0) {
                function1 = function0;
                i8 |= x340Var.i(function1) ? 2048 : 1024;
            }
            b2 = 0;
            if ((i8 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i8 & 1, z)) {
                if (i7 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i9 != 0) {
                    function1 = null;
                }
                if (function1 == null) {
                    x340Var.i0(1997069870);
                    b(i, ((i8 >> 3) & 126) | ((i8 << 6) & 896), 0, x340Var, qim0Var4);
                    x340Var.r(false);
                    h311VarV2 = x340Var.v();
                    if (h311VarV2 != null) {
                        h311VarV2.d = new e13(i, i3, i4, function1, qim0Var4);
                        return;
                    }
                    return;
                }
                qim0 qim0Var5 = qim0Var4;
                Function0 function2 = function1;
                x340Var.i0(1997154438);
                x340Var.r(false);
                gbx gbxVar = new gbx(z50.c, function2);
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ah1.Z0;
                    x340Var.s0(objT);
                }
                kgx kgxVar = new kgx(0, (vu30) objT, (vu30) null, (vu30) null, 13);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cwl1.b(qim0Var5, (tl3) null, d4o1.a, kgxVar, uyn1.h(1, 0.0f, 8.0f), (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(19320613, new f13(i, b2), x340Var), x340Var, (i8 & 14) | 100663296, 48, 1250);
                qim0Var3 = qim0Var5;
                i6 = 2;
                function1 = function2;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                i6 = i2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new g13(qim0Var3, i, i6, function1, i3, i4);
            }
        }
        i8 = i5 | 3456;
        function1 = function0;
        b2 = 0;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i8 & 1, z)) {
            if (i7 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (i9 != 0) {
                function1 = null;
            }
            if (function1 == null) {
                x340Var.i0(1997069870);
                b(i, ((i8 >> 3) & 126) | ((i8 << 6) & 896), 0, x340Var, qim0Var4);
                x340Var.r(false);
                h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new e13(i, i3, i4, function1, qim0Var4);
                    return;
                }
                return;
            }
            qim0 qim0Var6 = qim0Var4;
            Function0 function3 = function1;
            x340Var.i0(1997154438);
            x340Var.r(false);
            gbx gbxVar2 = new gbx(z50.c, function3);
            objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ah1.Z0;
                x340Var.s0(objT);
            }
            kgx kgxVar2 = new kgx(0, (vu30) objT, (vu30) null, (vu30) null, 13);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cwl1.b(qim0Var6, (tl3) null, d4o1.a, kgxVar2, uyn1.h(1, 0.0f, 8.0f), (max) null, false, (idn0) null, (ga80) null, gbxVar2, (gbx) null, apo.r(19320613, new f13(i, b2), x340Var), x340Var, (i8 & 14) | 100663296, 48, 1250);
            qim0Var3 = qim0Var6;
            i6 = 2;
            function1 = function3;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            i6 = i2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g13(qim0Var3, i, i6, function1, i3, i4);
        }
    }

    public static final void b(int i, int i2, int i3, b0k b0kVar, qim0 qim0Var) {
        int i4;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(366350083);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.e(l1d.C(2)) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            qim0 qim0Var3 = i5 != 0 ? nim0.a : qim0Var;
            suo1.f(cwl1.o0(x340Var, 2131952154), 2, qim0Var3, i, x340Var, (i4 & 1008) | ((i4 << 12) & 57344), 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h13((byte) 0, i, i2, i3, qim0Var2);
        }
    }

    public static final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1736039245);
        if (x340Var.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            b9p1.b(rpx.c, cwl1.o0(x340Var, 2131956802), (qim0) null, x340Var, rpx.d, 4);
            b9p1.b(pox.c, cwl1.o0(x340Var, 2131956804), (qim0) null, x340Var, pox.d, 4);
            b9p1.b(unx.c, cwl1.o0(x340Var, 2131956803), (qim0) null, x340Var, unx.d, 4);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 23);
        }
    }

    public static final qqb d(float f, long j) {
        return new qqb(f, new n6a1(j));
    }

    public static final void e(uek uekVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        uek uekVar2 = uekVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1270571835);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(uekVar2) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.f;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new lck(iu30Var, (byte) 8);
                x340Var.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(i1p1.q(bin.v(qim0Var3, idn0Var, jtrVar, false, (String) null, (pm31) null, (Function0) objT2, 28), er31.b(8.0f)), 1.0f), 200.0f);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = rgk.Z;
                x340Var.s0(objT3);
            }
            qim0 qim0VarB = s161.b(qim0VarH, false, (iu30) objT3);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            qim0 qim0VarN = anm1.N("concert_hero_card_image", u291.d(qim0Var3, 1.0f));
            Uri uri = Uri.parse(uekVar2.d);
            nkx nkxVar = nkx.c;
            eso1.e(uri, isl.a, qim0VarN, (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, x340Var, 1073766448, 0, 3496);
            t1c.a(dug.e(u291.d(qim0Var3, 1.0f), v9c.s(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(u7h.b(u7h.b, 0.6f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, Float.POSITIVE_INFINITY, 8), (hw61) null, 0.0f, 6), x340Var, 0);
            h2c h2cVar = h2c.a;
            ton1.f(0, 0, 0, 24, uekVar2.f, uekVar2.g, x340Var, anm1.N("concert_hero_card_calendar_icon", u291.r(uyn1.B(h2cVar.a(qim0Var3, graVar), 16.0f, 16.0f, 0.0f, 0.0f, 12), 48.0f)));
            qim0 qim0VarA = h2cVar.a(uyn1.x(anm1.N("concert_hero_card_more_button", qim0Var3), 8.0f), een.f);
            boolean z3 = i3 == 32;
            Object objT4 = x340Var.T();
            if (z3 || objT4 == m4cVar) {
                objT4 = new lck(iu30Var, (byte) 9);
                x340Var.s0(objT4);
            }
            z50 z50Var = z50.c;
            wro1.h(new gbx(z50Var, (Function0) objT4), ldx.c, qim0VarA, (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, nei.a, x340Var, 0, 6, 984);
            qim0 qim0VarX = uyn1.x(u291.f(h2cVar.a(qim0Var3, een.t), 1.0f), 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
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
            qim0 qim0VarN2 = anm1.N("concert_hero_card_title", qim0Var3);
            uekVar2 = uekVar;
            String str = uekVar2.b;
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarN2, cbx.d(x340Var).c, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1776);
            uwo1.e(uekVar2.c, anm1.N("concert_hero_card_subtitle", qim0Var3), cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1776);
            x340Var.r(true);
            qim0 qim0VarA2 = h2cVar.a(uyn1.x(anm1.N("concert_hero_card_arrow_button", qim0Var3), 8.0f), een.Y);
            boolean z4 = i3 == 32;
            Object objT5 = x340Var.T();
            if (z4 || objT5 == m4cVar) {
                objT5 = new lck(iu30Var, (byte) 10);
                x340Var.s0(objT5);
            }
            gbx gbxVar = new gbx(z50Var, (Function0) objT5);
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = yzj.P0;
                x340Var.s0(objT6);
            }
            wro1.h(gbxVar, new hdx(0, (vu30) null, (vu30) objT6, (vu30) null, (hw61) null, 27), qim0VarA2, (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, nei.b, x340Var, 0, 6, 984);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mzj(uekVar2, iu30Var, qim0Var2, i, (byte) 12);
        }
    }

    public static final void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1348336939);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarH = u291.h(u291.f(i1p1.q(nim0.a, er31.b(8.0f)), 1.0f), 200.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarH, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 29, i, false);
        }
    }

    public static final void g(Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(698292651);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(function1) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            z50 z50Var = z50.c;
            foo1.c(new gbx(z50Var, function0), new idx(4), (qim0) null, (max) null, yla.r(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, lti.c, x340Var, 0, 48, 2012);
            foo1.c(new gbx(z50Var, function1), ldx.c, (qim0) null, (max) null, yla.r(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, lti.d, x340Var, 0, 48, 2012);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yv60(function0, function1, qim0Var, i, (byte) 1);
        }
    }

    public static final void h(int i, long j, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1250859895);
        int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            t1c.a(dug.f(dug.e(qim0Var, v9c.s(p7h.M(new u7h[]{new u7h(j), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), u7h.b(u7h.b, 0.2f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e82(j, qim0Var, i, (byte) 4);
        }
    }

    public static final void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-15553522);
        if (x340Var.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            mbh mbhVarA = jbh.a(new d36(cbx.b(x340Var).b.b, true, new um5(false)), een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarF, er31.b(8.0f));
            Uri uri = Uri.parse("https://cdn-spotify-gen-alpha.spotifycdn.com/account-linking/ChildEducation.webp");
            as80 as80Var = mif1.P0;
            cbx.a.getClass();
            eso1.e(uri, isl.a, qim0VarQ, (p3v) null, (zvx) null, uwr.d(), as80Var, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 27696, 0, 3968);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = o390.Z;
                x340Var.s0(objT);
            }
            uwo1.e(cwl1.o0(x340Var, 2131956799), s161.b(qim0VarF2, false, (iu30) objT), cbx.d(x340Var).c, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2024);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 24);
        }
    }

    public static final void j(Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1195799051);
        byte b2 = 2;
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            j2i j2iVar = lti.b;
            j2i j2iVarR = apo.r(-1378599502, new myq(function0, function1, b2), x340Var);
            qim0Var2 = nim0.a;
            irn1.u(qim0Var2, j2iVar, (vu30) null, (erl1) null, j2iVarR, x340Var, 24630, 12);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yv60(function0, function1, qim0Var2, i, (byte) 2);
        }
    }

    public static final void k(g9e1 g9e1Var, int i, int i2, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i3) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-600068462);
        int i4 = i3 | (b0kVar2.g(g9e1Var) ? 4 : 2) | (b0kVar2.e(i) ? 32 : 16) | (b0kVar2.e(i2) ? 256 : 128) | (b0kVar2.h(z) ? 2048 : 1024) | (b0kVar2.h(z2) ? 16384 : 8192) | (b0kVar2.g(qim0Var) ? 131072 : 65536);
        if (b0kVar2.Y(i4 & 1, (i4 & 74899) != 74898)) {
            String strC = f4i1.c(i, "Top-five-item-");
            ilv.a.getClass();
            ven0 ven0VarR = zod.R(new hsi1(strC, Float.valueOf(1.0f), Float.valueOf(0.0f), new pxg1(666, (i + 1) * 83, flv.b), rno1.a), z, (Function0) null, b0kVar2, 8 | ((i4 >> 6) & 112), 4);
            float fM0 = ((wat) b0kVar2.k(t4k.h)).M0(i2);
            float f = (!z2 || ((Number) ven0VarR.getValue()).floatValue() < 1.0f) ? 1.0f : 0.0f;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v7f1.t;
                b0kVar2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT);
            boolean zG = ((i4 & 57344) == 16384) | b0kVar2.g(ven0VarR);
            Object objT2 = b0kVar2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new kjz0(z2, ven0VarR, (byte) 2);
                b0kVar2.s0(objT2);
            }
            qim0 qim0VarB2 = eqr0.B(qim0VarB, (iu30) objT2);
            boolean zD = b0kVar2.d(f);
            Object objT3 = b0kVar2.T();
            if (zD || objT3 == m4cVar) {
                objT3 = new vbk0((byte) 29, f);
                b0kVar2.s0(objT3);
            }
            qim0 qim0VarC = i541.C(qim0VarB2, (iu30) objT3);
            jw31 jw31VarA = ew31.a(h36.e, een.N0, b0kVar2, 54);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarC);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarV = u291.v(nim0Var, fM0);
            vnr0 vnr0Var = (vnr0) g9e1Var.a.invoke(b0kVar2, 0);
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar2;
            qgo1.f(omo1.q(vnr0Var, cbx.d(b0kVar2).k, cbx.d(b0kVar2).h, b0kVar2), qim0VarV, new a0e1(5), 2, false, (iu30) null, b0kVar2, 3080, 48);
            op71.g(b0kVar2, u291.v(nim0Var, 8.0f));
            qgo1.f((vnr0) g9e1Var.b.invoke(b0kVar2, 0), u291.f(nim0Var, 0.7866f), new a0e1(5), 2, false, (iu30) null, b0kVar2, 3128, 48);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ig6(g9e1Var, i, i2, z, z2, qim0Var, i3, (byte) 3);
        }
    }

    public static final hoj0 l(tv00 tv00Var, boolean z) {
        sv00 sv00Var = tv00Var.c;
        int iC = l1d.C(sv00Var.b);
        if (iC != 0) {
            if (iC == 1) {
                return new goj0(tv00Var.b);
            }
            if (iC != 2) {
                if (iC != 3 && iC != 4) {
                    eg.o();
                    return null;
                }
                if (sv00Var.a) {
                    return new foj0(2);
                }
                if (!z) {
                    return new foj0(1);
                }
            } else if (!z) {
                return new foj0(1);
            }
        } else if (!z) {
            return new foj0(2);
        }
        return null;
    }

    public static final ven0 m(idn0 idn0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(Boolean.FALSE);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        boolean z = (((i & 14) ^ 6) > 4 && x340Var.g(idn0Var)) || (i & 6) == 4;
        Object objT2 = x340Var.T();
        if (z || objT2 == m4cVar) {
            objT2 = new b4v(idn0Var, ven0Var, (lnm) null, (byte) 2);
            x340Var.s0(objT2);
        }
        qxd0.t(idn0Var, x340Var, (vu30) objT2);
        return ven0Var;
    }

    public static jnt n(j6q0 j6q0Var) {
        return !j6q0Var.h() ? fnt.a : gnt.a;
    }

    public static final int o(float f, int i) {
        int i2;
        if (i <= 2) {
            i2 = 1;
        } else {
            i2 = i / 2;
            if (i2 > 8) {
                i2 = 8;
            }
        }
        float f2 = i2 / f;
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        return jch0.U(f2);
    }

    public static a6q0 p(j6q0 j6q0Var) {
        if (j6q0Var instanceof d6q0) {
            d6q0 d6q0Var = (d6q0) j6q0Var;
            List<w4i1> list = d6q0Var.a;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (w4i1 w4i1Var : list) {
                String str = w4i1Var.c;
                arrayList.add(new u7q0(str != null ? Uri.parse(str) : null, w4i1Var.a, w4i1Var.b, w4i1Var.d));
            }
            return new w5q0(mqo1.F(arrayList), d6q0Var.b, n(j6q0Var), new izn0(j6q0Var.b()));
        }
        if (j6q0Var instanceof c6q0) {
            c6q0 c6q0Var = (c6q0) j6q0Var;
            return new v5q0(c6q0Var.a, c6q0Var.b, n(j6q0Var), new izn0(j6q0Var.b()));
        }
        if (j6q0Var instanceof i6q0) {
            i6q0 i6q0Var = (i6q0) j6q0Var;
            return new z5q0(i6q0Var.a, i6q0Var.b, n(j6q0Var), new izn0(j6q0Var.b()));
        }
        if ((j6q0Var instanceof g6q0) || (j6q0Var instanceof e6q0)) {
            f6q0 f6q0Var = (f6q0) j6q0Var;
            return new x5q0(f6q0Var.j(), f6q0Var.k(), n(j6q0Var), new izn0(j6q0Var.b()));
        }
        if (!(j6q0Var instanceof h6q0)) {
            eg.o();
            return null;
        }
        h6q0 h6q0Var = (h6q0) j6q0Var;
        w4i1 w4i1Var2 = h6q0Var.a;
        String str2 = w4i1Var2.c;
        u7q0 u7q0Var = new u7q0(str2 != null ? Uri.parse(str2) : null, w4i1Var2.a, w4i1Var2.b, w4i1Var2.d);
        int iC = l1d.C(h6q0Var.d);
        return new y5q0(u7q0Var, n(j6q0Var), new izn0(j6q0Var.b()), iC != 2 ? iC != 4 ? 1 : 3 : 2);
    }

    public static final jel1 q(int i) {
        tr80 tr80VarQ = yoi1.Q(0, i / 100);
        ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
        lr80 it = tr80VarQ.iterator();
        while (((sr80) it).c) {
            arrayList.add(Integer.valueOf(it.nextInt() % 10 == 0 ? 1 : 0));
        }
        return new jel1(arrayList);
    }

    public static final PlaybackQuality r(PlayerState playerState) {
        return (PlaybackQuality) playerState.playbackQuality().e(PlaybackQuality.EMPTY);
    }

    public static final boolean s(String str) {
        try {
            return u890.j(UUID.fromString(str).toString(), str);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static final String t(uz21 uz21Var) {
        String m231Var;
        try {
            ega0 ega0Var = (ega0) fga0.l(nfa0.d.c(uz21Var.f())).get("error_type");
            m231Var = ega0Var != null ? fga0.m(ega0Var).b() : null;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return m231Var instanceof m231 ? null : m231Var;
    }

    public static final qim0 u(qim0 qim0Var, float f) {
        return f == 0.0f ? qim0Var : i541.D(qim0Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048319);
    }

    public static final gon v(Throwable th) {
        String strT;
        uz21 uz21Var;
        if (!(th instanceof HttpException)) {
            return th instanceof TimeoutException ? don.a : eon.a;
        }
        HttpException httpException = (HttpException) th;
        int i = httpException.a;
        sy21 sy21Var = httpException.c;
        if (sy21Var == null || (uz21Var = sy21Var.c) == null || (strT = t(uz21Var)) == null) {
            strT = "UNKNOWN";
        }
        return new fon(i, strT);
    }
}
