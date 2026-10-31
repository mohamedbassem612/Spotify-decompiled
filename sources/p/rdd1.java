package p;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rdd1 {
    public static final rdd1 a = new rdd1();

    public final wdd1 a(Looper looper, Handler.Callback callback) {
        return new wdd1(new Handler(looper, callback));
    }
}
