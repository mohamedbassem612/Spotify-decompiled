package p;

import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class sdj0 {
    public static final hzi0 a(String str, Set set) {
        Object next;
        Set set2 = set;
        ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add((hzi0) it.next());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (((hzi0) next).getId().equals(str)) {
                return (hzi0) next;
            }
        }
        next = null;
        return (hzi0) next;
    }

    public static final Single b(Set set, kcs kcsVar, bq21 bq21Var) {
        String str;
        dio1 dio1Var = bq21Var.b;
        if (dio1Var instanceof jjo0) {
            str = "TOOLTIP_HANDLER_ID";
        } else {
            if (!(dio1Var instanceof gjo0)) {
                eg.o();
                return null;
            }
            str = "SLATE_HANDLER_ID";
        }
        hzi0 hzi0VarA = a(str, set);
        if (hzi0VarA != null) {
            return hzi0VarA.b(dio1Var, bq21Var.a).doOnSuccess(new rdj0(kcsVar, bq21Var, (byte) 0)).doOnError(new rdj0(kcsVar, bq21Var, (byte) 1));
        }
        return null;
    }
}
