package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wj00 implements Producer {
    public static final wj00 a = new wj00();

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(igu.a);
    }
}
