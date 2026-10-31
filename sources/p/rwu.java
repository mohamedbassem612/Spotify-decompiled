package p;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rwu {
    public final qwu a;

    public rwu(qwu qwuVar) {
        this.a = qwuVar;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).post(new a6n(this, (byte) 15));
    }
}
