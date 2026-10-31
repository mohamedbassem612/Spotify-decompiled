package p;

import android.app.ActivityManager;
import android.app.ApplicationStartInfo;
import android.os.Build;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rrw0 extends hab0 implements Function0 {
    public final /* synthetic */ ActivityManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrw0(ActivityManager activityManager) {
        super(0);
        this.a = activityManager;
    }

    public final Object invoke() {
        List historicalProcessStartReasons;
        ApplicationStartInfo applicationStartInfoB;
        Integer m231Var;
        Integer num = null;
        ActivityManager activityManager = this.a;
        if (activityManager == null || (historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1)) == null || (applicationStartInfoB = uh61.b(o7h.s0(historicalProcessStartReasons))) == null) {
            return null;
        }
        int reason = applicationStartInfoB.getReason();
        if (Build.VERSION.SDK_INT >= 36) {
            try {
                m231Var = Integer.valueOf(applicationStartInfoB.getStartComponent());
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            num = m231Var instanceof m231 ? null : m231Var;
        }
        return new srw0(num, reason);
    }
}
