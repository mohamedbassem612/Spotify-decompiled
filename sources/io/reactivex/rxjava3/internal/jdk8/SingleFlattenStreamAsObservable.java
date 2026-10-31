package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleFlattenStreamAsObservable<T, R> extends Observable<R> {
    public final Single a;
    public final Function b;

    public SingleFlattenStreamAsObservable(Single single, Function function) {
        this.a = single;
        this.b = function;
    }

    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new MaybeFlattenStreamAsObservable$FlattenStreamMultiObserver(observer, this.b));
    }
}
