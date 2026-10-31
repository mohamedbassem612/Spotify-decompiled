package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class boi0 implements doi0 {
    public final String a;
    public final l921 b;

    public boi0(String str, l921 l921Var) {
        this.a = str;
        this.b = l921Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boi0)) {
            return false;
        }
        boi0 boi0Var = (boi0) obj;
        return u890.j(this.a, boi0Var.a) && u890.j(this.b, boi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
