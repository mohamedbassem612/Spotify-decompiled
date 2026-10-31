package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xk20 implements Producer {
    public final /* synthetic */ zk20 a;

    public xk20(zk20 zk20Var) {
        this.a = zk20Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.b);
    }
}
