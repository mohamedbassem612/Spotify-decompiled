package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class td9 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Set d;

    public td9(Set set, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = set;
    }

    public static td9 a(td9 td9Var, boolean z, boolean z2, boolean z3, Set set, int i) {
        if ((i & 1) != 0) {
            z = td9Var.a;
        }
        if ((i & 2) != 0) {
            z2 = td9Var.b;
        }
        if ((i & 4) != 0) {
            z3 = td9Var.c;
        }
        if ((i & 8) != 0) {
            set = td9Var.d;
        }
        return new td9(set, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td9)) {
            return false;
        }
        td9 td9Var = (td9) obj;
        return this.a == td9Var.a && this.b == td9Var.b && this.c == td9Var.c && u890.j(this.d, td9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
