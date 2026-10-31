package p;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ged1 {
    public final ComponentName a;

    static {
        qs10.c("SystemJobInfoConverter");
    }

    public ged1(Context context, ytw0 ytw0Var) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JobInfo a(vwl1 vwl1Var, int i) {
        int i2;
        String str;
        gjl gjlVar = vwl1Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", vwl1Var.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", vwl1Var.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", vwl1Var.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.a);
        boolean z = gjlVar.c;
        Set<ejl> set = gjlVar.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = gjlVar.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest networkRequestA = gjlVar.a();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || networkRequestA == null) {
            int i4 = gjlVar.a;
            if (i3 < 30 || i4 != 6) {
                int iC = l1d.C(i4);
                if (iC == 0) {
                    i2 = 0;
                } else if (iC != 1) {
                    i2 = 2;
                    if (iC != 2) {
                        i2 = 3;
                        if (iC != 3) {
                            i2 = 4;
                            if (iC != 4 || i3 < 26) {
                                qs10 qs10VarA = qs10.a();
                                switch (i4) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                        qs10VarA.getClass();
                                        break;
                                    default:
                                        throw null;
                                }
                                i2 = 1;
                            }
                        }
                    }
                } else {
                    i2 = 1;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            ph5.T(extras, networkRequestA);
        }
        if (!z2) {
            extras.setBackoffCriteria(vwl1Var.m, vwl1Var.l == h0a.b ? 0 : 1);
        }
        long jMax = Math.max(vwl1Var.a() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!vwl1Var.q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (ejl ejlVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(ejlVar.a(), ejlVar.b() ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(gjlVar.g);
            extras.setTriggerContentMaxDelay(gjlVar.h);
        }
        extras.setPersisted(false);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            extras.setRequiresBatteryNotLow(gjlVar.e);
            extras.setRequiresStorageNotLow(gjlVar.f);
        }
        Object[] objArr = vwl1Var.k > 0;
        boolean z3 = jMax > 0;
        if (i5 >= 31 && vwl1Var.q && objArr == false && !z3) {
            extras.setExpedited(true);
        }
        if (i5 >= 35 && (str = vwl1Var.x) != null) {
            extras.setTraceTag(str);
        }
        return extras.build();
    }
}
