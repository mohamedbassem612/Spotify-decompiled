package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z850 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wza0 b;

    public /* synthetic */ z850(wza0 wza0Var, byte b) {
        this.a = b;
        this.b = wza0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        wza0 wza0Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new il00(wza0Var, (byte) 9));
            default:
                return observable.switchMap(new wb00(wza0Var, (byte) 13));
        }
    }
}
