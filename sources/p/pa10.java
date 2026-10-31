package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pa10 {
    public final eww0 a;
    public final oa10 b;
    public final boolean c;
    public final boolean d;

    public pa10(eww0 eww0Var, oa10 oa10Var, boolean z, boolean z2) {
        this.a = eww0Var;
        this.b = oa10Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa10)) {
            return false;
        }
        pa10 pa10Var = (pa10) obj;
        return u890.j(this.a, pa10Var.a) && u890.j(this.b, pa10Var.b) && this.c == pa10Var.c && this.d == pa10Var.d;
    }

    public final int hashCode() {
        eww0 eww0Var = this.a;
        int iHashCode = (eww0Var == null ? 0 : eww0Var.hashCode()) * 31;
        oa10 oa10Var = this.b;
        return Boolean.hashCode(this.d) + xcg1.g((iHashCode + (oa10Var != null ? oa10Var.hashCode() : 0)) * 31, 31, this.c);
    }
}
