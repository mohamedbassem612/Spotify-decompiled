package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j3b1 implements Producer {
    public final /* synthetic */ m3b1 a;

    public j3b1(m3b1 m3b1Var) {
        this.a = m3b1Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.c);
    }
}
