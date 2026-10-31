package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zhb0 implements Producer {
    public final /* synthetic */ bib0 a;

    public zhb0(bib0 bib0Var) {
        this.a = bib0Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.c);
    }
}
