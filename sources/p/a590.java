package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a590 extends b590 {
    public final nmy a;

    public a590(nmy nmyVar) {
        this.a = nmyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a590) && this.a.equals(((a590) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
