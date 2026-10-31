package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x720 {
    public final boolean a;
    public final yzo1 b;

    public x720(boolean z, yzo1 yzo1Var) {
        this.a = z;
        this.b = yzo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x720)) {
            return false;
        }
        x720 x720Var = (x720) obj;
        return this.a == x720Var.a && u890.j(this.b, x720Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        yzo1 yzo1Var = this.b;
        return iHashCode + (yzo1Var == null ? 0 : yzo1Var.hashCode());
    }
}
