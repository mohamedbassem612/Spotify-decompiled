package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s81 extends u4p1 {
    public final String c;
    public final boolean d;

    public s81(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s81)) {
            return false;
        }
        s81 s81Var = (s81) obj;
        return u890.j(this.c, s81Var.c) && this.d == s81Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
