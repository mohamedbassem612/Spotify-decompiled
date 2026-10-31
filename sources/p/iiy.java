package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iiy implements niy {
    public final hiy a;

    public iiy(hiy hiyVar) {
        this.a = hiyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iiy) && this.a.equals(((iiy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
