package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zpa1 {
    public final String a;
    public final List b;
    public final List c;

    public zpa1(String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpa1)) {
            return false;
        }
        zpa1 zpa1Var = (zpa1) obj;
        return u890.j(this.a, zpa1Var.a) && u890.j(this.b, zpa1Var.b) && this.c.equals(zpa1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
