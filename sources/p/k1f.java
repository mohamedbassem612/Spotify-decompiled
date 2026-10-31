package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k1f implements q3f {
    public final String a;
    public final String b;
    public final List c;

    public k1f(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1f)) {
            return false;
        }
        k1f k1fVar = (k1f) obj;
        return u890.j(this.a, k1fVar.a) && u890.j(this.b, k1fVar.b) && u890.j(this.c, k1fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
