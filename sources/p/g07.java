package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g07 {
    public final String a;
    public final pno1 b;

    public g07(String str, pno1 pno1Var) {
        this.a = str;
        this.b = pno1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g07)) {
            return false;
        }
        g07 g07Var = (g07) obj;
        return u890.j(this.a, g07Var.a) && u890.j(this.b, g07Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public /* synthetic */ g07(String str) {
        this(str, a07.d);
    }
}
