package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wuw implements vuw {
    public final List a;

    public wuw(List list) {
        this.a = list;
    }

    public final Observable c() {
        List list = this.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((vuw) it.next()).c().startWithItem(j5.a));
        }
        return Observable.combineLatest(o7h.l1(arrayList), new nhc(this, (byte) 8)).distinctUntilChanged();
    }
}
