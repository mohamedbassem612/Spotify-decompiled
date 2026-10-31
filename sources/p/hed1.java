package p;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hed1 implements im41 {
    public static final /* synthetic */ int e = 0;
    public final Context a;
    public final JobScheduler b;
    public final ged1 c;
    public final WorkDatabase d;

    static {
        qs10.c("SystemJobScheduler");
    }

    public hed1(Context context, WorkDatabase workDatabase, btk btkVar) {
        JobScheduler jobSchedulerA = jaa0.a(context);
        ged1 ged1Var = new ged1(context, btkVar.d);
        this.a = context;
        this.b = jobSchedulerA;
        this.c = ged1Var;
        this.d = workDatabase;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable unused) {
            qs10 qs10VarA = qs10.a();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i));
            qs10VarA.getClass();
        }
    }

    public static ArrayList c(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listT;
        int i = jaa0.a;
        try {
            listT = y1a1.t(jobScheduler);
        } catch (Throwable unused) {
            qs10.a().getClass();
            listT = null;
        }
        if (listT == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listT.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listT) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static uvl1 f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new uvl1(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p.im41
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList<JobInfo> arrayListC = c(context, jobScheduler);
        if (arrayListC == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListC) {
                uvl1 uvl1VarF = f(jobInfo);
                if (uvl1VarF != null && str.equals(uvl1VarF.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.d.x().d(str);
    }

    @Override // p.im41
    public final boolean d() {
        return true;
    }

    @Override // p.im41
    public final void e(vwl1... vwl1VarArr) {
        WorkDatabase workDatabase = this.d;
        ifl1 ifl1Var = new ifl1((Object) workDatabase, (byte) 18);
        for (vwl1 vwl1Var : vwl1VarArr) {
            workDatabase.c();
            try {
                vwl1 vwl1VarD = workDatabase.A().d(vwl1Var.a);
                if (vwl1VarD != null && vwl1VarD.b == wvl1.a) {
                    uvl1 uvl1VarZ = yoi1.z(vwl1Var);
                    xdd1 xdd1VarA = workDatabase.x().a(uvl1VarZ);
                    int iIntValue = xdd1VarA != null ? xdd1VarA.c : ((Number) ((WorkDatabase) ifl1Var.b).r(new ww21(new lhn(ifl1Var, (byte) 2), (byte) 1))).intValue();
                    if (xdd1VarA == null) {
                        workDatabase.x().c(cyo1.v(uvl1VarZ, iIntValue));
                    }
                    g(vwl1Var, iIntValue);
                    workDatabase.s();
                } else {
                    qs10.a().getClass();
                    workDatabase.s();
                }
                workDatabase.o();
            } catch (Throwable th) {
                workDatabase.o();
                throw th;
            }
        }
    }

    public final void g(vwl1 vwl1Var, int i) {
        List listT;
        String str;
        JobInfo jobInfoA = this.c.a(vwl1Var, i);
        qs10.a().getClass();
        try {
            if (this.b.schedule(jobInfoA) == 0) {
                qs10.a().getClass();
                if (vwl1Var.q && vwl1Var.r == 1) {
                    vwl1Var.q = false;
                    qs10.a().getClass();
                    g(vwl1Var, i);
                }
            }
        } catch (IllegalStateException e2) {
            int i2 = jaa0.a;
            int i3 = Build.VERSION.SDK_INT;
            int i4 = i3 >= 31 ? 150 : 100;
            int size = ((List) qyo1.x(this.d.A().a, true, false, new qti1((byte) 21))).size();
            Context context = this.a;
            String strY0 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i3 >= 34) {
                JobScheduler jobSchedulerA = jaa0.a(context);
                String str2 = null;
                try {
                    listT = y1a1.t(jobSchedulerA);
                } catch (Throwable unused) {
                    qs10.a().getClass();
                    listT = null;
                }
                if (listT != null) {
                    ArrayList arrayListC = c(context, jobSchedulerA);
                    int size2 = arrayListC != null ? listT.size() - arrayListC.size() : 0;
                    if (size2 == 0) {
                        str = null;
                    } else {
                        str = size2 + " of which are not owned by WorkManager";
                    }
                    ArrayList arrayListC2 = c(context, (JobScheduler) context.getSystemService("jobscheduler"));
                    int size3 = arrayListC2 != null ? arrayListC2.size() : 0;
                    if (size3 != 0) {
                        str2 = size3 + " from WorkManager in the default namespace";
                    }
                    strY0 = o7h.y0(f46.i0(new String[]{listT.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str2}), ",\n", (String) null, (String) null, (iu30) null, 62);
                }
            } else {
                ArrayList arrayListC3 = c(context, jaa0.a(context));
                if (arrayListC3 != null) {
                    strY0 = arrayListC3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb = new StringBuilder("JobScheduler ");
            sb.append(i4);
            sb.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb.append(strY0);
            sb.append(".\nThere are ");
            String strJ = gvg.j(sb, size, " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.");
            qs10.a().getClass();
            k220.p(strJ, e2);
        } catch (Throwable unused2) {
            qs10 qs10VarA = qs10.a();
            vwl1Var.toString();
            qs10VarA.getClass();
        }
    }
}
