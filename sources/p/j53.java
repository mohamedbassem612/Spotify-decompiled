package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j53 {
    public final String a;
    public final String b;
    public final List c;

    public j53(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j53)) {
            return false;
        }
        j53 j53Var = (j53) obj;
        return this.a.equals(j53Var.a) && u890.j(this.b, j53Var.b) && this.c.equals(j53Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
