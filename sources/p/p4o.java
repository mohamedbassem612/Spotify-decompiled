package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class p4o {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;

    public p4o(String str, String str2, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4o)) {
            return false;
        }
        p4o p4oVar = (p4o) obj;
        return u890.j(this.a, p4oVar.a) && u890.j(this.b, p4oVar.b) && this.c.equals(p4oVar.c) && this.d == p4oVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
