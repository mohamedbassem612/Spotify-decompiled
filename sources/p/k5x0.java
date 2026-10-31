package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k5x0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q8n b;
    public final /* synthetic */ j0a1 c;

    public /* synthetic */ k5x0(q8n q8nVar, j0a1 j0a1Var, byte b) {
        this.a = b;
        this.b = q8nVar;
        this.c = j0a1Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        j0a1 j0a1Var = this.c;
        q8n q8nVar = this.b;
        switch (b) {
            case 0:
                return observable.flatMap(new j5x0(q8nVar, j0a1Var, (byte) 0));
            case 1:
                return observable.switchMap(new n5x0(q8nVar, j0a1Var, (byte) 0));
            case 2:
                return observable.flatMap(new q5x0(q8nVar, j0a1Var, (byte) 0));
            case 3:
                return observable.flatMap(new q5x0(q8nVar, j0a1Var, (byte) 1));
            case 4:
                return observable.flatMap(new n5x0(q8nVar, j0a1Var, (byte) 1));
            default:
                return observable.flatMap(new j5x0(q8nVar, j0a1Var, (byte) 1));
        }
    }
}
