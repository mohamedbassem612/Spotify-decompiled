package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h8r0 {
    public final String a;
    public final String b;

    public h8r0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8r0)) {
            return false;
        }
        h8r0 h8r0Var = (h8r0) obj;
        return u890.j(this.a, h8r0Var.a) && this.b.equals(h8r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
