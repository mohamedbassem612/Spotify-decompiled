package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oqk1 implements Producer {
    public final /* synthetic */ pqk1 a;

    public oqk1(pqk1 pqk1Var) {
        this.a = pqk1Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.b);
    }
}
