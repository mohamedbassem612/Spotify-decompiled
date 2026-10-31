package p;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class d5m extends tv30 implements Function0 {
    public static final d5m a = new d5m(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);

    public final Object invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
