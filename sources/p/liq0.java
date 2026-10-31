package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class liq0 {
    public final int a;

    public liq0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof liq0) && this.a == ((liq0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
