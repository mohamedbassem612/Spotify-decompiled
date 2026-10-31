package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ivv implements Producer {
    public final /* synthetic */ jvv a;

    public ivv(jvv jvvVar) {
        this.a = jvvVar;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.d);
    }
}
