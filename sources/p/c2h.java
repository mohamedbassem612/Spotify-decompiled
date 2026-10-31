package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c2h implements Producer {
    public final /* synthetic */ Scheduler a;

    public c2h(Scheduler scheduler) {
        this.a = scheduler;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a);
    }
}
