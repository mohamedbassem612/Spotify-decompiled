package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u750 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f0b0 b;

    public /* synthetic */ u750(f0b0 f0b0Var, byte b) {
        this.a = b;
        this.b = f0b0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        byte b2 = 25;
        f0b0 f0b0Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new mjv(f0b0Var, (byte) 21));
            case 1:
                return observable.switchMap(new j3v(f0b0Var, b2));
            case 2:
                return observable.switchMap(new hl00(f0b0Var, (byte) 10));
            case 3:
                return observable.switchMap(new jl00(f0b0Var, (byte) 13));
            case 4:
                return observable.switchMap(new ouz(f0b0Var, (byte) 11));
            default:
                return observable.switchMap(new dqu(f0b0Var, (byte) 25));
        }
    }
}
