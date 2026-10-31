package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f88 {
    public final ph1 a;
    public final String b;

    public f88(ph1 ph1Var, String str) {
        this.a = ph1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f88)) {
            return false;
        }
        f88 f88Var = (f88) obj;
        return this.a == f88Var.a && this.b.equals(f88Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
