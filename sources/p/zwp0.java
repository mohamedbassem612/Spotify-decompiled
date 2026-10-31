package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zwp0 implements f6c0, Comparator {
    public final Single a(List list, List list2, List list3, boolean z) {
        if (z) {
            Single singleJust = Single.just(o7h.a1(list, this));
            singleJust.getClass();
            return singleJust;
        }
        Single singleJust2 = Single.just(list);
        singleJust2.getClass();
        return singleJust2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        d6c0 d6c0Var = (d6c0) obj;
        d6c0 d6c0Var2 = (d6c0) obj2;
        if (d6c0Var instanceof b5c0) {
            return -1;
        }
        if (!(d6c0Var2 instanceof b5c0)) {
            List listA = d6c0Var.a();
            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((d6c0) it.next()) instanceof q5c0) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            List listA2 = d6c0Var2.a();
            if (!(listA2 instanceof Collection) || !listA2.isEmpty()) {
                Iterator it2 = listA2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (((d6c0) it2.next()) instanceof q5c0) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            if (z == z2) {
                return 0;
            }
            if (z) {
                return -1;
            }
        }
        return 1;
    }
}
