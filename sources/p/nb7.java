package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nb7 implements Producer {
    public final /* synthetic */ pb7 a;

    public nb7(pb7 pb7Var) {
        this.a = pb7Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.a);
    }
}
