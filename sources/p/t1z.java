package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t1z {
    public final lqr a;
    public final ifl1 b;
    public final o241 c;

    public t1z(lqr lqrVar, ifl1 ifl1Var, o241 o241Var) {
        this.a = lqrVar;
        this.b = ifl1Var;
        this.c = o241Var;
    }

    public final Observable a(s4b1 s4b1Var, List list) {
        Observable observable;
        String strZ = s4b1Var.z();
        if (strZ == null) {
            Logger.d("Missing Uri in EpisodeAssociationsLoader", new Object[0]);
            observable = Observable.error(new IllegalArgumentException("Missing Uri in EpisodeAssociationsLoader"));
        } else {
            u1z u1zVar = (u1z) this.a.b;
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((p1z) it.next()).a);
            }
            observable = u1zVar.a(strZ, arrayList).map(v560.b1).toObservable();
        }
        return Observable.combineLatest(observable, new ObservableFromPublisher(((Flowable) this.b.b).t(qz70.a1).J(b6j0.a1)), this.c.a, fmv.b1).distinctUntilChanged();
    }
}
