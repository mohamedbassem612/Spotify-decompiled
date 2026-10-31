package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.ArrayMap;
import android.view.ActionMode;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaSessionManager;
import androidx.work.impl.WorkDatabase;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CallbackExceptionImpl;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class c45 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c45(tph0 tph0Var, MediaSessionManager.RemoteUserInfo remoteUserInfo, MediaBrowserServiceCompat.Result result, String str) {
        this.a = (byte) 27;
        this.b = tph0Var;
        this.c = remoteUserInfo;
        this.d = result;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookServiceException */
    @Override // java.lang.Runnable
    public final void run() throws FacebookServiceException {
        byte b = 3;
        byte b2 = 10;
        byte b3 = 0;
        Bitmap bitmap = null;
        byte b4 = 1;
        switch (this.a) {
            case 0:
                d45 d45Var = (d45) this.b;
                a45 a45Var = (a45) this.c;
                b45 b45Var = (b45) this.d;
                ActionMode actionModeStartActionMode = d45Var.a.startActionMode(new jr20(a45Var), 1);
                d45Var.h = actionModeStartActionMode;
                if (actionModeStartActionMode == null) {
                    b45Var.close();
                    return;
                }
                return;
            case 1:
                em3 em3Var = (em3) this.b;
                ie30 ie30Var = (ie30) this.c;
                iar iarVar = (iar) this.d;
                t38 t38Var = (t38) em3Var.c;
                String str = zoi1.a;
                t38Var.w(ie30Var, iarVar);
                return;
            case 2:
                AudioTrack audioTrack = (AudioTrack) this.b;
                Handler handler = (Handler) this.c;
                h9d0 h9d0Var = (h9d0) this.d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new fe(h9d0Var, b2));
                    }
                    synchronized (o58.r) {
                        try {
                            int i = o58.t - 1;
                            o58.t = i;
                            if (i == 0) {
                                ScheduledExecutorService scheduledExecutorService = o58.s;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                o58.s = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new fe(h9d0Var, b2));
                    }
                    synchronized (o58.r) {
                        try {
                            int i2 = o58.t - 1;
                            o58.t = i2;
                            if (i2 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = o58.s;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                o58.s = null;
                            }
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            case 3:
                d1d d1dVar = (d1d) this.b;
                Executor executor = (Executor) this.c;
                d2d d2dVar = (d2d) this.d;
                a1d a1dVar = d1dVar.x;
                ((HashSet) a1dVar.b).add(d2dVar);
                ((ArrayMap) a1dVar.c).put(d2dVar, executor);
                return;
            case 4:
                ((q2d) this.b).a.onSurfacePrepared((CameraCaptureSession) this.c, (Surface) this.d);
                return;
            case 5:
                WorkDatabase workDatabase = (WorkDatabase) this.b;
                String str2 = (String) this.c;
                awl1 awl1Var = (awl1) this.d;
                Iterator it = ((List) qyo1.x(workDatabase.A().a, true, false, new jfa(str2, (byte) 22))).iterator();
                while (it.hasNext()) {
                    bzn1.l((String) it.next(), awl1Var);
                }
                return;
            case 6:
                zoi1.c0(((fzh0) this.c).l, new e0i((v1k) this.b, (q8l) this.d, b));
                return;
            case 7:
                ohn ohnVar = (ohn) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                jhn jhnVar = ohnVar.h;
                jhnVar.getClass();
                try {
                    ((wh41) jhnVar.d.e).k(str3, str4);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context = jhnVar.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    return;
                }
            case 8:
                aro aroVar = (aro) this.b;
                rye0 rye0Var = (rye0) this.c;
                Bundle bundle = (Bundle) this.d;
                try {
                    aroVar.r(bundle, rye0Var);
                    aroVar.K(rye0Var, bundle, null);
                    return;
                } catch (FacebookException e2) {
                    aroVar.K(rye0Var, null, e2);
                    return;
                }
            case 9:
                lbq lbqVar = (lbq) this.b;
                myc mycVar = (myc) this.c;
                sy21 sy21Var = (sy21) this.d;
                okr okrVar = (okr) lbqVar.c;
                if (okrVar.b.o()) {
                    mycVar.u(okrVar, new IOException("Canceled"));
                    return;
                } else {
                    mycVar.z(okrVar, sy21Var);
                    return;
                }
            case 10:
                ((myc) this.c).u((okr) ((lbq) this.b).c, (Throwable) this.d);
                return;
            case 11:
                ViewGroup viewGroup = (ViewGroup) this.b;
                View view = (View) this.c;
                bss bssVar = (bss) this.d;
                viewGroup.endViewTransition(view);
                ((foa1) bssVar.c.b).c(bssVar);
                return;
            case 12:
                rts rtsVar = (rts) this.b;
                Runnable runnable = (Runnable) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (rtsVar.t) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case 13:
                b9v b9vVar = (b9v) this.b;
                ((c9v) this.c).y(b9vVar.a, b9vVar.b, (Exception) this.d);
                return;
            case 14:
                b9v b9vVar2 = (b9v) this.b;
                c9v c9vVar = (c9v) this.c;
                twa twaVar = (twa) this.d;
                int i3 = b9vVar2.a;
                p2i0 p2i0Var = b9vVar2.b;
                c9vVar.g();
                c9vVar.N(i3, p2i0Var, twaVar);
                return;
            case 15:
                hev hevVar = (hev) this.b;
                Runnable runnable3 = (Runnable) this.c;
                Runnable runnable4 = (Runnable) this.d;
                if (hevVar.f) {
                    runnable3.run();
                    return;
                } else {
                    runnable4.run();
                    return;
                }
            case 16:
                cn3 cn3Var = (cn3) this.b;
                who1 who1Var = (who1) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    r930 r930VarC = new qmr().c(cn3Var.a);
                    if (r930VarC == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    q930 q930Var = (z3x) ((w3x) r930VarC).b;
                    synchronized (q930Var.c) {
                        q930Var.e = threadPoolExecutor;
                        break;
                    }
                    ((z3x) ((w3x) r930VarC).b).a(new d4x(who1Var, threadPoolExecutor));
                    return;
                } catch (Throwable th4) {
                    who1Var.v(th4);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 17:
                FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.b;
                Intent intent = (Intent) this.c;
                bsd1 bsd1Var = (bsd1) this.d;
                try {
                    firebaseMessagingService.b(intent);
                    return;
                } finally {
                    bsd1Var.b((Object) null);
                }
            case 18:
                String str5 = (String) this.b;
                Context context2 = (Context) this.c;
                String str6 = (String) this.d;
                b120 b120Var = b120.a;
                JSONObject jSONObjectA = b120.a();
                if (jSONObjectA.length() != 0) {
                    b120.e(str5, jSONObjectA);
                    context2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str6, jSONObjectA.toString()).apply();
                    b120.e = Long.valueOf(System.currentTimeMillis());
                }
                b120.f();
                b120.b.set(false);
                return;
            case 19:
                ((gr70) this.b).a.a((Bitmap) this.c, (ie30) this.d);
                return;
            case 20:
                u580 u580Var = (u580) this.b;
                b680 b680Var = (b680) this.c;
                Runnable runnable5 = (Runnable) this.d;
                if (dhn.a.contains(u580.class)) {
                    return;
                }
                try {
                    Class cls = u580Var.f;
                    c680.B(u580Var.b, u580Var.g(), u580Var.j, new Object[]{b680Var.a, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new r580(u580Var, b680Var, runnable5))});
                    return;
                } catch (Throwable th5) {
                    dhn.a(u580.class, th5);
                    return;
                }
            case 21:
                v580 v580Var = (v580) this.b;
                b680 b680Var2 = (b680) this.c;
                Runnable runnable6 = (Runnable) this.d;
                if (dhn.a.contains(v580.class)) {
                    return;
                }
                try {
                    Class cls2 = v580Var.o;
                    c680.B(v580Var.b, v580Var.d(), v580Var.q, new Object[]{v580Var.g(b680Var2), Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new t580(v580Var, new Object[]{b680Var2, runnable6}, b4))});
                    return;
                } catch (Throwable th6) {
                    dhn.a(v580.class, th6);
                    return;
                }
            case 22:
                w8a0 w8a0Var = (w8a0) this.b;
                String str7 = (String) this.c;
                j9a0 j9a0Var = (j9a0) this.d;
                eo41.a("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + str7 + " running callback");
                try {
                    i9a0 i9a0Var = ((g9a0) w8a0Var).m;
                    try {
                        j9a0Var.run();
                        break;
                    } catch (Throwable th7) {
                        i9a0Var.b(new CallbackExceptionImpl("Exception received from UploadDataProvider", th7));
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th8) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                    throw th8;
                }
            case 23:
                i9a0 i9a0Var2 = (i9a0) this.b;
                String str8 = (String) this.c;
                v3i1 v3i1Var = (v3i1) this.d;
                String string = URI.create(i9a0Var2.m).resolve(str8).toString();
                i9a0Var2.p = string;
                i9a0Var2.e.add(string);
                i9a0Var2.f(2, 3, new ag20(i9a0Var2, v3i1Var, b2));
                return;
            case 24:
                f9a0 f9a0Var = (f9a0) this.b;
                UrlResponseInfo urlResponseInfo = (UrlResponseInfo) this.c;
                CronetException cronetException = (CronetException) this.d;
                i9a0 i9a0Var3 = f9a0Var.d;
                try {
                    f9a0Var.a.onFailed(i9a0Var3, urlResponseInfo, cronetException);
                    break;
                } catch (Exception unused) {
                    i9a0Var3.y = true;
                }
                f9a0Var.d();
                i9a0Var3.s.e.decrementAndGet();
                return;
            case 25:
                ye90 ye90Var = (ye90) this.b;
                and0 and0Var = (and0) this.c;
                and0 and0Var2 = (and0) this.d;
                kdn0 kdn0Var = (kdn0) ye90Var.b;
                if (and0Var != null) {
                    kdn0Var.k(and0Var);
                }
                kdn0Var.g(and0Var2);
                return;
            case 26:
                n8d0 n8d0Var = (n8d0) this.b;
                em61 em61Var = (em61) this.c;
                yoh0 yoh0Var = (yoh0) this.d;
                try {
                    bitmap = (Bitmap) fc11.C(n8d0Var);
                } catch (CancellationException | ExecutionException e3) {
                    oon1.t("failed to get bitmap", e3);
                }
                em61Var.u(yzb0.a(yoh0Var, bitmap));
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                tph0 tph0Var = (tph0) this.b;
                MediaSessionManager.RemoteUserInfo remoteUserInfo = (MediaSessionManager.RemoteUserInfo) this.c;
                MediaBrowserServiceCompat.Result result = (MediaBrowserServiceCompat.Result) this.d;
                v1k v1kVar = tph0Var.c;
                ixh0 ixh0VarO = v1kVar.o(remoteUserInfo);
                if (ixh0VarO == null) {
                    result.sendResult(null);
                    return;
                } else if (!v1kVar.w(ixh0VarO, 50004)) {
                    result.sendResult(null);
                    return;
                } else {
                    em61 em61VarM0 = zoi1.m0(tph0Var.d.G(ixh0VarO), new nph0(tph0Var, b3));
                    em61VarM0.b(new mph0(em61VarM0, result, b4), l5u.a);
                    return;
                }
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                tph0 tph0Var2 = (tph0) this.b;
                MediaSessionManager.RemoteUserInfo remoteUserInfo2 = (MediaSessionManager.RemoteUserInfo) this.c;
                String str9 = (String) this.d;
                v1k v1kVar2 = tph0Var2.c;
                ixh0 ixh0VarO2 = v1kVar2.o(remoteUserInfo2);
                if (ixh0VarO2 != null && v1kVar2.w(ixh0VarO2, 50002)) {
                    tph0Var2.d.L(ixh0VarO2, str9);
                    String str10 = zoi1.a;
                    return;
                }
                return;
            default:
                ((iqh0) this.b).N((ixh0) this.c, (String) this.d);
                return;
        }
    }

    public /* synthetic */ c45(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
