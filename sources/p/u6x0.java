package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u6x0 implements Producer {
    public final /* synthetic */ w6x0 a;

    public u6x0(w6x0 w6x0Var) {
        this.a = w6x0Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.b);
    }
}
