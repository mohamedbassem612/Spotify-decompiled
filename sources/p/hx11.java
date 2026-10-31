package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hx11 implements ix11 {
    public final yyq a;

    public hx11(yyq yyqVar) {
        this.a = yyqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx11) && u890.j(this.a, ((hx11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
