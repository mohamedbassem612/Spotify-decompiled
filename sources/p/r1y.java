package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r1y implements t1y {
    public final rpu a;

    public r1y(rpu rpuVar) {
        this.a = rpuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1y) && this.a == ((r1y) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
