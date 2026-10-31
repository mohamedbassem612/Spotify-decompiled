package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c7v0 {
    public final boolean a;
    public final int b;

    public c7v0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7v0)) {
            return false;
        }
        c7v0 c7v0Var = (c7v0) obj;
        return this.a == c7v0Var.a && this.b == c7v0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
