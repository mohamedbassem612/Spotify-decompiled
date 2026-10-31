package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ciz0 extends eiz0 {
    public final ljz0 a;
    public final String b;
    public final List c;
    public final List d;

    public ciz0(ljz0 ljz0Var, String str, List list, List list2) {
        this.a = ljz0Var;
        this.b = str;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ciz0)) {
            return false;
        }
        ciz0 ciz0Var = (ciz0) obj;
        return u890.j(this.a, ciz0Var.a) && u890.j(this.b, ciz0Var.b) && u890.j(this.c, ciz0Var.c) && u890.j(this.d, ciz0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
