package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mw30 implements Producer {
    public static final mw30 a = new mw30();

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        fns fnsVar = igu.a;
        return new DispatcherWorker(pyf0.a);
    }
}
