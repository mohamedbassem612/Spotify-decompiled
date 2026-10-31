package p;

import com.spotify.home.evopage.structureapi.DismissedEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class chm0 {
    public final List a;
    public final Set b;
    public final Set c;
    public final ioj0 d;
    public final List e;
    public final String f;

    public chm0(List list, Set set, Set set2, ioj0 ioj0Var, List list2, String str) {
        this.a = list;
        this.b = set;
        this.c = set2;
        this.d = ioj0Var;
        this.e = list2;
        this.f = str;
    }

    public static chm0 a(chm0 chm0Var, ArrayList arrayList, Set set, Set set2, List list, String str, int i) {
        List list2 = arrayList;
        if ((i & 1) != 0) {
            list2 = chm0Var.a;
        }
        List list3 = list2;
        if ((i & 2) != 0) {
            set = chm0Var.b;
        }
        Set set3 = set;
        if ((i & 4) != 0) {
            set2 = chm0Var.c;
        }
        Set set4 = set2;
        ioj0 ioj0Var = chm0Var.d;
        if ((i & 16) != 0) {
            list = chm0Var.e;
        }
        List list4 = list;
        if ((i & 32) != 0) {
            str = chm0Var.f;
        }
        chm0Var.getClass();
        return new chm0(list3, set3, set4, ioj0Var, list4, str);
    }

    public final ArrayList b() {
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            jn60 jn60Var = (jn60) obj;
            if (!(jn60Var instanceof be81)) {
                Set set = this.b;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!u890.j(((DismissedEntity) it.next()).getId(), jn60Var.getId()));
                }
                arrayList.add(obj);
                break;
                break;
            }
            Set set2 = this.c;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!u890.j(((DismissedEntity) it2.next()).getId(), ((be81) jn60Var).a));
            }
            arrayList.add(obj);
            break;
        }
        List list2 = this.e;
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((osp0) it3.next()).a());
        }
        return pap1.q(arrayList, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chm0)) {
            return false;
        }
        chm0 chm0Var = (chm0) obj;
        return u890.j(this.a, chm0Var.a) && u890.j(this.b, chm0Var.b) && u890.j(this.c, chm0Var.c) && u890.j(this.d, chm0Var.d) && this.e.equals(chm0Var.e) && u890.j(this.f, chm0Var.f);
    }

    public final int hashCode() {
        int iC = gvg.c(gvg.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ioj0 ioj0Var = this.d;
        return this.f.hashCode() + f4i1.b((iC + (ioj0Var == null ? 0 : ioj0Var.a.hashCode())) * 31, 31, this.e);
    }
}
