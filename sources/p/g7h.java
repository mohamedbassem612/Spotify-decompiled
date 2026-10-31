package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g7h {
    public final u9c a;

    public g7h(u9c u9cVar) {
        this.a = u9cVar;
    }

    public static Single b(g7h g7hVar, String str, String[] strArr) {
        g7hVar.getClass();
        return g7hVar.a(str, f46.Q0(strArr), false);
    }

    public static Observable d(g7h g7hVar, String str, String[] strArr) {
        g7hVar.getClass();
        return g7hVar.c(str, f46.Q0(strArr), false);
    }

    public final Single a(String str, List list, boolean z) {
        u9c u9cVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            u9cVar = this.a;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            Set set = (Set) u9cVar.f;
            Set set2 = s4b1.f;
            if (set.contains(uic.x((String) next).c)) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        d7h d7hVar = new d7h(str, arrayList, z);
        d7h d7hVar2 = new d7h(str, arrayList2, z);
        if (arrayList.isEmpty()) {
            return u9cVar.g(d7hVar2);
        }
        if (arrayList2.isEmpty()) {
            return u9cVar.j(d7hVar);
        }
        Single singleZip = Single.zip(u9cVar.j(d7hVar), u9cVar.g(d7hVar2), vf61.t);
        singleZip.getClass();
        return singleZip;
    }

    public final Observable c(String str, List list, boolean z) {
        u9c u9cVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            u9cVar = this.a;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            Set set = (Set) u9cVar.f;
            Set set2 = s4b1.f;
            if (set.contains(uic.x((String) next).c)) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        d7h d7hVar = new d7h(str, arrayList, z);
        d7h d7hVar2 = new d7h(str, arrayList2, z);
        if (arrayList.isEmpty()) {
            return u9cVar.q(d7hVar2);
        }
        if (arrayList2.isEmpty()) {
            return u9cVar.k(d7hVar);
        }
        Observable observableCombineLatest = Observable.combineLatest(u9cVar.k(d7hVar), u9cVar.q(d7hVar2), s9w.R0);
        observableCombineLatest.getClass();
        return observableCombineLatest;
    }
}
