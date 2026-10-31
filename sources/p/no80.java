package p;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.graphics.fonts.FontVariationAxis;
import android.hardware.camera2.CameraCaptureSession;
import android.icu.text.ListFormatter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.Window;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.WindowState;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class no80 {
    public static Context a;
    public static Boolean b;
    public static Constructor c;

    public static final String A(c380 c380Var, b0k b0kVar) {
        String strY0;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-337297495);
        if (Build.VERSION.SDK_INT >= 26) {
            x340Var.i0(1793918168);
            Locale locale = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).getLocales().get(0);
            boolean zG = x340Var.g(locale);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = ListFormatter.getInstance(locale);
                x340Var.s0(objT);
            }
            objT.getClass();
            strY0 = ((ListFormatter) objT).format((Collection<?>) c380Var);
            x340Var.r(false);
        } else {
            x340Var.i0(1794110864);
            strY0 = o7h.y0(c380Var, ", ", (String) null, (String) null, (iu30) null, 62);
            x340Var.r(false);
        }
        x340Var.r(false);
        return strY0;
    }

    public static ViewStructure B(ViewStructure viewStructure, int i) {
        return viewStructure.newChild(i);
    }

    public static void C(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }

    public static void D(Window.Callback callback, boolean z) {
        callback.onPointerCaptureChanged(z);
    }

    public static void E(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        context.registerReceiver(broadcastReceiver, intentFilter, 2);
    }

    public static Intent F(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler, int i) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, handler, i);
    }

    public static void G(TextView textView, int i) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(24, i, 1, 2);
    }

    public static void H(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public static void I(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    public static void J(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    public static void K(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public static void L(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void M(ViewStructure viewStructure, boolean z) {
        viewStructure.setDataIsSensitive(z);
    }

    public static void N(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setFocusable(1);
        }
    }

    public static void O(Notification.Builder builder, int i) {
        builder.setGroupAlertBehavior(i);
    }

    public static void P(ViewStructure viewStructure) {
        viewStructure.setInputType(129);
    }

    public static final void Q(StaticLayout.Builder builder, int i) {
        builder.setJustificationMode(i);
    }

    public static void R(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void S(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }

    public static void T(Notification.Builder builder, long j) {
        builder.setTimeoutAfter(j);
    }

    public static CharSequence U(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }

    public static final Bitmap.Config V(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 || i != 3) {
            return (i2 < 26 || i != 4) ? Bitmap.Config.ARGB_8888 : eg.k();
        }
        return eg.c();
    }

    public static final int W(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || config != eg.c()) {
            return (i < 26 || config != eg.k()) ? 0 : 4;
        }
        return 3;
    }

    public static final void a(int i, String str, Function0 function0, b0k b0kVar) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-493745346);
        int i2 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.i(function0) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = ggf1.e;
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, new uvx(1, new kgx(0, (vu30) objT, (vu30) null, (vu30) null, 13), 3, zzq0VarH, (zzq0) null, new tvx(0.0f, 16.0f, 0.0f), d4o1.a, 0, (p3v) null, WindowState.NORMAL), (max) null, false, (idn0) null, ny3.a, new gbx(z50.c, function0), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(1777786103, new dba1(str, (byte) 9), b0kVar3), (xu30) null, (xu30) null, apo.r(1543815290, new dba1(str, (byte) 10), b0kVar3), b0kVar2, 196678, 196992, 28572);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new s721(str, function0, i, (byte) 6);
        }
    }

    public static final void b(c380 c380Var, c380 c380Var2, String str, iu30 iu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-632174575);
        int i2 = i | (b0kVar2.g(c380Var) ? 4 : 2) | (b0kVar2.g(c380Var2) ? 32 : 16) | (b0kVar2.g(str) ? SemanticState.Hidden : SemanticState.Focused) | (b0kVar2.i(iu30Var) ? SemanticState.Modal : SemanticState.ReadOnly) | 24576;
        boolean z = false;
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = b0kVar2.T();
            if (objT == m4cVar) {
                objT = c13.l(false, b0kVar2);
            }
            ven0 ven0Var = (ven0) objT;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar2).f;
            cr31 cr31VarB = er31.b(8.0f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarQ = i1p1.q(uyn1.z(8.0f, 0.0f, 2, qim0VarF), cr31VarB);
            long jC = cbx.a(b0kVar2).a.a.c();
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarF2 = dug.f(qim0VarQ, jC, u5j1Var);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 12.0f);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(z)), een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarX);
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
            String strO0 = cwl1.o0(b0kVar2, 2131963331);
            String strO1 = cwl1.o0(b0kVar2, 2131963329);
            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
            boolean zG = b0kVar2.g(strO0) | b0kVar2.g(strO1);
            Object objT2 = b0kVar2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new rsc1(strO0, strO1, ven0Var, (byte) 17);
                b0kVar2.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarF3, true, (iu30) objT2);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            zzq0 zzq0VarH = uyn1.h(1, 0.0f, 4.0f);
            boolean z2 = (i2 & 7168) == 2048;
            Object objT3 = b0kVar2.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new rc21(iu30Var, ven0Var, (byte) 12);
                b0kVar2.s0(objT3);
            }
            cwl1.b(qim0VarB, (tl3) null, u5j1Var, (pgx) null, zzq0VarH, (max) null, false, (idn0) null, ny3.a, new gbx(z50.c, (Function0) objT3), (gbx) null, apo.r(-2083133052, new nf0(ven0Var, (byte) 8), b0kVar2), b0kVar2, 100663680, 48, 1258);
            b0kVar2 = b0kVar2;
            fq7.b(pbh.a, c(ven0Var), (qim0) null, xay.d((ni20) null, (fra) null, 15), xay.l(15, (ni20) null), (String) null, apo.r(-1054901757, new p8e1(c380Var, c380Var2, str, (byte) 1), b0kVar2), b0kVar2, 1600518, 18);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gmf1(c380Var, c380Var2, str, iu30Var, i);
        }
    }

    public static final boolean c(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(t220 t220Var, iu30 iu30Var, mr20 mr20Var, mr20 mr20Var2, qim0 qim0Var, gpv0 gpv0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1825824641);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(t220Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(mr20Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(mr20Var2) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(gpv0Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                hds0.Companion.getClass();
                objT = gds0.a(t220Var);
                x340Var.s0(objT);
            }
            hds0 hds0Var = (hds0) objT;
            boolean zG = x340Var.g(gpv0Var) | x340Var.g(hds0Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = (gpv0Var == null || gpv0Var.e || gpv0Var.d || !gpv0Var.b.equals(hds0Var)) ? null : gpv0Var;
                x340Var.s0(objT2);
            }
            x340Var.f0(2024172498, hds0Var);
            int i4 = i2 << 6;
            e(t220Var, hds0Var, (gpv0) objT2, iu30Var, mr20Var, mr20Var2, qim0Var, x340Var, (i4 & 7168) | i3 | (57344 & i4) | (458752 & i4) | (i4 & 3670016));
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0(t220Var, iu30Var, mr20Var, mr20Var2, qim0Var, gpv0Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28 */
    public static final void e(t220 t220Var, hds0 hds0Var, gpv0 gpv0Var, iu30 iu30Var, mr20 mr20Var, mr20 mr20Var2, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        b0k b0kVar2;
        lnm lnmVar;
        String str;
        ven0 ven0Var;
        Object dvq0Var;
        rih1 rih1Var;
        Object ntf0Var;
        Function0 function0;
        ees0 ees0Var;
        char c2;
        ?? r12;
        Double d;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1154966972);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(t220Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(hds0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(gpv0Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(mr20Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(mr20Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            Object[] objArr = new Object[0];
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v0r0.V0;
                b0kVar3.s0(objT);
            }
            Bundle bundle = (Bundle) k5p1.s(objArr, (Function0) objT, b0kVar3, 48);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            String str2 = t220Var.b;
            int i3 = t220Var.X;
            float fDoubleValue = (float) ((gpv0Var == null || (d = (Double) gpv0Var.c.getValue()) == null) ? t220Var.Y : d.doubleValue());
            boolean zI = b0kVar3.i(ven0Var2) | b0kVar3.i(gpv0Var) | b0kVar3.i(bundle);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new lz6(ven0Var2, gpv0Var, bundle, (byte) 6);
                b0kVar3.s0(objT3);
            }
            rih1 rih1Var2 = rih1.a;
            qxd0.i(rih1Var2, (iu30) objT3, b0kVar3);
            boolean zI2 = b0kVar3.i(mr20Var) | b0kVar3.i(ven0Var2);
            Object objT4 = b0kVar3.T();
            if (zI2 || objT4 == m4cVar) {
                lnmVar = null;
                objT4 = new cto0(mr20Var, ven0Var2, (lnm) null, (byte) 27);
                b0kVar3.s0(objT4);
            } else {
                lnmVar = null;
            }
            qxd0.t(rih1Var2, b0kVar3, (vu30) objT4);
            boolean zI3 = b0kVar3.i(mr20Var2) | b0kVar3.i(ven0Var2) | b0kVar3.g(str2);
            Object objT5 = b0kVar3.T();
            if (zI3 || objT5 == m4cVar) {
                str = str2;
                ven0Var = ven0Var2;
                rih1Var = rih1Var2;
                dvq0Var = new dvq0(mr20Var2, ven0Var, str, lnmVar, (byte) 8);
                b0kVar3.s0(dvq0Var);
            } else {
                ven0Var = ven0Var2;
                dvq0Var = objT5;
                str = str2;
                rih1Var = rih1Var2;
            }
            qxd0.t(rih1Var, b0kVar3, (vu30) dvq0Var);
            Object objT6 = b0kVar3.T();
            if (objT6 == m4cVar) {
                objT6 = new ees0(gpv0Var, ven0Var, hds0Var, iu30Var);
                b0kVar3.s0(objT6);
            }
            ees0 ees0Var2 = (ees0) objT6;
            int i4 = i2 & 7168;
            boolean z = i4 == 2048;
            Object objT7 = b0kVar3.T();
            if (z || objT7 == m4cVar) {
                objT7 = new g0s0(iu30Var, (byte) 7);
                b0kVar3.s0(objT7);
            }
            Function0 function1 = (Function0) objT7;
            boolean zI4 = b0kVar3.i(gpv0Var) | b0kVar3.g(function1) | (i4 == 2048);
            Object objT8 = b0kVar3.T();
            if (zI4 || objT8 == m4cVar) {
                function0 = function1;
                ees0Var = ees0Var2;
                b0kVar2 = b0kVar3;
                c2 = 2;
                ntf0Var = new ntf0(gpv0Var, ees0Var, function0, iu30Var, (byte) 23);
                b0kVar2.s0(ntf0Var);
            } else {
                ees0Var = ees0Var2;
                b0kVar2 = b0kVar3;
                ntf0Var = objT8;
                c2 = 2;
                function0 = function1;
            }
            qxd0.i(gpv0Var, (iu30) ntf0Var, b0kVar2);
            boolean z2 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: TERNARY (r16v1 'z2' boolean) = (((r18v2 char) == (r2v6 'c2' char) || !(((r13v1 'i3' int) != (1 int) || (r23v0 'gpv0Var' p.gpv0) == (null p.gpv0) || (wrap java.lang.Double:0x01e5: CHECK_CAST (java.lang.Double) (wrap java.lang.Object:0x01e1: INVOKE (wrap p.hrr0:0x01df: IGET (r23v0 'gpv0Var' p.gpv0) A[WRAPPED] (LINE:480) p.gpv0.c p.hrr0) VIRTUAL call: p.hrr0.getValue():java.lang.Object A[WRAPPED] (LINE:482))) == (null java.lang.Double))))) ? true : false in method: p.no80.e(p.t220, p.hds0, p.gpv0, p.iu30, p.mr20, p.mr20, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v2 char
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 828
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.no80.e(p.t220, p.hds0, p.gpv0, p.iu30, p.mr20, p.mr20, p.qim0, p.b0k, int):void");
        }

        public static final void f(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
            qim0 qim0Var2;
            boolean z2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-885848216);
            j06 j06Var = x340Var.a;
            int i2 = (x340Var.h(z) ? 4 : 2) | i | 48;
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                qim0Var2 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
                nko1.H(mbhVarA, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                h(0, 1, x340Var, null);
                if (z) {
                    z2 = true;
                    x340Var.i0(-1079983344);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1080299513);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    qim0 qim0VarO = ab80.o(qim0Var2, 16.0f, x340Var, qim0Var2, 1.0f);
                    jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarO);
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
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    h(0, 0, x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.v(qim0Var2, 16.0f));
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    z2 = true;
                    h(0, 0, x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    x340Var.r(true);
                    x340Var.r(false);
                }
                x340Var.r(z2);
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new uc0(z, qim0Var2, i, (byte) 26);
            }
        }

        public static final void g(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
            x340 x340Var;
            qim0 qim0Var2;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(993816883);
            int i2 = i | (x340Var2.i(function0) ? 4 : 2) | 48;
            if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
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
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                String strO0 = cwl1.o0(x340Var2, 2131959691);
                uwr uwrVar = cbx.a;
                uwo1.e(strO0, (qim0) null, cbx.d(x340Var2).d, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                boolean z = (i2 & 14) == 4;
                Object objT = x340Var2.T();
                if (z || objT == fkj0.X) {
                    objT = new isr0(function0, (byte) 7);
                    x340Var2.s0(objT);
                }
                foo1.c(new gbx(z50.c, (Function0) objT), new idx(13), qim0VarB, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, t6j.a, x340Var2, 0, 48, 2040);
                x340Var = x340Var2;
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new bb50(function0, qim0Var2, i, (byte) 17);
            }
        }

        public static final void h(int i, int i2, b0k b0kVar, qim0 qim0Var) {
            int i3;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1784903928);
            int i4 = i2 & 1;
            if (i4 != 0) {
                i3 = i | 6;
            } else {
                i3 = (x340Var.i(qim0Var) ? 4 : 2) | i;
            }
            if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
                qim0 qim0Var2 = nim0.a;
                if (i4 != 0) {
                    qim0Var = qim0Var2;
                }
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
                uwr uwrVar = cbx.a;
                t1c.a(cwl1.l0(u291.f(u291.h(qim0Var2, cbx.b(x340Var).b.a), 0.3f), 0L, (hw61) null, 15), x340Var, 0);
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var2, 12.0f));
                t1c.a(cwl1.l0(u291.f(u291.h(qim0Var2, 48.0f), 1.0f), 0L, (hw61) null, 15), x340Var, 0);
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new uc0((byte) 27, i, i2, qim0Var);
            }
        }

        public static final void i(c380 c380Var, c380 c380Var2, iu30 iu30Var, qim0 qim0Var, String str, b0k b0kVar, int i) {
            int i2;
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(262477297);
            if ((i & 6) == 0) {
                i2 = (x340Var.g(c380Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.g(c380Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused;
            }
            int i3 = i2 | 3072;
            if ((i & 24576) == 0) {
                i3 |= x340Var.g(str) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
            }
            if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
                nyx.a(2, (wux) null, apo.r(1558900548, new gmf1(c380Var, c380Var2, str, iu30Var), x340Var), x340Var, 3078, 6);
                qim0Var2 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ay71(c380Var, c380Var2, iu30Var, qim0Var2, str, i);
            }
        }

        public static void j(NotificationManager notificationManager, String str) {
            NotificationChannel notificationChannel = new NotificationChannel("default_channel_id", str, 2);
            if (Build.VERSION.SDK_INT <= 27) {
                notificationChannel.setShowBadge(false);
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static int k(ViewStructure viewStructure) {
            return viewStructure.addChildCount(1);
        }

        public static final void l(WebView webView) {
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setDomStorageEnabled(true);
            if (Build.VERSION.SDK_INT >= 26) {
                webView.setImportantForAutofill(1);
            }
            webView.setVerticalScrollBarEnabled(false);
            webView.setBackgroundColor(0);
        }

        public static final Bitmap m(yk4 yk4Var) {
            if (yk4Var instanceof yk4) {
                return yk4Var.a;
            }
            hhg1.h("Unable to obtain android.graphics.Bitmap");
            return null;
        }

        public static final yk4 n(Bitmap bitmap) {
            return new yk4(bitmap);
        }

        public static Notification.Builder o(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static final ej4 p(boolean z) {
            if (Build.VERSION.SDK_INT >= 26) {
                return new ej4(AutofillValue.forToggle(z));
            }
            return null;
        }

        public static Typeface q(File file, Context context, ja30 ja30Var) {
            int size;
            FontVariationAxis[] fontVariationAxisArr;
            FontVariationAxis fontVariationAxisE;
            if (context == null) {
                return null;
            }
            Typeface.Builder builder = new Typeface.Builder(file);
            z1a1.b(context);
            int iQ = mb4.q(context);
            List list = ja30Var.a;
            int i = 0;
            if (iQ == 0) {
                int size2 = list.size();
                fontVariationAxisArr = new FontVariationAxis[size2];
                while (i < size2) {
                    wu7.l();
                    fontVariationAxisArr[i] = wu7.e(((ga30) list.get(i)).b(), ((ga30) list.get(i)).a());
                    i++;
                }
            } else {
                int size3 = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size3) {
                        size = list.size() + 1;
                        break;
                    }
                    if (u890.j(((ga30) list.get(i2)).b(), "wght")) {
                        size = list.size();
                        break;
                    }
                    i2++;
                }
                FontVariationAxis[] fontVariationAxisArr2 = new FontVariationAxis[size];
                while (i < size) {
                    if (i == list.size()) {
                        wu7.l();
                        fontVariationAxisE = new FontVariationAxis("wght", yoi1.o(iQ + 400.0f, 1.0f, 1000.0f));
                    } else if (u890.j(((ga30) list.get(i)).b(), "wght")) {
                        wu7.l();
                        fontVariationAxisE = new FontVariationAxis("wght", yoi1.o(((ga30) list.get(i)).a() + iQ, 1.0f, 1000.0f));
                    } else {
                        wu7.l();
                        fontVariationAxisE = wu7.e(((ga30) list.get(i)).b(), ((ga30) list.get(i)).a());
                    }
                    fontVariationAxisArr2[i] = fontVariationAxisE;
                    i++;
                }
                fontVariationAxisArr = fontVariationAxisArr2;
            }
            return builder.setFontVariationSettings(fontVariationAxisArr).build();
        }

        public static final ej4 r(CharSequence charSequence) {
            if (Build.VERSION.SDK_INT >= 26) {
                return new ej4(AutofillValue.forText(d0p1.l0(charSequence)));
            }
            return null;
        }

        public static Icon s(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }

        public static AutofillValue t(String str) {
            return AutofillValue.forText(d0p1.l0(str));
        }

        public static AutofillValue u(boolean z) {
            return AutofillValue.forToggle(z);
        }

        public static float v(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        public static TextClassifier w(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }

        public static float x(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }

        public static Object y(Class cls, Object obj, Method method, Object[] objArr) throws NoSuchMethodException {
            Constructor declaredConstructor = c;
            if (declaredConstructor == null) {
                declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
                c = declaredConstructor;
            }
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        public static synchronized boolean z(Context context) {
            Boolean boolValueOf;
            Boolean bool;
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            if (wyo1.j()) {
                boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                b = boolValueOf;
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    boolValueOf = Boolean.TRUE;
                    b = boolValueOf;
                } catch (ClassNotFoundException unused) {
                    boolValueOf = Boolean.FALSE;
                    b = boolValueOf;
                }
            }
            a = applicationContext;
            return boolValueOf.booleanValue();
        }
    }
