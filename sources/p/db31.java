package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class db31 implements jb31 {
    public final List a;
    public final ega1 b;
    public final boolean c;
    public final km90 d;

    public db31(List list, ega1 ega1Var, boolean z, km90 km90Var) {
        this.a = list;
        this.b = ega1Var;
        this.c = z;
        this.d = km90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db31)) {
            return false;
        }
        db31 db31Var = (db31) obj;
        return this.a.equals(db31Var.a) && u890.j(this.b, db31Var.b) && this.c == db31Var.c && u890.j(this.d, db31Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
