package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wg20 {
    public final cqo a;

    public wg20(cqo cqoVar) {
        this.a = cqoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wg20) && this.a.equals(((wg20) obj).a);
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
