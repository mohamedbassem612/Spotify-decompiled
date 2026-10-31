package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s1x0 extends fn31 {
    public final String g;
    public final boolean h;

    public s1x0(String str, boolean z) {
        this.g = str;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1x0)) {
            return false;
        }
        s1x0 s1x0Var = (s1x0) obj;
        return u890.j(this.g, s1x0Var.g) && this.h == s1x0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + (this.g.hashCode() * 31);
    }
}
