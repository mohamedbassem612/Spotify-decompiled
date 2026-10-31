package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class llk1 implements Producer {
    public final /* synthetic */ rlk1 a;

    public llk1(rlk1 rlk1Var) {
        this.a = rlk1Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.b);
    }
}
