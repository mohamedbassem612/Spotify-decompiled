package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kix implements mix {
    public final oix a;

    public kix(oix oixVar) {
        this.a = oixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kix) && this.a.equals(((kix) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
