package p;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f15 {
    public static boolean a(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        if (!(runningServices instanceof Collection) || !runningServices.isEmpty()) {
            for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (e15.a[l1d.C(1)] != 1) {
                    eg.o();
                    break;
                }
                if ("com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService".equals(runningServiceInfo.service.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
