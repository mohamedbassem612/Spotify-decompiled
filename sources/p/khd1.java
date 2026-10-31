package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class khd1 implements whm0 {
    public final List a;
    public final String b;
    public final String c;
    public final int d;

    public khd1(int i, String str, String str2, List list) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public static khd1 b(khd1 khd1Var, ArrayList arrayList, String str, String str2, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = khd1Var.a;
        }
        if ((i & 2) != 0) {
            str = khd1Var.b;
        }
        if ((i & 4) != 0) {
            str2 = khd1Var.c;
        }
        int i2 = (i & 8) != 0 ? khd1Var.d : 2;
        khd1Var.getClass();
        return new khd1(i2, str, str2, list);
    }

    public final boolean a(whm0 whm0Var) {
        khd1 khd1Var = (khd1) whm0Var;
        return (this.d == khd1Var.d && u890.j(this.b, khd1Var.b) && u890.j(c(), khd1Var.c())) ? false : true;
    }

    public final ygd1 c() {
        Object next;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (u890.j(((ygd1) next).a.e.getUri(), this.b)) {
                return (ygd1) next;
            }
        }
        next = null;
        return (ygd1) next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khd1)) {
            return false;
        }
        khd1 khd1Var = (khd1) obj;
        return u890.j(this.a, khd1Var.a) && u890.j(this.b, khd1Var.b) && u890.j(this.c, khd1Var.c) && this.d == khd1Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return l1d.C(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ khd1() {
        this(4, null, null, z6x.a);
    }
}
