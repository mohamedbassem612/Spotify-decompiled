package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b2n1 implements Producer {
    public final /* synthetic */ d2n1 a;

    public b2n1(d2n1 d2n1Var) {
        this.a = d2n1Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.n);
    }
}
