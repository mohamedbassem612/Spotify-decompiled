package p;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class e130 {
    public static final byte[] a = new byte[0];
    public static b180 b = null;
    public static b180 c = null;
    public static final float d = 478.0f;

    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    public static final void a(int i, int i2, String str, b0k b0kVar) {
        b0k b0kVar2;
        Uri uri;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(304198785);
        int i3 = (b0kVar3.g(str) ? 4 : 2) | i2 | (b0kVar3.e(i) ? 32 : 16);
        byte b2 = 3;
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            uvx uvxVar = new uvx(0, (pgx) null, 0, (vzq0) null, (zzq0) null, (tvx) null, (hw61) null, 2, new p3v(48.0f), 127);
            xu30 xu30VarR = null;
            if (str != null) {
                uri = Uri.parse(str);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    uri = null;
                }
            } else {
                uri = null;
            }
            if (uri == null) {
                b0kVar3.i0(5436742);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(5436743);
                xu30VarR = apo.r(-1510392625, new e6j(uri, ven0Var, (byte) 7), b0kVar3);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b((qim0) null, uvxVar, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, xu30VarR, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(2032494533, new f13(i, b2), b0kVar3), b0kVar2, 64, 196608, 32253);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ue0(str, i, i2, (byte) 3);
        }
    }

    public static final void b(int i, int i2, Function0 function0, b0k b0kVar) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1671941368);
        int i3 = (b0kVar2.e(i) ? 4 : 2) | i2 | (b0kVar2.i(function0) ? 32 : 16);
        if (b0kVar2.Y(i3 & 1, (i3 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarY);
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
            nko1.H(gfh0VarC, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            olx olxVar = olx.c;
            jsl jslVar = new jsl(cwl1.o0(b0kVar2, 2131951975));
            long j = cbx.a(b0kVar2).b.a;
            gra graVar = een.g;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(nim0Var, graVar);
            boolean z = (i3 & 112) == 32;
            Object objT = b0kVar2.T();
            if (z || objT == fkj0.X) {
                objT = new ugj(function0, (byte) 10);
                b0kVar2.s0(objT);
            }
            w0h1.a(olxVar, jslVar, bin.x(qim0VarA, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), j, 0L, false, b0kVar2, olx.d, 48);
            String strO0 = cwl1.o0(b0kVar2, i);
            lee1 lee1Var = cbx.d(b0kVar2).h;
            b0kVar2 = b0kVar2;
            uwo1.e(strO0, h2cVar.a(u291.f(nim0Var, 1.0f), een.h), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2024);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1(i, function0, i2, (byte) 5);
        }
    }

    public static final void c(bp0 bp0Var, xu30 xu30Var, Function0 function0, iu30 iu30Var, vu30 vu30Var, iu30 iu30Var2, Function0 function1, vu30 vu30Var2, Function0 function2, vu30 vu30Var3, iu30 iu30Var3, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        xu30 xu30Var2;
        Function0 function3;
        vu30 vu30Var4;
        Function0 function4;
        vu30 vu30Var5;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1066231535);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(bp0Var) : b0kVar3.i(bp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            xu30Var2 = xu30Var;
            i2 |= b0kVar3.i(xu30Var2) ? 32 : 16;
        } else {
            xu30Var2 = xu30Var;
        }
        if ((i & 384) == 0) {
            function3 = function0;
            i2 |= b0kVar3.i(function3) ? 256 : 128;
        } else {
            function3 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            vu30Var4 = vu30Var;
            i2 |= b0kVar3.i(vu30Var4) ? 16384 : 8192;
        } else {
            vu30Var4 = vu30Var;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(iu30Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            function4 = function1;
            i2 |= b0kVar3.i(function4) ? 1048576 : 524288;
        } else {
            function4 = function1;
        }
        if ((12582912 & i) == 0) {
            vu30Var5 = vu30Var2;
            i2 |= b0kVar3.i(vu30Var5) ? 8388608 : 4194304;
        } else {
            vu30Var5 = vu30Var2;
        }
        if ((i & 100663296) == 0) {
            i2 |= b0kVar3.i(function2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= b0kVar3.i(vu30Var3) ? 536870912 : 268435456;
        }
        int i3 = (b0kVar3.i(iu30Var3) ? (char) 4 : (char) 2) | '0';
        if (b0kVar3.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(null);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            int i4 = i2;
            bab1 bab1VarR = prn1.r(((t32) o7h.q0(bp0Var.a.a)).getId(), b0kVar3, 0);
            String str = (String) o7h.C0((List) bab1VarR.b.getValue());
            boolean zG = b0kVar3.g(str) | ((i3 & 14) == 4);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new are(str, iu30Var3);
                b0kVar3.s0(objT2);
            }
            qxd0.C(str, (Function0) objT2, b0kVar3);
            boolean zA = bab1VarR.a();
            boolean zI = b0kVar3.i(bab1VarR) | ((i4 & 458752) == 131072) | ((i4 & 234881024) == 67108864);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new d1c(bab1VarR, iu30Var2, function2, (byte) 28);
                b0kVar3.s0(objT3);
            }
            q3p1.b(0, 0, (Function0) objT3, b0kVar3, zA);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarL = bmq0.L(u291.f(qim0Var3, 1.0f), k1o1.q(b0kVar3), (g6o0) null);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarL);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            b0kVar2 = b0kVar3;
            w9b1.a(bab1VarR, (qim0) null, apo.r(-1654786349, new ssk(bp0Var, xu30Var2, function3, function4, ven0Var, vu30Var5, bab1VarR, iu30Var, vu30Var4, vu30Var3, iu30Var2, function2), b0kVar3), b0kVar2, 384, 2);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tsk(bp0Var, xu30Var, function0, iu30Var, vu30Var, iu30Var2, function1, vu30Var2, function2, vu30Var3, iu30Var3, qim0Var2, i);
        }
    }

    public static final void d(ji0 ji0Var, j2i j2iVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, qim0 qim0Var, b0k b0kVar, int i) {
        j2i j2iVar2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-757603558);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(ji0Var) ? 4 : 2) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(function2) ? 16384 : 8192) | (x340Var.i(function3) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            Function0 function0P = d9p1.p(function0, x340Var, (i2 >> 3) & 112);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            long j = cbx.a(x340Var).d.b;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(qim0VarF, j, er31.b(16.0f));
            boolean zB = ji0Var.b();
            boolean zG = x340Var.g(function0P);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new z9t(function0P, (byte) 12);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = uyn1.x(bin.x(qim0VarF2, zB, (String) null, (pm31) null, (idn0) null, (Function0) objT, 14), 12.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
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
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            cbx.a.getClass();
            qim0 qim0VarF4 = hno1.f(qim0VarF3, (ecx) uwr.m.getValue());
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarF5 = dug.f(i1p1.q(qim0VarF4, er31.b(4.0f)), cbx.a(x340Var).a.a.a(), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF5);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            int i3 = i2 >> 9;
            f(ji0Var, function2, function3, x340Var, (i2 & 14) | (i3 & 112) | (i3 & 896));
            qim0 qim0VarX2 = uyn1.x(u291.f(qim0Var3, 1.0f), 8.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            r2p1.a(uyn1.B(qim0Var3, 4.0f, 8.0f, 0.0f, 0.0f, 12), x340Var, 0);
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarR = u291.r(qim0Var3, 48.0f);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarR);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            mta mtaVar2 = cbx.b(x340Var).d;
            t1c.a(dug.f(u291.r(qim0Var3, 32.0f), ((vex) zex.a.e).d, er31.a), x340Var, 0);
            j2iVar2 = j2iVar;
            k4s0.i(6, j2iVar2, x340Var, true, true);
            x340Var.r(true);
            e(i2 & 7168, ji0Var.c, ji0Var.R0, function1, x340Var, uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), ji0Var.b());
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ta5((Object) ji0Var, (Object) j2iVar2, (Object) function0, (Object) function1, (Object) function2, (Object) function3, (Object) qim0Var2, i, (byte) 14);
        }
    }

    public static final void e(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        String str3;
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1813366669);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (x340Var2.g(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Function0 function0P = d9p1.p(function0, x340Var2, (i2 >> 6) & 112);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 0);
            int i3 = i2;
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            wnb0 wnb0Var = new wnb0(1.0f, true);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            byte b2 = 2;
            uwo1.e(str3, anm1.N(zyd1.d, uyn1.B(wnb0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11)), cbx.d(x340Var2).g, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var2, i3 & 14, 0, 1776);
            x340Var = x340Var2;
            if (z) {
                x340Var.i0(759090396);
                idx idxVar = new idx(8);
                gdx gdxVarS = yla.s(x340Var);
                boolean zG = x340Var.g(function0P);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new z9t(function0P, (byte) 13);
                    x340Var.s0(objT);
                }
                foo1.c(new gbx(z50.c, (Function0) objT), idxVar, anm1.N(zyd1.f, nim0.a), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1791109707, new qeu(str2, b2), x340Var), x340Var, 0, 48, 2008);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(759670065);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ahu(str, str2, z, function0, qim0Var, i, (byte) 0);
        }
    }

    public static final void f(ji0 ji0Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1219777573);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(ji0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function1) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String strR = ila0.r(ji0Var.g.a);
            if (strR == null) {
                strR = "";
            }
            String str = strR;
            int i3 = i2;
            fwx fwxVarG = hso1.G(box.c, 0L, 0L, b0kVar3, box.d, 30);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            Uri uri = Uri.parse(str);
            as80 as80Var = mif1.P0;
            boolean z = (i3 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new xet(function0, (byte) 2);
                b0kVar3.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            boolean z2 = (i3 & 896) == 256;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new xet(function1, (byte) 3);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            eso1.h(oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, fwxVarG, fwxVarG, false, false, as80Var, iu30Var, (iu30) objT2, (iu30) null, 0L, b0kVar2, 2359296, 0, 116638), new jsl(ji0Var.c), qim0VarD, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, b0kVar2, 224256, 384);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t((Object) ji0Var, (Object) function0, (Object) function1, i, (byte) 5);
        }
    }

    public static final void g(pkm0 pkm0Var, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1314182299);
        int i2 = i | (b0kVar2.g(pkm0Var) ? 4 : 2) | (b0kVar2.i(vu30Var) ? 32 : 16) | 384;
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("MoreLike", u291.f(uyn1.z(0.0f, 16.0f, 1, qim0Var3), 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
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
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String str = pkm0Var.a;
            lee1 lee1Var = cbx.d(b0kVar2).e;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            uwo1.e(str, uyn1.z(16.0f, 0.0f, 2, qim0Var3), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2040);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            cvx cvxVar4 = ywx0.k(qim0Var3, 4.0f, b0kVar2, b0kVar2).b;
            d36 d36Var = new d36(2.0f, true, new um5(false));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = b0kVar2.T();
            if (z || objT == fkj0.X) {
                objT = new uah0(pkm0Var, vu30Var, (byte) 27);
                b0kVar2.s0(objT);
            }
            b0kVar2 = b0kVar2;
            ujo1.e((qim0) null, (xtb0) null, (vzq0) null, d36Var, (pl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, b0kVar2, 0, 495);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rvg0(pkm0Var, vu30Var, qim0Var2, i, (byte) 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x015c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0162  */
    /* JADX WARN: Code duplicated, block: B:83:0x016e  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void h(Function0 function0, String str, String str2, String str3, int i, qim0 qim0Var, String str4, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        String str5;
        boolean z;
        b0k b0kVar2;
        String str6;
        h311 h311VarV;
        String str7;
        ydx ydxVar;
        ngx ngxVar;
        boolean z2;
        Object objT;
        Function0 function1;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-419624709);
        if ((i2 & 6) == 0) {
            i4 = (b0kVar3.i(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar3.g(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar3.g(str3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= b0kVar3.e(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            qim0Var2 = qim0Var;
            i4 |= b0kVar3.i(qim0Var2) ? 131072 : 65536;
        } else {
            qim0Var2 = qim0Var;
        }
        int i5 = i3 & 64;
        if (i5 == 0) {
            if ((1572864 & i2) == 0) {
                str5 = str4;
                i4 |= b0kVar3.g(str5) ? 1048576 : 524288;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                if (i5 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                ydxVar = new ydx(4.0f, 12.0f, 8.0f, new zzq0(12.0f, 12.0f, 12.0f, 12.0f));
                ngxVar = ngx.e;
                if ((i4 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT = b0kVar3.T();
                if (z2 || objT == fkj0.X) {
                    objT = new kek0(function0, (byte) 5);
                    b0kVar3.s0(objT);
                }
                function1 = (Function0) objT;
                if (!ihc1.y0(str2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    b0kVar2 = b0kVar3;
                    ioo1.c(qim0Var2, ngxVar, ydxVar, (hw61) null, (max) null, (idn0) null, (ga80) null, new gbx(new y50(str2), function1), (gbx) null, apo.r(-1437244106, new qvh(str, i, (byte) 3), b0kVar3), (xu30) null, (xu30) null, apo.r(1920941556, new qdg0(str3, (byte) 9), b0kVar3), (xu30) null, (xu30) null, (xu30) null, apo.r(-1940062096, new qdg0(str7, (byte) 10), b0kVar3), b0kVar2, ((i4 >> 15) & 14) | 805306880, 1573248, 60792);
                    str6 = str7;
                }
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                str6 = str5;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ns7(function0, str, str2, str3, i, qim0Var, str6, i2, i3);
            }
        }
        i4 |= 1572864;
        str5 = str4;
        if ((599187 & i4) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i4 & 1, z)) {
            if (i5 != 0) {
                str7 = null;
            } else {
                str7 = str5;
            }
            uwr uwrVar2 = cbx.a;
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            cvx cvxVar6 = cbx.b(b0kVar3).b;
            cvx cvxVar7 = cbx.b(b0kVar3).b;
            cvx cvxVar8 = cbx.b(b0kVar3).b;
            ydxVar = new ydx(4.0f, 12.0f, 8.0f, new zzq0(12.0f, 12.0f, 12.0f, 12.0f));
            ngxVar = ngx.e;
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            objT = b0kVar3.T();
            if (z2) {
                objT = new kek0(function0, (byte) 5);
                b0kVar3.s0(objT);
            } else {
                objT = new kek0(function0, (byte) 5);
                b0kVar3.s0(objT);
            }
            function1 = (Function0) objT;
            if (!ihc1.y0(str2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                ioo1.c(qim0Var2, ngxVar, ydxVar, (hw61) null, (max) null, (idn0) null, (ga80) null, new gbx(new y50(str2), function1), (gbx) null, apo.r(-1437244106, new qvh(str, i, (byte) 3), b0kVar3), (xu30) null, (xu30) null, apo.r(1920941556, new qdg0(str3, (byte) 9), b0kVar3), (xu30) null, (xu30) null, (xu30) null, apo.r(-1940062096, new qdg0(str7, (byte) 10), b0kVar3), b0kVar2, ((i4 >> 15) & 14) | 805306880, 1573248, 60792);
                str6 = str7;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            str6 = str5;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ns7(function0, str, str2, str3, i, qim0Var, str6, i2, i3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void i(okm0 okm0Var, int i, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1160738294);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(okm0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (!x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var.b0();
        } else if (okm0Var instanceof mkm0) {
            x340Var.i0(773099955);
            mkm0 mkm0Var = (mkm0) okm0Var;
            String str = mkm0Var.c;
            String str2 = mkm0Var.b;
            String strO0 = cwl1.o0(x340Var, 2131963614);
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new hkm0(vu30Var, okm0Var, i, (byte) 0);
                x340Var.s0(objT);
            }
            h((Function0) objT, str, strO0, str2, 2131232419, qim0Var, null, x340Var, (i3 << 6) & 458752, 64);
            x340Var.r(false);
        } else {
            if (!(okm0Var instanceof nkm0)) {
                throw p3d1.k(x340Var, -1221989461, false);
            }
            x340Var.i0(773551966);
            nkm0 nkm0Var = (nkm0) okm0Var;
            String str3 = nkm0Var.d;
            String str4 = nkm0Var.b;
            String str5 = nkm0Var.c;
            String strO1 = cwl1.o0(x340Var, 2131963624);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new hkm0(vu30Var, okm0Var, i, (byte) 1);
                x340Var.s0(objT2);
            }
            h((Function0) objT2, str3, strO1, str5, 2131232785, qim0Var, str4, x340Var, (i3 << 6) & 458752, 0);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0((Object) okm0Var, i, (Object) vu30Var, (Object) qim0Var, i2, (byte) 9);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r2v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v26 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v33 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v47 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v47 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v50 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v50 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v12 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void j(p.usb1 r33, p.nsq r34, p.qim0 r35, p.b0k r36, int r37) {
        /*
            Method dump skipped, instruction units count: 933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e130.j(p.usb1, p.nsq, p.qim0, p.b0k, int):void");
    }

    public static final void k(usb1 usb1Var, nsq nsqVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        usb1 usb1Var2;
        int i3;
        int i4;
        Map map = usb1Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1608039007);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(usb1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(nsqVar) : x340Var.i(nsqVar) ? 32 : 16;
        }
        int i5 = i2 | 384;
        if (x340Var.Y(i5 & 1, (i5 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xsb1 xsb1Var = xsb1.g;
            btb1 btb1Var = (btb1) map.get(xsb1Var);
            if (btb1Var == null) {
                x340Var.i0(207645110);
                x340Var.r(false);
            } else {
                x340Var.i0(207645111);
                m(btb1Var, xsb1Var, usb1Var, 2, nsqVar, false, x340Var, ((i5 << 9) & 57344) | ((i5 << 6) & 896) | 3120, 32);
                x340Var.r(false);
            }
            xsb1 xsb1Var2 = xsb1.t;
            btb1 btb1Var2 = (btb1) map.get(xsb1Var2);
            if (btb1Var2 == null) {
                x340Var.i0(207911028);
                x340Var.r(false);
            } else {
                x340Var.i0(207911029);
                m(btb1Var2, xsb1Var2, usb1Var, 2, nsqVar, false, x340Var, ((i5 << 6) & 896) | 3120 | ((i5 << 9) & 57344), 32);
                x340Var.r(false);
            }
            xsb1 xsb1Var3 = xsb1.f;
            btb1 btb1Var3 = (btb1) map.get(xsb1Var3);
            if (btb1Var3 == null) {
                x340Var.i0(208169661);
                x340Var.r(false);
            } else {
                x340Var.i0(208169662);
                m(btb1Var3, xsb1Var3, usb1Var, 2, nsqVar, false, x340Var, ((i5 << 6) & 896) | 3120 | ((i5 << 9) & 57344), 32);
                x340Var.r(false);
            }
            xsb1 xsb1Var4 = xsb1.h;
            btb1 btb1Var4 = (btb1) map.get(xsb1Var4);
            if (btb1Var4 == null) {
                x340Var.i0(208428015);
                x340Var.r(false);
            } else {
                x340Var.i0(208428016);
                m(btb1Var4, xsb1Var4, usb1Var, 2, nsqVar, true, x340Var, ((i5 << 6) & 896) | 199728 | ((i5 << 9) & 57344), 0);
                x340Var.r(false);
            }
            xsb1 xsb1Var5 = xsb1.Y;
            btb1 btb1Var5 = (btb1) map.get(xsb1Var5);
            if (btb1Var5 == null) {
                x340Var.i0(208726483);
                x340Var.r(false);
                usb1Var2 = usb1Var;
            } else {
                x340Var.i0(208726484);
                m(btb1Var5, xsb1Var5, usb1Var, 2, nsqVar, true, x340Var, ((i5 << 6) & 896) | 199728 | ((i5 << 9) & 57344), 0);
                usb1Var2 = usb1Var;
                x340Var.r(false);
            }
            xsb1 xsb1Var6 = xsb1.i;
            btb1 btb1Var6 = (btb1) map.get(xsb1Var6);
            if (btb1Var6 == null) {
                x340Var.i0(209042032);
                x340Var.r(false);
                i3 = 2;
            } else {
                x340Var.i0(209042033);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = nsqVar.a();
                    x340Var.s0(objT);
                }
                qsb1 qsb1Var = (qsb1) objT;
                pks0 pks0Var = usb1Var2.b;
                i3 = 2;
                ksb1 ksb1Var = new ksb1(btb1Var6, xsb1Var6, pks0Var, 2, usb1Var2.d, true, usb1Var2.f);
                otw.c(qsb1Var, ksb1Var, (qim0) null, wpb1.D(l1d.m("stats_card_social_tracks_list_", pks0Var.b()), qsb1Var, ksb1Var, x340Var, 0), x340Var, 0, 4);
                x340Var = x340Var;
                x340Var.r(false);
            }
            xsb1 xsb1Var7 = xsb1.X;
            btb1 btb1Var7 = (btb1) map.get(xsb1Var7);
            if (btb1Var7 == null) {
                x340Var.i0(209894935);
                x340Var.r(false);
                i4 = i3;
            } else {
                x340Var.i0(209894936);
                i4 = i3;
                m(btb1Var7, xsb1Var7, usb1Var2, i4, nsqVar, false, x340Var, ((i5 << 6) & 896) | 3120 | ((i5 << 9) & 57344), 32);
                x340Var.r(false);
            }
            xsb1 xsb1Var8 = xsb1.e;
            btb1 btb1Var8 = (btb1) map.get(xsb1Var8);
            if (btb1Var8 == null) {
                x340Var.i0(210149662);
                x340Var.r(false);
            } else {
                x340Var.i0(210149663);
                m(btb1Var8, xsb1Var8, usb1Var, i4, nsqVar, false, x340Var, ((i5 << 6) & 896) | 3120 | ((i5 << 9) & 57344), 32);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w5a1(usb1Var, nsqVar, qim0Var2, i, (byte) 1);
        }
    }

    public static final void l(usb1 usb1Var, boolean z, nsq nsqVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(234271815);
        int i2 = i | (x340Var.i(usb1Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.g(nsqVar) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N("social_stats_container", qim0Var2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            if (z) {
                x340Var.i0(372740546);
                k(usb1Var, nsqVar, null, x340Var, ((i2 >> 3) & 112) | (i2 & 14));
                x340Var.r(false);
            } else {
                x340Var.i0(372808994);
                j(usb1Var, nsqVar, null, x340Var, ((i2 >> 3) & 112) | (i2 & 14));
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x5a1(usb1Var, z, nsqVar, qim0Var2, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void m(btb1 btb1Var, xsb1 xsb1Var, usb1 usb1Var, int i, nsq nsqVar, boolean z, b0k b0kVar, int i2, int i3) {
        int i4;
        boolean z2;
        boolean z3;
        b0k b0kVar2;
        boolean z4;
        h311 h311VarV;
        Object objT;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1813771822);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? b0kVar3.g(btb1Var) : b0kVar3.i(btb1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar3.e(xsb1Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar3.i(usb1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar3.e(l1d.C(i)) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? b0kVar3.g(nsqVar) : b0kVar3.i(nsqVar) ? 16384 : 8192;
        }
        int i5 = i3 & 32;
        if (i5 == 0) {
            if ((196608 & i2) == 0) {
                z2 = z;
                i4 |= b0kVar3.h(z2) ? 131072 : 65536;
            }
            if ((74899 & i4) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar3.Y(i4 & 1, z3)) {
                boolean z5 = i5 == 0 ? z2 : false;
                objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = nsqVar.a();
                    b0kVar3.s0(objT);
                }
                b0kVar2 = b0kVar3;
                otw.c((qsb1) objT, new ksb1(btb1Var, xsb1Var, usb1Var.b, i, usb1Var.d, z5, usb1Var.f), (qim0) null, (ipb1) null, b0kVar2, 0, 12);
                z4 = z5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z4 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new dix(btb1Var, xsb1Var, usb1Var, i, nsqVar, z4, i2, i3);
            }
        }
        i4 |= 196608;
        z2 = z;
        if ((74899 & i4) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b0kVar3.Y(i4 & 1, z3)) {
            if (i5 == 0) {
            }
            objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = nsqVar.a();
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            otw.c((qsb1) objT, new ksb1(btb1Var, xsb1Var, usb1Var.b, i, usb1Var.d, z5, usb1Var.f), (qim0) null, (ipb1) null, b0kVar2, 0, 12);
            z4 = z5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z4 = z2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new dix(btb1Var, xsb1Var, usb1Var, i, nsqVar, z4, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:71:0x0106  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void n(String str, String str2, qim0 qim0Var, iu30 iu30Var, djc0 djc0Var, boolean z, lee1 lee1Var, b0k b0kVar, int i, int i2) {
        int i3;
        djc0 djc0Var2;
        int i4;
        int i5;
        boolean z2;
        int i6;
        lee1 lee1Var2;
        int i7;
        boolean z3;
        qim0 qim0Var2;
        djc0 cjc0Var;
        boolean z4;
        lee1 lee1Var3;
        h311 h311VarV;
        int i8;
        qim0 qim0Var3;
        boolean z5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1395127538);
        if ((i & 6) == 0) {
            i3 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i9 = i3 | (x340Var.g(str2) ? 32 : 16) | 384 | (x340Var.i(iu30Var) ? 2048 : 1024);
        if ((i2 & 16) == 0) {
            djc0Var2 = djc0Var;
            int i10 = x340Var.i(djc0Var2) ? 16384 : 8192;
            i4 = i9 | i10;
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((i & 196608) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((i2 & 64) == 0) {
                    lee1Var2 = lee1Var;
                    int i11 = x340Var.i(lee1Var2) ? 1048576 : 524288;
                    i7 = i4 | i11;
                    if ((599187 & i7) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var.Y(i7 & 1, z3)) {
                        x340Var.d0();
                        if ((i & 1) != 0 || x340Var.E()) {
                            if ((i2 & 16) != 0) {
                                cjc0Var = new cjc0(4);
                            } else {
                                cjc0Var = djc0Var2;
                            }
                            boolean z6 = i5 == 0 ? z2 : true;
                            i8 = i2 & 64;
                            qim0Var3 = nim0.a;
                            if (i8 != 0) {
                                uwr uwrVar = cbx.a;
                                lee1Var3 = cbx.d(x340Var).j;
                            } else {
                                lee1Var3 = lee1Var2;
                            }
                            z5 = z6;
                        } else {
                            x340Var.b0();
                            cjc0Var = djc0Var2;
                            z5 = z2;
                            lee1Var3 = lee1Var2;
                            qim0Var3 = qim0Var;
                        }
                        x340Var.s();
                        nyx.a(2, (wux) null, apo.r(-192667999, new lz80(qim0Var3, str, ((Number) x340Var.k(odf1.a)).floatValue(), str2, cjc0Var, iu30Var, lee1Var3, z5), x340Var), x340Var, 3078, 6);
                        qim0Var2 = qim0Var3;
                        z4 = z5;
                    } else {
                        x340Var.b0();
                        qim0Var2 = qim0Var;
                        cjc0Var = djc0Var2;
                        z4 = z2;
                        lee1Var3 = lee1Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new zc5(str, str2, qim0Var2, iu30Var, cjc0Var, z4, lee1Var3, i, i2);
                    }
                }
                lee1Var2 = lee1Var;
                i7 = i4 | i11;
                if ((599187 & i7) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i7 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i2 & 16) != 0) {
                            cjc0Var = new cjc0(4);
                        } else {
                            cjc0Var = djc0Var2;
                        }
                        if (i5 == 0) {
                        }
                        i8 = i2 & 64;
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            uwr uwrVar2 = cbx.a;
                            lee1Var3 = cbx.d(x340Var).j;
                        } else {
                            lee1Var3 = lee1Var2;
                        }
                        z5 = z6;
                    } else {
                        if ((i2 & 16) != 0) {
                            cjc0Var = new cjc0(4);
                        } else {
                            cjc0Var = djc0Var2;
                        }
                        if (i5 == 0) {
                        }
                        i8 = i2 & 64;
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            uwr uwrVar3 = cbx.a;
                            lee1Var3 = cbx.d(x340Var).j;
                        } else {
                            lee1Var3 = lee1Var2;
                        }
                        z5 = z6;
                    }
                    x340Var.s();
                    nyx.a(2, (wux) null, apo.r(-192667999, new lz80(qim0Var3, str, ((Number) x340Var.k(odf1.a)).floatValue(), str2, cjc0Var, iu30Var, lee1Var3, z5), x340Var), x340Var, 3078, 6);
                    qim0Var2 = qim0Var3;
                    z4 = z5;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    cjc0Var = djc0Var2;
                    z4 = z2;
                    lee1Var3 = lee1Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new zc5(str, str2, qim0Var2, iu30Var, cjc0Var, z4, lee1Var3, i, i2);
                }
            }
            i4 |= 196608;
            z2 = z;
            if ((i2 & 64) == 0) {
                lee1Var2 = lee1Var;
                if (x340Var.i(lee1Var2)) {
                }
                i7 = i4 | i11;
                if ((599187 & i7) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i7 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i2 & 16) != 0) {
                            cjc0Var = new cjc0(4);
                        } else {
                            cjc0Var = djc0Var2;
                        }
                        if (i5 == 0) {
                        }
                        i8 = i2 & 64;
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            uwr uwrVar4 = cbx.a;
                            lee1Var3 = cbx.d(x340Var).j;
                        } else {
                            lee1Var3 = lee1Var2;
                        }
                        z5 = z6;
                    } else {
                        if ((i2 & 16) != 0) {
                            cjc0Var = new cjc0(4);
                        } else {
                            cjc0Var = djc0Var2;
                        }
                        if (i5 == 0) {
                        }
                        i8 = i2 & 64;
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            uwr uwrVar5 = cbx.a;
                            lee1Var3 = cbx.d(x340Var).j;
                        } else {
                            lee1Var3 = lee1Var2;
                        }
                        z5 = z6;
                    }
                    x340Var.s();
                    nyx.a(2, (wux) null, apo.r(-192667999, new lz80(qim0Var3, str, ((Number) x340Var.k(odf1.a)).floatValue(), str2, cjc0Var, iu30Var, lee1Var3, z5), x340Var), x340Var, 3078, 6);
                    qim0Var2 = qim0Var3;
                    z4 = z5;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    cjc0Var = djc0Var2;
                    z4 = z2;
                    lee1Var3 = lee1Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new zc5(str, str2, qim0Var2, iu30Var, cjc0Var, z4, lee1Var3, i, i2);
                }
            }
            lee1Var2 = lee1Var;
            i7 = i4 | i11;
            if ((599187 & i7) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i7 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 16) != 0) {
                        cjc0Var = new cjc0(4);
                    } else {
                        cjc0Var = djc0Var2;
                    }
                    if (i5 == 0) {
                    }
                    i8 = i2 & 64;
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        uwr uwrVar6 = cbx.a;
                        lee1Var3 = cbx.d(x340Var).j;
                    } else {
                        lee1Var3 = lee1Var2;
                    }
                    z5 = z6;
                } else {
                    if ((i2 & 16) != 0) {
                        cjc0Var = new cjc0(4);
                    } else {
                        cjc0Var = djc0Var2;
                    }
                    if (i5 == 0) {
                    }
                    i8 = i2 & 64;
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        uwr uwrVar7 = cbx.a;
                        lee1Var3 = cbx.d(x340Var).j;
                    } else {
                        lee1Var3 = lee1Var2;
                    }
                    z5 = z6;
                }
                x340Var.s();
                nyx.a(2, (wux) null, apo.r(-192667999, new lz80(qim0Var3, str, ((Number) x340Var.k(odf1.a)).floatValue(), str2, cjc0Var, iu30Var, lee1Var3, z5), x340Var), x340Var, 3078, 6);
                qim0Var2 = qim0Var3;
                z4 = z5;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                cjc0Var = djc0Var2;
                z4 = z2;
                lee1Var3 = lee1Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zc5(str, str2, qim0Var2, iu30Var, cjc0Var, z4, lee1Var3, i, i2);
            }
        }
        djc0Var2 = djc0Var;
        i4 = i9 | i10;
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((i & 196608) == 0) {
                z2 = z;
                if (x340Var.h(z2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((i2 & 64) == 0) {
                lee1Var2 = lee1Var;
                if (x340Var.i(lee1Var2)) {
                }
                i7 = i4 | i11;
                if ((599187 & i7) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i7 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i2 & 16) != 0) {
                            cjc0Var = new cjc0(4);
                        } else {
                            cjc0Var = djc0Var2;
                        }
                        if (i5 == 0) {
                        }
                        i8 = i2 & 64;
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            uwr uwrVar8 = cbx.a;
                            lee1Var3 = cbx.d(x340Var).j;
                        } else {
                            lee1Var3 = lee1Var2;
                        }
                        z5 = z6;
                    } else {
                        if ((i2 & 16) != 0) {
                            cjc0Var = new cjc0(4);
                        } else {
                            cjc0Var = djc0Var2;
                        }
                        if (i5 == 0) {
                        }
                        i8 = i2 & 64;
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            uwr uwrVar9 = cbx.a;
                            lee1Var3 = cbx.d(x340Var).j;
                        } else {
                            lee1Var3 = lee1Var2;
                        }
                        z5 = z6;
                    }
                    x340Var.s();
                    nyx.a(2, (wux) null, apo.r(-192667999, new lz80(qim0Var3, str, ((Number) x340Var.k(odf1.a)).floatValue(), str2, cjc0Var, iu30Var, lee1Var3, z5), x340Var), x340Var, 3078, 6);
                    qim0Var2 = qim0Var3;
                    z4 = z5;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    cjc0Var = djc0Var2;
                    z4 = z2;
                    lee1Var3 = lee1Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new zc5(str, str2, qim0Var2, iu30Var, cjc0Var, z4, lee1Var3, i, i2);
                }
            }
            lee1Var2 = lee1Var;
            i7 = i4 | i11;
            if ((599187 & i7) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i7 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 16) != 0) {
                        cjc0Var = new cjc0(4);
                    } else {
                        cjc0Var = djc0Var2;
                    }
                    if (i5 == 0) {
                    }
                    i8 = i2 & 64;
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        uwr uwrVar10 = cbx.a;
                        lee1Var3 = cbx.d(x340Var).j;
                    } else {
                        lee1Var3 = lee1Var2;
                    }
                    z5 = z6;
                } else {
                    if ((i2 & 16) != 0) {
                        cjc0Var = new cjc0(4);
                    } else {
                        cjc0Var = djc0Var2;
                    }
                    if (i5 == 0) {
                    }
                    i8 = i2 & 64;
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        uwr uwrVar11 = cbx.a;
                        lee1Var3 = cbx.d(x340Var).j;
                    } else {
                        lee1Var3 = lee1Var2;
                    }
                    z5 = z6;
                }
                x340Var.s();
                nyx.a(2, (wux) null, apo.r(-192667999, new lz80(qim0Var3, str, ((Number) x340Var.k(odf1.a)).floatValue(), str2, cjc0Var, iu30Var, lee1Var3, z5), x340Var), x340Var, 3078, 6);
                qim0Var2 = qim0Var3;
                z4 = z5;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                cjc0Var = djc0Var2;
                z4 = z2;
                lee1Var3 = lee1Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zc5(str, str2, qim0Var2, iu30Var, cjc0Var, z4, lee1Var3, i, i2);
            }
        }
        i4 |= 196608;
        z2 = z;
        if ((i2 & 64) == 0) {
            lee1Var2 = lee1Var;
            if (x340Var.i(lee1Var2)) {
            }
            i7 = i4 | i11;
            if ((599187 & i7) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i7 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 16) != 0) {
                        cjc0Var = new cjc0(4);
                    } else {
                        cjc0Var = djc0Var2;
                    }
                    if (i5 == 0) {
                    }
                    i8 = i2 & 64;
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        uwr uwrVar12 = cbx.a;
                        lee1Var3 = cbx.d(x340Var).j;
                    } else {
                        lee1Var3 = lee1Var2;
                    }
                    z5 = z6;
                } else {
                    if ((i2 & 16) != 0) {
                        cjc0Var = new cjc0(4);
                    } else {
                        cjc0Var = djc0Var2;
                    }
                    if (i5 == 0) {
                    }
                    i8 = i2 & 64;
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        uwr uwrVar13 = cbx.a;
                        lee1Var3 = cbx.d(x340Var).j;
                    } else {
                        lee1Var3 = lee1Var2;
                    }
                    z5 = z6;
                }
                x340Var.s();
                nyx.a(2, (wux) null, apo.r(-192667999, new lz80(qim0Var3, str, ((Number) x340Var.k(odf1.a)).floatValue(), str2, cjc0Var, iu30Var, lee1Var3, z5), x340Var), x340Var, 3078, 6);
                qim0Var2 = qim0Var3;
                z4 = z5;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                cjc0Var = djc0Var2;
                z4 = z2;
                lee1Var3 = lee1Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zc5(str, str2, qim0Var2, iu30Var, cjc0Var, z4, lee1Var3, i, i2);
            }
        }
        lee1Var2 = lee1Var;
        i7 = i4 | i11;
        if ((599187 & i7) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i7 & 1, z3)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i2 & 16) != 0) {
                    cjc0Var = new cjc0(4);
                } else {
                    cjc0Var = djc0Var2;
                }
                if (i5 == 0) {
                }
                i8 = i2 & 64;
                qim0Var3 = nim0.a;
                if (i8 != 0) {
                    uwr uwrVar14 = cbx.a;
                    lee1Var3 = cbx.d(x340Var).j;
                } else {
                    lee1Var3 = lee1Var2;
                }
                z5 = z6;
            } else {
                if ((i2 & 16) != 0) {
                    cjc0Var = new cjc0(4);
                } else {
                    cjc0Var = djc0Var2;
                }
                if (i5 == 0) {
                }
                i8 = i2 & 64;
                qim0Var3 = nim0.a;
                if (i8 != 0) {
                    uwr uwrVar15 = cbx.a;
                    lee1Var3 = cbx.d(x340Var).j;
                } else {
                    lee1Var3 = lee1Var2;
                }
                z5 = z6;
            }
            x340Var.s();
            nyx.a(2, (wux) null, apo.r(-192667999, new lz80(qim0Var3, str, ((Number) x340Var.k(odf1.a)).floatValue(), str2, cjc0Var, iu30Var, lee1Var3, z5), x340Var), x340Var, 3078, 6);
            qim0Var2 = qim0Var3;
            z4 = z5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            cjc0Var = djc0Var2;
            z4 = z2;
            lee1Var3 = lee1Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zc5(str, str2, qim0Var2, iu30Var, cjc0Var, z4, lee1Var3, i, i2);
        }
    }

    public static final sn50 o(pr31 pr31Var, String str) {
        iwh0 iwh0Var = pr31Var.l;
        if (iwh0Var == null) {
            eg.m("Required value was null.");
            return null;
        }
        iwh0 iwh0Var2 = iwh0Var instanceof iwh0 ? iwh0Var : null;
        if (iwh0Var2 != null) {
            return new sn50(v(iwh0Var2, str), ((lwh0) iwh0Var2).c, w(str, Collections.unmodifiableList(((lwh0) iwh0Var2).v)), iwh0Var2);
        }
        return null;
    }

    public static final ComposeView p(Context context, String str) {
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setId(View.generateViewId());
        composeView.setContent(new j2i(-963086664, new dz40(str, (byte) 23), true));
        return composeView;
    }

    public static void q(View... viewArr) {
        for (View view : viewArr) {
            view.setAlpha(0.4f);
        }
    }

    public static final lvl0 r(urk0 urk0Var, s63 s63Var) {
        d8r0 d8r0Var = s63Var.i;
        return new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var.b, d8r0Var.a, d8r0Var.e), d8r0Var.d), s63Var.h, (byte) 3);
    }

    public static final ddf0 s(edf0[] edf0VarArr, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.j0(-395574495);
        int iHashCode = Arrays.hashCode(edf0VarArr);
        x340Var.j0(34468001);
        boolean zE = x340Var.e(iHashCode);
        Object objT = x340Var.T();
        if (zE || objT == fkj0.X) {
            objT = new ddf0(f46.Q0(edf0VarArr));
            x340Var.s0(objT);
        }
        ddf0 ddf0Var = (ddf0) objT;
        x340Var.r(false);
        x340Var.r(false);
        return ddf0Var;
    }

    public static final edf0 t(Object obj, Object obj2, String[] strArr, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.j0(-1788530187);
        x340Var.j0(1613443961);
        boolean zG = x340Var.g(strArr);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = new kpa0((String[]) Arrays.copyOf(strArr, strArr.length));
            x340Var.s0(objT);
        }
        kpa0 kpa0Var = (kpa0) objT;
        x340Var.r(false);
        x340Var.j0(1613444012);
        boolean zG2 = ((((i & 14) ^ 6) > 4 && x340Var.g(obj)) || (i & 6) == 4) | x340Var.g(kpa0Var) | x340Var.g(obj2);
        Object objT2 = x340Var.T();
        if (zG2 || objT2 == m4cVar) {
            objT2 = new edf0(obj, kpa0Var, obj2);
            x340Var.s0(objT2);
        }
        edf0 edf0Var = (edf0) objT2;
        x340Var.r(false);
        x340Var.r(false);
        return edf0Var;
    }

    public static final void u(pr31 pr31Var) {
        lwh0 lwh0Var = pr31Var.l;
        if (lwh0Var != null) {
            lwh0Var.k(true);
        } else {
            eg.m("Required value was null.");
        }
    }

    public static final pr31 v(lwh0 lwh0Var, String str) {
        String str2 = lwh0Var.c;
        return new pr31(str2, lwh0Var.d, lwh0Var.e, lwh0Var.f, lwh0Var.n, lwh0Var.g, lwh0Var.i, lwh0Var.p, lwh0Var.q, lwh0Var.c(), lwh0Var.s, lwh0Var, nhc1.Y(str2, str, false) || u890.j(((ComponentName) lwh0Var.a.d.b).getPackageName(), str), lwh0Var.h);
    }

    public static final ArrayList w(String str, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(v((lwh0) it.next(), str));
        }
        return arrayList;
    }

    public static Next x(kak0 kak0Var, r3k0 r3k0Var) {
        tv80 tv80Var = r3k0Var.a;
        kak0 kak0VarA = kak0.a(kak0Var, ndm0.a, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -17, 1048575);
        if (kak0Var.a || !l2p1.m(kak0Var)) {
            return u890.j(kak0Var.W0, j8w0.a) ? Next.i(kak0VarA, Collections.singleton(new l0k0(kak0Var.S0, tv80Var))) : Next.i(kak0VarA, Collections.singleton(new q0k0(tv80Var, false)));
        }
        return Next.i(kak0VarA, Collections.singleton(new d1k0(new s3u(2))));
    }

    public static final t8r0 y(pd3 pd3Var) {
        return new t8r0(pd3Var);
    }
}
