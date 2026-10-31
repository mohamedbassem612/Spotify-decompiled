package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lz implements n10 {
    public final int a;

    public lz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lz) && this.a == ((lz) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
