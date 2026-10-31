package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.accountswitching.v1.Account;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class sgc1 {
    public static b180 a;

    public static kss A(ViewGroup viewGroup, th30 th30Var) {
        th30Var.O();
        return z(viewGroup);
    }

    public static LinearLayout B(Context context) {
        int iY = y(context, 2);
        int iY2 = y(context, 6);
        int iY3 = y(context, 8);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(2131430880);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setPaddingRelative(0, iY3, 0, iY3);
        EncoreTextView encoreTextView = new EncoreTextView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        encoreTextView.setId(2131430882);
        encoreTextView.setTextAppearance(2132018024);
        w(encoreTextView, context);
        linearLayout.addView((View) encoreTextView, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(-1, -2));
        EncoreTextView encoreTextView2 = new EncoreTextView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        encoreTextView2.setId(2131430881);
        w(encoreTextView2, context);
        encoreTextView2.setTextAppearance(2132018006);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968791, typedValue, true);
        encoreTextView2.setTextColor(typedValue.data);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = iY;
        layoutParams.bottomMargin = iY2;
        linearLayout.addView((View) encoreTextView2, (ViewGroup.LayoutParams) layoutParams);
        return linearLayout;
    }

    public static RelativeLayout C(Context context) {
        int iY = y(context, 4);
        int iY2 = y(context, 8);
        int iY3 = y(context, 16);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        EncoreTextView encoreTextView = new EncoreTextView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        encoreTextView.setId(2131430884);
        encoreTextView.setTextAppearance(2132018004);
        encoreTextView.setPaddingRelative(iY3, iY2, iY3, iY2);
        w(encoreTextView, context);
        encoreTextView.setSingleLine(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(20);
        relativeLayout.addView((View) encoreTextView, (ViewGroup.LayoutParams) layoutParams);
        ImageButton imageButton = new ImageButton(context);
        imageButton.setId(2131430883);
        imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setAdjustViewBounds(true);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130970193, typedValue, true);
        imageButton.setBackgroundResource(typedValue.resourceId);
        imageButton.setPaddingRelative(iY, 0, iY, 0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginEnd(iY3);
        layoutParams2.addRule(21);
        layoutParams2.addRule(15);
        relativeLayout.addView(imageButton, layoutParams2);
        return relativeLayout;
    }

    public static final qim0 D(int i, qim0 qim0Var) {
        return qim0Var.then(new n890(i, true));
    }

    public static final lbv E(rdv rdvVar) {
        lia1 lia1Var = rdvVar.g;
        qdv qdvVarD = rdvVar.d();
        return new lbv(lia1Var, qdvVarD != null ? qdvVarD.a : null, rdvVar.a);
    }

    public static y550 F() throws Throwable {
        boolean z;
        boolean z2 = false;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (u890.j(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            eg.m("No EGL display");
            return null;
        }
        EGLContext eGLContextEglCreateContext = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        try {
            int[] iArr = new int[2];
            z = true;
            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                throw new IllegalStateException("eglInitialize failed");
            }
            try {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (!EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12339, 1, 12324, 8, 12323, 8, 12322, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                    throw new IllegalStateException("eglChooseConfig failed");
                }
                if (iArr2[0] <= 0) {
                    throw new IllegalStateException("No matching EGL config");
                }
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (eGLConfig == null) {
                    throw new IllegalStateException("Null EGL config");
                }
                eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                if (u890.j(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
                    throw new IllegalStateException("eglCreateContext failed");
                }
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
                if (u890.j(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
                    throw new IllegalStateException("eglCreatePbufferSurface failed");
                }
                if (!EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                    throw new IllegalStateException("eglMakeCurrent failed");
                }
                try {
                    String strGlGetString = GLES20.glGetString(7936);
                    String str = "Unknown";
                    if (strGlGetString == null) {
                        strGlGetString = "Unknown";
                    }
                    String strGlGetString2 = GLES20.glGetString(7937);
                    if (strGlGetString2 != null) {
                        str = strGlGetString2;
                    }
                    y550 y550Var = new y550(strGlGetString, str);
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    if (!u890.j(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                    }
                    if (!u890.j(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                    }
                    return y550Var;
                } catch (Throwable th) {
                    th = th;
                    z2 = true;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        if (z2) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
        }
        if (z) {
            if (!u890.j(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
            }
            if (!u890.j(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
            }
        }
        throw th;
    }

    public static final ld41 G(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1967007413);
        Object[] objArr = new Object[0];
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new el70((byte) 29);
            x340Var.s0(objT);
        }
        ld41 ld41Var = (ld41) k5p1.u(objArr, ld41.e, (Function0) objT, x340Var, 384);
        ld41Var.c = (nd41) x340Var.k(pd41.a);
        x340Var.r(false);
        return ld41Var;
    }

    public static final qim0 H(int i, qim0 qim0Var) {
        return qim0Var.then(new r890(i));
    }

    public static final void a(int i, b0k b0kVar, iu30 iu30Var, c380 c380Var, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        Function0 function0;
        iu30 iu30Var2 = iu30Var;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1896651764);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(iu30Var2) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            d36 d36Var = new d36(16.0f, true, new um5(false));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.f(qim0Var3, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar3);
            nko1.H(xos0VarM, x340Var, lljVar2);
            x0d.q(iHashCode, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE, x340Var, vu30Var);
            uwr uwrVar = cbx.a;
            int i4 = i3;
            boolean z2 = false;
            hr80.d(null, 1.0f, cbx.a(x340Var).a.b.c(), x340Var, 0, 1);
            boolean z3 = true;
            mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function1;
                x340Var.l(function0);
            } else {
                function0 = function1;
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar3);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar, x340Var);
            Iterator itN = kk0.n(x340Var, qim0VarE2, vu30Var, 1104598518, c380Var);
            int i5 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    p7h.T();
                    throw null;
                }
                b10 b10Var = (b10) next;
                fra fraVar = een.N0;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                idn0 idn0Var = (idn0) objT;
                jtr jtrVar = jtr.f;
                int i7 = i4;
                boolean zE = ((i7 & 896) == 256) | x340Var.e(i5) | x340Var.g(b10Var);
                Object objT2 = x340Var.T();
                if (zE || objT2 == m4cVar) {
                    objT2 = new gkl(iu30Var2, i5, b10Var, (byte) 1);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarV = bin.v(qim0VarF, idn0Var, jtrVar, false, (String) null, (pm31) null, (Function0) objT2, 28);
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarV);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar3);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE3, x340Var, vu30Var);
                String str = b10Var.a;
                uwr uwrVar2 = cbx.a;
                x340 x340Var2 = x340Var;
                uwo1.e(str, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                x340Var = x340Var2;
                x340Var.r(true);
                z3 = true;
                i4 = i7;
                qim0Var3 = qim0Var3;
                i5 = i6;
                function0 = function0;
                vu30Var = vu30Var;
                z2 = false;
                iu30Var2 = iu30Var;
            }
            boolean z4 = z3;
            us71.m(x340Var, z2, z4, z4);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ate((byte) 3, i, iu30Var, c380Var, qim0Var2);
        }
    }

    public static final void b(iba0 iba0Var, no90 no90Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, b0k b0kVar, int i) {
        int i2;
        int i3;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1580576844);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iba0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(no90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        int i4 = 196608 & i;
        nim0 nim0Var = nim0.a;
        if (i4 == 0) {
            i2 |= x340Var.i(nim0Var) ? 131072 : 65536;
        }
        int i5 = i2;
        if (x340Var.Y(i5 & 1, (74899 & i5) != 74898)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = v8r.q(no90Var);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = iba0Var.a;
                x340Var.s0(objT2);
            }
            String str = (String) objT2;
            qim0 qim0VarH = l6o1.H(u291.f(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarH);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, qim0VarP);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i6 = i5 & 14;
            g(iba0Var, str, x340Var, i6 | 48);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.a));
            no90 no90Var2 = (no90) ven0Var.getValue();
            boolean zI = x340Var.i(ven0Var) | ((i5 & 7168) == 2048);
            Object objT3 = x340Var.T();
            if (zI || objT3 == obj) {
                objT3 = new gp0(iu30Var2, ven0Var, (byte) 19);
                x340Var.s0(objT3);
            }
            j(iba0Var, no90Var2, str, (iu30) objT3, x340Var, i6 | 384);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            if (iba0Var.e) {
                x340Var.i0(1356349522);
                p((no90) ven0Var.getValue(), iu30Var, function0, x340Var, ((i5 >> 3) & 112) | ((i5 >> 6) & 896));
                x340Var.r(false);
                i3 = 0;
                z = true;
            } else {
                x340Var.i0(1356531182);
                i3 = 0;
                z = true;
                otw.c(new cx0(iu30Var), new fnw0((no90) ven0Var.getValue()), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            }
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.d));
            c(iba0Var.i, x340Var, i3);
            x0d.s(nim0Var, cbx.b(x340Var).b.a, x340Var, z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq(iba0Var, no90Var, iu30Var, iu30Var2, function0, i);
        }
    }

    public static final void c(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2083409152);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            int i3 = z ? 2131956957 : 2131956956;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            uwo1.e(cwl1.o0(x340Var, i3), uyn1.z(cbx.b(x340Var).b.c, 0.0f, 2, qim0VarF), cbx.d(x340Var).m, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k750((byte) 2, i, z);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:106:0x0256  */
    /* JADX WARN: Code duplicated, block: B:107:0x0258  */
    /* JADX WARN: Code duplicated, block: B:110:0x0264  */
    /* JADX WARN: Code duplicated, block: B:112:0x027c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0284  */
    /* JADX WARN: Code duplicated, block: B:115:0x029a  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:120:0x02be  */
    /* JADX WARN: Code duplicated, block: B:122:0x0303  */
    /* JADX WARN: Code duplicated, block: B:95:0x0224  */
    /* JADX WARN: Code duplicated, block: B:99:0x022e  */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean, byte] */
    public static final void d(mpy mpyVar, boolean z, boolean z2, n4b n4bVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var;
        float f;
        boolean z3;
        qim0 qim0VarB;
        j2i j2iVarR;
        j2i j2iVar;
        boolean z4;
        xu30 j2iVar2;
        byte b;
        ?? r9;
        fi fiVar;
        gi giVar;
        String str;
        m4c m4cVar = fkj0.X;
        uwr uwrVar = cbx.a;
        boolean z5 = mpyVar.f;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1132974811);
        int i2 = i | (x340Var2.i(mpyVar) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.h(z2) ? 256 : 128) | (x340Var2.i(n4bVar) ? 2048 : 1024) | (x340Var2.i(iu30Var) ? 16384 : 8192);
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            String strO0 = cwl1.o0(x340Var2, 2131957306);
            lpy lpyVar = mpyVar.a;
            int i3 = mpyVar.g;
            boolean z6 = i3 != 1;
            boolean z7 = i3 == 3;
            if (z) {
                x340Var2.i0(891264601);
                zov0 zov0Var = cbx.b(x340Var2).g;
                x340Var2.r(false);
                f = 48.0f;
            } else {
                x340Var2.i0(891337017);
                zov0 zov0Var2 = cbx.b(x340Var2).g;
                x340Var2.r(false);
                f = 64.0f;
            }
            cvx cvxVar = cbx.b(x340Var2).b;
            zzq0 zzq0Var = new zzq0(12.0f, 0.0f, 12.0f, 0.0f);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            uvx uvxVar = new uvx(1, (pgx) null, 3, zzq0Var, (zzq0) null, new tvx(2.0f, 12.0f, 8.0f), (hw61) null, 0, new p3v(f), 210);
            if (z5) {
                z3 = !z6;
            } else {
                z3 = mpyVar.c;
            }
            qim0 qim0VarF = nim0.a;
            qim0 qim0VarH = pqo.h(qim0VarF, z3);
            if (z6) {
                x340Var2.i0(2132926504);
                boolean zH = x340Var2.h(z7);
                Object objT = x340Var2.T();
                if (zH || objT == m4cVar) {
                    objT = new gy((byte) 24, z7);
                    x340Var2.s0(objT);
                }
                qim0VarB = s161.b(qim0VarF, false, (iu30) objT);
                x340Var2.r(false);
            } else {
                x340Var2.i0(2132927789);
                x340Var2.r(false);
                qim0VarB = qim0VarF;
            }
            qim0 qim0VarThen = qim0VarH.then(qim0VarB);
            if (z7) {
                x340Var2.i0(1696308689);
                long jA = cbx.a(x340Var2).a.a.a();
                cua cuaVar = cbx.b(x340Var2).f;
                qim0VarF = dug.f(qim0VarF, jA, er31.b(4.0f));
                x340Var2.r(false);
            } else {
                x340Var2.i0(1696511739);
                x340Var2.r(false);
            }
            qim0 qim0VarThen2 = qim0VarThen.then(qim0VarF);
            int i4 = i2 & 57344;
            boolean zI = x340Var2.i(mpyVar) | (i4 == 16384) | x340Var2.h(z6);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new gpy(mpyVar, iu30Var, z6, (byte) 0);
                x340Var2.s0(objT2);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT2);
            boolean zI2 = (i4 == 16384) | x340Var2.i(mpyVar) | x340Var2.h(z6);
            Object objT3 = x340Var2.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new gpy(mpyVar, iu30Var, z6, (byte) 1);
                x340Var2.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar2 = new gbx(new y50(strO0), function0);
            j2i j2iVarR2 = null;
            if (z6) {
                x340Var2.i0(2132955279);
                j2iVarR = apo.r(-1705466535, new aw1((byte) 27, z7), x340Var2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1697151640);
                x340Var2.r(false);
                j2iVarR = null;
            }
            String str2 = mpyVar.d;
            Set set = lpyVar.j;
            boolean z8 = lpyVar.n;
            fgx0 fgx0Var = lpyVar.g;
            int i5 = fgx0Var.b;
            if (i5 == 2) {
                j2iVar = j2iVarR;
            } else {
                if (i5 != 3 || fgx0Var.a <= 0) {
                    j2iVar = j2iVarR;
                } else {
                    j2iVar = j2iVarR;
                    if (fgx0Var.c > 0) {
                    }
                    if ((str2 == null && !ihc1.y0(str2)) || j9k1.v(set) || z4) {
                        r9 = 0;
                        boolean z9 = z4;
                        b = 1;
                        j2iVar2 = new j2i(-493734416, new hpy(set, str2, z8, z9, fgx0Var, n4bVar), true);
                    } else {
                        j2iVar2 = null;
                        b = 1;
                        r9 = 0;
                    }
                    fiVar = fi.a;
                    if (z5) {
                        giVar = fiVar;
                    } else {
                        giVar = lpyVar.l;
                    }
                    str = lpyVar.b;
                    if (giVar.equals(ci.a)) {
                        x340Var2.i0(1655063620);
                        j2iVarR2 = apo.r(689594726, new ipy(iu30Var, (byte) r9), x340Var2);
                        x340Var2.r((boolean) r9);
                    } else if (giVar.equals(di.a)) {
                        x340Var2.i0(1655734584);
                        j2iVarR2 = apo.r(1783739229, new ipy(iu30Var, b), x340Var2);
                        x340Var2.r((boolean) r9);
                    } else if (giVar.equals(ei.a)) {
                        x340Var2.i0(1656372595);
                        j2iVarR2 = apo.r(-1787937634, new jpy(str, iu30Var), x340Var2);
                        x340Var2.r((boolean) r9);
                    } else {
                        if (!giVar.equals(fiVar)) {
                            throw p3d1.k(x340Var2, 1161766977, (boolean) r9);
                        }
                        x340Var2.i0(1656607109);
                        x340Var2.r((boolean) r9);
                    }
                    jto1.b(qim0VarThen2, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, gbxVar2, j2iVar, apo.r(-701112932, new o8x(lpyVar, (byte) 8), x340Var2), (xu30) null, j2iVar2, j2iVarR2, (xu30) null, (xu30) null, apo.r(1712233313, new o3(lpyVar, mpyVar, z2, (byte) 16), x340Var2), x340Var2, 805306432, 196608, 25660);
                    x340Var = x340Var2;
                }
                z4 = false;
                if (str2 == null) {
                    j2iVar2 = null;
                    b = 1;
                    r9 = 0;
                } else {
                    j2iVar2 = null;
                    b = 1;
                    r9 = 0;
                }
                fiVar = fi.a;
                if (z5) {
                    giVar = fiVar;
                } else {
                    giVar = lpyVar.l;
                }
                str = lpyVar.b;
                if (giVar.equals(ci.a)) {
                    x340Var2.i0(1655063620);
                    j2iVarR2 = apo.r(689594726, new ipy(iu30Var, (byte) r9), x340Var2);
                    x340Var2.r((boolean) r9);
                } else if (giVar.equals(di.a)) {
                    x340Var2.i0(1655734584);
                    j2iVarR2 = apo.r(1783739229, new ipy(iu30Var, b), x340Var2);
                    x340Var2.r((boolean) r9);
                } else if (giVar.equals(ei.a)) {
                    x340Var2.i0(1656372595);
                    j2iVarR2 = apo.r(-1787937634, new jpy(str, iu30Var), x340Var2);
                    x340Var2.r((boolean) r9);
                } else {
                    if (!giVar.equals(fiVar)) {
                        throw p3d1.k(x340Var2, 1161766977, (boolean) r9);
                    }
                    x340Var2.i0(1656607109);
                    x340Var2.r((boolean) r9);
                }
                jto1.b(qim0VarThen2, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, gbxVar2, j2iVar, apo.r(-701112932, new o8x(lpyVar, (byte) 8), x340Var2), (xu30) null, j2iVar2, j2iVarR2, (xu30) null, (xu30) null, apo.r(1712233313, new o3(lpyVar, mpyVar, z2, (byte) 16), x340Var2), x340Var2, 805306432, 196608, 25660);
                x340Var = x340Var2;
            }
            z4 = true;
            if (str2 == null) {
                j2iVar2 = null;
                b = 1;
                r9 = 0;
            } else {
                j2iVar2 = null;
                b = 1;
                r9 = 0;
            }
            fiVar = fi.a;
            if (z5) {
                giVar = fiVar;
            } else {
                giVar = lpyVar.l;
            }
            str = lpyVar.b;
            if (giVar.equals(ci.a)) {
                x340Var2.i0(1655063620);
                j2iVarR2 = apo.r(689594726, new ipy(iu30Var, (byte) r9), x340Var2);
                x340Var2.r((boolean) r9);
            } else if (giVar.equals(di.a)) {
                x340Var2.i0(1655734584);
                j2iVarR2 = apo.r(1783739229, new ipy(iu30Var, b), x340Var2);
                x340Var2.r((boolean) r9);
            } else if (giVar.equals(ei.a)) {
                x340Var2.i0(1656372595);
                j2iVarR2 = apo.r(-1787937634, new jpy(str, iu30Var), x340Var2);
                x340Var2.r((boolean) r9);
            } else {
                if (!giVar.equals(fiVar)) {
                    throw p3d1.k(x340Var2, 1161766977, (boolean) r9);
                }
                x340Var2.i0(1656607109);
                x340Var2.r((boolean) r9);
            }
            jto1.b(qim0VarThen2, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, gbxVar2, j2iVar, apo.r(-701112932, new o8x(lpyVar, (byte) 8), x340Var2), (xu30) null, j2iVar2, j2iVarR2, (xu30) null, (xu30) null, apo.r(1712233313, new o3(lpyVar, mpyVar, z2, (byte) 16), x340Var2), x340Var2, 805306432, 196608, 25660);
            x340Var = x340Var2;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(mpyVar, z, z2, n4bVar, iu30Var, i, (byte) 11);
        }
    }

    public static final void e(iba0 iba0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-944767896);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iba0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            fc11.a(mqo1.A(iba0Var.b), uyn1.x(nim0.a, 16.0f), hcx.d, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var, 392, 504);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(iba0Var, i, (byte) 4);
        }
    }

    public static final ok4 f(ha4 ha4Var) {
        return new ok4(ha4Var);
    }

    public static final void g(iba0 iba0Var, String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1868498843);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iba0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
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
            nko1.H(qim0VarE, x340Var, y580.Y);
            e(iba0Var, x340Var, i2 & 14);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 12.0f));
            s(str, x340Var, (i2 >> 3) & 14);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            r(x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(iba0Var, str, i, (byte) 10);
        }
    }

    public static final void h(int i, String str, Function0 function0, b0k b0kVar, hux huxVar, boolean z) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1972740392);
        int i2 = i | ((i & 8) == 0 ? b0kVar2.g(huxVar) : b0kVar2.i(huxVar) ? 4 : 2) | (b0kVar2.g(str) ? 32 : 16) | (b0kVar2.h(z) ? 256 : 128) | (b0kVar2.i(function0) ? 2048 : 1024);
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = dgo1.q(u291.f(nim0Var, 1.0f), z, false, new pm31(3), function0, 10);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarY = uyn1.y(qim0VarQ, 12.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
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
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 24.0f), cbx.a(b0kVar2).d.a, 0L, false, b0kVar2, (i2 & 14) | 56, 48);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            b0kVar2 = b0kVar2;
            uwo1.e(str, uyn1.z(12.0f, 0.0f, 2, wnb0Var), cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, (i2 >> 3) & 14, 0, 2032);
            yoi1.b(z, (Function0) null, (qim0) null, false, (idn0) null, b0kVar2, ((i2 >> 6) & 14) | 48, 28);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ynu(huxVar, str, z, function0, i, (byte) 1);
        }
    }

    public static final void i(hux huxVar, String str, boolean z, boolean z2, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1264359377);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(huxVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = dgo1.q(u291.f(nim0Var, 1.0f), z2, false, new pm31(3), function0, 10);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarQ, 12.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 24.0f), cbx.a(x340Var).d.a, 0L, false, x340Var, 56 | (i2 & 14), 48);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, wnb0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
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
            uwo1.e(str, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i2 >> 3) & 14, 0, 2034);
            x340Var = x340Var;
            if (z) {
                x340Var.i0(-1427330812);
                cvx cvxVar4 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 4.0f));
                o(null, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-1427229907);
                x340Var.r(false);
            }
            x340Var.r(true);
            yoi1.b(z2, (Function0) null, (qim0) null, false, (idn0) null, x340Var, ((i2 >> 9) & 14) | 48, 28);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(huxVar, str, z, z2, function0, i);
        }
    }

    public static final void j(iba0 iba0Var, no90 no90Var, String str, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        hux huxVar;
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1740218119);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iba0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(no90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            oa10 oa10Var = iba0Var.f;
            no90 no90Var2 = iba0Var.c;
            if (oa10Var == null || (huxVar = oa10Var.c) == null) {
                huxVar = hmx.c;
            }
            String str2 = oa10Var != null ? oa10Var.a : "";
            qim0 qim0VarF = nho1.F(u291.f(nim0.a, 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            hux huxVar2 = huxVar;
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
            if (iba0Var.e) {
                x340Var.i0(-1406231712);
                String strN0 = cwl1.n0(2131956961, new Object[]{str2}, x340Var);
                boolean z2 = iba0Var.e;
                boolean zJ = u890.j(no90Var, no90Var2);
                boolean zI = ((i2 & 7168) == 2048) | x340Var.i(iba0Var);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    z = false;
                    objT = new zaa0(iu30Var, iba0Var, (byte) 0);
                    x340Var.s0(objT);
                } else {
                    z = false;
                }
                i(huxVar2, strN0, z2, zJ, (Function0) objT, x340Var, 8);
                x340Var = x340Var;
                x340Var.r(z);
            } else {
                z = false;
                x340Var.i0(-1405810050);
                String strN1 = cwl1.n0(2131956961, new Object[]{str2}, x340Var);
                boolean zJ2 = u890.j(no90Var, no90Var2);
                boolean zI2 = x340Var.i(iba0Var) | ((i2 & 7168) == 2048);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new zaa0(iu30Var, iba0Var, (byte) 1);
                    x340Var.s0(objT2);
                }
                h(8, strN1, (Function0) objT2, x340Var, huxVar2, zJ2);
                x340Var.r(false);
            }
            lmx lmxVar = lmx.c;
            String strN2 = cwl1.n0(2131956958, new Object[]{str}, x340Var);
            boolean zJ3 = u890.j(no90Var, iba0Var.d);
            boolean zI3 = x340Var.i(iba0Var) | ((i2 & 7168) == 2048 ? true : z);
            Object objT3 = x340Var.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new zaa0(iu30Var, iba0Var, (byte) 2);
                x340Var.s0(objT3);
            }
            h(lmx.d, strN2, (Function0) objT3, x340Var, lmxVar, zJ3);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, iba0Var, no90Var, str, iu30Var, (byte) 29);
        }
    }

    public static final void k(r7x0 r7x0Var, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(805981464);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(r7x0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            fra fraVar = een.N0;
            qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
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
            y1a1.h(r7x0Var, iu30Var, (qim0) null, x340Var, (i3 & 14) | ((i3 >> 3) & 112));
            aqo1.n(r7x0Var, z, iu30Var, new wnb0(1.0f, true), x340Var, i3 & 1022);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y20(r7x0Var, z, iu30Var, qim0Var2, i, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(o17 o17Var, n6r n6rVar, b0k b0kVar, int i) {
        byte b;
        boolean z;
        Drawable drawable;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1354637216);
        int i2 = (b0kVar2.i(o17Var) ? 4 : 2) | i | (b0kVar2.i(n6rVar) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = o17Var.a().b instanceof xz6;
            qim0 qim0Var = nim0.a;
            qim0 qim0VarQ = z2 ? i1p1.q(qim0Var, er31.a) : qim0Var;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var);
            hzj.A.getClass();
            zvx zvxVar = null;
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
            if (!(o17Var instanceof v07) || (drawable = ((v07) o17Var).a) == null) {
                b0kVar2.i0(503430718);
                String str = o17Var.a().a;
                if (str == null) {
                    str = "";
                }
                Uri uri = Uri.parse(str);
                qim0 qim0VarThen = u291.d(qim0Var, 1.0f).then(qim0VarQ);
                if (z2) {
                    b0kVar2.i0(503679523);
                } else {
                    b0kVar2.i0(-537940735);
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(b0kVar2).f;
                    cua cuaVar2 = cbx.b(b0kVar2).f;
                    zvxVar = new zvx();
                }
                b0kVar2.r(false);
                eso1.e(uri, isl.a, qim0VarThen, null, zvxVar, null, null, null, null, ppo1.l(o17Var, b0kVar2), false, false, b0kVar2, 3120, 0, 3552);
                b0kVar2 = b0kVar2;
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(503190406);
                cwl1.f(x7v.a(drawable, b0kVar2), (String) null, u291.d(qim0Var, 1.0f).then(qim0VarQ), (tl3) null, mif1.P0, 0.0f, (ColorFilter) null, b0kVar2, 24632, Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER);
                b0kVar2.r(false);
            }
            if (n6rVar == null) {
                b0kVar2.i0(503799617);
                b0kVar2.r(false);
                z = true;
            } else {
                b0kVar2.i0(503799618);
                z = true;
                r4p1.c(n6rVar, h2c.a.b(qim0Var), (String) null, b0kVar2, 0, 4);
                b0kVar2.r(false);
            }
            b0kVar2.r(z);
            b = z;
        } else {
            b = 1;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new udy(o17Var, n6rVar, i, b);
        }
    }

    public static final void m(boolean z, j2i j2iVar, j2i j2iVar2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1473808362);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(-1225555272);
            j2iVar.invoke(x340Var, 6);
            x340Var.r(false);
        } else {
            x340Var.i0(-1225517700);
            j2iVar2.invoke(x340Var, 6);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0(z, j2iVar, j2iVar2, i, (byte) 7);
        }
    }

    public static final void n(boolean z, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1739284852);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarX = z ? qim0Var : j9k1.x(s161.a(qim0Var, rfq0.Y0), mgn0.i);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            gfx.b(18, apo.r(2118657265, new k7f((byte) 24, vu30Var, false), x340Var), x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(z, qim0Var, vu30Var, i, (byte) 22);
        }
    }

    public static final void o(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1484159153);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = mr90.Z;
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = s161.b(qim0Var3, true, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            wsx wsxVar = wsx.c;
            qim0 qim0VarR = u291.r(qim0Var3, 16.0f);
            uwr uwrVar = cbx.a;
            w0h1.a(wsxVar, isl.a, qim0VarR, cbx.a(x340Var).b.c, 0L, false, x340Var, wsx.d | 48, 48);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(cwl1.o0(x340Var, 2131956967), (qim0) null, ktd.l(qim0Var3, 4.0f, x340Var, x340Var).k, cbx.a(x340Var).b.c, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1778);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var2, i, (byte) 17);
        }
    }

    public static final void p(no90 no90Var, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        Function0 function1;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(772194818);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(no90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (no90Var != null ? no90Var.a : 0) == 3;
            int i3 = 2131956953;
            if (no90Var != null) {
                if (z) {
                    i3 = 2131955848;
                } else if (no90Var.b.a) {
                    i3 = 2131952475;
                }
            }
            String strO0 = cwl1.o0(b0kVar3, i3);
            jax haxVar = no90Var != null ? jax.a : new hax(strO0);
            if (no90Var == null) {
                b0kVar3.i0(611703221);
                Object objT = b0kVar3.T();
                if (objT == m4cVar) {
                    objT = lx70.Y0;
                    b0kVar3.s0(objT);
                }
                function1 = (Function0) objT;
                b0kVar3.r(false);
            } else if (z) {
                b0kVar3.i0(611771638);
                boolean z2 = (i2 & 896) == 256;
                Object objT2 = b0kVar3.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new aba0(function0, (byte) 0);
                    b0kVar3.s0(objT2);
                }
                function1 = (Function0) objT2;
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(611819378);
                boolean zI = b0kVar3.i(no90Var) | ((i2 & 112) == 32);
                Object objT3 = b0kVar3.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new x680(iu30Var, no90Var, (byte) 16);
                    b0kVar3.s0(objT3);
                }
                function1 = (Function0) objT3;
                b0kVar3.r(false);
            }
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(new y50(strO0), function1), new idx(13), (qim0) null, haxVar, yla.r(b0kVar3), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1001950819, new dz40(strO0, (byte) 26), b0kVar3), b0kVar2, 0, 48, 1996);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60((byte) 17, i, no90Var, function0, iu30Var);
        }
    }

    public static final void q(fgx0 fgx0Var, n4b n4bVar, b0k b0kVar, int i) {
        String str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1497764328);
        int i2 = (x340Var.g(fgx0Var) ? 4 : 2) | i | (x340Var.i(n4bVar) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            long j = fgx0Var.c;
            int i3 = fgx0Var.a;
            ogv ogvVar = (ogv) n4bVar.b;
            ytw0 ytw0Var = jfv.b;
            String str2 = ((rle1) ogvVar.invoke(new jfv(fdg1.l0(j, ngv.d)))).a;
            float f = i3 / 100.0f;
            if (str2.length() > 0) {
                str = str2 + " • " + i3 + "%";
            } else {
                str = i3 + "%";
            }
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var, 48);
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
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            zov0 zov0Var = cbx.b(x340Var).g;
            tto1.d(f, 0, 12, 0L, 0L, x340Var, u291.v(nim0Var, 88.0f));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ozw(fgx0Var, n4bVar, i, (byte) 23);
        }
    }

    public static final void r(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1934118700);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131956964);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2018);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 1);
        }
    }

    public static final void s(String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1879220889);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(cwl1.n0(2131956965, new Object[]{str}, x340Var), uyn1.z(16.0f, 0.0f, 2, qim0VarF), cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ue0((byte) 9, i, str, false);
        }
    }

    public static final void t(String str, boolean z, boolean z2, boolean z3, b0k b0kVar, int i) {
        x340 x340Var;
        long j;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1071286381);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.h(z2) ? 256 : 128) | (x340Var2.h(z3) ? 2048 : 1024);
        if (!x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var = x340Var2;
            x340Var.b0();
        } else if (z) {
            x340Var = x340Var2;
            x340Var.i0(-1208951819);
            x340Var.r(false);
        } else {
            x340Var2.i0(-1209242165);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).g;
            if (z2) {
                x340Var2.i0(-1285930055);
                j = cbx.a(x340Var2).b.c;
            } else {
                x340Var2.i0(-1285928815);
                j = cbx.a(x340Var2).b.a;
            }
            x340Var2.r(false);
            uwo1.e(str, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 2, false, new cjc0(z3 ? 2 : 1), 0, (qx8) null, x340Var2, (i2 & 14) | 1572864, 0, 1714);
            x340Var = x340Var2;
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vdy(str, z, z2, z3, i, (byte) 1);
        }
    }

    public static final long u(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = ofg1.c;
        return jFloatToRawIntBits;
    }

    public static final void v(EncoreButton encoreButton, fec fecVar) {
        encoreButton.setText(fecVar.a);
        Integer num = fecVar.b;
        if (num != null) {
            encoreButton.setTextColor(num.intValue());
        }
        Integer num2 = fecVar.c;
        if (num2 != null) {
            encoreButton.setBackgroundTintList(ColorStateList.valueOf(num2.intValue()));
        }
    }

    public static void w(EncoreTextView encoreTextView, Context context) {
        encoreTextView.setEllipsize(TextUtils.TruncateAt.END);
        encoreTextView.setMaxLines(2);
        encoreTextView.setGravity(8388627);
        encoreTextView.setTextAlignment(1);
        encoreTextView.setTextDirection(5);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968787, typedValue, true);
        encoreTextView.setTextColor(typedValue.data);
    }

    public static final void x(hec hecVar, EncoreButton encoreButton, q881 q881Var, llm llmVar, bpb1 bpb1Var, iu30 iu30Var) {
        v(encoreButton, hecVar.a);
        encoreButton.setOnClickListener(new jl5(llmVar, q881Var, hecVar, iu30Var, (byte) 2));
        fn31.T(llmVar, (o8n) null, 0, new sxa(bpb1Var, hecVar, encoreButton, (lnm) null, (byte) 10), 3);
    }

    public static int y(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static kss z(ViewGroup viewGroup) {
        Object tag = viewGroup.getTag(2131431036);
        if (tag instanceof kss) {
            return (kss) tag;
        }
        kss kssVar = new kss(viewGroup);
        viewGroup.setTag(2131431036, kssVar);
        return kssVar;
    }
}
