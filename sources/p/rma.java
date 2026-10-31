package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rma {
    public final Single a;
    public final qma b;
    public qma c;
    public Disposable d;

    public rma(Single single, qma qmaVar) {
        this.a = single;
        this.b = qmaVar;
    }

    public final qma a() {
        qma qmaVar = this.c;
        return qmaVar == null ? this.b : qmaVar;
    }
}
