package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r9v {
    public final Observable a;
    public final zm4 b;
    public final Scheduler c;
    public final rku d = new rku();

    public r9v(Observable observable, zm4 zm4Var, Scheduler scheduler) {
        this.a = observable;
        this.b = zm4Var;
        this.c = scheduler;
    }
}
