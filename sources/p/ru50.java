package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ru50 {
    public final String a;
    public final j1p0 b;

    public ru50(String str, j1p0 j1p0Var) {
        this.a = str;
        this.b = j1p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ru50) {
            ru50 ru50Var = (ru50) obj;
            return u890.j(this.a, ru50Var.a) && this.b == ru50Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
