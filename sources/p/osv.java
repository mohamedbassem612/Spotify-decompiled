package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class osv implements usv {
    public final arv a;

    public osv(arv arvVar) {
        this.a = arvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof osv) && this.a.equals(((osv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
