package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m0w0 extends cxm {
    public final String d;
    public final boolean e;

    public m0w0(String str, boolean z) {
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0w0)) {
            return false;
        }
        m0w0 m0w0Var = (m0w0) obj;
        return u890.j(this.d, m0w0Var.d) && this.e == m0w0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}
