package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d5p0 {
    public final String a;
    public final ynb0 b;
    public final boolean c;

    public d5p0(String str, ynb0 ynb0Var, boolean z) {
        this.a = str;
        this.b = ynb0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5p0)) {
            return false;
        }
        d5p0 d5p0Var = (d5p0) obj;
        return u890.j(this.a, d5p0Var.a) && u890.j(this.b, d5p0Var.b) && this.c == d5p0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ynb0 ynb0Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (ynb0Var == null ? 0 : ynb0Var.hashCode())) * 31);
    }
}
