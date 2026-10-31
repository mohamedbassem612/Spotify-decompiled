package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gkg implements Producer {
    public final /* synthetic */ Scheduler a;

    public gkg(Scheduler scheduler) {
        this.a = scheduler;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a);
    }
}
