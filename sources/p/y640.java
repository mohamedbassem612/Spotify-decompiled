package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y640 implements d740 {
    public final a540 a;
    public final boolean b;

    public y640(a540 a540Var, boolean z) {
        this.a = a540Var;
        this.b = z;
    }

    public final a540 a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y640)) {
            return false;
        }
        y640 y640Var = (y640) obj;
        return u890.j(this.a, y640Var.a) && this.b == y640Var.b;
    }

    public final int hashCode() {
        a540 a540Var = this.a;
        return Boolean.hashCode(this.b) + ((a540Var == null ? 0 : a540Var.hashCode()) * 31);
    }
}
