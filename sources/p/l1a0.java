package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l1a0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Observable b;

    public /* synthetic */ l1a0(Observable observable, byte b) {
        this.a = b;
        this.b = observable;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Observable observable = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                if (bool.equals(Boolean.TRUE)) {
                    return observable;
                }
                if (bool.equals(Boolean.FALSE)) {
                    return Observable.empty();
                }
                eg.o();
                return null;
            default:
                return observable.startWithItem((Map) obj);
        }
    }
}
