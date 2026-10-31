package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f410 {
    public final String a;
    public final String b;
    public final k310 c;
    public final List d;

    public /* synthetic */ f410(int i, String str, String str2, List list) {
        this(str, (i & 2) != 0 ? null : str2, (k310) null, (i & 8) != 0 ? z6x.a : list);
    }

    public final d410 a() {
        Object next;
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((e410) next) instanceof d410));
        if (next instanceof d410) {
            return (d410) next;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f410)) {
            return false;
        }
        f410 f410Var = (f410) obj;
        return u890.j(this.a, f410Var.a) && u890.j(this.b, f410Var.b) && u890.j(this.c, f410Var.c) && u890.j(this.d, f410Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        k310 k310Var = this.c;
        return this.d.hashCode() + ((iHashCode2 + (k310Var != null ? k310Var.hashCode() : 0)) * 31);
    }

    public f410(String str, String str2, k310 k310Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = k310Var;
        this.d = list;
    }
}
