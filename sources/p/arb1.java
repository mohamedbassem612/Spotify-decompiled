package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class arb1 implements w9u0 {
    public final ruz a;
    public final grb1 b;

    public arb1(ruz ruzVar, grb1 grb1Var) {
        this.a = ruzVar;
        this.b = grb1Var;
    }

    public final Single a(q9u0 q9u0Var) {
        return new CompletableFromAction(new dkb1(q9u0Var, this, (byte) 1)).e(this.a.a(q9u0Var));
    }
}
