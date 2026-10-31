package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gkk0 implements ikk0 {
    public final m7f0 a;
    public final int b;

    public gkk0(m7f0 m7f0Var, int i) {
        this.a = m7f0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkk0)) {
            return false;
        }
        gkk0 gkk0Var = (gkk0) obj;
        return this.a == gkk0Var.a && this.b == gkk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
