package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a6g implements c6g {
    public final van a;

    public a6g(van vanVar) {
        this.a = vanVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6g) && u890.j(this.a, ((a6g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
