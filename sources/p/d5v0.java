package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d5v0 {
    public final boolean a;
    public int b = 0;

    public d5v0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5v0)) {
            return false;
        }
        d5v0 d5v0Var = (d5v0) obj;
        return this.a == d5v0Var.a && this.b == d5v0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
