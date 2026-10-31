package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class zhn0 implements Update {
    public final Next a(Object obj, Object obj2) {
        Object next;
        Object next2;
        bin0 bin0Var = (bin0) obj;
        rhn0 rhn0Var = (rhn0) obj2;
        List list = bin0Var.a;
        Set set = bin0Var.c;
        if (rhn0Var instanceof ohn0) {
            shn0 shn0Var = bin0Var.d;
            shn0 shn0Var2 = ((ohn0) rhn0Var).a;
            return shn0Var == shn0Var2 ? Next.j() : Next.h(bin0.a(bin0Var, null, null, shn0Var2, 7));
        }
        if (rhn0Var instanceof nhn0) {
            String str = ((nhn0) rhn0Var).a;
            if (!set.contains(str)) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (u890.j(((gin0) it.next()).a, str)) {
                            return Next.i(bin0.a(bin0Var, null, dm61.x0(str, set), null, 11), Collections.singleton(new ehn0(str)));
                        }
                    }
                }
            }
            return Next.j();
        }
        if (!(rhn0Var instanceof qhn0)) {
            if (!(rhn0Var instanceof phn0)) {
                eg.o();
                return null;
            }
            String str2 = ((phn0) rhn0Var).a;
            if (!set.contains(str2)) {
                return Next.j();
            }
            bin0 bin0VarA = bin0.a(bin0Var, null, dm61.u0(str2, set), null, 11);
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!u890.j(((gin0) next).a, str2));
            gin0 gin0Var = (gin0) next;
            String str3 = gin0Var != null ? gin0Var.b : null;
            return str3 == null ? Next.h(bin0VarA) : Next.i(bin0VarA, Collections.singleton(new fhn0(str3)));
        }
        String str4 = ((qhn0) rhn0Var).a;
        List list3 = list;
        Iterator it3 = list3.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!u890.j(((gin0) next2).a, str4));
        gin0 gin0Var2 = (gin0) next2;
        if (gin0Var2 == null) {
            return Next.j();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list3) {
            if (!u890.j(((gin0) obj3).a, str4)) {
                arrayList.add(obj3);
            }
        }
        return Next.i(bin0.a(bin0Var, arrayList, dm61.u0(str4, set), null, 10), Collections.singleton(new ghn0(gin0Var2.b)));
    }
}
