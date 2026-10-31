package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class i2p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(int i, b0k b0kVar, ziu ziuVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        iu30 iu30Var2;
        qim0 qim0Var2;
        ziu ziuVar2 = ziuVar;
        m4c m4cVar = fkj0.X;
        diu diuVar = ziuVar2.f;
        List list = diuVar.e;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1874002766);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(ziuVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= b0kVar2.i(iu30Var) ? 256 : 128;
        }
        if (b0kVar2.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean zB = diuVar.d.b.b();
            b0kVar2.i0(1325368870);
            String strO0 = diuVar.c.a;
            if (ihc1.y0(strO0)) {
                strO0 = cwl1.o0(b0kVar2, 2131951993);
            }
            b0kVar2.r(false);
            int i4 = i3;
            fwx fwxVarG = hso1.G(box.c, 0L, 0L, b0kVar2, box.d, 30);
            Float fS = aym.s(list);
            float fFloatValue = fS != null ? fS.floatValue() : 1.0f;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar2).f;
            cua cuaVar2 = cbx.b(b0kVar2).f;
            cr31 cr31VarD = er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = d7e.r(fFloatValue, u291.f(qim0Var3, 1.0f), false);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarR);
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
            qim0 qim0VarQ = i1p1.q(d7e.r(fFloatValue, u291.f(qim0Var3, 1.0f), false), cr31VarD);
            int i5 = i4 & 896;
            boolean z = i5 == 256;
            Object objT = b0kVar2.T();
            if (z || objT == m4cVar) {
                objT = new p1(iu30Var, (byte) 28);
                b0kVar2.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarQ, zB, null, null, null, (Function0) objT, 14);
            String strR = ila0.r(list);
            if (strR == null) {
                strR = "";
            }
            Uri uri = Uri.parse(strR);
            boolean z2 = i5 == 256;
            Object objT2 = b0kVar2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new qj(iu30Var, (byte) 15);
                b0kVar2.s0(objT2);
            }
            iu30 iu30Var3 = (iu30) objT2;
            boolean zI = (i5 == 256) | b0kVar2.i(ziuVar2);
            Object objT3 = b0kVar2.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new hq0(ziuVar2, iu30Var, (byte) 3);
                b0kVar2.s0(objT3);
            }
            iu30 iu30Var4 = (iu30) objT3;
            boolean z3 = i5 == 256;
            Object objT4 = b0kVar2.T();
            if (z3 || objT4 == m4cVar) {
                objT4 = new qj(iu30Var, (byte) 16);
                b0kVar2.s0(objT4);
            }
            float f = fFloatValue;
            qim0Var2 = qim0Var3;
            ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, fwxVarG, fwxVarG, false, false, (j6m) null, iu30Var3, iu30Var4, (iu30) objT4, 0L, b0kVar2, 2359296, 0, 102302);
            cbx.a.getClass();
            eso1.h(ni7VarA, new jsl(strO0), qim0VarX, (p3v) null, (zvx) null, new ecx(f), mif1.Q0, (tl3) null, (ColorFilter) null, b0kVar2, 24576, 392);
            b0kVar2 = b0kVar2;
            t1c.a(i1p1.q(dug.e(u291.c(u291.f(h2c.a.a(qim0Var2, graVar), 1.0f), 0.3f), v9c.s(p7h.M(new u7h[]{new u7h(((vex) zex.a.e).e), new u7h(u7h.j)}), 0.0f, 0.0f, 14), cr31VarD, 0.0f, 4), cr31VarD), b0kVar2, 0);
            ziuVar2 = ziuVar;
            iu30Var2 = iu30Var;
            gfx.b(18, apo.r(-1021757133, new zs((Object) ziuVar2, zB, (Object) iu30Var2, (byte) 2), b0kVar2), b0kVar2, 54);
            b0kVar2.r(true);
        } else {
            iu30Var2 = iu30Var;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kq0(ziuVar2, qim0Var2, iu30Var2, i);
        }
    }

    public static final void b(int i, boolean z, float f, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var;
        int i4;
        Function0 function2;
        fkx fkxVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-607462012);
        j06 j06Var = x340Var2.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var2.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var2.d(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var2.i(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var2.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var2.i(qim0Var) ? 131072 : 65536;
        }
        if (x340Var2.Y(i3 & 1, (74899 & i3) != 74898)) {
            uwr uwrVar = cbx.a;
            long jB = u7h.b(cbx.a(x340Var2).a.c, 0.54f, 0.0f, 0.0f, 0.0f, 14);
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarF = dug.f(qim0Var, jB, er31.b(16.0f));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            Function0 function3 = hmb0.t1;
            if (z2) {
                x340Var2.l(function3);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            String strO0 = cwl1.o0(x340Var2, 2131955527);
            int iC = l1d.C(i);
            if (iC == 0) {
                i4 = 2131955529;
            } else if (iC == 1) {
                i4 = 2131955528;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                i4 = 2131955530;
            }
            String strO1 = cwl1.o0(x340Var2, i4);
            nim0 nim0Var = nim0.a;
            int i5 = i3;
            qim0 qim0VarX = bin.x(nim0Var, false, null, null, null, function0, 15);
            mta mtaVar = cbx.b(x340Var2).d;
            float f2 = 56.0f * f;
            qim0 qim0VarR = u291.r(qim0VarX, f2);
            boolean zG = x340Var2.g(strO0) | x340Var2.g(strO1);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new ec21(strO0, strO1, (byte) 7);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarR, false, (iu30) objT);
            gra graVar = een.h;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB);
            x340Var2.m0();
            if (x340Var2.S) {
                function2 = function3;
                x340Var2.l(function2);
            } else {
                function2 = function3;
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            int iC2 = l1d.C(i);
            if (iC2 == 0) {
                fkxVar = ekx.c;
            } else if (iC2 == 1) {
                fkxVar = dkx.c;
            } else {
                if (iC2 != 2) {
                    eg.o();
                    return;
                }
                fkxVar = fkx.c;
            }
            zov0 zov0Var = cbx.b(x340Var2).g;
            w0h1.a(fkxVar, isl.a, u291.r(nim0Var, 24.0f * f), 0L, 0L, true, x340Var2, 196664, 24);
            x340Var2.r(true);
            String strO2 = cwl1.o0(x340Var2, 2131955531);
            qim0 qim0VarX2 = bin.x(nim0Var, false, null, null, null, function1, 15);
            mta mtaVar2 = cbx.b(x340Var2).d;
            qim0 qim0VarR2 = u291.r(qim0VarX2, f2);
            boolean zG2 = x340Var2.g(strO2) | ((i5 & 112) == 32);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new cl1(z, strO2, (byte) 27);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarB2 = s161.b(qim0VarR2, false, (iu30) objT2);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarB2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function2);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            uwo1.e(cwl1.o0(x340Var2, z ? 2131955533 : 2131955532), null, cbx.d(x340Var2).f, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2042);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w0e1(i, z, f, function0, function1, qim0Var, i2);
        }
    }

    public static final void c(chf0 chf0Var, boolean z, float f, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-824501388);
        int i2 = i | (b0kVar3.e(chf0Var.ordinal()) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.d(f) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new hii0(function0, (byte) 28);
                b0kVar3.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            kdx kdxVar = kdx.c;
            idx idxVar = new idx(6);
            gdx gdxVarS = yla.s(b0kVar3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            float f2 = 12.0f * f;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            float f3 = 8.0f * f;
            b0kVar2 = b0kVar3;
            foo1.d(z, iu30Var, kdxVar, null, idxVar, null, gdxVarS, new zzq0(f2, f3, f2, f3), null, null, null, null, apo.r(324833844, new gsc1(chf0Var, (byte) 12), b0kVar3), b0kVar2, (i2 >> 3) & 14, 384, 3880);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l3a(chf0Var, z, f, function0, i);
        }
    }

    public static final void d(ar9 ar9Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1155477357);
        int i2 = (x340Var.i(ar9Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            boolean zI = x340Var.i(c9nVar) | x340Var.i(ar9Var) | x340Var.i(ven0VarS);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new oo6(c9nVar, ar9Var, ven0VarS, (byte) 8);
                x340Var.s0(objT2);
            }
            cso1.m(ar9Var, null, (iu30) objT2, x340Var, i2 & 14);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8(ar9Var, iu30Var, i, (byte) 4);
        }
    }

    public static final void e(Context context, t3z0 t3z0Var, Bitmap bitmap, Bitmap bitmap2, u380 u380Var, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        qim0 qim0Var2;
        vu30 vu30Var;
        qim0 qim0Var3;
        boolean z2;
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1386892986);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.i(context) ? 4 : 2) | (x340Var.i(t3z0Var) ? 32 : 16) | (x340Var.i(bitmap) ? 256 : 128) | (x340Var.i(bitmap2) ? 2048 : 1024) | (x340Var.g(u380Var) ? 16384 : 8192) | 196608 | (x340Var.h(z) ? 1048576 : 524288);
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            float f = z ? 180.0f : 240.0f;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = z ? u291.f(qim0Var4, 1.0f) : u291.d(qim0Var4, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            String str = null;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            vu30 vu30Var2 = y580.N0;
            nko1.H(xos0VarM, x340Var, vu30Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar2);
            nko1.F(x340Var);
            llj lljVar3 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar3);
            String str2 = t3z0Var.b;
            if (str2 != null && str2.length() != 0) {
                str = str2;
            }
            String str3 = str;
            if (str3 == null) {
                x340Var.i0(315593511);
                z2 = false;
                x340Var.r(false);
                vu30Var = vu30Var2;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.i0(315593512);
                vu30Var = vu30Var2;
                qim0Var3 = qim0Var4;
                lzj.b((i3 >> 12) & 896, 2, str3, x340Var, (qim0) null, z);
                x340Var = x340Var;
                z2 = false;
                x340Var.r(false);
            }
            pbh pbhVar = pbh.a;
            if (z) {
                x340Var.i0(315667199);
                op71.g(x340Var, u291.r(qim0Var3, 16.0f));
                x340Var.r(z2);
                i2 = 1;
            } else {
                x340Var.i0(315735306);
                i2 = 1;
                op71.g(x340Var, pbhVar.a(1.0f, qim0Var3, true));
                x340Var.r(z2);
            }
            cua cuaVar = cbx.b(x340Var).f;
            se11 se11Var = lzj.a;
            qim0 qim0VarR = u291.r(exd0.q(qim0Var3, new rs7(i2, (byte) 27)), f);
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarR, er31.b(8.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarQ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, vu30Var);
            x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar3);
            int i4 = i3 >> 3;
            h(context, bitmap, bitmap2, u380Var, u291.d(qim0Var3, 1.0f), x340Var, (i3 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168));
            x340Var.r(true);
            if (z) {
                x340Var.i0(316315967);
                op71.g(x340Var, u291.r(qim0Var3, 16.0f));
                x340Var.r(false);
            } else {
                x340Var.i0(316384074);
                op71.g(x340Var, pbhVar.a(1.0f, qim0Var3, true));
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
            h311VarV.d = new uu((Object) context, (Object) t3z0Var, (Object) bitmap, (Object) bitmap2, (p280) u380Var, qim0Var2, z, i, (byte) 8);
        }
    }

    public static final void f(rm71 rm71Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2117307554);
        int i2 = (x340Var.g(rm71Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x8c0 lifecycle = ((iac0) x340Var.k(jfe0.a)).getLifecycle();
            ven0 ven0VarS = v8r.s(rm71Var, x340Var);
            boolean zG = x340Var.g(ven0VarS) | x340Var.i(lifecycle);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new he3(lifecycle, ven0VarS, (byte) 3);
                x340Var.s0(objT);
            }
            qxd0.i(lifecycle, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dj71(rm71Var, i, (byte) 2);
        }
    }

    public static final void g(chf0 chf0Var, int i, boolean z, iu30 iu30Var, Function0 function0, Function0 function1, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(8013651);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.e(chf0Var.ordinal()) ? 4 : 2) | (x340Var.e(l1d.C(i)) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(function1) ? 131072 : 65536);
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            float fO = yoi1.o(((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp / 360.0f, 1.0f, 1.5f);
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f * fO, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            x340Var.i0(-873135411);
            d7 d7Var = new d7(chf0.f, (byte) 0);
            while (d7Var.hasNext()) {
                chf0 chf0Var2 = (chf0) d7Var.next();
                boolean z3 = chf0Var2 == chf0Var;
                boolean zE = ((i3 & 7168) == 2048) | x340Var.e(chf0Var2.ordinal());
                Object objT = x340Var.T();
                if (zE || objT == fkj0.X) {
                    objT = new x0e1(iu30Var, chf0Var2, (byte) 0);
                    x340Var.s0(objT);
                }
                c(chf0Var2, z3, fO, (Function0) objT, x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
            uwr uwrVar2 = cbx.a;
            b(i, z, fO, function0, function1, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.a, 7), x340Var, (i3 >> 3) & 64638);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(chf0Var, i, z, iu30Var, function0, function1, i2);
        }
    }

    public static final void h(Context context, Bitmap bitmap, Bitmap bitmap2, u380 u380Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        mkb mkbVar;
        Object obj;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2019918780);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(bitmap) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(bitmap2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(u380Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            float fX0 = ((wat) x340Var.k(t4k.h)).X0(60.0f);
            boolean zG = x340Var.g(bitmap);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                obj = objT;
                Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                bitmapCopy.getClass();
                RenderScript renderScriptCreate = RenderScript.create(context);
                try {
                    if (fX0 <= 25.0f) {
                        mkbVar = new mkb(1, fX0);
                    } else {
                        int iCeil = (int) Math.ceil((float) Math.pow(fX0 / 25.0f, 2.0d));
                        mkbVar = new mkb(iCeil, fX0 / ((float) Math.sqrt(iCeil)));
                    }
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCopy);
                    Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                    int i3 = mkbVar.a;
                    int i4 = 0;
                    Allocation allocation = allocationCreateFromBitmap;
                    Allocation allocation2 = allocationCreateTyped;
                    while (i4 < i3) {
                        if (i4 > 0) {
                            Allocation allocation3 = allocation2;
                            allocation2 = allocation;
                            allocation = allocation3;
                        }
                        scriptIntrinsicBlurCreate.setRadius(mkbVar.b);
                        scriptIntrinsicBlurCreate.setInput(allocation);
                        scriptIntrinsicBlurCreate.forEach(allocation2);
                        i4++;
                        allocation = allocation;
                        allocation2 = allocation2;
                    }
                    allocation2.copyTo(bitmapCopy);
                    allocation.destroy();
                    allocation2.destroy();
                    scriptIntrinsicBlurCreate.destroy();
                    renderScriptCreate.destroy();
                    x340Var.s0(bitmapCopy);
                    obj = bitmapCopy;
                } catch (Throwable th) {
                    renderScriptCreate.destroy();
                    throw th;
                }
            }
            Bitmap bitmap3 = (Bitmap) obj;
            boolean zI = x340Var.i(bitmap) | ((i2 & 7168) == 2048) | x340Var.i(bitmap3) | x340Var.i(bitmap2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                lhx lhxVar = new lhx(u380Var, bitmap, bitmap3, bitmap2, (byte) 20);
                x340Var.s0(lhxVar);
                objT2 = lhxVar;
            }
            t1c.a(exd0.s(qim0Var, (iu30) objT2), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 19, i, context, bitmap, bitmap2, u380Var, qim0Var);
        }
    }

    public static final int i(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 2131963752;
        }
        if (iC == 1) {
            return 2131963750;
        }
        if (iC == 2) {
            return 2131963751;
        }
        if (iC == 3) {
            return 2131963753;
        }
        eg.o();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    public static final ArrayList j(kak0 kak0Var) {
        int iMin;
        int iIntValue;
        ruq0 ruq0Var;
        ruq0 ruq0Var2;
        lhg1 lhg1Var = kak0Var.h;
        int i = kak0Var.b1;
        int i2 = kak0Var.a1;
        lhg1 lhg1Var2 = kak0Var.Q0;
        Integer num = (lhg1Var2 == null || (ruq0Var2 = lhg1Var2.b) == null) ? null : ruq0Var2.N0;
        Integer num2 = lhg1Var.b.N0;
        ruq0 ruq0Var3 = j2p1.r(kak0Var).b;
        Integer num3 = ruq0Var3.N0;
        ArrayList arrayList = z6x.a;
        if (num3 == null || (iIntValue = num3.intValue()) <= 0) {
            num = num;
        } else {
            int i3 = ruq0Var3.X;
            if (i3 / iIntValue <= 0) {
                num = num;
            } else {
                long j = kak0Var.d1;
                Long lValueOf = Long.valueOf(j);
                if (j <= 0) {
                    lValueOf = null;
                }
                long j2 = kak0Var.e1;
                Long lValueOf2 = Long.valueOf(j2);
                if (j2 <= 0) {
                    lValueOf2 = null;
                }
                Integer num4 = lhg1Var.b.N0;
                Integer num5 = (lhg1Var2 == null || (ruq0Var = lhg1Var2.b) == null) ? null : ruq0Var.N0;
                int i4 = kak0Var.Y0;
                List list = c2t.a;
                Set set = c2t.b;
                float f = kak0Var.c1;
                if ((num3.intValue() > 0 ? num3 : null) != null) {
                    int iMin2 = Math.min(i4, Math.min((int) ((lValueOf != null ? lValueOf.longValue() : Long.MAX_VALUE) * f), (int) (f * (lValueOf2 != null ? lValueOf2.longValue() : Long.MAX_VALUE)))) / (i3 / num3.intValue());
                    if (iMin2 > i2) {
                        iMin2 = i2;
                    }
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        int iIntValue2 = ((Number) obj).intValue();
                        if ((iIntValue2 <= iMin2 && !set.contains(Integer.valueOf(iIntValue2))) || ((num5 != null && iIntValue2 == num5.intValue()) || (num4 != null && iIntValue2 == num4.intValue()))) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    num = num;
                }
                List listV = v(arrayList, kak0Var);
                arrayList = new ArrayList();
                for (Object obj2 : listV) {
                    if (t(kak0Var, ((Number) obj2).intValue()) != null) {
                        arrayList.add(obj2);
                    }
                }
            }
        }
        List list2 = c2t.a;
        Set set2 = c2t.b;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iMin = numValueOf.intValue();
        } else {
            Integer num6 = (Integer) o7h.D0(arrayList);
            iMin = Math.min(num6 != null ? num6.intValue() : 0, i2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            int iIntValue3 = ((Number) obj3).intValue();
            if ((iIntValue3 <= iMin && !set2.contains(Integer.valueOf(iIntValue3))) || ((num != null && iIntValue3 == num.intValue()) || (num2 != null && iIntValue3 == num2.intValue()))) {
                arrayList2.add(obj3);
            }
        }
        List listV2 = v(arrayList2, kak0Var);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : listV2) {
            if (t(kak0Var, ((Number) obj4).intValue()) != null) {
                arrayList3.add(obj4);
            }
        }
        return arrayList3;
    }

    public static qsg k(HandlerThread handlerThread) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (u890.j(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            eg.m("eglGetDisplay failed");
            return null;
        }
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0)) {
            eg.m("eglInitialize failed");
            return null;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            eg.m("eglChooseConfig failed");
            return null;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        eGLConfig.getClass();
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        if (u890.j(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
            eg.m("eglCreateContext failed");
            return null;
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        if (u890.j(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
            eg.m("eglCreatePbufferSurface failed");
            return null;
        }
        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        surfaceTexture.setDefaultBufferSize(1, 1);
        surfaceTexture.setOnFrameAvailableListener(new psg(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), new Handler(handlerThread.getLooper()));
        Logger.g("PlaceholderSurface created", new Object[0]);
        eGLDisplayEglGetDisplay.getClass();
        eGLContextEglCreateContext.getClass();
        eGLSurfaceEglCreatePbufferSurface.getClass();
        return new qsg(surfaceTexture, eGLDisplayEglGetDisplay, eGLContextEglCreateContext, eGLSurfaceEglCreatePbufferSurface, handlerThread);
    }

    public static final boolean l(long j, long j2) {
        return j == j2;
    }

    public static int m(long j) {
        return Long.hashCode(j);
    }

    public static final io80 n(klm klmVar, idp0 idp0Var, idp0 idp0Var2) {
        return klmVar.b("PreviewPlaybackMetadataClientFacadeService", new ocp0(idp0Var, idp0Var2, (byte) 4));
    }

    public static final boolean o(kak0 kak0Var, ruq0 ruq0Var) {
        Integer num = ruq0Var.N0;
        int i = ruq0Var.X;
        if (kak0Var.S0.a.a == b8w0.b) {
            return true;
        }
        if (i < 0) {
            return false;
        }
        if (!ruq0Var.O0 && num == null && i <= kak0Var.Z0) {
            return true;
        }
        int i2 = kak0Var.Y0;
        float f = kak0Var.c1;
        int i3 = kak0Var.d1;
        Integer numValueOf = Integer.valueOf(i3);
        if (i3 <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? (int) (numValueOf.intValue() * f) : Integer.MAX_VALUE;
        int i4 = kak0Var.e1;
        Integer numValueOf2 = i4 > 0 ? Integer.valueOf(i4) : null;
        if (i <= Math.min(i2, Math.min(iIntValue, numValueOf2 != null ? (int) (numValueOf2.intValue() * f) : Integer.MAX_VALUE)) && (num == null || num.intValue() <= kak0Var.a1)) {
            return true;
        }
        List<lhg1> listI0 = f46.i0(new lhg1[]{kak0Var.h, kak0Var.Q0});
        if (listI0.isEmpty()) {
            return false;
        }
        for (lhg1 lhg1Var : listI0) {
            if (u890.j(num, lhg1Var.b.N0) && i <= lhg1Var.b.X) {
                return true;
            }
        }
        return false;
    }

    public static boolean p(kak0 kak0Var) {
        return o(kak0Var, kak0Var.S0.b);
    }

    public static void q() {
        Trace.endSection();
    }

    public static void r(String str) {
        Trace.beginSection(str);
    }

    public static void s(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        Integer num = (i & 4) != 0 ? null : 2;
        Handler handlerB = fmv.Z.b();
        if (num == null) {
            context.registerReceiver(broadcastReceiver, intentFilter, null, handlerB);
        } else {
            x74.g0(context, broadcastReceiver, intentFilter, handlerB, num.intValue());
        }
    }

    public static final ruq0 t(kak0 kak0Var, int i) {
        ruq0 ruq0Var = kak0Var.S0.b;
        Integer num = ruq0Var.N0;
        int iIntValue = num != null ? num.intValue() : 4;
        if (i <= 0 || iIntValue <= 0) {
            return null;
        }
        long j = (((long) ruq0Var.X) / ((long) iIntValue)) * ((long) i);
        if (1 > j || j >= 2147483648L) {
            return null;
        }
        ruq0 ruq0VarA = ruq0.a(ruq0Var, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (int) j, (Float) null, (Float) null, Integer.valueOf(i), false, 0.0f, 0.0f, 0.0d, 0.0d, 515071);
        if (o(kak0Var, ruq0VarA)) {
            return ruq0VarA;
        }
        return null;
    }

    public static final vhc1 u(hwq hwqVar) {
        thc1 thc1Var;
        j7e0 j7e0Var = hwqVar.g;
        if (!(j7e0Var instanceof j7e0)) {
            return new uhc1(j7e0Var.getUri(), j7e0Var.a());
        }
        j7e0 j7e0Var2 = j7e0Var;
        String str = j7e0Var2.c;
        int i = hwqVar.a;
        String str2 = j7e0Var2.b;
        zuc0 zuc0Var = j7e0Var2.a;
        x4i1 x4i1Var = zuc0Var.d;
        int i2 = zuc0Var.b;
        pc41 pc41Var = zuc0Var.h;
        boolean z = zuc0Var.m;
        dwq dwqVar = hwqVar.e;
        if (dwqVar != null) {
            int i3 = i + 1;
            String str3 = dwqVar.a;
            String str4 = dwqVar.b;
            if (str4 == null) {
                str4 = "";
            }
            thc1Var = new thc1(i3, (x4i1) null, 0, str3, str4, (pc41) null, (thc1) null, false, z6x.a, dwqVar.d);
        } else {
            thc1Var = null;
        }
        return new thc1(i, x4i1Var, i2, str2, str, pc41Var, thc1Var, z, zuc0Var.f, zuc0Var.g);
    }

    public static final List v(List list, kak0 kak0Var) {
        ruq0 ruq0Var;
        List list2 = list;
        Integer num = kak0Var.h.b.N0;
        lhg1 lhg1Var = kak0Var.Q0;
        List listI0 = f46.i0(new Integer[]{num, (lhg1Var == null || (ruq0Var = lhg1Var.b) == null) ? null : ruq0Var.N0});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI0) {
            if (((Number) obj).intValue() > 0) {
                arrayList.add(obj);
            }
        }
        return o7h.Z0(o7h.j0(o7h.N0(arrayList, list2)));
    }
}
