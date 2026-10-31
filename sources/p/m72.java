package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m72 extends n72 {
    public final String e;
    public final d3d1 f;
    public final byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public m72(String str, d3d1 d3d1Var, int i) {
        super(str, d3d1Var, i);
        this.e = str;
        this.f = d3d1Var;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m72)) {
            return false;
        }
        m72 m72Var = (m72) obj;
        return u890.j(this.e, m72Var.e) && this.f == m72Var.f && this.g == m72Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ((this.f.hashCode() + (this.e.hashCode() * 31)) * 31);
    }
}
