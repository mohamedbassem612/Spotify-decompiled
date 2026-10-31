package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iv80 extends wm5 {
    public final int e;
    public final boolean f;

    public iv80(int i, boolean z) {
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv80)) {
            return false;
        }
        iv80 iv80Var = (iv80) obj;
        return this.e == iv80Var.e && this.f == iv80Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + (l1d.C(this.e) * 31);
    }
}
