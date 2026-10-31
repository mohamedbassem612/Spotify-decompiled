package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gz51 {
    public static final gz51 c = new gz51(w7x.a, false);
    public final boolean a;
    public final Set b;

    public gz51(Set set, boolean z) {
        this.a = z;
        this.b = set;
    }

    public static gz51 a(gz51 gz51Var, Set set, int i) {
        boolean z = (i & 1) != 0 ? gz51Var.a : true;
        if ((i & 2) != 0) {
            set = gz51Var.b;
        }
        gz51Var.getClass();
        return new gz51(set, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz51)) {
            return false;
        }
        gz51 gz51Var = (gz51) obj;
        return this.a == gz51Var.a && u890.j(this.b, gz51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
