package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ag7 implements Producer {
    public final /* synthetic */ cg7 a;

    public ag7(cg7 cg7Var) {
        this.a = cg7Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.a);
    }
}
