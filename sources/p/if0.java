package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class if0 {
    public final List a;
    public final hcx b;
    public final r6h1 c;

    public if0(List list, hcx hcxVar, r6h1 r6h1Var) {
        this.a = list;
        this.b = hcxVar;
        this.c = r6h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if0)) {
            return false;
        }
        if0 if0Var = (if0) obj;
        return u890.j(this.a, if0Var.a) && this.b == if0Var.b && u890.j(this.c, if0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
