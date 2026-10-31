package p;

import com.spotify.logging.logging.Logging;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j5n implements jlq0 {
    public final boolean a;

    public j5n(boolean z) {
        this.a = z;
    }

    @Override // p.jlq0
    public final void c() {
        Logging.INSTANCE.initLogging(this.a);
    }

    @Override // p.jlq0
    public final String getName() {
        return "CoreLoggingStartupOperation";
    }
}
