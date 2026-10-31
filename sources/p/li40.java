package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class li40 {
    public final boolean a;
    public final boolean b;

    public li40(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final int a(t351 t351Var) {
        r351 r351Var;
        if (this.b) {
            if (((t351Var == null || (r351Var = t351Var.e) == null) ? 0 : r351Var.b) == 2) {
                return 4;
            }
            if (t351Var != null && t351Var.d) {
                return 3;
            }
            if ((t351Var != null ? t351Var.c : 0) != 2) {
                return 2;
            }
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li40)) {
            return false;
        }
        li40 li40Var = (li40) obj;
        return this.a == li40Var.a && this.b == li40Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
