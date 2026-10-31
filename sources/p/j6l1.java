package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j6l1 {
    public final String a;
    public final String b;
    public final List c;
    public final hvl1 d;

    public j6l1(String str, String str2, List list, hvl1 hvl1Var) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = hvl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6l1)) {
            return false;
        }
        j6l1 j6l1Var = (j6l1) obj;
        return u890.j(this.a, j6l1Var.a) && u890.j(this.b, j6l1Var.b) && u890.j(this.c, j6l1Var.c) && this.d.equals(j6l1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
