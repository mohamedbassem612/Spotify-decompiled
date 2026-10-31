package p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gys {
    public final String a;
    public final bv40 b;

    public gys(Set set, bv40 bv40Var) {
        this.a = b(set);
        this.b = bv40Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            h19 h19Var = (h19) it.next();
            sb.append(h19Var.a);
            sb.append('/');
            sb.append(h19Var.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        bv40 bv40Var = this.b;
        boolean zIsEmpty = bv40Var.m().isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + b(bv40Var.m());
    }
}
