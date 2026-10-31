package p;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationInterpolationSegment;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationSpecialCase;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class h0p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(int i, String str, String str2, Function0 function0, b0k b0kVar, hux huxVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(467071640);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.g(qim0Var2) ? 16384 : 8192;
        } else {
            qim0Var2 = qim0Var;
        }
        byte b2 = 0;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uvx uvxVar = (uvx) b0kVar3.k(vvx.a);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            b0kVar2 = b0kVar3;
            jto1.b(qim0Var2, uvx.b(uvxVar, 0, (tvx) null, new p3v(48.0f), 15), null, false, null, null, new gbx(z50.c, function0), null, null, apo.r(-1556199103, new g70(huxVar, b2), b0kVar3), null, apo.r(1153850976, new p3(str2, (byte) 8), b0kVar3), null, null, null, apo.r(-507456292, new p3(str, (byte) 9), b0kVar3), b0kVar2, ((i2 >> 12) & 14) | 805306432, 196656, 30140);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new h70(huxVar, str, str2, function0, qim0Var, i);
        }
    }

    public static final void b(gbx gbxVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-289335136);
        int i2 = i | (x340Var.g(gbxVar) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            poo1.e(gbxVar, pex.b, yoo1.z(x340Var), qim0Var, 0, null, null, noi.a, null, null, null, false, null, null, x340Var, (i2 & 14) | 12585984, 0, 16240);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00((Object) gbxVar, (Object) qim0Var, i, (byte) 8);
        }
    }

    public static final void c(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1776386739);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarF);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ukf(function0, (byte) 15);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), jdx.c, null, null, yla.s(x340Var), null, null, null, null, null, sci.b, x340Var, 0, 48, 2012);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wm(function0, i, (byte) 24);
        }
    }

    public static final void d(o820 o820Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        pex nexVar;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(219982381);
        int i2 = i | (b0kVar3.g(o820Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            if (!o820Var.c) {
                b0kVar3.i0(949675011);
                b0kVar3.r(false);
                nexVar = pex.b;
            } else if (o820Var.d) {
                b0kVar3.i0(-624770151);
                Object objT = b0kVar3.T();
                if (objT == m4cVar) {
                    objT = wo10.O0;
                    b0kVar3.s0(objT);
                }
                pex oexVar = new oex(4, (vu30) null, (vu30) objT, (vu30) null, 10);
                b0kVar3.r(false);
                nexVar = oexVar;
            } else {
                b0kVar3.i0(949682298);
                b0kVar3.r(false);
                nexVar = new nex(4);
            }
            lex lexVarZ = yoo1.z(b0kVar3);
            boolean z = o820Var.e;
            boolean z2 = (i2 & 112) == 32;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new in00(function0, (byte) 27);
                b0kVar3.s0(objT2);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT2);
            String str = "filter_chip_" + o820Var.b.name();
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            poo1.e(gbxVar, nexVar, lexVarZ, anm1.N(str, qim0Var3), 0, null, null, null, null, null, null, z, null, apo.r(-1735507790, new rr10(o820Var, (byte) 2), b0kVar3), b0kVar2, 0, 3072, 6128);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xx00(o820Var, function0, qim0Var2, i, (byte) 8);
        }
    }

    public static final void e(Function0 function0, t820 t820Var, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1659197180);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(t820Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new djx(t820Var, function0, vu30Var, (byte) 19);
                x340Var.s0(objT);
            }
            too1.b(qim0VarJ, xtb0VarA, zzq0Var, (iu30) objT, x340Var, 0, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, function0, t820Var, vu30Var, qim0Var2, (byte) 28);
        }
    }

    public static final void f(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-816966338);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            eso1.e(Uri.parse(str), isl.a, qim0Var, (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, ((i2 << 3) & 896) | 199728, 0, 3984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0(str, qim0Var, i, (byte) 14);
        }
    }

    public static final void g(Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2077507995);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            a(hrx.d | 24576 | ((i2 << 9) & 7168), cwl1.o0(x340Var, 2131951874), cwl1.o0(x340Var, 2131951873), function1, x340Var, hrx.c, anm1.N("log-in-or-sign-up-row", nim0.a));
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wm(function1, i, (byte) 1);
        }
    }

    public static final void h(int i, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1084021157);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g((Object) null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ncf0 ncf0VarG = h5p1.G(new pcf0(str), str, null, x340Var, (i2 << 12) & 57344, 46);
            if (ncf0VarG.c() != null) {
                x340Var.i0(-214867781);
                mp10.f(ncf0VarG.c(), u291.d(qim0Var, 1.0f), z, false, z ? null : new acf0(0.0f), Integer.MAX_VALUE, (ddf0) null, (tl3) null, mif1.P0, x340Var, (i2 & 896) | 1572864, 0, 2064296);
                x340Var.r(false);
            } else {
                x340Var.i0(-214470361);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ryh(str, z, qim0Var, i, (byte) 5);
        }
    }

    public static final void i(imt0 imt0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1479161446);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(imt0Var) : x340Var.i(imt0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        byte b2 = 6;
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (imt0Var instanceof hmt0) {
            x340Var.i0(160030671);
            t1c.a(dug.f(qim0Var, ((hmt0) imt0Var).a, d4o1.a), x340Var, 0);
            x340Var.r(false);
        } else if (imt0Var instanceof fmt0) {
            x340Var.i0(160041044);
            f(i2 & 112, ((fmt0) imt0Var).a, x340Var, qim0Var);
            x340Var.r(false);
        } else {
            if (!(imt0Var instanceof gmt0)) {
                throw p3d1.k(x340Var, 160029431, false);
            }
            x340Var.i0(160044586);
            gmt0 gmt0Var = (gmt0) imt0Var;
            h((i2 << 6) & 7168, gmt0Var.a, x340Var, qim0Var, gmt0Var.b);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(imt0Var, qim0Var, i, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:62:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:84:0x023f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0249  */
    /* JADX WARN: Code duplicated, block: B:90:0x0273  */
    /* JADX WARN: Code duplicated, block: B:91:0x0280  */
    /* JADX WARN: Code duplicated, block: B:93:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:95:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e8  */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x0143, please report this as an issue */
    public static final void j(String str, qim0 qim0Var, String str2, vu30 vu30Var, hux huxVar, Function0 function0, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        qim0 qim0VarX;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z;
        Function0 function1;
        vu30 vu30Var2;
        vu30 vu30Var3;
        llj lljVar;
        vu30 vu30Var4;
        qim0 qim0Var4;
        vu30 vu30Var5;
        vu30 vu30Var6;
        llj lljVar2;
        vu30 vu30Var7;
        Function0 function2;
        boolean z2;
        qim0 qim0Var5;
        boolean z3;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-53427765);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= b0kVar2.g(str2) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 |= b0kVar2.i(vu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= (262144 & i) == 0 ? b0kVar2.g(huxVar) : b0kVar2.i(huxVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= b0kVar2.i(function0) ? 1048576 : 524288;
        }
        int i5 = i4 | 12582912;
        if (b0kVar2.Y(i5 & 1, (i5 & 4793491) != 4793490)) {
            qim0 qim0Var6 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var6, 1.0f);
            if (function0 != null) {
                qim0Var3 = qim0VarF;
                qim0VarX = bin.x(qim0Var6, false, null, null, null, function0, 15);
                if (qim0VarX == null) {
                }
                qim0 qim0VarThen = qim0Var3.then(qim0VarX);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar2).b;
                qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarThen);
                fra fraVar = een.N0;
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, b0kVar2, 0);
                iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0VarM = b0kVar2.m();
                qim0VarE = zr7.E(b0kVar2, qim0VarZ);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                z = ((x340) b0kVar2).S;
                function1 = hmb0.t1;
                if (z) {
                    b0kVar2.l(function1);
                } else {
                    b0kVar2.v0();
                }
                vu30Var2 = y580.O0;
                nko1.H(jw31VarA, b0kVar2, vu30Var2);
                vu30Var3 = y580.N0;
                nko1.H(xos0VarM, b0kVar2, vu30Var3);
                Integer numValueOf = Integer.valueOf(iHashCode);
                lljVar = y580.R0;
                nko1.H(numValueOf, b0kVar2, lljVar);
                nko1.F(b0kVar2);
                vu30Var4 = y580.Y;
                nko1.H(qim0VarE, b0kVar2, vu30Var4);
                if (vu30Var != null) {
                    b0kVar2.i0(-1801578202);
                    us71.j((i5 >> 12) & 14, vu30Var, b0kVar2, false);
                } else {
                    b0kVar2.i0(-1801417157);
                    b0kVar2.r(false);
                }
                if (str2 != null || ihc1.y0(str2)) {
                    qim0Var4 = qim0Var6;
                    vu30Var5 = vu30Var3;
                    vu30Var6 = vu30Var4;
                    lljVar2 = lljVar;
                    vu30Var7 = vu30Var2;
                    function2 = function1;
                    b0kVar2.i0(-1800880020);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    uwo1.e(str, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), cbx.d(b0kVar2).g, 0L, null, null, 2, false, new cjc0(1), 0, null, b0kVar2, i5 & 14, 0, 1720);
                    z2 = false;
                    b0kVar2.r(false);
                } else {
                    b0kVar2.i0(-1801365449);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                    int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM2 = b0kVar2.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar2, wnb0Var);
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(function1);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(mbhVarA, b0kVar2, vu30Var2);
                    nko1.H(xos0VarM2, b0kVar2, vu30Var3);
                    x0d.q(iHashCode2, b0kVar2, lljVar, b0kVar2);
                    nko1.H(qim0VarE2, b0kVar2, vu30Var4);
                    uwo1.e(str, null, cbx.d(b0kVar2).g, 0L, null, null, 2, false, new cjc0(1), 0, null, b0kVar2, i5 & 14, 0, 1722);
                    b0kVar2 = b0kVar2;
                    qim0Var4 = qim0Var6;
                    vu30Var5 = vu30Var3;
                    vu30Var6 = vu30Var4;
                    lljVar2 = lljVar;
                    vu30Var7 = vu30Var2;
                    function2 = function1;
                    uwo1.e(str2, null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, null, null, 2, false, new cjc0(1), 0, null, b0kVar2, (i5 >> 6) & 14, 0, 1714);
                    b0kVar2.r(true);
                    b0kVar2.r(false);
                    z2 = false;
                }
                if (huxVar == null) {
                    b0kVar2.i0(-1800646901);
                    b0kVar2.r(z2);
                    qim0Var5 = qim0Var4;
                    z3 = true;
                } else {
                    b0kVar2.i0(-1800646900);
                    b0kVar2.i0(-1349675146);
                    b0kVar2.r(z2);
                    gfh0 gfh0VarC = t1c.c(een.d, z2);
                    int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM3 = b0kVar2.m();
                    qim0Var5 = qim0Var4;
                    qim0 qim0VarE3 = zr7.E(b0kVar2, qim0Var5);
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(function2);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(gfh0VarC, b0kVar2, vu30Var7);
                    nko1.H(xos0VarM3, b0kVar2, vu30Var5);
                    x0d.q(iHashCode3, b0kVar2, lljVar2, b0kVar2);
                    nko1.H(qim0VarE3, b0kVar2, vu30Var6);
                    w0h1.a(huxVar, isl.a, (qim0) null, 0L, 0L, false, b0kVar2, 56, 60);
                    z3 = true;
                    b0kVar2.r(true);
                    b0kVar2.r(z2);
                }
                b0kVar2.r(z3);
                qim0Var2 = qim0Var5;
            } else {
                qim0Var3 = qim0VarF;
            }
            qim0VarX = qim0Var6;
            qim0 qim0VarThen2 = qim0Var3.then(qim0VarX);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            qim0 qim0VarZ2 = uyn1.z(0.0f, 8.0f, 1, qim0VarThen2);
            fra fraVar2 = een.N0;
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar2, b0kVar2, 0);
            iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0VarM = b0kVar2.m();
            qim0VarE = zr7.E(b0kVar2, qim0VarZ2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            z = ((x340) b0kVar2).S;
            function1 = hmb0.t1;
            if (z) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            vu30Var2 = y580.O0;
            nko1.H(jw31VarA, b0kVar2, vu30Var2);
            vu30Var3 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, vu30Var3);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            lljVar = y580.R0;
            nko1.H(numValueOf2, b0kVar2, lljVar);
            nko1.F(b0kVar2);
            vu30Var4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, vu30Var4);
            if (vu30Var != null) {
                b0kVar2.i0(-1801578202);
                us71.j((i5 >> 12) & 14, vu30Var, b0kVar2, false);
            } else {
                b0kVar2.i0(-1801417157);
                b0kVar2.r(false);
            }
            if (str2 != null) {
                qim0Var4 = qim0Var6;
                vu30Var5 = vu30Var3;
                vu30Var6 = vu30Var4;
                lljVar2 = lljVar;
                vu30Var7 = vu30Var2;
                function2 = function1;
                b0kVar2.i0(-1800880020);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                uwo1.e(str, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), cbx.d(b0kVar2).g, 0L, null, null, 2, false, new cjc0(1), 0, null, b0kVar2, i5 & 14, 0, 1720);
                z2 = false;
                b0kVar2.r(false);
            } else {
                qim0Var4 = qim0Var6;
                vu30Var5 = vu30Var3;
                vu30Var6 = vu30Var4;
                lljVar2 = lljVar;
                vu30Var7 = vu30Var2;
                function2 = function1;
                b0kVar2.i0(-1800880020);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                uwo1.e(str, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), cbx.d(b0kVar2).g, 0L, null, null, 2, false, new cjc0(1), 0, null, b0kVar2, i5 & 14, 0, 1720);
                z2 = false;
                b0kVar2.r(false);
            }
            if (huxVar == null) {
                b0kVar2.i0(-1800646901);
                b0kVar2.r(z2);
                qim0Var5 = qim0Var4;
                z3 = true;
            } else {
                b0kVar2.i0(-1800646900);
                b0kVar2.i0(-1349675146);
                b0kVar2.r(z2);
                gfh0 gfh0VarC2 = t1c.c(een.d, z2);
                int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM4 = b0kVar2.m();
                qim0Var5 = qim0Var4;
                qim0 qim0VarE4 = zr7.E(b0kVar2, qim0Var5);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(function2);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC2, b0kVar2, vu30Var7);
                nko1.H(xos0VarM4, b0kVar2, vu30Var5);
                x0d.q(iHashCode4, b0kVar2, lljVar2, b0kVar2);
                nko1.H(qim0VarE4, b0kVar2, vu30Var6);
                w0h1.a(huxVar, isl.a, (qim0) null, 0L, 0L, false, b0kVar2, 56, 60);
                z3 = true;
                b0kVar2.r(true);
                b0kVar2.r(z2);
            }
            b0kVar2.r(z3);
            qim0Var2 = qim0Var5;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0(str, qim0Var2, str2, vu30Var, huxVar, function0, i);
        }
    }

    public static final void k(Integer num, Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        String strN0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1431807569);
        int i2 = (x340Var.g(num) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            rpx rpxVar = rpx.c;
            if (num == null) {
                x340Var.i0(-1658898739);
                x340Var.r(false);
                strN0 = null;
            } else {
                x340Var.i0(-1658898738);
                strN0 = cwl1.n0(2131951877, new Object[]{Integer.valueOf(num.intValue())}, x340Var);
                x340Var.r(false);
            }
            if (strN0 == null) {
                strN0 = x0d.k(x340Var, -1577530173, 2131951878, x340Var, false);
            } else {
                x340Var.i0(-1577534296);
                x340Var.r(false);
            }
            function1 = function0;
            a(rpx.d | 24576 | ((i2 << 6) & 7168), strN0, cwl1.o0(x340Var, 2131951876), function1, x340Var, rpxVar, anm1.N("sign-up-under-age-row", nim0.a));
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n2(num, function1, i, (byte) 5);
        }
    }

    public static final boolean l() {
        try {
            Class.forName("androidx.test.espresso.Espresso");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    public static String m(ov30 ov30Var, int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append(ov30Var instanceof pjl ? "<init>" : ((o9r) ov30Var).getName().b());
        }
        sb.append("(");
        rob0 rob0VarL = ov30Var.L();
        if (rob0VarL != null) {
            sb.append(q(rob0VarL.getType()));
        }
        Iterator it = ov30Var.F().iterator();
        while (it.hasNext()) {
            sb.append(q(((tsi1) it.next()).getType()));
        }
        sb.append(")");
        if (z) {
            if (ov30Var instanceof pjl) {
                sb.append("V");
            } else {
                a8b0 returnType = ov30Var.getReturnType();
                returnType.getClass();
                ajn0 ajn0Var = g6b0.e;
                if (g6b0.E(returnType, rfb1.d)) {
                    a8b0 returnType2 = ov30Var.getReturnType();
                    returnType2.getClass();
                    if (!o1h1.e(returnType2) && !(ov30Var instanceof zdy0)) {
                        sb.append("V");
                    }
                }
                a8b0 returnType3 = ov30Var.getReturnType();
                returnType3.getClass();
                sb.append(q(returnType3));
            }
        }
        return sb.toString();
    }

    public static final String n(hyc hycVar) {
        if (!iht.m(hycVar)) {
            beg begVarK = hycVar.k();
            beg begVar = begVarK instanceof beg ? begVarK : null;
            if (begVar != null && !begVar.getName().b) {
                xw81 xw81VarA = hycVar.a();
                xw81 xw81Var = xw81VarA instanceof xw81 ? xw81VarA : null;
                if (xw81Var != null) {
                    String strM = m(xw81Var, 3);
                    String str = j8a0.a;
                    heg hegVarG = j8a0.g(kht.g(begVar).a);
                    return cy30.l(hegVarG != null ? tia0.e(hegVarG) : si1.k(begVar, njx0.U0), '.', strM);
                }
            }
        }
        return null;
    }

    public static u9p o(i1o i1oVar, l1o l1oVar, q7r0 q7r0Var, rih1 rih1Var) {
        i1oVar.getClass();
        rih1Var.getClass();
        return new u9p(i1oVar, l1oVar, q7r0Var);
    }

    public static final boolean p(bav0 bav0Var) {
        return bav0Var.c == 2;
    }

    public static final kka0 q(a8b0 a8b0Var) {
        return (kka0) si1.q(a8b0Var, x0h1.i, k6i.g);
    }

    public static final List r(h3j1 h3j1Var, uxn uxnVar) {
        if (!h3j1Var.b || uxnVar == null) {
            return z6x.a;
        }
        ArrayList arrayList = uxnVar.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            kxn kxnVar = (kxn) obj;
            if (!(kxnVar.a instanceof sxn) && kxnVar.b.length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final z2a s(h3j1 h3j1Var, a7q0 a7q0Var, uxn uxnVar) {
        z6q0 z6q0Var;
        z6q0 z6q0Var2;
        z6q0 z6q0Var3;
        boolean z = false;
        boolean z2 = h3j1Var.d && a7q0Var != null && (z6q0Var3 = a7q0Var.f) != null && z6q0Var3.a();
        boolean z3 = h3j1Var.e && a7q0Var != null && (z6q0Var2 = a7q0Var.f) != null && z6q0Var2.b();
        if (h3j1Var.c && a7q0Var != null && (z6q0Var = a7q0Var.f) != null && z6q0Var.b) {
            z = true;
        }
        if (!z2 && !z3 && !z) {
            return w2a.a;
        }
        List listR = r(h3j1Var, uxnVar);
        if (z2) {
            return new r2a(listR);
        }
        return z3 ? new s2a(listR) : new x2a(listR);
    }

    public static final qn30 t(pn30 pn30Var) {
        if ((pn30Var != null ? pn30Var.a : 0) != 2) {
            return null;
        }
        return new qn30(pn30Var.d);
    }

    public static final ua71 u(Bundle bundle) {
        Object objT = jhc1.t(bundle, "share.args", ua71.class);
        if (objT != null) {
            return (ua71) objT;
        }
        hhg1.n("No share arguments in bundle.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c1 A[PHI: r18
      0x01c1: PHI (r18v5 p.o69) = (r18v2 p.o69), (r11v10 p.o69), (r11v10 p.o69) binds: [B:106:0x01e5, B:103:0x01d0, B:99:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x01ec A[LOOP:1: B:74:0x014f->B:109:0x01ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0114  */
    /* JADX WARN: Code duplicated, block: B:71:0x0134 A[LOOP:2: B:37:0x00a0->B:71:0x0134, LOOP_END] */
    public static final Map v(Iterable iterable) {
        g79 g79Var;
        int i;
        Map map;
        o69 y69Var;
        int i2;
        x69 x69Var;
        t69 v69Var;
        int i3;
        a79 b79Var;
        Map z69Var;
        e79 d79Var;
        int i4;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            Map i79Var = null;
            if (!it.hasNext()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : arrayList) {
                    g79 g79Var2 = ((i79) obj).a;
                    Object arrayList2 = linkedHashMap.get(g79Var2);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(g79Var2, arrayList2);
                    }
                    ((List) arrayList2).add(obj);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    g79 g79Var3 = (g79) entry.getKey();
                    i79 i79Var2 = (i79) o7h.X0(o7h.j0((List) entry.getValue()));
                    mmr0 mmr0Var = i79Var2 != null ? new mmr0(g79Var3, i79Var2) : null;
                    if (mmr0Var != null) {
                        arrayList3.add(mmr0Var);
                    }
                }
                return sqg0.T(arrayList3);
            }
            AutomationValueSemanticsOuterClass$AutomationValueSemantics automationValueSemanticsOuterClass$AutomationValueSemantics = (AutomationValueSemanticsOuterClass$AutomationValueSemantics) it.next();
            switch (automationValueSemanticsOuterClass$AutomationValueSemantics.o().ordinal()) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                case 6:
                    g79Var = null;
                    break;
                case 1:
                    g79Var = g79.a;
                    break;
                case 2:
                    g79Var = g79.b;
                    break;
                case 3:
                    g79Var = g79.c;
                    break;
                case 4:
                    g79Var = g79.d;
                    break;
                case 5:
                    g79Var = g79.e;
                    break;
                default:
                    eg.o();
                    return null;
            }
            if (g79Var != null) {
                int iOrdinal = automationValueSemanticsOuterClass$AutomationValueSemantics.p().ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else if (iOrdinal == 1) {
                    i = 1;
                } else if (iOrdinal == 2) {
                    i = 2;
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        eg.o();
                        return null;
                    }
                    i = 0;
                } else {
                    i = 3;
                }
                if (i != 0) {
                    if (automationValueSemanticsOuterClass$AutomationValueSemantics.s()) {
                        map = null;
                        y69Var = new o69(automationValueSemanticsOuterClass$AutomationValueSemantics.n().p(), automationValueSemanticsOuterClass$AutomationValueSemantics.n().o());
                    } else {
                        map = null;
                        if (automationValueSemanticsOuterClass$AutomationValueSemantics.t()) {
                            h290 h290VarO = automationValueSemanticsOuterClass$AutomationValueSemantics.q().o();
                            ArrayList arrayList4 = new ArrayList(q7h.U(h290VarO, 10));
                            Iterator it2 = h290VarO.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    AutomationValueSemanticsOuterClass$AutomationInterpolationSegment automationValueSemanticsOuterClass$AutomationInterpolationSegment = (AutomationValueSemanticsOuterClass$AutomationInterpolationSegment) it2.next();
                                    automationValueSemanticsOuterClass$AutomationInterpolationSegment.getClass();
                                    if (automationValueSemanticsOuterClass$AutomationInterpolationSegment.u()) {
                                        i2 = 1;
                                    } else {
                                        if (automationValueSemanticsOuterClass$AutomationInterpolationSegment.y()) {
                                            i2 = 2;
                                        } else {
                                            x69Var = null;
                                        }
                                        if (x69Var != null) {
                                            arrayList4.add(x69Var);
                                        }
                                    }
                                    if (automationValueSemanticsOuterClass$AutomationInterpolationSegment.v()) {
                                        v69Var = t69.a;
                                    } else if (automationValueSemanticsOuterClass$AutomationInterpolationSegment.w()) {
                                        v69Var = new u69(automationValueSemanticsOuterClass$AutomationInterpolationSegment.q().o());
                                    } else {
                                        if (automationValueSemanticsOuterClass$AutomationInterpolationSegment.x()) {
                                            v69Var = new v69(automationValueSemanticsOuterClass$AutomationInterpolationSegment.r().o());
                                        } else {
                                            x69Var = null;
                                        }
                                        if (x69Var != null) {
                                            arrayList4.add(x69Var);
                                        }
                                    }
                                    t69 t69Var = v69Var;
                                    int iOrdinal2 = automationValueSemanticsOuterClass$AutomationInterpolationSegment.o().ordinal();
                                    if (iOrdinal2 == 0) {
                                        i3 = 1;
                                    } else if (iOrdinal2 == 1) {
                                        i3 = 2;
                                    } else if (iOrdinal2 == 2) {
                                        i3 = 3;
                                    } else {
                                        if (iOrdinal2 != 3) {
                                            eg.o();
                                            return null;
                                        }
                                        i3 = 0;
                                    }
                                    if (i3 == 0) {
                                        x69Var = null;
                                    } else {
                                        x69Var = new x69(automationValueSemanticsOuterClass$AutomationInterpolationSegment.t(), automationValueSemanticsOuterClass$AutomationInterpolationSegment.s(), automationValueSemanticsOuterClass$AutomationInterpolationSegment.p(), automationValueSemanticsOuterClass$AutomationInterpolationSegment.n(), i2, t69Var, i3);
                                    }
                                    if (x69Var != null) {
                                        arrayList4.add(x69Var);
                                    }
                                } else {
                                    y69Var = new y69(arrayList4);
                                }
                            }
                        }
                        i79Var = map;
                    }
                    h290 h290VarR = automationValueSemanticsOuterClass$AutomationValueSemantics.r();
                    ArrayList arrayList5 = new ArrayList(q7h.U(h290VarR, 10));
                    Iterator it3 = h290VarR.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            AutomationValueSemanticsOuterClass$AutomationSpecialCase automationValueSemanticsOuterClass$AutomationSpecialCase = (AutomationValueSemanticsOuterClass$AutomationSpecialCase) it3.next();
                            automationValueSemanticsOuterClass$AutomationSpecialCase.getClass();
                            if (automationValueSemanticsOuterClass$AutomationSpecialCase.r()) {
                                b79Var = new a79(automationValueSemanticsOuterClass$AutomationSpecialCase.o());
                            } else {
                                if (automationValueSemanticsOuterClass$AutomationSpecialCase.q()) {
                                    b79Var = new b79(automationValueSemanticsOuterClass$AutomationSpecialCase.n().p(), automationValueSemanticsOuterClass$AutomationSpecialCase.n().o());
                                } else {
                                    y69Var = y69Var;
                                }
                                z69Var = map;
                                if (z69Var == null) {
                                    i79Var = map;
                                } else {
                                    arrayList5.add(z69Var);
                                    y69Var = y69Var;
                                }
                            }
                            if (automationValueSemanticsOuterClass$AutomationSpecialCase.p().r()) {
                                int iOrdinal3 = automationValueSemanticsOuterClass$AutomationSpecialCase.p().p().ordinal();
                                if (iOrdinal3 == 0) {
                                    i4 = 0;
                                } else if (iOrdinal3 == 1) {
                                    i4 = 1;
                                } else if (iOrdinal3 == 2) {
                                    i4 = 2;
                                } else if (iOrdinal3 == 3) {
                                    i4 = 3;
                                } else if (iOrdinal3 != 4) {
                                    if (iOrdinal3 != 5) {
                                        eg.o();
                                        return map;
                                    }
                                    i4 = 0;
                                } else {
                                    i4 = 4;
                                }
                                if (i4 == 0) {
                                    z69Var = map;
                                } else {
                                    d79Var = new e79(i4);
                                    z69Var = new z69(b79Var, d79Var);
                                }
                            } else if (automationValueSemanticsOuterClass$AutomationSpecialCase.p().q()) {
                                d79Var = new d79(automationValueSemanticsOuterClass$AutomationSpecialCase.p().o());
                                z69Var = new z69(b79Var, d79Var);
                            } else {
                                z69Var = map;
                            }
                            if (z69Var == null) {
                                i79Var = map;
                            } else {
                                arrayList5.add(z69Var);
                                y69Var = y69Var;
                            }
                        } else {
                            i79Var = new i79(g79Var, i, y69Var, arrayList5);
                        }
                    }
                }
            }
            if (i79Var != null) {
                arrayList.add(i79Var);
            }
        }
    }

    public static final int w(z2a z2aVar) {
        if (z2aVar instanceof r2a) {
            return 1;
        }
        if (z2aVar instanceof s2a) {
            return 2;
        }
        if ((z2aVar instanceof x2a) || z2aVar.equals(w2a.a)) {
            return 4;
        }
        eg.o();
        return 0;
    }

    public static final int x(z2a z2aVar) {
        if (z2aVar instanceof r2a) {
            return 1;
        }
        if (z2aVar instanceof s2a) {
            return 2;
        }
        if ((z2aVar instanceof x2a) || z2aVar.equals(w2a.a)) {
            return 4;
        }
        eg.o();
        return 0;
    }

    public static final lax y(ibd0 ibd0Var) {
        return ibd0Var instanceof hbd0 ? new gax(2131957437, (String) null) : iax.a;
    }
}
