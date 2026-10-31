package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y130 implements Producer {
    public final /* synthetic */ g230 a;

    public y130(g230 g230Var) {
        this.a = g230Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.c);
    }
}
