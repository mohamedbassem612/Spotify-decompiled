package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z8o0 {
    public final a9o0 a;
    public final PublishSubject b = new PublishSubject();

    public z8o0(a9o0 a9o0Var) {
        this.a = a9o0Var;
    }

    public final Observable a(String str) {
        return this.b.filter(new acn1(str, (byte) 8)).map(xj20.Q0).startWith(this.a.d(str)).distinctUntilChanged();
    }
}
