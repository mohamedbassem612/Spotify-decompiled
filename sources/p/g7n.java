package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g7n extends gn21 {
    public final rfs a;
    public final BehaviorSubject b;
    public final Observable c;

    public g7n(rfs rfsVar, w8v0 w8v0Var, String str, t881 t881Var, hr00 hr00Var) {
        this.a = rfsVar;
        rfsVar.b();
        w2z w2zVarA = hr00Var.a.a(str, t881Var);
        BehaviorSubject behaviorSubjectG = BehaviorSubject.g(w8v0Var);
        this.b = behaviorSubjectG;
        this.c = behaviorSubjectG.switchMap(new a0m(w2zVarA, (byte) 2)).doOnNext(new yrh(this, (byte) 8));
    }

    public final Observable a() {
        return this.c;
    }

    public final void accept(Object obj) {
        this.b.onNext((w8v0) obj);
    }
}
