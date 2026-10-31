package p;

import android.os.Handler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n2i0 {
    public volatile Handler a;

    public final Handler a() {
        Handler handler = this.a;
        if (handler != null) {
            return handler;
        }
        eg.m("MediaSession worker thread not started");
        return null;
    }
}
