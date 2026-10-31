package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class gv40 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gv40(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        synchronized (((d1i0) this.b).b) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005c A[Catch: all -> 0x0021, TryCatch #0 {, blocks: (B:6:0x0017, B:8:0x001b, B:15:0x0027, B:19:0x002d, B:25:0x0039, B:27:0x003d, B:29:0x0043, B:31:0x004d, B:33:0x0057, B:35:0x0068, B:34:0x005c, B:36:0x006a, B:38:0x007e, B:40:0x0086), top: B:48:0x0017 }] */
    private final void b() {
        String strZ;
        TelephonyManager telephonyManager;
        u8o0 u8o0Var = (u8o0) this.b;
        zir zirVar = (zir) u8o0Var.a.get();
        if (zirVar != null) {
            int iB = u8o0Var.c.b();
            ajr ajrVar = zirVar.a;
            synchronized (ajrVar) {
                int i = ajrVar.N0;
                if (i == 0 || ajrVar.e) {
                    if (i != iB || ajrVar.O0 == null) {
                        ajrVar.N0 = iB;
                        if (iB != 1 && iB != 0 && iB != 8) {
                            if (ajrVar.O0 == null) {
                                Context context = ajrVar.a;
                                String str = zoi1.a;
                                if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                                    strZ = eth.Z(Locale.getDefault().getCountry());
                                } else {
                                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (TextUtils.isEmpty(networkCountryIso)) {
                                        strZ = eth.Z(Locale.getDefault().getCountry());
                                    } else {
                                        strZ = eth.Z(networkCountryIso);
                                    }
                                }
                                ajrVar.O0 = strZ;
                            }
                            ajrVar.Y = ajrVar.g(iB);
                            ajrVar.d.getClass();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            ajrVar.h(ajrVar.g > 0 ? (int) (jElapsedRealtime - ajrVar.h) : 0, ajrVar.i, ajrVar.Y);
                            ajrVar.h = jElapsedRealtime;
                            ajrVar.i = 0L;
                            ajrVar.X = 0L;
                            ajrVar.t = 0L;
                            vb91 vb91Var = ajrVar.f;
                            vb91Var.a.clear();
                            vb91Var.b = -1;
                            vb91Var.c = 0;
                            vb91Var.d = 0;
                        }
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hv40 hv40Var = (hv40) this.b;
                mvh0 mvh0Var = hv40Var.b;
                mvh0Var.i(1);
                mvh0Var.e();
                hv40Var.d.removeCallbacks(hv40Var.e);
                cv40 cv40Var = hv40Var.g.a;
                lwh0 lwh0Var = hv40Var.a;
                iwh0 iwh0Var = hv40Var.f;
                cv40Var.getClass();
                Message messageObtainMessage = cv40Var.obtainMessage(266, new iv40(lwh0Var, iwh0Var));
                messageObtainMessage.arg1 = 7;
                messageObtainMessage.sendToTarget();
                return;
            case 1:
                ((fey) this.b).d();
                return;
            case 2:
                ((jc70) this.b).c.A();
                return;
            case 3:
                ar70 ar70Var = (ar70) this.b;
                synchronized (ar70Var.U0) {
                    try {
                        ar70Var.W0 = null;
                        zx70 zx70Var = ar70Var.V0;
                        if (zx70Var != null) {
                            ar70Var.V0 = null;
                            ar70Var.f(zx70Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 4:
                ((h090) this.b).d.b();
                return;
            case 5:
                ((w8a0) this.b).h++;
                return;
            case 6:
                c45 c45Var = (c45) this.b;
                eo41.a("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor  onFailed running callback");
                try {
                    c45Var.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 7:
                f9a0 f9a0Var = (f9a0) this.b;
                try {
                    i9a0 i9a0Var = f9a0Var.d;
                    i9a0Var.u.C(i9a0Var.t, f9a0Var.a());
                    return;
                } catch (RuntimeException unused) {
                    return;
                }
            case 8:
                h9a0 h9a0Var = (h9a0) this.b;
                synchronized (h9a0Var.c) {
                    try {
                        if (h9a0Var.d) {
                            return;
                        }
                        Runnable runnable = (Runnable) h9a0Var.c.pollFirst();
                        h9a0Var.d = runnable != null;
                        while (runnable != null) {
                            try {
                                runnable.run();
                                synchronized (h9a0Var.c) {
                                    runnable = (Runnable) h9a0Var.c.pollFirst();
                                    h9a0Var.d = runnable != null;
                                }
                            } catch (Throwable th4) {
                                synchronized (h9a0Var.c) {
                                    h9a0Var.d = false;
                                    try {
                                        h9a0Var.a.execute(h9a0Var.b);
                                        break;
                                    } catch (RejectedExecutionException unused2) {
                                    }
                                    throw th4;
                                }
                            }
                            break;
                        }
                        return;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            case 9:
                ((NoAnimLauncherActivity) this.b).b = true;
                return;
            case 10:
                faa0 faa0Var = (faa0) this.b;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                    return;
                }
                return;
            case 11:
                gnd0 gnd0Var = (gnd0) this.b;
                if (gnd0Var.e) {
                    gnd0Var.c.k(gnd0Var);
                    gnd0Var.e = false;
                }
                gnd0Var.g = null;
                return;
            case 12:
                qpi1.b((ByteArrayInputStream) this.b);
                return;
            case 13:
                Drawable drawable = (cdf0) this.b;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            case 14:
                ((qdf0) this.b).c();
                return;
            case 15:
                ((MainThreadDisposable) this.b).a();
                return;
            case 16:
                ((tkh0) this.b).f1();
                return;
            case 17:
                ((xuh0) this.b).n = -1;
                return;
            case 18:
                ((mv2) this.b).A();
                return;
            case 19:
                ((jwh0) this.b).b();
                return;
            case 20:
                a();
                return;
            case 21:
                mym0 mym0Var = (mym0) ((yfc0) this.b).b;
                mym0Var.d.d(mym0Var.s);
                return;
            case 22:
                try {
                    ((mym0) this.b).c.i(fn31.N());
                    return;
                } catch (Exception e) {
                    oon1.w("Error releasing GlObjectsProvider", e);
                    return;
                }
            case 23:
                b();
                return;
            case 24:
                ((u7u0) this.b).u--;
                return;
            case 25:
                ((law0) this.b).n();
                return;
            case 26:
                throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", (Throwable) this.b);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((h9d0) this.b).g();
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                yh31.setRippleState$lambda$1((yh31) this.b);
                return;
            default:
                gn31 gn31Var = (gn31) this.b;
                boolean z = ((ymd0) gn31Var).c > 0;
                if (gn31Var.P0.compareAndSet(false, true) && z) {
                    llm llmVar = gn31Var.Y.a;
                    if (llmVar != null) {
                        fn31.T(llmVar, gn31Var.S0, 0, new jn31(gn31Var, null, (byte) 0), 2);
                        return;
                    } else {
                        u890.C("coroutineScope");
                        throw null;
                    }
                }
                return;
        }
    }
}
