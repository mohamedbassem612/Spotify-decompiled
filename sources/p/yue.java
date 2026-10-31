package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yue implements Producer {
    public final /* synthetic */ ave a;

    public yue(ave aveVar) {
        this.a = aveVar;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.c);
    }
}
