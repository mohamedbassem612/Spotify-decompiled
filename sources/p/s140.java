package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s140 {
    public final r140 a;
    public final q140 b;
    public final boolean c;
    public final boolean d;

    public s140(r140 r140Var, q140 q140Var, boolean z, boolean z2) {
        this.a = r140Var;
        this.b = q140Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s140)) {
            return false;
        }
        s140 s140Var = (s140) obj;
        return this.a.equals(s140Var.a) && this.b.equals(s140Var.b) && this.c == s140Var.c && this.d == s140Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
