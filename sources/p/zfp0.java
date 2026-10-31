package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zfp0 implements ObservableTransformer {
    public final ArrayList a;

    public zfp0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final ObservableSource apply(Observable observable) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            observable = observable.compose((ObservableTransformer) it.next());
        }
        return observable;
    }
}
