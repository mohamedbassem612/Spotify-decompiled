package p;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uhf1 implements Runnable {
    public static final Object f = new Object();
    public static Boolean g;
    public static Boolean h;
    public final Context a;
    public final gjj0 b;
    public final PowerManager.WakeLock c;
    public final shf1 d;
    public final long e;

    public uhf1(shf1 shf1Var, Context context, gjj0 gjj0Var, long j) {
        this.d = shf1Var;
        this.a = context;
        this.e = j;
        this.b = gjj0Var;
        this.c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f) {
            try {
                Boolean bool = h;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                h = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (f) {
            try {
                Boolean bool = g;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                g = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final synchronized boolean c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        shf1 shf1Var = this.d;
        Context context = this.a;
        boolean zB = b(context);
        PowerManager.WakeLock wakeLock = this.c;
        if (zB) {
            wakeLock.acquire(180000L);
        }
        try {
            try {
                try {
                    shf1Var.b(true);
                    if (!this.b.c()) {
                        shf1Var.b(false);
                        if (!b(context)) {
                            return;
                        }
                    } else {
                        if (!a(context) || c()) {
                            if (shf1Var.c()) {
                                shf1Var.b(false);
                            } else {
                                shf1Var.d(this.e);
                            }
                            if (b(context)) {
                                wakeLock.release();
                                return;
                            }
                            return;
                        }
                        thf1 thf1Var = new thf1();
                        thf1Var.a = this;
                        Log.isLoggable("FirebaseMessaging", 3);
                        context.registerReceiver(thf1Var, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (!b(context)) {
                            return;
                        }
                    }
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                    }
                } catch (RuntimeException unused2) {
                }
            } catch (IOException e) {
                e.getMessage();
                shf1Var.b(false);
                if (b(context)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (b(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused3) {
                }
            }
            throw th;
        }
    }
}
