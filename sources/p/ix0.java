package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ix0 {
    public final Observable a;
    public final Scheduler b;
    public final rku c = new rku();

    public ix0(Observable observable, Scheduler scheduler) {
        this.a = observable;
        this.b = scheduler;
    }
}
