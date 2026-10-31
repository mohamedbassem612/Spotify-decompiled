package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i3t0 {
    public final boolean a;
    public final boolean b;

    public i3t0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3t0)) {
            return false;
        }
        i3t0 i3t0Var = (i3t0) obj;
        return this.a == i3t0Var.a && this.b == i3t0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
