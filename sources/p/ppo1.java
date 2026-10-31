package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.common.ParserException;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.HighlightArtworkItem;
import defpackage.e;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ppo1 {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static b180 d;

    public static final void a(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-749847410);
        int i2 = (x340Var.i(c380Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            Iterator itN = kk0.n(x340Var, qim0VarE, y580.Y, 1920493087, c380Var);
            while (itN.hasNext()) {
                e7u e7uVar = (e7u) itN.next();
                b(e7uVar.a, e7uVar.b, null, x340Var, 8);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e(c380Var, qim0Var, i, (byte) 3);
        }
    }

    public static final void b(hux huxVar, String str, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-759847556);
        int i2 = i | (x340Var.i(huxVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(qim0Var3, 12.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            w0h1.a(huxVar, isl.a, (qim0) null, 0L, 0L, false, x340Var, 56 | (i2 & 14), 60);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str, new wnb0(1.0f, true), ktd.l(qim0Var3, 16.0f, x340Var, x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2032);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l42(huxVar, str, qim0Var2, i, (byte) 1);
        }
    }

    public static final void c(int i, String str, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        long jC;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1435126366);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = u291.b(0.0f, 48.0f, 1, qim0Var3);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new z20(iu30Var, z, (byte) 26);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarB, false, null, null, null, (Function0) objT, 15);
            cr31 cr31VarB = er31.b(56.0f);
            if (z) {
                x340Var.i0(471948135);
                uwr uwrVar = cbx.a;
                jC = cbx.a(x340Var).a.b.c();
                x340Var.r(false);
            } else {
                x340Var.i0(471948809);
                x340Var.r(false);
                jC = u7h.j;
            }
            qim0 qim0VarF = dug.f(qim0VarX, jC, cr31VarB);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str, anm1.N("emoji-button-for-".concat(str), uyn1.x(qim0VarF, 8.0f)), cbx.d(x340Var).c, 0L, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2040);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kz90(str, z, iu30Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void d(List list, boolean z, String str, Function0 function0, xtb0 xtb0Var, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        String str2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1759197386);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= x340Var.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= x340Var.g(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(xtb0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            boolean zD = ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | x340Var.d(12.0f) | x340Var.i(list) | ((i2 & 896) == 256) | x340Var.d(16.0f) | x340Var.i(xtb0Var);
            Object objT = x340Var.T();
            if (zD || objT == fkj0.X) {
                ey eyVar = new ey(list, z2, str2, function1, xtb0Var);
                x340Var.s0(eyVar);
                objT = eyVar;
            }
            ejo1.l(0, 0, x340Var, (vu30) objT, qim0VarF);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(list, z, str, function0, xtb0Var, i);
        }
    }

    public static final void e(eyb0 eyb0Var, Function0 function0, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        xtb0 xtb0Var;
        eyb0 eyb0Var2 = eyb0Var;
        boolean z = eyb0Var2.e;
        boolean z2 = eyb0Var2.d;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1574382326);
        int i2 = i | (b0kVar3.i(eyb0Var2) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new hw91();
                b0kVar3.s0(objT);
            }
            hw91 hw91Var = (hw91) objT;
            boolean zI = ((i2 & 896) == 256) | b0kVar3.i(xtb0VarA) | b0kVar3.i(hw91Var) | b0kVar3.i(eyb0Var2);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                z290 z290Var = new z290(xtb0VarA, hw91Var, eyb0Var2, iu30Var, (lnm) null, (byte) 5);
                xtb0Var = xtb0VarA;
                eyb0Var2 = eyb0Var2;
                b0kVar3.s0(z290Var);
                objT2 = z290Var;
            } else {
                xtb0Var = xtb0VarA;
            }
            qxd0.t(xtb0Var, b0kVar3, (vu30) objT2);
            String str = azd1.a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(anm1.N(str, qim0Var3), 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            xtb0 xtb0Var2 = xtb0Var;
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarB);
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
            String strO0 = cwl1.o0(b0kVar3, (z2 || z) ? 2131957204 : 2131957203);
            lee1 lee1Var = cbx.d(b0kVar3).e;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            uwo1.e(strO0, uyn1.z(16.0f, 0.0f, 2, qim0Var3), lee1Var, 0L, null, null, 0, false, null, 0, null, b0kVar3, 0, 0, 2040);
            vxb0 vxb0Var = eyb0Var2.a;
            b0kVar2 = b0kVar3;
            d(vxb0Var.b, z2 || z, vxb0Var.a, function0, xtb0Var2, b0kVar2, (i2 << 6) & 7168);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lxb0(eyb0Var, function0, iu30Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void f(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1081535999);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            cr31 cr31VarB = er31.b(56.0f);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var2, 48.0f);
            uwr uwrVar = cbx.a;
            t1c.a(anm1.N("loading-button-for-" + str, cwl1.l0(qim0VarR, cbx.a(x340Var).a.b.a(), cr31VarB, 12)), x340Var, 0);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var, i, (byte) 19);
        }
    }

    public static final void g(hob1 hob1Var, float f, iu30 iu30Var, znb0 znb0Var, znb0 znb0Var2, znb0 znb0Var3, boolean z, i091 i091Var, yqg yqgVar, float f2, Function0 function0, qim0 qim0Var, znb0 znb0Var4, xpw xpwVar, boolean z2, vu30 vu30Var, String str, Function0 function1, b0k b0kVar, int i, int i2) {
        int i3;
        iu30 iu30Var2;
        znb0 znb0Var5;
        int i4;
        znb0 znb0Var6;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1756861754);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(hob1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            iu30Var2 = iu30Var;
            i3 |= x340Var.i(iu30Var2) ? 256 : 128;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(znb0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            znb0Var5 = znb0Var2;
            i3 |= x340Var.i(znb0Var5) ? 16384 : 8192;
        } else {
            znb0Var5 = znb0Var2;
        }
        if ((i & 196608) == 0) {
            i3 |= x340Var.i(znb0Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= x340Var.h(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= x340Var.i(i091Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= x340Var.g(yqgVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= x340Var.d(f2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (x340Var.i(function0) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i5 = i4 | 48;
        if ((i2 & 384) == 0) {
            znb0Var6 = znb0Var4;
            i5 |= x340Var.i(znb0Var6) ? 256 : 128;
        } else {
            znb0Var6 = znb0Var4;
        }
        if ((i2 & 3072) == 0) {
            i5 |= x340Var.i(xpwVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= x340Var.h(z2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= x340Var.i(vu30Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= x340Var.g(str) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= x340Var.i(function1) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 4793491) == 4793490) ? false : true)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
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
            nyx.a(2, (wux) null, apo.r(1947878575, new vci0(f2, hob1Var, function1, function0, str, i091Var, z, yqgVar, z2, vu30Var, iu30Var2, ven0Var, xpwVar, znb0Var5, znb0Var3, znb0Var6), x340Var), x340Var, 3078, 6);
            x340Var.r(true);
            j(f, znb0Var, hob1Var, uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), iu30Var, x340Var, 0);
            x340Var = x340Var;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rci0(hob1Var, f, iu30Var, znb0Var, znb0Var2, znb0Var3, z, i091Var, yqgVar, f2, function0, qim0Var2, znb0Var4, xpwVar, z2, vu30Var, str, function1, i, i2);
        }
    }

    public static final void h(int i, b0k b0kVar, ziu ziuVar, iu30 iu30Var, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-353037938);
        int i2 = (x340Var.i(ziuVar) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).d.b;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(qim0VarF, j, er31.b(16.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF2);
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
            i2p1.a(i2 & 910, x340Var, ziuVar, iu30Var, null);
            e9p1.c(ziuVar, cbx.d(x340Var).j, jdx.c, u291.f(nim0.a, 1.0f), iu30Var, x340Var, (i2 & 14) | ((i2 << 6) & 57344));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jq0(ziuVar, qim0Var, iu30Var, i, (byte) 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v12 */
    public static final void i(mmv0 mmv0Var, String str, iu30 iu30Var, iu30 iu30Var2, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z2;
        qim0 qim0Var4;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1729818779);
        int i2 = (i & 6) == 0 ? (x340Var.i(mmv0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        iu30 iu30Var3 = iu30Var;
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var3) ? 256 : 128;
        }
        iu30 iu30Var4 = iu30Var2;
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        boolean z4 = 0;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            ss50 ss50Var = (ss50) x340Var.k(t4k.l);
            qim0 qim0Var5 = nim0.a;
            qim0 qim0VarX = uyn1.x(u291.f(qim0Var5, 1.0f), 8.0f);
            jw31 jw31VarA = ew31.a(h36.f, een.Z, x340Var, 6);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            qim0 qim0Var6 = null;
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            nmv0 nmv0Var = (nmv0) mmv0Var;
            c380 c380VarA = nmv0Var.a();
            x340Var.i0(-165169980);
            ArrayList arrayList = new ArrayList(q7h.U(c380VarA, 10));
            Iterator it = c380VarA.iterator();
            while (it.hasNext()) {
                arrayList.add(nmv0Var.b((String) it.next()));
            }
            for (String str2 : mqo1.A(arrayList)) {
                if (z) {
                    x340Var.i0(1503609544);
                    f(z4, str2, x340Var, qim0Var6);
                    x340Var.r(z4);
                    qim0Var4 = qim0Var5;
                    z3 = z4;
                    qim0Var3 = qim0Var6;
                    ss50Var = ss50Var;
                } else {
                    x340Var.i0(1503668878);
                    String strC = nmv0Var.c(str2);
                    boolean zEquals = str.equals(str2);
                    qim0 qim0Var7 = qim0Var5;
                    boolean zI = ((i3 & 896) == 256) | x340Var.i(ss50Var) | ((i3 & 7168) == 2048) | x340Var.g(str2);
                    Object objT = x340Var.T();
                    if (zI || objT == fkj0.X) {
                        qim0Var3 = qim0Var6;
                        z2 = false;
                        objT = new vvu0(ss50Var, iu30Var4, str2, iu30Var3, (byte) 11);
                        x340Var.s0(objT);
                    } else {
                        qim0Var3 = qim0Var6;
                        z2 = false;
                    }
                    qim0Var4 = qim0Var7;
                    z3 = z2;
                    c(0, strC, x340Var, (iu30) objT, null, zEquals);
                    x340Var.r(z3);
                }
                iu30Var4 = iu30Var2;
                ss50Var = ss50Var;
                z4 = z3;
                qim0Var5 = qim0Var4;
                i3 = i3;
                iu30Var3 = iu30Var;
                qim0Var6 = qim0Var3;
            }
            x340Var.r(z4);
            x340Var.r(true);
            qim0Var2 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(mmv0Var, str, iu30Var, iu30Var2, z, qim0Var2, i);
        }
    }

    public static final void j(float f, znb0 znb0Var, hob1 hob1Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(466366504);
        int i2 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.i(znb0Var) ? 32 : 16) | (x340Var.i(hob1Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarZ = uyn1.z(f, 0.0f, 2, qim0Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            maa maaVar = (maa) znb0Var.getValue();
            lfi0 lfi0Var = hob1Var.k;
            hfi0 hfi0VarM = bth.m(hob1Var, iu30Var);
            boolean z = hob1Var.A;
            int i3 = i2 & 57344;
            boolean z2 = i3 == 16384;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new msh0(iu30Var, (byte) 15);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z3 = i3 == 16384;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new msh0(iu30Var, (byte) 16);
                x340Var.s0(objT2);
            }
            otw.c(maaVar, lfi0.a(lfi0Var, (wcm) null, z, function0, (Function0) objT2, hfi0VarM, 26177535), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e0a(f, znb0Var, hob1Var, qim0Var, iu30Var, i);
        }
    }

    public static final void k(w9i1 w9i1Var, n9i1 n9i1Var, lzn0 lzn0Var, e490 e490Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object ku91Var;
        Function0 function2;
        tob1 tob1Var;
        boolean z;
        qim0 qim0Var3;
        boolean z2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(404785163);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(w9i1Var) ? 4 : 2) | (x340Var.i(n9i1Var) ? 32 : 16) | (x340Var.i(lzn0Var) ? 256 : 128) | (x340Var.e(e490Var.ordinal()) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(function1) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            Function0 function3 = hmb0.t1;
            if (z3) {
                x340Var.l(function3);
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
            x340Var.i0(912182609);
            tob1 tob1VarK = f4p1.k(w9i1Var.W0, (iac0) null, x340Var, 7);
            Boolean bool = (Boolean) tob1VarK.getValue();
            boolean zI = x340Var.i(tob1VarK) | x340Var.i(w9i1Var) | ((i2 & 57344) == 16384);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                function2 = function3;
                tob1Var = tob1VarK;
                ku91Var = new ku91(w9i1Var, function0, tob1Var, (lnm) null, (byte) 22);
                x340Var.s0(ku91Var);
            } else {
                ku91Var = objT;
                tob1Var = tob1VarK;
                function2 = function3;
            }
            qxd0.t(bool, x340Var, (vu30) ku91Var);
            if (u890.j((Boolean) tob1Var.getValue(), Boolean.FALSE)) {
                x340Var.r(false);
                qim0Var3 = qim0Var4;
                z = true;
            } else if (((Boolean) tob1Var.getValue()) == null) {
                x340Var.i0(912380791);
                qim0 qim0VarD2 = u291.d(qim0Var4, 1.0f);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function2);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                qim0Var3 = qim0Var4;
                z = true;
                xto1.e(null, 0, 0L, 0L, x340Var, 0, 15);
                us71.m(x340Var, true, false, false);
            } else {
                z = true;
                x340Var.i0(912498033);
                x340Var.r(false);
                if (w9i1Var.S0) {
                    x340Var.i0(912558793);
                    int i3 = i2 >> 6;
                    d7e.e(w9i1Var, e490Var, function0, function1, x340Var, (i2 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168));
                    x340Var.r(false);
                    z2 = false;
                    qim0Var3 = qim0Var4;
                } else {
                    x340Var.i0(912867801);
                    gon0 gon0VarQ4 = yon1.Q4(new mzn0[0], x340Var);
                    String str = w9i1Var.R0 ? "send_screen" : "topic_screen";
                    qim0 qim0VarD3 = u291.d(qim0Var4, 1.0f);
                    boolean zI2 = x340Var.i(n9i1Var) | x340Var.i(w9i1Var) | x340Var.i(lzn0Var) | x340Var.i(gon0VarQ4);
                    Object objT2 = x340Var.T();
                    if (zI2 || objT2 == m4cVar) {
                        e971 e971Var = new e971(n9i1Var, w9i1Var, lzn0Var, gon0VarQ4, (byte) 29);
                        x340Var.s0(e971Var);
                        objT2 = e971Var;
                    }
                    iu30 iu30Var = (iu30) objT2;
                    qim0Var3 = qim0Var4;
                    z2 = false;
                    jhc1.j(gon0VarQ4, str, qim0VarD3, (tl3) null, (iu30) null, (iu30) null, (iu30) null, (iu30) null, iu30Var, x340Var, 0);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                x340Var.r(z2);
            }
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0((Object) w9i1Var, (Object) n9i1Var, (Object) lzn0Var, (Object) e490Var, function0, function1, qim0Var2, i, (byte) 23);
        }
    }

    public static final qux l(o17 o17Var, b0k b0kVar) {
        akx akxVar;
        pux nuxVar;
        y5t0 y5t0VarB = o17Var.b();
        if (y5t0VarB instanceof y5t0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(1531474466);
            rk70 rk70Var = y5t0VarB.h;
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            boolean zE = x340Var.e(rk70Var.a);
            Object objT = x340Var.T();
            if (zE || objT == fkj0.X) {
                objT = context.getDrawable(rk70Var.a);
                x340Var.s0(objT);
            }
            Drawable drawable = (Drawable) objT;
            if (drawable != null) {
                x340Var.i0(-2055937809);
                jmr0 jmr0VarA = x7v.a(drawable, x340Var);
                uwr uwrVar = cbx.a;
                fwx fwxVarZ = hso1.z(jmr0VarA, new f2b(cbx.a(x340Var).b.b, 5), new i9h(cbx.a(x340Var).a.b.a()), false, x340Var, 520, 8);
                nuxVar = new pux(fwxVarZ, fwxVarZ);
                x340Var.r(false);
            } else {
                x340Var.i0(-2055635094);
                x340Var.r(false);
                box boxVar = box.c;
                nuxVar = new nux(boxVar, boxVar);
            }
            x340Var.r(false);
            return nuxVar;
        }
        if (!(y5t0VarB instanceof z5t0)) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(1531479191);
            x340Var2.r(false);
            box boxVar2 = box.c;
            return new nux(boxVar2, boxVar2);
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(1531477024);
        x340Var3.r(false);
        if (o17Var instanceof k07) {
            akxVar = akx.c;
        } else if ((o17Var instanceof l07) || (o17Var instanceof m07) || (o17Var instanceof n07)) {
            akxVar = nkx.c;
        } else if (o17Var instanceof p07) {
            akxVar = qkx.c;
        } else if (o17Var instanceof o07) {
            akxVar = pkx.c;
        } else if ((o17Var instanceof y07) || (o17Var instanceof z07)) {
            akxVar = grx.c;
        } else if ((o17Var instanceof e17) || (o17Var instanceof a17) || (o17Var instanceof t07)) {
            akxVar = mrx.c;
        } else if ((o17Var instanceof g17) || (o17Var instanceof h17)) {
            akxVar = ltx.c;
        } else if ((o17Var instanceof u07) || (o17Var instanceof m17)) {
            akxVar = bnx.c;
        } else if ((o17Var instanceof j17) || (o17Var instanceof l17)) {
            akxVar = ttx.c;
        } else if (o17Var instanceof b17) {
            akxVar = trx.c;
        } else if (o17Var instanceof c17) {
            akxVar = esx.c;
        } else if (o17Var instanceof n17) {
            akxVar = xtx.c;
        } else if (o17Var instanceof q07) {
            akxVar = ykx.c;
        } else {
            akxVar = o17Var instanceof r07 ? wlx.c : box.c;
        }
        return new nux(akxVar, akxVar);
    }

    public static final ConcurrentHashMap m(int i) {
        return new ConcurrentHashMap(i);
    }

    public static hoc1 n(String str) {
        return new hoc1(str, eio1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static o0g o(String str) throws XmlPullParserException, ParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!cpn1.x(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a((RuntimeException) null, "Couldn't find xmp metadata");
        }
        w280 w280Var = b380.b;
        bg11 bg11VarP = bg11.e;
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (cpn1.x(xmlPullParserNewPullParser, "rdf:Description")) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    String strS = cpn1.s(xmlPullParserNewPullParser, a[i2]);
                    if (strS != null) {
                        if (Integer.parseInt(strS) != 1) {
                            break loop0;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                String strS2 = cpn1.s(xmlPullParserNewPullParser, b[i3]);
                                if (strS2 != null) {
                                    j = Long.parseLong(strS2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i3++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i >= 2) {
                                w280 w280Var2 = b380.b;
                                bg11VarP = bg11.e;
                                break;
                            }
                            String strS3 = cpn1.s(xmlPullParserNewPullParser, c[i]);
                            if (strS3 != null) {
                                bg11VarP = b380.u(new dnm0(0L, 0L, "image/jpeg"), new dnm0(Long.parseLong(strS3), 0L, "video/mp4"));
                                break;
                            }
                            i++;
                        }
                    }
                }
                return null;
            }
            if (cpn1.x(xmlPullParserNewPullParser, "Container:Directory")) {
                bg11VarP = p(xmlPullParserNewPullParser, "Container", "Item");
            } else if (cpn1.x(xmlPullParserNewPullParser, "GContainer:Directory")) {
                bg11VarP = p(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!cpn1.v(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (bg11VarP.isEmpty()) {
            break loop0;
        }
        return new o0g(j, bg11VarP, (byte) 7);
        return null;
    }

    public static bg11 p(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        v280 v280VarM = b380.m();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (cpn1.x(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strS = cpn1.s(xmlPullParser, strConcat3);
                String strS2 = cpn1.s(xmlPullParser, strConcat4);
                String strS3 = cpn1.s(xmlPullParser, strConcat5);
                String strS4 = cpn1.s(xmlPullParser, strConcat6);
                if (strS == null || strS2 == null) {
                    return bg11.e;
                }
                v280VarM.c(new dnm0(strS3 != null ? Long.parseLong(strS3) : 0L, strS4 != null ? Long.parseLong(strS4) : 0L, strS));
            }
        } while (!cpn1.v(xmlPullParser, strConcat2));
        return v280VarM.g();
    }

    public static final void q(cir0 cir0Var) {
        cir0Var.c().a(l231.a);
    }

    public static final sfx r(vfx vfxVar) {
        return new sfx(vfxVar, (byte) 1);
    }

    public static String s(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        HashMap map = new HashMap();
        map.put("app_identifier", str);
        map.put("version_code", str2);
        map.put("version_name", str3);
        map.put("install_uuid", str4);
        map.put("delivery_mechanism", Integer.valueOf(i));
        if (str5 == null) {
            str5 = "";
        }
        map.put("development_platform", str5);
        if (str6 == null) {
            str6 = "";
        }
        map.put("development_platform_version", str6);
        return new JSONObject(map).toString();
    }

    public static String t(int i, int i2, long j, long j2, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        HashMap map = new HashMap();
        map.put("arch", Integer.valueOf(i));
        map.put("build_model", str);
        map.put("available_processors", Integer.valueOf(i2));
        map.put("total_ram", Long.valueOf(j));
        map.put("disk_space", Long.valueOf(j2));
        map.put("is_emulator", Boolean.valueOf(z));
        map.put("state", Integer.valueOf(i3));
        map.put("build_manufacturer", str2);
        map.put("build_product", str3);
        return new JSONObject(map).toString();
    }

    public static final n960 u(HighlightArtworkItem highlightArtworkItem) {
        String strN = highlightArtworkItem.n();
        int i = if60.c[highlightArtworkItem.p().ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3 && i == 4) {
                    i2 = 4;
                }
            }
        }
        return new n960(strN, i2);
    }

    public static void v(zcs0 zcs0Var, Parcel parcel) {
        parcel.writeStringArray(zcs0Var.a);
    }

    public static /* synthetic */ String w(int i, int i2, byte b2, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b2 + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }
}
