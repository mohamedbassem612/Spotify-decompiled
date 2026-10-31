package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t1e implements Producer {
    public final /* synthetic */ w1e a;

    public t1e(w1e w1eVar) {
        this.a = w1eVar;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.d);
    }
}
