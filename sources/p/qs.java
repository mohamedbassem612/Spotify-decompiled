package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qs implements ss {
    public final c380 a;
    public final boolean b;

    public qs(c380 c380Var, boolean z) {
        this.a = c380Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs)) {
            return false;
        }
        qs qsVar = (qs) obj;
        return u890.j(this.a, qsVar.a) && this.b == qsVar.b;
    }

    public final int hashCode() {
        c380 c380Var = this.a;
        return Boolean.hashCode(this.b) + ((c380Var == null ? 0 : c380Var.hashCode()) * 31);
    }
}
