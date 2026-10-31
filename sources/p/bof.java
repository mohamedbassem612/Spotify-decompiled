package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bof implements Producer {
    public final /* synthetic */ fta a;

    public bof(fta ftaVar) {
        this.a = ftaVar;
    }

    public final Object get() {
        return new DispatcherWorker((q8n) this.a.e);
    }
}
