package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pud1 implements Producer {
    public final /* synthetic */ rud1 a;

    public pud1(rud1 rud1Var) {
        this.a = rud1Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.b);
    }
}
