package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e8m0 implements Producer {
    public final /* synthetic */ Scheduler a;

    public e8m0(Scheduler scheduler) {
        this.a = scheduler;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.a);
    }
}
