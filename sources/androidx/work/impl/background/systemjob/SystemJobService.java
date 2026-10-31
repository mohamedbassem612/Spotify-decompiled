package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
import p.awl1;
import p.dwl1;
import p.eg;
import p.em00;
import p.eyo1;
import p.f1z0;
import p.f4i1;
import p.k220;
import p.lsw0;
import p.mb4;
import p.mkb1;
import p.nkb1;
import p.ph5;
import p.qs10;
import p.t8r0;
import p.uvl1;
import p.vqh0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class SystemJobService extends JobService implements em00 {
    public static final /* synthetic */ int e = 0;
    public awl1 a;
    public final HashMap b = new HashMap();
    public final nkb1 c = nkb1.create();
    public t8r0 d;

    static {
        qs10.c("SystemJobService");
    }

    public static void b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        eg.m(f4i1.f("Cannot invoke ", str, " on a background thread"));
    }

    public static uvl1 c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new uvl1(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p.em00
    public final void a(uvl1 uvl1Var, boolean z) {
        b("onExecuted");
        qs10 qs10VarA = qs10.a();
        String str = uvl1Var.a;
        qs10VarA.getClass();
        JobParameters jobParameters = (JobParameters) this.b.remove(uvl1Var);
        this.c.n(uvl1Var);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            awl1 awl1VarD = awl1.d(getApplicationContext());
            this.a = awl1VarD;
            lsw0 lsw0Var = awl1VarD.f;
            this.d = new t8r0(lsw0Var, awl1VarD.d);
            lsw0Var.a(this);
        } catch (IllegalStateException e2) {
            if (Application.class.equals(getApplication().getClass())) {
                qs10.a().getClass();
            } else {
                k220.p("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        awl1 awl1Var = this.a;
        if (awl1Var != null) {
            lsw0 lsw0Var = awl1Var.f;
            synchronized (lsw0Var.k) {
                lsw0Var.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        b("onStartJob");
        if (this.a == null) {
            qs10.a().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        uvl1 uvl1VarC = c(jobParameters);
        if (uvl1VarC == null) {
            qs10.a().getClass();
            return false;
        }
        HashMap map = this.b;
        if (map.containsKey(uvl1VarC)) {
            qs10 qs10VarA = qs10.a();
            uvl1VarC.toString();
            qs10VarA.getClass();
            return false;
        }
        qs10 qs10VarA2 = qs10.a();
        uvl1VarC.toString();
        qs10VarA2.getClass();
        map.put(uvl1VarC, jobParameters);
        f1z0 f1z0Var = new f1z0();
        if (eyo1.l(jobParameters) != null) {
            f1z0Var.b = Arrays.asList(eyo1.l(jobParameters));
        }
        if (eyo1.k(jobParameters) != null) {
            f1z0Var.a = Arrays.asList(eyo1.k(jobParameters));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ph5.t(jobParameters);
        }
        t8r0 t8r0Var = this.d;
        ((dwl1) t8r0Var.b).a(new vqh0(t8r0Var, this.c.h(uvl1VarC), f1z0Var, (byte) 21));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        b("onStopJob");
        if (this.a == null) {
            qs10.a().getClass();
            return true;
        }
        uvl1 uvl1VarC = c(jobParameters);
        if (uvl1VarC == null) {
            qs10.a().getClass();
            return false;
        }
        qs10 qs10VarA = qs10.a();
        uvl1VarC.toString();
        qs10VarA.getClass();
        this.b.remove(uvl1VarC);
        mkb1 mkb1VarN = this.c.n(uvl1VarC);
        if (mkb1VarN != null) {
            this.d.p(mkb1VarN, Build.VERSION.SDK_INT >= 31 ? mb4.t(jobParameters) : -512);
        }
        lsw0 lsw0Var = this.a.f;
        String str = uvl1VarC.a;
        synchronized (lsw0Var.k) {
            zContains = lsw0Var.i.contains(str);
        }
        return !zContains;
    }
}
