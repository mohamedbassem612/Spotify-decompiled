package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nya {
    public final re9 a;
    public final long b;

    public nya(re9 re9Var, long j) {
        this.a = re9Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nya)) {
            return false;
        }
        nya nyaVar = (nya) obj;
        return u890.j(this.a, nyaVar.a) && this.b == nyaVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
