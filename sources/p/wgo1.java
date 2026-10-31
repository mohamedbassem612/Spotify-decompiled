package p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.StrictMode;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.zxing.WriterException;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.listplatform.contextmenu.ItemUnavailableException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class wgo1 {
    public static final tbo0 a = new tbo0((byte) 5);
    public static b180 b;

    public static void A(float f, float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void B(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static final mgo0 C(sgo0 sgo0Var, String str, String str2) {
        if (sgo0Var == null) {
            return null;
        }
        jo70 jo70Var = sgo0Var.c;
        if (!u890.j(sgo0Var.a, str)) {
            return null;
        }
        hzy hzyVar = sgo0Var.b;
        int i = hzyVar != null ? hzyVar.a : 0;
        int i2 = i == 0 ? -1 : ngo0.a[l1d.C(i)];
        if (i2 == 1) {
            Set set = s4b1.f;
            if (uic.h(str, new blc0[]{blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6})) {
                return z(str2, jo70Var);
            }
            return null;
        }
        if (i2 != 2) {
            return null;
        }
        Set set2 = s4b1.f;
        if (uic.g(str, blc0.fh)) {
            return r(str2, jo70Var);
        }
        return null;
    }

    public static final void D(vu30 vu30Var, q6 q6Var, q6 q6Var2) {
        Object objInvoke;
        try {
            o8n o8nVar = q6Var2.d;
            Object objW = flo1.w(o8nVar, (Object) null);
            try {
                if (vu30Var instanceof faa) {
                    w0h1.o(2, vu30Var);
                    objInvoke = vu30Var.invoke(q6Var, q6Var2);
                } else {
                    o6x context = q6Var2.getContext();
                    z890 z890Var = context == o6x.a ? new z890(q6Var2) : new a990(q6Var2, context);
                    w0h1.o(2, vu30Var);
                    objInvoke = vu30Var.invoke(q6Var, z890Var);
                }
                flo1.p(o8nVar, objW);
                if (objInvoke != d9n.a) {
                    q6Var2.resumeWith(objInvoke);
                }
            } catch (Throwable th) {
                flo1.p(o8nVar, objW);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).a;
            }
            q6Var2.resumeWith(new m231(th));
        }
    }

    public static final Object E(fn41 fn41Var, boolean z, Object obj, vu30 vu30Var) throws Throwable {
        Object nyhVar;
        Object objN0;
        try {
            if (vu30Var instanceof faa) {
                w0h1.o(2, vu30Var);
                nyhVar = vu30Var.invoke(obj, fn41Var);
            } else {
                o6x context = fn41Var.getContext();
                z890 z890Var = context == o6x.a ? new z890(fn41Var) : new a990(fn41Var, context);
                w0h1.o(2, vu30Var);
                nyhVar = vu30Var.invoke(obj, z890Var);
            }
        } catch (DispatchException e) {
            Throwable th = e.a;
            fn41Var.m0(new nyh(th, false));
            throw th;
        } catch (Throwable th2) {
            nyhVar = new nyh(th2, false);
        }
        d9n d9nVar = d9n.a;
        if (nyhVar == d9nVar || (objN0 = fn41Var.n0(nyhVar)) == j1e1.b) {
            return d9nVar;
        }
        fn41Var.B0();
        if (!(objN0 instanceof nyh)) {
            return j1e1.D(objN0);
        }
        if (!z) {
            TimeoutCancellationException timeoutCancellationException = ((nyh) objN0).a;
            if ((timeoutCancellationException instanceof TimeoutCancellationException) && timeoutCancellationException.a == fn41Var) {
                if (nyhVar instanceof nyh) {
                    throw ((nyh) nyhVar).a;
                }
                return nyhVar;
            }
        }
        throw ((nyh) objN0).a;
    }

    public static final fai0 F(ymd0 ymd0Var, Object obj) {
        fai0 fai0Var = new fai0();
        fai0Var.m(obj);
        fai0Var.n(ymd0Var, new u160(fai0Var, (byte) 1));
        return fai0Var;
    }

    public static final hvl1 G(rb81 rb81Var) {
        String str = rb81Var.b;
        eb81 eb81Var = rb81Var.e;
        return new hvl1(str, 242, (String) null, eb81Var != null ? eb81Var.a : null, false, eb81Var != null ? eb81Var.c : null);
    }

    public static final String H(dzy0 dzy0Var, String str) {
        int iOrdinal = dzy0Var.ordinal();
        if (iOrdinal == 0) {
            return nne.a.name();
        }
        if (iOrdinal != 1) {
            eg.o();
            return null;
        }
        if (nne.e.newEncoder().canEncode(str)) {
            return null;
        }
        return nne.a.name();
    }

    public static StrictMode.VmPolicy I() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(gtn1.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }

    public static final void a(hg6 hg6Var, boolean z, boolean z2, boolean z3, int i, Function0 function0, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        boolean z4;
        pxg1 pxg1VarJ0;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2082804845);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.g(hg6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z4 = z2;
            i3 |= b0kVar3.h(z4) ? 256 : 128;
        } else {
            z4 = z2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.h(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.e(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= b0kVar3.i(function0) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= b0kVar3.g(qim0Var) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (b0kVar3.Y(i4 & 1, (i4 & 599187) != 599186)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c13.l(z, b0kVar3);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = us71.i(z ? 1.0f : 0.0f, b0kVar3);
            }
            drr0 drr0Var = (drr0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = bb00.h(0, b0kVar3);
            }
            err0 err0Var = (hdn0) objT3;
            err0 err0Var2 = err0Var;
            String strC = f4i1.c(err0Var2.s(), "artistCardsParticleVisibility-");
            float fS = drr0Var.s();
            float f = ((Boolean) ven0Var.getValue()).booleanValue() ? 1.0f : 0.0f;
            if (err0Var2.s() == 0 || !z3) {
                pxg1VarJ0 = irn1.j0();
            } else {
                ilv.a.getClass();
                pxg1VarJ0 = irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, flv.i, 2);
            }
            hsi1 hsi1Var = new hsi1(strC, Float.valueOf(fS), Float.valueOf(f), pxg1VarJ0, rno1.a);
            int i5 = (i4 >> 3) & 112;
            ven0 ven0VarR = zod.R(hsi1Var, z4, (Function0) null, b0kVar3, 8 | i5, 4);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zG = b0kVar3.g(ven0VarR) | ((i4 & 112) == 32);
            Object objT4 = b0kVar3.T();
            if (zG || objT4 == m4cVar) {
                b0kVar2 = b0kVar3;
                bh bhVar = new bh(z, ven0VarR, ven0Var, drr0Var, err0Var, (lnm) null, (byte) 18);
                b0kVar2.s0(bhVar);
                objT4 = bhVar;
            } else {
                b0kVar2 = b0kVar3;
            }
            qxd0.t(boolValueOf, b0kVar2, (vu30) objT4);
            boolean zG2 = b0kVar2.g(ven0VarR) | ((i4 & 458752) == 131072);
            Object objT5 = b0kVar2.T();
            if (zG2 || objT5 == m4cVar) {
                objT5 = new cc2(ven0VarR, function0, (byte) 27);
                b0kVar2.s0(objT5);
            }
            b0kVar3 = b0kVar2;
            tx9.a(hg6Var, z2, i, z, i541.C(qim0Var, (iu30) objT5), b0kVar3, (i4 & 14) | i5 | ((i4 >> 6) & 896) | ((i4 << 6) & 7168));
        } else {
            b0kVar3.b0();
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new mf6(hg6Var, z, z2, z3, i, function0, qim0Var, i2);
        }
    }

    public static final void b(up51 up51Var, b0k b0kVar, int i) {
        zvx zvxVar;
        ecx ecxVarA;
        grx grxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1858920886);
        int i2 = (x340Var.i(up51Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = up51Var.d;
            int i3 = up51Var.e;
            if (str == null) {
                str = "";
            }
            Uri uri = Uri.parse(str);
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131963174));
            qim0 qim0VarQ = nim0.a;
            if (i3 == 1) {
                qim0VarQ = i1p1.q(qim0VarQ, er31.a);
            }
            if (i3 == 1) {
                x340Var.i0(196596723);
                x340Var.r(false);
                zvxVar = null;
            } else {
                x340Var.i0(283437361);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cua cuaVar2 = cbx.b(x340Var).f;
                zvx zvxVar2 = new zvx();
                x340Var.r(false);
                zvxVar = zvxVar2;
            }
            if (i3 == 2) {
                cbx.a.getClass();
                ecxVarA = uwr.d();
            } else {
                cbx.a.getClass();
                ecxVarA = uwr.a();
            }
            String str2 = up51Var.a;
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(str2);
            LinkedHashSet linkedHashSet = s4b1.g;
            v5b1 v5b1Var = s4b1VarX.d;
            if (o7h.i0(linkedHashSet, v5b1Var != null ? v5b1Var.getType() : null)) {
                grxVar = grx.c;
            } else {
                int iOrdinal = s4b1VarX.c.ordinal();
                if (iOrdinal == 30) {
                    grxVar = akx.c;
                } else if (iOrdinal == 44 || iOrdinal == 88) {
                    grxVar = nkx.c;
                } else if (iOrdinal == 844 || iOrdinal == 860) {
                    grxVar = mrx.c;
                } else {
                    grxVar = iOrdinal != 926 ? box.c : ltx.c;
                }
            }
            eso1.e(uri, jslVar, qim0VarQ, (p3v) null, zvxVar, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, new nux(grxVar, grxVar), false, false, x340Var, 1073744896, 0, 3520);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u841(up51Var, i, (byte) 11);
        }
    }

    public static final void c(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(513954137);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            gfx.g(8, apo.r(108878038, new ql(str, function0, (byte) 5), x340Var), x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o82(str, function0, qim0Var, i, (byte) 3);
        }
    }

    public static final void d(oo41 oo41Var, int i, zau0 zau0Var, boolean z, vu30 vu30Var, lz20 lz20Var, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        vu30 vu30Var2;
        boolean z2;
        long jA;
        vu30 vu30Var3;
        Object next;
        int i4 = i;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1184434087);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(oo41Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(zau0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(vu30Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.i(lz20Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= x340Var.i(qim0Var) ? 1048576 : 524288;
        }
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            String str = oo41Var.c;
            String str2 = oo41Var.e;
            boolean z3 = (str.length() > 0) && (((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation != 2 || xoi1.b((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)));
            if (str2.length() > 0) {
                x340Var.i0(-1974885103);
                d7 d7Var = new d7(hbq0.d, (byte) 0);
                do {
                    if (!d7Var.hasNext()) {
                        next = null;
                        break;
                    }
                    next = d7Var.next();
                } while (!((hbq0) next).a.equals(str2));
                hbq0 hbq0Var = (hbq0) next;
                if (hbq0Var == null) {
                    hbq0Var = hbq0.UNKNOWN;
                }
                jA = hbq0Var.a();
                z2 = false;
                x340Var.r(false);
            } else {
                z2 = false;
                x340Var.i0(-1974806828);
                uwr uwrVar = cbx.a;
                jA = cbx.a(x340Var).b.a;
                x340Var.r(false);
            }
            long j = jA;
            gfh0 gfh0VarC = t1c.c(een.h, z2);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            int i5 = i3;
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var4);
            nim0 nim0Var = nim0.a;
            boolean z5 = z3;
            qim0 qim0VarX = uyn1.x(u291.d(nim0Var, 1.0f), 24.0f);
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var, 0);
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
            nko1.H(qim0VarE2, x340Var, vu30Var4);
            if (z5) {
                x340Var.i0(2079069296);
                String str3 = oo41Var.c;
                qim0 qim0VarR = u291.r(nim0Var, 200.0f);
                uwr uwrVar2 = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                vu30Var3 = vu30Var4;
                yah0.a(str3, zau0Var, z, i1p1.q(qim0VarR, er31.b(4.0f)), x340Var, (i5 >> 3) & 1008);
                x0d.s(nim0Var, 32.0f, x340Var, false);
            } else {
                vu30Var3 = vu30Var4;
                x340Var.i0(2079391231);
                x340Var.r(false);
            }
            qim0 qim0VarP = vby0.p(u291.f(nim0Var, 1.0f), lz20Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = jzd.e;
                x340Var.s0(objT);
            }
            qim0 qim0VarU = qxy0.u(s161.b(qim0VarP, true, (iu30) objT), (idn0) null, 3);
            mbh mbhVarA2 = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarU);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, vu30Var3);
            String str4 = oo41Var.a;
            uwr uwrVar3 = cbx.a;
            uwo1.e(str4, u291.f(nim0Var, 1.0f), cbx.d(x340Var).c, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            x340Var = x340Var;
            if (oo41Var.b.length() > 0) {
                v8i0.i(16.0f, 1464162983, x340Var, x340Var, nim0Var);
                uwo1.e(oo41Var.b, u291.f(nim0Var, 1.0f), cbx.d(x340Var).g, u7h.b(j, 0.7f, 0.0f, 0.0f, 0.0f, 14), new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1464472425);
                x340Var.r(false);
            }
            x340Var.r(true);
            if (oo41Var.f.length() <= 0 || oo41Var.g.length() <= 0) {
                i4 = i;
                vu30Var2 = vu30Var;
                x340Var.i0(2080715551);
                x340Var.r(false);
            } else {
                v8i0.i(16.0f, 2080363825, x340Var, x340Var, nim0Var);
                String str5 = oo41Var.g;
                lee1 lee1Var = cbx.d(x340Var).h;
                boolean zI = x340Var.i(oo41Var) | ((i5 & 57344) == 16384) | ((i5 & 112) == 32);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    i4 = i;
                    vu30Var2 = vu30Var;
                    objT2 = new wv1((Object) vu30Var2, (Object) oo41Var, i4, (byte) 5);
                    x340Var.s0(objT2);
                } else {
                    i4 = i;
                    vu30Var2 = vu30Var;
                }
                x340 x340Var2 = x340Var;
                uwo1.e(str5, uyn1.z(0.0f, 8.0f, 1, bin.x(nim0Var, false, null, null, null, (Function0) objT2, 15)), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
                x340Var = x340Var2;
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            vu30Var2 = vu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c0e(oo41Var, i4, zau0Var, z, vu30Var2, lz20Var, qim0Var, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    public static final void e(c380 c380Var, String str, zau0 zau0Var, Function0 function0, vu30 vu30Var, vu30 vu30Var2, qim0 qim0Var, boolean z, xok0 xok0Var, b0k b0kVar, int i, int i2) {
        xok0 xok0Var2;
        int i3;
        String str2;
        qim0 qim0Var2;
        Object next;
        ?? r6;
        u7h u7hVarL;
        long j;
        b0k b0kVar2;
        float f;
        ?? r2;
        ?? r7;
        qim0 qim0Var3;
        m4c m4cVar;
        Object x4cVar;
        m4c m4cVar2 = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(416540212);
        j06 j06Var = ((x340) b0kVar3).a;
        int i4 = i | (b0kVar3.i(c380Var) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.i(zau0Var) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024) | (b0kVar3.i(vu30Var) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i4 |= b0kVar3.i(vu30Var2) ? 131072 : 65536;
        }
        int i5 = 1572864 | i4;
        int i6 = i2 & 256;
        if (i6 != 0) {
            i3 = i4 | 102236160;
            xok0Var2 = xok0Var;
        } else {
            xok0Var2 = xok0Var;
            i3 = i5 | (b0kVar3.i(xok0Var2) ? 67108864 : 33554432);
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 38347923) != 38347922)) {
            if (i6 != 0) {
                xok0Var2 = null;
            }
            boolean zI = b0kVar3.i(c380Var);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar2) {
                objT = new k27(c380Var, (byte) 1);
                b0kVar3.s0(objT);
            }
            kes kesVarB = lkr0.b(0, (Function0) objT, b0kVar3, 0, 3);
            Object[] objArr = new Object[0];
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar2) {
                objT2 = xrc.Y;
                b0kVar3.s0(objT2);
            }
            err0 err0Var = (hdn0) k5p1.s(objArr, (Function0) objT2, b0kVar3, 48);
            int iS = z ? err0Var.s() : ((err0) ((jkr0) kesVarB).d.c).s();
            oo41 oo41Var = (oo41) o7h.t0(iS, c380Var);
            if (oo41Var == null) {
                b0kVar3.i0(989677829);
                b0kVar3.r(false);
                r6 = 0;
                u7hVarL = null;
            } else {
                b0kVar3.i0(989677830);
                String str3 = oo41Var.d;
                d7 d7Var = new d7(hbq0.d, (byte) 0);
                do {
                    if (!d7Var.hasNext()) {
                        next = null;
                        break;
                    }
                    next = d7Var.next();
                } while (!((hbq0) next).a.equals(str3));
                hbq0 hbq0Var = (hbq0) next;
                if (hbq0Var == null) {
                    hbq0Var = hbq0.UNKNOWN;
                }
                r6 = 0;
                u7hVarL = p3d1.l(b0kVar3, false, hbq0Var.a());
            }
            if (u7hVarL == null) {
                b0kVar3.i0(863212504);
                uwr uwrVar = cbx.a;
                j = cbx.a(b0kVar3).a.c;
                b0kVar3.r((boolean) r6);
            } else {
                b0kVar3.i0(863208722);
                b0kVar3.r((boolean) r6);
                j = u7hVarL.a;
            }
            int i7 = iS;
            tob1 tob1VarA = w191.a(j, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, r6, null, 6), null, b0kVar3, 0, 12);
            boolean zE = b0kVar3.e(c380Var.size());
            Object objT3 = b0kVar3.T();
            Object obj = objT3;
            if (zE || objT3 == m4cVar2) {
                int size = c380Var.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList.add(new lz20());
                }
                b0kVar3.s0(arrayList);
                obj = arrayList;
            }
            List list = (List) obj;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar2) {
                objT4 = bb00.h(-1, b0kVar3);
            }
            hdn0 hdn0Var = (hdn0) objT4;
            if (z) {
                b0kVar2 = b0kVar3;
                b0kVar2.i0(990445390);
                b0kVar2.r(false);
            } else {
                b0kVar3.i0(990121533);
                boolean zI2 = b0kVar3.i(kesVarB) | b0kVar3.i(list) | ((i3 & 458752) == 131072) | b0kVar3.i(hdn0Var);
                Object objT5 = b0kVar3.T();
                if (zI2 || objT5 == m4cVar2) {
                    b0kVar2 = b0kVar3;
                    x4cVar = new x4c(kesVarB, list, vu30Var2, hdn0Var, (lnm) null, (byte) 3);
                    b0kVar2.s0(x4cVar);
                } else {
                    b0kVar2 = b0kVar3;
                    x4cVar = objT5;
                }
                qxd0.t(kesVarB, b0kVar2, (vu30) x4cVar);
                b0kVar2.r(false);
            }
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
            long j2 = ((u7h) tob1VarA.getValue()).a;
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarF = dug.f(qim0VarD, j2, u5j1Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z2 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qim0 qim0VarD2 = u291.d(qim0Var4, 1.0f);
            Object objT6 = b0kVar2.T();
            if (objT6 == m4cVar2) {
                objT6 = jzd.f;
                b0kVar2.s0(objT6);
            }
            qim0 qim0VarB = s161.b(qim0VarD2, false, (iu30) objT6);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarB);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            if (!z || xok0Var2 == null) {
                b0kVar2.i0(149070245);
                if (!(((double) 1.0f) > 0.0d)) {
                    of80.a("invalid weight; must be greater than zero");
                }
                f = 1.0f;
                qim0 qim0VarF2 = u291.f(new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 1.0f);
                boolean zI3 = b0kVar2.i(c380Var);
                Object objT7 = b0kVar2.T();
                if (zI3 || objT7 == m4cVar2) {
                    objT7 = new xr1(c380Var, (byte) 2);
                    b0kVar2.s0(objT7);
                }
                b0k b0kVar4 = b0kVar2;
                xok0Var2 = xok0Var2;
                r2 = 1;
                r7 = 0;
                qim0Var3 = qim0Var4;
                m4cVar = m4cVar2;
                w0h1.c(kesVarB, s161.b(qim0VarF2, false, (iu30) objT7), (vzq0) null, (gdr0) null, 0, 0.0f, (pl3) null, (ru91) null, false, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, apo.r(-1767204621, new rl6(c380Var, zau0Var, kesVarB, vu30Var, list, (byte) 1), b0kVar4), b0kVar4, 0, 16380);
                b0kVar3 = b0kVar4;
                b0kVar3.r(false);
            } else {
                b0kVar2.i0(147986268);
                boolean zG = b0kVar2.g(xok0Var2);
                Object objT8 = b0kVar2.T();
                if (zG || objT8 == m4cVar2) {
                    objT8 = new byd(xok0Var2, vu30Var, new d0e((hdn0) err0Var, vu30Var2));
                    b0kVar2.s0(objT8);
                }
                mod.b(dge0.a.a(zau0Var), apo.r(1982207677, new hj8((byd) objT8, c380Var, (byte) 29), b0kVar2), b0kVar2, 56);
                b0kVar2.r(false);
                m4cVar = m4cVar2;
                b0kVar3 = b0kVar2;
                r7 = 0;
                qim0Var3 = qim0Var4;
                r2 = 1;
                f = 1.0f;
            }
            if (c380Var.size() > r2) {
                b0kVar3.i0(149692384);
                m(i7, c380Var.size(), r7, b0kVar3, uyn1.z(0.0f, 16.0f, r2, qim0Var3));
                b0kVar3.r((boolean) r7);
            } else {
                b0kVar3.i0(149855754);
                b0kVar3.r((boolean) r7);
            }
            qti1 qti1Var = voo1.g;
            if (!z || xok0Var2 == null) {
                str2 = str;
                b0kVar3.i0(150413754);
                c(((i3 >> 3) & 14) | ((i3 >> 6) & 112), str2, function0, b0kVar3, uyn1.y(voo1.y(qim0Var3, qti1Var), 24.0f, 24.0f));
                b0kVar3.r((boolean) r7);
            } else {
                b0kVar3.i0(149929472);
                boolean zG2 = b0kVar3.g(xok0Var2);
                Object objT9 = b0kVar3.T();
                if (zG2 || objT9 == m4cVar) {
                    objT9 = new zzd(xok0Var2, function0);
                    b0kVar3.s0(objT9);
                }
                str2 = str;
                otw.c((zzd) objT9, new yzd(str2), uyn1.y(voo1.y(qim0Var3, qti1Var), 24.0f, 24.0f), (ipb1) null, b0kVar3, 8, 8);
                b0kVar3.r((boolean) r7);
            }
            b0kVar3.r((boolean) r2);
            gra graVar = een.e;
            h2c h2cVar = h2c.a;
            qim0 qim0VarF3 = u291.f(h2cVar.a(qim0Var3, graVar), f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarE3 = yoo1.E(qim0VarF3, lhc.g(b0kVar3).f);
            uwr uwrVar2 = cbx.a;
            zsc zscVar = zex.a;
            t1c.a(dug.f(qim0VarE3, ((vex) zscVar.e).c, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0464: INVOKE 
                  (wrap p.qim0:0x0460: INVOKE 
                  (r4v10 'qim0VarE3' p.qim0)
                  (wrap long:0x045e: IGET 
                  (wrap p.vex:0x045c: CHECK_CAST (p.vex) (wrap java.lang.Object:0x045a: IGET (r10v49 'zscVar' p.zsc) A[WRAPPED] (LINE:1115) p.zsc.e java.lang.Object))
                 A[WRAPPED] (LINE:1119) p.vex.c long)
                  (r39v1 ?? I:??[OBJECT, ARRAY])
                 STATIC call: p.dug.f(p.qim0, long, p.hw61):p.qim0 A[MD:(p.qim0, long, p.hw61):p.qim0 (m), WRAPPED] (LINE:1121))
                  (r13v14 'b0kVar3' p.b0k)
                  (wrap int:?: CAST (int) (r6v14 'r7' ?? I:int))
                 STATIC call: p.t1c.a(p.qim0, p.b0k, int):void (LINE:1125) in method: p.wgo1.e(p.c380, java.lang.String, p.zau0, kotlin.jvm.functions.Function0, p.vu30, p.vu30, p.qim0, boolean, p.xok0, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r39v1 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1207
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.wgo1.e(p.c380, java.lang.String, p.zau0, kotlin.jvm.functions.Function0, p.vu30, p.vu30, p.qim0, boolean, p.xok0, p.b0k, int, int):void");
        }

        public static final void f(b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(7380043);
            if (x340Var.Y(i & 1, i != 0)) {
                plx plxVar = plx.c;
                jsl jslVar = new jsl(cwl1.o0(x340Var, 2131953830));
                uwr uwrVar = cbx.a;
                w0h1.a(plxVar, jslVar, (qim0) null, cbx.a(x340Var).b.b, 0L, false, x340Var, plx.d, 52);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new fk01(i, (byte) 15);
            }
        }

        public static final void g(String str, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(429040448);
            int i2 = i | (x340Var.g(str) ? 4 : 2);
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                fra fraVar = een.N0;
                era eraVar = een.P0;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarD = u291.D(nim0Var, eraVar, 2);
                uwr uwrVar = cbx.a;
                long j = ((vex) zex.a.e).i;
                cua cuaVar = cbx.b(x340Var).f;
                qim0 qim0VarF = dug.f(qim0VarD, j, er31.b(2.0f));
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarY = uyn1.y(qim0VarF, 4.0f, 8.0f);
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                cwl1.f(i3o1.n(2131233713, x340Var, 0), (String) null, u291.r(nim0Var, n660.i), (tl3) null, (j6m) null, 0.0f, (ColorFilter) null, x340Var, 56, 120);
                cvx cvxVar3 = cbx.b(x340Var).b;
                uwo1.e(str, anm1.N("premium_visual_header_description", nim0Var), ktd.l(nim0Var, 4.0f, x340Var, x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, new px8(n660.e, n660.f, n660.g, (mx8) null, 8), x340Var, i2 & 14, 8, 1008);
                x340Var = x340Var;
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new dz40(str, i, (byte) 6);
            }
        }

        public static final void h(b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1281150892);
            if (x340Var.Y(i & 1, i != 0)) {
                uwr uwrVar = cbx.a;
                uwo1.e(" • ", null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 6, 0, 2034);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new fk01(i, (byte) 16);
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0179  */
        /* JADX WARN: Code duplicated, block: B:103:0x0186  */
        /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:19:0x0041  */
        /* JADX WARN: Code duplicated, block: B:21:0x0049  */
        /* JADX WARN: Code duplicated, block: B:22:0x004c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0055  */
        /* JADX WARN: Code duplicated, block: B:28:0x005d  */
        /* JADX WARN: Code duplicated, block: B:29:0x0060  */
        /* JADX WARN: Code duplicated, block: B:33:0x0069  */
        /* JADX WARN: Code duplicated, block: B:35:0x0071  */
        /* JADX WARN: Code duplicated, block: B:36:0x0074  */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x0086  */
        /* JADX WARN: Code duplicated, block: B:44:0x008f  */
        /* JADX WARN: Code duplicated, block: B:46:0x009c  */
        /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:64:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:67:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:70:0x00de  */
        /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:76:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:77:0x0101  */
        /* JADX WARN: Code duplicated, block: B:80:0x0108 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:81:0x010a  */
        /* JADX WARN: Code duplicated, block: B:84:0x0127  */
        /* JADX WARN: Code duplicated, block: B:85:0x012a  */
        /* JADX WARN: Code duplicated, block: B:88:0x0132 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:89:0x0134  */
        /* JADX WARN: Code duplicated, block: B:92:0x014b  */
        /* JADX WARN: Code duplicated, block: B:93:0x014d  */
        /* JADX WARN: Code duplicated, block: B:96:0x0154 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:97:0x0156  */
        public static final void i(Function0 function0, Function0 function1, String str, String str2, String str3, String str4, b0k b0kVar, int i, int i2) {
            String strO0;
            String strO1;
            String strO2;
            String strO3;
            int i3;
            boolean z;
            String str5;
            String str6;
            String str7;
            String str8;
            h311 h311VarV;
            int i4;
            boolean z2;
            Object objT;
            int i5;
            boolean z3;
            Object objT2;
            boolean z4;
            Object objT3;
            m4c m4cVar = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1299935446);
            int i6 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(function1) ? 32 : 16);
            if ((i2 & 4) == 0) {
                strO0 = str;
                int i7 = x340Var.g(strO0) ? 256 : 128;
                int i8 = i6 | i7;
                if ((i2 & 8) == 0) {
                    strO1 = str2;
                    int i9 = x340Var.g(strO1) ? 2048 : 1024;
                    int i10 = i8 | i9;
                    if ((i2 & 16) == 0) {
                        strO2 = str3;
                        int i11 = x340Var.g(strO2) ? 16384 : 8192;
                        int i12 = i10 | i11;
                        if ((i2 & 32) == 0) {
                            strO3 = str4;
                            int i13 = x340Var.g(strO3) ? 131072 : 65536;
                            i3 = i12 | i13;
                            if ((74899 & i3) != 74898) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (x340Var.Y(i3 & 1, z)) {
                                x340Var.d0();
                                if ((i & 1) != 0 || x340Var.E()) {
                                    if ((i2 & 4) != 0) {
                                        strO0 = cwl1.o0(x340Var, 2131960813);
                                        i3 &= -897;
                                    }
                                    if ((i2 & 8) != 0) {
                                        strO1 = cwl1.o0(x340Var, 2131960810);
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        strO2 = cwl1.o0(x340Var, 2131960812);
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 32) != 0) {
                                        strO3 = cwl1.o0(x340Var, 2131960811);
                                        i3 &= -458753;
                                    }
                                } else {
                                    x340Var.b0();
                                    if ((i2 & 4) != 0) {
                                        i3 &= -897;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i3 &= -458753;
                                    }
                                }
                                String str9 = strO2;
                                i4 = i3;
                                String str10 = strO3;
                                x340Var.s();
                                i3u i3uVar = new i3u(5, false, true, false);
                                if ((i4 & 14) == 4) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objT = x340Var.T();
                                if (z2 || objT == m4cVar) {
                                    objT = new ivw(function0, (byte) 29);
                                    x340Var.s0(objT);
                                }
                                z50 z50Var = z50.c;
                                zgx zgxVar = new zgx(str9, new gbx(z50Var, (Function0) objT));
                                i5 = i4 & 112;
                                if (i5 == 32) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                objT2 = x340Var.T();
                                if (z3 || objT2 == m4cVar) {
                                    objT2 = new in00(function1, (byte) 0);
                                    x340Var.s0(objT2);
                                }
                                zgx zgxVar2 = new zgx(str10, new gbx(z50Var, (Function0) objT2));
                                if (i5 == 32) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                objT3 = x340Var.T();
                                if (z4 || objT3 == m4cVar) {
                                    objT3 = new in00(function1, (byte) 1);
                                    x340Var.s0(objT3);
                                }
                                String str11 = strO0;
                                mqo1.d((Function0) objT3, i3uVar, null, str11, strO1, zgxVar, zgxVar2, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                                str5 = str11;
                                str6 = str9;
                                str7 = str10;
                            } else {
                                x340Var.b0();
                                str5 = strO0;
                                str6 = strO2;
                                str7 = strO3;
                            }
                            str8 = strO1;
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                            }
                        }
                        strO3 = str4;
                        i3 = i12 | i13;
                        if ((74899 & i3) != 74898) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (x340Var.Y(i3 & 1, z)) {
                            x340Var.d0();
                            if ((i & 1) != 0) {
                                if ((i2 & 4) != 0) {
                                    strO0 = cwl1.o0(x340Var, 2131960813);
                                    i3 &= -897;
                                }
                                if ((i2 & 8) != 0) {
                                    strO1 = cwl1.o0(x340Var, 2131960810);
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    strO2 = cwl1.o0(x340Var, 2131960812);
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    strO3 = cwl1.o0(x340Var, 2131960811);
                                    i3 &= -458753;
                                }
                            } else {
                                if ((i2 & 4) != 0) {
                                    strO0 = cwl1.o0(x340Var, 2131960813);
                                    i3 &= -897;
                                }
                                if ((i2 & 8) != 0) {
                                    strO1 = cwl1.o0(x340Var, 2131960810);
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    strO2 = cwl1.o0(x340Var, 2131960812);
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    strO3 = cwl1.o0(x340Var, 2131960811);
                                    i3 &= -458753;
                                }
                            }
                            String str12 = strO2;
                            i4 = i3;
                            String str13 = strO3;
                            x340Var.s();
                            i3u i3uVar2 = new i3u(5, false, true, false);
                            if ((i4 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objT = x340Var.T();
                            if (z2) {
                                objT = new ivw(function0, (byte) 29);
                                x340Var.s0(objT);
                            } else {
                                objT = new ivw(function0, (byte) 29);
                                x340Var.s0(objT);
                            }
                            z50 z50Var2 = z50.c;
                            zgx zgxVar3 = new zgx(str12, new gbx(z50Var2, (Function0) objT));
                            i5 = i4 & 112;
                            if (i5 == 32) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            objT2 = x340Var.T();
                            if (z3) {
                                objT2 = new in00(function1, (byte) 0);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new in00(function1, (byte) 0);
                                x340Var.s0(objT2);
                            }
                            zgx zgxVar4 = new zgx(str13, new gbx(z50Var2, (Function0) objT2));
                            if (i5 == 32) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objT3 = x340Var.T();
                            if (z4) {
                                objT3 = new in00(function1, (byte) 1);
                                x340Var.s0(objT3);
                            } else {
                                objT3 = new in00(function1, (byte) 1);
                                x340Var.s0(objT3);
                            }
                            String str14 = strO0;
                            mqo1.d((Function0) objT3, i3uVar2, null, str14, strO1, zgxVar3, zgxVar4, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                            str5 = str14;
                            str6 = str12;
                            str7 = str13;
                        } else {
                            x340Var.b0();
                            str5 = strO0;
                            str6 = strO2;
                            str7 = strO3;
                        }
                        str8 = strO1;
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                        }
                    }
                    strO2 = str3;
                    int i14 = i10 | i11;
                    if ((i2 & 32) == 0) {
                        strO3 = str4;
                        if (x340Var.g(strO3)) {
                        }
                        i3 = i14 | i13;
                        if ((74899 & i3) != 74898) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (x340Var.Y(i3 & 1, z)) {
                            x340Var.d0();
                            if ((i & 1) != 0) {
                                if ((i2 & 4) != 0) {
                                    strO0 = cwl1.o0(x340Var, 2131960813);
                                    i3 &= -897;
                                }
                                if ((i2 & 8) != 0) {
                                    strO1 = cwl1.o0(x340Var, 2131960810);
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    strO2 = cwl1.o0(x340Var, 2131960812);
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    strO3 = cwl1.o0(x340Var, 2131960811);
                                    i3 &= -458753;
                                }
                            } else {
                                if ((i2 & 4) != 0) {
                                    strO0 = cwl1.o0(x340Var, 2131960813);
                                    i3 &= -897;
                                }
                                if ((i2 & 8) != 0) {
                                    strO1 = cwl1.o0(x340Var, 2131960810);
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    strO2 = cwl1.o0(x340Var, 2131960812);
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    strO3 = cwl1.o0(x340Var, 2131960811);
                                    i3 &= -458753;
                                }
                            }
                            String str15 = strO2;
                            i4 = i3;
                            String str16 = strO3;
                            x340Var.s();
                            i3u i3uVar3 = new i3u(5, false, true, false);
                            if ((i4 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objT = x340Var.T();
                            if (z2) {
                                objT = new ivw(function0, (byte) 29);
                                x340Var.s0(objT);
                            } else {
                                objT = new ivw(function0, (byte) 29);
                                x340Var.s0(objT);
                            }
                            z50 z50Var3 = z50.c;
                            zgx zgxVar5 = new zgx(str15, new gbx(z50Var3, (Function0) objT));
                            i5 = i4 & 112;
                            if (i5 == 32) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            objT2 = x340Var.T();
                            if (z3) {
                                objT2 = new in00(function1, (byte) 0);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new in00(function1, (byte) 0);
                                x340Var.s0(objT2);
                            }
                            zgx zgxVar6 = new zgx(str16, new gbx(z50Var3, (Function0) objT2));
                            if (i5 == 32) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objT3 = x340Var.T();
                            if (z4) {
                                objT3 = new in00(function1, (byte) 1);
                                x340Var.s0(objT3);
                            } else {
                                objT3 = new in00(function1, (byte) 1);
                                x340Var.s0(objT3);
                            }
                            String str17 = strO0;
                            mqo1.d((Function0) objT3, i3uVar3, null, str17, strO1, zgxVar5, zgxVar6, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                            str5 = str17;
                            str6 = str15;
                            str7 = str16;
                        } else {
                            x340Var.b0();
                            str5 = strO0;
                            str6 = strO2;
                            str7 = strO3;
                        }
                        str8 = strO1;
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                        }
                    }
                    strO3 = str4;
                    i3 = i14 | i13;
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i3 & 1, z)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if ((i2 & 4) != 0) {
                                strO0 = cwl1.o0(x340Var, 2131960813);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                strO1 = cwl1.o0(x340Var, 2131960810);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                strO2 = cwl1.o0(x340Var, 2131960812);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                strO3 = cwl1.o0(x340Var, 2131960811);
                                i3 &= -458753;
                            }
                        } else {
                            if ((i2 & 4) != 0) {
                                strO0 = cwl1.o0(x340Var, 2131960813);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                strO1 = cwl1.o0(x340Var, 2131960810);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                strO2 = cwl1.o0(x340Var, 2131960812);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                strO3 = cwl1.o0(x340Var, 2131960811);
                                i3 &= -458753;
                            }
                        }
                        String str18 = strO2;
                        i4 = i3;
                        String str19 = strO3;
                        x340Var.s();
                        i3u i3uVar4 = new i3u(5, false, true, false);
                        if ((i4 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT = x340Var.T();
                        if (z2) {
                            objT = new ivw(function0, (byte) 29);
                            x340Var.s0(objT);
                        } else {
                            objT = new ivw(function0, (byte) 29);
                            x340Var.s0(objT);
                        }
                        z50 z50Var4 = z50.c;
                        zgx zgxVar7 = new zgx(str18, new gbx(z50Var4, (Function0) objT));
                        i5 = i4 & 112;
                        if (i5 == 32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objT2 = x340Var.T();
                        if (z3) {
                            objT2 = new in00(function1, (byte) 0);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new in00(function1, (byte) 0);
                            x340Var.s0(objT2);
                        }
                        zgx zgxVar8 = new zgx(str19, new gbx(z50Var4, (Function0) objT2));
                        if (i5 == 32) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objT3 = x340Var.T();
                        if (z4) {
                            objT3 = new in00(function1, (byte) 1);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new in00(function1, (byte) 1);
                            x340Var.s0(objT3);
                        }
                        String str110 = strO0;
                        mqo1.d((Function0) objT3, i3uVar4, null, str110, strO1, zgxVar7, zgxVar8, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                        str5 = str110;
                        str6 = str18;
                        str7 = str19;
                    } else {
                        x340Var.b0();
                        str5 = strO0;
                        str6 = strO2;
                        str7 = strO3;
                    }
                    str8 = strO1;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                    }
                }
                strO1 = str2;
                int i15 = i8 | i9;
                if ((i2 & 16) == 0) {
                    strO2 = str3;
                    if (x340Var.g(strO2)) {
                    }
                    int i16 = i15 | i11;
                    if ((i2 & 32) == 0) {
                        strO3 = str4;
                        if (x340Var.g(strO3)) {
                        }
                        i3 = i16 | i13;
                        if ((74899 & i3) != 74898) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (x340Var.Y(i3 & 1, z)) {
                            x340Var.d0();
                            if ((i & 1) != 0) {
                                if ((i2 & 4) != 0) {
                                    strO0 = cwl1.o0(x340Var, 2131960813);
                                    i3 &= -897;
                                }
                                if ((i2 & 8) != 0) {
                                    strO1 = cwl1.o0(x340Var, 2131960810);
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    strO2 = cwl1.o0(x340Var, 2131960812);
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    strO3 = cwl1.o0(x340Var, 2131960811);
                                    i3 &= -458753;
                                }
                            } else {
                                if ((i2 & 4) != 0) {
                                    strO0 = cwl1.o0(x340Var, 2131960813);
                                    i3 &= -897;
                                }
                                if ((i2 & 8) != 0) {
                                    strO1 = cwl1.o0(x340Var, 2131960810);
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    strO2 = cwl1.o0(x340Var, 2131960812);
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    strO3 = cwl1.o0(x340Var, 2131960811);
                                    i3 &= -458753;
                                }
                            }
                            String str111 = strO2;
                            i4 = i3;
                            String str112 = strO3;
                            x340Var.s();
                            i3u i3uVar5 = new i3u(5, false, true, false);
                            if ((i4 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objT = x340Var.T();
                            if (z2) {
                                objT = new ivw(function0, (byte) 29);
                                x340Var.s0(objT);
                            } else {
                                objT = new ivw(function0, (byte) 29);
                                x340Var.s0(objT);
                            }
                            z50 z50Var5 = z50.c;
                            zgx zgxVar9 = new zgx(str111, new gbx(z50Var5, (Function0) objT));
                            i5 = i4 & 112;
                            if (i5 == 32) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            objT2 = x340Var.T();
                            if (z3) {
                                objT2 = new in00(function1, (byte) 0);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new in00(function1, (byte) 0);
                                x340Var.s0(objT2);
                            }
                            zgx zgxVar10 = new zgx(str112, new gbx(z50Var5, (Function0) objT2));
                            if (i5 == 32) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objT3 = x340Var.T();
                            if (z4) {
                                objT3 = new in00(function1, (byte) 1);
                                x340Var.s0(objT3);
                            } else {
                                objT3 = new in00(function1, (byte) 1);
                                x340Var.s0(objT3);
                            }
                            String str113 = strO0;
                            mqo1.d((Function0) objT3, i3uVar5, null, str113, strO1, zgxVar9, zgxVar10, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                            str5 = str113;
                            str6 = str111;
                            str7 = str112;
                        } else {
                            x340Var.b0();
                            str5 = strO0;
                            str6 = strO2;
                            str7 = strO3;
                        }
                        str8 = strO1;
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                        }
                    }
                    strO3 = str4;
                    i3 = i16 | i13;
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i3 & 1, z)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if ((i2 & 4) != 0) {
                                strO0 = cwl1.o0(x340Var, 2131960813);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                strO1 = cwl1.o0(x340Var, 2131960810);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                strO2 = cwl1.o0(x340Var, 2131960812);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                strO3 = cwl1.o0(x340Var, 2131960811);
                                i3 &= -458753;
                            }
                        } else {
                            if ((i2 & 4) != 0) {
                                strO0 = cwl1.o0(x340Var, 2131960813);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                strO1 = cwl1.o0(x340Var, 2131960810);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                strO2 = cwl1.o0(x340Var, 2131960812);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                strO3 = cwl1.o0(x340Var, 2131960811);
                                i3 &= -458753;
                            }
                        }
                        String str114 = strO2;
                        i4 = i3;
                        String str115 = strO3;
                        x340Var.s();
                        i3u i3uVar6 = new i3u(5, false, true, false);
                        if ((i4 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT = x340Var.T();
                        if (z2) {
                            objT = new ivw(function0, (byte) 29);
                            x340Var.s0(objT);
                        } else {
                            objT = new ivw(function0, (byte) 29);
                            x340Var.s0(objT);
                        }
                        z50 z50Var6 = z50.c;
                        zgx zgxVar11 = new zgx(str114, new gbx(z50Var6, (Function0) objT));
                        i5 = i4 & 112;
                        if (i5 == 32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objT2 = x340Var.T();
                        if (z3) {
                            objT2 = new in00(function1, (byte) 0);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new in00(function1, (byte) 0);
                            x340Var.s0(objT2);
                        }
                        zgx zgxVar12 = new zgx(str115, new gbx(z50Var6, (Function0) objT2));
                        if (i5 == 32) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objT3 = x340Var.T();
                        if (z4) {
                            objT3 = new in00(function1, (byte) 1);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new in00(function1, (byte) 1);
                            x340Var.s0(objT3);
                        }
                        String str116 = strO0;
                        mqo1.d((Function0) objT3, i3uVar6, null, str116, strO1, zgxVar11, zgxVar12, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                        str5 = str116;
                        str6 = str114;
                        str7 = str115;
                    } else {
                        x340Var.b0();
                        str5 = strO0;
                        str6 = strO2;
                        str7 = strO3;
                    }
                    str8 = strO1;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                    }
                }
                strO2 = str3;
                int i17 = i15 | i11;
                if ((i2 & 32) == 0) {
                    strO3 = str4;
                    if (x340Var.g(strO3)) {
                    }
                    i3 = i17 | i13;
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i3 & 1, z)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if ((i2 & 4) != 0) {
                                strO0 = cwl1.o0(x340Var, 2131960813);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                strO1 = cwl1.o0(x340Var, 2131960810);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                strO2 = cwl1.o0(x340Var, 2131960812);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                strO3 = cwl1.o0(x340Var, 2131960811);
                                i3 &= -458753;
                            }
                        } else {
                            if ((i2 & 4) != 0) {
                                strO0 = cwl1.o0(x340Var, 2131960813);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                strO1 = cwl1.o0(x340Var, 2131960810);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                strO2 = cwl1.o0(x340Var, 2131960812);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                strO3 = cwl1.o0(x340Var, 2131960811);
                                i3 &= -458753;
                            }
                        }
                        String str117 = strO2;
                        i4 = i3;
                        String str118 = strO3;
                        x340Var.s();
                        i3u i3uVar7 = new i3u(5, false, true, false);
                        if ((i4 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT = x340Var.T();
                        if (z2) {
                            objT = new ivw(function0, (byte) 29);
                            x340Var.s0(objT);
                        } else {
                            objT = new ivw(function0, (byte) 29);
                            x340Var.s0(objT);
                        }
                        z50 z50Var7 = z50.c;
                        zgx zgxVar13 = new zgx(str117, new gbx(z50Var7, (Function0) objT));
                        i5 = i4 & 112;
                        if (i5 == 32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objT2 = x340Var.T();
                        if (z3) {
                            objT2 = new in00(function1, (byte) 0);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new in00(function1, (byte) 0);
                            x340Var.s0(objT2);
                        }
                        zgx zgxVar14 = new zgx(str118, new gbx(z50Var7, (Function0) objT2));
                        if (i5 == 32) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objT3 = x340Var.T();
                        if (z4) {
                            objT3 = new in00(function1, (byte) 1);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new in00(function1, (byte) 1);
                            x340Var.s0(objT3);
                        }
                        String str119 = strO0;
                        mqo1.d((Function0) objT3, i3uVar7, null, str119, strO1, zgxVar13, zgxVar14, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                        str5 = str119;
                        str6 = str117;
                        str7 = str118;
                    } else {
                        x340Var.b0();
                        str5 = strO0;
                        str6 = strO2;
                        str7 = strO3;
                    }
                    str8 = strO1;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                    }
                }
                strO3 = str4;
                i3 = i17 | i13;
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i2 & 4) != 0) {
                            strO0 = cwl1.o0(x340Var, 2131960813);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            strO1 = cwl1.o0(x340Var, 2131960810);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            strO2 = cwl1.o0(x340Var, 2131960812);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            strO3 = cwl1.o0(x340Var, 2131960811);
                            i3 &= -458753;
                        }
                    } else {
                        if ((i2 & 4) != 0) {
                            strO0 = cwl1.o0(x340Var, 2131960813);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            strO1 = cwl1.o0(x340Var, 2131960810);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            strO2 = cwl1.o0(x340Var, 2131960812);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            strO3 = cwl1.o0(x340Var, 2131960811);
                            i3 &= -458753;
                        }
                    }
                    String str1110 = strO2;
                    i4 = i3;
                    String str1111 = strO3;
                    x340Var.s();
                    i3u i3uVar8 = new i3u(5, false, true, false);
                    if ((i4 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT = x340Var.T();
                    if (z2) {
                        objT = new ivw(function0, (byte) 29);
                        x340Var.s0(objT);
                    } else {
                        objT = new ivw(function0, (byte) 29);
                        x340Var.s0(objT);
                    }
                    z50 z50Var8 = z50.c;
                    zgx zgxVar15 = new zgx(str1110, new gbx(z50Var8, (Function0) objT));
                    i5 = i4 & 112;
                    if (i5 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objT2 = x340Var.T();
                    if (z3) {
                        objT2 = new in00(function1, (byte) 0);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new in00(function1, (byte) 0);
                        x340Var.s0(objT2);
                    }
                    zgx zgxVar16 = new zgx(str1111, new gbx(z50Var8, (Function0) objT2));
                    if (i5 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objT3 = x340Var.T();
                    if (z4) {
                        objT3 = new in00(function1, (byte) 1);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new in00(function1, (byte) 1);
                        x340Var.s0(objT3);
                    }
                    String str1112 = strO0;
                    mqo1.d((Function0) objT3, i3uVar8, null, str1112, strO1, zgxVar15, zgxVar16, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                    str5 = str1112;
                    str6 = str1110;
                    str7 = str1111;
                } else {
                    x340Var.b0();
                    str5 = strO0;
                    str6 = strO2;
                    str7 = strO3;
                }
                str8 = strO1;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                }
            }
            strO0 = str;
            int i18 = i6 | i7;
            if ((i2 & 8) == 0) {
                strO1 = str2;
                if (x340Var.g(strO1)) {
                }
                int i19 = i18 | i9;
                if ((i2 & 16) == 0) {
                    strO2 = str3;
                    if (x340Var.g(strO2)) {
                    }
                    int i110 = i19 | i11;
                    if ((i2 & 32) == 0) {
                        strO3 = str4;
                        if (x340Var.g(strO3)) {
                        }
                        i3 = i110 | i13;
                        if ((74899 & i3) != 74898) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (x340Var.Y(i3 & 1, z)) {
                            x340Var.d0();
                            if ((i & 1) != 0) {
                                if ((i2 & 4) != 0) {
                                    strO0 = cwl1.o0(x340Var, 2131960813);
                                    i3 &= -897;
                                }
                                if ((i2 & 8) != 0) {
                                    strO1 = cwl1.o0(x340Var, 2131960810);
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    strO2 = cwl1.o0(x340Var, 2131960812);
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    strO3 = cwl1.o0(x340Var, 2131960811);
                                    i3 &= -458753;
                                }
                            } else {
                                if ((i2 & 4) != 0) {
                                    strO0 = cwl1.o0(x340Var, 2131960813);
                                    i3 &= -897;
                                }
                                if ((i2 & 8) != 0) {
                                    strO1 = cwl1.o0(x340Var, 2131960810);
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    strO2 = cwl1.o0(x340Var, 2131960812);
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    strO3 = cwl1.o0(x340Var, 2131960811);
                                    i3 &= -458753;
                                }
                            }
                            String str1113 = strO2;
                            i4 = i3;
                            String str1114 = strO3;
                            x340Var.s();
                            i3u i3uVar9 = new i3u(5, false, true, false);
                            if ((i4 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objT = x340Var.T();
                            if (z2) {
                                objT = new ivw(function0, (byte) 29);
                                x340Var.s0(objT);
                            } else {
                                objT = new ivw(function0, (byte) 29);
                                x340Var.s0(objT);
                            }
                            z50 z50Var9 = z50.c;
                            zgx zgxVar17 = new zgx(str1113, new gbx(z50Var9, (Function0) objT));
                            i5 = i4 & 112;
                            if (i5 == 32) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            objT2 = x340Var.T();
                            if (z3) {
                                objT2 = new in00(function1, (byte) 0);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new in00(function1, (byte) 0);
                                x340Var.s0(objT2);
                            }
                            zgx zgxVar18 = new zgx(str1114, new gbx(z50Var9, (Function0) objT2));
                            if (i5 == 32) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objT3 = x340Var.T();
                            if (z4) {
                                objT3 = new in00(function1, (byte) 1);
                                x340Var.s0(objT3);
                            } else {
                                objT3 = new in00(function1, (byte) 1);
                                x340Var.s0(objT3);
                            }
                            String str1115 = strO0;
                            mqo1.d((Function0) objT3, i3uVar9, null, str1115, strO1, zgxVar17, zgxVar18, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                            str5 = str1115;
                            str6 = str1113;
                            str7 = str1114;
                        } else {
                            x340Var.b0();
                            str5 = strO0;
                            str6 = strO2;
                            str7 = strO3;
                        }
                        str8 = strO1;
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                        }
                    }
                    strO3 = str4;
                    i3 = i110 | i13;
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i3 & 1, z)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if ((i2 & 4) != 0) {
                                strO0 = cwl1.o0(x340Var, 2131960813);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                strO1 = cwl1.o0(x340Var, 2131960810);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                strO2 = cwl1.o0(x340Var, 2131960812);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                strO3 = cwl1.o0(x340Var, 2131960811);
                                i3 &= -458753;
                            }
                        } else {
                            if ((i2 & 4) != 0) {
                                strO0 = cwl1.o0(x340Var, 2131960813);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                strO1 = cwl1.o0(x340Var, 2131960810);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                strO2 = cwl1.o0(x340Var, 2131960812);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                strO3 = cwl1.o0(x340Var, 2131960811);
                                i3 &= -458753;
                            }
                        }
                        String str1116 = strO2;
                        i4 = i3;
                        String str1117 = strO3;
                        x340Var.s();
                        i3u i3uVar10 = new i3u(5, false, true, false);
                        if ((i4 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT = x340Var.T();
                        if (z2) {
                            objT = new ivw(function0, (byte) 29);
                            x340Var.s0(objT);
                        } else {
                            objT = new ivw(function0, (byte) 29);
                            x340Var.s0(objT);
                        }
                        z50 z50Var10 = z50.c;
                        zgx zgxVar19 = new zgx(str1116, new gbx(z50Var10, (Function0) objT));
                        i5 = i4 & 112;
                        if (i5 == 32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objT2 = x340Var.T();
                        if (z3) {
                            objT2 = new in00(function1, (byte) 0);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new in00(function1, (byte) 0);
                            x340Var.s0(objT2);
                        }
                        zgx zgxVar110 = new zgx(str1117, new gbx(z50Var10, (Function0) objT2));
                        if (i5 == 32) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objT3 = x340Var.T();
                        if (z4) {
                            objT3 = new in00(function1, (byte) 1);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new in00(function1, (byte) 1);
                            x340Var.s0(objT3);
                        }
                        String str1118 = strO0;
                        mqo1.d((Function0) objT3, i3uVar10, null, str1118, strO1, zgxVar19, zgxVar110, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                        str5 = str1118;
                        str6 = str1116;
                        str7 = str1117;
                    } else {
                        x340Var.b0();
                        str5 = strO0;
                        str6 = strO2;
                        str7 = strO3;
                    }
                    str8 = strO1;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                    }
                }
                strO2 = str3;
                int i111 = i19 | i11;
                if ((i2 & 32) == 0) {
                    strO3 = str4;
                    if (x340Var.g(strO3)) {
                    }
                    i3 = i111 | i13;
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i3 & 1, z)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if ((i2 & 4) != 0) {
                                strO0 = cwl1.o0(x340Var, 2131960813);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                strO1 = cwl1.o0(x340Var, 2131960810);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                strO2 = cwl1.o0(x340Var, 2131960812);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                strO3 = cwl1.o0(x340Var, 2131960811);
                                i3 &= -458753;
                            }
                        } else {
                            if ((i2 & 4) != 0) {
                                strO0 = cwl1.o0(x340Var, 2131960813);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                strO1 = cwl1.o0(x340Var, 2131960810);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                strO2 = cwl1.o0(x340Var, 2131960812);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                strO3 = cwl1.o0(x340Var, 2131960811);
                                i3 &= -458753;
                            }
                        }
                        String str1119 = strO2;
                        i4 = i3;
                        String str11110 = strO3;
                        x340Var.s();
                        i3u i3uVar11 = new i3u(5, false, true, false);
                        if ((i4 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT = x340Var.T();
                        if (z2) {
                            objT = new ivw(function0, (byte) 29);
                            x340Var.s0(objT);
                        } else {
                            objT = new ivw(function0, (byte) 29);
                            x340Var.s0(objT);
                        }
                        z50 z50Var11 = z50.c;
                        zgx zgxVar111 = new zgx(str1119, new gbx(z50Var11, (Function0) objT));
                        i5 = i4 & 112;
                        if (i5 == 32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objT2 = x340Var.T();
                        if (z3) {
                            objT2 = new in00(function1, (byte) 0);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new in00(function1, (byte) 0);
                            x340Var.s0(objT2);
                        }
                        zgx zgxVar112 = new zgx(str11110, new gbx(z50Var11, (Function0) objT2));
                        if (i5 == 32) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objT3 = x340Var.T();
                        if (z4) {
                            objT3 = new in00(function1, (byte) 1);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new in00(function1, (byte) 1);
                            x340Var.s0(objT3);
                        }
                        String str11111 = strO0;
                        mqo1.d((Function0) objT3, i3uVar11, null, str11111, strO1, zgxVar111, zgxVar112, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                        str5 = str11111;
                        str6 = str1119;
                        str7 = str11110;
                    } else {
                        x340Var.b0();
                        str5 = strO0;
                        str6 = strO2;
                        str7 = strO3;
                    }
                    str8 = strO1;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                    }
                }
                strO3 = str4;
                i3 = i111 | i13;
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i2 & 4) != 0) {
                            strO0 = cwl1.o0(x340Var, 2131960813);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            strO1 = cwl1.o0(x340Var, 2131960810);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            strO2 = cwl1.o0(x340Var, 2131960812);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            strO3 = cwl1.o0(x340Var, 2131960811);
                            i3 &= -458753;
                        }
                    } else {
                        if ((i2 & 4) != 0) {
                            strO0 = cwl1.o0(x340Var, 2131960813);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            strO1 = cwl1.o0(x340Var, 2131960810);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            strO2 = cwl1.o0(x340Var, 2131960812);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            strO3 = cwl1.o0(x340Var, 2131960811);
                            i3 &= -458753;
                        }
                    }
                    String str11112 = strO2;
                    i4 = i3;
                    String str11113 = strO3;
                    x340Var.s();
                    i3u i3uVar12 = new i3u(5, false, true, false);
                    if ((i4 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT = x340Var.T();
                    if (z2) {
                        objT = new ivw(function0, (byte) 29);
                        x340Var.s0(objT);
                    } else {
                        objT = new ivw(function0, (byte) 29);
                        x340Var.s0(objT);
                    }
                    z50 z50Var12 = z50.c;
                    zgx zgxVar113 = new zgx(str11112, new gbx(z50Var12, (Function0) objT));
                    i5 = i4 & 112;
                    if (i5 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objT2 = x340Var.T();
                    if (z3) {
                        objT2 = new in00(function1, (byte) 0);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new in00(function1, (byte) 0);
                        x340Var.s0(objT2);
                    }
                    zgx zgxVar114 = new zgx(str11113, new gbx(z50Var12, (Function0) objT2));
                    if (i5 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objT3 = x340Var.T();
                    if (z4) {
                        objT3 = new in00(function1, (byte) 1);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new in00(function1, (byte) 1);
                        x340Var.s0(objT3);
                    }
                    String str11114 = strO0;
                    mqo1.d((Function0) objT3, i3uVar12, null, str11114, strO1, zgxVar113, zgxVar114, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                    str5 = str11114;
                    str6 = str11112;
                    str7 = str11113;
                } else {
                    x340Var.b0();
                    str5 = strO0;
                    str6 = strO2;
                    str7 = strO3;
                }
                str8 = strO1;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                }
            }
            strO1 = str2;
            int i112 = i18 | i9;
            if ((i2 & 16) == 0) {
                strO2 = str3;
                if (x340Var.g(strO2)) {
                }
                int i113 = i112 | i11;
                if ((i2 & 32) == 0) {
                    strO3 = str4;
                    if (x340Var.g(strO3)) {
                    }
                    i3 = i113 | i13;
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i3 & 1, z)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if ((i2 & 4) != 0) {
                                strO0 = cwl1.o0(x340Var, 2131960813);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                strO1 = cwl1.o0(x340Var, 2131960810);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                strO2 = cwl1.o0(x340Var, 2131960812);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                strO3 = cwl1.o0(x340Var, 2131960811);
                                i3 &= -458753;
                            }
                        } else {
                            if ((i2 & 4) != 0) {
                                strO0 = cwl1.o0(x340Var, 2131960813);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                strO1 = cwl1.o0(x340Var, 2131960810);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                strO2 = cwl1.o0(x340Var, 2131960812);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                strO3 = cwl1.o0(x340Var, 2131960811);
                                i3 &= -458753;
                            }
                        }
                        String str11115 = strO2;
                        i4 = i3;
                        String str11116 = strO3;
                        x340Var.s();
                        i3u i3uVar13 = new i3u(5, false, true, false);
                        if ((i4 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT = x340Var.T();
                        if (z2) {
                            objT = new ivw(function0, (byte) 29);
                            x340Var.s0(objT);
                        } else {
                            objT = new ivw(function0, (byte) 29);
                            x340Var.s0(objT);
                        }
                        z50 z50Var13 = z50.c;
                        zgx zgxVar115 = new zgx(str11115, new gbx(z50Var13, (Function0) objT));
                        i5 = i4 & 112;
                        if (i5 == 32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objT2 = x340Var.T();
                        if (z3) {
                            objT2 = new in00(function1, (byte) 0);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new in00(function1, (byte) 0);
                            x340Var.s0(objT2);
                        }
                        zgx zgxVar116 = new zgx(str11116, new gbx(z50Var13, (Function0) objT2));
                        if (i5 == 32) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objT3 = x340Var.T();
                        if (z4) {
                            objT3 = new in00(function1, (byte) 1);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new in00(function1, (byte) 1);
                            x340Var.s0(objT3);
                        }
                        String str11117 = strO0;
                        mqo1.d((Function0) objT3, i3uVar13, null, str11117, strO1, zgxVar115, zgxVar116, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                        str5 = str11117;
                        str6 = str11115;
                        str7 = str11116;
                    } else {
                        x340Var.b0();
                        str5 = strO0;
                        str6 = strO2;
                        str7 = strO3;
                    }
                    str8 = strO1;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                    }
                }
                strO3 = str4;
                i3 = i113 | i13;
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i2 & 4) != 0) {
                            strO0 = cwl1.o0(x340Var, 2131960813);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            strO1 = cwl1.o0(x340Var, 2131960810);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            strO2 = cwl1.o0(x340Var, 2131960812);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            strO3 = cwl1.o0(x340Var, 2131960811);
                            i3 &= -458753;
                        }
                    } else {
                        if ((i2 & 4) != 0) {
                            strO0 = cwl1.o0(x340Var, 2131960813);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            strO1 = cwl1.o0(x340Var, 2131960810);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            strO2 = cwl1.o0(x340Var, 2131960812);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            strO3 = cwl1.o0(x340Var, 2131960811);
                            i3 &= -458753;
                        }
                    }
                    String str11118 = strO2;
                    i4 = i3;
                    String str11119 = strO3;
                    x340Var.s();
                    i3u i3uVar14 = new i3u(5, false, true, false);
                    if ((i4 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT = x340Var.T();
                    if (z2) {
                        objT = new ivw(function0, (byte) 29);
                        x340Var.s0(objT);
                    } else {
                        objT = new ivw(function0, (byte) 29);
                        x340Var.s0(objT);
                    }
                    z50 z50Var14 = z50.c;
                    zgx zgxVar117 = new zgx(str11118, new gbx(z50Var14, (Function0) objT));
                    i5 = i4 & 112;
                    if (i5 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objT2 = x340Var.T();
                    if (z3) {
                        objT2 = new in00(function1, (byte) 0);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new in00(function1, (byte) 0);
                        x340Var.s0(objT2);
                    }
                    zgx zgxVar118 = new zgx(str11119, new gbx(z50Var14, (Function0) objT2));
                    if (i5 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objT3 = x340Var.T();
                    if (z4) {
                        objT3 = new in00(function1, (byte) 1);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new in00(function1, (byte) 1);
                        x340Var.s0(objT3);
                    }
                    String str111110 = strO0;
                    mqo1.d((Function0) objT3, i3uVar14, null, str111110, strO1, zgxVar117, zgxVar118, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                    str5 = str111110;
                    str6 = str11118;
                    str7 = str11119;
                } else {
                    x340Var.b0();
                    str5 = strO0;
                    str6 = strO2;
                    str7 = strO3;
                }
                str8 = strO1;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                }
            }
            strO2 = str3;
            int i114 = i112 | i11;
            if ((i2 & 32) == 0) {
                strO3 = str4;
                if (x340Var.g(strO3)) {
                }
                i3 = i114 | i13;
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i2 & 4) != 0) {
                            strO0 = cwl1.o0(x340Var, 2131960813);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            strO1 = cwl1.o0(x340Var, 2131960810);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            strO2 = cwl1.o0(x340Var, 2131960812);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            strO3 = cwl1.o0(x340Var, 2131960811);
                            i3 &= -458753;
                        }
                    } else {
                        if ((i2 & 4) != 0) {
                            strO0 = cwl1.o0(x340Var, 2131960813);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            strO1 = cwl1.o0(x340Var, 2131960810);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            strO2 = cwl1.o0(x340Var, 2131960812);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            strO3 = cwl1.o0(x340Var, 2131960811);
                            i3 &= -458753;
                        }
                    }
                    String str111111 = strO2;
                    i4 = i3;
                    String str111112 = strO3;
                    x340Var.s();
                    i3u i3uVar15 = new i3u(5, false, true, false);
                    if ((i4 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT = x340Var.T();
                    if (z2) {
                        objT = new ivw(function0, (byte) 29);
                        x340Var.s0(objT);
                    } else {
                        objT = new ivw(function0, (byte) 29);
                        x340Var.s0(objT);
                    }
                    z50 z50Var15 = z50.c;
                    zgx zgxVar119 = new zgx(str111111, new gbx(z50Var15, (Function0) objT));
                    i5 = i4 & 112;
                    if (i5 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objT2 = x340Var.T();
                    if (z3) {
                        objT2 = new in00(function1, (byte) 0);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new in00(function1, (byte) 0);
                        x340Var.s0(objT2);
                    }
                    zgx zgxVar1110 = new zgx(str111112, new gbx(z50Var15, (Function0) objT2));
                    if (i5 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objT3 = x340Var.T();
                    if (z4) {
                        objT3 = new in00(function1, (byte) 1);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new in00(function1, (byte) 1);
                        x340Var.s0(objT3);
                    }
                    String str111113 = strO0;
                    mqo1.d((Function0) objT3, i3uVar15, null, str111113, strO1, zgxVar119, zgxVar1110, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                    str5 = str111113;
                    str6 = str111111;
                    str7 = str111112;
                } else {
                    x340Var.b0();
                    str5 = strO0;
                    str6 = strO2;
                    str7 = strO3;
                }
                str8 = strO1;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
                }
            }
            strO3 = str4;
            i3 = i114 | i13;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        strO0 = cwl1.o0(x340Var, 2131960813);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        strO1 = cwl1.o0(x340Var, 2131960810);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        strO2 = cwl1.o0(x340Var, 2131960812);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        strO3 = cwl1.o0(x340Var, 2131960811);
                        i3 &= -458753;
                    }
                } else {
                    if ((i2 & 4) != 0) {
                        strO0 = cwl1.o0(x340Var, 2131960813);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        strO1 = cwl1.o0(x340Var, 2131960810);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        strO2 = cwl1.o0(x340Var, 2131960812);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        strO3 = cwl1.o0(x340Var, 2131960811);
                        i3 &= -458753;
                    }
                }
                String str111114 = strO2;
                i4 = i3;
                String str111115 = strO3;
                x340Var.s();
                i3u i3uVar16 = new i3u(5, false, true, false);
                if ((i4 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT = x340Var.T();
                if (z2) {
                    objT = new ivw(function0, (byte) 29);
                    x340Var.s0(objT);
                } else {
                    objT = new ivw(function0, (byte) 29);
                    x340Var.s0(objT);
                }
                z50 z50Var16 = z50.c;
                zgx zgxVar1111 = new zgx(str111114, new gbx(z50Var16, (Function0) objT));
                i5 = i4 & 112;
                if (i5 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objT2 = x340Var.T();
                if (z3) {
                    objT2 = new in00(function1, (byte) 0);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new in00(function1, (byte) 0);
                    x340Var.s0(objT2);
                }
                zgx zgxVar1112 = new zgx(str111115, new gbx(z50Var16, (Function0) objT2));
                if (i5 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objT3 = x340Var.T();
                if (z4) {
                    objT3 = new in00(function1, (byte) 1);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new in00(function1, (byte) 1);
                    x340Var.s0(objT3);
                }
                String str111116 = strO0;
                mqo1.d((Function0) objT3, i3uVar16, null, str111116, strO1, zgxVar1111, zgxVar1112, x340Var, ((i4 << 3) & 64512) | 2359296, 4);
                str5 = str111116;
                str6 = str111114;
                str7 = str111115;
            } else {
                x340Var.b0();
                str5 = strO0;
                str6 = strO2;
                str7 = strO3;
            }
            str8 = strO1;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new jn00(function0, function1, str5, str8, str6, str7, i, i2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:40:0x007f  */
        public static final void j(vuv0 vuv0Var, Function0 function0, boolean z, b0k b0kVar, int i) {
            boolean z2;
            List listM;
            boolean z3;
            lee1 lee1VarA;
            boolean z4;
            float f;
            String str = vuv0Var.c;
            String str2 = vuv0Var.d;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1793336695);
            int i2 = i | (x340Var.g(vuv0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.h(z) ? 256 : 128);
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                boolean z5 = str2 == null || ihc1.y0(str2);
                boolean z6 = str == null || ihc1.y0(str);
                uuv0 uuv0Var = vuv0Var.m;
                if (uuv0Var != null) {
                    k760 k760Var = uuv0Var.a;
                    if (k760Var.equals(h760.a) || k760Var.equals(f760.a)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    u7h u7hVar = new u7h(u7h.j);
                    long j = u7h.b;
                    listM = p7h.M(new u7h[]{u7hVar, new u7h(u7h.b(j, 0.7f, 0.0f, 0.0f, 0.0f, 14)), new u7h(j)});
                } else {
                    listM = p7h.M(new u7h[]{new u7h(u7h.j), new u7h(u7h.b)});
                }
                qim0 qim0Var = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                boolean z7 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z7 || objT == fkj0.X) {
                    objT = new xet(function0, (byte) 16);
                    x340Var.s0(objT);
                }
                qim0 qim0VarThen = i541.C(qim0VarF, (iu30) objT).then(z ? dug.e(qim0Var, v9c.s(listM, 0.0f, 0.0f, 14), null, 0.0f, 6) : qim0Var);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(qim0VarThen, 16.0f, 0.0f, 16.0f, n660.h, 2);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
                if (z2) {
                    x340Var.i0(-878197515);
                    lee1VarA = lee1.a(cbx.d(x340Var).c, 0L, 0L, FontWeight.f, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777211);
                    z3 = false;
                    x340Var.r(false);
                } else {
                    z3 = false;
                    x340Var.i0(-878195491);
                    lee1VarA = cbx.d(x340Var).c;
                    x340Var.r(false);
                }
                lee1 lee1Var = lee1VarA;
                String str3 = vuv0Var.b;
                if (str3 == null) {
                    str3 = "";
                }
                long j2 = cbx.a(x340Var).b.a;
                cjc0 cjc0Var = new cjc0(3);
                long j3 = n660.a;
                long j4 = n660.b;
                long j5 = n660.g;
                uwo1.e(str3, anm1.N("premium_visual_header_title", qim0Var), lee1Var, j2, null, null, 2, false, cjc0Var, 0, new px8(j3, j4, j5, (mx8) null, 8), x340Var, 0, 8, 688);
                x340Var = x340Var;
                if (z5) {
                    z4 = false;
                    x340Var.i0(-1453527633);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1453749624);
                    op71.g(x340Var, u291.h(qim0Var, cbx.b(x340Var).b.b));
                    if (str2 == null) {
                        str2 = "";
                    }
                    z4 = false;
                    g(str2, x340Var, 0);
                    x340Var.r(false);
                }
                if (z6) {
                    x340Var.i0(-1452798513);
                    x340Var.r(z4);
                } else {
                    x340Var.i0(-1453482745);
                    if (z5) {
                        x340Var.i0(-878164329);
                        cvx cvxVar3 = cbx.b(x340Var).b;
                        x340Var.r(z4);
                        f = 16.0f;
                    } else {
                        x340Var.i0(-878165637);
                        cvx cvxVar4 = cbx.b(x340Var).b;
                        x340Var.r(z4);
                        f = 8.0f;
                    }
                    op71.g(x340Var, u291.h(qim0Var, f));
                    uwo1.e(str != null ? str : "", anm1.N("premium_visual_header_subtitle", qim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, new px8(n660.c, n660.d, j5, (mx8) null, 8), x340Var, 0, 8, 1008);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zs((Object) vuv0Var, (Object) function0, z, i, (byte) 21);
            }
        }

        public static final void k(String str, String str2, hy50 hy50Var, j2i j2iVar, b0k b0kVar, int i) {
            boolean z;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-590662222);
            int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(hy50Var) ? 256 : 128) | (x340Var.i(j2iVar) ? 2048 : 1024);
            if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (hy50Var instanceof fy50) {
                    x340Var.i0(1979346940);
                    dv20.l((i2 >> 9) & 14, j2iVar, x340Var, false);
                    z = true;
                } else {
                    x340Var.i0(1979393068);
                    x340Var.r(false);
                    z = false;
                }
                String str3 = (str == null || ihc1.y0(str)) ? null : str;
                if (str3 == null) {
                    x340Var.i0(1979435289);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1979435290);
                    if (z) {
                        x340Var.i0(1591284573);
                        h(x340Var, 0);
                    } else {
                        x340Var.i0(2085186314);
                    }
                    x340Var.r(false);
                    l(0, 2, str3, x340Var, null);
                    x340Var.r(false);
                    z = true;
                }
                if (str2 == null) {
                    x340Var.i0(1979542425);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1979542426);
                    if (z) {
                        x340Var.i0(-1864313324);
                        h(x340Var, 0);
                    } else {
                        x340Var.i0(-1959133389);
                    }
                    x340Var.r(false);
                    Object objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = wp51.t;
                        x340Var.s0(objT);
                    }
                    l(0, 0, str2, x340Var, s161.b(nim0Var, false, (iu30) objT));
                    x340Var.r(false);
                }
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new pby0(i, str, str2, hy50Var, j2iVar, (byte) 29);
            }
        }

        public static final void l(int i, int i2, String str, b0k b0kVar, qim0 qim0Var) {
            qim0 qim0Var2;
            int i3;
            qim0 qim0Var3;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(2015656997);
            int i4 = i | (x340Var.g(str) ? 4 : 2);
            int i5 = i2 & 2;
            if (i5 != 0) {
                i3 = i4 | 48;
                qim0Var2 = qim0Var;
            } else {
                qim0Var2 = qim0Var;
                i3 = i4 | (x340Var.i(qim0Var2) ? 32 : 16);
            }
            if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
                qim0 qim0Var4 = i5 != 0 ? nim0.a : qim0Var2;
                uwr uwrVar = cbx.a;
                uwo1.e(str, qim0Var4, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, i3 & 126, 0, 1712);
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zmh((byte) 3, i, i2, str, qim0Var3);
            }
        }

        public static final void m(int i, int i2, int i3, b0k b0kVar, qim0 qim0Var) {
            long j;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1675456350);
            int i4 = (x340Var.e(i) ? 4 : 2) | i3 | (x340Var.e(i2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
            if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
                String string = ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getString(2131952262, Integer.valueOf(i + 1), Integer.valueOf(i2));
                qim0 qim0VarZ = u291.z(qim0Var, (fra) null, 3);
                boolean zG = x340Var.g(string);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new w8c(string, (byte) 11);
                    x340Var.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarZ, false, (iu30) objT);
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var, 0);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                x340Var.i0(953723403);
                for (int i5 = 0; i5 < i2; i5++) {
                    if (i5 == i) {
                        x340Var.i0(-264187131);
                        uwr uwrVar = cbx.a;
                        j = cbx.a(x340Var).b.a;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-264134462);
                        uwr uwrVar2 = cbx.a;
                        j = cbx.a(x340Var).b.b;
                        x340Var.r(false);
                    }
                    t1c.a(u291.r(dug.f(i1p1.q(nim0.a, er31.a), j, d4o1.a), 8.0f), x340Var, 0);
                }
                x340Var.r(false);
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new f0e((byte) 0, i, i2, i3, qim0Var);
            }
        }

        public static final void n(i2c i2cVar, af5 af5Var, vnr0 vnr0Var, qim0 qim0Var, phc1 phc1Var, a0e1 a0e1Var, int i, boolean z, iu30 iu30Var, b0k b0kVar, int i2, int i3) {
            i2c i2cVar2;
            int i4;
            a0e1 a0e1Var2;
            int i5;
            boolean z2;
            iu30 iu30Var2;
            b0k b0kVar2;
            phc1 phc1Var2;
            qx8 px8Var;
            phc1 phc1Var3 = phc1Var;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(1705956742);
            if ((i2 & 6) == 0) {
                i2cVar2 = i2cVar;
                i4 = (b0kVar3.i(i2cVar2) ? 4 : 2) | i2;
            } else {
                i2cVar2 = i2cVar;
                i4 = i2;
            }
            if ((i2 & 48) == 0) {
                i4 |= b0kVar3.i(af5Var) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i4 |= b0kVar3.i(vnr0Var) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i4 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
            }
            int i6 = i3 & 8;
            if (i6 != 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= (32768 & i2) == 0 ? b0kVar3.g(phc1Var3) : b0kVar3.i(phc1Var3) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                a0e1Var2 = a0e1Var;
                i4 |= b0kVar3.g(a0e1Var2) ? 131072 : 65536;
            } else {
                a0e1Var2 = a0e1Var;
            }
            if ((1572864 & i2) == 0) {
                i5 = i;
                i4 |= b0kVar3.e(i5) ? 1048576 : 524288;
            } else {
                i5 = i;
            }
            if ((12582912 & i2) == 0) {
                z2 = z;
                i4 |= b0kVar3.h(z2) ? 8388608 : 4194304;
            } else {
                z2 = z;
            }
            if ((100663296 & i2) == 0) {
                iu30Var2 = iu30Var;
                i4 |= b0kVar3.i(iu30Var2) ? 67108864 : 33554432;
            } else {
                iu30Var2 = iu30Var;
            }
            if (b0kVar3.Y(i4 & 1, (38347923 & i4) != 38347922)) {
                b0kVar3.d0();
                if ((i2 & 1) != 0 && !b0kVar3.E()) {
                    b0kVar3.b0();
                } else if (i6 != 0) {
                    phc1Var3 = null;
                }
                phc1 phc1Var4 = phc1Var3;
                b0kVar3.s();
                jor0 jor0Var = vnr0Var.c;
                lee1 lee1Var = vnr0Var.b;
                lee1 lee1VarA = lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, jor0Var instanceof jor0 ? fc11.Y(jor0Var.f, 8589934592L) : lee1Var.a.h, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, phc1Var4, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, mhc0.b, 14663551);
                long j = phc1Var4 != null ? jor0Var.d().b : vnr0Var.d;
                djc0 djc0VarC = jor0Var.c();
                gor0 gor0VarA = jor0Var.a();
                float fD = i2cVar2.d();
                if (u890.j(gor0VarA, for0.a)) {
                    px8Var = ox8.a;
                } else {
                    if (!(gor0VarA instanceof gor0)) {
                        eg.o();
                        return;
                    }
                    int iMin = (int) fD;
                    gor0 gor0Var = gor0VarA;
                    int i7 = gor0Var.d;
                    if (i7 != 0) {
                        iMin = Math.min(i7, iMin);
                    }
                    float f = iMin;
                    px8Var = new px8(fc11.Y(gor0Var.a * f, 4294967296L), fc11.Y(gor0Var.b * f, 4294967296L), gor0Var.c, new mx8(1));
                }
                b0kVar2 = b0kVar3;
                uwo1.d(af5Var, j, qim0Var, lee1VarA, a0e1Var2, iu30Var2, i5, z2, djc0VarC, 0, px8Var, null, b0kVar2, ((i4 >> 3) & 58254) | ((i4 >> 9) & 458752) | (3670016 & i4) | (29360128 & i4), 0, 2560);
                phc1Var2 = phc1Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                phc1Var2 = phc1Var3;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new epr0(i2cVar2, af5Var, vnr0Var, qim0Var, phc1Var2, a0e1Var, i, z, iu30Var, i2, i3);
            }
        }

        public static final void o(up51 up51Var, String str, String str2, Function0 function0, j2i j2iVar, j2i j2iVar2, b0k b0kVar, int i) {
            b0k b0kVar2;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-446652882);
            int i2 = i | (b0kVar3.i(up51Var) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024);
            if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
                Object objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = wp51.X;
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarB = s161.b(nim0.a, false, (iu30) objT);
                uvx uvxVar = new uvx(0, (pgx) null, 3, (vzq0) null, (zzq0) null, (tvx) null, (hw61) null, up51Var.e == 2 ? 2 : 1, (p3v) null, 379);
                String strO0 = cwl1.o0(b0kVar3, 2131959089);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    b0kVar2 = b0kVar3;
                    jto1.b(qim0VarB, uvxVar, null, false, null, null, new gbx(new y50(strO0), function0), null, null, apo.r(-1683574107, new u451(up51Var, (byte) 9), b0kVar3), null, null, apo.r(-519337049, new rv71(j2iVar2, (byte) 22), b0kVar3), null, null, apo.r(-397468566, new kj21(str, up51Var, str2, j2iVar, (byte) 6), b0kVar3), b0kVar2, 805306432, 196992, 28092);
                }
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new wyy0(up51Var, str, str2, function0, j2iVar, j2iVar2, i);
            }
        }

        public static final void p(int i, xgm1 xgm1Var, b0k b0kVar, int i2) {
            int i3;
            xgm1 xgm1Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1229868645);
            int i4 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(xgm1Var) ? 32 : 16);
            if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
                egm1 egm1Var = ((wgm1) rwq.h(xgm1Var.getState(), x340Var, 0).getValue()).c;
                Integer numValueOf = Integer.valueOf(i);
                boolean zI = x340Var.i(egm1Var) | ((i4 & 14) == 4) | x340Var.i(xgm1Var);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    i3 = i;
                    xgm1Var2 = xgm1Var;
                    nf6 nf6Var = new nf6(egm1Var, i3, xgm1Var2, (lnm) null, (byte) 0);
                    x340Var.s0(nf6Var);
                    objT = nf6Var;
                } else {
                    i3 = i;
                    xgm1Var2 = xgm1Var;
                }
                qxd0.s(numValueOf, egm1Var, (vu30) objT, x340Var);
            } else {
                i3 = i;
                xgm1Var2 = xgm1Var;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new of6(i3, xgm1Var2, i2, (byte) 0);
            }
        }

        public static final void q(String str, boolean z, lee1 lee1Var, cjc0 cjc0Var, b0k b0kVar, int i) {
            b0k b0kVar2;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-1334266711);
            int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(lee1Var) ? 256 : 128) | (b0kVar3.i(cjc0Var) ? 2048 : 1024);
            if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
                jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM = b0kVar3.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(b0kVar3, nim0Var);
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
                nko1.H(jw31VarA, b0kVar3, y580.O0);
                nko1.H(xos0VarM, b0kVar3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                nko1.F(b0kVar3);
                nko1.H(qim0VarE, b0kVar3, y580.Y);
                uwr uwrVar = cbx.a;
                b0kVar2 = b0kVar3;
                uwo1.e(str, new wnb0(1.0f, false), lee1Var, cbx.a(b0kVar3).b.a, null, null, 2, false, cjc0Var, 0, null, b0kVar2, (i2 & 910) | ((i2 << 15) & 234881024), 0, 1712);
                if (z) {
                    b0kVar2.i0(519021697);
                    zov0 zov0Var = cbx.b(b0kVar2).g;
                    qim0 qim0VarR = u291.r(nim0Var, 16.0f);
                    Object objT = b0kVar2.T();
                    if (objT == fkj0.X) {
                        objT = wp51.Y;
                        b0kVar2.s0(objT);
                    }
                    w0h1.a(wtx.c, isl.a, s161.b(qim0VarR, false, (iu30) objT), ((wex) ((gmt) zex.a.c).c).b, 0L, true, b0kVar2, wtx.d | 196656, 16);
                    b0kVar2.r(false);
                } else {
                    b0kVar2.i0(519392829);
                    b0kVar2.r(false);
                }
                b0kVar2.r(true);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new zp51(str, z, lee1Var, cjc0Var, i, (byte) 0);
            }
        }

        public static final mgo0 r(String str, jo70 jo70Var) {
            List list;
            Object next;
            if (jo70Var != null && (list = jo70Var.d) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    ho70 ho70Var = (ho70) next;
                    if (!ihc1.y0(ho70Var.a)) {
                        String str2 = ho70Var.b;
                        Set set = s4b1.f;
                        if (uic.g(str2, blc0.m2)) {
                            break;
                        }
                    }
                }
                ho70 ho70Var2 = (ho70) next;
                if (ho70Var2 != null) {
                    return new mgo0(ho70Var2.b, ho70Var2.a, 2, str);
                }
            }
            return null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final Object s(ay8 ay8Var, onm onmVar) throws ItemUnavailableException, AbortFlowException {
            dum dumVar;
            if (onmVar instanceof dum) {
                dumVar = (dum) onmVar;
                int i = dumVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    dumVar.b = i - Integer.MIN_VALUE;
                } else {
                    dumVar = new dum(onmVar);
                }
            } else {
                dumVar = new dum(onmVar);
            }
            Object objJ = dumVar.a;
            int i2 = dumVar.b;
            if (i2 == 0) {
                hm5.M(objJ);
                jte jteVar = new jte(2, (lnm) null, (byte) 8);
                dumVar.b = 1;
                objJ = b5p1.j(ay8Var, jteVar, dumVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            Object objG = u890.G((k1r) objJ);
            if (objG != null) {
                return objG;
            }
            throw new ItemUnavailableException();
        }

        public static tjb0 t(String str) {
            Object next;
            d7 d7Var = new d7(tjb0.d, (byte) 0);
            do {
                if (!d7Var.hasNext()) {
                    next = null;
                    break;
                }
                next = d7Var.next();
            } while (!((tjb0) next).a.equals(str));
            tjb0 tjb0Var = (tjb0) next;
            return tjb0Var == null ? tjb0.b : tjb0Var;
        }

        public static final Bitmap u(String str, int i, int i2, izy0 izy0Var, dzy0 dzy0Var, fzy0 fzy0Var) {
            try {
                LinkedHashMap linkedHashMapM = sqg0.M(new mmr0[]{new mmr0(qax.f, Integer.valueOf(izy0Var.a)), new mmr0(qax.a, fzy0Var.a)});
                String strH = H(dzy0Var, str);
                if (strH != null) {
                    linkedHashMapM.put(qax.b, strH);
                }
                qwa qwaVarJ = new pob((byte) 21, false).j(str, 12, 0, 0, linkedHashMapM);
                int i3 = qwaVarJ.b;
                int i4 = qwaVarJ.a;
                int[] iArr = new int[i4 * i3];
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = i5 * i4;
                    for (int i7 = 0; i7 < i4; i7++) {
                        iArr[i6 + i7] = qwaVarJ.a(i7, i5) ? i : i2;
                    }
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i3, Bitmap.Config.ARGB_8888);
                int i8 = qwaVarJ.a;
                bitmapCreateBitmap.setPixels(iArr, 0, i8, 0, 0, i8, qwaVarJ.b);
                return bitmapCreateBitmap;
            } catch (WriterException | IllegalArgumentException unused) {
                return null;
            }
        }

        public static final List w(n1x n1xVar) {
            g2x g2xVar = (g2x) n1xVar.g.get("clicked");
            return g2xVar != null ? g2xVar.a : z6x.a;
        }

        public static final List x(n1x n1xVar) {
            g2x g2xVar = (g2x) n1xVar.g.get("viewed");
            return g2xVar != null ? g2xVar.a : z6x.a;
        }

        public static final m5d0 y(se6 se6Var, int i, tf6 tf6Var) {
            uf6 uf6Var;
            if (se6Var instanceof qe6) {
                uf6Var = uf6.a;
            } else {
                if (!(se6Var instanceof re6)) {
                    eg.o();
                    return null;
                }
                uf6Var = ((re6) se6Var).b.a;
                if (uf6Var == null) {
                    return null;
                }
            }
            re6 re6Var = se6Var instanceof re6 ? (re6) se6Var : null;
            String str = re6Var != null ? re6Var.b.b : null;
            if (str == null) {
                str = "null";
            }
            return new m5d0(uf6Var, i, str, tf6Var);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001c  */
        public static final mgo0 z(String str, jo70 jo70Var) {
            io70 io70Var;
            if (jo70Var == null || (io70Var = jo70Var.e) == null) {
                return null;
            }
            if (ihc1.y0(io70Var.a)) {
                io70Var = null;
            } else {
                String str2 = io70Var.b;
                Set set = s4b1.f;
                if (!uic.g(str2, blc0.fh)) {
                    io70Var = null;
                }
            }
            if (io70Var != null) {
                return new mgo0(io70Var.b, io70Var.a, 1, str);
            }
            return null;
        }
    }
