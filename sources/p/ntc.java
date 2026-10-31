package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ntc implements etq0, Consumer {
    public final cdh a;
    public final Observable b;

    public ntc(Scheduler scheduler, cdh cdhVar) {
        nm3 nm3Var = nm3.c;
        this.a = cdhVar;
        this.b = cdhVar.compose(nm3Var).replay(1).f().observeOn(scheduler);
    }

    public final void accept(Object obj) {
        this.a.accept(obj);
    }

    public final Observable b() {
        return this.b;
    }
}
