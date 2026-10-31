package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g800 implements k800 {
    public final String a;
    public final tv80 b;

    public g800(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g800)) {
            return false;
        }
        g800 g800Var = (g800) obj;
        return u890.j(this.a, g800Var.a) && u890.j(this.b, g800Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
