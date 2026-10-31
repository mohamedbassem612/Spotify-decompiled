package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w86 implements Producer {
    public final /* synthetic */ x86 a;

    public w86(x86 x86Var) {
        this.a = x86Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.b);
    }
}
