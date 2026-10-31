package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fc30 {
    public final o231 a;
    public final boolean b;

    public fc30(o231 o231Var, boolean z) {
        this.a = o231Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc30)) {
            return false;
        }
        fc30 fc30Var = (fc30) obj;
        return u890.j(this.a, fc30Var.a) && this.b == fc30Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
