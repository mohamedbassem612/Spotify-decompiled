package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r81 extends u4p1 {
    public final String c;
    public final boolean d;

    public r81(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r81)) {
            return false;
        }
        r81 r81Var = (r81) obj;
        return u890.j(this.c, r81Var.c) && this.d == r81Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
