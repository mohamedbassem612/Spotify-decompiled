package p;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class op5 implements wgn {
    public final long a = SystemClock.elapsedRealtime();

    public final List a() {
        return p7h.M(new ugn[]{cgn.a, ren.a, new ogn(SystemClock.elapsedRealtime() - this.a)});
    }
}
