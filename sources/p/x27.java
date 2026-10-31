package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x27 {
    public final String a;
    public final String b;

    public x27(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x27)) {
            return false;
        }
        x27 x27Var = (x27) obj;
        return u890.j(this.a, x27Var.a) && this.b.equals(x27Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
