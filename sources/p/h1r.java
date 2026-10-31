package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h1r implements k1r {
    public final yyq a;

    public h1r(yyq yyqVar) {
        this.a = yyqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1r) && u890.j(this.a, ((h1r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
