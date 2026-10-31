package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uca1 implements xca1 {
    public final String a;
    public final ArrayList b;
    public final UUID c;
    public final String d;
    public final ArrayList e;
    public final ArrayList f;

    public uca1(String str, ArrayList arrayList, UUID uuid, String str2) {
        this.a = str;
        this.b = arrayList;
        this.c = uuid;
        this.d = str2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ica1) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ica1) it.next()).a);
        }
        this.e = arrayList3;
        ArrayList arrayList4 = this.b;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (obj2 instanceof jca1) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(((jca1) it2.next()).a);
        }
        this.f = arrayList6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uca1)) {
            return false;
        }
        uca1 uca1Var = (uca1) obj;
        return u890.j(this.a, uca1Var.a) && this.b.equals(uca1Var.b) && u890.j(this.c, uca1Var.c) && u890.j(this.d, uca1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
