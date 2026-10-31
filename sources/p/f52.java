package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f52 implements Producer {
    public final /* synthetic */ g52 a;

    public f52(g52 g52Var) {
        this.a = g52Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.b);
    }
}
