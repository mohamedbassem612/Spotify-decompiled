package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class crb1 implements xbu0 {
    public final suz a;
    public final grb1 b;

    public crb1(suz suzVar, grb1 grb1Var) {
        this.a = suzVar;
        this.b = grb1Var;
    }

    public final Single a(boolean z) {
        return new CompletableFromAction(new brb1(this, z)).e(this.a.a(z));
    }

    public final Single setRepeatMode(int i) {
        return new CompletableFromAction(new n68(this, i, (byte) 3)).e(this.a.setRepeatMode(i));
    }
}
