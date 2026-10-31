package p;

import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wcs implements Function0 {
    public final Observable a;
    public final na b;

    public wcs(Observable observable, na naVar) {
        this.a = observable;
        this.b = naVar;
    }

    public final Object invoke() {
        Observable observableStartWithItem;
        boolean zBooleanValue = ((Boolean) this.b.invoke()).booleanValue();
        Observable observable = this.a;
        if (zBooleanValue) {
            observableStartWithItem = observable.startWithItem(r560.a);
            observableStartWithItem.getClass();
        } else {
            observableStartWithItem = observable.startWithItem(r560.b);
            observableStartWithItem.getClass();
        }
        return observableStartWithItem.map(ios.W0);
    }
}
