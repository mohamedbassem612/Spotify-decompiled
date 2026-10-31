package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f4g1 {
    public final String a;
    public final r4g1 b;

    public f4g1(String str, r4g1 r4g1Var) {
        this.a = str;
        this.b = r4g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4g1)) {
            return false;
        }
        f4g1 f4g1Var = (f4g1) obj;
        return this.a.equals(f4g1Var.a) && u890.j(this.b, f4g1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
