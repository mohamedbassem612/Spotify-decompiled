package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hse1 implements Producer {
    public final /* synthetic */ jse1 a;

    public hse1(jse1 jse1Var) {
        this.a = jse1Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.a);
    }
}
