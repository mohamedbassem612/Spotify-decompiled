package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z491 {
    public final String a;
    public final String b;
    public final List c;

    public z491(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z491)) {
            return false;
        }
        z491 z491Var = (z491) obj;
        return u890.j(this.a, z491Var.a) && u890.j(this.b, z491Var.b) && u890.j(this.c, z491Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
