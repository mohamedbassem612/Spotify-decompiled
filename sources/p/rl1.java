package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import app.p000rive.semantics.SemanticState;
import com.google.firebase.messaging.FirebaseMessaging;
import com.spotify.base.java.logging.Logger;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingFrameLayout;
import com.spotify.nowplayingmodes.adsmode.ui.overlay.AdsOverlayControlsLayout;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rl1 implements qek1, imh0, hx30, cu91 {
    public static HandlerThread f;
    public static Handler g;
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    public rl1(byte b) {
        this.a = b;
        switch (b) {
            case 16:
                this.c = new float[16];
                this.d = new float[16];
                this.e = new w4c0();
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                this.c = ygn0.a();
                this.d = ygn0.a();
                break;
            default:
                this.c = new SparseIntArray[9];
                this.d = new ArrayList();
                this.e = new yj30(this, (byte) 0);
                this.b = true;
                break;
        }
    }

    public static final /* synthetic */ h141 i(rl1 rl1Var) {
        return (h141) rl1Var.d;
    }

    public static void p(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f2 = fArr2[10];
        float f3 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        float f4 = fArr2[10] / fSqrt;
        fArr[0] = f4;
        float f5 = fArr2[8];
        fArr[2] = f5 / fSqrt;
        fArr[8] = (-f5) / fSqrt;
        fArr[10] = f4;
    }

    public Completable A(KeyEvent keyEvent) {
        g510 g510Var = (g510) this.e;
        m210 m210Var = (m210) this.c;
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 126) {
            return g510Var.j(m210Var).ignoreElement();
        }
        if (keyCode != 127) {
            switch (keyCode) {
                case 85:
                    return ((v5u0) this.d).b ? g510Var.d(m210Var).ignoreElement() : g510Var.j(m210Var).ignoreElement();
                case 86:
                    break;
                case 87:
                    return g510Var.n(m210Var).ignoreElement();
                case 88:
                    return g510Var.o(m210Var).ignoreElement();
                default:
                    return CompletableEmpty.a;
            }
        }
        return g510Var.d(m210Var).ignoreElement();
    }

    public q41 B(a11 a11Var) {
        return new q41(new u31((l3f0) this.c, false, (w01) this.d, (n5o) this.e, this.b), (s31) null, a11Var);
    }

    public void C(Object obj) {
        if (this.b) {
            return;
        }
        try {
            ((lqw) this.e).d(obj);
        } catch (Exception e) {
            ((iu30) this.c).invoke(e);
            jah.d();
        }
    }

    public kku D(iu30 iu30Var) {
        ((h141) this.d).a(new gsw(iu30Var));
        return new fsw(this, iu30Var);
    }

    public Boolean E() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        wi20 wi20Var = ((FirebaseMessaging) this.e).a;
        wi20Var.a();
        Context context = wi20Var.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), SemanticState.Focused)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public kov0 F(int i, long j, aru0 aru0Var, boolean z, iu30 iu30Var) {
        Runnable runnable = (mov0) this.e;
        boolean z2 = runnable instanceof ty4;
        kov0 kov0Var = new kov0(this, i, aru0Var, iu30Var);
        kov0Var.d = new hjl(j);
        if (!z2) {
            runnable.a(kov0Var);
        } else if (z) {
            Runnable runnable2 = (ty4) runnable;
            ((ty4) runnable2).b.add(new gow0(1, kov0Var));
            if (!((ty4) runnable2).c) {
                ((ty4) runnable2).c = true;
                ((ty4) runnable2).a.post(runnable2);
            }
        } else {
            Runnable runnable3 = (ty4) runnable;
            ((ty4) runnable3).b.add(new gow0(0, kov0Var));
            if (!((ty4) runnable3).c) {
                ((ty4) runnable3).c = true;
                ((ty4) runnable3).a.post(runnable3);
            }
        }
        d55.k(i, "compose:lazy:schedule_prefetch:index");
        return kov0Var;
    }

    public AnimatorSet G() {
        return jon1.e(p7h.M(new ObjectAnimator[]{ObjectAnimator.ofFloat((View) this.c, "rotationY", 90.0f, 180.0f), ObjectAnimator.ofFloat((View) this.d, "rotationY", -90.0f, -180.0f)}), 0L, ((ntd) this.e).b, 500L, this.b, 2);
    }

    public void H() {
        if (this.b) {
            ((wdd1) this.e).f(new fe(this, (byte) 7));
            this.b = false;
        }
    }

    public void I(String str, String str2, tv80 tv80Var, nk51 nk51Var) {
        lik1 lik1Var = new lik1(str2);
        eoc0 eoc0Var = new eoc0(str, lik1Var, mno1.e, new dpu0((ugo0) null, nk51Var, false, (p860) null));
        if (this.b) {
            ((yhm) this.e).a(eoc0Var, tv80Var);
            return;
        }
        mfm mfmVarA = ((i4q) this.d).a(lik1Var);
        Observable observableA = ((ywc0) this.c).a(eoc0Var);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        mfm.b(mfmVarA, observableA, yon1.a1(), new bjm(4, str, str2), tv80Var, 16);
    }

    public void J() {
        m210 m210Var = (m210) this.c;
        if ("".equals(m210Var.a) || this.b) {
            return;
        }
        this.b = true;
        ((h241) this.e).a(new o710((String) this.d, m210Var, true));
    }

    public boolean K() {
        return this.b;
    }

    public void L() {
        this.b = false;
    }

    public void a(View view) {
        switch (this.a) {
            case 1:
                AdsOverlayControlsLayout adsOverlayControlsLayout = (AdsOverlayControlsLayout) this.e;
                adsOverlayControlsLayout.X0 = false;
                this.b = true;
                View view2 = adsOverlayControlsLayout.R0;
                if (view2 != null) {
                    view2.setAlpha(1.0f);
                }
                adsOverlayControlsLayout.h(false);
                break;
            default:
                OverlayHidingFrameLayout overlayHidingFrameLayout = (OverlayHidingFrameLayout) this.e;
                overlayHidingFrameLayout.O0 = false;
                this.b = true;
                View view3 = overlayHidingFrameLayout.h;
                if (view3 != null) {
                    view3.setAlpha(1.0f);
                }
                overlayHidingFrameLayout.g(false);
                break;
        }
    }

    public void b() {
        rox0 rox0Var = (rox0) this.d;
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add("infoText=" + rox0Var.a);
        smc0VarN.add("actionText=" + rox0Var.b);
        smc0VarN.add("hasOnClickListener=" + (rox0Var.c != null));
        Logger.b("Promobar configuration: ".concat(o7h.y0(k4p1.k(smc0VarN), ";", (String) null, (String) null, (iu30) null, 62)), new Object[0]);
    }

    public boolean c() {
        return false;
    }

    public void d(View view) {
        switch (this.a) {
            case 1:
                ((AdsOverlayControlsLayout) this.e).X0 = false;
                if (!this.b) {
                    ((Function0) this.d).invoke();
                }
                break;
            default:
                ((OverlayHidingFrameLayout) this.e).O0 = false;
                if (!this.b) {
                    ((Function0) this.d).invoke();
                }
                break;
        }
    }

    public void e() {
        switch (this.a) {
            case 1:
                ((AdsOverlayControlsLayout) this.e).X0 = true;
                this.b = false;
                ((Function0) this.c).invoke();
                break;
            default:
                ((OverlayHidingFrameLayout) this.e).O0 = true;
                this.b = false;
                ((Function0) this.c).invoke();
                break;
        }
    }

    public hmh0 f(UUID uuid, xn00 xn00Var) throws MediaDrmCallbackException {
        String str;
        String str2 = xn00Var.b;
        if (this.b || TextUtils.isEmpty(str2)) {
            str2 = (String) this.d;
        }
        if (TextUtils.isEmpty(str2)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            dm5.s(uri, "The uri must be set.");
            throw new MediaDrmCallbackException(new n3r(uri, 0L, 1, null, map, 0L, -1L, null, 0, null), uri, gg11.g, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = whc.f;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = whc.d.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map2.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.e)) {
            map2.putAll((HashMap) this.e);
        }
        return eth.s(((iir) this.c).j(), str2, xn00Var.a, map2);
    }

    public yq91 g(View view, lr91 lr91Var) {
        rox0 rox0Var = (rox0) this.d;
        yq91 yq91VarI = yq91.i(view, rox0Var.a, -2);
        jda jdaVar = ((kda) yq91VarI).c;
        yq91VarI.j(rox0Var.b, rox0Var.c);
        jdaVar.removeAllViews();
        jdaVar.setPadding(0, 0, 0, 0);
        jdaVar.setClipToOutline(true);
        jdaVar.addView((View) rox0Var.d.invoke(jdaVar.getContext(), (sox0) this.c));
        yq91VarI.a(new rqs(this, yq91VarI, (byte) 1));
        return yq91VarI;
    }

    public boolean h() {
        return this.b;
    }

    public void j(int i, String str) {
        n(str, String.valueOf(i));
    }

    public void k(long j, String str) {
        n(str, String.valueOf(j));
    }

    public void l(String str, boolean z) {
        n(str, String.valueOf(z));
    }

    public void m(Object obj, String str) {
        kqi0 kqi0Var = new kqi0((byte) 10);
        ((kqi0) this.e).c = kqi0Var;
        this.e = kqi0Var;
        kqi0Var.d = obj;
        kqi0Var.b = str;
    }

    public void n(String str, String str2) {
        hlm0 hlm0Var = new hlm0((byte) 10);
        ((kqi0) this.e).c = hlm0Var;
        this.e = hlm0Var;
        hlm0Var.d = str2;
        hlm0Var.b = str;
    }

    public void o(boolean z) {
        ceu ceuVar = (ceu) this.e;
        synchronized (ceuVar.h) {
            try {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                if (u890.j(((vdu) this.c).g, this)) {
                    ceuVar.m(this, z);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onFailure(Throwable th) {
        fzh0 fzh0Var = (fzh0) this.e;
        if (th instanceof UnsupportedOperationException) {
            oon1.I("UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
        } else {
            oon1.w("Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
        }
        zoi1.M(fzh0Var.t);
        if (this.b) {
            fzh0Var.v((ixh0) this.c, (m8u0) this.d);
        }
    }

    public void onSuccess(Object obj) {
        fzh0 fzh0Var = (fzh0) this.e;
        ixh0 ixh0Var = (ixh0) this.c;
        boolean z = this.b;
        m8u0 m8u0Var = (m8u0) this.d;
        fzh0Var.x = ixh0Var;
        bai0.f(fzh0Var.t, (jxh0) obj);
        zoi1.M(fzh0Var.t);
        if (z) {
            fzh0Var.v(ixh0Var, m8u0Var);
        }
        fzh0Var.x = null;
    }

    public void q(Object obj, tqw tqwVar) {
        if (this.b) {
            return;
        }
        try {
            ((lqw) this.e).k(obj, tqwVar);
        } catch (Exception e) {
            ((iu30) this.c).invoke(e);
            jah.d();
        }
    }

    public hmh0 r(UUID uuid, zn00 zn00Var) {
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), zn00Var.a, "\"}".getBytes(charset)};
        int length = 0;
        for (int i = 0; i < 3; i++) {
            length += bArr[i].length;
        }
        byte[] bArr2 = new byte[length];
        int length2 = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            byte[] bArr3 = bArr[i2];
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        return eth.s(((iir) this.c).j(), zn00Var.b, bArr2, j380.m("Content-Type", n8i0.i.toString(), "Content-Length", String.valueOf(length)));
    }

    public void s() {
        this.b = true;
        try {
            ((lqw) this.e).dispose();
        } catch (Exception e) {
            ((iu30) this.c).invoke(e);
            jah.d();
        }
    }

    public void t() {
        m210 m210Var = (m210) this.c;
        if ("".equals(m210Var.a) || !this.b) {
            return;
        }
        this.b = false;
        ((h241) this.e).a(new o710((String) this.d, m210Var, false));
    }

    public String toString() {
        switch (this.a) {
            case 23:
                boolean z = this.b;
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.c);
                sb.append('{');
                String str = "";
                for (kqi0 kqi0Var = (kqi0) ((kqi0) this.d).c; kqi0Var != null; kqi0Var = (kqi0) kqi0Var.c) {
                    Object obj = kqi0Var.d;
                    if ((kqi0Var instanceof hlm0) || obj != null || !z) {
                        sb.append(str);
                        String str2 = (String) kqi0Var.b;
                        if (str2 != null) {
                            sb.append(str2);
                            sb.append('=');
                        }
                        if (obj == null || !obj.getClass().isArray()) {
                            sb.append(obj);
                        } else {
                            String strDeepToString = Arrays.deepToString(new Object[]{obj});
                            sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        }
                        str = ", ";
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public s8s0 u(int i) {
        s8s0 s8s0Var;
        ceu ceuVar = (ceu) this.e;
        synchronized (ceuVar.h) {
            if (this.b) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.d)[i] = true;
            Object obj = ((vdu) this.c).d.get(i);
            m5n1.m(ceuVar.Q0, (s8s0) obj);
            s8s0Var = (s8s0) obj;
        }
        return s8s0Var;
    }

    public AnimatorSet v(long j) {
        View view = (View) this.c;
        float f2 = 8000.0f * view.getResources().getDisplayMetrics().density;
        view.setCameraDistance(f2);
        View view2 = (View) this.d;
        view2.setCameraDistance(f2);
        AnimatorSet animatorSetD = jon1.d(p7h.M(new ObjectAnimator[]{ObjectAnimator.ofFloat(view, "rotationY", 0.0f, 90.0f), ObjectAnimator.ofFloat(view2, "rotationY", 0.0f, -90.0f)}), j, ((ntd) this.e).a, 500L, this.b);
        animatorSetD.addListener(new otd(this, (byte) 0));
        return animatorSetD;
    }

    public boolean w() {
        return this.b;
    }

    public Object x() {
        return ((h141) this.d).getState();
    }

    public synchronized void y() {
        try {
            if (this.b) {
                return;
            }
            Boolean boolE = E();
            this.d = boolE;
            if (boolE == null) {
                n9v n9vVar = new n9v((byte) 27);
                v800 v800Var = (hnc1) this.c;
                v800Var.a(v800Var.c, n9vVar);
            }
            this.b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean z() {
        Boolean bool;
        try {
            y();
            bool = (Boolean) this.d;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.e).a.g();
    }

    public /* synthetic */ rl1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = true;
    }

    public /* synthetic */ rl1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ rl1(m210 m210Var, Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = m210Var;
        this.d = obj;
        this.e = obj2;
    }

    public rl1(qe8 qe8Var, qe8 qe8Var2, boolean z, String str) {
        this.a = (byte) 3;
        this.c = qe8Var;
        this.d = qe8Var2;
        this.b = z;
        this.e = str;
    }

    public rl1(mqw mqwVar, Object obj, ipb1 ipb1Var, iu30 iu30Var) {
        this.a = (byte) 12;
        this.c = iu30Var;
        try {
            Object objD = mqwVar.d(obj);
            if (ipb1Var == null) {
                try {
                    ipb1Var = mqwVar.b((Object) null, (dts) null, (String) null);
                } catch (Exception e) {
                    ((iu30) this.c).invoke(e);
                    jah.d();
                    throw null;
                }
            }
            h141 h141Var = new h141(objD, ipb1Var, new v7v(this, (byte) 13));
            this.d = h141Var;
            try {
                this.e = mqwVar.a(obj, h141Var);
            } catch (Exception e2) {
                ((iu30) this.c).invoke(e2);
                jah.d();
                throw null;
            }
        } catch (Exception e3) {
            ((iu30) this.c).invoke(e3);
            jah.d();
            throw null;
        }
    }

    public rl1(sox0 sox0Var, rox0 rox0Var, dp5 dp5Var) {
        this.a = (byte) 28;
        this.c = sox0Var;
        this.d = rox0Var;
        this.e = xox0.b;
        this.b = rox0Var.b != null;
    }

    public rl1(uu00 uu00Var, koc0 koc0Var, y1x0 y1x0Var) {
        this.a = (byte) 19;
        this.c = uu00Var;
        this.d = koc0Var;
        fai0 fai0Var = new fai0();
        fai0Var.m(new ioj0(b7x.a));
        this.e = fai0Var;
    }

    public rl1(av1 av1Var, g7h g7hVar, Single single) {
        this.a = (byte) 9;
        this.c = av1Var;
        this.d = g7hVar;
        this.b = av1Var.b == null;
        this.e = new idd1(new sqm(this, single, (byte) 26));
    }

    public rl1(Context context, Looper looper, Looper looper2, so00 so00Var, rdd1 rdd1Var) {
        this.a = (byte) 2;
        this.c = context.getApplicationContext();
        this.e = rdd1Var.a(looper, (Handler.Callback) null);
        this.d = new to7(this, rdd1Var.a(looper2, (Handler.Callback) null), so00Var);
    }

    public rl1(String str, boolean z, iir iirVar) {
        this.a = (byte) 17;
        dm5.m((z && TextUtils.isEmpty(str)) ? false : true);
        this.c = iirVar;
        this.d = str;
        this.b = z;
        this.e = new HashMap();
    }

    public rl1(String str) {
        this.a = (byte) 23;
        kqi0 kqi0Var = new kqi0((byte) 10);
        this.d = kqi0Var;
        this.e = kqi0Var;
        this.b = false;
        this.c = str;
    }

    public /* synthetic */ rl1(FrameLayout frameLayout, Function0 function0, Function0 function1, byte b) {
        this.a = b;
        this.e = frameLayout;
        this.c = function0;
        this.d = function1;
    }

    public rl1(Function0 function0, nrw0 nrw0Var) {
        this.a = (byte) 24;
        this.c = function0;
        this.d = nrw0Var;
    }

    public rl1(FirebaseMessaging firebaseMessaging, hnc1 hnc1Var) {
        this.a = (byte) 14;
        this.e = firebaseMessaging;
        this.c = hnc1Var;
    }

    public rl1(ceu ceuVar, vdu vduVar) {
        this.a = (byte) 10;
        this.e = ceuVar;
        this.c = vduVar;
        this.d = new boolean[2];
    }

    public rl1(fzh0 fzh0Var, ixh0 ixh0Var, boolean z, m8u0 m8u0Var) {
        this.a = (byte) 22;
        this.e = fzh0Var;
        this.c = ixh0Var;
        this.b = z;
        this.d = m8u0Var;
    }
}
