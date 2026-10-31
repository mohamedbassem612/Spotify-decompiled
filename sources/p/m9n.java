package p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m9n {
    public final krj1 a;
    public final rny0 b = new rny0();
    public Disposable c;

    public m9n(krj1 krj1Var) {
        this.a = krj1Var;
    }

    public final boolean a() {
        Disposable disposable = this.c;
        return (disposable == null || disposable.isDisposed()) ? false : true;
    }

    public final void b(crj1 crj1Var) {
        this.b.accept(this.a.d(crj1Var));
    }
}
