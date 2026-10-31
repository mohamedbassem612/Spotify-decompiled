package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j201 implements Producer {
    public final /* synthetic */ k201 a;

    public j201(k201 k201Var) {
        this.a = k201Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.a);
    }
}
