package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mb60 {
    public final List a;
    public final List b;
    public final cmt c;
    public final String d;
    public final String e;
    public final String f;

    public mb60(List list, List list2, cmt cmtVar, String str, String str2, String str3) {
        this.a = list;
        this.b = list2;
        this.c = cmtVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final ArrayList a() {
        List list = this.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new qb60((rlx0) it.next()));
        }
        List list2 = this.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new pb60((ta60) it2.next()));
        }
        return o7h.N0(arrayList2, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb60)) {
            return false;
        }
        mb60 mb60Var = (mb60) obj;
        return this.a.equals(mb60Var.a) && u890.j(this.b, mb60Var.b) && this.c.equals(mb60Var.c) && u890.j(this.d, mb60Var.d) && u890.j(this.e, mb60Var.e) && this.f.equals(mb60Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }
}
