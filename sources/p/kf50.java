package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kf50 {
    public final String a;
    public final boolean b;

    public kf50(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf50)) {
            return false;
        }
        kf50 kf50Var = (kf50) obj;
        return this.a.equals(kf50Var.a) && this.b == kf50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
