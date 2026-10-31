package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wu31 implements bw31 {
    public final bh90 a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public wu31(bh90 bh90Var, boolean z, boolean z2) {
        String str = bh90Var.a;
        this.a = bh90Var;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu31)) {
            return false;
        }
        wu31 wu31Var = (wu31) obj;
        return this.a.equals(wu31Var.a) && this.b.equals(wu31Var.b) && this.c == wu31Var.c && this.d == wu31Var.d;
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
