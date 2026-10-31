package p;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l1e implements g4u {
    public final Resources a;

    public boolean test(Object obj, Object obj2) {
        s3g1 s3g1Var = (s3g1) obj;
        s3g1 s3g1Var2 = (s3g1) obj2;
        if (s3g1Var.b == s3g1Var2.b) {
            o131 o131Var = s3g1Var.c;
            boolean z = o131Var.c;
            o131 o131Var2 = s3g1Var2.c;
            if (z == o131Var2.c && o131Var.a == o131Var2.a) {
                List list = s3g1Var.a;
                List list2 = s3g1Var2.a;
                if (list.size() == list2.size()) {
                    List list3 = list;
                    List list4 = list2;
                    Iterator it = list3.iterator();
                    Iterator it2 = list4.iterator();
                    ArrayList arrayList = new ArrayList(Math.min(q7h.U(list3, 10), q7h.U(list4, 10)));
                    while (true) {
                        boolean z2 = false;
                        if (!it.hasNext() || !it2.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        m2g1 m2g1Var = (m2g1) it2.next();
                        m2g1 m2g1Var2 = (m2g1) next;
                        if (m2g1Var2.a.equals(m2g1Var.a)) {
                            t3g1 t3g1Var = m2g1Var2.c;
                            Resources resources = this.a;
                            if (t3g1Var.invoke(resources).equals(m2g1Var.c.invoke(resources)) && m2g1Var2.d.invoke(resources).equals(m2g1Var.d.invoke(resources)) && u890.j(m2g1Var2.e, m2g1Var.e) && m2g1Var2.f == m2g1Var.f && m2g1Var2.i.equals(m2g1Var.i) && m2g1Var2.j == m2g1Var.j && m2g1Var2.k == m2g1Var.k) {
                                z2 = true;
                            }
                        }
                        arrayList.add(Boolean.valueOf(z2));
                    }
                    if (!arrayList.contains(Boolean.FALSE)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
