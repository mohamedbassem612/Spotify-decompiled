package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n22 implements Producer {
    public final /* synthetic */ q22 a;

    public n22(q22 q22Var) {
        this.a = q22Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.c);
    }
}
