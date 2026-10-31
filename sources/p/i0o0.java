package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i0o0 implements j0o0 {
    public final boolean a;
    public final boolean b;

    public i0o0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0o0)) {
            return false;
        }
        i0o0 i0o0Var = (i0o0) obj;
        return this.a == i0o0Var.a && this.b == i0o0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
