package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aza {
    public final cut a;
    public final jql1 b;

    public aza(cut cutVar, jql1 jql1Var) {
        this.a = cutVar;
        this.b = jql1Var;
    }

    public final cut a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aza)) {
            return false;
        }
        aza azaVar = (aza) obj;
        return u890.j(this.a, azaVar.a) && this.b.equals(azaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
