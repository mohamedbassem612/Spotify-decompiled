package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q461 extends y1a1 {
    public final String c;
    public final boolean d;

    public q461(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q461)) {
            return false;
        }
        q461 q461Var = (q461) obj;
        return u890.j(this.c, q461Var.c) && this.d == q461Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
