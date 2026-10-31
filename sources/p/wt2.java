package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wt2 {
    public final boolean a;

    public wt2(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt2) && this.a == ((wt2) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + (l1d.C(2) * 31);
    }
}
