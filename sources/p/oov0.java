package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oov0 implements ObservableTransformer {
    public final d0r a;
    public final s8a1 b;
    public final q8n c;

    public oov0(d0r d0rVar, s8a1 s8a1Var, q8n q8nVar) {
        this.a = d0rVar;
        this.b = s8a1Var;
        this.c = q8nVar;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.switchMap(new jxp0(this, (byte) 14));
    }
}
