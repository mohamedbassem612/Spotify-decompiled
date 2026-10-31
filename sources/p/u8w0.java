package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u8w0 {
    public final String a;
    public final boolean b;

    public u8w0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8w0)) {
            return false;
        }
        u8w0 u8w0Var = (u8w0) obj;
        return u890.j(this.a, u8w0Var.a) && this.b == u8w0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
