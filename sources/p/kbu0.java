package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kbu0 extends ugp0 {
    public final Flowable d;

    public kbu0(Flowable flowable, Scheduler scheduler) {
        super(scheduler);
        this.d = flowable;
    }

    public final String b() {
        return "music_is_playing";
    }

    @Override // p.ugp0
    public final Observable e() {
        return new ObservableFromPublisher(new FlowableOnBackpressureLatest(this.d.N(PlayerState.EMPTY).x(qs10.a1)).t(Functions.a).J(ws10.a1));
    }
}
