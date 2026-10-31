package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rb41 implements Producer {
    public final /* synthetic */ vb41 a;

    public rb41(vb41 vb41Var) {
        this.a = vb41Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.b);
    }
}
