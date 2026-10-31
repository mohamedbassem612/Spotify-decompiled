package p;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t6h1 {
    public static final t6h1 f = new t6h1("", 0, "", new HashMap(), z6x.a);
    public final String a;
    public final byte b;
    public final String c;
    public final Map d;
    public final List e;

    /* JADX WARN: Multi-variable type inference failed */
    public t6h1(String str, int i, String str2, HashMap map, List list) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = map;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !t6h1.class.equals(obj.getClass())) {
            return false;
        }
        t6h1 t6h1Var = (t6h1) obj;
        if (this.b == t6h1Var.b && u890.j(this.a, t6h1Var.a) && u890.j(this.c, t6h1Var.c)) {
            return u890.j(this.d, t6h1Var.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(((this.a.hashCode() * 31) + this.b) * 31, 31, this.c);
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append('/');
        sb.append(this.a);
        sb.append('(');
        sb.append((int) this.b);
        sb.append('=');
        Map map = this.d;
        if (map.isEmpty()) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder("(");
            boolean z = true;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!z) {
                    sb2.append(",");
                }
                sb2.append(str + '=' + str2);
                if (z) {
                    z = false;
                }
            }
            sb2.append(")");
            string = sb2.toString();
        }
        return gvg.k(sb, string, ')');
    }
}
