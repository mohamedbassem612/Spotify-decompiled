package p;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ema1 implements kly0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SharedPreferences b;

    public /* synthetic */ ema1(SharedPreferences sharedPreferences, byte b) {
        this.a = b;
        this.b = sharedPreferences;
    }

    public final Object get() {
        byte b = this.a;
        return this.b;
    }
}
