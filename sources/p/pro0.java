package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pro0 {
    public final String a;
    public final hpo0 b;
    public final boolean c;
    public final boolean d;

    public pro0(String str, hpo0 hpo0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = hpo0Var;
        this.c = z;
        this.d = z2;
    }

    public static pro0 a(pro0 pro0Var, boolean z, boolean z2, int i) {
        String str = pro0Var.a;
        hpo0 hpo0Var = pro0Var.b;
        if ((i & 4) != 0) {
            z = pro0Var.c;
        }
        if ((i & 8) != 0) {
            z2 = pro0Var.d;
        }
        return new pro0(str, hpo0Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pro0)) {
            return false;
        }
        pro0 pro0Var = (pro0) obj;
        return u890.j(this.a, pro0Var.a) && u890.j(this.b, pro0Var.b) && this.c == pro0Var.c && this.d == pro0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
