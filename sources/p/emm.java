package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class emm implements f961 {
    public final fna a = new fna();
    public final rku b;

    public emm(caq caqVar, g0l g0lVar) {
        rku rkuVar = new rku();
        this.b = rkuVar;
        new PublishSubject();
        if (((ub4) caqVar.get()).a()) {
            inr inrVar = (inr) g0lVar;
            rkuVar.b(Observable.combineLatest(inrVar.d(), inrVar.l(), new t2b(this, (byte) 3)).distinctUntilChanged().subscribe(new yrh(this, (byte) 6)));
        }
    }

    public final void shutdown() {
        this.b.a();
    }

    public final Object getApi() {
        return this;
    }
}
