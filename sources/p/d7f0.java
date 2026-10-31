package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d7f0 implements Producer {
    public final /* synthetic */ f7f0 a;

    public d7f0(f7f0 f7f0Var) {
        this.a = f7f0Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.j);
    }
}
