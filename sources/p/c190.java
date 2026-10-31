package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c190 implements Producer {
    public final /* synthetic */ f190 a;

    public c190(f190 f190Var) {
        this.a = f190Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.e);
    }
}
