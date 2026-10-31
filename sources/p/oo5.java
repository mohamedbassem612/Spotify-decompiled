package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oo5 {
    public final Scheduler a;
    public final uf0 b;
    public final pn5 c;
    public final dva d;
    public final idd1 e = new idd1(new f85(this, (byte) 18));

    public oo5(Scheduler scheduler, uf0 uf0Var, pn5 pn5Var, dva dvaVar) {
        this.a = scheduler;
        this.b = uf0Var;
        this.c = pn5Var;
        this.d = dvaVar;
    }

    public final do5 a() {
        mo5 mo5Var;
        boolean zBooleanValue;
        ActivityInfo activityInfo;
        Iterator it = o7h.l1((Iterable) this.d.a.get()).iterator();
        do {
            if (!it.hasNext()) {
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            }
            mo5Var = (mo5) it.next();
            do5 do5Var = mo5Var.a;
            Context context = this.b.a;
            ComponentName componentName = new ComponentName(context, "com.spotify.music.MainActivity");
            PackageManager packageManager = context.getPackageManager();
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            zBooleanValue = false;
            if (componentEnabledSetting == 0) {
                try {
                    ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(context.getPackageName(), 1).activities;
                    if (activityInfoArr != null) {
                        int length = activityInfoArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                activityInfo = null;
                                break;
                            }
                            activityInfo = activityInfoArr[i];
                            if (u890.j(activityInfo.name, "com.spotify.music.MainActivity")) {
                                break;
                            }
                            i++;
                        }
                        Boolean boolValueOf = activityInfo != null ? Boolean.valueOf(activityInfo.enabled) : null;
                        if (boolValueOf != null) {
                            zBooleanValue = boolValueOf.booleanValue();
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } else if (componentEnabledSetting == 1) {
                zBooleanValue = true;
            }
        } while (!zBooleanValue);
        return mo5Var.a;
    }
}
