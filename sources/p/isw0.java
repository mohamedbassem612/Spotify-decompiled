package p;

import android.os.Process;
import android.os.SystemClock;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class isw0 implements xgn {
    public final List a() {
        Long m231Var;
        try {
            m231Var = Long.valueOf(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime());
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = -1L;
        }
        return Collections.singletonList(new bgn(m231Var.longValue()));
    }
}
