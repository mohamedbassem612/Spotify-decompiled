package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a340 implements Producer {
    public final /* synthetic */ b340 a;

    public a340(b340 b340Var) {
        this.a = b340Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.b);
    }
}
