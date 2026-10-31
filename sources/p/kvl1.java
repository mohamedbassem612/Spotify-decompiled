package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kvl1 implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public ivl1 e;
    public boolean f;

    public kvl1(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new pkn0("Firebase-FirebaseInstanceIdServiceConnection"));
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0088 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a() throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L31
        L7:
            java.util.ArrayDeque r0 = r8.d     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L83
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L31
            p.ivl1 r0 = r8.e     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L34
            boolean r0 = r0.isBinderAlive()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L34
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L31
            java.util.ArrayDeque r0 = r8.d     // Catch: java.lang.Throwable -> L31
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L31
            p.jvl1 r0 = (p.jvl1) r0     // Catch: java.lang.Throwable -> L31
            p.ivl1 r2 = r8.e     // Catch: java.lang.Throwable -> L31
            r2.a(r0)     // Catch: java.lang.Throwable -> L31
            goto L7
        L31:
            r0 = move-exception
            r5 = r8
            goto L86
        L34:
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r8.f     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L3f
            r5 = r8
            goto L78
        L3f:
            r0 = 1
            r8.f = r0     // Catch: java.lang.Throwable -> L7a
            p.dbl r1 = p.dbl.a()     // Catch: java.lang.SecurityException -> L5f java.lang.Throwable -> L7a
            android.content.Context r2 = r8.a     // Catch: java.lang.SecurityException -> L5f java.lang.Throwable -> L7a
            android.content.Intent r4 = r8.b     // Catch: java.lang.SecurityException -> L5f java.lang.Throwable -> L7a
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.SecurityException -> L5f java.lang.Throwable -> L7a
            java.lang.String r3 = r0.getName()     // Catch: java.lang.SecurityException -> L5f java.lang.Throwable -> L7a
            r7 = 0
            r6 = 65
            r5 = r8
            boolean r8 = r1.c(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L5d java.lang.SecurityException -> L60
            if (r8 == 0) goto L60
            goto L78
        L5d:
            r0 = move-exception
            goto L7c
        L5f:
            r5 = r8
        L60:
            r8 = 0
            r5.f = r8     // Catch: java.lang.Throwable -> L5d
            java.util.ArrayDeque r8 = r5.d     // Catch: java.lang.Throwable -> L5d
        L65:
            boolean r0 = r8.isEmpty()     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L78
            java.lang.Object r0 = r8.poll()     // Catch: java.lang.Throwable -> L5d
            p.jvl1 r0 = (p.jvl1) r0     // Catch: java.lang.Throwable -> L5d
            p.bsd1 r0 = r0.b     // Catch: java.lang.Throwable -> L5d
            r1 = 0
            r0.d(r1)     // Catch: java.lang.Throwable -> L5d
            goto L65
        L78:
            monitor-exit(r5)
            return
        L7a:
            r0 = move-exception
            r5 = r8
        L7c:
            r8 = r0
            r0 = r8
            goto L86
        L7f:
            r0 = move-exception
            r5 = r8
            r8 = r0
            goto L86
        L83:
            r5 = r8
            monitor-exit(r5)
            return
        L86:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L88
            throw r0
        L88:
            r0 = move-exception
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kvl1.a():void");
    }

    public final synchronized hfp1 b(Intent intent) {
        jvl1 jvl1Var;
        Log.isLoggable("FirebaseMessaging", 3);
        jvl1Var = new jvl1(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
        jvl1Var.b.a.l(scheduledThreadPoolExecutor, new iyh1(scheduledThreadPoolExecutor.schedule((Runnable) new v241(jvl1Var, (byte) 21), (jvl1Var.a.getFlags() & 268435456) != 0 ? 60000L : 9000L, TimeUnit.MILLISECONDS), (byte) 17));
        this.d.add(jvl1Var);
        a();
        return jvl1Var.b.a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f = false;
            if (iBinder instanceof ivl1) {
                this.e = (ivl1) iBinder;
                a();
            } else {
                Objects.toString(iBinder);
                ArrayDeque arrayDeque = this.d;
                while (!arrayDeque.isEmpty()) {
                    ((jvl1) arrayDeque.poll()).b.d((Object) null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) throws Throwable {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
