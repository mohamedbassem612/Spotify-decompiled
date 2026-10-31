package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n291 {
    public final o95 a;
    public long b;

    public n291(o95 o95Var, long j) {
        this.a = o95Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n291) {
            n291 n291Var = (n291) obj;
            if (this.a == n291Var.a && yr80.b(this.b, n291Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + yr80.c(this.b) + ")";
    }
}
