package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j2y implements n2y {
    public final rpu a;

    public j2y(rpu rpuVar) {
        this.a = rpuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2y) && this.a == ((j2y) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
