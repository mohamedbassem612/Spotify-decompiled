package p;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class gsa extends bbp1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final twa E;
    public final boolean F;
    public final boolean G;
    public volatile vsa H;
    public ExecutorService I;
    public final Long J;
    public final a6o1 K;
    public final String e;
    public final String f;
    public volatile uhk1 h;
    public final Context i;
    public final bym1 j;
    public volatile lln1 k;
    public volatile esn1 l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f56p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object c = new Object();
    public volatile byte d = 0;
    public final Handler g = new Handler(Looper.getMainLooper());
    public int o = 0;

    public gsa(twa twaVar, Context context, s141 s141Var, pra praVar) {
        long jNextLong = new Random().nextLong();
        this.J = Long.valueOf(jNextLong);
        this.K = aqn1.a;
        this.e = "8.3.0";
        String strY = y();
        this.f = strY;
        this.i = context.getApplicationContext();
        xno1 xno1VarA = doo1.A();
        xno1VarA.b();
        doo1.y(((t9o1) xno1VarA).b);
        if (strY != null) {
            xno1VarA.b();
            doo1.z(((t9o1) xno1VarA).b, strY);
        }
        String packageName = this.i.getPackageName();
        xno1VarA.b();
        doo1.r(((t9o1) xno1VarA).b, packageName);
        xno1VarA.b();
        doo1.E(((t9o1) xno1VarA).b, jNextLong);
        boolean z = praVar.d;
        xno1VarA.b();
        doo1.x(((t9o1) xno1VarA).b, z);
        int i = Build.VERSION.SDK_INT;
        xno1VarA.b();
        doo1.B(((t9o1) xno1VarA).b, i);
        xno1VarA.d();
        Q(xno1VarA, context);
        try {
            int i2 = this.i.getPackageManager().getPackageInfo(this.i.getPackageName(), 0).versionCode;
            xno1VarA.b();
            doo1.C(((t9o1) xno1VarA).b, i2);
        } catch (Throwable unused) {
            vsn1.i("BillingClient");
        }
        this.j = new bym1(this.i, xno1VarA.a());
        if (s141Var == null) {
            int i3 = vsn1.a;
            Log.isLoggable("BillingClient", 5);
        }
        this.h = new uhk1(this.i, s141Var, this.j);
        this.E = twaVar;
        this.G = false;
        this.i.getPackageName();
        this.F = praVar.d;
    }

    public static /* bridge */ /* synthetic */ void A(gsa gsaVar, int i) {
        gsaVar.o = i;
        gsaVar.D = i >= 26;
        gsaVar.C = i >= 24;
        gsaVar.B = i >= 23;
        gsaVar.A = i >= 21;
        gsaVar.z = i >= 20;
        gsaVar.y = i >= 19;
        gsaVar.x = i >= 18;
        gsaVar.w = i >= 17;
        gsaVar.v = i >= 16;
        gsaVar.u = i >= 15;
        gsaVar.t = i >= 14;
        gsaVar.s = i >= 12;
        gsaVar.r = i >= 9;
        gsaVar.q = i >= 8;
        gsaVar.f56p = i >= 6;
    }

    public static void B(gsa gsaVar, int i) {
        if (i != 0) {
            gsaVar.K(0);
            return;
        }
        synchronized (gsaVar.c) {
            try {
                if (gsaVar.d == 3) {
                    return;
                }
                gsaVar.K(2);
                uhk1 uhk1Var = gsaVar.h != null ? gsaVar.h : null;
                if (uhk1Var != null) {
                    boolean z = gsaVar.A;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    uhk1Var.a = z;
                    qbn1 qbn1Var = (qbn1) uhk1Var.f;
                    Context context = (Context) uhk1Var.b;
                    qbn1Var.a(context, intentFilter2);
                    boolean z2 = uhk1Var.a;
                    qbn1 qbn1Var2 = (qbn1) uhk1Var.e;
                    if (z2) {
                        qbn1Var2.b(context, intentFilter);
                    } else {
                        qbn1Var2.a(context, intentFilter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void Q(xno1 xno1Var, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i = (int) (memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                xno1Var.b();
                doo1.w(((t9o1) xno1Var).b, i);
                String str = Build.BRAND;
                xno1Var.b();
                doo1.s(((t9o1) xno1Var).b);
                String str2 = Build.MODEL;
                xno1Var.b();
                doo1.v(((t9o1) xno1Var).b);
                String str3 = Build.MANUFACTURER;
                xno1Var.b();
                doo1.u(((t9o1) xno1Var).b);
                String str4 = Build.FINGERPRINT;
                xno1Var.b();
                doo1.t(((t9o1) xno1Var).b);
            }
        } catch (RuntimeException unused) {
            vsn1.i("BillingClient");
        }
    }

    public static Bundle Y(gsa gsaVar, String str, String str2) {
        Bundle bundleC;
        lln1 lln1Var;
        try {
            synchronized (gsaVar.c) {
                lln1Var = gsaVar.k;
            }
            if (lln1Var == null) {
                return vsn1.c(iyn1.h, 107);
            }
            return ((vjn1) lln1Var).h1(gsaVar.i.getPackageName(), str, str2);
        } catch (DeadObjectException e) {
            iua iuaVar = iyn1.h;
            String strA = hxn1.a(e);
            bundleC = vsn1.c(iuaVar, 5);
            if (strA != null) {
                bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
            }
            return bundleC;
        } catch (Exception e2) {
            iua iuaVar2 = iyn1.f;
            String strA2 = hxn1.a(e2);
            bundleC = vsn1.c(iuaVar2, 5);
            if (strA2 != null) {
                bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
            }
            return bundleC;
        }
    }

    public static void a0(gsa gsaVar, zgz0 zgz0Var) {
        lln1 lln1Var;
        gsaVar.getClass();
        try {
            if (!gsaVar.O()) {
                int i = vsn1.a;
                Log.isLoggable("BillingClient", 5);
                iua iuaVar = iyn1.h;
                gsaVar.T(2, 13, iuaVar);
                zgz0Var.g(iuaVar);
                return;
            }
            if (!gsaVar.x) {
                int i2 = vsn1.a;
                Log.isLoggable("BillingClient", 5);
                iua iuaVar2 = iyn1.w;
                gsaVar.T(32, 13, iuaVar2);
                zgz0Var.g(iuaVar2);
                return;
            }
            synchronized (gsaVar.c) {
                lln1Var = gsaVar.k;
            }
            if (lln1Var == null) {
                gsaVar.z(zgz0Var, iyn1.h, 107, null);
                return;
            }
            String packageName = gsaVar.i.getPackageName();
            String str = gsaVar.e;
            String str2 = gsaVar.f;
            long jLongValue = gsaVar.J.longValue();
            int i3 = vsn1.a;
            Bundle bundle = new Bundle();
            vsn1.b(jLongValue, str, str2, bundle);
            ((vjn1) lln1Var).m1(packageName, bundle, new mtn1(zgz0Var, gsaVar.j, gsaVar.o));
        } catch (DeadObjectException e) {
            gsaVar.z(zgz0Var, iyn1.h, 62, e);
        } catch (Exception e2) {
            gsaVar.z(zgz0Var, iyn1.f, 62, e2);
        }
    }

    public static Future w(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new mqh1(futureSubmit, runnable, (byte) 12), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception unused) {
            vsn1.i("BillingClient");
            return null;
        }
    }

    public static String y() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final Handler C() {
        return Looper.myLooper() == null ? this.g : new Handler(Looper.myLooper());
    }

    public final yga0 D(iua iuaVar, int i, Exception exc) {
        vsn1.i("BillingClient");
        V(i, 7, iuaVar, hxn1.a(exc));
        return new yga0(iuaVar.a, iuaVar.c, new ArrayList(), new ArrayList());
    }

    public final iua E(int i) {
        vsn1.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        qlo1 qlo1VarR = gmo1.r();
        qlo1VarR.b();
        gmo1.q(((t9o1) qlo1VarR).b, 6);
        vro1 vro1VarQ = bso1.q();
        vro1VarQ.b();
        bso1.v(((t9o1) vro1VarQ).b);
        vro1VarQ.d(i > 0);
        vro1VarQ.e(i);
        qlo1VarR.b();
        gmo1.w(((t9o1) qlo1VarR).b, vro1VarQ.a());
        I((gmo1) qlo1VarR.a());
        return iyn1.g;
    }

    public final iua F() {
        int[] iArr = {0, 3};
        synchronized (this.c) {
            for (int i = 0; i < 2; i++) {
                if (this.d == iArr[i]) {
                    return iyn1.h;
                }
            }
            return iyn1.f;
        }
    }

    public final gyn1 G(int i) {
        if (!this.F || P()) {
            vsn1.g("BillingClient", "Already connected or not opted into auto reconnection.");
            return new zxn1(iyn1.g);
        }
        f1p1 f1p1Var = new f1p1();
        f1p1Var.c = new wdp1();
        z9p1 z9p1Var = new z9p1(f1p1Var);
        f1p1Var.b = z9p1Var;
        f1p1Var.a = men1.class;
        try {
            L(new bym1(this, f1p1Var, false, (byte) 7), i);
            f1p1Var.a = "reconnectIfNeeded";
            return z9p1Var;
        } catch (Exception e) {
            z9p1Var.a(e);
            return z9p1Var;
        }
    }

    public final void H(nlo1 nlo1Var) {
        try {
            this.j.n(nlo1Var, this.o);
        } catch (Throwable unused) {
            vsn1.i("BillingClient");
        }
    }

    public final void I(gmo1 gmo1Var) {
        try {
            bym1 bym1Var = this.j;
            int i = this.o;
            bym1Var.getClass();
            try {
                xno1 xno1VarL = ((doo1) bym1Var.b).l();
                xno1VarL.b();
                doo1.D(((t9o1) xno1VarL).b, i);
                doo1 doo1Var = (doo1) xno1VarL.a();
                bym1Var.b = doo1Var;
                try {
                    bym1Var.v(gmo1Var, doo1Var);
                } catch (Throwable unused) {
                    vsn1.i("BillingLogger");
                }
            } catch (Throwable unused2) {
                vsn1.i("BillingLogger");
            }
        } catch (Throwable unused3) {
            vsn1.i("BillingClient");
        }
    }

    public final void J(int i, int i2, iua iuaVar) {
        try {
            int i3 = hxn1.a;
            hlo1 hlo1VarL = hxn1.b(i, 6, iuaVar, null, jno1.b).l();
            vro1 vro1VarQ = bso1.q();
            vro1VarQ.d(i2 > 0);
            vro1VarQ.e(i2);
            hlo1VarL.e(vro1VarQ);
            H((nlo1) hlo1VarL.a());
        } catch (Throwable unused) {
            vsn1.i("BillingClient");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(int i) {
        String str;
        String str2;
        synchronized (this.c) {
            try {
                if (this.d == 3) {
                    return;
                }
                byte b = this.d;
                if (b == 0) {
                    str = "DISCONNECTED";
                } else if (b != 1) {
                    str = b != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i == 0) {
                    str2 = "DISCONNECTED";
                } else if (i != 1) {
                    str2 = i != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                vsn1.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.d = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void L(vsa vsaVar, int i) {
        int i2;
        iua iuaVarE;
        iua iuaVar;
        synchronized (this.c) {
            try {
                if (P()) {
                    iuaVarE = E(i);
                } else {
                    if (this.d == 1) {
                        int i3 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.c;
                        J(37, i, iuaVar);
                    } else if (this.d == 3) {
                        int i4 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.h;
                        J(38, i, iuaVar);
                    } else {
                        K(1);
                        if (i == 0) {
                            this.H = vsaVar;
                            i = 0;
                        }
                        M();
                        vsn1.g("BillingClient", "Starting in-app billing setup.");
                        this.l = new esn1(this, vsaVar, i);
                        esn1 esn1Var = this.l;
                        synchronized (esn1Var.e.c) {
                            xqn1 xqn1Var = esn1Var.b;
                            xqn1Var.c = 0L;
                            xqn1Var.b = false;
                            xqn1Var.a();
                        }
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.i.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            i2 = 41;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            i2 = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    Log.isLoggable("BillingClient", 5);
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.e);
                                    synchronized (this.c) {
                                        try {
                                            if (this.d == 2) {
                                                iuaVarE = E(i);
                                            } else if (this.d != 1) {
                                                Log.isLoggable("BillingClient", 5);
                                                iuaVar = iyn1.h;
                                                J(105, i, iuaVar);
                                            } else {
                                                esn1 esn1Var2 = this.l;
                                                if ((i <= 0 || Build.VERSION.SDK_INT < 29) ? this.i.bindService(intent2, esn1Var2, 1) : this.i.bindService(intent2, 1, v(), esn1Var2)) {
                                                    vsn1.g("BillingClient", "Service was bonded successfully.");
                                                    iuaVarE = null;
                                                } else {
                                                    Log.isLoggable("BillingClient", 5);
                                                    i2 = 39;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                Log.isLoggable("BillingClient", 5);
                            }
                        }
                        K(0);
                        vsn1.g("BillingClient", "Billing service unavailable on device.");
                        iua iuaVar2 = iyn1.a;
                        J(i2, i, iuaVar2);
                        iuaVarE = iuaVar2;
                    }
                    iuaVarE = iuaVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iuaVarE != null) {
            vsaVar.c(iuaVarE);
        }
    }

    public final void M() {
        synchronized (this.c) {
            if (this.l != null) {
                try {
                    try {
                        this.i.unbindService(this.l);
                        this.k = null;
                        this.l = null;
                    } catch (Throwable th) {
                        this.k = null;
                        this.l = null;
                        throw th;
                    }
                } catch (Throwable unused) {
                    vsn1.i("BillingClient");
                    this.k = null;
                    this.l = null;
                }
            }
        }
    }

    public final boolean N() {
        try {
            int i = ((iua) G(1).get(Build.VERSION.SDK_INT < 29 ? 0L : 3000L, TimeUnit.MILLISECONDS)).a;
            if (i == 0) {
                vsn1.g("BillingClient", "Reconnection succeeded with result: " + i);
            } else {
                int i2 = vsn1.a;
                Log.isLoggable("BillingClient", 5);
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            vsn1.i("BillingClient");
        }
        return P();
    }

    public final boolean O() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a6o1 a6o1Var = this.K;
        if (a6o1Var == null) {
            bhn0.i("ticker");
            return false;
        }
        long jV = a6o1Var.v();
        long j = 30000;
        int i = 1;
        long jV2 = 30000;
        while (i <= 3) {
            try {
                long jMax = Math.max(0L, jV2);
                if (jMax <= 0) {
                    int i2 = vsn1.a;
                    Log.isLoggable("BillingClient", 5);
                    return P();
                }
                int i3 = ((iua) G(i).get(jMax, timeUnit)).a;
                if (i3 == 0) {
                    vsn1.g("BillingClient", "Reconnection succeeded with result: " + i3);
                    return P();
                }
                int i4 = vsn1.a;
                Log.isLoggable("BillingClient", 5);
                jV2 = j - (((a6o1Var.v() - jV) + 0) / 1000000);
                long j2 = j;
                long jPow = ((long) Math.pow(2.0d, i - 1)) * 1000;
                if (jV2 < jPow) {
                    Log.isLoggable("BillingClient", 5);
                    return P();
                }
                if (i < 3 && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jV2 = j2 - (((a6o1Var.v() - jV) + 0) / 1000000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        vsn1.i("BillingClient");
                    }
                }
                i++;
                j = j2;
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                vsn1.i("BillingClient");
            }
        }
        int i5 = vsn1.a;
        Log.isLoggable("BillingClient", 5);
        return P();
    }

    public final boolean P() {
        boolean z;
        synchronized (this.c) {
            try {
                z = false;
                if (this.d == 2 && this.k != null && this.l != null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final frl1 R(iua iuaVar, int i, Exception exc) {
        V(i, 9, iuaVar, hxn1.a(exc));
        vsn1.i("BillingClient");
        return new frl1(iuaVar, (ArrayList) null);
    }

    public final void S(int i, int i2, iua iuaVar) {
        nlo1 nlo1Var = null;
        if (iuaVar.a == 0) {
            int i3 = hxn1.a;
            try {
                qlo1 qlo1VarR = gmo1.r();
                qlo1VarR.b();
                gmo1.q(((t9o1) qlo1VarR).b, 5);
                roo1 roo1VarQ = apo1.q();
                roo1VarQ.b();
                apo1.r(((t9o1) roo1VarQ).b, i2);
                apo1 apo1VarA = roo1VarQ.a();
                qlo1VarR.b();
                gmo1.u(((t9o1) qlo1VarR).b, apo1VarA);
                nlo1Var = (gmo1) qlo1VarR.a();
            } catch (Exception unused) {
                vsn1.i("BillingLogger");
            }
            I(nlo1Var);
            return;
        }
        int i4 = hxn1.a;
        try {
            hlo1 hlo1VarT = nlo1.t();
            lmo1 lmo1VarR = umo1.r();
            int i5 = iuaVar.a;
            lmo1VarR.b();
            umo1.q(((t9o1) lmo1VarR).b, i5);
            String str = iuaVar.c;
            lmo1VarR.b();
            umo1.t(((t9o1) lmo1VarR).b, str);
            lmo1VarR.d(i);
            hlo1VarT.d(lmo1VarR);
            hlo1VarT.g(5);
            roo1 roo1VarQ2 = apo1.q();
            roo1VarQ2.b();
            apo1.r(((t9o1) roo1VarQ2).b, i2);
            apo1 apo1VarA2 = roo1VarQ2.a();
            hlo1VarT.b();
            nlo1.y(((t9o1) hlo1VarT).b, apo1VarA2);
            nlo1Var = (nlo1) hlo1VarT.a();
        } catch (Exception unused2) {
            vsn1.i("BillingLogger");
        }
        H(nlo1Var);
    }

    public final void T(int i, int i2, iua iuaVar) {
        try {
            int i3 = hxn1.a;
            H(hxn1.b(i, i2, iuaVar, null, jno1.b));
        } catch (Throwable unused) {
            vsn1.i("BillingClient");
        }
    }

    public final void U(int i, iua iuaVar, long j) {
        try {
            int i2 = hxn1.a;
            try {
                this.j.q(hxn1.b(i, 2, iuaVar, null, jno1.b), this.o, j);
            } catch (Throwable unused) {
                vsn1.i("BillingClient");
            }
        } catch (Throwable unused2) {
            vsn1.i("BillingClient");
        }
    }

    public final void V(int i, int i2, iua iuaVar, String str) {
        try {
            int i3 = hxn1.a;
            H(hxn1.b(i, i2, iuaVar, str, jno1.b));
        } catch (Throwable unused) {
            vsn1.i("BillingClient");
        }
    }

    public final void W(int i, iua iuaVar, long j, boolean z) {
        try {
            int i2 = hxn1.a;
            try {
                this.j.s(hxn1.b(i, 2, iuaVar, null, jno1.b), this.o, j, z);
            } catch (Throwable unused) {
                vsn1.i("BillingClient");
            }
        } catch (Throwable unused2) {
            vsn1.i("BillingClient");
        }
    }

    public final void X(int i, iua iuaVar, String str, long j, boolean z) {
        try {
            int i2 = hxn1.a;
            try {
                this.j.s(hxn1.b(i, 2, iuaVar, str, jno1.b), this.o, j, z);
            } catch (Throwable unused) {
                vsn1.i("BillingClient");
            }
        } catch (Throwable unused2) {
            vsn1.i("BillingClient");
        }
    }

    public final void Z(iua iuaVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.g.post(new mqh1(this, iuaVar, (byte) 11));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {, blocks: (B:17:0x0047, B:19:0x004b), top: B:39:0x0047, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void r() {
        ExecutorService executorService;
        try {
            int i = hxn1.a;
            I(hxn1.c(12, jno1.b));
        } catch (Throwable unused) {
            vsn1.i("BillingClient");
        }
        synchronized (this.c) {
            try {
                if (this.h != null) {
                    uhk1 uhk1Var = this.h;
                    qbn1 qbn1Var = (qbn1) uhk1Var.e;
                    Context context = (Context) uhk1Var.b;
                    qbn1Var.c(context);
                    ((qbn1) uhk1Var.f).c(context);
                    try {
                        vsn1.g("BillingClient", "Unbinding from service.");
                        M();
                    } catch (Throwable unused2) {
                        vsn1.i("BillingClient");
                    }
                    try {
                        synchronized (this) {
                            try {
                                executorService = this.I;
                                if (executorService != null) {
                                    executorService.shutdownNow();
                                    this.I = null;
                                }
                            } catch (Throwable th) {
                                K(3);
                                this.H = null;
                                throw th;
                            }
                        }
                    } catch (Throwable unused3) {
                        vsn1.i("BillingClient");
                    }
                    K(3);
                    this.H = null;
                } else {
                    vsn1.g("BillingClient", "Unbinding from service.");
                    M();
                    synchronized (this) {
                        executorService = this.I;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.I = null;
                        }
                        K(3);
                        this.H = null;
                    }
                }
            } catch (Throwable unused4) {
                vsn1.i("BillingClient");
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:176:0x03b5 A[EDGE_INSN: B:176:0x03b5->B:127:0x02ae BREAK  A[LOOP:6: B:148:0x0334->B:444:0x0334]] */
    /* JADX WARN: Code duplicated, block: B:179:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:181:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:183:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:185:0x040d  */
    /* JADX WARN: Code duplicated, block: B:188:0x041c  */
    /* JADX WARN: Code duplicated, block: B:191:0x042f  */
    /* JADX WARN: Code duplicated, block: B:194:0x043e  */
    /* JADX WARN: Code duplicated, block: B:197:0x045c  */
    /* JADX WARN: Code duplicated, block: B:200:0x046d  */
    /* JADX WARN: Code duplicated, block: B:201:0x0475  */
    /* JADX WARN: Code duplicated, block: B:204:0x0484  */
    /* JADX WARN: Code duplicated, block: B:207:0x0496  */
    /* JADX WARN: Code duplicated, block: B:209:0x049d  */
    /* JADX WARN: Code duplicated, block: B:210:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:213:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:217:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:221:0x0542  */
    /* JADX WARN: Code duplicated, block: B:222:0x0544  */
    /* JADX WARN: Code duplicated, block: B:223:0x0547  */
    /* JADX WARN: Code duplicated, block: B:224:0x054a  */
    /* JADX WARN: Code duplicated, block: B:225:0x054c  */
    /* JADX WARN: Code duplicated, block: B:226:0x054e  */
    /* JADX WARN: Code duplicated, block: B:227:0x0550  */
    /* JADX WARN: Code duplicated, block: B:228:0x0552  */
    /* JADX WARN: Code duplicated, block: B:232:0x056e  */
    /* JADX WARN: Code duplicated, block: B:235:0x0591  */
    /* JADX WARN: Code duplicated, block: B:237:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:239:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:242:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:244:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:246:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:249:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:251:0x0604  */
    /* JADX WARN: Code duplicated, block: B:254:0x0635  */
    /* JADX WARN: Code duplicated, block: B:256:0x0647  */
    /* JADX WARN: Code duplicated, block: B:272:0x068d A[PHI: r4
      0x068d: PHI (r4v31 long) = (r4v30 long), (r4v30 long), (r4v30 long), (r4v34 long) binds: [B:258:0x0655, B:260:0x0659, B:262:0x065f, B:421:0x068d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:275:0x0697  */
    /* JADX WARN: Code duplicated, block: B:277:0x069c  */
    /* JADX WARN: Code duplicated, block: B:281:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:284:0x06db  */
    /* JADX WARN: Code duplicated, block: B:287:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:290:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:299:0x072a  */
    /* JADX WARN: Code duplicated, block: B:301:0x073c  */
    /* JADX WARN: Code duplicated, block: B:304:0x0744  */
    /* JADX WARN: Code duplicated, block: B:307:0x074f  */
    /* JADX WARN: Code duplicated, block: B:308:0x0756  */
    /* JADX WARN: Code duplicated, block: B:310:0x0762  */
    /* JADX WARN: Code duplicated, block: B:320:0x0795  */
    /* JADX WARN: Code duplicated, block: B:322:0x0799 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:326:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:327:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:329:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:347:0x0800 A[Catch: Exception -> 0x07e9, CancellationException -> 0x07ec, TimeoutException -> 0x07ef, TryCatch #9 {CancellationException -> 0x07ec, TimeoutException -> 0x07ef, Exception -> 0x07e9, blocks: (B:333:0x07e2, B:347:0x0800, B:349:0x081c, B:375:0x088f, B:371:0x0878, B:362:0x084d, B:383:0x089d), top: B:408:0x07d9 }] */
    /* JADX WARN: Code duplicated, block: B:349:0x081c A[Catch: Exception -> 0x07e9, CancellationException -> 0x07ec, TimeoutException -> 0x07ef, TRY_LEAVE, TryCatch #9 {CancellationException -> 0x07ec, TimeoutException -> 0x07ef, Exception -> 0x07e9, blocks: (B:333:0x07e2, B:347:0x0800, B:349:0x081c, B:375:0x088f, B:371:0x0878, B:362:0x084d, B:383:0x089d), top: B:408:0x07d9 }] */
    /* JADX WARN: Code duplicated, block: B:351:0x082a  */
    /* JADX WARN: Code duplicated, block: B:354:0x0835  */
    /* JADX WARN: Code duplicated, block: B:355:0x0836 A[Catch: all -> 0x0846, TryCatch #0 {all -> 0x0846, blocks: (B:352:0x082d, B:355:0x0836, B:357:0x083a, B:360:0x0848), top: B:396:0x082d }] */
    /* JADX WARN: Code duplicated, block: B:357:0x083a A[Catch: all -> 0x0846, TryCatch #0 {all -> 0x0846, blocks: (B:352:0x082d, B:355:0x0836, B:357:0x083a, B:360:0x0848), top: B:396:0x082d }] */
    /* JADX WARN: Code duplicated, block: B:360:0x0848 A[Catch: all -> 0x0846, TRY_LEAVE, TryCatch #0 {all -> 0x0846, blocks: (B:352:0x082d, B:355:0x0836, B:357:0x083a, B:360:0x0848), top: B:396:0x082d }] */
    /* JADX WARN: Code duplicated, block: B:364:0x0861  */
    /* JADX WARN: Code duplicated, block: B:367:0x0867  */
    /* JADX WARN: Code duplicated, block: B:383:0x089d A[Catch: Exception -> 0x07e9, CancellationException -> 0x07ec, TimeoutException -> 0x07ef, TRY_LEAVE, TryCatch #9 {CancellationException -> 0x07ec, TimeoutException -> 0x07ef, Exception -> 0x07e9, blocks: (B:333:0x07e2, B:347:0x0800, B:349:0x081c, B:375:0x088f, B:371:0x0878, B:362:0x084d, B:383:0x089d), top: B:408:0x07d9 }] */
    /* JADX WARN: Code duplicated, block: B:396:0x082d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x086c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x07db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x04cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x04bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x06b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0, types: [p.gsa] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [p.ctw0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [p.ctw0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [long] */
    /* JADX WARN: Type inference failed for: r5v8, types: [long] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r7v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v35, types: [boolean] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:391:0x08f4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public p.iua s(android.app.Activity r33, final p.kl1 r34) {
        /*
            Method dump skipped, instruction units count: 2322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gsa.s(android.app.Activity, p.kl1):p.iua");
    }

    public void t(vqv0 vqv0Var, do0 do0Var) {
        if (w(new wra(this, do0Var, vqv0Var, (byte) 13), 30000L, new sjj1(this, do0Var, (byte) 11), C(), v()) == null) {
            iua iuaVarF = F();
            T(25, 7, iuaVarF);
            vrn1 vrn1Var = dsn1.b;
            ttn1 ttn1Var = ttn1.e;
            do0Var.a(iuaVarF, new f1z0(ttn1Var, ttn1Var));
        }
    }

    public void u(vqv0 vqv0Var) {
        L(vqv0Var, 0);
    }

    public final synchronized ExecutorService v() {
        ExecutorService executorServiceNewFixedThreadPool;
        executorServiceNewFixedThreadPool = this.I;
        if (executorServiceNewFixedThreadPool == null) {
            executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(vsn1.a, new zqn1(this));
            this.I = executorServiceNewFixedThreadPool;
        }
        return executorServiceNewFixedThreadPool;
    }

    public final void x() {
        if (TextUtils.isEmpty(null)) {
            this.i.getPackageName();
        }
    }

    public final void z(zgz0 zgz0Var, iua iuaVar, int i, Exception exc) {
        vsn1.i("BillingClient");
        V(i, 13, iuaVar, hxn1.a(exc));
        zgz0Var.g(iuaVar);
    }

    public gsa(twa twaVar, Context context, pra praVar) {
        long jNextLong = new Random().nextLong();
        this.J = Long.valueOf(jNextLong);
        this.K = aqn1.a;
        this.e = "8.3.0";
        String strY = y();
        this.f = strY;
        this.i = context.getApplicationContext();
        xno1 xno1VarA = doo1.A();
        xno1VarA.b();
        doo1.y(((t9o1) xno1VarA).b);
        if (strY != null) {
            xno1VarA.b();
            doo1.z(((t9o1) xno1VarA).b, strY);
        }
        String packageName = this.i.getPackageName();
        xno1VarA.b();
        doo1.r(((t9o1) xno1VarA).b, packageName);
        xno1VarA.b();
        doo1.E(((t9o1) xno1VarA).b, jNextLong);
        boolean z = praVar.d;
        xno1VarA.b();
        doo1.x(((t9o1) xno1VarA).b, z);
        int i = Build.VERSION.SDK_INT;
        xno1VarA.b();
        doo1.B(((t9o1) xno1VarA).b, i);
        xno1VarA.d();
        Q(xno1VarA, context);
        try {
            int i2 = this.i.getPackageManager().getPackageInfo(this.i.getPackageName(), 0).versionCode;
            xno1VarA.b();
            doo1.C(((t9o1) xno1VarA).b, i2);
        } catch (Throwable unused) {
            vsn1.i("BillingClient");
        }
        this.j = new bym1(this.i, xno1VarA.a());
        int i3 = vsn1.a;
        Log.isLoggable("BillingClient", 5);
        this.h = new uhk1(this.i, (s141) null, this.j);
        this.E = twaVar;
        this.i.getPackageName();
        this.F = praVar.d;
    }
}
