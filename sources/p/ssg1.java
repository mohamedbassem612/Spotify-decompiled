package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ssg1 implements Producer {
    public final /* synthetic */ tsg1 a;

    public ssg1(tsg1 tsg1Var) {
        this.a = tsg1Var;
    }

    public final Object get() {
        return new DispatcherWorker(this.a.b);
    }
}
