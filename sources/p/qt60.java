package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qt60 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public qt60(g0l g0lVar, Scheduler scheduler, n381 n381Var) {
        this.a = (byte) 1;
        this.c = g0lVar;
        this.d = scheduler;
        this.b = n381Var;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return observable.flatMap(new nt60((n381) obj3, (k9r) obj2, (nfa0) obj, (byte) 3));
            case 1:
                return observable.flatMap(new x2a1((g0l) obj2, (Scheduler) obj, (n381) obj3, (byte) 1));
            case 2:
                return observable.switchMap(new dzp0((n381) obj3, (Scheduler) obj2, (r1a1) obj, (byte) 12));
            default:
                Scheduler scheduler = (Scheduler) obj3;
                return observable.observeOn(scheduler).doOnNext(wx91.t).throttleLatest(200L, TimeUnit.MILLISECONDS, (Scheduler) obj2, true).observeOn(scheduler).concatMap(new ltf1((bih1) obj, (byte) 15));
        }
    }

    public /* synthetic */ qt60(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
