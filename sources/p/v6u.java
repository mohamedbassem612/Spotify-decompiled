package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v6u implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final ya11 b;
    public final llm c;

    public v6u(ya11 ya11Var, mka mkaVar, q8n q8nVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = ya11Var;
                this.c = us71.h(q8nVar);
                break;
            default:
                this.b = ya11Var;
                this.c = us71.h(q8nVar);
                break;
        }
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.switchMap(new rjn(this, (byte) 26));
            default:
                return observable.switchMap(new ks21(this, (byte) 5));
        }
    }
}
