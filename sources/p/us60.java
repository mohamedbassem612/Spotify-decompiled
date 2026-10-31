package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class us60 extends zso1 {
    public final int b;

    public us60(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us60) && this.b == ((us60) obj).b;
    }

    public final int hashCode() {
        return l1d.C(this.b);
    }
}
