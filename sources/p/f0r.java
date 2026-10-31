package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f0r implements h0r {
    public final yyq a;

    public f0r(yyq yyqVar) {
        this.a = yyqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0r) && u890.j(this.a, ((f0r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
