package com.spotify.mobius.rx3;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class MergedTransformer<T, R> implements ObservableTransformer<T, R> {
    public final ArrayList a;

    public MergedTransformer(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        return observable.publish(new Function<Observable<Object>, Observable<Object>>() { // from class: com.spotify.mobius.rx3.MergedTransformer.1
            @Override // io.reactivex.rxjava3.functions.Function
            public final Object apply(Object obj) {
                Observable observable2 = (Observable) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it = MergedTransformer.this.a.iterator();
                while (it.hasNext()) {
                    arrayList.add(observable2.compose((ObservableTransformer) it.next()));
                }
                return Observable.merge(arrayList);
            }
        });
    }
}
