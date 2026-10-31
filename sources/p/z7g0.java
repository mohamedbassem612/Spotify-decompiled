package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z7g0 extends hon1 {
    public final String e;
    public final String f;

    public z7g0(String str, String str2) {
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7g0)) {
            return false;
        }
        z7g0 z7g0Var = (z7g0) obj;
        return u890.j(this.e, z7g0Var.e) && this.f.equals(z7g0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() * 31);
    }
}
