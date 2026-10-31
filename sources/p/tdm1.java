package p;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class tdm1 extends tv30 implements Function0 {
    public static final tdm1 a = new tdm1(0, SystemClock.class, "elapsedRealtimeNanos", "elapsedRealtimeNanos()J", 0);

    public final Object invoke() {
        return Long.valueOf(SystemClock.elapsedRealtimeNanos());
    }
}
