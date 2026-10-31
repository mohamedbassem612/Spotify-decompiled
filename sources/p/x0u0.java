package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x0u0 {
    public final String a;
    public final boolean b;

    public x0u0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0u0)) {
            return false;
        }
        x0u0 x0u0Var = (x0u0) obj;
        return this.a.equals(x0u0Var.a) && this.b == x0u0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
