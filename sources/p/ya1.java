package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ya1 implements Producer {
    public final /* synthetic */ ab1 a;

    public ya1(ab1 ab1Var) {
        this.a = ab1Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.b);
    }
}
