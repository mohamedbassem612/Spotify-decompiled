package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ve9 {
    public final String a;
    public final ue9 b;
    public final fi9 c;
    public final Set d;

    public ve9(String str, ue9 ue9Var, fi9 fi9Var, Set set) {
        this.a = str;
        this.b = ue9Var;
        this.c = fi9Var;
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve9)) {
            return false;
        }
        ve9 ve9Var = (ve9) obj;
        return u890.j(this.a, ve9Var.a) && this.b.equals(ve9Var.b) && this.c == ve9Var.c && u890.j(this.d, ve9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
