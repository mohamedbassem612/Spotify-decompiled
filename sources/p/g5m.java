package p;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class g5m extends tv30 implements Function0 {
    public static final g5m a = new g5m(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);

    public final Object invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
