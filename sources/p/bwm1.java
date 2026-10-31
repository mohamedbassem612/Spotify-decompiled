package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bwm1 implements Producer {
    public final /* synthetic */ iwm1 a;

    public bwm1(iwm1 iwm1Var) {
        this.a = iwm1Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.c);
    }
}
