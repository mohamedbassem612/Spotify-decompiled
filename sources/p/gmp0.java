package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gmp0 {
    public final String a;
    public final boolean b;

    public gmp0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmp0)) {
            return false;
        }
        gmp0 gmp0Var = (gmp0) obj;
        return u890.j(this.a, gmp0Var.a) && this.b == gmp0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
