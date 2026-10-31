package p;

import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class p9p1 {
    public static b180 a;
    public static b180 b;

    public static final void A(RecyclerView recyclerView) {
        recyclerView.setTag(2131429681, Boolean.TRUE);
    }

    public static void B(Activity activity) {
        View viewK;
        int iHashCode = activity.hashCode();
        HashMap map = tck1.d;
        HashMap map2 = null;
        if (!dhn.a.contains(tck1.class)) {
            try {
                map2 = tck1.d;
            } catch (Throwable th) {
                dhn.a(tck1.class, th);
            }
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object tck1Var = map2.get(numValueOf);
        if (tck1Var == null) {
            tck1Var = new tck1(activity);
            map2.put(numValueOf, tck1Var);
        }
        tck1 tck1Var2 = (tck1) tck1Var;
        Set set = dhn.a;
        if (set.contains(tck1.class)) {
            return;
        }
        try {
            if (set.contains(tck1Var2)) {
                return;
            }
            try {
                if (!tck1Var2.c.getAndSet(true) && (viewK = jm5.k((Activity) tck1Var2.a.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewK.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(tck1Var2);
                        tck1Var2.a();
                        return;
                    }
                    return;
                    dhn.a(tck1.class, th);
                }
            } catch (Throwable th2) {
                dhn.a(tck1Var2, th2);
            }
        } catch (Throwable th3) {
            dhn.a(tck1.class, th3);
        }
    }

    public static void C(Activity activity) {
        View viewK;
        int iHashCode = activity.hashCode();
        HashMap map = tck1.d;
        HashMap map2 = null;
        if (!dhn.a.contains(tck1.class)) {
            try {
                map2 = tck1.d;
            } catch (Throwable th) {
                dhn.a(tck1.class, th);
            }
        }
        tck1 tck1Var = (tck1) map2.remove(Integer.valueOf(iHashCode));
        if (tck1Var != null) {
            Set set = dhn.a;
            if (set.contains(tck1.class)) {
                return;
            }
            try {
                if (!set.contains(tck1Var)) {
                    try {
                        if (tck1Var.c.getAndSet(false) && (viewK = jm5.k((Activity) tck1Var.a.get())) != null) {
                            ViewTreeObserver viewTreeObserver = viewK.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(tck1Var);
                            }
                        }
                    } catch (Throwable th2) {
                        dhn.a(tck1Var, th2);
                    }
                }
            } catch (Throwable th3) {
                dhn.a(tck1.class, th3);
            }
        }
    }

    public static final void a(g431 g431Var, yx1 yx1Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        g431 g431Var2;
        tbr0 tbr0VarC;
        Object c6Var;
        ven0 ven0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1405835772);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(g431Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(yx1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= x340Var.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            if (g431Var != null) {
                x340Var.i0(1906532147);
                tbr0VarC = ((cir0) x340Var.k(k2r0.a)).c();
                x340Var.r(false);
            } else {
                x340Var.i0(-1027025095);
                x340Var.r(false);
                tbr0VarC = null;
            }
            ven0 ven0VarS = v8r.s(tbr0VarC, x340Var);
            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                x340Var.i0(-1026914424);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = new ma0(ven0Var2, (byte) 8);
                    x340Var.s0(objT2);
                }
                oho1.l((Function0) objT2, x340Var, 6);
                x340Var.r(false);
            } else {
                x340Var.i0(-1026831778);
                x340Var.r(false);
            }
            ven0 ven0VarS2 = v8r.s(iu30Var, x340Var);
            boolean zG = x340Var.g(g431Var);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            ven0 ven0Var3 = (ven0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q((Object) null);
                x340Var.s0(objT4);
            }
            ven0 ven0Var4 = (ven0) objT4;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zI = x340Var.i(g431Var) | ((i2 & 896) == 256) | x340Var.g(ven0VarS2);
            Object objT5 = x340Var.T();
            if (zI || objT5 == m4cVar) {
                c6Var = new c6(ven0Var4, g431Var, z2, ven0VarS2, (lnm) null);
                ven0Var = ven0Var4;
                g431Var2 = g431Var;
                x340Var.s0(c6Var);
            } else {
                g431Var2 = g431Var;
                c6Var = objT5;
                ven0Var = ven0Var4;
            }
            qxd0.s(g431Var2, boolValueOf, (vu30) c6Var, x340Var);
            boolean zI2 = x340Var.i(yx1Var) | x340Var.g(ven0Var3) | x340Var.g(ven0VarS);
            Object objT6 = x340Var.T();
            if (zI2 || objT6 == m4cVar) {
                el0 el0Var = new el0((byte) 1, yx1Var, ven0Var, ven0Var2, ven0Var3, ven0VarS, (lnm) null);
                x340Var.s0(el0Var);
                objT6 = el0Var;
            }
            qxd0.t(g431Var2, x340Var, (vu30) objT6);
        } else {
            g431Var2 = g431Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(g431Var2, yx1Var, z, iu30Var, i, (byte) 2);
        }
    }

    public static final void b(qim0 qim0Var, int i, int i2, b0k b0kVar, int i3, int i4) {
        int i5;
        qim0 qim0Var2;
        int i6;
        int i7;
        int i8;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1750142026);
        int i9 = i4 & 1;
        int i10 = 4;
        int i11 = 2;
        if (i9 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (x340Var.i(qim0Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i12 = i4 & 2;
        if (i12 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 32 : 16;
        }
        int i13 = i4 & 4;
        if (i13 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= x340Var.e(i2 != 0 ? l1d.C(i2) : -1) ? 256 : 128;
        }
        if (x340Var.Y(i5 & 1, (i5 & 147) != 146)) {
            qim0 qim0Var3 = i9 != 0 ? nim0.a : qim0Var;
            int i14 = i12 != 0 ? 1 : i;
            i7 = i13 != 0 ? 2 : i2;
            String strO0 = cwl1.o0(x340Var, 2131961274);
            int iC = l1d.C(i14);
            if (iC == 0) {
                i8 = i10;
            } else if (iC == 1) {
                i8 = 0;
            } else if (iC != 2) {
                eg.o();
                return;
            } else {
                i10 = 18;
                i8 = i10;
            }
            int iC2 = l1d.C(i7);
            if (iC2 == 0) {
                i11 = 1;
            } else if (iC2 != 1) {
                eg.o();
                return;
            }
            if (i8 != 0) {
                x340Var.i0(1873708254);
                qim0 qim0Var4 = qim0Var3;
                suo1.f(strO0, i8, qim0Var4, i11, x340Var, (i5 << 6) & 896, 8);
                qim0Var3 = qim0Var4;
                x340Var.r(false);
            } else {
                x340Var.i0(1873802835);
                suo1.d(i11, (i5 << 3) & 112, 4, strO0, x340Var, qim0Var3);
                x340Var.r(false);
            }
            i6 = i14;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            i6 = i;
            i7 = i2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fma(qim0Var2, i6, i7, i3, i4);
        }
    }

    public static final void c(g2c g2cVar, adj1 adj1Var, iu30 iu30Var, boolean z, b0k b0kVar, int i) {
        int i2;
        vu30 vu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(499379973);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(g2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(adj1Var) : x340Var.i(adj1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.e(0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z) ? 16384 : 8192;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            w0o1.d(2, apo.r(1104264353, new okg(adj1Var, (byte) 11), x340Var), x340Var, 54);
            x340Var.i0(-737633558);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N(czd1.d, g2cVar.b(nim0Var));
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new thh(iu30Var, (byte) 18);
                x340Var.s0(objT);
            }
            op71.g(x340Var, bin.x(qim0VarN, false, null, null, null, (Function0) objT, 15));
            if (x340Var.k(ibj1.f) == h44.b) {
                x340Var.i0(-737325201);
                qim0 qim0VarA = g2cVar.a(u291.B(nim0Var, (gra) null, 3), een.h);
                boolean z3 = i4 == 256;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new thh(iu30Var, (byte) 19);
                    x340Var.s0(objT2);
                }
                o(g2cVar, adj1Var, qim0VarA, (Function0) objT2, x340Var, i3 & 126);
                x340Var.r(false);
            } else {
                x340Var.i0(-737127235);
                x340Var.r(false);
            }
            x340Var.r(false);
            qim0 qim0VarB = g2cVar.b(nim0Var);
            mbh mbhVarA = jbh.a(h36.g, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            x340Var.i0(-707382714);
            int i5 = i3 & 896;
            boolean z4 = i5 == 256;
            Object objT3 = x340Var.T();
            if (z4 || objT3 == m4cVar) {
                objT3 = new thh(iu30Var, (byte) 20);
                x340Var.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            boolean z5 = i5 == 256;
            Object objT4 = x340Var.T();
            if (z5 || objT4 == m4cVar) {
                objT4 = new thh(iu30Var, (byte) 21);
                x340Var.s0(objT4);
            }
            Function0 function1 = (Function0) objT4;
            if (z) {
                x340Var.i0(-707180811);
                vu30 vu30VarR = apo.r(638872300, new tth(adj1Var, iu30Var, (byte) 0), x340Var);
                x340Var.r(false);
                vu30Var = vu30VarR;
            } else {
                x340Var.i0(-707083471);
                x340Var.r(false);
                vu30Var = null;
            }
            f(function0, function1, vu30Var, x340Var, 0, 0);
            x340Var = x340Var;
            x340Var.r(false);
            x340Var.i0(1362672360);
            boolean z6 = (i3 & 896) == 256;
            Object objT5 = x340Var.T();
            if (z6 || objT5 == m4cVar) {
                objT5 = new thh(iu30Var, (byte) 22);
                x340Var.s0(objT5);
            }
            b9p1.e(adj1Var, (Function0) objT5, null, 0, x340Var, (i3 >> 3) & 14, 12);
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(g2cVar, adj1Var, iu30Var, z, i, (byte) 11);
        }
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(66612764);
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            qim0 qim0VarL0 = cwl1.l0(dug.f(qim0Var, u7h.b(cbx.a(x340Var).a.a.a(), 0.7f, 0.0f, 0.0f, 0.0f, 14), cr31VarB), cbx.a(x340Var).c.a, cr31VarB, 12);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarL0);
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
            uwo1.e(cwl1.o0(x340Var, 2131956706), null, cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 11);
        }
    }

    public static final void e(adj1 adj1Var, iu30 iu30Var, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        x340 x340Var;
        boolean z2;
        boolean zBooleanValue;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(752407554);
        int i2 = i | (x340Var2.g(adj1Var) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.i(qim0Var) ? 256 : 128) | (x340Var2.e(0) ? 2048 : 1024) | 8192;
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var2.d0();
            if ((i & 1) == 0 || x340Var2.E()) {
                zBooleanValue = ((Boolean) x340Var2.k(ibj1.e)).booleanValue();
            } else {
                x340Var2.b0();
                zBooleanValue = z;
            }
            x340Var2.s();
            x340Var2.i0(-460272666);
            x340Var2.r(false);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            z2 = zBooleanValue;
            cwl1.b(nim0.a, (tl3) null, er31.b(16.0f), (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(581793253, new o3((Object) adj1Var, (Object) iu30Var, zBooleanValue, (byte) 9), x340Var2), x340Var2, 0, 48, 2026);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            z2 = z;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(adj1Var, iu30Var, qim0Var, z2, i, (byte) 16);
        }
    }

    public static final void f(Function0 function0, Function0 function1, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1110926380);
        int i5 = (x340Var.i(function0) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
        } else {
            i3 = i5 | (x340Var.i(function1) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 384;
        } else {
            i4 = i3 | (x340Var.i(vu30Var) ? 256 : 128);
        }
        byte b2 = 0;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            if (i6 != 0) {
                function1 = null;
            }
            if (i7 != 0) {
                vu30Var = null;
            }
            gfx.b(18, apo.r(-260053599, new uth(function1, vu30Var, function0, b2), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        Function0 function2 = function1;
        vu30 vu30Var2 = vu30Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vth(function0, function2, vu30Var2, i, i2, (byte) 0);
        }
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1543391073);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            j1e1.f((qim0) null, 0L, x340Var, 0, 3);
            xto1.e(h2c.a.a(qim0Var2, een.h), 5, 0L, 0L, x340Var, 48, 12);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 9);
        }
    }

    public static final void h(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(177911094);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            ldx ldxVar = ldx.c;
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ukf(function0, (byte) 28);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            gdx gdxVarS = yla.s(x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            wro1.h(gbxVar, ldxVar, dug.f(u291.r(uyn1.A(nim0.a, 8.0f, 8.0f, 0.0f, 8.0f), cbx.b(x340Var).b.d), cbx.a(x340Var).a.c, er31.a), null, gdxVarS, null, false, null, null, udi.a, x340Var, 0, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wm(function0, i, (byte) 27);
        }
    }

    public static final void i(adj1 adj1Var, iu30 iu30Var, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(720893784);
        int i2 = (x340Var.g(adj1Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new thh(iu30Var, (byte) 23);
                x340Var.s0(objT);
            }
            kp0 kp0VarG = adj1Var.g((Function0) objT, true, z);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qp0.a(kp0VarG, uyn1.x(nim0.a, 8.0f), x340Var, 0, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wth(adj1Var, iu30Var, z, i, (byte) 0);
        }
    }

    public static final void j(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1664097337);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            k(54, apo.r(-1183219574, new z3y(str, (byte) 7), x340Var), x340Var);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var, i, (byte) 29);
        }
    }

    public static final void k(int i, j2i j2iVar, b0k b0kVar) {
        int i2;
        b0k b0kVar2;
        j2i j2iVar2 = j2iVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1217230658);
        int i3 = i & 6;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 = (b0kVar3.i(nim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(j2iVar2) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = m830.t;
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("FootnoteSettingRow", s161.b(qim0VarF, true, (iu30) objT)), null, null, false, null, null, null, null, null, null, null, null, null, null, null, j2iVar, b0kVar2, 0, (i2 << 12) & 458752, 32766);
            j2iVar2 = j2iVar;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bf6(j2iVar2, i, (byte) 6);
        }
    }

    public static final void l(af5 af5Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1508948193);
        int i2 = (x340Var.i(af5Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            k(54, apo.r(20225968, new pf1(af5Var, (byte) 6), x340Var), x340Var);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gnj(af5Var, qim0Var, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:53:0x0173  */
    /* JADX WARN: Code duplicated, block: B:54:0x0191  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void m(so80 so80Var, iu30 iu30Var, qim0 qim0Var, boolean z, b0k b0kVar, int i, int i2) {
        boolean z2;
        boolean z3;
        x340 x340Var;
        boolean z4;
        qim0 qim0Var2;
        h311 h311VarV;
        qim0 qim0Var3;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objT;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1571445724);
        int i3 = (x340Var2.g(so80Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i4 |= x340Var2.h(z2) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var2.Y(i4 & 1, z3)) {
                if (i5 != 0) {
                    z2 = false;
                }
                qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarF);
                hzj.A.getClass();
                if (x340Var2.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                cvx cvxVar4 = cbx.b(x340Var2).b;
                uvx uvxVar = new uvx(0, (pgx) null, 0, new zzq0(16.0f, 12.0f, 16.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503);
                if ((i4 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i4 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z5 | z6;
                objT = x340Var2.T();
                if (z7 || objT == fkj0.X) {
                    objT = new x680(iu30Var, so80Var, (byte) 4);
                    x340Var2.s0(objT);
                }
                jto1.b(qim0VarF2, uvxVar, null, false, null, null, new gbx(z50.c, (Function0) objT), null, null, apo.r(-1739577005, new to80(so80Var, (byte) 0), x340Var2), null, apo.r(-1283304078, new to80(so80Var, (byte) 1), x340Var2), null, null, null, apo.r(-1973999634, new to80(so80Var, (byte) 2), x340Var2), x340Var2, 805306438, 196656, 30140);
                x340Var = x340Var2;
                if (z2) {
                    x340Var.i0(-1383902279);
                    d(uyn1.B(h2c.a.b(qim0Var3), 0.0f, 4.0f, 0.0f, 0.0f, 13), x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1383810984);
                    x340Var.r(false);
                }
                x340Var.r(true);
                z4 = z2;
                qim0Var2 = qim0Var3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                z4 = z2;
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new uo80(so80Var, iu30Var, qim0Var2, z4, i, i2);
            }
        }
        i4 = i3 | 3456;
        z2 = z;
        if ((i4 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var2.Y(i4 & 1, z3)) {
            if (i5 != 0) {
                z2 = false;
            }
            qim0Var3 = nim0.a;
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            gfh0VarC = t1c.c(een.d, false);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarF3);
            hzj.A.getClass();
            if (x340Var2.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar5 = cbx.b(x340Var2).b;
            cvx cvxVar6 = cbx.b(x340Var2).b;
            cvx cvxVar7 = cbx.b(x340Var2).b;
            cvx cvxVar8 = cbx.b(x340Var2).b;
            uvx uvxVar2 = new uvx(0, (pgx) null, 0, new zzq0(16.0f, 12.0f, 16.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503);
            if ((i4 & 112) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i4 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z5 | z6;
            objT = x340Var2.T();
            if (z7) {
                objT = new x680(iu30Var, so80Var, (byte) 4);
                x340Var2.s0(objT);
            } else {
                objT = new x680(iu30Var, so80Var, (byte) 4);
                x340Var2.s0(objT);
            }
            jto1.b(qim0VarF4, uvxVar2, null, false, null, null, new gbx(z50.c, (Function0) objT), null, null, apo.r(-1739577005, new to80(so80Var, (byte) 0), x340Var2), null, apo.r(-1283304078, new to80(so80Var, (byte) 1), x340Var2), null, null, null, apo.r(-1973999634, new to80(so80Var, (byte) 2), x340Var2), x340Var2, 805306438, 196656, 30140);
            x340Var = x340Var2;
            if (z2) {
                x340Var.i0(-1383902279);
                d(uyn1.B(h2c.a.b(qim0Var3), 0.0f, 4.0f, 0.0f, 0.0f, 13), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-1383810984);
                x340Var.r(false);
            }
            x340Var.r(true);
            z4 = z2;
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            z4 = z2;
            qim0Var2 = qim0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo80(so80Var, iu30Var, qim0Var2, z4, i, i2);
        }
    }

    public static final void n(ine0 ine0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1358779797);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.g(ine0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            xu30 xu30VarR = null;
            uvx uvxVarB = uvx.b((uvx) b0kVar3.k(vvx.a), 2, (tvx) null, (p3v) null, 27);
            String str = ine0Var.a;
            boolean z = (i3 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new ijd0(iu30Var, (byte) 11);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(str), function0);
            String str2 = ine0Var.b;
            if (str2 == null) {
                b0kVar3.i0(658170026);
            } else {
                b0kVar3.i0(658170027);
                xu30VarR = apo.r(25078799, new z3y(str2, (byte) 23), b0kVar3);
            }
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, uvxVarB, null, false, null, null, gbxVar, null, null, null, null, xu30VarR, apo.r(-1683400988, new h6a0(ine0Var, iu30Var, (byte) 15), b0kVar3), null, null, apo.r(499977383, new k2d0(ine0Var, (byte) 16), b0kVar3), b0kVar2, 64, 196992, 26556);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0((Object) ine0Var, (Object) iu30Var, (Object) qim0Var2, i, (byte) 3);
        }
    }

    public static final void o(g2c g2cVar, adj1 adj1Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1695137929);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(g2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(adj1Var) : x340Var.i(adj1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (adj1Var instanceof ycj1) {
            x340Var.i0(371581786);
            w8p1.j(ldx.c, qim0Var, function0, x340Var, (i2 >> 3) & 1008);
            x340Var.r(false);
        } else {
            x340Var.i0(371732291);
            w0h1.a(xpx.c, isl.a, g2cVar.a(nim0.a, een.h), 0L, 0L, false, x340Var, xpx.d | 48, 56);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xth(g2cVar, adj1Var, qim0Var, function0, i, (byte) 0);
        }
    }

    public static final void p(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-948472166);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nyx.a(2, (wux) null, apo.r(504602797, new iuy0(iu30Var, (byte) 10), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iuy0(iu30Var, i, (byte) 11);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void q(int i, int i2, b0k b0kVar, qim0 qim0Var) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(-1439143213, i, x340Var) ? 4 : 2) | i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            ye5 ye5VarO = kk0.o(-37152628, x340Var);
            int iC = l1d.C(i);
            if (iC == 0) {
                x340Var.i0(608372565);
                ye5VarO.g(cwl1.o0(x340Var, 2131956709));
                ye5VarO.g(" ");
                z6p1.r(ye5VarO, "inlineIcon", "[icon]");
                ye5VarO.g(" ");
                ye5VarO.g(cwl1.o0(x340Var, 2131956710));
                ye5VarO.g(" ");
                ye5VarO.g(cwl1.o0(x340Var, 2131956715));
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(608779378);
                ye5VarO.g(cwl1.o0(x340Var, 2131956709));
                ye5VarO.g(" ");
                z6p1.r(ye5VarO, "inlineIcon", "[icon]");
                ye5VarO.g(" ");
                ye5VarO.g(cwl1.o0(x340Var, 2131956710));
                ye5VarO.g(" ");
                ye5VarO.g(cwl1.o0(x340Var, 2131956714));
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, -396018247, false);
                }
                x340Var.i0(609188454);
                ye5VarO.g(cwl1.o0(x340Var, 2131956713));
                ye5VarO.g(" ");
                z6p1.r(ye5VarO, "inlineIcon", "[icon]");
                ye5VarO.g(" ");
                ye5VarO.g(cwl1.o0(x340Var, 2131956711));
                x340Var.r(false);
            }
            af5 af5VarP = ye5VarO.p();
            x340Var.r(false);
            uwr uwrVar = cbx.a;
            cqs0 cqs0VarT = mqo1.t(new mmr0("inlineIcon", new gh80(new d6t0(4, cbx.d(x340Var).j.a.b, cbx.d(x340Var).j.a.b), ati.a)));
            cjc0 cjc0Var = new cjc0(2);
            qim0Var2 = nim0.a;
            uwo1.f(af5VarP, qim0Var2, null, null, null, null, 0, false, cjc0Var, 0, null, cqs0VarT, x340Var, 48, 0, 1788);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 15, i, i2, qim0Var2);
        }
    }

    public static final void r(View view, ldv0 ldv0Var) {
        x(view).a.add(ldv0Var);
    }

    public static final void s(View view) {
        r561 r561VarA = j2h1.A(new zd4(view, (lnm) null, (byte) 4));
        while (r561VarA.hasNext()) {
            ArrayList arrayList = x((View) r561VarA.next()).a;
            for (int iL = p7h.L(arrayList); -1 < iL; iL--) {
                ((ldv0) arrayList.get(iL)).a();
            }
        }
    }

    public static final void t(RecyclerView recyclerView) {
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                tw20.p();
                return;
            }
            ArrayList arrayList = x(childAt).a;
            for (int iL = p7h.L(arrayList); -1 < iL; iL--) {
                ((ldv0) arrayList.get(iL)).a();
            }
            i = i2;
        }
    }

    public static apk0 u(Integer num, r6h1 r6h1Var) {
        return new apk0(num, r6h1Var);
    }

    public static apk0 v(wql0 wql0Var) {
        return new apk0(0, wql0Var.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Closeable] */
    public static final fie1 w(String str, String str2) throws IOException {
        int i;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        File fileCreateTempFile;
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                ?? r5 = 0;
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L, 2);
                if (frameAtTime == null) {
                    mediaMetadataRetriever.release();
                    return null;
                }
                String strConcat = ihc1.a1(str, '.').concat("_thumbnail.jpg");
                File file = new File(strConcat);
                FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                try {
                    frameAtTime.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream3);
                    fileOutputStream3.close();
                    if (str2 != null) {
                        sm00 sm00Var = new sm00(file);
                        sm00Var.H("ImageUniqueID", str2);
                        if (!sm00Var.s || ((i = sm00Var.d) != 4 && i != 13 && i != 14)) {
                            throw new IOException("ExifInterface only supports saving attributes on JPEG, PNG, or WebP formats.");
                        }
                        if (sm00Var.b == null && sm00Var.a == null) {
                            throw new IOException("ExifInterface does not support saving attributes for the current input.");
                        }
                        int i2 = sm00Var.m;
                        sm00Var.l = (i2 == 6 || i2 == 7) ? sm00Var.s() : null;
                        File file2 = sm00Var.a != null ? new File(sm00Var.a) : null;
                        try {
                            if (sm00Var.a != null) {
                                fileCreateTempFile = new File(sm00Var.a + ".tmp");
                                if (!file2.renameTo(fileCreateTempFile)) {
                                    throw new IOException("Couldn't rename to " + fileCreateTempFile.getAbsolutePath());
                                }
                                fileInputStream = null;
                                fileOutputStream = null;
                            } else if (sm00Var.b != null) {
                                fileCreateTempFile = File.createTempFile("temp", "tmp");
                                Os.lseek(sm00Var.b, 0L, OsConstants.SEEK_SET);
                                fileInputStream = new FileInputStream(sm00Var.b);
                                try {
                                    fileOutputStream = new FileOutputStream(fileCreateTempFile);
                                    try {
                                        try {
                                            sm00.e(fileInputStream, fileOutputStream);
                                        } catch (Exception e) {
                                            e = e;
                                            throw new IOException("Failed to copy original file to temp file", e);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        sm00.c(fileInputStream);
                                        sm00.c(fileOutputStream);
                                        throw th;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    fileOutputStream = null;
                                    throw new IOException("Failed to copy original file to temp file", e);
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileOutputStream = null;
                                    sm00.c(fileInputStream);
                                    sm00.c(fileOutputStream);
                                    throw th;
                                }
                            } else {
                                fileInputStream = null;
                                fileOutputStream = null;
                                fileCreateTempFile = null;
                            }
                            try {
                                sm00.c(fileInputStream);
                                sm00.c(fileOutputStream);
                                try {
                                    FileInputStream fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                    if (sm00Var.a != null) {
                                        fileOutputStream2 = new FileOutputStream(sm00Var.a);
                                    } else {
                                        FileDescriptor fileDescriptor = sm00Var.b;
                                        if (fileDescriptor != null) {
                                            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream2 = new FileOutputStream(sm00Var.b);
                                        } else {
                                            fileOutputStream2 = null;
                                        }
                                    }
                                    bufferedInputStream = new BufferedInputStream(fileInputStream2);
                                    try {
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                                        try {
                                            int i3 = sm00Var.d;
                                            if (i3 == 4) {
                                                sm00Var.E(bufferedInputStream, bufferedOutputStream);
                                            } else if (i3 == 13) {
                                                sm00Var.F(bufferedInputStream, bufferedOutputStream);
                                            } else if (i3 == 14) {
                                                sm00Var.G(bufferedInputStream, bufferedOutputStream);
                                            }
                                            sm00.c(bufferedInputStream);
                                            sm00.c(bufferedOutputStream);
                                            fileCreateTempFile.delete();
                                            sm00Var.l = null;
                                        } catch (Exception e3) {
                                            e = e3;
                                            if (sm00Var.a != null || fileCreateTempFile.renameTo(file2)) {
                                                throw new IOException("Failed to save new file", e);
                                            }
                                            throw new IOException("Couldn't restore original file: " + file2.getAbsolutePath());
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        if (sm00Var.a != null) {
                                        }
                                        throw new IOException("Failed to save new file", e);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r5 = bufferedInputStream;
                                        sm00.c((Closeable) r5);
                                        sm00.c((Closeable) null);
                                        fileCreateTempFile.delete();
                                        throw th;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bufferedInputStream = null;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            fileInputStream = null;
                        } catch (Throwable th6) {
                            th = th6;
                            fileInputStream = null;
                        }
                    }
                    fie1 fie1Var = new fie1(strConcat, frameAtTime.getWidth(), frameAtTime.getHeight());
                    frameAtTime.recycle();
                    mediaMetadataRetriever.release();
                    return fie1Var;
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        u890.p(fileOutputStream3, th7);
                        throw th8;
                    }
                }
            } catch (Throwable th9) {
                mediaMetadataRetriever.release();
                throw th9;
            }
        } catch (Exception e7) {
            Logger.l(e7, "Failed to extract thumbnail from ".concat(str), new Object[0]);
            mediaMetadataRetriever.release();
            return null;
        }
    }

    public static final mdv0 x(View view) {
        mdv0 mdv0Var = (mdv0) view.getTag(2131430453);
        if (mdv0Var != null) {
            return mdv0Var;
        }
        mdv0 mdv0Var2 = new mdv0();
        view.setTag(2131430453, mdv0Var2);
        return mdv0Var2;
    }

    public static final boolean y(View view) {
        Iterator it = z561.c0(qbk1.a, view.getParent()).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            Object obj = (ViewParent) it.next();
            if (obj instanceof View) {
                Object tag = ((View) obj).getTag(2131429681);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null ? bool.booleanValue() : false) {
                    return true;
                }
            }
        }
    }

    public static final void z(pim0 pim0Var, Function0 function0) {
        tjp0 tjp0Var = pim0Var.g;
        if (tjp0Var == null) {
            tjp0Var = new tjp0((sjp0) pim0Var);
            pim0Var.g = tjp0Var;
        }
        uxq0 snapshotObserver = oap1.C(pim0Var).getSnapshotObserver();
        snapshotObserver.a.d(tjp0Var, tjp0.b, function0);
    }
}
