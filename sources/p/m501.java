package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m501 implements Producer {
    public final /* synthetic */ n501 a;

    public m501(n501 n501Var) {
        this.a = n501Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.a);
    }
}
