package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lbm implements nbm {
    public final boolean a;

    public lbm(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lbm) && this.a == ((lbm) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
