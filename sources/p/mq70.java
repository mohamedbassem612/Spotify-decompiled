package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mq70 {
    public final List a;
    public final pp70 b;
    public final int c;

    public /* synthetic */ mq70(List list, int i) {
        this((i & 1) != 0 ? z6x.a : list, null, 1);
    }

    public final up70 a(vp70 vp70Var) {
        Object obj;
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((up70) obj2).b.compareTo(vp70Var) <= 0) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iOrdinal = ((up70) next).b.ordinal();
                do {
                    Object next2 = it.next();
                    int iOrdinal2 = ((up70) next2).b.ordinal();
                    if (iOrdinal < iOrdinal2) {
                        next = next2;
                        iOrdinal = iOrdinal2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (up70) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq70)) {
            return false;
        }
        mq70 mq70Var = (mq70) obj;
        return u890.j(this.a, mq70Var.a) && u890.j(this.b, mq70Var.b) && this.c == mq70Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        pp70 pp70Var = this.b;
        return l1d.C(this.c) + ((iHashCode + (pp70Var == null ? 0 : pp70Var.hashCode())) * 31);
    }

    public mq70(List list, pp70 pp70Var, int i) {
        this.a = list;
        this.b = pp70Var;
        this.c = i;
    }
}
