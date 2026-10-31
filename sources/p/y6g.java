package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y6g implements q7g {
    public final int a;

    public y6g(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6g) && this.a == ((y6g) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
