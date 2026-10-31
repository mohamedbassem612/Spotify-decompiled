package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class az01 implements Producer {
    public final /* synthetic */ cz01 a;

    public az01(cz01 cz01Var) {
        this.a = cz01Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.b);
    }
}
