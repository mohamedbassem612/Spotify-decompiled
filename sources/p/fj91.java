package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fj91 implements Producer {
    public final /* synthetic */ hj91 a;

    public fj91(hj91 hj91Var) {
        this.a = hj91Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.d);
    }
}
