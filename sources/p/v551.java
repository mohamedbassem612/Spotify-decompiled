package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v551 implements Producer {
    public final /* synthetic */ y551 a;

    public v551(y551 y551Var) {
        this.a = y551Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.a);
    }
}
