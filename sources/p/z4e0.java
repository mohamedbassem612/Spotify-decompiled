package p;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class z4e0 extends tv30 implements Function0 {
    public static final z4e0 a = new z4e0(0, SystemClock.class, "uptimeMillis", "uptimeMillis()J", 0);

    public final Object invoke() {
        return Long.valueOf(SystemClock.uptimeMillis());
    }
}
