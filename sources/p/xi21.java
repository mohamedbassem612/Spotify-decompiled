package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xi21 {
    public final String a;
    public final boolean b;

    public xi21(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi21)) {
            return false;
        }
        xi21 xi21Var = (xi21) obj;
        return u890.j(this.a, xi21Var.a) && this.b == xi21Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
