package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d1w0 {
    public final kh51 a;
    public final ljd0 b;

    public d1w0(kh51 kh51Var, ljd0 ljd0Var) {
        this.a = kh51Var;
        this.b = ljd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1w0)) {
            return false;
        }
        d1w0 d1w0Var = (d1w0) obj;
        return this.a.equals(d1w0Var.a) && u890.j(this.b, d1w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
