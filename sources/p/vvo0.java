package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vvo0 implements Producer {
    public final /* synthetic */ wvo0 a;

    public vvo0(wvo0 wvo0Var) {
        this.a = wvo0Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.f);
    }
}
