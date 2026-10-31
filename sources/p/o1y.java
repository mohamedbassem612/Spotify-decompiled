package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o1y implements t1y {
    public final rpu a;

    public o1y(rpu rpuVar) {
        this.a = rpuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1y) && this.a == ((o1y) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
