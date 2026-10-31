package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pl0 implements rl0 {
    public final String a;
    public final boolean b;

    public pl0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl0)) {
            return false;
        }
        pl0 pl0Var = (pl0) obj;
        return u890.j(this.a, pl0Var.a) && this.b == pl0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
