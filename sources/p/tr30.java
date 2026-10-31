package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tr30 {
    public final boolean a;
    public final s2p0 b;

    public tr30(boolean z, s2p0 s2p0Var) {
        this.a = z;
        this.b = s2p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr30)) {
            return false;
        }
        tr30 tr30Var = (tr30) obj;
        return this.a == tr30Var.a && this.b == tr30Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
