package p;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class jaa0 {
    public static final /* synthetic */ int a = 0;

    static {
        qs10.c("SystemJobScheduler");
    }

    public static final JobScheduler a(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return Build.VERSION.SDK_INT >= 34 ? sf.k(jobScheduler) : jobScheduler;
    }
}
