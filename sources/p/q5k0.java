package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q5k0 implements Producer {
    public final /* synthetic */ r5k0 a;

    public q5k0(r5k0 r5k0Var) {
        this.a = r5k0Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.d);
    }
}
