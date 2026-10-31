package p;

import android.content.Context;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class shf1 {
    public final Context a;
    public final gjj0 b;
    public final dxy c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final qhf1 h;
    public final y36 e = new y36(0);
    public boolean g = false;

    public shf1(FirebaseMessaging firebaseMessaging, gjj0 gjj0Var, qhf1 qhf1Var, dxy dxyVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = gjj0Var;
        this.h = qhf1Var;
        this.c = dxyVar;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(hfp1 hfp1Var) throws IOException {
        try {
            o0c.h(hfp1Var, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final synchronized void b(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d A[Catch: IOException -> 0x00a5, TRY_LEAVE, TryCatch #2 {IOException -> 0x00a5, blocks: (B:12:0x001a, B:23:0x005d, B:17:0x002b, B:19:0x0033, B:20:0x0044, B:22:0x004c), top: B:68:0x001a }] */
    public final boolean c() throws IOException {
        ohf1 ohf1VarA;
        while (true) {
            synchronized (this) {
                try {
                    ohf1VarA = this.h.a();
                    if (ohf1VarA == null) {
                        Log.isLoggable("FirebaseMessaging", 3);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            FirebaseMessaging firebaseMessaging = this.d;
            dxy dxyVar = this.c;
            try {
                String str = ohf1VarA.b;
                String str2 = ohf1VarA.a;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        a(dxyVar.R(firebaseMessaging.a(), str2));
                        Log.isLoggable("FirebaseMessaging", 3);
                    } else {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else if (str.equals("S")) {
                    a(dxyVar.Q(firebaseMessaging.a(), str2));
                    Log.isLoggable("FirebaseMessaging", 3);
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
                qhf1 qhf1Var = this.h;
                synchronized (qhf1Var) {
                    qhf1Var.a.B(ohf1VarA.c);
                }
                synchronized (this.e) {
                    try {
                        String str3 = ohf1VarA.c;
                        if (this.e.containsKey(str3)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str3);
                            bsd1 bsd1Var = (bsd1) arrayDeque.poll();
                            if (bsd1Var != null) {
                                bsd1Var.b(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.e.remove(str3);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IOException e) {
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    e.getMessage();
                    return false;
                }
                if (e.getMessage() == null) {
                    return false;
                }
                throw e;
            }
        }
    }

    public final void d(long j) {
        this.f.schedule(new uhf1(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        b(true);
    }
}
