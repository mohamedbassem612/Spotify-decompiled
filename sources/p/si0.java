package p;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class si0 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ byte a;
    public final Object b;

    public si0() {
        this.a = (byte) 2;
        this.b = Collections.newSetFromMap(new WeakHashMap());
    }

    public static void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException unused) {
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    oz3 oz3Var = (nz3) wi20.c().b(nz3.class);
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (oz3Var != null) {
                        String string = bundle.getString("google.c.a.c_id");
                        oz3 oz3Var2 = oz3Var;
                        if (!dtn1.c.contains("fcm")) {
                            u6o1 u6o1Var = oz3Var2.a.a;
                            u6o1Var.a(new pyn1(u6o1Var, string));
                        }
                        Bundle bundleF = pzm.f("source", "Firebase", "medium", "notification");
                        bundleF.putString("campaign", string);
                        oz3Var2.a("fcm", "_cmp", bundleF);
                    }
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
            }
            fc11.S(bundle, "_no");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ti0 ti0Var = (ti0) obj;
                if (InAppBrowserActivity.class.isInstance(activity)) {
                    bpb1 bpb1Var = ti0Var.a;
                    Boolean bool = Boolean.TRUE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool);
                }
                break;
            case 2:
                Intent intent = activity.getIntent();
                if (intent != null && ((Set) obj).add(intent)) {
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new fss(this, intent, (byte) 23));
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ti0 ti0Var = (ti0) obj;
                if (InAppBrowserActivity.class.isInstance(activity) && !activity.isChangingConfigurations()) {
                    bpb1 bpb1Var = ti0Var.a;
                    Boolean bool = Boolean.FALSE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool);
                    break;
                }
                break;
            case 1:
                ro9 ro9Var = (ro9) obj;
                if (activity == ro9Var.f) {
                    ro9Var.f = null;
                }
                break;
            case 2:
                break;
            default:
                h490 h490Var = (h490) obj;
                if (activity == h490Var.f) {
                    h490Var.c.removeCallbacks(h490Var.i);
                    h490Var.f = null;
                    rl1 rl1Var = h490Var.g;
                    if (rl1Var != null && rl1Var.b) {
                        h490Var.a();
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                ro9 ro9Var = (ro9) obj;
                if (activity == ro9Var.f) {
                    ro9Var.f();
                    ro9Var.c();
                }
                break;
            case 2:
                if (activity.isFinishing()) {
                    ((Set) obj).remove(activity.getIntent());
                }
                break;
            default:
                h490 h490Var = (h490) obj;
                if (activity == h490Var.f) {
                    h490Var.c.removeCallbacks(h490Var.i);
                    h490Var.f = null;
                    rl1 rl1Var = h490Var.g;
                    if (rl1Var != null && rl1Var.b) {
                        h490Var.a();
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                ro9 ro9Var = (ro9) obj;
                ro9Var.f();
                ro9Var.f = activity;
                if (ro9Var.g != null) {
                    ro9Var.b();
                }
                break;
            case 2:
                break;
            default:
                ((h490) obj).c(activity);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        byte b = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        byte b = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        byte b = this.a;
    }

    public /* synthetic */ si0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void d(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void l(Activity activity) {
    }

    private final void m(Activity activity) {
    }

    private final void n(Activity activity) {
    }

    private final void o(Activity activity) {
    }

    private final void p(Activity activity) {
    }

    private final void q(Activity activity) {
    }

    private final void r(Activity activity) {
    }

    private final void s(Activity activity) {
    }

    private final void b(Activity activity, Bundle bundle) {
    }

    private final void c(Activity activity, Bundle bundle) {
    }

    private final void h(Activity activity, Bundle bundle) {
    }

    private final void i(Activity activity, Bundle bundle) {
    }

    private final void j(Activity activity, Bundle bundle) {
    }

    private final void k(Activity activity, Bundle bundle) {
    }
}
