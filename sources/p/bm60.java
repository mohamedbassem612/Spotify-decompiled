package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bm60 implements em60 {
    public final yyq a;

    public bm60(yyq yyqVar) {
        this.a = yyqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bm60) && u890.j(this.a, ((bm60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
