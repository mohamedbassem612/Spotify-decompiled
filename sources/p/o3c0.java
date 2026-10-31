package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o3c0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q3c0 b;

    public /* synthetic */ o3c0(q3c0 q3c0Var, byte b) {
        this.a = b;
        this.b = q3c0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        q3c0 q3c0Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new jpa0(q3c0Var, (byte) 4));
            case 1:
                return observable.flatMapSingle(new dg90(q3c0Var, (byte) 7)).map(new upa0(q3c0Var, (byte) 3));
            case 2:
                return observable.switchMap(new eb80(q3c0Var, (byte) 8));
            default:
                return observable.switchMap(new il00(q3c0Var, (byte) 22));
        }
    }
}
