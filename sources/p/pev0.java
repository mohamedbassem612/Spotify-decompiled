package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pev0 implements uev0 {
    public final yyq a;

    public pev0(yyq yyqVar) {
        this.a = yyqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pev0) && u890.j(this.a, ((pev0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
