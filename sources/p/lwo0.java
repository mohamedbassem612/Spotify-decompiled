package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lwo0 implements Producer {
    public final /* synthetic */ mwo0 a;

    public lwo0(mwo0 mwo0Var) {
        this.a = mwo0Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.b);
    }
}
