package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gnr implements Producer {
    public final /* synthetic */ inr a;

    public gnr(inr inrVar) {
        this.a = inrVar;
    }

    public final Object get() {
        return new SchedulerWorkRunner((Scheduler) this.a.g.get());
    }
}
