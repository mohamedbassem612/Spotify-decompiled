package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ur71 implements wr71 {
    public final sr71 a;
    public final boolean b;

    public ur71(sr71 sr71Var, boolean z) {
        this.a = sr71Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur71)) {
            return false;
        }
        ur71 ur71Var = (ur71) obj;
        return this.a.equals(ur71Var.a) && this.b == ur71Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
