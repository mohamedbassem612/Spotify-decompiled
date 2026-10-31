package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cof implements Producer {
    public final /* synthetic */ fta a;

    public cof(fta ftaVar) {
        this.a = ftaVar;
    }

    public final Object get() {
        return new DispatcherWorker((q8n) this.a.d);
    }
}
