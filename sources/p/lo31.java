package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lo31 implements Producer {
    public final /* synthetic */ so31 a;

    public lo31(so31 so31Var) {
        this.a = so31Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.c);
    }
}
