package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aev0 {
    public final List a;
    public final String b;

    public /* synthetic */ aev0(String str, int i) {
        this((List) z6x.a, (i & 2) != 0 ? null : str);
    }

    public static aev0 a(aev0 aev0Var, List list, String str, int i) {
        if ((i & 1) != 0) {
            list = aev0Var.a;
        }
        if ((i & 2) != 0) {
            str = aev0Var.b;
        }
        aev0Var.getClass();
        return new aev0(list, str);
    }

    public final ArrayList b() {
        List list = this.a;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((uod1) obj).a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Integer num = ((uod1) obj2).d;
            if (num == null || num.intValue() != 0) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public final uod1 c() {
        Object next;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (u890.j(((uod1) next).a, this.b)) {
                return (uod1) next;
            }
        }
        next = null;
        return (uod1) next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aev0)) {
            return false;
        }
        aev0 aev0Var = (aev0) obj;
        return u890.j(this.a, aev0Var.a) && u890.j(this.b, aev0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public aev0(List list, String str) {
        this.a = list;
        this.b = str;
    }
}
