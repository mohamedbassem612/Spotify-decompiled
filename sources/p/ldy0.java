package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ldy0 {
    public final int a;

    public ldy0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ldy0) && this.a == ((ldy0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
