package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pxr {
    public final lze0 a;
    public final yqg b;

    public pxr(lze0 lze0Var, yqg yqgVar) {
        this.a = lze0Var;
        this.b = yqgVar;
    }

    public final Observable a(String str, Scheduler scheduler) {
        return new ObservableFromPublisher(this.a.a).switchMap(new pjq0(scheduler, (byte) 7)).map(new uk4(this, str, (byte) 14)).startWithItem(z7z.a).distinctUntilChanged();
    }
}
