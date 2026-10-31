package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fip0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public fip0(a201 a201Var, hn91 hn91Var, mf81 mf81Var, soc0 soc0Var, pf81 pf81Var, q7j0 q7j0Var) {
        this.a = (byte) 0;
        this.b = a201Var;
        this.c = hn91Var;
        this.d = mf81Var;
        this.e = soc0Var;
        this.f = pf81Var;
        this.g = q7j0Var;
        this.h = new ConcurrentHashMap();
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        ObservableSource observableSourceDistinctUntilChanged;
        switch (this.a) {
            case 0:
                return observable.switchMap(new hod0(this, (byte) 29));
            default:
                g7h g7hVar = (g7h) this.h;
                String str = (String) this.b;
                Observable map = g7h.d(g7hVar, str, new String[]{str}).map(new o2b1(this, (byte) 12));
                if (((dg4) this.g).c()) {
                    observableSourceDistinctUntilChanged = new ObservableFromPublisher(yoi1.h(new jha1(((yzc0) this.e).j(), (byte) 15), o6x.a));
                } else {
                    observableSourceDistinctUntilChanged = new ObservableFromPublisher((Flowable) this.f).map(new vr51(this, (byte) 27)).distinctUntilChanged();
                    observableSourceDistinctUntilChanged.getClass();
                }
                return Observable.combineLatest(observable, map, observableSourceDistinctUntilChanged, new y281(this, (byte) 22));
        }
    }

    public fip0(String str, String str2, String str3, yzc0 yzc0Var, Flowable flowable, dg4 dg4Var, g7h g7hVar) {
        this.a = (byte) 1;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = yzc0Var;
        this.f = flowable;
        this.g = dg4Var;
        this.h = g7hVar;
    }
}
