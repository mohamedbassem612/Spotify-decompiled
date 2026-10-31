package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j2k implements hzq0 {
    public final List a;
    public final String b;

    public j2k(List list, String str) {
        this.a = list;
        this.b = str;
        list.size();
        o7h.p1(list).size();
    }

    public final boolean a(kf30 kf30Var) {
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!men1.y((fzq0) it.next(), kf30Var)) {
                return false;
            }
        }
        return true;
    }

    public final void b(kf30 kf30Var, ArrayList arrayList) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            men1.p((fzq0) it.next(), kf30Var, arrayList);
        }
    }

    public final List c(kf30 kf30Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            men1.p((fzq0) it.next(), kf30Var, arrayList);
        }
        return o7h.l1(arrayList);
    }

    public final Collection i(kf30 kf30Var, iu30 iu30Var) {
        HashSet hashSet = new HashSet();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((fzq0) it.next()).i(kf30Var, iu30Var));
        }
        return hashSet;
    }

    public final String toString() {
        return this.b;
    }
}
