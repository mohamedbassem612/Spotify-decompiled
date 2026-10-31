package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.Function;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Functions$ListSorter<T> implements Function<List<T>, List<T>> {
    public final Comparator a;

    public Functions$ListSorter(Comparator comparator) {
        this.a = comparator;
    }

    public final Object apply(Object obj) {
        List list = (List) obj;
        Collections.sort(list, this.a);
        return list;
    }
}
