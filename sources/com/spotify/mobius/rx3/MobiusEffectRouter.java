package com.spotify.mobius.rx3;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class MobiusEffectRouter<F, E> implements ObservableTransformer<F, E> {
    public final MergedTransformer a;

    public MobiusEffectRouter(Set set, Collection collection) {
        final HashSet hashSet = new HashSet(set);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(collection));
        ObservableTransformer<Object, Object> observableTransformer = new ObservableTransformer<Object, Object>() { // from class: com.spotify.mobius.rx3.MobiusEffectRouter.1

            /* JADX INFO: renamed from: com.spotify.mobius.rx3.MobiusEffectRouter$1$1, reason: invalid class name and collision with other inner class name */
            class C00061 implements Function<Object, Object> {
                /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.mobius.rx3.UnknownEffectException */
                @Override // io.reactivex.rxjava3.functions.Function
                public final Object apply(Object obj) throws UnknownEffectException {
                    throw new UnknownEffectException(obj);
                }
            }

            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource apply(Observable observable) {
                return observable.filter(new Predicate<Object>() { // from class: com.spotify.mobius.rx3.MobiusEffectRouter.1.2
                    @Override // io.reactivex.rxjava3.functions.Predicate
                    public final boolean test(Object obj) {
                        Iterator<E> it = hashSet.iterator();
                        while (it.hasNext()) {
                            if (((Class) it.next()).isAssignableFrom(obj.getClass())) {
                                return false;
                            }
                        }
                        return true;
                    }
                }).map(new C00061());
            }
        };
        ArrayList arrayList = new ArrayList(listUnmodifiableList);
        arrayList.add(observableTransformer);
        this.a = new MergedTransformer(arrayList);
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        return observable.compose(this.a);
    }
}
