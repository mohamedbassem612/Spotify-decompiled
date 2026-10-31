package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dip0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Observable b;

    public /* synthetic */ dip0(Observable observable, byte b) {
        this.a = b;
        this.b = observable;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Observable observable = this.b;
        switch (b) {
            case 0:
                return ((Boolean) obj).booleanValue() ? observable.startWithItem(r560.a) : observable.startWithItem(r560.b);
            default:
                return observable.firstElement();
        }
    }
}
