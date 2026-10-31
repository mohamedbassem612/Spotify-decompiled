package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p.dm61;
import p.dn90;
import p.esi1;
import p.o7h;
import p.ood;
import p.pod;
import p.q7h;
import p.sri1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s implements p {
    public static final s a = new s();

    @Override // defpackage.p
    public final dn90 a(sri1 sri1Var) {
        Collection collection = sri1Var.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((pod) obj).d) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((pod) it.next()).a);
        }
        Set setP1 = o7h.p1(arrayList2);
        ArrayList arrayList3 = new ArrayList(q7h.U(collection, 10));
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((pod) it2.next()).a);
        }
        Set setP2 = o7h.p1(arrayList3);
        Collection collection2 = sri1Var.c;
        ArrayList arrayList4 = new ArrayList(q7h.U(collection2, 10));
        Iterator it3 = collection2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((ood) it3.next()).a);
        }
        Set setP3 = o7h.p1(arrayList4);
        Set setV0 = dm61.v0(setP1, setP3);
        Set setV1 = dm61.v0(setP3, setP2);
        if (setV0.isEmpty() && setV1.isEmpty()) {
            return null;
        }
        return new esi1(setV1, setV0);
    }
}
