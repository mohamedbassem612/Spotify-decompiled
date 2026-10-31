package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hb3 {
    public final String a;
    public final String b;
    public final List c;

    public hb3(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb3)) {
            return false;
        }
        hb3 hb3Var = (hb3) obj;
        return u890.j(this.a, hb3Var.a) && this.b.equals(hb3Var.b) && u890.j(this.c, hb3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(((this.a.hashCode() * 31) + 2098153138) * 31, 31, this.b);
    }
}
