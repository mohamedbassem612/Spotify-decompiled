package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.dxy;
import p.gjj0;
import p.gog1;
import p.hnc1;
import p.k65;
import p.lly0;
import p.mj20;
import p.nay;
import p.nl51;
import p.o0c;
import p.oj20;
import p.pkn0;
import p.puo1;
import p.rhf1;
import p.rl1;
import p.si0;
import p.t8r0;
import p.ucd1;
import p.upb;
import p.wi20;
import p.x8a0;
import p.y36;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class FirebaseMessaging {
    public static nl51 j;
    public static gog1 k;
    public static ScheduledThreadPoolExecutor l;
    public final wi20 a;
    public final Context b;
    public final dxy c;
    public final t8r0 d;
    public final rl1 e;
    public final ScheduledThreadPoolExecutor f;
    public final ThreadPoolExecutor g;
    public final gjj0 h;
    public boolean i;

    public FirebaseMessaging(wi20 wi20Var, lly0 lly0Var, lly0 lly0Var2, mj20 mj20Var, gog1 gog1Var, hnc1 hnc1Var) {
        wi20Var.a();
        Context context = wi20Var.a;
        gjj0 gjj0Var = new gjj0(context);
        dxy dxyVar = new dxy(wi20Var, gjj0Var, lly0Var, lly0Var2, mj20Var);
        ExecutorService executorServiceU = puo1.u();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorT = puo1.t();
        ThreadPoolExecutor threadPoolExecutorS = puo1.s();
        this.i = false;
        k = gog1Var;
        this.a = wi20Var;
        this.e = new rl1(this, hnc1Var);
        wi20Var.a();
        Context context2 = wi20Var.a;
        this.b = context2;
        Application.ActivityLifecycleCallbacks si0Var = new si0();
        this.h = gjj0Var;
        this.c = dxyVar;
        t8r0 t8r0Var = new t8r0();
        t8r0Var.b = new y36(0);
        t8r0Var.a = executorServiceU;
        this.d = t8r0Var;
        this.f = scheduledThreadPoolExecutorT;
        this.g = threadPoolExecutorS;
        wi20Var.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(si0Var);
        } else {
            Objects.toString(context);
        }
        scheduledThreadPoolExecutorT.execute(new oj20(this, (byte) 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorV = puo1.v();
        o0c.i(scheduledThreadPoolExecutorV, new rhf1(context2, scheduledThreadPoolExecutorV, this, gjj0Var, dxyVar)).d(scheduledThreadPoolExecutorT, new nay(this, (byte) 16));
        scheduledThreadPoolExecutorT.execute(new oj20(this, (byte) 1));
    }

    public static void b(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = l;
                if (scheduledThreadPoolExecutor == null) {
                    scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, (ThreadFactory) new pkn0("TAG"));
                    l = scheduledThreadPoolExecutor;
                }
                scheduledThreadPoolExecutor.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized nl51 c(Context context) {
        nl51 nl51Var;
        nl51Var = j;
        if (nl51Var == null) {
            nl51Var = new nl51(context);
            j = nl51Var;
        }
        return nl51Var;
    }

    public static synchronized FirebaseMessaging getInstance(wi20 wi20Var) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) wi20Var.b(FirebaseMessaging.class);
        zod.t(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() throws IOException {
        Task taskE;
        nl51 nl51VarC = c(this.b);
        wi20 wi20Var = this.a;
        wi20Var.a();
        upb upbVarJ = nl51VarC.j("[DEFAULT]".equals(wi20Var.b) ? "" : wi20Var.d(), gjj0.b(wi20Var));
        if (!e(upbVarJ)) {
            return (String) upbVarJ.b;
        }
        String strB = gjj0.b(this.a);
        t8r0 t8r0Var = this.d;
        synchronized (t8r0Var) {
            taskE = (Task) ((y36) t8r0Var.b).get(strB);
            if (taskE != null) {
                Log.isLoggable("FirebaseMessaging", 3);
            } else {
                Log.isLoggable("FirebaseMessaging", 3);
                taskE = this.c.y().k(this.g, new k65(this, strB, upbVarJ, (byte) 7)).e((Executor) t8r0Var.a, new x8a0(t8r0Var, strB, (byte) 29));
                ((y36) t8r0Var.b).put(strB, taskE);
            }
        }
        try {
            return (String) o0c.g(taskE);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final synchronized void d(long j2) {
        b(new ucd1(this, Math.min(Math.max(30L, 2 * j2), 28800L)), j2);
        this.i = true;
    }

    public final boolean e(upb upbVar) {
        if (upbVar != null) {
            return System.currentTimeMillis() > upbVar.a + 604800000 || !this.h.a().equals((String) upbVar.c);
        }
        return true;
    }
}
