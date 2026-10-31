package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p0j0 implements w0j0 {
    public final String a;
    public final String b;

    public p0j0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0j0)) {
            return false;
        }
        p0j0 p0j0Var = (p0j0) obj;
        return u890.j(this.a, p0j0Var.a) && u890.j(this.b, p0j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
