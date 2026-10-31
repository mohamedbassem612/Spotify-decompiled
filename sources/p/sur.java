package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sur implements Producer {
    public final /* synthetic */ tur a;

    public sur(tur turVar) {
        this.a = turVar;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.d);
    }
}
