package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class edu implements idu {
    public final re9 a;
    public final long b;

    public edu(re9 re9Var, long j) {
        this.a = re9Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edu)) {
            return false;
        }
        edu eduVar = (edu) obj;
        return this.a.equals(eduVar.a) && this.b == eduVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
