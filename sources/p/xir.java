package p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xir {
    public final xya a;
    public final BehaviorSubject b = BehaviorSubject.g(w7x.a);
    public final BehaviorSubject c = BehaviorSubject.g(Boolean.FALSE);
    public final PublishSubject d = new PublishSubject();
    public final PublishSubject e = new PublishSubject();
    public final BehaviorSubject f = BehaviorSubject.g(-1L);

    public xir(xya xyaVar) {
        this.a = xyaVar;
    }
}
