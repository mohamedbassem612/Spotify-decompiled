package p;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wf10 {
    public static final wf10 a = new wf10();
    public static final HashSet b = dm61.t0(new zue0[]{zue0.d});
    public static Executor c;
    public static volatile String d;
    public static volatile String e;
    public static String f;
    public static String g;
    public static volatile String h;
    public static volatile Boolean i;
    public static Context j;
    public static int k;
    public static final ReentrantLock l;
    public static final String m;
    public static boolean n;
    public static boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f133p;
    public static final AtomicBoolean q;
    public static volatile String r;
    public static volatile String s;
    public static final jah t;
    public static boolean u;

    static {
        new AtomicLong(65536L);
        k = 64206;
        l = new ReentrantLock();
        m = "v16.0";
        q = new AtomicBoolean(false);
        r = "instagram.com";
        s = "facebook.com";
        t = new jah((byte) 23);
    }

    public static final Context a() {
        w0h1.H();
        Context context = j;
        if (context != null) {
            return context;
        }
        u890.C("applicationContext");
        throw null;
    }

    public static final String b() {
        w0h1.H();
        String str = d;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final Executor c() {
        ReentrantLock reentrantLock = l;
        reentrantLock.lock();
        try {
            if (c == null) {
                c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            reentrantLock.unlock();
            Executor executor = c;
            if (executor != null) {
                return executor;
            }
            eg.m("Required value was null.");
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String d() {
        String str = m;
        String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1));
        return str;
    }

    public static final String e() {
        Date date = xd.Y;
        xd xdVarS = fuo1.s();
        String str = xdVarS != null ? xdVarS.X : null;
        String str2 = s;
        if (str != null) {
            if (str.equals("gaming")) {
                return nhc1.W(str2, "facebook.com", "fb.gg");
            }
            if (str.equals("instagram")) {
                return nhc1.W(str2, "facebook.com", "instagram.com");
            }
        }
        return str2;
    }

    public static final synchronized boolean f() {
        return u;
    }

    public static final void g() {
        synchronized (b) {
        }
    }

    public static final void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return;
            }
            if (d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (nhc1.Y(str.toLowerCase(Locale.ROOT), "fb", false)) {
                        d = str.substring(2);
                    } else {
                        d = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            f = applicationInfo.metaData.getString("com.facebook.sdk.RedirectURI");
            g = applicationInfo.metaData.getString("com.facebook.sdk.IntentUriPackageTarget");
            if (e == null) {
                e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (h == null) {
                h = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (k == 64206) {
                k = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (i == null) {
                i = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007c A[Catch: all -> 0x0011, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x0021, B:17:0x0028, B:18:0x002b, B:20:0x0040, B:22:0x0047, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:37:0x007c, B:38:0x007e, B:40:0x0082, B:42:0x0086, B:44:0x008c, B:46:0x0090, B:50:0x00a1, B:52:0x00a9, B:54:0x00ad, B:60:0x00c2, B:61:0x00c6, B:62:0x00cb, B:63:0x00cc, B:65:0x00d8, B:68:0x0134, B:69:0x0139, B:47:0x0098, B:48:0x009d, B:49:0x009e, B:70:0x013a, B:71:0x013f, B:35:0x0077, B:72:0x0140, B:73:0x0147, B:74:0x0148, B:75:0x014f, B:76:0x0150, B:77:0x0155, B:57:0x00b8, B:32:0x006a), top: B:83:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0082 A[Catch: all -> 0x0011, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x0021, B:17:0x0028, B:18:0x002b, B:20:0x0040, B:22:0x0047, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:37:0x007c, B:38:0x007e, B:40:0x0082, B:42:0x0086, B:44:0x008c, B:46:0x0090, B:50:0x00a1, B:52:0x00a9, B:54:0x00ad, B:60:0x00c2, B:61:0x00c6, B:62:0x00cb, B:63:0x00cc, B:65:0x00d8, B:68:0x0134, B:69:0x0139, B:47:0x0098, B:48:0x009d, B:49:0x009e, B:70:0x013a, B:71:0x013f, B:35:0x0077, B:72:0x0140, B:73:0x0147, B:74:0x0148, B:75:0x014f, B:76:0x0150, B:77:0x0155, B:57:0x00b8, B:32:0x006a), top: B:83:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x009e A[Catch: all -> 0x0011, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x0021, B:17:0x0028, B:18:0x002b, B:20:0x0040, B:22:0x0047, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:37:0x007c, B:38:0x007e, B:40:0x0082, B:42:0x0086, B:44:0x008c, B:46:0x0090, B:50:0x00a1, B:52:0x00a9, B:54:0x00ad, B:60:0x00c2, B:61:0x00c6, B:62:0x00cb, B:63:0x00cc, B:65:0x00d8, B:68:0x0134, B:69:0x0139, B:47:0x0098, B:48:0x009d, B:49:0x009e, B:70:0x013a, B:71:0x013f, B:35:0x0077, B:72:0x0140, B:73:0x0147, B:74:0x0148, B:75:0x014f, B:76:0x0150, B:77:0x0155, B:57:0x00b8, B:32:0x006a), top: B:83:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9 A[Catch: all -> 0x0011, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x0021, B:17:0x0028, B:18:0x002b, B:20:0x0040, B:22:0x0047, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:37:0x007c, B:38:0x007e, B:40:0x0082, B:42:0x0086, B:44:0x008c, B:46:0x0090, B:50:0x00a1, B:52:0x00a9, B:54:0x00ad, B:60:0x00c2, B:61:0x00c6, B:62:0x00cb, B:63:0x00cc, B:65:0x00d8, B:68:0x0134, B:69:0x0139, B:47:0x0098, B:48:0x009d, B:49:0x009e, B:70:0x013a, B:71:0x013f, B:35:0x0077, B:72:0x0140, B:73:0x0147, B:74:0x0148, B:75:0x014f, B:76:0x0150, B:77:0x0155, B:57:0x00b8, B:32:0x006a), top: B:83:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x0021, B:17:0x0028, B:18:0x002b, B:20:0x0040, B:22:0x0047, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:37:0x007c, B:38:0x007e, B:40:0x0082, B:42:0x0086, B:44:0x008c, B:46:0x0090, B:50:0x00a1, B:52:0x00a9, B:54:0x00ad, B:60:0x00c2, B:61:0x00c6, B:62:0x00cb, B:63:0x00cc, B:65:0x00d8, B:68:0x0134, B:69:0x0139, B:47:0x0098, B:48:0x009d, B:49:0x009e, B:70:0x013a, B:71:0x013f, B:35:0x0077, B:72:0x0140, B:73:0x0147, B:74:0x0148, B:75:0x014f, B:76:0x0150, B:77:0x0155, B:57:0x00b8, B:32:0x006a), top: B:83:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c6 A[Catch: all -> 0x0011, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x0021, B:17:0x0028, B:18:0x002b, B:20:0x0040, B:22:0x0047, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:37:0x007c, B:38:0x007e, B:40:0x0082, B:42:0x0086, B:44:0x008c, B:46:0x0090, B:50:0x00a1, B:52:0x00a9, B:54:0x00ad, B:60:0x00c2, B:61:0x00c6, B:62:0x00cb, B:63:0x00cc, B:65:0x00d8, B:68:0x0134, B:69:0x0139, B:47:0x0098, B:48:0x009d, B:49:0x009e, B:70:0x013a, B:71:0x013f, B:35:0x0077, B:72:0x0140, B:73:0x0147, B:74:0x0148, B:75:0x014f, B:76:0x0150, B:77:0x0155, B:57:0x00b8, B:32:0x006a), top: B:83:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d8 A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x0021, B:17:0x0028, B:18:0x002b, B:20:0x0040, B:22:0x0047, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:37:0x007c, B:38:0x007e, B:40:0x0082, B:42:0x0086, B:44:0x008c, B:46:0x0090, B:50:0x00a1, B:52:0x00a9, B:54:0x00ad, B:60:0x00c2, B:61:0x00c6, B:62:0x00cb, B:63:0x00cc, B:65:0x00d8, B:68:0x0134, B:69:0x0139, B:47:0x0098, B:48:0x009d, B:49:0x009e, B:70:0x013a, B:71:0x013f, B:35:0x0077, B:72:0x0140, B:73:0x0147, B:74:0x0148, B:75:0x014f, B:76:0x0150, B:77:0x0155, B:57:0x00b8, B:32:0x006a), top: B:83:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0134 A[Catch: all -> 0x0011, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x0021, B:17:0x0028, B:18:0x002b, B:20:0x0040, B:22:0x0047, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:37:0x007c, B:38:0x007e, B:40:0x0082, B:42:0x0086, B:44:0x008c, B:46:0x0090, B:50:0x00a1, B:52:0x00a9, B:54:0x00ad, B:60:0x00c2, B:61:0x00c6, B:62:0x00cb, B:63:0x00cc, B:65:0x00d8, B:68:0x0134, B:69:0x0139, B:47:0x0098, B:48:0x009d, B:49:0x009e, B:70:0x013a, B:71:0x013f, B:35:0x0077, B:72:0x0140, B:73:0x0147, B:74:0x0148, B:75:0x014f, B:76:0x0150, B:77:0x0155, B:57:0x00b8, B:32:0x006a), top: B:83:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x013a A[Catch: all -> 0x0011, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000d, B:14:0x0017, B:16:0x0021, B:17:0x0028, B:18:0x002b, B:20:0x0040, B:22:0x0047, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:37:0x007c, B:38:0x007e, B:40:0x0082, B:42:0x0086, B:44:0x008c, B:46:0x0090, B:50:0x00a1, B:52:0x00a9, B:54:0x00ad, B:60:0x00c2, B:61:0x00c6, B:62:0x00cb, B:63:0x00cc, B:65:0x00d8, B:68:0x0134, B:69:0x0139, B:47:0x0098, B:48:0x009d, B:49:0x009e, B:70:0x013a, B:71:0x013f, B:35:0x0077, B:72:0x0140, B:73:0x0147, B:74:0x0148, B:75:0x014f, B:76:0x0150, B:77:0x0155, B:57:0x00b8, B:32:0x006a), top: B:83:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final synchronized void i(Context context, vf10 vf10Var) {
        Context context2;
        dp5 dp5VarA;
        Context context3;
        Context context4;
        Application application;
        if (q.get()) {
            if (vf10Var != null) {
                vf10Var.d();
            }
            return;
        }
        byte b2 = 1;
        try {
            int i2 = FacebookActivity.a1;
            int i3 = w0h1.c;
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException unused) {
        }
        int i4 = w0h1.c;
        context.checkCallingOrSelfPermission("android.permission.INTERNET");
        j = context.getApplicationContext();
        w0o1.j(context);
        Context context5 = j;
        if (context5 == null) {
            u890.C("applicationContext");
            throw null;
        }
        h(context5);
        String str = d;
        if (str == null || str.length() == 0) {
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = h;
        if (str2 == null || str2.length() == 0) {
            throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        q.set(true);
        wgi1 wgi1Var = wgi1.a;
        boolean zA = false;
        if (!dhn.a.contains(wgi1.class)) {
            try {
                wgi1.a.e();
                zA = wgi1.d.a();
            } catch (Throwable th) {
                dhn.a(wgi1.class, th);
            }
            if (zA) {
                u = true;
            }
            context2 = j;
            if (context2 != null) {
                u890.C("applicationContext");
                throw null;
            }
            if (context2 instanceof Application) {
                y580.g();
            } else {
                y580.g();
            }
            dp5VarA = dp5.c.a();
            if (dp5VarA != null) {
                context4 = j;
                if (context4 != null) {
                    u890.C("applicationContext");
                    throw null;
                }
                application = (Application) context4;
                if (!dhn.a.contains(dp5VarA)) {
                    application.registerActivityLifecycleCallbacks(new ij61(b2));
                }
            }
            g120.d();
            omn0.k();
            jlb jlbVar = jlb.c;
            context3 = j;
            if (context3 != null) {
                u890.C("applicationContext");
                throw null;
            }
            mym.k(context3);
            new j2e0(new tf10());
            mn10.a(new jah((byte) 24), kn10.Instrument);
            mn10.a(new jah((byte) 25), kn10.AppEvents);
            mn10.a(new jah((byte) 26), kn10.ChromeCustomTabsPrefetching);
            mn10.a(new jah((byte) 27), kn10.IgnoreAppSwitchToLoggedOut);
            mn10.a(new jah((byte) 28), kn10.BypassAppSwitch);
            c().execute(new FutureTask(new u0s(vf10Var, b2)));
            return;
        }
        if (zA) {
            u = true;
        }
        context2 = j;
        if (context2 != null) {
            u890.C("applicationContext");
            throw null;
        }
        if ((context2 instanceof Application) || !wgi1.c()) {
            y580.g();
        } else {
            Context context6 = j;
            if (context6 == null) {
                u890.C("applicationContext");
                throw null;
            }
            og0.d((Application) context6, d);
        }
        dp5VarA = dp5.c.a();
        if (dp5VarA != null) {
            context4 = j;
            if (context4 != null) {
                u890.C("applicationContext");
                throw null;
            }
            application = (Application) context4;
            if (!dhn.a.contains(dp5VarA)) {
                try {
                    application.registerActivityLifecycleCallbacks(new ij61(b2));
                } catch (Throwable th2) {
                    dhn.a(dp5VarA, th2);
                }
            }
        }
        g120.d();
        omn0.k();
        jlb jlbVar2 = jlb.c;
        context3 = j;
        if (context3 != null) {
            u890.C("applicationContext");
            throw null;
        }
        mym.k(context3);
        new j2e0(new tf10());
        mn10.a(new jah((byte) 24), kn10.Instrument);
        mn10.a(new jah((byte) 25), kn10.AppEvents);
        mn10.a(new jah((byte) 26), kn10.ChromeCustomTabsPrefetching);
        mn10.a(new jah((byte) 27), kn10.IgnoreAppSwitchToLoggedOut);
        mn10.a(new jah((byte) 28), kn10.BypassAppSwitch);
        c().execute(new FutureTask(new u0s(vf10Var, b2)));
        return;
        throw th;
    }
}
