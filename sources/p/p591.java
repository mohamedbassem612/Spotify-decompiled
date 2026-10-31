package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p591 implements q591 {
    public final hux a;

    public p591(hux huxVar) {
        this.a = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p591) && this.a.equals(((p591) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
