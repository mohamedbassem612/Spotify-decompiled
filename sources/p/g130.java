package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g130 implements i130 {
    public final String a;
    public final String b;

    public g130(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g130)) {
            return false;
        }
        g130 g130Var = (g130) obj;
        return this.a.equals(g130Var.a) && this.b.equals(g130Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
