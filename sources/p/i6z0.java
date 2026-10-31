package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i6z0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t6z0 b;

    public /* synthetic */ i6z0(t6z0 t6z0Var, byte b) {
        this.a = b;
        this.b = t6z0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        t6z0 t6z0Var = this.b;
        switch (b) {
            case 0:
                return observable.flatMap(new h6z0(t6z0Var, (byte) 0));
            case 1:
                return observable.flatMap(new j6z0(t6z0Var, (byte) 0));
            case 2:
                return observable.flatMap(new sks0(t6z0Var, (byte) 25)).flatMap(new k6z0(t6z0Var, (byte) 0));
            case 3:
                return observable.flatMap(new l6z0(t6z0Var, (byte) 0));
            case 4:
                return observable.switchMap(new m6z0(t6z0Var, (byte) 0));
            case 5:
                return observable.switchMap(new p6z0(t6z0Var, (byte) 0));
            case 6:
                return observable.switchMap(new vqv0(t6z0Var, (byte) 9));
            case 7:
                return observable.switchMap(new q3c(t6z0Var));
            case 8:
                return observable.switchMap(new h6z0(t6z0Var, (byte) 1));
            case 9:
                return observable.flatMap(new j6z0(t6z0Var, (byte) 1));
            case 10:
                return observable.flatMap(new k6z0(t6z0Var, (byte) 1));
            case 11:
                return observable.flatMap(new l6z0(t6z0Var, (byte) 1));
            case 12:
                return observable.flatMap(new vyq0(t6z0Var, (byte) 23));
            case 13:
                return observable.flatMap(new m6z0(t6z0Var, (byte) 1));
            case 14:
                return observable.flatMap(new s6z0(t6z0Var, (byte) 0));
            case 15:
                return observable.flatMap(new uip0(t6z0Var, (byte) 28));
            case 16:
                return observable.flatMap(new p6z0(t6z0Var, (byte) 1));
            default:
                return observable.flatMap(new mlw0(t6z0Var, (byte) 12));
        }
    }
}
