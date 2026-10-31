package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a1e1 {
    public final String a;
    public final List b;
    public final Long c;

    public a1e1(String str, List list, Long l) {
        this.a = str;
        this.b = list;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1e1)) {
            return false;
        }
        a1e1 a1e1Var = (a1e1) obj;
        return this.a.equals(a1e1Var.a) && this.b.equals(a1e1Var.b) && u890.j(this.c, a1e1Var.c);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return iB + (l == null ? 0 : l.hashCode());
    }
}
