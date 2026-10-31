package p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s4l1 {
    public static volatile ScheduledExecutorService n;
    public static final Object o = new Object();
    public final Object a;
    public final PowerManager.WakeLock b;
    public int c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f;
    public boolean g;
    public gpn1 h;
    public final q9w i;
    public final String j;
    public final HashMap k;
    public final AtomicInteger l;
    public final ScheduledExecutorService m;

    public s4l1(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.i = q9w.W0;
        this.k = new HashMap();
        this.l = new AtomicInteger(0);
        zod.p("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        this.b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = swl1.a;
        synchronized (swl1.class) {
            Boolean bool = swl1.c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = x74.j(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                swl1.c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i = hhc1.a;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = mjm1.a(context).a.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        "Could not get applicationInfo from package: ".concat(packageName);
                    } else {
                        int i2 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method2 = swl1.b;
                        try {
                            if (method2 != null) {
                                method2.invoke(workSource, Integer.valueOf(i2), packageName);
                            } else {
                                Method method3 = swl1.a;
                                if (method3 != null) {
                                    method3.invoke(workSource, Integer.valueOf(i2));
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    "Could not find package: ".concat(packageName);
                }
            }
            if (workSource != null) {
                try {
                    this.b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    e.toString();
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = n;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (o) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = n;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        n = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void d(s4l1 s4l1Var) {
        synchronized (s4l1Var.a) {
            try {
                if (s4l1Var.b()) {
                    String.valueOf(s4l1Var.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                    s4l1Var.e();
                    if (s4l1Var.b()) {
                        s4l1Var.c = 1;
                        s4l1Var.f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        this.l.incrementAndGet();
        long jMin = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.a) {
            try {
                if (!b()) {
                    this.h = gpn1.a;
                    this.b.acquire();
                    this.i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.c++;
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                atn1 atn1Var = (atn1) this.k.get(null);
                if (atn1Var == null) {
                    atn1Var = new atn1();
                    this.k.put(null, atn1Var);
                }
                atn1Var.a++;
                this.i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = Long.MAX_VALUE - jElapsedRealtime > jMin ? jElapsedRealtime + jMin : Long.MAX_VALUE;
                if (j > this.e) {
                    this.e = j;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.m.schedule((Runnable) new g54(this, (byte) 21), jMin, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c > 0;
        }
        return z;
    }

    public final void c() {
        if (this.l.decrementAndGet() < 0) {
            String.valueOf(this.j).concat(" release without a matched acquire!");
        }
        synchronized (this.a) {
            try {
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                if (this.k.containsKey(null)) {
                    atn1 atn1Var = (atn1) this.k.get(null);
                    if (atn1Var != null) {
                        int i = atn1Var.a - 1;
                        atn1Var.a = i;
                        if (i == 0) {
                            this.k.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.j).concat(" counter does not exist");
                }
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        HashSet hashSet = this.f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        bhn0.d();
    }

    public final void f() {
        synchronized (this.a) {
            try {
                if (b()) {
                    if (this.g) {
                        int i = this.c - 1;
                        this.c = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.c = 0;
                    }
                    e();
                    Iterator it = this.k.values().iterator();
                    while (it.hasNext()) {
                        ((atn1) it.next()).a = 0;
                    }
                    this.k.clear();
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.d = null;
                        this.e = 0L;
                    }
                    if (this.b.isHeld()) {
                        try {
                            try {
                                this.b.release();
                                if (this.h != null) {
                                    this.h = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                String.valueOf(this.j).concat(" failed to release!");
                                if (this.h != null) {
                                    this.h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.h != null) {
                                this.h = null;
                            }
                            throw th;
                        }
                    } else {
                        String.valueOf(this.j).concat(" should be held!");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
