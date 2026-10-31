package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r7c1 implements Producer {
    public final /* synthetic */ t7c1 a;

    public r7c1(t7c1 t7c1Var) {
        this.a = t7c1Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.e);
    }
}
