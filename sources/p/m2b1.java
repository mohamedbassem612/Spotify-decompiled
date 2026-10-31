package p;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.webkit.WebView;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class m2b1 extends pzo implements ysk {
    public ynb0 b;
    public ynb0 c;
    public kly0 d;
    public ynb0 e;
    public kly0 f;
    public final idd1 g = new idd1(new gga1(this, (byte) 8));

    static {
        nxg.a().c();
        i94 i94VarA = nxg.a();
        String string = c2u.a.toString();
        t45 t45Var = i94VarA.e;
        if (t45Var != null) {
            t45Var.b("diagnostic_session_id", string);
        }
    }

    public static void c(String str) {
        Logger.b(str, new Object[0]);
        xh7 xh7Var = xh7.d;
        IllegalStateException illegalStateException = new IllegalStateException(str);
        xh7Var.getClass();
        fns fnsVar = igu.a;
        fn31.T(ov40.a, b3s.c, 0, new wc5(xh7Var, illegalStateException, (lnm) null, (byte) 11), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        String processName;
        i94 i94VarA = nxg.a();
        i94VarA.a("app_init");
        i94VarA.e("application_attach_base_context");
        super/*android.content.ContextWrapper*/.attachBaseContext(context);
        SplitCompat.install(this);
        if (Build.VERSION.SDK_INT >= 28 && (processName = Application.getProcessName()) != null) {
            if (processName.equals(context.getPackageName())) {
                WebView.setDataDirectorySuffix("main_" + Process.myPid());
            } else {
                WebView.setDataDirectorySuffix(processName);
            }
        }
        i94 i94VarA2 = nxg.a();
        if (i94VarA2.n == null) {
            i94VarA2.n = Boolean.valueOf(f15.a(this));
        }
        i94VarA2.a("application_attach_base_context");
        i94VarA2.e("content_providers_on_create");
    }

    public final btk b() {
        i6b i6bVar = new i6b((byte) 17);
        ynb0 ynb0Var = this.c;
        if (ynb0Var != null) {
            i6bVar.b = new vvb0(ynb0Var);
            return new btk(i6bVar);
        }
        u890.C("musicAppWorkerFactory");
        throw null;
    }

    public final void onCreate() throws InterruptedException {
        char c;
        String str;
        i94 i94VarA = nxg.a();
        i94VarA.a("content_providers_on_create");
        i94VarA.e("application_on_create");
        t45 t45Var = i94VarA.e;
        if (t45Var != null) {
            switch (new ActivityManager.RunningAppProcessInfo().importance) {
                case 100:
                    c = 3;
                    break;
                case 125:
                    c = 4;
                    break;
                case 130:
                    c = 7;
                    break;
                case 150:
                    c = '\n';
                    break;
                case 200:
                    c = 11;
                    break;
                case 230:
                    c = 6;
                    break;
                case 300:
                    c = '\b';
                    break;
                case 325:
                    c = '\t';
                    break;
                case 350:
                    c = 2;
                    break;
                case 400:
                    c = 1;
                    break;
                case 1000:
                    c = 5;
                    break;
                default:
                    c = '\f';
                    break;
            }
            switch (c) {
                case 1:
                    str = "IMPORTANCE_CACHED";
                    break;
                case 2:
                    str = "IMPORTANCE_CANT_SAVE_STATE";
                    break;
                case 3:
                    str = "IMPORTANCE_FOREGROUND";
                    break;
                case 4:
                    str = "IMPORTANCE_FOREGROUND_SERVICE";
                    break;
                case 5:
                    str = "IMPORTANCE_GONE";
                    break;
                case 6:
                    str = "IMPORTANCE_PERCEPTIBLE";
                    break;
                case 7:
                    str = "IMPORTANCE_PERCEPTIBLE_PRE_26";
                    break;
                case '\b':
                    str = "IMPORTANCE_SERVICE";
                    break;
                case '\t':
                    str = "IMPORTANCE_TOP_SLEEPING";
                    break;
                case '\n':
                    str = "IMPORTANCE_TOP_SLEEPING_PRE_28";
                    break;
                case 11:
                    str = "IMPORTANCE_VISIBLE";
                    break;
                case '\f':
                    str = "UNKNOWN";
                    break;
                default:
                    throw null;
            }
            t45Var.b("process_importance", str);
        }
        Logger.g("onCreate", new Object[0]);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            super.onCreate();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            ynb0 ynb0Var = this.e;
            if (ynb0Var == null) {
                u890.C("uiVisibleLockManager");
                throw null;
            }
            udh1 udh1Var = (udh1) ynb0Var.get();
            ((Application) udh1Var.a.getApplicationContext()).registerActivityLifecycleCallbacks(new tdh1(udh1Var));
            kly0 kly0Var = this.d;
            if (kly0Var == null) {
                u890.C("zeroScopeProvider");
                throw null;
            }
            sam0 sam0Var = (xm41) kly0Var.get();
            sam0Var.getClass();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            p811 p811Var = new p811();
            k8b k8bVar = i8b.a;
            p811Var.a = k8bVar;
            ram0 ram0VarE = sam0Var.e(oa41.g, new hf31(p811Var, countDownLatch, (byte) 18));
            boolean zAwait = countDownLatch.await(5L, TimeUnit.SECONDS);
            ram0VarE.dispose();
            if (zAwait) {
                k8bVar = (k8b) p811Var.a;
            }
            if (k8bVar instanceof j8b) {
                ((cj5) ((j8b) k8bVar).a).a();
            } else {
                bj5 bj5Var = (cj5) eth.z(sam0Var, qva1.e1);
                if (bj5Var != null) {
                    c("Zero scope entered but did not notify during Application.onCreate, bootstrapping");
                    bj5Var.a();
                } else {
                    c("Zero scope did not enter during Application.onCreate, deferring bootstrap");
                    fn31.T((c9n) this.g.getValue(), (o8n) null, 0, new xba1(sam0Var, (lnm) null, (byte) 5), 3);
                }
            }
            nxg.a().a("application_on_create");
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onTrimMemory(int i) {
        super/*android.app.Application*/.onTrimMemory(i);
        ynb0 ynb0Var = this.b;
        if (ynb0Var == null) {
            u890.C("memoryLevelObservers");
            throw null;
        }
        Iterator it = ((Iterable) ynb0Var.get()).iterator();
        while (it.hasNext()) {
            ((dsi0) it.next()).a(i);
        }
    }
}
