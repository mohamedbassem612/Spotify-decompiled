package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ggo0 {
    public final r231 a;
    public final boolean b;

    public ggo0(r231 r231Var, boolean z) {
        this.a = r231Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggo0)) {
            return false;
        }
        ggo0 ggo0Var = (ggo0) obj;
        return u890.j(this.a, ggo0Var.a) && this.b == ggo0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
