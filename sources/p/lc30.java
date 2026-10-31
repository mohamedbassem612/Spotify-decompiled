package p;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lc30 implements Runnable {
    public static final long e;
    public final Context a;
    public final awl1 b;
    public final qkn0 c;
    public int d = 0;

    static {
        qs10.c("ForceStopRunnable");
        e = 315360000000L;
    }

    public lc30(Context context, awl1 awl1Var) {
        this.a = context.getApplicationContext();
        this.b = awl1Var;
        this.c = awl1Var.g;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x018e  */
    public final void a() {
        boolean z;
        qkn0 qkn0Var = this.c;
        awl1 awl1Var = this.b;
        qkn0 qkn0Var2 = awl1Var.g;
        btk btkVar = awl1Var.b;
        WorkDatabase workDatabase = awl1Var.c;
        int i = hed1.e;
        Context context = this.a;
        JobScheduler jobSchedulerA = jaa0.a(context);
        ArrayList<JobInfo> arrayListC = hed1.c(context, jobSchedulerA);
        List listB = workDatabase.x().b();
        HashSet hashSet = new HashSet(arrayListC != null ? arrayListC.size() : 0);
        if (arrayListC != null && !arrayListC.isEmpty()) {
            for (JobInfo jobInfo : arrayListC) {
                uvl1 uvl1VarF = hed1.f(jobInfo);
                if (uvl1VarF != null) {
                    hashSet.add(uvl1VarF.a);
                } else {
                    hed1.a(jobSchedulerA, jobInfo.getId());
                }
            }
        }
        Iterator it = listB.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    qs10.a().getClass();
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.c();
            try {
                dxl1 dxl1VarA = workDatabase.A();
                Iterator it2 = listB.iterator();
                while (it2.hasNext()) {
                    dxl1VarA.f(-1L, (String) it2.next());
                }
                workDatabase.s();
                workDatabase.o();
            } catch (Throwable th) {
                workDatabase.o();
                throw th;
            }
        }
        dxl1 dxl1VarA2 = workDatabase.A();
        lwl1 lwl1VarZ = workDatabase.z();
        workDatabase.c();
        try {
            List<vwl1> list = (List) qyo1.x(dxl1VarA2.a, true, false, new qti1((byte) 23));
            boolean z2 = (list == null || list.isEmpty()) ? false : true;
            if (z2) {
                for (vwl1 vwl1Var : list) {
                    wvl1 wvl1Var = wvl1.a;
                    String str = vwl1Var.a;
                    dxl1VarA2.g(wvl1Var, str);
                    dxl1VarA2.h(-512, str);
                    dxl1VarA2.f(-1L, str);
                }
            }
            lwl1VarZ.b();
            workDatabase.s();
            workDatabase.o();
            boolean z3 = z2 || z;
            byte b = 10;
            if (qkn0Var2.c()) {
                qs10.a().getClass();
                dsa0.u(btkVar.h, new g24(awl1Var, b));
                qkn0Var2.s();
                return;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = i2 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
                if (i2 < 30) {
                    if (broadcast == null) {
                        b(context);
                        qs10.a().getClass();
                        dsa0.u(btkVar.h, new g24(awl1Var, b));
                        ytw0 ytw0Var = btkVar.d;
                        qkn0Var.r(System.currentTimeMillis());
                        return;
                    }
                    if (z3) {
                        qs10.a().getClass();
                        om41.b(btkVar, workDatabase, awl1Var.e);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jB = qkn0Var.b();
                    for (int i4 = 0; i4 < historicalProcessExitReasons.size(); i4++) {
                        ApplicationExitInfo applicationExitInfoB = k220.b(historicalProcessExitReasons.get(i4));
                        if (applicationExitInfoB.getReason() == 10 && applicationExitInfoB.getTimestamp() >= jB) {
                            qs10.a().getClass();
                            dsa0.u(btkVar.h, new g24(awl1Var, b));
                            ytw0 ytw0Var2 = btkVar.d;
                            qkn0Var.r(System.currentTimeMillis());
                            return;
                        }
                    }
                }
                if (z3) {
                    qs10.a().getClass();
                    om41.b(btkVar, workDatabase, awl1Var.e);
                }
            } catch (IllegalArgumentException | SecurityException unused) {
                qs10.a().getClass();
            }
        } catch (Throwable th2) {
            workDatabase.o();
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        awl1 awl1Var = this.b;
        btk btkVar = awl1Var.b;
        try {
            btkVar.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.a;
            if (zIsEmpty) {
                qs10.a().getClass();
                zA = true;
            } else {
                zA = jsw0.a(context);
                qs10.a().getClass();
            }
            if (!zA) {
                awl1Var.g();
                return;
            }
            while (true) {
                try {
                    w0h1.z(context);
                    qs10.a().getClass();
                    try {
                        a();
                        awl1Var.g();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e2) {
                        int i = this.d + 1;
                        this.d = i;
                        if (i >= 3) {
                            String str = vqo1.h(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            qs10.a().getClass();
                            IllegalStateException illegalStateException = new IllegalStateException(str, e2);
                            btkVar.getClass();
                            throw illegalStateException;
                        }
                        qs10.a().getClass();
                        try {
                            Thread.sleep(((long) this.d) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e3) {
                    qs10.a().getClass();
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e3);
                    btkVar.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            awl1Var.g();
            throw th;
        }
    }
}
