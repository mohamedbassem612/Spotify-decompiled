package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ppz0 implements Producer {
    public final /* synthetic */ qpz0 a;

    public ppz0(qpz0 qpz0Var) {
        this.a = qpz0Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.d);
    }
}
