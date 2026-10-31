package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ot60 implements ObservableTransformer {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ xgc b;
    public final /* synthetic */ k9r c;
    public final /* synthetic */ n381 d;
    public final /* synthetic */ nfa0 e;

    public ot60(xgc xgcVar, k9r k9rVar, n381 n381Var, nfa0 nfa0Var) {
        this.b = xgcVar;
        this.c = k9rVar;
        this.d = n381Var;
        this.e = nfa0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        nfa0 nfa0Var = this.e;
        n381 n381Var = this.d;
        k9r k9rVar = this.c;
        xgc xgcVar = this.b;
        switch (b) {
            case 0:
                return observable.flatMap(new nt60(xgcVar, n381Var, k9rVar, nfa0Var));
            default:
                return observable.flatMapSingle(new nt60(xgcVar, k9rVar, n381Var, nfa0Var));
        }
    }

    public ot60(xgc xgcVar, n381 n381Var, k9r k9rVar, nfa0 nfa0Var) {
        this.b = xgcVar;
        this.d = n381Var;
        this.c = k9rVar;
        this.e = nfa0Var;
    }
}
