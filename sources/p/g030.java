package p;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.session.legacy.PlaybackStateCompat;
import app.p000rive.semantics.SemanticState;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class g030 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g030(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() throws Throwable {
        int largeMemoryClass;
        h4k h4kVar;
        byte b = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((d030) obj).J1();
                return rih1Var;
            case 1:
                wk30 wk30Var = (wk30) obj;
                String str = wk30Var.b;
                vk30 vk30Var = (str == null || !wk30Var.d) ? new vk30(wk30Var.a, wk30Var.b, new il00((byte) 6), wk30Var.c, wk30Var.e) : new vk30(wk30Var.a, new File(wk30Var.a.getNoBackupFilesDir(), str).getAbsolutePath(), new il00((byte) 6), wk30Var.c, wk30Var.e);
                vk30Var.setWriteAheadLoggingEnabled(wk30Var.g);
                return vk30Var;
            case 2:
                return ((x340) obj).o();
            case 3:
                a840 a840Var = (a840) obj;
                if (a840Var.b) {
                    Object objL = a840Var.a.l(rih1Var);
                    if (objL instanceof pge) {
                        if (!(objL instanceof oge)) {
                            eg.m("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
                            return null;
                        }
                        Throwable th = ((oge) objL).a;
                        if (th != null) {
                            throw th;
                        }
                        eg.m("Trying to call 'getOrThrow' on a channel closed without a cause");
                        return null;
                    }
                }
                return rih1Var;
            case 4:
                wr40 wr40Var = (wr40) obj;
                a080 a080Var = wr40Var.a;
                dqq0 dqq0Var = wr40Var.b;
                a080 a080VarL = ucp1.l(a080Var, true);
                try {
                    Movie movieDecodeStream = Movie.decodeStream(a080VarL.d1().h1());
                    o0c.v(a080VarL, (Throwable) null);
                    if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                        eg.m("Failed to decode GIF.");
                        return null;
                    }
                    dpm0 dpm0Var = new dpm0(movieDecodeStream, (movieDecodeStream.isOpaque() && ((Boolean) kto1.v(dqq0Var, dz70.g)).booleanValue()) ? Bitmap.Config.RGB_565 : fpi1.x(dz70.a(dqq0Var)) ? Bitmap.Config.ARGB_8888 : (Bitmap.Config) kto1.v(dqq0Var, dz70.b), dqq0Var.c);
                    jc10 jc10Var = vpb1.a;
                    if (((Number) kto1.v(dqq0Var, jc10Var)).intValue() != -2) {
                        int iIntValue = ((Number) kto1.v(dqq0Var, jc10Var)).intValue();
                        if (iIntValue < -1) {
                            hhg1.f(f4i1.c(iIntValue, "Invalid repeatCount: "));
                            return null;
                        }
                        dpm0Var.Q0 = iIntValue;
                    }
                    Function0 function0 = (Function0) kto1.v(dqq0Var, vpb1.c);
                    Function0 function1 = (Function0) kto1.v(dqq0Var, vpb1.d);
                    if (function0 != null || function1 != null) {
                        dpm0Var.e.add(new tpi1(function0, function1));
                    }
                    if (kto1.v(dqq0Var, vpb1.b) != null) {
                        bhn0.d();
                        return null;
                    }
                    dpm0Var.R0 = null;
                    dpm0Var.S0 = 1;
                    dpm0Var.T0 = false;
                    dpm0Var.invalidateSelf();
                    return new y9r(x2p1.h(dpm0Var), false);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        o0c.v(a080VarL, th2);
                        throw th3;
                    }
                }
            case 5:
                z170 z170Var = (z170) obj;
                z170Var.getClass();
                try {
                    z170Var.X0.g(2, 0, false);
                    break;
                } catch (IOException e) {
                    z170Var.a(2, 2, e);
                }
                return rih1Var;
            case 6:
                Context context = (Context) ((u9c) obj).f;
                double d = 0.2d;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    hhg1.n("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                up20 up20Var = new up20((byte) 5);
                try {
                    Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService2.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = SemanticState.Hidden;
                }
                return new wf01(new upb((long) (d * ((long) largeMemoryClass) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED), up20Var), up20Var);
            case 7:
                return Float.valueOf(wwo1.C(((c9n) obj).J()));
            case 8:
                return (InputMethodManager) ((View) ((st60) obj).d).getContext().getSystemService("input_method");
            case 9:
                return (InputMethodManager) ((View) ((oj80) obj).b).getContext().getSystemService("input_method");
            case 10:
                en31 en31Var = ((ec90) obj).a;
                if (en31Var.m() && !en31Var.q()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                q6b0 q6b0Var = ((qma0) obj).a;
                q6b0 q6b0Var2 = q6b0Var instanceof q6b0 ? q6b0Var : null;
                if (q6b0Var2 != null) {
                    return q6b0Var2.findJavaDeclaration();
                }
                return null;
            case 12:
                nmb0 nmb0Var = (nmb0) obj;
                if (!((Boolean) nmb0Var.g.getValue()).booleanValue() && (h4kVar = nmb0Var.c) != null) {
                    h4kVar.o();
                }
                return rih1Var;
            case 13:
                return Integer.valueOf(((lpb0) ((upb0) obj).e.getValue()).m);
            case 14:
                iku ikuVar = ((bsb0) obj).j;
                if (ikuVar != null) {
                    ha71.x(ikuVar);
                }
                return rih1Var;
            case 15:
                return new BaseInputConnection(((s1c0) obj).a, false);
            case 16:
                ((wac0) obj).a.c();
                return rih1Var;
            case 17:
                vug0 vug0Var = (vug0) obj;
                err0 err0Var = vug0Var.S0;
                if (err0Var.s() <= vug0Var.T0.s()) {
                    return null;
                }
                if (((jug0) vug0Var.Y0.getValue()).a != 1 || ((Boolean) vug0Var.U0.getValue()).booleanValue()) {
                    return Float.valueOf(vug0Var.H1() + err0Var.s());
                }
                return null;
            case 18:
                ((tdm0) obj).d.invoke();
                return rih1Var;
            case 19:
                rim0 rim0Var = (rim0) obj;
                rim0Var.f = false;
                HashSet hashSet = new HashSet();
                wdn0 wdn0Var = rim0Var.d;
                if (wdn0Var != null) {
                    Object[] objArr = wdn0Var.a;
                    int i = wdn0Var.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        hmb0 hmb0Var = (hmb0) objArr[i2];
                        wdn0 wdn0Var2 = rim0Var.e;
                        if (wdn0Var2 == null) {
                            wdn0Var2 = new wdn0();
                            rim0Var.e = wdn0Var2;
                        }
                        yky0 yky0Var = (yky0) wdn0Var2.g(i2);
                        pim0 pim0Var = (pim0) hmb0Var.e1.g;
                        if (pim0Var.N0) {
                            rim0.b(pim0Var, yky0Var);
                        }
                    }
                    wdn0Var.e();
                    wdn0 wdn0Var3 = rim0Var.e;
                    if (wdn0Var3 != null) {
                        wdn0Var3.e();
                    }
                }
                wdn0 wdn0Var4 = rim0Var.b;
                if (wdn0Var4 != null) {
                    Object[] objArr2 = wdn0Var4.a;
                    int i3 = wdn0Var4.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        t0a t0aVar = (t0a) objArr2[i4];
                        wdn0 wdn0Var5 = rim0Var.c;
                        if (wdn0Var5 == null) {
                            wdn0Var5 = new wdn0();
                            rim0Var.c = wdn0Var5;
                        }
                        yky0 yky0Var2 = (yky0) wdn0Var5.g(i4);
                        if (((pim0) t0aVar).N0) {
                            rim0.b(t0aVar, yky0Var2);
                        }
                    }
                    wdn0Var4.e();
                    wdn0 wdn0Var6 = rim0Var.c;
                    if (wdn0Var6 != null) {
                        wdn0Var6.e();
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((t0a) it.next()).J1();
                }
                return rih1Var;
            case 20:
                return ((g6o0) obj).d;
            case 21:
                return ((l6o0) obj).H1();
            case 22:
                return (mf01) ((rf01) obj).a.e.getValue();
            case 23:
                ndo0 ndo0Var = (ndo0) obj;
                fid fidVar = ndo0Var.r1;
                fidVar.getClass();
                ndo0Var.W0(fidVar, ndo0Var.q1);
                return rih1Var;
            case 24:
                return new lxc((cxc) ((d4e) obj).b);
            case 25:
                tcv0 tcv0Var = (tcv0) obj;
                return new kbm(omo1.k("kotlinx.serialization.Polymorphic", qcv0.h, new h661[0], new waq0((Object) tcv0Var, (byte) 4)), tcv0Var.a);
            case 26:
                return Boolean.valueOf(ifv0.y((ifv0) obj));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                w4n1.b((pil1) obj);
                return rih1Var;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                jf01 jf01Var = ((ig01) obj).h;
                jf01Var.getClass();
                jf01Var.cancel();
                return rih1Var;
            default:
                q511 q511Var = (q511) obj;
                q511Var.i = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    q511Var.a();
                    return rih1Var;
                } finally {
                    Trace.endSection();
                }
        }
    }
}
