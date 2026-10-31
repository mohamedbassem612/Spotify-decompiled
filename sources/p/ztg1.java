package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ztg1 implements Producer {
    public final /* synthetic */ aug1 a;

    public ztg1(aug1 aug1Var) {
        this.a = aug1Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.d);
    }
}
