package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kai0 {
    public final boolean a;
    public final boolean b;

    public kai0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kai0)) {
            return false;
        }
        kai0 kai0Var = (kai0) obj;
        return this.a == kai0Var.a && this.b == kai0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(false) * 31, 31, false), 31, true), 31, this.a);
    }
}
