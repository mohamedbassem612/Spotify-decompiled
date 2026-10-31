package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tfb {
    public final ObservableRefCount a;

    public tfb(g5t g5tVar, Scheduler scheduler) {
        Observable map = yoi1.i(((vdr) ((ck) g5tVar.get())).g, o6x.a).filter(rfb.a).map(sfb.a);
        hi hiVar = (hi) o7h.C0((List) ((vdr) ((ck) g5tVar.get())).f.getValue());
        this.a = map.startWithItem(hiVar != null ? dug.i(w081.c(hiVar)) : dug.n()).distinctUntilChanged().subscribeOn(scheduler).replay(1).f();
    }
}
