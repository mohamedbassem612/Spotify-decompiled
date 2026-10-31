package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cvm0 implements njj0 {
    public final uu00 a;
    public final String b;
    public final Scheduler c;
    public final Scheduler d;

    public cvm0(uu00 uu00Var, String str, Scheduler scheduler, Scheduler scheduler2) {
        this.a = uu00Var;
        this.b = str;
        this.c = scheduler;
        this.d = scheduler2;
    }

    public final Observable a(g4r g4rVar) {
        return Observable.defer(new xf0(this, g4rVar, (byte) 7)).subscribeOn(this.d).takeUntil(bk20.O0).flatMap(new drj0(g4rVar, this, (byte) 5));
    }
}
