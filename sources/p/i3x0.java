package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i3x0 implements Producer {
    public final /* synthetic */ k3x0 a;

    public i3x0(k3x0 k3x0Var) {
        this.a = k3x0Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.o);
    }
}
