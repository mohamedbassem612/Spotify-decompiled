package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class owv implements Producer {
    public final /* synthetic */ pwv a;

    public owv(pwv pwvVar) {
        this.a = pwvVar;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.e);
    }
}
