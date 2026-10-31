package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oab1 implements f961 {
    public final bbc a = mno1.a(10, 0, 6);

    public final void shutdown() {
        this.a.d((CancellationException) null);
    }

    public final Object getApi() {
        return this;
    }
}
