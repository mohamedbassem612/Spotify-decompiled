package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dq61 implements EventSource {
    public final idd1 a;

    public dq61(nt8 nt8Var, nr61 nr61Var) {
        this.a = new idd1(new fh61(nt8Var, nr61Var, (byte) 2));
    }

    public final Disposable a(Consumer consumer) {
        return ((EventSource) this.a.getValue()).a(consumer);
    }
}
