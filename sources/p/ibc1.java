package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ibc1 implements Producer {
    public final /* synthetic */ kbc1 a;

    public ibc1(kbc1 kbc1Var) {
        this.a = kbc1Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.n);
    }
}
