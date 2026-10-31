package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f8a1 {
    public final String a;
    public final boolean b;

    public f8a1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8a1)) {
            return false;
        }
        f8a1 f8a1Var = (f8a1) obj;
        return u890.j(this.a, f8a1Var.a) && this.b == f8a1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
