package p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xpj1 {
    public final Set a;
    public final String b;

    public xpj1(String str, Set set) {
        this.a = set;
        this.b = str;
    }

    public final l090 a() {
        Object obj;
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iIndexOf = l090.a.indexOf(rc11.a.b(((l090) next).getClass()));
                do {
                    Object next2 = it.next();
                    int iIndexOf2 = l090.a.indexOf(rc11.a.b(((l090) next2).getClass()));
                    if (iIndexOf > iIndexOf2) {
                        next = next2;
                        iIndexOf = iIndexOf2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (l090) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpj1)) {
            return false;
        }
        xpj1 xpj1Var = (xpj1) obj;
        return this.a.equals(xpj1Var.a) && u890.j(this.b, xpj1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
