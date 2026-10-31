package p;

import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qvo implements Function0 {
    public final xvo a;
    public final boolean b;
    public final boolean c;

    public qvo(xvo xvoVar, boolean z, boolean z2) {
        this.a = xvoVar;
        this.b = z;
        this.c = z2;
    }

    public final Object invoke() {
        if (this.c && this.b) {
            Observable observableDistinctUntilChanged = this.a.a(true).distinctUntilChanged();
            observableDistinctUntilChanged.getClass();
            return observableDistinctUntilChanged;
        }
        Observable observableJust = Observable.just(Boolean.FALSE);
        observableJust.getClass();
        return observableJust;
    }
}
