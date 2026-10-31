package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m880 implements n880 {
    public final ji41 a;
    public final boolean b;

    public m880(ji41 ji41Var, boolean z) {
        this.a = ji41Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m880)) {
            return false;
        }
        m880 m880Var = (m880) obj;
        return u890.j(this.a, m880Var.a) && this.b == m880Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
