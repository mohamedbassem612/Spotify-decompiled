package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z3f0 {
    public final String a;
    public final String b;

    public z3f0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3f0)) {
            return false;
        }
        z3f0 z3f0Var = (z3f0) obj;
        return u890.j(this.a, z3f0Var.a) && this.b.equals(z3f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
