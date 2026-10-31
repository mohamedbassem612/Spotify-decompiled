package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y2r0 {
    public final String a;
    public final List b;
    public final int c;

    public y2r0(String str, List list, int i) {
        this.a = str;
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2r0)) {
            return false;
        }
        y2r0 y2r0Var = (y2r0) obj;
        return u890.j(this.a, y2r0Var.a) && this.b.equals(y2r0Var.b) && this.c == y2r0Var.c;
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        int i = this.c;
        return iB + (i == 0 ? 0 : l1d.C(i));
    }
}
