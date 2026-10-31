package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p1p0 implements Producer {
    public final /* synthetic */ q1p0 a;

    public p1p0(q1p0 q1p0Var) {
        this.a = q1p0Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.l);
    }
}
