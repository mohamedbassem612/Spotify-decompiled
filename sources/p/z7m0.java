package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z7m0 implements Producer {
    public final /* synthetic */ b8m0 a;

    public z7m0(b8m0 b8m0Var) {
        this.a = b8m0Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.b);
    }
}
