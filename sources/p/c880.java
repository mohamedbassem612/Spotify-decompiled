package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c880 {
    public final ji41 a;
    public final boolean b;

    public c880(ji41 ji41Var, boolean z) {
        this.a = ji41Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c880)) {
            return false;
        }
        c880 c880Var = (c880) obj;
        return u890.j(this.a, c880Var.a) && this.b == c880Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
