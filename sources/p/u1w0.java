package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u1w0 extends h2w0 {
    public final String a;
    public final boolean b;

    public u1w0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1w0)) {
            return false;
        }
        u1w0 u1w0Var = (u1w0) obj;
        return u890.j(this.a, u1w0Var.a) && this.b == u1w0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
