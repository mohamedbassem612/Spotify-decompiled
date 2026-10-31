package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tr31 {
    public final jmt a;
    public final blc0 b;
    public final boolean c;

    public tr31(jmt jmtVar, blc0 blc0Var, boolean z) {
        this.a = jmtVar;
        this.b = blc0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr31)) {
            return false;
        }
        tr31 tr31Var = (tr31) obj;
        return u890.j(this.a, tr31Var.a) && this.b == tr31Var.b && this.c == tr31Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
