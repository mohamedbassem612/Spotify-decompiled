package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class veq0 implements Producer {
    public final /* synthetic */ weq0 a;

    public veq0(weq0 weq0Var) {
        this.a = weq0Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.d);
    }
}
