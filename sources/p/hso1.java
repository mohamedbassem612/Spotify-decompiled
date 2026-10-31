package p;

import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.protobuf.InvalidProtocolBufferException;
import defpackage.e;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class hso1 implements dar, x1k {
    public static b180 a;

    public static final fwx E(int i, long j, boolean z, long j2, b0k b0kVar, int i2, int i3) {
        long jA;
        if ((i3 & 2) != 0) {
            uwr uwrVar = cbx.a;
            j = cbx.a(b0kVar).b.b;
        }
        long j3 = j;
        if ((i3 & 4) != 0) {
            z = true;
        }
        if ((i3 & 8) != 0) {
            uwr uwrVar2 = cbx.a;
            jA = cbx.a(b0kVar).a.b.a();
        } else {
            jA = j2;
        }
        k6t0 k6t0VarZ = Z(j3, jA, b0kVar, 0);
        return z(i3o1.n(i, b0kVar, 0), k6t0VarZ.a, k6t0VarZ.b, z, b0kVar, 520 | ((i2 << 3) & 7168), 0);
    }

    public static final fwx G(hux huxVar, long j, long j2, b0k b0kVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            uwr uwrVar = cbx.a;
            j = cbx.a(b0kVar).b.b;
        }
        long j3 = j;
        if ((i2 & 8) != 0) {
            uwr uwrVar2 = cbx.a;
            j2 = cbx.a(b0kVar).a.b.a();
        }
        b180 b180Var = huxVar.a.b;
        k6t0 k6t0VarZ = Z(j3, j2, b0kVar, ((i >> 3) & 14) | ((i >> 6) & 112));
        return z(byo1.s(b180Var, b0kVar), k6t0VarZ.a, k6t0VarZ.b, true, b0kVar, 520 | ((i << 3) & 7168), 0);
    }

    public static List I() {
        return Collections.singletonList(rc11.a.b(xa20.class));
    }

    public static void J(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!S(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !S(b3) && !S(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public static void L(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (S(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || S(b3)))) {
            throw InvalidProtocolBufferException.c();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    public static void O(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || S(b2)) {
            throw InvalidProtocolBufferException.c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static final go80 P(klm klmVar, qbp0 qbp0Var, qbp0 qbp0Var2) {
        return klmVar.a("BleDiscoverySnapshotDaemon", new rap0(qbp0Var, qbp0Var2, (byte) 2));
    }

    public static boolean R(yyq yyqVar) {
        if (yyqVar instanceof wyq) {
            return ((wyq) yyqVar).b instanceof b3r;
        }
        if (!(yyqVar instanceof uyq)) {
            return false;
        }
        List list = ((uyq) yyqVar).a;
        if (list.isEmpty()) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!R((yyq) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean S(byte b) {
        return b > -65;
    }

    public static boolean U(yyq yyqVar) {
        if (yyqVar instanceof vyq) {
            return true;
        }
        if (!(yyqVar instanceof uyq)) {
            return R(yyqVar);
        }
        List list = ((uyq) yyqVar).a;
        if (list.isEmpty()) {
            return false;
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!U((yyq) it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final String W(ws61 ws61Var, b0k b0kVar) throws NoWhenBranchMatchedException {
        x340 x340Var;
        int i;
        int i2;
        int iOrdinal = ws61Var.ordinal();
        if (iOrdinal == 0) {
            x340Var = (x340) b0kVar;
            i = 2131963902;
            i2 = 1082387350;
        } else if (iOrdinal == 1) {
            x340Var = (x340) b0kVar;
            i = 2131963903;
            i2 = 1082390035;
        } else if (iOrdinal == 2) {
            x340Var = (x340) b0kVar;
            i = 2131963904;
            i2 = 1082392858;
        } else if (iOrdinal == 3) {
            x340Var = (x340) b0kVar;
            i = 2131963900;
            i2 = 1082395868;
        } else {
            if (iOrdinal != 4) {
                throw p3d1.k((x340) b0kVar, 1082386359, false);
            }
            x340Var = (x340) b0kVar;
            i = 2131963901;
            i2 = 1082399003;
        }
        return x0d.k(x340Var, i2, i, x340Var, false);
    }

    public static final k6t0 Z(long j, long j2, b0k b0kVar, int i) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == obj) {
            objT = s8x.S0;
            x340Var.s0(objT);
        }
        iu30 iu30Var = (iu30) objT;
        x340 x340Var2 = (x340) b0kVar;
        Object objT2 = x340Var2.T();
        if (objT2 == obj) {
            objT2 = s8x.T0;
            x340Var2.s0(objT2);
        }
        iu30 iu30Var2 = (iu30) objT2;
        boolean z = (((i & 14) ^ 6) > 4 && ((x340) b0kVar).f(j)) || (i & 6) == 4;
        x340 x340Var3 = (x340) b0kVar;
        Object objT3 = x340Var3.T();
        if (z || objT3 == obj) {
            objT3 = (ColorFilter) iu30Var.invoke(new u7h(j));
            x340Var3.s0(objT3);
        }
        ColorFilter colorFilter = (ColorFilter) objT3;
        boolean z2 = (((i & 112) ^ 48) > 32 && x340Var3.f(j2)) || (i & 48) == 32;
        Object objT4 = x340Var3.T();
        if (z2 || objT4 == obj) {
            objT4 = (jmr0) iu30Var2.invoke(new u7h(j2));
            x340Var3.s0(objT4);
        }
        jmr0 jmr0Var = (jmr0) objT4;
        boolean zG = x340Var3.g(colorFilter) | x340Var3.g(jmr0Var);
        Object objT5 = x340Var3.T();
        if (zG || objT5 == obj) {
            objT5 = new k6t0(colorFilter, jmr0Var);
            x340Var3.s0(objT5);
        }
        return (k6t0) objT5;
    }

    public static void e(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static boolean g(byte b) {
        return b >= 0;
    }

    public static final void h(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(663291069);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = dug.f(u291.d(qim0Var, 1.0f), z4p1.e(Color.parseColor(str)), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            float f = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 2 ? 50.0f : 100.0f;
            Uri uri = Uri.parse(str2);
            qim0 qim0VarA = h2c.a.a(u291.r(nim0.a, f), een.h);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            eso1.e(uri, isl.a, anm1.N("media.share.audioui.coverart", sto1.o(qim0VarA, 10.0f, er31.b(8.0f), false, 0L, 0L, 28)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, true, false, x340Var, 48, 6, 3064);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var, i, (byte) 5);
        }
    }

    public static final void i(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(450421896);
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            float size = 32.0f * c380Var.size();
            if (size > 64.0f) {
                size = 64.0f;
            }
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarV = u291.v(u291.z(qim0Var2, (fra) null, 3), size);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = r1o.U0;
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarV, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            if (c380Var.size() > 2) {
                x340Var.i0(563999866);
                int size2 = c380Var.size() - 1;
                z2o z2oVar = ((d3o) o7h.q0(c380Var)).b;
                if (z2oVar == null) {
                    x340Var.i0(564061028);
                    x340Var.r(false);
                } else {
                    x340Var.i0(564061029);
                    iro1.b(z2oVar, 0, 2.0f, (qim0) null, x340Var, 432);
                    x340Var.r(false);
                }
                String strC = f4i1.c(size2, "+");
                uwr uwrVar = cbx.a;
                qro1.c(strC, ((yex) zex.a.d).e, null, x340Var, 3456);
                x340Var.r(false);
            } else {
                x340Var.i0(564328311);
                z2o z2oVar2 = ((d3o) o7h.q0(c380Var)).b;
                if (z2oVar2 == null) {
                    x340Var.i0(564354660);
                    x340Var.r(false);
                } else {
                    x340Var.i0(564354661);
                    iro1.b(z2oVar2, 0, 2.0f, (qim0) null, x340Var, 432);
                    x340Var.r(false);
                }
                if (c380Var.size() > 1) {
                    x340Var.i0(18209953);
                    z2o z2oVar3 = ((d3o) o7h.A0(c380Var)).b;
                    if (z2oVar3 == null) {
                        x340Var.i0(564508544);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(564508545);
                        iro1.b(z2oVar3, 1, 0.0f, (qim0) null, x340Var, 432);
                        x340Var.r(false);
                    }
                    x340Var.r(false);
                } else {
                    x340Var.i0(564607776);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e(c380Var, qim0Var, i, (byte) 4);
        }
    }

    public static final void j(String str, String str2, String str3, String str4, String str5, Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        x340 x340Var;
        Function0 function1;
        boolean z;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1547841676);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.g(str3) ? 256 : 128) | (x340Var2.g(str4) ? 2048 : 1024) | (x340Var2.g(str5) ? 16384 : 8192) | (x340Var2.i(function0) ? 131072 : 65536);
        if (x340Var2.Y(i2 & 1, (i2 & 599187) != 599186)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            Function0 function2 = hmb0.t1;
            if (z2) {
                x340Var2.l(function2);
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
            qim0 qim0VarY = too1.y(u291.f(nim0Var, 1.0f), new bgc0(lmt0.s(x340Var2), 16));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0VarY, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarB, 4.0f, 0.0f, 12.0f, 0.0f, 10);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = nve.O0;
                x340Var2.s0(objT);
            }
            qim0 qim0VarB3 = s161.b(qim0VarB2, false, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function2);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            boolean z3 = (i2 & 458752) == 131072;
            Object objT2 = x340Var2.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new pj8(function0, (byte) 29);
                x340Var2.s0(objT2);
            }
            wro1.h(new gbx(new y50(str5), (Function0) objT2), ldx.c, null, null, null, null, false, null, null, apo.r(-1810425155, new j3b(str4, (byte) 19), x340Var2), x340Var2, 0, 6, 1020);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar4 = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, wnb0Var);
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = nve.P0;
                x340Var2.s0(objT3);
            }
            qim0 qim0VarB4 = s161.b(qim0VarZ, false, (iu30) objT3);
            mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarB4);
            x340Var2.m0();
            if (x340Var2.S) {
                function1 = function2;
                x340Var2.l(function1);
            } else {
                function1 = function2;
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            Function0 function3 = function1;
            uwo1.e(str, null, cbx.d(x340Var2).h, 0L, new a0e1(3), null, 2, false, new cjc0(1), 0, null, x340Var2, i2 & 14, 0, 1706);
            uwo1.e(str2, null, cbx.d(x340Var2).m, cbx.a(x340Var2).b.b, new a0e1(3), null, 2, false, new cjc0(1), 0, null, x340Var2, (i2 >> 3) & 14, 0, 1698);
            x340Var = x340Var2;
            if (str3 != null) {
                x340Var.i0(-1269836948);
                uwo1.e(str3, null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, new a0e1(3), null, 2, false, new cjc0(1), 0, null, x340Var, (i2 >> 6) & 14, 0, 1698);
                x340Var = x340Var;
                z = false;
                x340Var.r(false);
            } else {
                z = false;
                x340Var.i0(-1269556026);
                x340Var.r(false);
            }
            x340Var.r(true);
            mta mtaVar = cbx.b(x340Var).d;
            ywx0.n(nim0Var, 48.0f, x340Var, true);
            qim0 qim0VarY2 = too1.y(kx40.h(1.0f, u291.f(nim0Var, 1.0f), true), new bgc0(lmt0.s(x340Var), 32));
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarB5 = uyn1.B(qim0VarY2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
            gfh0 gfh0VarC = t1c.c(een.d, z);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB5);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function3);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            j2iVar2 = j2iVar;
            k4s0.i(6, j2iVar2, x340Var, true, true);
        } else {
            j2iVar2 = j2iVar;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ta5(str, str2, str3, str4, str5, function0, j2iVar2, i, (byte) 5);
        }
    }

    public static final void k(c380 c380Var, String str, String str2, c3o c3oVar, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, ezc ezcVar, qim0 qim0Var, a3o a3oVar, b0k b0kVar, int i) {
        c380 c380Var2;
        int i2;
        String str3;
        String str4;
        iu30 iu30Var4;
        iu30 iu30Var5;
        iu30 iu30Var6;
        ezc ezcVar2;
        qim0 qim0Var2;
        a3o a3oVar2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1016233550);
        if ((i & 6) == 0) {
            c380Var2 = c380Var;
            i2 = (b0kVar3.g(c380Var2) ? 4 : 2) | i;
        } else {
            c380Var2 = c380Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= b0kVar3.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= b0kVar3.g(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(c3oVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            iu30Var4 = iu30Var;
            i2 |= b0kVar3.i(iu30Var4) ? 16384 : 8192;
        } else {
            iu30Var4 = iu30Var;
        }
        if ((196608 & i) == 0) {
            iu30Var5 = iu30Var2;
            i2 |= b0kVar3.i(iu30Var5) ? 131072 : 65536;
        } else {
            iu30Var5 = iu30Var2;
        }
        if ((1572864 & i) == 0) {
            iu30Var6 = iu30Var3;
            i2 |= b0kVar3.i(iu30Var6) ? 1048576 : 524288;
        } else {
            iu30Var6 = iu30Var3;
        }
        if ((12582912 & i) == 0) {
            ezcVar2 = ezcVar;
            i2 |= b0kVar3.i(ezcVar2) ? 8388608 : 4194304;
        } else {
            ezcVar2 = ezcVar;
        }
        if ((100663296 & i) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.g(qim0Var2) ? 67108864 : 33554432;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((805306368 & i) == 0) {
            a3oVar2 = a3oVar;
            i2 |= b0kVar3.g(a3oVar2) ? 536870912 : 268435456;
        } else {
            a3oVar2 = a3oVar;
        }
        if (b0kVar3.Y(i2 & 1, (306783379 & i2) != 306783378)) {
            b0kVar2 = b0kVar3;
            cwl1.b(u291.z(u291.f(nim0.a, 1.0f), (fra) null, 3), een.g, (hw61) null, (pgx) null, new tzq0(14), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-336999703, new jkn(qim0Var2, iu30Var4, c3oVar, c380Var2, str3, str4, iu30Var5, iu30Var6, ezcVar2, a3oVar2), b0kVar3), b0kVar2, 24630, 48, 2028);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new is9(c380Var, str, str2, c3oVar, iu30Var, iu30Var2, iu30Var3, ezcVar, qim0Var, a3oVar, i);
        }
    }

    public static final void l(jld0 jld0Var, boolean z, String str, String str2, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, j2i j2iVar5, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(276564537);
        int i2 = i | (x340Var.i(jld0Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var).a.a.a(), d4o1.a);
            u85 u85Var = (erl1) x340Var.k(szf0.b);
            if (u85Var == null) {
                x340Var.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var).g;
            } else {
                x340Var.i0(-241885792);
            }
            x340Var.r(false);
            qim0 qim0VarY = too1.y(qim0VarF2, new bgc0(u85Var, 32));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            r(i2 & 8176, str, str2, x340Var, null, z);
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, nim0Var);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            kto1.c(jld0Var, uyn1.B(qim0VarZ, 0.0f, 8.0f, 0.0f, 16.0f, 5), x340Var, i2 & 14);
            cvx cvxVar3 = cbx.b(x340Var).b;
            cto1.d(uyn1.z(0.0f, 8.0f, 1, nim0Var), j2iVar, j2iVar2, j2iVar3, j2iVar4, j2iVar5, x340Var, 224688);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qw1(jld0Var, z, str, str2, j2iVar, j2iVar2, j2iVar3, j2iVar4, j2iVar5, i);
        }
    }

    public static final void r(int i, String str, String str2, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-434471413);
        int i2 = i | 6 | (x340Var.h(z) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, qim0VarF);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarB, 0.0f, 0.0f, 0.0f, 12.0f, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
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
            if (z) {
                x340Var.i0(1021520828);
                qim0Var3 = qim0Var4;
                vbe.s(cwl1.o0(x340Var, 2131957486), (qim0) null, cbx.a(x340Var).b.c, cbx.a(x340Var).b.c, cbx.d(x340Var).k, false, x340Var, 0, 34);
                cvx cvxVar3 = cbx.b(x340Var).b;
                x0d.s(qim0Var3, 16.0f, x340Var, false);
            } else {
                qim0Var3 = qim0Var4;
                x340Var.i0(1021875437);
                x340Var.r(false);
            }
            fqo1.n((i2 >> 3) & 1008, str, str2, x340Var, null);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zff(qim0Var2, z, str, str2, i);
        }
    }

    public static final xpw s(yue1 yue1Var, vi11 vi11Var) {
        ldo ldoVarA;
        ldo br0Var;
        if (yue1Var instanceof x5r) {
            p6m0 p6m0Var = new p6m0((byte) 0);
            ldoVarA = ((lsq) vi11Var.b).a(new fjc1(p6m0Var, (byte) 7), p6m0Var);
        } else if (yue1Var instanceof usb1) {
            ldoVarA = ((msq) vi11Var.c).a();
        } else {
            if (yue1Var instanceof k7s0) {
                wdm wdmVar = (wdm) ((osq) vi11Var.d).a.c;
                lzn0 lzn0Var = (lzn0) ((yxc1) wdmVar.b).g.get();
                c8o.l(lzn0Var);
                fg60 fg60Var = (fg60) ((yxc1) wdmVar.b).h.get();
                c8o.l(fg60Var);
                br0Var = new ng20(lzn0Var, fg60Var);
            } else if (yue1Var instanceof mf60) {
                wdm wdmVar2 = (wdm) ((psq) vi11Var.e).a.c;
                br0Var = new nf60(wdmVar2.t(), (qsq) ((jly0) wdmVar2.t).get(), (rsq) ((jly0) wdmVar2.X).get());
            } else if (yue1Var instanceof w4g) {
                xh71 xh71Var = (xh71) ((yxc1) ((wdm) ((ssq) vi11Var.f).a.c).b).b.get();
                c8o.l(xh71Var);
                br0Var = new br0(new xf60(xh71Var), new u6x((byte) 1));
            } else {
                ldoVarA = null;
            }
            ldoVarA = br0Var;
        }
        if (ldoVarA != null) {
            return ldoVarA;
        }
        return null;
    }

    public static final ven0 v(x8c0 x8c0Var, b0k b0kVar) {
        return rwq.h(x8c0Var.c(), b0kVar, 0);
    }

    public static void y() {
        dps0 dps0Var = dps0.d;
    }

    public static final fwx z(jmr0 jmr0Var, ColorFilter colorFilter, jmr0 jmr0Var2, boolean z, b0k b0kVar, int i, int i2) {
        boolean z2 = true;
        boolean z3 = (i2 & 8) != 0 ? true : z;
        kiv kivVar = t4k.h;
        x340 x340Var = (x340) b0kVar;
        float fX0 = ((wat) x340Var.k(kivVar)).X0(12.0f);
        float fX1 = ((wat) x340Var.k(kivVar)).X0(64.0f);
        boolean zG = ((((i & 14) ^ 6) > 4 && x340Var.g(jmr0Var)) || (i & 6) == 4) | x340Var.g(colorFilter) | ((((i & 896) ^ 384) > 256 && x340Var.g(jmr0Var2)) || (i & 384) == 256);
        if ((((i & 7168) ^ 3072) <= 2048 || !x340Var.h(z3)) && (i & 3072) != 2048) {
            z2 = false;
        }
        boolean zD = zG | z2 | x340Var.d(fX0) | x340Var.d(fX1);
        Object objT = x340Var.T();
        if (zD || objT == fkj0.X) {
            fwx fwxVar = new fwx(jmr0Var, colorFilter, z3, jmr0Var2, fX0, fX1);
            x340Var.s0(fwxVar);
            objT = fwxVar;
        }
        return (fwx) objT;
    }

    public Object A(h661 h661Var, int i, nma0 nma0Var, Object obj) {
        return Y(nma0Var);
    }

    public Object B(h661 h661Var, int i, nma0 nma0Var, Object obj) {
        if (nma0Var.getDescriptor().b() || X()) {
            return Y(nma0Var);
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public short C() throws SerializationException {
        x();
        throw null;
    }

    public double D(h661 h661Var, int i) {
        return H();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public float F() throws SerializationException {
        x();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public double H() throws SerializationException {
        x();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public boolean K() throws SerializationException {
        x();
        throw null;
    }

    public boolean M(h661 h661Var, int i) {
        return K();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public char N() throws SerializationException {
        x();
        throw null;
    }

    public float Q(h661 h661Var, int i) {
        return F();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public int T(h661 h661Var) throws SerializationException {
        x();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public String V() throws SerializationException {
        x();
        throw null;
    }

    public boolean X() {
        return true;
    }

    public short b0(inw0 inw0Var, int i) {
        return C();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public byte c0() throws SerializationException {
        x();
        throw null;
    }

    public char e0(inw0 inw0Var, int i) {
        return N();
    }

    public String f(h661 h661Var, int i) {
        return V();
    }

    public long i0(h661 h661Var, int i) {
        return u();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public int n() throws SerializationException {
        x();
        throw null;
    }

    public int o(h661 h661Var, int i) {
        return n();
    }

    public byte q(inw0 inw0Var, int i) {
        return c0();
    }

    public dar t(inw0 inw0Var, int i) {
        return w(inw0Var.g(i));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public long u() throws SerializationException {
        x();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public void x() throws SerializationException {
        throw new SerializationException(rc11.a.b(getClass()) + " can't retrieve untyped values");
    }

    public void a(h661 h661Var) {
    }

    public x1k b(h661 h661Var) {
        return this;
    }

    public dar w(h661 h661Var) {
        return this;
    }
}
