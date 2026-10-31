package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yq10 implements er10 {
    public final String a;
    public final cy10 b;
    public final boolean c;

    public yq10(String str, cy10 cy10Var, boolean z) {
        this.a = str;
        this.b = cy10Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq10)) {
            return false;
        }
        yq10 yq10Var = (yq10) obj;
        return u890.j(this.a, yq10Var.a) && this.b == yq10Var.b && this.c == yq10Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        cy10 cy10Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (cy10Var == null ? 0 : cy10Var.hashCode())) * 31);
    }
}
