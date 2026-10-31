package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mt60 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public mt60(xgc xgcVar, g0l g0lVar, Scheduler scheduler, n381 n381Var, g2z g2zVar) {
        this.a = (byte) 3;
        this.f = xgcVar;
        this.c = g0lVar;
        this.d = scheduler;
        this.e = n381Var;
        this.b = g2zVar;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                return observable.flatMap(new ur00((g0l) obj4, (Scheduler) obj3, (n381) obj2, (k9r) obj5, (nfa0) obj, (byte) 10));
            case 1:
                return observable.flatMapSingle(new phi0((mzr0) obj4, (aru0) obj3, (gal) obj2, (rrv0) obj5, (nfa0) obj, (byte) 21));
            case 2:
                return observable.flatMap(new m7y0(this, (byte) 29));
            default:
                return observable.switchMap(new ua91((xgc) obj5, (g0l) obj4, (Scheduler) obj3, (n381) obj2, (g2z) obj, (byte) 9));
        }
    }

    public /* synthetic */ mt60(Object obj, Object obj2, Object obj3, Object obj4, nfa0 nfa0Var, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = nfa0Var;
    }

    public mt60(Scheduler scheduler, bhh bhhVar, mfm mfmVar, lik1 lik1Var, syf syfVar) {
        this.a = (byte) 2;
        this.d = scheduler;
        this.c = bhhVar;
        this.e = mfmVar;
        this.f = lik1Var;
        this.b = syfVar;
    }
}
