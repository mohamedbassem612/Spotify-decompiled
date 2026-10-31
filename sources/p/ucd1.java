package p;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ucd1 implements Runnable {
    public final long a;
    public final PowerManager.WakeLock b;
    public final FirebaseMessaging c;

    public ucd1(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new pkn0("firebase-iid-executor"));
        this.c = firebaseMessaging;
        this.a = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.c.b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.c.a() != null) {
                Log.isLoggable("FirebaseMessaging", 3);
                return true;
            }
        } catch (IOException e) {
            if (dxy.B(e.getMessage())) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() != null) {
                throw e;
            }
        } catch (SecurityException unused) {
        }
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.b;
        u961 u961VarW = u961.w();
        FirebaseMessaging firebaseMessaging = this.c;
        if (u961VarW.z(firebaseMessaging.b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.i = true;
                }
                if (!firebaseMessaging.h.c()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.i = false;
                    }
                    if (u961.w().z(firebaseMessaging.b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (u961.w().y(firebaseMessaging.b) && !a()) {
                    new jlb(this).b();
                    if (u961.w().z(firebaseMessaging.b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.i = false;
                    }
                } else {
                    firebaseMessaging.d(this.a);
                }
                if (u961.w().z(firebaseMessaging.b)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                e.getMessage();
                synchronized (firebaseMessaging) {
                    firebaseMessaging.i = false;
                    if (u961.w().z(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (u961.w().z(firebaseMessaging.b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
