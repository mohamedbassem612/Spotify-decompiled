package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k7v0 extends h7p1 {
    public final String c;
    public final String d;

    public k7v0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7v0)) {
            return false;
        }
        k7v0 k7v0Var = (k7v0) obj;
        return u890.j(this.c, k7v0Var.c) && u890.j(this.d, k7v0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
