package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wgk0 implements Producer {
    public final /* synthetic */ ygk0 a;

    public wgk0(ygk0 ygk0Var) {
        this.a = ygk0Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.b);
    }
}
