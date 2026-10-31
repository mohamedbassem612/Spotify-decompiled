package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b1w0 {
    public final kh51 a;
    public final szu0 b;

    public b1w0(kh51 kh51Var, szu0 szu0Var) {
        this.a = kh51Var;
        this.b = szu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1w0)) {
            return false;
        }
        b1w0 b1w0Var = (b1w0) obj;
        return this.a.equals(b1w0Var.a) && this.b.equals(b1w0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
