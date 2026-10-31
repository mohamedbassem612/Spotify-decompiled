package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ku3 implements Producer {
    public final /* synthetic */ mu3 a;

    public ku3(mu3 mu3Var) {
        this.a = mu3Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.e);
    }
}
