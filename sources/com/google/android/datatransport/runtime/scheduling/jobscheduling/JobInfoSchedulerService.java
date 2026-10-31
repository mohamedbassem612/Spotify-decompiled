package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p.ag20;
import p.aow0;
import p.ix7;
import p.jog1;
import p.s29;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        jog1.b(getApplicationContext());
        ix7 ix7VarA = s29.a();
        ix7VarA.s(string);
        ix7VarA.x(aow0.b(i));
        if (string2 != null) {
            ix7VarA.u(Base64.decode(string2, 0));
        }
        jog1.a().d.p(ix7VarA.j(), i2, new ag20(this, jobParameters, (byte) 12));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
