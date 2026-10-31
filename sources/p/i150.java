package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i150 implements Producer {
    public final /* synthetic */ l150 a;

    public i150(l150 l150Var) {
        this.a = l150Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.d);
    }
}
