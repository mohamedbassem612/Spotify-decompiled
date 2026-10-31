package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a7o {
    public final String a;
    public final String b;
    public final List c;
    public final List d;

    public a7o(String str, String str2, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7o)) {
            return false;
        }
        a7o a7oVar = (a7o) obj;
        return this.a.equals(a7oVar.a) && this.b.equals(a7oVar.b) && this.c.equals(a7oVar.c) && this.d.equals(a7oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
