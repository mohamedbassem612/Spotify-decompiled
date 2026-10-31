package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g2l1 extends j2l1 {
    public final boolean a;

    public g2l1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2l1) && this.a == ((g2l1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
