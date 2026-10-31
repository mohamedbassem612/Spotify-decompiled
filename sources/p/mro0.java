package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mro0 implements Producer {
    public final /* synthetic */ oro0 a;

    public mro0(oro0 oro0Var) {
        this.a = oro0Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.b);
    }
}
