package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sud1 {
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final int e;

    public sud1(int i, String str, String str2, String str3, List list) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    public static sud1 a(sud1 sud1Var, ArrayList arrayList) {
        return new sud1(sud1Var.e, sud1Var.a, sud1Var.c, sud1Var.d, arrayList);
    }

    public final boolean b() {
        List list = this.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = ((dvd1) it.next()).e;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((ct10) it2.next()).d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sud1)) {
            return false;
        }
        sud1 sud1Var = (sud1) obj;
        return u890.j(this.a, sud1Var.a) && this.b.equals(sud1Var.b) && u890.j(this.c, sud1Var.c) && u890.j(this.d, sud1Var.d) && this.e == sud1Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iB = f4i1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Integer.hashCode(this.e) + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
