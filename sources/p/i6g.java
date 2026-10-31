package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i6g implements p6g {
    public final int a;

    public i6g(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6g) && this.a == ((i6g) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
