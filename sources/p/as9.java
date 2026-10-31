package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class as9 {
    public final int a;

    public as9(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as9) && this.a == ((as9) obj).a;
    }

    public final int hashCode() {
        return y2k1.d.hashCode() + (l1d.C(this.a) * 31);
    }
}
