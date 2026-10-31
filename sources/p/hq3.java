package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hq3 extends hr3 {
    public final boolean a;
    public final boolean b;

    public hq3(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq3)) {
            return false;
        }
        hq3 hq3Var = (hq3) obj;
        return this.a == hq3Var.a && this.b == hq3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
