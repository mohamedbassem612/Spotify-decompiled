package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pte1 implements qte1 {
    public final hux a;

    public pte1(hux huxVar) {
        this.a = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pte1) && u890.j(this.a, ((pte1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
