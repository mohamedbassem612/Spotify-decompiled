package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ui90 extends mp10 {
    public final boolean f;
    public final boolean g;

    public ui90(boolean z, boolean z2) {
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui90)) {
            return false;
        }
        ui90 ui90Var = (ui90) obj;
        return this.f == ui90Var.f && this.g == ui90Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + (Boolean.hashCode(this.f) * 31);
    }
}
