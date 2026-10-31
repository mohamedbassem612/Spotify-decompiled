package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p9m0 implements Producer {
    public final /* synthetic */ q9m0 a;

    public p9m0(q9m0 q9m0Var) {
        this.a = q9m0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.a.d);
    }
}
